package com.xiaopeng.lib.framework.account.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.xiaopeng.lib.framework.account.IXpAccountService;
import com.xiaopeng.lib.framework.account.IXpCallback;
import com.xiaopeng.lib.framework.account.exception.OTPInfoError;
import com.xiaopeng.lib.framework.account.otp.OTPInfoImpl;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.ICallback;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IError;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IOTPInfo;
import com.xiaopeng.lib.utils.LogUtils;
/* loaded from: classes.dex */
public class RequestOTPTask implements Runnable {
    private static final String TAG = "RequestOTPTask";
    private ICallback<IOTPInfo, IError> mCallback;
    private IContextProvider mContextProvider;
    private String mDeviceID;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestOTPTask(IContextProvider iContextProvider, String str, ICallback<IOTPInfo, IError> iCallback) {
        this.mContextProvider = iContextProvider;
        this.mDeviceID = str;
        this.mCallback = iCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        IXpAccountService service = this.mContextProvider.getService();
        if (service == null) {
            LogUtils.e(TAG, "RequestOTPTask run, IXpAccountService is null");
            notifyFailed(1000);
            return;
        }
        try {
            service.requestOTP(System.currentTimeMillis(), this.mContextProvider.getAppID(), this.mDeviceID, new IXpCallback.Stub() { // from class: com.xiaopeng.lib.framework.account.client.RequestOTPTask.1
                @Override // com.xiaopeng.lib.framework.account.IXpCallback
                public void onSuccess(long j, String str, Bundle bundle) {
                    if (bundle == null) {
                        LogUtils.w(RequestOTPTask.TAG, "onSuccess but bundle is null");
                        RequestOTPTask.this.notifyFailed(1002);
                        return;
                    }
                    bundle.setClassLoader(OTPInfoImpl.class.getClassLoader());
                    OTPInfoImpl oTPInfoImpl = (OTPInfoImpl) bundle.getParcelable("data");
                    if (oTPInfoImpl == null) {
                        LogUtils.w(RequestOTPTask.TAG, "onSuccess but otpInfo is null");
                        RequestOTPTask.this.notifyFailed(1002);
                        return;
                    }
                    LogUtils.d(RequestOTPTask.TAG, "onSuccess " + oTPInfoImpl);
                    RequestOTPTask.this.mCallback.onSuccess(oTPInfoImpl);
                }

                @Override // com.xiaopeng.lib.framework.account.IXpCallback
                public void onFail(long j, String str, Bundle bundle) {
                    RequestOTPTask.this.notifyFailed(bundle != null ? bundle.getInt("code", 1002) : 1002);
                }
            });
        } catch (RemoteException e) {
            LogUtils.e(TAG, "RequestOTPTask run, exception:" + e);
            notifyFailed(1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFailed(int i) {
        this.mCallback.onFail(new OTPInfoError(i));
    }
}
