package defpackage;

import android.text.TextUtils;
import com.lzy.okgo.model.HttpHeaders;
/* compiled from: HttpHeadsHandlerImpl.java */
/* renamed from: aur  reason: default package */
/* loaded from: classes2.dex */
public class aur implements aus {
    @Override // defpackage.aus
    public void a(HttpHeaders httpHeaders, HttpHeaders httpHeaders2) {
        String str = httpHeaders2 != null ? httpHeaders2.get("XP-Media-Xima-Sid") : null;
        if (str == null) {
            aqf.a();
            str = aqf.a().g();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        httpHeaders.put("XP-Media-Xima-Sid", str);
    }
}
