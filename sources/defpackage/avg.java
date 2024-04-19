package defpackage;

import android.os.Bundle;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.utils.be;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ReportFlowUtil.java */
/* renamed from: avg  reason: default package */
/* loaded from: classes2.dex */
public class avg {
    private static Bundle a;
    private static Runnable b = new Runnable() { // from class: avg.1
        @Override // java.lang.Runnable
        public void run() {
            if (avg.a != null) {
                avg.d(avg.a);
                Bundle unused = avg.a = null;
            }
        }
    };
    private static a c;

    /* compiled from: ReportFlowUtil.java */
    /* renamed from: avg$a */
    /* loaded from: classes2.dex */
    public interface a {
        void report(Map<String, Object> map);
    }

    public static void a(Bundle bundle) {
        ban.h(b);
        if (bundle.getInt("voice_type") == 6) {
            if (a != null) {
                if (be.a(bundle.getString("voice_id"), a.getString("voice_id"))) {
                    int i = bundle.getInt("cache_new");
                    Bundle bundle2 = a;
                    bundle2.putInt("cache_new", i + bundle2.getInt("cache_new"));
                } else {
                    d(a);
                    a = bundle;
                }
            } else {
                a = bundle;
            }
            ban.b(b, 20000L);
            return;
        }
        Bundle bundle3 = a;
        if (bundle3 != null) {
            d(bundle3);
            a = null;
        }
        d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("voice_type", Integer.valueOf(bundle.getInt("voice_type")));
        hashMap.put("voice_id", bundle.getString("voice_id"));
        hashMap.put("voice_name", bundle.getString("voice_name"));
        hashMap.put("album_name", bundle.getString("album_name"));
        hashMap.put("cache_type", Integer.valueOf(bundle.getInt("cache_type")));
        hashMap.put("cache_old", Integer.valueOf(bundle.getInt("cache_old")));
        hashMap.put("cache_new", Integer.valueOf(bundle.getInt("cache_new")));
        hashMap.put("content_length", Integer.valueOf(bundle.getInt("content_length")));
        hashMap.put("net_wifi", Boolean.valueOf(NetUtils.isWifiEnabled(com.xiaopeng.musicradio.a.a)));
        a aVar = c;
        if (aVar != null) {
            aVar.report(hashMap);
        }
    }

    public static void a(a aVar) {
        c = aVar;
    }
}
