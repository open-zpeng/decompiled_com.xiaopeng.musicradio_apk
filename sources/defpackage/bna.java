package defpackage;

import java.util.ResourceBundle;
/* compiled from: Logger.java */
/* renamed from: bna  reason: default package */
/* loaded from: classes3.dex */
public interface bna {
    void fine(String str, String str2, String str3);

    void fine(String str, String str2, String str3, Object[] objArr);

    void fine(String str, String str2, String str3, Object[] objArr, Throwable th);

    void finer(String str, String str2, String str3);

    void initialise(ResourceBundle resourceBundle, String str, String str2);

    boolean isLoggable(int i);

    void setResourceName(String str);

    void severe(String str, String str2, String str3, Object[] objArr);

    void warning(String str, String str2, String str3);

    void warning(String str, String str2, String str3, Object[] objArr);
}
