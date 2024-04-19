package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.ahq;
import java.util.List;
/* compiled from: AbsMediaSource.java */
/* renamed from: ahp  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahp<V> implements ahq<V> {
    private String a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    @ReadingInfo.SORT
    private String g;
    private List<V> h;
    private int i;
    private boolean j;
    private ahq.a<V> k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private String s;

    protected abstract void a(boolean z, int i, int i2, String str, boolean z2);

    public boolean n() {
        return false;
    }

    public ahp(String str, int i) {
        this.f = 20;
        this.g = "timeAsc";
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = null;
        if (TextUtils.isEmpty(str)) {
            this.a = "Invalid";
        } else {
            this.a = str;
        }
        this.d = -1;
        this.c = -1;
        this.e = -1;
        this.j = false;
        this.f = i;
        this.i = -1;
    }

    public ahp(String str, int i, int i2, String str2, List<V> list, int i3) {
        this(str, i2);
        this.d = i;
        this.c = i;
        this.g = str2;
        this.h = list;
        this.i = i3;
    }

    public ahp(String str, int i, int i2, int i3, String str2, boolean z, List<V> list, int i4) {
        this(str, i3);
        this.d = i;
        this.c = i;
        this.e = i2;
        this.g = str2;
        this.h = list;
        this.i = i4;
        this.m = z;
    }

    public ahp(String str, int i, int i2, int i3, String str2, boolean z, List<V> list, int i4, boolean z2, String str3) {
        this(str, i3);
        this.d = i;
        this.c = i;
        this.e = i2;
        this.g = str2;
        this.h = list;
        this.i = i4;
        this.m = z;
        this.o = z2;
        this.s = str3;
    }

    public void a(ahq.a<V> aVar) {
        this.k = aVar;
    }

    public void a() {
        this.j = true;
        this.l = false;
    }

    public void a(String str) {
        this.a = str;
    }

    @Override // defpackage.ahq
    public String b() {
        return this.a;
    }

    @Override // defpackage.ahq
    public boolean c() {
        List<V> list = this.h;
        return (list == null || list.size() <= 0 || this.i == -1) ? false : true;
    }

    public List<V> d() {
        return this.h;
    }

    public void a(List<V> list) {
        this.h = list;
    }

    public int e() {
        return this.i;
    }

    public void a(int i) {
        this.i = i;
    }

    public void f() {
        this.i = -1;
        this.h = null;
    }

    @Override // defpackage.ahq
    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public boolean i() {
        return this.o;
    }

    public void a(boolean z) {
        this.o = z;
    }

    public String j() {
        return this.s;
    }

    public void k() {
        Log.i("AbsMediaSource", "reqList: " + this.l + " sort = " + this.g);
        if (this.l) {
            return;
        }
        this.l = true;
        this.p = true;
        c(1);
    }

    public void l() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.p = false;
        c(this.d + 1);
    }

    private void c(int i) {
        a(true, i, this.f, this.g, true);
    }

    public boolean m() {
        return this.p;
    }

    public boolean o() {
        LogUtils.i("AbsMediaSource", "hasNextPage mCurrentPage:" + this.d + ", mTotalPage:" + this.e);
        return this.d < this.e;
    }

    public boolean p() {
        return this.d > 1;
    }

    public boolean q() {
        Log.i("AbsMediaSource", "prePage: " + this + " total = " + this.e + " curPage = " + this.c);
        if (this.b || !r()) {
            return false;
        }
        this.b = true;
        this.p = false;
        a(false, this.c - 1, this.f, this.g, false);
        return true;
    }

    public boolean r() {
        int i = this.c;
        return i > 1 && i < this.e;
    }

    public boolean s() {
        Log.i("AbsMediaSource", "nextPage: " + this + " total = " + this.e + " mCurPage = " + this.d);
        if (n()) {
            int i = this.d + 1;
            int i2 = this.e;
            if (i <= i2 || i2 == -1) {
                if (this.l) {
                    return true;
                }
                this.l = true;
                this.p = false;
                a(true, this.d + 1, this.f, this.g, false);
                return true;
            }
            return false;
        }
        return false;
    }

    public void a(boolean z, int i, int i2, List<V> list) {
        ahq.a<V> aVar;
        ahq.a<V> aVar2;
        Log.i("AbsMediaSource", "onSuccesList: " + list.size() + " isNext = " + z + " mCancel = " + this.j + " callback = " + this.k + " page = " + i + " totalPage = " + i2);
        if (list.isEmpty() && (i == 0 || i == 1)) {
            a(z, -1, t());
            this.o = false;
            return;
        }
        this.e = i2;
        if (z) {
            this.d = i;
            this.l = false;
            if (this.c == -1) {
                this.c = this.d;
            }
            if (!this.j && (aVar2 = this.k) != null) {
                aVar2.a(list);
            }
        } else {
            this.c = i;
            this.b = false;
            if (!this.j && (aVar = this.k) != null) {
                aVar.b(list);
            }
        }
        this.o = false;
        u.c(new age.c(3));
        u.c(new agg.v());
    }

    protected String t() {
        return a.a.getString(f.h.common_mediasource_error_hint);
    }

    public void a(boolean z, int i, String str) {
        ahq.a<V> aVar;
        ahq.a<V> aVar2;
        if (z) {
            this.l = false;
            if (!this.j && (aVar2 = this.k) != null) {
                aVar2.a(i, str);
            }
        } else {
            this.b = false;
            if (!this.j && (aVar = this.k) != null) {
                aVar.b(i, str);
            }
        }
        this.o = false;
        LogUtils.i("AbsMediaSource", b() + "-----" + str + " code = " + i);
    }

    public void a(ahp ahpVar) {
        if (ahpVar == null) {
            return;
        }
        this.a = ahpVar.a;
        this.c = ahpVar.c;
        this.d = ahpVar.d;
        this.e = ahpVar.e;
        this.f = ahpVar.f;
        this.g = ahpVar.g;
        this.s = ahpVar.s;
    }

    @Override // defpackage.ahq
    @ReadingInfo.SORT
    public String u() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public boolean v() {
        return this.m;
    }

    public void b(boolean z) {
        this.m = z;
    }

    public boolean w() {
        return this.n;
    }

    public void c(boolean z) {
        this.n = z;
    }

    public void d(boolean z) {
        this.q = z;
    }

    public boolean x() {
        return this.q;
    }

    public void y() {
        this.j = false;
    }

    public boolean z() {
        return this.l;
    }

    public boolean A() {
        return this.r;
    }

    public void e(boolean z) {
        this.r = z;
    }
}
