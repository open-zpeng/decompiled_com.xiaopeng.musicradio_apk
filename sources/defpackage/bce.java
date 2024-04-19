package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.utils.ad;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Utils.java */
/* renamed from: bce  reason: default package */
/* loaded from: classes2.dex */
public class bce {
    public static List<MusicInfo> a(bay bayVar) {
        ArrayList arrayList = new ArrayList();
        for (bay bayVar2 : bayVar.b()) {
            arrayList.addAll(a(bayVar2));
        }
        arrayList.addAll(bayVar.a());
        return arrayList;
    }

    public static int a(List<MusicInfo> list) {
        boolean b = ad.b(apk.i().x());
        MusicInfo d = apk.i().d();
        if (d == null || !b || TextUtils.isEmpty(d.getHash())) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (TextUtils.equals(d.getHash(), list.get(i).getHash())) {
                return i;
            }
        }
        return -1;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.hashCode() + "";
    }
}
