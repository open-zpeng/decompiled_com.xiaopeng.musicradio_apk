package com.xiaopeng.lib.framework.account.server;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import com.xiaopeng.lib.framework.account.IUserInfoChangedListener;
import com.xiaopeng.lib.framework.account.info.UserInfoImpl;
/* loaded from: classes.dex */
public final class CallbackList {
    private static final int CATEGORY_COUNT = 1;
    private static final String TAG = "CallbackList";
    private Object[] mCallbacks = new Object[1];

    public CallbackList() {
        for (int i = 0; i < 1; i++) {
            this.mCallbacks[i] = new RemoteCallbackList();
        }
    }

    public void register(IUserInfoChangedListener iUserInfoChangedListener) {
        ((RemoteCallbackList) this.mCallbacks[0]).register(iUserInfoChangedListener);
    }

    public void notifyUserInfoChanged(UserInfoImpl userInfoImpl) {
        RemoteCallbackList remoteCallbackList = (RemoteCallbackList) this.mCallbacks[0];
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        Log.v(TAG, "notifyUserInfoChanged count=" + beginBroadcast);
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                ((IUserInfoChangedListener) remoteCallbackList.getBroadcastItem(i)).notifyUserInfoChanged(userInfoImpl);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        remoteCallbackList.finishBroadcast();
    }

    public void unregister(IUserInfoChangedListener iUserInfoChangedListener) {
        ((RemoteCallbackList) this.mCallbacks[0]).unregister(iUserInfoChangedListener);
    }
}
