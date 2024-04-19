package defpackage;

import com.lzy.okgo.adapter.Call;
import java.util.HashMap;
/* compiled from: BizHelper.java */
/* renamed from: adu  reason: default package */
/* loaded from: classes2.dex */
public class adu {
    public static Call<aec> a(String str, avc<aec> avcVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("qrCodeType", str);
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/reading/login/qrCode").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public static Call<aea> b(String str, avc<aea> avcVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("authCode", str);
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v3/reading/login/qrCodeAuthPoll").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }

    public static void a(avc<aeb> avcVar) {
        auu.b("https://xmart.xiaopeng.com/media/v3/reading/login/logout").execute(new ava(avcVar));
    }
}
