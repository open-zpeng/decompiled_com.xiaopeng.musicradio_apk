package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.aisuggest.ContentBean;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.afv;
import defpackage.agg;
/* compiled from: AiSuggestMediaModel.java */
/* renamed from: aoy  reason: default package */
/* loaded from: classes2.dex */
public class aoy {
    private static String a = "christmaseve";
    private static String b = "christmas";
    private static String c = "newyear";

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AiSuggestMediaModel.java */
    /* renamed from: aoy$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final aoy a = new aoy();
    }

    public static aoy a() {
        return a.a;
    }

    private aoy() {
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtils.i("AiSuggestMediaModel", "onReceiveSuggest content = " + str);
        ContentBean contentBean = (ContentBean) z.a(str, (Class<Object>) ContentBean.class);
        if (contentBean == null) {
            LogUtils.i("AiSuggestMediaModel", "onReceiveSuggest bean == null");
            return;
        }
        if (contentBean.getType() == 2) {
            u.c(new afv.a(contentBean));
        } else if (contentBean.getType() == 1) {
            u.c(new afv.a(contentBean));
        } else if (contentBean.getType() == 4) {
            u.c(new afv.a(contentBean));
        } else if (contentBean.getType() == 6) {
            LogUtils.i("AiSuggestMediaModel", "SGST_TYPE_VIP");
            u.c(new afv.a(contentBean));
        } else if (contentBean.getType() == 8) {
            u.c(new afv.a(contentBean));
        } else {
            LogUtils.i("AiSuggestMediaModel", "no surpport!");
        }
        u.c(new agg.a());
    }

    public void b(String str) {
        LogUtils.i("AiSuggestMediaModel", "onReceiveEggs" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(str, a) || TextUtils.equals(str, b)) {
            LogUtils.i("AiSuggestMediaModel", "圣诞歌曲...");
            u.c(new afv.b(655253840));
        } else if (TextUtils.equals(str, c)) {
            LogUtils.i("AiSuggestMediaModel", "元旦歌曲...");
            u.c(new afv.b(655234952));
        }
    }
}
