package defpackage;

import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.HashMap;
/* compiled from: SearchManagerModel.java */
/* renamed from: ayi  reason: default package */
/* loaded from: classes2.dex */
public class ayi {
    private String a;
    private String b;
    private int c;
    private int d;
    private boolean e;
    private HashMap<Integer, Boolean> f;
    private String g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchManagerModel.java */
    /* renamed from: ayi$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final ayi a = new ayi();
    }

    public static ayi a() {
        return a.a;
    }

    private ayi() {
        this.a = "";
        this.b = null;
        this.e = false;
        this.f = new HashMap<>();
        u.a(this);
        b();
    }

    public void b() {
        this.f.put(2, true);
        this.f.put(3, true);
        this.f.put(6, true);
        this.f.put(5, true);
        this.f.put(0, true);
        this.f.put(1, true);
    }

    public void a(int i) {
        this.f.put(Integer.valueOf(i), false);
    }

    private void d(String str) {
        b();
        this.a = str;
    }

    public boolean b(int i) {
        Boolean bool;
        if (!this.f.containsKey(Integer.valueOf(i)) || (bool = this.f.get(Integer.valueOf(i))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public String c() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
        d(str);
    }

    public int d() {
        return this.c;
    }

    public void c(int i) {
        this.c = i;
    }

    public String e() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
        this.e = false;
    }

    public int f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public String h() {
        return this.g;
    }

    public void c(String str) {
        this.g = str;
    }

    public void d(int i) {
        this.d = i;
    }

    public Call<MixSearchResultBean> a(String str, int i, int i2, int i3, avc<MixSearchResultBean> avcVar) {
        LogUtils.d("SearchManagerModel", "querySerarchResult:" + str + ", searchType:" + i);
        HashMap hashMap = new HashMap();
        hashMap.put("keyword", str);
        hashMap.put(VuiConstants.ELEMENT_TYPE, i + "");
        hashMap.put("page", i2 + "");
        hashMap.put("pageSize", i3 + "");
        return ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/search").params(hashMap, new boolean[0])).a(new ava(avcVar));
    }
}
