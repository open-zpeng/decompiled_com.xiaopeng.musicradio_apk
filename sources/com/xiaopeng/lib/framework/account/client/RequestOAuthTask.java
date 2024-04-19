package com.xiaopeng.lib.framework.account.client;

import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import com.xiaopeng.lib.framework.account.IXpAccountService;
import com.xiaopeng.lib.framework.account.IXpCallback;
import com.xiaopeng.lib.framework.account.authorized.AuthInfoImpl;
import com.xiaopeng.lib.framework.account.utils.AppLifeCycleHelper;
import com.xiaopeng.lib.framework.account.utils.L;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAuthInfo;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.ICallback;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IError;
/* loaded from: classes.dex */
public class RequestOAuthTask implements Runnable {
    private static final long REQ_OAUTH_MAX_TIMEOUT = 60000;
    private static final long REQ_OAUTH_TIMEOUT = 8000;
    private static final String TAG = "RequestOAuthTask";
    private String mAppId;
    private AppLifeCycleHelper mAppLifeCycleHelper;
    private Application mApplication;
    private RequestOAuthCallback mCallback;
    private long mTimeout;
    private IXpAccountService mXpAccountService;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestOAuthTask(Application application, String str, IXpAccountService iXpAccountService, ICallback<IAuthInfo, IError> iCallback, long j) {
        this.mCallback = new RequestOAuthCallback(iCallback);
        this.mXpAccountService = iXpAccountService;
        this.mAppId = str;
        this.mAppLifeCycleHelper = new AppLifeCycleHelper(application);
        this.mTimeout = j;
        long j2 = this.mTimeout;
        if (j2 <= 0 || j2 > 60000) {
            this.mTimeout = REQ_OAUTH_TIMEOUT;
        }
        this.mApplication = application;
        this.mAppLifeCycleHelper.setOnAppTopListener(new AppLifeCycleHelper.OnAppTopListener() { // from class: com.xiaopeng.lib.framework.account.client.RequestOAuthTask.1
            @Override // com.xiaopeng.lib.framework.account.utils.AppLifeCycleHelper.OnAppTopListener
            public void onAppTop() {
                L.v(RequestOAuthTask.TAG, "onAppCycleChanged.errCode=10004");
                RequestOAuthTask.this.mCallback.dispatchMessage(10004, RequestOAuthTask.this.mTimeout);
                RequestOAuthTask.this.mAppLifeCycleHelper.unregisterCallbacks(RequestOAuthTask.this.mApplication);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.mXpAccountService == null) {
                L.v(TAG, "mXpAccountService is null.errCode=1");
                this.mCallback.dispatchMessage(1, 0L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            L.v(TAG, "requestOAuth timestamp=" + currentTimeMillis + ";mAppId=" + this.mAppId);
            this.mXpAccountService.requestOAuth(currentTimeMillis, this.mAppId, new IXpCallback.Stub() { // from class: com.xiaopeng.lib.framework.account.client.RequestOAuthTask.2
                @Override // com.xiaopeng.lib.framework.account.IXpCallback
                public void onSuccess(long j, String str, Bundle bundle) {
                    if (bundle == null) {
                        onFail(j, str, null);
                        return;
                    }
                    bundle.setClassLoader(AuthInfoImpl.class.getClassLoader());
                    AuthInfoImpl authInfoImpl = (AuthInfoImpl) bundle.getParcelable("data");
                    if (authInfoImpl == null) {
                        onFail(j, str, bundle);
                        return;
                    }
                    L.v(RequestOAuthTask.TAG, "onSuccess.authInfo=" + authInfoImpl.toString());
                    RequestOAuthTask.this.mCallback.dispatchMessage(authInfoImpl, 0L);
                    RequestOAuthTask.this.onAuthorizeFinished();
                }

                @Override // com.xiaopeng.lib.framework.account.IXpCallback
                public void onFail(long j, String str, Bundle bundle) {
                    String str2;
                    int i = 10005;
                    if (bundle != null) {
                        bundle.setClassLoader(AuthInfoImpl.class.getClassLoader());
                        i = bundle.getInt("errCode", 10005);
                        str2 = bundle.getString("err");
                    } else {
                        str2 = null;
                    }
                    L.v(RequestOAuthTask.TAG, "onFail errCode=" + i + "; err=" + str2);
                    RequestOAuthTask.this.mCallback.dispatchMessage(i, str2, 0L);
                    RequestOAuthTask.this.onAuthorizeFinished();
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
            this.mCallback.dispatchMessage(1, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAuthorizeFinished() {
        this.mAppLifeCycleHelper.setOnAppTopListener(null);
        this.mAppLifeCycleHelper.unregisterCallbacks(this.mApplication);
    }
}
