package me.yokeyword.fragmentation;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import androidx.fragment.app.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.yokeyword.fragmentation.helper.internal.ResultRecord;
import me.yokeyword.fragmentation.helper.internal.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransactionDelegate.java */
/* loaded from: classes2.dex */
public class i {
    private b b;
    private androidx.fragment.app.d c;
    private Handler d = new Handler(Looper.getMainLooper());
    bjg a = new bjg(this.d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(b bVar) {
        this.b = bVar;
        this.c = (androidx.fragment.app.d) bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final FragmentManager fragmentManager, final int i, final c cVar, final boolean z, final boolean z2) {
        a(fragmentManager, new bjf(4) { // from class: me.yokeyword.fragmentation.i.6
            @Override // defpackage.bjf
            public void a() {
                i.this.a(i, cVar);
                String name = cVar.getClass().getName();
                me.yokeyword.fragmentation.helper.internal.b bVar = cVar.u().d;
                i.this.a(fragmentManager, null, cVar, (bVar == null || bVar.a == null) ? name : bVar.a, !z, null, z2, 10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final FragmentManager fragmentManager, final c cVar, final c cVar2, final int i, final int i2, final int i3) {
        a(fragmentManager, new bjf(i2 != 2 ? 0 : 2) { // from class: me.yokeyword.fragmentation.i.7
            @Override // defpackage.bjf
            public void a() {
                i.this.b(fragmentManager, cVar, cVar2, i, i2, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final FragmentManager fragmentManager) {
        a(fragmentManager, new bjf(1, fragmentManager) { // from class: me.yokeyword.fragmentation.i.8
            @Override // defpackage.bjf
            public void a() {
                i.this.a(fragmentManager, "pop()");
                x.b(fragmentManager);
                i.this.b(fragmentManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FragmentManager fragmentManager) {
        try {
            c c = h.c(fragmentManager);
            if (c != null) {
                fragmentManager.beginTransaction().c(8194).a((Fragment) c).c();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(c cVar) {
        if (cVar != null) {
            return cVar.z() || a((c) ((Fragment) cVar).getParentFragment());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        ResultRecord resultRecord;
        try {
            Bundle arguments = fragment.getArguments();
            if (arguments == null || (resultRecord = (ResultRecord) arguments.getParcelable("fragment_arg_result_record")) == null) {
                return;
            }
            ((c) fragment.getFragmentManager().getFragment(fragment.getArguments(), "fragmentation_state_save_result")).a(resultRecord.requestCode, resultRecord.resultCode, resultRecord.resultBundle);
        } catch (IllegalStateException unused) {
        }
    }

    private void a(FragmentManager fragmentManager, bjf bjfVar) {
        if (fragmentManager == null) {
            Log.w("Fragmentation", "FragmentManager is null, skip the action!");
        } else {
            this.a.a(bjfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FragmentManager fragmentManager, c cVar, c cVar2, int i, int i2, int i3) {
        String str;
        ArrayList<b.a> arrayList;
        boolean z;
        a(cVar2, "toFragment == null");
        if ((i3 == 1 || i3 == 3) && cVar != null) {
            Fragment fragment = (Fragment) cVar;
            if (!fragment.isAdded()) {
                Log.w("Fragmentation", fragment.getClass().getSimpleName() + " has not been attached yet! startForResult() converted to start()");
            } else {
                a(fragmentManager, fragment, (Fragment) cVar2, i);
            }
        }
        c a = a(cVar, fragmentManager);
        int i4 = b((Fragment) cVar2).getInt("fragmentation_arg_container", 0);
        if (a == null && i4 == 0) {
            Log.e("Fragmentation", "There is no Fragment in the FragmentManager, maybe you need to call loadRootFragment()!");
            return;
        }
        if (a != null && i4 == 0) {
            a(a.u().c, cVar2);
        }
        String name = cVar2.getClass().getName();
        me.yokeyword.fragmentation.helper.internal.b bVar = cVar2.u().d;
        if (bVar != null) {
            if (bVar.a != null) {
                name = bVar.a;
            }
            boolean z2 = bVar.f;
            if (bVar.g != null) {
                str = name;
                arrayList = bVar.g;
                z = z2;
            } else {
                str = name;
                arrayList = null;
                z = z2;
            }
        } else {
            str = name;
            arrayList = null;
            z = false;
        }
        if (a(fragmentManager, a, cVar2, str, i2)) {
            return;
        }
        a(fragmentManager, a, cVar2, str, z, arrayList, false, i3);
    }

    private c a(c cVar, FragmentManager fragmentManager) {
        if (cVar == null) {
            return h.a(fragmentManager);
        }
        if (cVar.u().c == 0) {
            Fragment fragment = (Fragment) cVar;
            if (fragment.getTag() != null && !fragment.getTag().startsWith("android:switcher:")) {
                throw new IllegalStateException("Can't find container, please call loadRootFragment() first!");
            }
        }
        return h.a(fragmentManager, cVar.u().c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FragmentManager fragmentManager, c cVar, c cVar2, String str, boolean z, ArrayList<b.a> arrayList, boolean z2, int i) {
        FragmentManager fragmentManager2;
        s beginTransaction = fragmentManager.beginTransaction();
        boolean z3 = i == 0 || i == 1 || i == 2 || i == 3;
        Fragment fragment = (Fragment) cVar;
        Fragment fragment2 = (Fragment) cVar2;
        Bundle b = b(fragment2);
        b.putBoolean("fragmentation_arg_replace", !z3);
        if (arrayList != null) {
            b.putBoolean("fragmentation_arg_is_shared_element", true);
            Iterator<b.a> it = arrayList.iterator();
            while (it.hasNext()) {
                b.a next = it.next();
                beginTransaction.a(next.a, next.b);
            }
        } else if (z3) {
            me.yokeyword.fragmentation.helper.internal.b bVar = cVar2.u().d;
            if (bVar != null && bVar.b != Integer.MIN_VALUE) {
                beginTransaction.a(bVar.b, bVar.c, bVar.d, bVar.e);
                b.putInt("fragmentation_arg_custom_enter_anim", bVar.b);
                b.putInt("fragmentation_arg_custom_exit_anim", bVar.e);
                b.putInt("fragmentation_arg_custom_pop_exit_anim", bVar.c);
            } else {
                beginTransaction.c(4097);
            }
        } else {
            b.putInt("fragmentation_arg_root_status", 1);
        }
        if (cVar == null) {
            beginTransaction.b(b.getInt("fragmentation_arg_container"), fragment2, str);
            if (!z3) {
                beginTransaction.c(4097);
                b.putInt("fragmentation_arg_root_status", z2 ? 2 : 1);
            }
        } else if (z3) {
            beginTransaction.a(cVar.u().c, fragment2, str);
            if (i != 2 && i != 3) {
                beginTransaction.b(fragment);
            }
        } else {
            beginTransaction.b(cVar.u().c, fragment2, str);
        }
        if (z || i == 11) {
            fragmentManager2 = fragmentManager;
        } else {
            beginTransaction.a(str);
            fragmentManager2 = fragmentManager;
        }
        a(fragmentManager2, beginTransaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, c cVar) {
        b((Fragment) cVar).putInt("fragmentation_arg_container", i);
    }

    private Bundle b(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            Bundle bundle = new Bundle();
            fragment.setArguments(bundle);
            return bundle;
        }
        return arguments;
    }

    private void a(FragmentManager fragmentManager, s sVar) {
        a(fragmentManager, "commit()");
        sVar.c();
    }

    private boolean a(FragmentManager fragmentManager, c cVar, final c cVar2, String str, int i) {
        final c a;
        if (cVar == null || (a = h.a((Class<c>) cVar2.getClass(), str, fragmentManager)) == null) {
            return false;
        }
        if (i == 1) {
            if (cVar2 == cVar || cVar2.getClass().getName().equals(cVar.getClass().getName())) {
                a(cVar2, a);
                return true;
            }
        } else if (i == 2) {
            a(str, false, fragmentManager, Integer.MAX_VALUE);
            this.d.post(new Runnable() { // from class: me.yokeyword.fragmentation.i.1
                @Override // java.lang.Runnable
                public void run() {
                    i.this.a(cVar2, a);
                }
            });
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, c cVar2) {
        Bundle bundle = cVar.u().e;
        Bundle b = b((Fragment) cVar);
        if (b.containsKey("fragmentation_arg_container")) {
            b.remove("fragmentation_arg_container");
        }
        if (bundle != null) {
            b.putAll(bundle);
        }
        cVar2.c(b);
    }

    private void a(FragmentManager fragmentManager, Fragment fragment, Fragment fragment2, int i) {
        Bundle b = b(fragment2);
        ResultRecord resultRecord = new ResultRecord();
        resultRecord.requestCode = i;
        b.putParcelable("fragment_arg_result_record", resultRecord);
        fragmentManager.putFragment(b, "fragmentation_state_save_result", fragment);
    }

    private void a(String str, boolean z, FragmentManager fragmentManager, int i) {
        a(fragmentManager, "popTo()");
        if (fragmentManager.findFragmentByTag(str) == null) {
            Log.e("Fragmentation", "Pop failure! Can't find FragmentTag:" + str + " in the FragmentManager's Stack.");
            return;
        }
        List<Fragment> a = h.a(fragmentManager, str, z);
        if (a.size() <= 0) {
            return;
        }
        a(a.get(0), str, fragmentManager, z ? 1 : 0, a, i);
    }

    private void a(String str, FragmentManager fragmentManager, int i, List<Fragment> list) {
        this.b.t().a = true;
        s c = fragmentManager.beginTransaction().c(8194);
        for (Fragment fragment : list) {
            c.a(fragment);
        }
        c.c();
        x.a(fragmentManager, str, i);
        x.c(fragmentManager);
        this.b.t().a = false;
    }

    private void a(Fragment fragment, String str, FragmentManager fragmentManager, int i, List<Fragment> list, int i2) {
        final View view;
        Animation loadAnimation;
        if (!(fragment instanceof c)) {
            a(str, fragmentManager, i, list);
            return;
        }
        c cVar = (c) fragment;
        final ViewGroup a = a(fragment, cVar.u().c);
        if (a == null || (view = fragment.getView()) == null) {
            return;
        }
        a.removeViewInLayout(view);
        final ViewGroup a2 = a(view, a);
        a(str, fragmentManager, i, list);
        if (i2 == Integer.MAX_VALUE) {
            loadAnimation = cVar.u().n();
            if (loadAnimation == null) {
                loadAnimation = new Animation() { // from class: me.yokeyword.fragmentation.i.2
                };
            }
        } else if (i2 == 0) {
            loadAnimation = new Animation() { // from class: me.yokeyword.fragmentation.i.3
            };
        } else {
            loadAnimation = AnimationUtils.loadAnimation(this.c, i2);
        }
        view.startAnimation(loadAnimation);
        this.d.postDelayed(new Runnable() { // from class: me.yokeyword.fragmentation.i.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    a2.removeViewInLayout(view);
                    a.removeViewInLayout(a2);
                } catch (Exception unused) {
                }
            }
        }, loadAnimation.getDuration());
    }

    private ViewGroup a(View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = new ViewGroup(this.c) { // from class: me.yokeyword.fragmentation.i.5
            @Override // android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            }
        };
        viewGroup2.addView(view);
        viewGroup.addView(viewGroup2);
        return viewGroup2;
    }

    private ViewGroup a(Fragment fragment, int i) {
        View findViewById;
        if (fragment.getView() == null) {
            return null;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            if (parentFragment.getView() != null) {
                findViewById = parentFragment.getView().findViewById(i);
            } else {
                findViewById = a(parentFragment, i);
            }
        } else {
            findViewById = this.c.findViewById(i);
        }
        if (findViewById instanceof ViewGroup) {
            return (ViewGroup) findViewById;
        }
        return null;
    }

    private static <T> void a(T t, String str) {
        if (t == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FragmentManager fragmentManager, String str) {
        if (x.a(fragmentManager)) {
            bjd bjdVar = new bjd(str);
            if (a.a().b() != null) {
                a.a().b().a(bjdVar);
            }
        }
    }
}
