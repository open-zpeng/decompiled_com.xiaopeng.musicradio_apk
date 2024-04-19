package com.xiaopeng.lib.framework.account;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.xiaopeng.lib.framework.account.action.AccountAction;
import com.xiaopeng.lib.framework.account.utils.L;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAuthInfo;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.ICallback;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IError;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IOTPInfo;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo;
/* loaded from: classes.dex */
public class AccountImpl implements IAccount {
    private static volatile AccountImpl sAccount;
    private static IAccountProxy sInnerProxy;
    private final String TAG = "AccountImpl";
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public static AccountImpl getInstance() {
        if (sAccount == null) {
            synchronized (AccountImpl.class) {
                if (sAccount == null) {
                    sAccount = new AccountImpl();
                    sInnerProxy = AccountProxyFactory.getInstance().getProxy();
                }
            }
        }
        return sAccount;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount
    public void init(Application application, String str) {
        init(application, str, null);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount
    public void init(Application application, String str, String str2) {
        L.v("AccountImpl", "init");
        sInnerProxy.init(application, str, str2);
    }

    private void release(Context context) {
        L.v("AccountImpl", "release");
        sInnerProxy.release(context);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount
    public void requestOAuth(ICallback<IAuthInfo, IError> iCallback) {
        L.v("AccountImpl", "requestOAuth");
        sInnerProxy.requestOAuth(iCallback);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount
    public void requestOAuth(String str, ICallback<IAuthInfo, IError> iCallback) {
        L.v("AccountImpl", "requestOAuth appID:" + str);
        sInnerProxy.requestOAuth(str, iCallback);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount
    public void requestOTP(String str, ICallback<IOTPInfo, IError> iCallback) {
        L.v("AccountImpl", "requestOTP deviceID:" + str);
        sInnerProxy.requestOTP(str, iCallback);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount
    public IUserInfo getUserInfo() {
        L.v("AccountImpl", "getUserInfo");
        return sInnerProxy.getUserInfo();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount
    public void login() {
        L.v("AccountImpl", "login");
        sInnerProxy.sendAction(AccountAction.QR_LOGIN);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAccount
    public void logout() {
        L.v("AccountImpl", "logout");
        sInnerProxy.sendAction(AccountAction.LOGOUT);
    }
}
