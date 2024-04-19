package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
import com.xiaopeng.xui.app.XDialogSystemType;
import defpackage.io;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ExploreByTouchHelper.java */
/* renamed from: in  reason: default package */
/* loaded from: classes3.dex */
public abstract class in extends gq {
    private static final Rect c = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final io.a<ib> l = new io.a<ib>() { // from class: in.1
        @Override // defpackage.io.a
        public void a(ib ibVar, Rect rect) {
            ibVar.a(rect);
        }
    };
    private static final io.b<bm<ib>, ib> m = new io.b<bm<ib>, ib>() { // from class: in.2
        @Override // defpackage.io.b
        public ib a(bm<ib> bmVar, int i) {
            return bmVar.c(i);
        }

        @Override // defpackage.io.b
        public int a(bm<ib> bmVar) {
            return bmVar.b();
        }
    };
    private final AccessibilityManager h;
    private final View i;
    private a j;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    int a = Integer.MIN_VALUE;
    int b = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;

    private static int e(int i) {
        switch (i) {
            case 19:
                return 33;
            case 20:
            default:
                return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
            case 21:
                return 17;
            case 22:
                return 66;
        }
    }

    protected abstract int a(float f, float f2);

    protected void a(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void a(int i, ib ibVar);

    protected void a(int i, boolean z) {
    }

    protected void a(AccessibilityEvent accessibilityEvent) {
    }

    protected void a(ib ibVar) {
    }

    protected abstract void a(List<Integer> list);

    protected abstract boolean b(int i, int i2, Bundle bundle);

    public in(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (hq.f(view) == 0) {
            hq.d(view, 1);
        }
    }

    @Override // defpackage.gq
    public ic a(View view) {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7) {
                switch (action) {
                    case 9:
                        break;
                    case 10:
                        if (this.k != Integer.MIN_VALUE) {
                            f(Integer.MIN_VALUE);
                            return true;
                        }
                        return false;
                    default:
                        return false;
                }
            }
            int a2 = a(motionEvent.getX(), motionEvent.getY());
            f(a2);
            return a2 != Integer.MIN_VALUE;
        }
        return false;
    }

    public final boolean a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int e = e(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && b(e, (Rect) null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    e();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return b(2, (Rect) null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return b(1, (Rect) null);
                }
                return false;
            }
        }
        return false;
    }

    public final void a(boolean z, int i, Rect rect) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            d(i2);
        }
        if (z) {
            b(i, rect);
        }
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    private void a(int i, Rect rect) {
        b(i).a(rect);
    }

    private boolean b(int i, Rect rect) {
        ib ibVar;
        bm<ib> d = d();
        int i2 = this.b;
        ib a2 = i2 == Integer.MIN_VALUE ? null : d.a(i2);
        if (i != 17 && i != 33 && i != 66 && i != 130) {
            switch (i) {
                case 1:
                case 2:
                    ibVar = (ib) io.a(d, m, l, a2, i, hq.h(this.i) == 1, false);
                    break;
                default:
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        } else {
            Rect rect2 = new Rect();
            int i3 = this.b;
            if (i3 != Integer.MIN_VALUE) {
                a(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                a(this.i, i, rect2);
            }
            ibVar = (ib) io.a(d, m, l, a2, rect2, i);
        }
        return c(ibVar != null ? d.b(d.a((bm<ib>) ibVar)) : Integer.MIN_VALUE);
    }

    private bm<ib> d() {
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        bm<ib> bmVar = new bm<>();
        for (int i = 0; i < arrayList.size(); i++) {
            bmVar.b(i, h(i));
        }
        return bmVar;
    }

    private static Rect a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean e() {
        int i = this.b;
        return i != Integer.MIN_VALUE && b(i, 16, null);
    }

    public final boolean a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return ht.a(parent, this.i, c(i, i2));
    }

    public final void a(int i) {
        b(i, 0);
    }

    public final void b(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return;
        }
        AccessibilityEvent c2 = c(i, XDialogSystemType.TYPE_LIFECYCLE_DIALOG);
        ia.a(c2, i2);
        ht.a(parent, this.i, c2);
    }

    private void f(int i) {
        int i2 = this.k;
        if (i2 == i) {
            return;
        }
        this.k = i;
        a(i, 128);
        a(i2, IRadioController.TEF663x_PCHANNEL);
    }

    private AccessibilityEvent c(int i, int i2) {
        if (i == -1) {
            return g(i2);
        }
        return d(i, i2);
    }

    private AccessibilityEvent g(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @Override // defpackage.gq
    public void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        a(accessibilityEvent);
    }

    private AccessibilityEvent d(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        ib b = b(i);
        obtain.getText().add(b.q());
        obtain.setContentDescription(b.r());
        obtain.setScrollable(b.n());
        obtain.setPassword(b.m());
        obtain.setEnabled(b.l());
        obtain.setChecked(b.f());
        a(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(b.p());
        id.a(obtain, this.i, i);
        obtain.setPackageName(this.i.getContext().getPackageName());
        return obtain;
    }

    ib b(int i) {
        if (i == -1) {
            return f();
        }
        return h(i);
    }

    private ib f() {
        ib a2 = ib.a(this.i);
        hq.a(this.i, a2);
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        if (a2.c() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a2.b(this.i, ((Integer) arrayList.get(i)).intValue());
        }
        return a2;
    }

    @Override // defpackage.gq
    public void a(View view, ib ibVar) {
        super.a(view, ibVar);
        a(ibVar);
    }

    private ib h(int i) {
        ib b = ib.b();
        b.h(true);
        b.c(true);
        b.b("android.view.View");
        b.b(c);
        b.d(c);
        b.b(this.i);
        a(i, b);
        if (b.q() == null && b.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b.a(this.e);
        if (this.e.equals(c)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int d = b.d();
        if ((d & 64) == 0) {
            if ((d & 128) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            b.a((CharSequence) this.i.getContext().getPackageName());
            b.a(this.i, i);
            if (this.a == i) {
                b.f(true);
                b.a(128);
            } else {
                b.f(false);
                b.a(64);
            }
            boolean z = this.b == i;
            if (z) {
                b.a(2);
            } else if (b.g()) {
                b.a(1);
            }
            b.d(z);
            this.i.getLocationOnScreen(this.g);
            b.c(this.d);
            if (this.d.equals(c)) {
                b.a(this.d);
                if (b.a != -1) {
                    ib b2 = ib.b();
                    for (int i2 = b.a; i2 != -1; i2 = b2.a) {
                        b2.c(this.i, -1);
                        b2.b(c);
                        a(i2, b2);
                        b2.a(this.e);
                        this.d.offset(this.e.left, this.e.top);
                    }
                    b2.s();
                }
                this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            }
            if (this.i.getLocalVisibleRect(this.f)) {
                this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                if (this.d.intersect(this.f)) {
                    b.d(this.d);
                    if (a(this.d)) {
                        b.e(true);
                    }
                }
            }
            return b;
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    boolean a(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return a(i2, bundle);
        }
        return c(i, i2, bundle);
    }

    private boolean a(int i, Bundle bundle) {
        return hq.a(this.i, i, bundle);
    }

    private boolean c(int i, int i2, Bundle bundle) {
        if (i2 != 64) {
            if (i2 == 128) {
                return j(i);
            }
            switch (i2) {
                case 1:
                    return c(i);
                case 2:
                    return d(i);
                default:
                    return b(i, i2, bundle);
            }
        }
        return i(i);
    }

    private boolean a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private boolean i(int i) {
        int i2;
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled() && (i2 = this.a) != i) {
            if (i2 != Integer.MIN_VALUE) {
                j(i2);
            }
            this.a = i;
            this.i.invalidate();
            a(i, 32768);
            return true;
        }
        return false;
    }

    private boolean j(int i) {
        if (this.a == i) {
            this.a = Integer.MIN_VALUE;
            this.i.invalidate();
            a(i, 65536);
            return true;
        }
        return false;
    }

    public final boolean c(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.b) != i) {
            if (i2 != Integer.MIN_VALUE) {
                d(i2);
            }
            this.b = i;
            a(i, true);
            a(i, 8);
            return true;
        }
        return false;
    }

    public final boolean d(int i) {
        if (this.b != i) {
            return false;
        }
        this.b = Integer.MIN_VALUE;
        a(i, false);
        a(i, 8);
        return true;
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: in$a */
    /* loaded from: classes3.dex */
    private class a extends ic {
        a() {
        }

        @Override // defpackage.ic
        public ib a(int i) {
            return ib.a(in.this.b(i));
        }

        @Override // defpackage.ic
        public boolean a(int i, int i2, Bundle bundle) {
            return in.this.a(i, i2, bundle);
        }

        @Override // defpackage.ic
        public ib b(int i) {
            int i2 = i == 2 ? in.this.a : in.this.b;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }
    }
}
