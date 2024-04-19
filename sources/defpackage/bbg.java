package defpackage;

import com.lzy.okgo.adapter.Call;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.HashMap;
/* compiled from: UsbHttpModel.java */
/* renamed from: bbg  reason: default package */
/* loaded from: classes2.dex */
public class bbg {

    /* compiled from: UsbHttpModel.java */
    /* renamed from: bbg$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bbg a = new bbg();
    }

    public static bbg a() {
        return a.a;
    }

    public Call<bax> a(String str, String str2, int i, avc<bax> avcVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("keywords", str);
        hashMap.put("hashs", str2);
        hashMap.put(VuiConstants.ELEMENT_TYPE, String.valueOf(i));
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/batch/search/logoList").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }
}
