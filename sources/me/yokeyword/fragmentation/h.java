package me.yokeyword.fragmentation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import java.util.List;
/* compiled from: SupportHelper.java */
/* loaded from: classes2.dex */
public class h {
    public static c a(FragmentManager fragmentManager) {
        return a(fragmentManager, 0);
    }

    public static c a(FragmentManager fragmentManager, int i) {
        List<Fragment> d = x.d(fragmentManager);
        if (d == null) {
            return null;
        }
        for (int size = d.size() - 1; size >= 0; size--) {
            Fragment fragment = d.get(size);
            if (fragment instanceof c) {
                c cVar = (c) fragment;
                if (i == 0 || i == cVar.u().c) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public static c a(Fragment fragment) {
        List<Fragment> d;
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null || (d = x.d(fragmentManager)) == null) {
            return null;
        }
        for (int indexOf = d.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = d.get(indexOf);
            if (fragment2 instanceof c) {
                return (c) fragment2;
            }
        }
        return null;
    }

    public static c b(FragmentManager fragmentManager) {
        return a(fragmentManager, (c) null);
    }

    private static c a(FragmentManager fragmentManager, c cVar) {
        List<Fragment> d = x.d(fragmentManager);
        if (d == null) {
            return cVar;
        }
        for (int size = d.size() - 1; size >= 0; size--) {
            Fragment fragment = d.get(size);
            if ((fragment instanceof c) && fragment.isResumed() && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                return a(fragment.getChildFragmentManager(), (c) fragment);
            }
        }
        return cVar;
    }

    public static c c(FragmentManager fragmentManager) {
        return b(fragmentManager, 0);
    }

    public static c b(FragmentManager fragmentManager, int i) {
        for (int backStackEntryCount = fragmentManager.getBackStackEntryCount() - 1; backStackEntryCount >= 0; backStackEntryCount--) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(fragmentManager.getBackStackEntryAt(backStackEntryCount).h());
            if (findFragmentByTag instanceof c) {
                c cVar = (c) findFragmentByTag;
                if (i == 0 || i == cVar.u().c) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends c> T a(Class<T> cls, String str, FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (str == null) {
            str = cls.getName();
        }
        for (int i = backStackEntryCount - 1; i >= 0; i--) {
            FragmentManager.a backStackEntryAt = fragmentManager.getBackStackEntryAt(i);
            if (str.equals(backStackEntryAt.h())) {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag(backStackEntryAt.h());
                if (findFragmentByTag instanceof c) {
                    return (T) findFragmentByTag;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r3 < r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<androidx.fragment.app.Fragment> a(androidx.fragment.app.FragmentManager r6, java.lang.String r7, boolean r8) {
        /*
            androidx.fragment.app.Fragment r7 = r6.findFragmentByTag(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r6 = androidx.fragment.app.x.d(r6)
            if (r6 != 0) goto L10
            return r0
        L10:
            int r1 = r6.size()
            int r2 = r1 + (-1)
            r3 = r2
        L17:
            r4 = -1
            if (r3 < 0) goto L2b
            java.lang.Object r5 = r6.get(r3)
            if (r7 != r5) goto L28
            if (r8 == 0) goto L23
            goto L2c
        L23:
            int r3 = r3 + 1
            if (r3 >= r1) goto L2b
            goto L2c
        L28:
            int r3 = r3 + (-1)
            goto L17
        L2b:
            r3 = r4
        L2c:
            if (r3 != r4) goto L2f
            return r0
        L2f:
            if (r2 < r3) goto L45
            java.lang.Object r7 = r6.get(r2)
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            if (r7 == 0) goto L42
            android.view.View r8 = r7.getView()
            if (r8 == 0) goto L42
            r0.add(r7)
        L42:
            int r2 = r2 + (-1)
            goto L2f
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.yokeyword.fragmentation.h.a(androidx.fragment.app.FragmentManager, java.lang.String, boolean):java.util.List");
    }
}
