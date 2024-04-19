package com.xiaopeng.lib.framework.account.adapt;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.OnAccountsUpdateListener;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.xiaopeng.lib.framework.account.IAccountProxy;
import com.xiaopeng.lib.framework.account.action.AccountAction;
import com.xiaopeng.lib.framework.account.authorized.AuthInfoImpl;
import com.xiaopeng.lib.framework.account.exception.AuthInfoError;
import com.xiaopeng.lib.framework.account.exception.OTPInfoError;
import com.xiaopeng.lib.framework.account.info.UserInfoEventImpl;
import com.xiaopeng.lib.framework.account.info.UserInfoImpl;
import com.xiaopeng.lib.framework.account.otp.OTPInfoImpl;
import com.xiaopeng.lib.framework.account.utils.L;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAuthInfo;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.ICallback;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IError;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IOTPInfo;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo;
import com.xiaopeng.libconfig.ipc.AccountConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;
@TargetApi(28)
/* loaded from: classes.dex */
public class AccountManagerProxy implements OnAccountsUpdateListener, IAccountProxy {
    private static final String TAG = "AccountManagerProxy";
    private static AtomicBoolean sInitFlag = new AtomicBoolean(false);
    private volatile AccountManager mAccountManager;
    private String mAppId;
    private WeakReference<Application> mApplication;
    private CarAccountCallbackBroadcast mCarAccountCallbackBroadcast;
    private final byte[] mLock;
    private volatile RequestOAuthTask mPendingTask;
    private final byte[] mTaskLock;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Holder {
        private static final AccountManagerProxy INSTANCE = new AccountManagerProxy();

        private Holder() {
        }
    }

    private AccountManagerProxy() {
        this.mLock = new byte[0];
        this.mTaskLock = new byte[0];
    }

    public static AccountManagerProxy getInstance() {
        return Holder.INSTANCE;
    }

    @Override // com.xiaopeng.lib.framework.account.IAccountProxy
    public void init(Application application, String str, String str2) {
        if (!sInitFlag.getAndSet(true)) {
            L.i(TAG, "init appId:" + str + "; packageName:" + str2);
            synchronized (this.mLock) {
                this.mAccountManager = AccountManager.get(application);
            }
            this.mAccountManager.addOnAccountsUpdatedListener(this, null, true, new String[]{"com.xiaopeng.accountservice.ACCOUNT_TYPE_XP_VEHICLE"});
            this.mAppId = str;
            this.mApplication = new WeakReference<>(application);
            return;
        }
        L.e(TAG, "init multi times, appId:" + str);
    }

    @Override // com.xiaopeng.lib.framework.account.IAccountProxy
    public void release(Context context) {
        if (sInitFlag.get()) {
            L.i(TAG, "release account manager");
            this.mAccountManager.removeOnAccountsUpdatedListener(this);
            synchronized (this.mLock) {
                this.mAccountManager = null;
            }
            this.mAppId = null;
            this.mApplication.clear();
            this.mApplication = null;
            sInitFlag.set(false);
            return;
        }
        L.e(TAG, "Invoke release without properly initialized!");
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public void onAccountsUpdated(Account[] accountArr) {
        if (!sInitFlag.get()) {
            L.e(TAG, "Invoking onAccountsUpdated without properly initialized which should never happened");
        } else if (accountArr != null) {
            if (accountArr.length > 0 && accountArr[0] != null) {
                try {
                    IUserInfo fromAccount = fromAccount(accountArr[0]);
                    L.i(TAG, "onAccountsUpdated userInfo:" + fromAccount);
                    EventBus.getDefault().post(new UserInfoEventImpl().setUserInfo(fromAccount));
                    if (IUserInfo.InfoType.CHANGED == fromAccount.getInfoType()) {
                        synchronized (this.mTaskLock) {
                            if (this.mPendingTask != null) {
                                this.mPendingTask.execute(accountArr);
                            }
                        }
                    }
                } catch (AccountException e) {
                    L.e(TAG, "onAccountsUpdate exception:" + e);
                }
            } else if (accountArr.length == 0) {
                UserInfoImpl userInfoImpl = new UserInfoImpl();
                userInfoImpl.setUserName("");
                userInfoImpl.setUserType(IUserInfo.UserType.TEMP);
                userInfoImpl.setInfoType(IUserInfo.InfoType.CHANGED);
                EventBus.getDefault().post(new UserInfoEventImpl().setUserInfo(userInfoImpl));
            }
        }
    }

    @Override // com.xiaopeng.lib.framework.account.IAccountProxy
    public void requestOAuth(ICallback<IAuthInfo, IError> iCallback) {
        requestOAuth(this.mAppId, iCallback);
    }

    @Override // com.xiaopeng.lib.framework.account.IAccountProxy
    public void requestOAuth(String str, ICallback<IAuthInfo, IError> iCallback) {
        if (sInitFlag.get()) {
            L.i(TAG, "requestOAuth appId:" + str);
            Account currentAccount = getCurrentAccount();
            RequestOAuthTask requestOAuthTask = new RequestOAuthTask(str, iCallback);
            if (currentAccount != null) {
                requestOAuthTask.execute(currentAccount);
                return;
            }
            L.i(TAG, "requestOAuth without account, login first.");
            requestOAuthTask.postpone();
            return;
        }
        L.e(TAG, "Invoke requestOAuth without properly initialized!");
        if (iCallback != null) {
            iCallback.onFail(new AuthInfoError(1));
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.xiaopeng.lib.framework.account.adapt.AccountManagerProxy$1] */
    @Override // com.xiaopeng.lib.framework.account.IAccountProxy
    @SuppressLint({"StaticFieldLeak"})
    public void requestOTP(String str, final ICallback<IOTPInfo, IError> iCallback) {
        if (sInitFlag.get()) {
            L.i(TAG, "requestOTP deviceId:" + str);
            new AsyncTask<Void, Void, Void>() { // from class: com.xiaopeng.lib.framework.account.adapt.AccountManagerProxy.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    Account currentAccount = AccountManagerProxy.this.getCurrentAccount();
                    if (currentAccount == null) {
                        L.e(AccountManagerProxy.TAG, "Current account is null; Always requestOTP after login");
                        iCallback.onFail(new OTPInfoError(1001));
                        return null;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(AccountConfig.KEY_APP_ID, AccountManagerProxy.this.mAppId);
                    synchronized (AccountManagerProxy.this.mLock) {
                        if (AccountManagerProxy.this.mAccountManager != null) {
                            AccountManagerFuture<Bundle> authToken = AccountManagerProxy.this.mAccountManager.getAuthToken(currentAccount, "com.xiaopeng.accountservice.AUTH_TYPE_AUTH_OTP", bundle, false, (AccountManagerCallback<Bundle>) null, (Handler) null);
                            String userData = AccountManagerProxy.this.mAccountManager.getUserData(currentAccount, "uid");
                            try {
                                String string = authToken.getResult().getString("authtoken");
                                if (!TextUtils.isEmpty(string)) {
                                    OTPInfoImpl oTPInfoImpl = new OTPInfoImpl();
                                    oTPInfoImpl.setUid(Long.valueOf(userData).longValue());
                                    oTPInfoImpl.setOTP(string);
                                    iCallback.onSuccess(oTPInfoImpl);
                                } else {
                                    String string2 = authToken.getResult().getString("errorMessage", "");
                                    String string3 = authToken.getResult().getString("errorCode", "-1");
                                    L.e(AccountManagerProxy.TAG, "requestOTP failed, code:" + string3 + "; msg:" + string2);
                                    iCallback.onFail(new OTPInfoError(Integer.valueOf(string3).intValue()));
                                }
                            } catch (Exception e) {
                                L.e(AccountManagerProxy.TAG, "requestOTP exception:" + e);
                                iCallback.onFail(new OTPInfoError(0));
                            }
                            return null;
                        }
                        L.e(AccountManagerProxy.TAG, "requestOTP without accountManager");
                        iCallback.onFail(new OTPInfoError(1000));
                        return null;
                    }
                }
            }.execute(new Void[0]);
            return;
        }
        L.e(TAG, "Invoke requestOTP without properly initialized!");
        iCallback.onFail(new OTPInfoError(1000));
    }

    @Override // com.xiaopeng.lib.framework.account.IAccountProxy
    public IUserInfo getUserInfo() {
        if (sInitFlag.get()) {
            Account currentAccount = getCurrentAccount();
            if (currentAccount != null) {
                return fromAccount(currentAccount);
            }
            return null;
        }
        L.e(TAG, "Invoke getUserInfo without properly initialized!");
        return null;
    }

    @Override // com.xiaopeng.lib.framework.account.IAccountProxy
    public void sendAction(AccountAction accountAction) {
        if (sInitFlag.get()) {
            switch (accountAction) {
                case QR_LOGIN:
                    doLogin();
                    return;
                case LOGOUT:
                default:
                    return;
            }
        }
        throw new AccountException("Invoke account action without properly initialized!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public class RequestOAuthTask extends AsyncTask<Account, Void, Void> {
        private ICallback<IAuthInfo, IError> mCallback;
        private String mTargetAppId;
        private CountDownTimer mTimer;

        private RequestOAuthTask(String str, ICallback<IAuthInfo, IError> iCallback) {
            this.mTargetAppId = str;
            this.mCallback = iCallback;
            this.mTimer = new CountDownTimer(40000L, 40000L) { // from class: com.xiaopeng.lib.framework.account.adapt.AccountManagerProxy.RequestOAuthTask.1
                @Override // android.os.CountDownTimer
                public void onTick(long j) {
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    L.i(AccountManagerProxy.TAG, "RequestOAuthTask timeout triggered");
                    RequestOAuthTask.this.notifyFailed(10004);
                }
            };
            this.mTimer.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void postpone() {
            synchronized (AccountManagerProxy.this.mTaskLock) {
                if (AccountManagerProxy.this.mPendingTask == null) {
                    AccountManagerProxy.this.mPendingTask = this;
                    AccountManagerProxy.this.doLogin();
                    return;
                }
                notifyFailed(3);
            }
        }

        private void dismiss() {
            synchronized (AccountManagerProxy.this.mTaskLock) {
                if (AccountManagerProxy.this.mPendingTask != null && AccountManagerProxy.this.mPendingTask == this) {
                    AccountManagerProxy.this.mPendingTask = null;
                }
            }
            CountDownTimer countDownTimer = this.mTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.mTimer = null;
            }
        }

        private void notifySuccess(String str) {
            AccountManagerProxy.this.unregisterCallbackBroadcast();
            if (this.mCallback != null) {
                AuthInfoImpl authInfoImpl = new AuthInfoImpl();
                authInfoImpl.setAuthCode(str);
                this.mCallback.onSuccess(authInfoImpl);
                this.mCallback = null;
                dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifyFailed(int i) {
            AccountManagerProxy.this.unregisterCallbackBroadcast();
            ICallback<IAuthInfo, IError> iCallback = this.mCallback;
            if (iCallback != null) {
                iCallback.onFail(new AuthInfoError(i));
                this.mCallback = null;
                dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Account... accountArr) {
            if (accountArr.length < 1 || accountArr[0] == null) {
                L.e(AccountManagerProxy.TAG, "RequestOAuthTask doRequest but account is null");
                notifyFailed(0);
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putString(AccountConfig.KEY_APP_ID, this.mTargetAppId);
            AccountManagerFuture<Bundle> authToken = AccountManagerProxy.this.mAccountManager.getAuthToken(accountArr[0], "com.xiaopeng.accountservice.AUTH_TYPE_AUTH_CODE", bundle, false, (AccountManagerCallback<Bundle>) null, (Handler) null);
            try {
                String string = authToken.getResult().getString("authtoken");
                if (!TextUtils.isEmpty(string)) {
                    notifySuccess(string);
                } else {
                    String string2 = authToken.getResult().getString("errorMessage", "");
                    String string3 = authToken.getResult().getString("errorCode", "-1");
                    L.e(AccountManagerProxy.TAG, "RequestOAuthTask doRequest failed, code:" + string3 + "; msg:" + string2);
                    notifyFailed(Integer.valueOf(string3).intValue());
                }
            } catch (Exception e) {
                L.e(AccountManagerProxy.TAG, "RequestOAuthTask doRequest exception:" + e);
                notifyFailed(0);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIntent(Intent intent) {
        WeakReference<Application> weakReference = this.mApplication;
        if (weakReference != null && weakReference.get() != null) {
            this.mApplication.get().startActivity(intent);
            registerCallbackBroadcast();
            return;
        }
        L.e(TAG, "application is null, can't start activity");
    }

    private void registerCallbackBroadcast() {
        this.mCarAccountCallbackBroadcast = new CarAccountCallbackBroadcast();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CarAccountCallbackBroadcast.CANCEL_LOGIN_ACTION);
        this.mApplication.get().registerReceiver(this.mCarAccountCallbackBroadcast, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterCallbackBroadcast() {
        if (this.mCarAccountCallbackBroadcast != null) {
            this.mApplication.get().unregisterReceiver(this.mCarAccountCallbackBroadcast);
            this.mCarAccountCallbackBroadcast = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLogin() {
        this.mAccountManager.addAccount("com.xiaopeng.accountservice.ACCOUNT_TYPE_XP_VEHICLE", null, null, null, null, new AccountManagerCallback<Bundle>() { // from class: com.xiaopeng.lib.framework.account.adapt.AccountManagerProxy.2
            @Override // android.accounts.AccountManagerCallback
            public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
                try {
                    Intent intent = (Intent) accountManagerFuture.getResult().getParcelable("intent");
                    if (intent != null) {
                        AccountManagerProxy.this.handleIntent(intent);
                    } else {
                        L.e(AccountManagerProxy.TAG, "doLogin intent is null");
                    }
                } catch (Exception e) {
                    L.e(AccountManagerProxy.TAG, "doLogin exception:" + e);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Account getCurrentAccount() {
        if (sInitFlag.get()) {
            Account[] accountsByType = this.mAccountManager.getAccountsByType("com.xiaopeng.accountservice.ACCOUNT_TYPE_XP_VEHICLE");
            if (accountsByType.length > 0 && accountsByType[0] != null) {
                return accountsByType[0];
            }
            L.w(TAG, "no valid account, accounts.length=" + accountsByType.length);
            return null;
        }
        L.e(TAG, "Invoke getCurrentAccount without properly initialized!");
        return null;
    }

    private IUserInfo fromAccount(Account account) {
        if (sInitFlag.get()) {
            if (account == null) {
                throw new AccountException("account is null");
            }
            UserInfoImpl userInfoImpl = new UserInfoImpl();
            userInfoImpl.setUserName(account.name);
            userInfoImpl.setAvatar(this.mAccountManager.getUserData(account, "avatar"));
            String userData = this.mAccountManager.getUserData(account, "user_type");
            try {
                userInfoImpl.setUserType(getUserType(Integer.valueOf(userData).intValue()));
                String userData2 = this.mAccountManager.getUserData(account, "update");
                try {
                    userInfoImpl.setInfoType(getInfoType(Integer.valueOf(userData2).intValue()));
                    return userInfoImpl;
                } catch (NumberFormatException unused) {
                    throw new AccountException("infoType convert exception, value=" + userData2);
                }
            } catch (NumberFormatException unused2) {
                throw new AccountException("userType convert exception, value=" + userData);
            }
        }
        throw new AccountException("Invoke fromAccount without properly initialized!");
    }

    private IUserInfo.UserType getUserType(int i) {
        switch (i) {
            case 1:
                return IUserInfo.UserType.OWNER;
            case 2:
                return IUserInfo.UserType.USER;
            case 3:
                return IUserInfo.UserType.TENANT;
            case 4:
                return IUserInfo.UserType.DRIVER;
            default:
                return IUserInfo.UserType.TEMP;
        }
    }

    private IUserInfo.InfoType getInfoType(int i) {
        switch (i) {
            case 0:
                return IUserInfo.InfoType.CHANGED;
            case 1:
                return IUserInfo.InfoType.UPDATE;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class CarAccountCallbackBroadcast extends BroadcastReceiver {
        public static final String CANCEL_LOGIN_ACTION = "com.xiaopeng.xvs.account.ACTION_ACCOUNT_DIALOG_CANCEL_RESP";

        private CarAccountCallbackBroadcast() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!CANCEL_LOGIN_ACTION.equals(intent.getAction()) || AccountManagerProxy.this.mPendingTask == null) {
                return;
            }
            AccountManagerProxy.this.mPendingTask.notifyFailed(20002);
            L.d(AccountManagerProxy.TAG, "onReceive send action : AuthInfoError.ERROR_CODE_USER_CLOSE_QRCODE");
        }
    }
}
