package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AccessibilityNodeProviderCompat.java */
/* renamed from: ic  reason: default package */
/* loaded from: classes3.dex */
public class ic {
    private final Object a;

    public ib a(int i) {
        return null;
    }

    public List<ib> a(String str, int i) {
        return null;
    }

    public void a(int i, ib ibVar, String str, Bundle bundle) {
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public ib b(int i) {
        return null;
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: ic$a */
    /* loaded from: classes3.dex */
    static class a extends AccessibilityNodeProvider {
        final ic a;

        a(ic icVar) {
            this.a = icVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            ib a = this.a.a(i);
            if (a == null) {
                return null;
            }
            return a.a();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<ib> a = this.a.a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a.get(i2).a());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.a(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: ic$b */
    /* loaded from: classes3.dex */
    static class b extends a {
        b(ic icVar) {
            super(icVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            ib b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.a();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: ic$c */
    /* loaded from: classes3.dex */
    static class c extends b {
        c(ic icVar) {
            super(icVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, ib.a(accessibilityNodeInfo), str, bundle);
        }
    }

    public ic() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new c(this);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.a = new b(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.a = new a(this);
        } else {
            this.a = null;
        }
    }

    public ic(Object obj) {
        this.a = obj;
    }

    public Object a() {
        return this.a;
    }
}
