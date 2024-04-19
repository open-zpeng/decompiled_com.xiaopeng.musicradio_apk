package defpackage;

import com.lzy.okgo.adapter.Call;
import java.util.HashMap;
/* compiled from: BizHelper.java */
/* renamed from: adl  reason: default package */
/* loaded from: classes2.dex */
public class adl {
    public static Call<adt> a(String str, boolean z, avc<adt> avcVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("qrCodeType", str);
        if (z) {
            hashMap.put("useUniversal", String.valueOf(true));
        }
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/login/qrCode").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public static Call<adr> a(String str, avc<adr> avcVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("authCode", str);
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/music/login/qrCodeAuthPoll").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public static void a(avc<ads> avcVar) {
        auu.b("https://xmart.xiaopeng.com/media/v3/music/login/logout").execute(new ava(avcVar));
    }
}
