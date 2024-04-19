package com.xiaopeng.musicradio.mine.widget;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.mine.widget.f;
import defpackage.aht;
import java.util.List;
/* compiled from: PageFragmentHolder.java */
/* loaded from: classes.dex */
public class e {
    private FragmentManager a;
    private List<f.b> b;
    private SparseArray<Fragment> c = new SparseArray<>();

    public e(FragmentManager fragmentManager, List<f.b> list) {
        this.a = fragmentManager;
        this.b = list;
    }

    public void a(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public Fragment a(int i) {
        Fragment fragment = this.c.get(i);
        if (fragment == null) {
            Fragment fragment2 = (Fragment) sp.a().a(this.b.get(i).a()).navigation();
            this.c.put(i, fragment2);
            return fragment2;
        }
        return fragment;
    }

    public void b(final int i) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.mine.widget.e.1
            @Override // java.lang.Runnable
            public void run() {
                Fragment a;
                LogUtils.i("PageFragmentHolder", "navigateTo:index=" + i + ",isDestroyed=" + e.this.a.isDestroyed());
                if (e.this.a.isDestroyed() || (a = e.this.a(i)) == null) {
                    return;
                }
                try {
                    e.this.a.beginTransaction().a(aht.c.page_fragment_container, a).e();
                } catch (Exception unused) {
                }
            }
        });
    }
}
