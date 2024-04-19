package com.xiaopeng.lib.framework.account.client;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaopeng.lib.framework.account.exception.AuthInfoError;
import com.xiaopeng.lib.framework.account.utils.L;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAuthInfo;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.ICallback;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IError;
/* loaded from: classes.dex */
public class RequestOAuthCallback implements Handler.Callback {
    private static final String TAG = "RequestOAuthCallback";
    private boolean isCallBackDone;
    private IAuthInfo mAuthInfo;
    private ICallback<IAuthInfo, IError> mCallback;
    private Handler mHandler = new Handler(Looper.getMainLooper(), this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestOAuthCallback(ICallback<IAuthInfo, IError> iCallback) {
        this.mCallback = iCallback;
    }

    public void dispatchMessage(IAuthInfo iAuthInfo, long j) {
        this.mAuthInfo = iAuthInfo;
        this.mHandler.sendEmptyMessageDelayed(1, j);
    }

    public void dispatchMessage(int i, long j) {
        dispatchMessage(i, null, j);
    }

    public void dispatchMessage(int i, String str, long j) {
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.arg1 = i;
        obtainMessage.obj = str;
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.sendMessageDelayed(obtainMessage, j);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        ICallback<IAuthInfo, IError> iCallback;
        L.v(TAG, "handleMessage msg=" + message);
        switch (message.what) {
            case 1:
                if (!this.isCallBackDone && (iCallback = this.mCallback) != null) {
                    iCallback.onSuccess(this.mAuthInfo);
                    this.isCallBackDone = true;
                    break;
                }
                break;
            case 2:
                if (!this.isCallBackDone && this.mCallback != null) {
                    AuthInfoError authInfoError = new AuthInfoError(message.arg1);
                    if (message.obj instanceof String) {
                        authInfoError.setErr((String) message.obj);
                    }
                    this.mCallback.onFail(authInfoError);
                    this.isCallBackDone = true;
                    break;
                }
                break;
        }
        return true;
    }
}
