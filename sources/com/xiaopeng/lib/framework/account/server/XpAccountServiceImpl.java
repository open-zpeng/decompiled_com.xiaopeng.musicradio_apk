package com.xiaopeng.lib.framework.account.server;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.xiaopeng.lib.framework.account.IUserInfoChangedListener;
import com.xiaopeng.lib.framework.account.IXpAccountService;
import com.xiaopeng.lib.framework.account.IXpCallback;
import com.xiaopeng.lib.framework.account.action.AccountAction;
import com.xiaopeng.lib.framework.account.info.UserInfoImpl;
import com.xiaopeng.lib.framework.account.utils.L;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo;
import org.greenrobot.eventbus.EventBus;
/* loaded from: classes.dex */
public class XpAccountServiceImpl extends Service {
    private static final String TAG = "XpAccountServiceImpl";
    private static volatile XpAccountServiceBinder mCarAccountService;

    @Override // android.app.Service
    public void onCreate() {
        Log.v(TAG, "onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.v(TAG, "onBind");
        return XpAccountServiceBinder.access$000();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        Log.d(TAG, "onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Log.v(TAG, "onUnbind");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Log.d(TAG, "onStartCommand");
        return 1;
    }

    /* loaded from: classes.dex */
    private static class XpAccountServiceBinder extends IXpAccountService.Stub {
        private IAccountProvider mAccountProvider;
        private final CallbackList mCallbacks = new CallbackList();

        static /* synthetic */ XpAccountServiceBinder access$000() {
            return getCarAccountService();
        }

        private XpAccountServiceBinder() {
        }

        public void initProvider(IAccountProvider iAccountProvider) {
            this.mAccountProvider = iAccountProvider;
        }

        public void postMessage(IUserInfo iUserInfo) {
            this.mCallbacks.notifyUserInfoChanged((UserInfoImpl) iUserInfo);
        }

        @Override // com.xiaopeng.lib.framework.account.IXpAccountService
        public void init(long j, String str) {
            Log.v(XpAccountServiceImpl.TAG, "init");
        }

        @Override // com.xiaopeng.lib.framework.account.IXpAccountService
        public UserInfoImpl getUserInfo(long j) {
            Log.v(XpAccountServiceImpl.TAG, "getUserInfo");
            return (UserInfoImpl) this.mAccountProvider.userInfo();
        }

        @Override // com.xiaopeng.lib.framework.account.IXpAccountService
        public void requestOAuth(long j, String str, IXpCallback iXpCallback) {
            Log.v(XpAccountServiceImpl.TAG, "requestOAuth timestamp=" + j);
            this.mAccountProvider.authorize(j, str, iXpCallback);
        }

        @Override // com.xiaopeng.lib.framework.account.IXpAccountService
        public void requestOTP(long j, String str, String str2, IXpCallback iXpCallback) {
            Log.v(XpAccountServiceImpl.TAG, "requestOTP timestamp=" + j + "; deviceID=" + str2);
            this.mAccountProvider.requestOTP(j, str, str2, iXpCallback);
        }

        @Override // com.xiaopeng.lib.framework.account.IXpAccountService
        public void requestAction(long j, int i, Bundle bundle) {
            AccountAction accountAction;
            L.v(XpAccountServiceImpl.TAG, "sendMessage timestamp=" + j + "pAction=" + i);
            if (i >= 0 && i < AccountAction.values().length) {
                accountAction = AccountAction.values()[i];
            } else {
                L.v(XpAccountServiceImpl.TAG, "sendMessage action is ArrayIndexOutBoundsException");
                accountAction = AccountAction.NONE;
            }
            this.mAccountProvider.action(j, accountAction, bundle);
        }

        @Override // com.xiaopeng.lib.framework.account.IXpAccountService
        public void subscribe(long j, Bundle bundle, IUserInfoChangedListener iUserInfoChangedListener) {
            Log.v(XpAccountServiceImpl.TAG, "subscribe ");
            this.mCallbacks.register(iUserInfoChangedListener);
        }

        @Override // com.xiaopeng.lib.framework.account.IXpAccountService
        public void unsubscribe(long j, Bundle bundle, IUserInfoChangedListener iUserInfoChangedListener) {
            Log.v(XpAccountServiceImpl.TAG, "unsubscribe ");
            this.mCallbacks.unregister(iUserInfoChangedListener);
        }

        private static XpAccountServiceBinder getCarAccountService() {
            if (XpAccountServiceImpl.mCarAccountService == null) {
                synchronized (XpAccountServiceBinder.class) {
                    if (XpAccountServiceImpl.mCarAccountService == null) {
                        XpAccountServiceBinder unused = XpAccountServiceImpl.mCarAccountService = new XpAccountServiceBinder();
                    }
                }
            }
            return XpAccountServiceImpl.mCarAccountService;
        }
    }

    public static void initProvider(IAccountProvider iAccountProvider) {
        XpAccountServiceBinder.access$000().initProvider(iAccountProvider);
    }

    public static void sendMessage(IUserInfo iUserInfo) {
        XpAccountServiceBinder.access$000().postMessage(iUserInfo);
    }

    @Override // android.app.Service
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }
}
