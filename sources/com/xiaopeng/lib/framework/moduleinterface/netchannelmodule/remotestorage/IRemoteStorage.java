package com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.remotestorage;

import android.app.Application;
import java.util.Map;
/* loaded from: classes.dex */
public interface IRemoteStorage {

    /* loaded from: classes.dex */
    public enum CATEGORY {
        CDU,
        CAN
    }

    void appendWithPathAndCallback(String str, String str2, byte[] bArr, Callback callback);

    void downloadWithPathAndCallback(String str, String str2, String str3, Callback callback);

    @Deprecated
    void initWithCategoryAndContext(Application application);

    void initWithContext(Application application);

    void needCertified(boolean z);

    void uploadWithCallback(CATEGORY category, String str, String str2, Callback callback);

    void uploadWithCallback(CATEGORY category, String str, String str2, Callback callback, Map<String, String> map);

    void uploadWithPathAndCallback(String str, String str2, String str3, Callback callback);

    void uploadWithPathAndCallback(String str, String str2, String str3, Callback callback, Map<String, String> map);
}
