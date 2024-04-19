package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.speech.protocol.bean.recommend.RecommendBean;
import com.xiaopeng.speech.vui.constants.OverallConstants;
import com.xiaopeng.speech.vui.utils.LogUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: OverallManager.java */
/* renamed from: bgj  reason: default package */
/* loaded from: classes2.dex */
public class bgj {
    private static int g = 200;
    private String a;
    private bgm b;
    private bgn c;
    private Map<String, HashSet<bgm>> d;
    private Map<bgm, String[]> e;
    private Map<bgm, String[]> f;
    private final String h;
    private final String i;
    private String j;
    private String[] k;
    private Handler l;
    private HandlerThread m;
    private Handler n;
    private HashSet<String> o;
    private HashSet<String> p;
    private String q;
    private String r;
    private Runnable s;
    private String t;
    private String u;
    private String v;
    private Runnable w;

    /* synthetic */ bgj(AnonymousClass1 anonymousClass1) {
        this();
    }

    /* compiled from: OverallManager.java */
    /* renamed from: bgj$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ bgj b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                abt.a(new Uri.Builder().authority(this.b.b()).path("initRecognizer").appendQueryParameter("param", this.a).build());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OverallManager.java */
    /* renamed from: bgj$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final bgj a = new bgj(null);
    }

    private bgj() {
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.h = "xiaopeng.asr.result";
        this.i = "OverallManager";
        this.j = null;
        this.k = null;
        this.l = new Handler(Looper.getMainLooper());
        this.o = new HashSet<>();
        this.p = new HashSet<>();
        this.q = null;
        this.r = null;
        this.s = new Runnable() { // from class: bgj.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bgj.this.n.removeCallbacks(bgj.this.s);
                    if (TextUtils.isEmpty(bgj.this.q)) {
                        return;
                    }
                    bgj.this.a(bgj.this.q, bgj.this.r);
                } catch (Exception unused) {
                }
            }
        };
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = new Runnable() { // from class: bgj.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    LogUtils.logInfo("OverallManager", "mQueryRun:" + bgj.this.t + ",mQueryData:" + bgj.this.u);
                    bgj.this.n.removeCallbacks(bgj.this.w);
                    if (TextUtils.isEmpty(bgj.this.t)) {
                        return;
                    }
                    LogUtils.logInfo("OverallManager", "mQueryRun:" + bgj.this.t + ",mQueryData:" + bgj.this.u);
                    bgj.this.a(bgj.this.t, bgj.this.u, bgj.this.v);
                } catch (Exception unused) {
                }
            }
        };
        if (this.m == null) {
            this.m = new HandlerThread("VuiEngine-overall");
            this.m.start();
            this.n = new Handler(this.m.getLooper());
        }
    }

    public static final bgj a() {
        return a.a;
    }

    public void a(final String str, final String str2) {
        try {
            if ("xiaopeng.asr.result".equals(str) && this.c != null) {
                this.l.post(new Runnable() { // from class: bgj.2
                    @Override // java.lang.Runnable
                    public void run() {
                        bgj.this.c.a(str2);
                    }
                });
            } else if (!TextUtils.isEmpty(this.a) && this.b != null) {
                List<String> c = bgk.c(this.a);
                if (c != null) {
                    int indexOf = c.indexOf(str);
                    if (indexOf != -1) {
                        final String str3 = bgk.a(this.a).get(indexOf);
                        LogUtils.logInfo("OverallManager", "dispatchOverallEvent eventStr:" + str3);
                        if (TextUtils.isEmpty(str3)) {
                            return;
                        }
                        if (!str3.contains("|")) {
                            this.l.post(new Runnable() { // from class: bgj.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    bgj.this.b.a(str3, str2);
                                }
                            });
                            return;
                        }
                        String[] split = str3.split("\\|");
                        for (String str4 : split[0].split(ListSignBean.COLLECTID_SUFFIX)) {
                            String[] split2 = str4.split(":");
                            Object a2 = this.b.a(split2[0]);
                            LogUtils.logInfo("OverallManager", "dispatchOverallEvent eventStr:" + split2[1] + ",obj:" + a2);
                            if (a2 == null) {
                                return;
                            }
                            if (a2 instanceof Boolean) {
                                if ((!split2[1].equals("true") || !((Boolean) a2).booleanValue()) && (!split2[1].equals("false") || ((Boolean) a2).booleanValue())) {
                                    return;
                                }
                            } else if (a2 instanceof Integer) {
                                if (!a(split2[1]) || ((Integer) a2).intValue() != Integer.parseInt(split2[1])) {
                                    return;
                                }
                            } else if (!(a2 instanceof String) || !((String) a2).equals(split2[1])) {
                                return;
                            }
                        }
                        LogUtils.logInfo("OverallManager", "dispatchOverallEvent run:" + split[1] + ",data:" + str2);
                        final String str5 = split[1];
                        this.l.post(new Runnable() { // from class: bgj.4
                            @Override // java.lang.Runnable
                            public void run() {
                                bgj.this.b.a(str5, str2);
                            }
                        });
                        return;
                    }
                    int indexOf2 = bgk.d(this.a).indexOf(str);
                    if (indexOf2 != -1) {
                        String str6 = bgk.b(this.a).get(indexOf2);
                        if (TextUtils.isEmpty(str6)) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (str6.contains("|")) {
                            String[] split3 = str6.split("\\|");
                            for (int i = 0; i < split3.length; i++) {
                                Object a3 = this.b.a(split3[i]);
                                if (a3 != null) {
                                    jSONObject.put(split3[i], a3);
                                }
                            }
                        } else {
                            Object a4 = this.b.a(str6);
                            if (a4 != null) {
                                jSONObject.put(str, a4);
                            }
                        }
                        if (jSONObject.length() > 0) {
                            LogUtils.logInfo("OverallManager", "feedbackResult:" + jSONObject.toString());
                            abt.a(new Uri.Builder().authority(b()).path("feedbackResult").appendQueryParameter("event", str).appendQueryParameter("data", jSONObject.toString()).build());
                        }
                    }
                } else if (this.o != null && Arrays.asList(this.o).contains(str)) {
                    this.l.post(new Runnable() { // from class: bgj.5
                        @Override // java.lang.Runnable
                        public void run() {
                            bgj.this.b.a(str, str2);
                        }
                    });
                } else if (this.p != null && Arrays.asList(this.p).contains(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(str, this.b.a(str));
                    abt.a(new Uri.Builder().authority(b()).path("feedbackResult").appendQueryParameter("event", str).appendQueryParameter("data", jSONObject2.toString()).build());
                }
            } else if (TextUtils.isEmpty(this.a) && this.b == null) {
                this.q = str;
                this.r = str2;
                this.n.postDelayed(this.s, g);
            } else if (this.b == null) {
                LogUtils.logInfo("OverallManager", "dispatchOverallEvent mListeners:" + this.d);
                if (this.d.containsKey(str)) {
                    LogUtils.logInfo("OverallManager", "dispatchOverallEvent mListeners:" + this.d);
                    Iterator<bgm> it = this.d.get(str).iterator();
                    while (it.hasNext()) {
                        final bgm next = it.next();
                        if (this.o != null && this.o.contains(str)) {
                            this.l.post(new Runnable() { // from class: bgj.6
                                @Override // java.lang.Runnable
                                public void run() {
                                    LogUtils.logInfo("OverallManager", "dispatchOverallEvent listener:" + next);
                                    next.a(str, str2);
                                }
                            });
                        } else if (this.p != null && this.p.contains(str)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(str, next.a(str));
                            abt.a(new Uri.Builder().authority(b()).path("feedbackResult").appendQueryParameter("event", str).appendQueryParameter("data", jSONObject3.toString()).build());
                        }
                    }
                } else if (this.d == null) {
                    this.q = str;
                    this.r = str2;
                    this.n.postDelayed(this.s, g);
                } else if (bgk.d(this.a).indexOf(str) != -1) {
                    abt.a(new Uri.Builder().authority(b()).path("feedbackResult").appendQueryParameter("event", str).appendQueryParameter("data", new JSONObject().toString()).build());
                }
            }
        } catch (Exception unused) {
        }
    }

    private boolean a(String str) {
        return Pattern.compile("[0-9]+(_[0-9]+)*").matcher(str).matches();
    }

    public void a(String str, String str2, String str3) {
        Object a2;
        Object a3;
        Object a4;
        try {
            this.v = str3;
            if (!TextUtils.isEmpty(this.a) && this.b != null) {
                int indexOf = bgk.d(this.a).indexOf(str);
                if (indexOf != -1) {
                    String str4 = bgk.b(this.a).get(indexOf);
                    if (TextUtils.isEmpty(str4) || str4.contains("|") || (a4 = this.b.a(str4)) == null || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    abt.a(Uri.parse(str3).buildUpon().appendQueryParameter(RecommendBean.SHOW_TIME_RESULT, new bgl(str, a4).toString()).build());
                } else if (!Arrays.asList(this.p).contains(str) || (a3 = this.b.a(str)) == null || TextUtils.isEmpty(str3)) {
                } else {
                    abt.a(Uri.parse(str3).buildUpon().appendQueryParameter(RecommendBean.SHOW_TIME_RESULT, new bgl(str, a3).toString()).build());
                }
            } else if (TextUtils.isEmpty(this.a) && this.b == null) {
                this.t = str;
                this.u = str2;
                this.n.postDelayed(this.w, g);
            } else if (this.b == null) {
                LogUtils.logInfo("OverallManager", "dispatchOverallEvent mListeners:" + this.d);
                if (this.d != null && this.d.size() > 0) {
                    LogUtils.logInfo("OverallManager", "dispatchOverallEvent mListeners:" + this.d);
                    Iterator<bgm> it = this.d.get(str).iterator();
                    while (it.hasNext()) {
                        bgm next = it.next();
                        LogUtils.logInfo("OverallManager", "dispatchOverallEvent listener:" + next + ",event:" + str);
                        if (this.p != null && this.p.contains(str) && (a2 = next.a(str)) != null && !TextUtils.isEmpty(str3)) {
                            try {
                                abt.a(Uri.parse(str3).buildUpon().appendQueryParameter(RecommendBean.SHOW_TIME_RESULT, new bgl(str, a2).toString()).build());
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else if (this.d == null) {
                    this.t = str;
                    this.u = str2;
                    this.n.postDelayed(this.w, g);
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return !bfj.a() ? OverallConstants.OVERAll_THIRD_AUTHORITY : OverallConstants.OVERAll_AUTHORITY;
    }
}
