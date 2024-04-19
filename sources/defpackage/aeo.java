package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import com.xiaopeng.musicradio.commonui.widget.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PagerAdapter.java */
/* renamed from: aeo  reason: default package */
/* loaded from: classes2.dex */
public class aeo extends c {
    private FragmentManager c;
    private s d = null;
    private Fragment e = null;
    public List<a> a = new ArrayList();
    public SparseArray<Fragment> b = new SparseArray<>();

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public void a(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public Parcelable b() {
        return null;
    }

    public long c(int i) {
        return i;
    }

    public aeo(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    public void a(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    public void a(List<a> list) {
        this.a.clear();
        this.a.addAll(list);
    }

    public Fragment a(int i) {
        if (i >= this.a.size()) {
            return null;
        }
        if (this.b.get(i) != null) {
            return this.b.get(i);
        }
        Fragment fragment = (Fragment) sp.a().a(this.a.get(i).a).navigation();
        this.b.put(i, fragment);
        a aVar = this.a.get(i);
        if (aVar.b() != null) {
            fragment.setArguments(aVar.b());
        }
        return fragment;
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public int a() {
        return this.a.size();
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public CharSequence b(int i) {
        return i >= this.a.size() ? "" : this.a.get(i).b;
    }

    /* compiled from: PagerAdapter.java */
    /* renamed from: aeo$a */
    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        private String b;
        private Bundle c;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public a(String str, String str2, Bundle bundle) {
            this.a = str;
            this.b = str2;
            this.c = bundle;
        }

        public String a() {
            return this.a;
        }

        public Bundle b() {
            return this.c;
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public void a(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public Object a(ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = this.c.beginTransaction();
        }
        long c = c(i);
        Fragment findFragmentByTag = this.c.findFragmentByTag(a(viewGroup.getId(), c));
        if (findFragmentByTag == null) {
            findFragmentByTag = a(i);
        }
        if (findFragmentByTag != null && !findFragmentByTag.isAdded()) {
            this.d.b(viewGroup.getId(), findFragmentByTag, a(viewGroup.getId(), c));
        }
        if (findFragmentByTag != null && findFragmentByTag != this.e) {
            findFragmentByTag.setMenuVisibility(false);
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.e.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.e = fragment;
        }
        if (this.d == null) {
            this.d = this.c.beginTransaction();
        }
        this.d.b(viewGroup.getId(), fragment, a(viewGroup.getId(), c(i)));
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public void b(ViewGroup viewGroup) {
        s sVar = this.d;
        if (sVar != null) {
            sVar.e();
            this.d = null;
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.widget.c
    public boolean a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    private static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
