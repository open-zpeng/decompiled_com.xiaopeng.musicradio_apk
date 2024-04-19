package defpackage;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.xiaopeng.xui.app.XDialogSystemType;
import defpackage.er;
import defpackage.gq;
import defpackage.hy;
import defpackage.ib;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: hq  reason: default package */
/* loaded from: classes3.dex */
public class hq {
    private static Field b;
    private static boolean c;
    private static Field d;
    private static boolean e;
    private static WeakHashMap<View, String> f;
    private static Field h;
    private static ThreadLocal<Rect> j;
    private static final AtomicInteger a = new AtomicInteger(1);
    private static WeakHashMap<View, hu> g = null;
    private static boolean i = false;
    private static final int[] k = {er.b.accessibility_custom_action_0, er.b.accessibility_custom_action_1, er.b.accessibility_custom_action_2, er.b.accessibility_custom_action_3, er.b.accessibility_custom_action_4, er.b.accessibility_custom_action_5, er.b.accessibility_custom_action_6, er.b.accessibility_custom_action_7, er.b.accessibility_custom_action_8, er.b.accessibility_custom_action_9, er.b.accessibility_custom_action_10, er.b.accessibility_custom_action_11, er.b.accessibility_custom_action_12, er.b.accessibility_custom_action_13, er.b.accessibility_custom_action_14, er.b.accessibility_custom_action_15, er.b.accessibility_custom_action_16, er.b.accessibility_custom_action_17, er.b.accessibility_custom_action_18, er.b.accessibility_custom_action_19, er.b.accessibility_custom_action_20, er.b.accessibility_custom_action_21, er.b.accessibility_custom_action_22, er.b.accessibility_custom_action_23, er.b.accessibility_custom_action_24, er.b.accessibility_custom_action_25, er.b.accessibility_custom_action_26, er.b.accessibility_custom_action_27, er.b.accessibility_custom_action_28, er.b.accessibility_custom_action_29, er.b.accessibility_custom_action_30, er.b.accessibility_custom_action_31};
    private static final hl l = new hl() { // from class: hq.1
        @Override // defpackage.hl
        public gs onReceiveContent(gs gsVar) {
            return gsVar;
        }
    };
    private static a m = new a();

    /* compiled from: ViewCompat.java */
    /* renamed from: hq$f */
    /* loaded from: classes3.dex */
    public interface f {
        boolean a(View view, KeyEvent keyEvent);
    }

    private static Rect b() {
        if (j == null) {
            j = new ThreadLocal<>();
        }
        Rect rect = j.get();
        if (rect == null) {
            rect = new Rect();
            j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void a(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            e.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    @Deprecated
    public static boolean a(View view, int i2) {
        return view.canScrollHorizontally(i2);
    }

    @Deprecated
    public static boolean b(View view, int i2) {
        return view.canScrollVertically(i2);
    }

    public static void a(View view, ib ibVar) {
        view.onInitializeAccessibilityNodeInfo(ibVar.a());
    }

    public static void a(View view, gq gqVar) {
        if (gqVar == null && (K(view) instanceof gq.a)) {
            gqVar = new gq();
        }
        view.setAccessibilityDelegate(gqVar == null ? null : gqVar.a());
    }

    @SuppressLint({"InlinedApi"})
    public static int a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static gq b(View view) {
        View.AccessibilityDelegate K = K(view);
        if (K == null) {
            return null;
        }
        if (K instanceof gq.a) {
            return ((gq.a) K).a;
        }
        return new gq(K);
    }

    static gq c(View view) {
        gq b2 = b(view);
        if (b2 == null) {
            b2 = new gq();
        }
        a(view, b2);
        return b2;
    }

    private static View.AccessibilityDelegate K(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return L(view);
    }

    private static View.AccessibilityDelegate L(View view) {
        if (i) {
            return null;
        }
        if (h == null) {
            try {
                h = View.class.getDeclaredField("mAccessibilityDelegate");
                h.setAccessible(true);
            } catch (Throwable unused) {
                i = true;
                return null;
            }
        }
        try {
            Object obj = h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            i = true;
            return null;
        }
    }

    public static boolean d(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static void a(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static void e(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        } else {
            view.postInvalidate(i2, i3, i4, i5);
        }
    }

    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void a(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static int f(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void d(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    public static boolean a(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static int a(View view, CharSequence charSequence, ie ieVar) {
        int M = M(view);
        if (M != -1) {
            a(view, new ib.a(M, charSequence, ieVar));
        }
        return M;
    }

    private static int M(View view) {
        List<ib.a> N = N(view);
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = k;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < N.size(); i5++) {
                z &= N.get(i5).a() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    public static void a(View view, ib.a aVar, CharSequence charSequence, ie ieVar) {
        if (ieVar == null && charSequence == null) {
            e(view, aVar.a());
        } else {
            a(view, aVar.a(charSequence, ieVar));
        }
    }

    private static void a(View view, ib.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            c(view);
            a(aVar.a(), view);
            N(view).add(aVar);
            i(view, 0);
        }
    }

    public static void e(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            a(i2, view);
            i(view, 0);
        }
    }

    private static void a(int i2, View view) {
        List<ib.a> N = N(view);
        for (int i3 = 0; i3 < N.size(); i3++) {
            if (N.get(i3).a() == i2) {
                N.remove(i3);
                return;
            }
        }
    }

    private static List<ib.a> N(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(er.b.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(er.b.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static final CharSequence g(View view) {
        return e().c(view);
    }

    @Deprecated
    public static void a(View view, int i2, Paint paint) {
        view.setLayerType(i2, paint);
    }

    public static void a(View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public static int h(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int i(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void f(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    public static int j(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static int k(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static void b(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static int l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!c) {
            try {
                b = View.class.getDeclaredField("mMinWidth");
                b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static int m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!e) {
            try {
                d = View.class.getDeclaredField("mMinHeight");
                d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static hu n(View view) {
        if (g == null) {
            g = new WeakHashMap<>();
        }
        hu huVar = g.get(view);
        if (huVar == null) {
            hu huVar2 = new hu(view);
            g.put(view, huVar2);
            return huVar2;
        }
        return huVar;
    }

    @Deprecated
    public static void a(View view, float f2) {
        view.setAlpha(f2);
    }

    @Deprecated
    public static void b(View view, float f2) {
        view.setScaleX(f2);
    }

    @Deprecated
    public static void c(View view, float f2) {
        view.setScaleY(f2);
    }

    public static void d(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static float o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f == null) {
            f = new WeakHashMap<>();
        }
        f.put(view, str);
    }

    public static String p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static void r(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static boolean s(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static void a(View view, hj hjVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.a(view, hjVar);
        }
    }

    public static hy a(View view, hy hyVar) {
        WindowInsets j2;
        if (Build.VERSION.SDK_INT >= 21 && (j2 = hyVar.j()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(j2);
            if (!onApplyWindowInsets.equals(j2)) {
                return hy.a(onApplyWindowInsets, view);
            }
        }
        return hyVar;
    }

    public static hy b(View view, hy hyVar) {
        WindowInsets j2;
        if (Build.VERSION.SDK_INT >= 21 && (j2 = hyVar.j()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(j2);
            if (!dispatchApplyWindowInsets.equals(j2)) {
                return hy.a(dispatchApplyWindowInsets, view);
            }
        }
        return hyVar;
    }

    public static hy t(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.a(view);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return c.a(view);
        }
        return null;
    }

    public static hy a(View view, hy hyVar, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? c.a(view, hyVar, rect) : hyVar;
    }

    public static String[] u(View view) {
        return (String[]) view.getTag(er.b.tag_on_receive_content_mime_types);
    }

    public static gs a(View view, gs gsVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gsVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        hk hkVar = (hk) view.getTag(er.b.tag_on_receive_content_listener);
        if (hkVar != null) {
            gs a2 = hkVar.a(view, gsVar);
            if (a2 == null) {
                return null;
            }
            return O(view).onReceiveContent(a2);
        }
        return O(view).onReceiveContent(gsVar);
    }

    private static hl O(View view) {
        if (view instanceof hl) {
            return (hl) view;
        }
        return l;
    }

    public static boolean v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean w(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static ColorStateList x(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof ho) {
            return ((ho) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        } else if (view instanceof ho) {
            ((ho) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static PorterDuff.Mode y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof ho) {
            return ((ho) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        } else if (view instanceof ho) {
            ((ho) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof hb) {
            return ((hb) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static void A(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof hb) {
            ((hb) view).stopNestedScroll();
        }
    }

    public static boolean B(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static float C(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static void g(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            j(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            j(view, i2);
        }
    }

    private static void j(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            P(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                P((View) parent);
            }
        }
    }

    public static void h(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            k(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            k(view, i2);
        }
    }

    private static void k(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            P(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                P((View) parent);
            }
        }
    }

    private static void P(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static Rect D(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static boolean E(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean F(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static void a(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void a(View view, hn hnVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (hnVar != null ? hnVar.a() : null));
        }
    }

    public static Display G(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (E(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static int a() {
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i2 = a.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!a.compareAndSet(i2, i3));
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return g.a(view).a(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return g.a(view).a(view, keyEvent);
    }

    public static boolean H(View view) {
        Boolean c2 = c().c(view);
        if (c2 == null) {
            return false;
        }
        return c2.booleanValue();
    }

    private static b<Boolean> c() {
        return new b<Boolean>(er.b.tag_screen_reader_focusable, Boolean.class, 28) { // from class: hq.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            /* renamed from: a */
            public Boolean b(View view) {
                return Boolean.valueOf(view.isScreenReaderFocusable());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            public void a(View view, Boolean bool) {
                view.setScreenReaderFocusable(bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            public boolean a(Boolean bool, Boolean bool2) {
                return !b(bool, bool2);
            }
        };
    }

    public static CharSequence I(View view) {
        return d().c(view);
    }

    private static b<CharSequence> d() {
        return new b<CharSequence>(er.b.tag_accessibility_pane_title, CharSequence.class, 8, 28) { // from class: hq.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            /* renamed from: a */
            public CharSequence b(View view) {
                return view.getAccessibilityPaneTitle();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            public void a(View view, CharSequence charSequence) {
                view.setAccessibilityPaneTitle(charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            public boolean a(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    private static b<CharSequence> e() {
        return new b<CharSequence>(er.b.tag_state_description, CharSequence.class, 64, 30) { // from class: hq.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            /* renamed from: a */
            public CharSequence b(View view) {
                return view.getStateDescription();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            public void a(View view, CharSequence charSequence) {
                view.setStateDescription(charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            public boolean a(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static boolean J(View view) {
        Boolean c2 = f().c(view);
        if (c2 == null) {
            return false;
        }
        return c2.booleanValue();
    }

    public static void b(View view, boolean z) {
        f().b(view, (View) Boolean.valueOf(z));
    }

    private static b<Boolean> f() {
        return new b<Boolean>(er.b.tag_accessibility_heading, Boolean.class, 28) { // from class: hq.5
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            /* renamed from: a */
            public Boolean b(View view) {
                return Boolean.valueOf(view.isAccessibilityHeading());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            public void a(View view, Boolean bool) {
                view.setAccessibilityHeading(bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // defpackage.hq.b
            public boolean a(Boolean bool, Boolean bool2) {
                return !b(bool, bool2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* renamed from: hq$b */
    /* loaded from: classes3.dex */
    public static abstract class b<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        abstract void a(View view, T t);

        abstract T b(View view);

        b(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        b(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        void b(View view, T t) {
            if (a()) {
                a(view, (View) t);
            } else if (b() && a(c(view), t)) {
                hq.c(view);
                view.setTag(this.a, t);
                hq.i(view, this.d);
            }
        }

        T c(View view) {
            if (a()) {
                return b(view);
            }
            if (b()) {
                T t = (T) view.getTag(this.a);
                if (this.b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        boolean a(T t, T t2) {
            return !t2.equals(t);
        }

        boolean b(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }
    }

    static void i(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = I(view) != null && view.getVisibility() == 0;
            if (i(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : XDialogSystemType.TYPE_LIFECYCLE_DIALOG);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(I(view));
                    Q(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(I(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    private static void Q(View view) {
        if (f(view) == 0) {
            d(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (f((View) parent) == 4) {
                d(view, 2);
                return;
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: hq$a */
    /* loaded from: classes3.dex */
    static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        private WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.a.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a(view);
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                hq.i(view, z2 ? 16 : 32);
                this.a.put(view, Boolean.valueOf(z2));
            }
        }

        private void a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: hq$g */
    /* loaded from: classes3.dex */
    static class g {
        private static final ArrayList<WeakReference<View>> a = new ArrayList<>();
        private WeakHashMap<View, Boolean> b = null;
        private SparseArray<WeakReference<View>> c = null;
        private WeakReference<KeyEvent> d = null;

        g() {
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.c == null) {
                this.c = new SparseArray<>();
            }
            return this.c;
        }

        static g a(View view) {
            g gVar = (g) view.getTag(er.b.tag_unhandled_key_event_manager);
            if (gVar == null) {
                g gVar2 = new g();
                view.setTag(er.b.tag_unhandled_key_event_manager, gVar2);
                return gVar2;
            }
            return gVar;
        }

        boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                b();
            }
            View b = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    a().put(keyCode, new WeakReference<>(b));
                }
            }
            return b != null;
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.b;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View b = b(viewGroup.getChildAt(childCount), keyEvent);
                    if (b != null) {
                        return b;
                    }
                }
            }
            if (c(view, keyEvent)) {
                return view;
            }
            return null;
        }

        boolean a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.d;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.d = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> a2 = a();
                if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = a2.valueAt(indexOfKey);
                    a2.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = a2.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && hq.E(view)) {
                        c(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(er.b.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((f) arrayList.get(size)).a(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (a.isEmpty()) {
                return;
            }
            synchronized (a) {
                if (this.b == null) {
                    this.b = new WeakHashMap<>();
                }
                for (int size = a.size() - 1; size >= 0; size--) {
                    View view = a.get(size).get();
                    if (view == null) {
                        a.remove(size);
                    } else {
                        this.b.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.b.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* renamed from: hq$c */
    /* loaded from: classes3.dex */
    public static class c {
        public static hy a(View view) {
            return hy.a.a(view);
        }

        static hy a(View view, hy hyVar, Rect rect) {
            WindowInsets j = hyVar.j();
            if (j != null) {
                return hy.a(view.computeSystemWindowInsets(j, rect), view);
            }
            rect.setEmpty();
            return hyVar;
        }

        static void a(final View view, final hj hjVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(er.b.tag_on_apply_window_listener, hjVar);
            }
            if (hjVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(er.b.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: hq.c.1
                    hy a = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        hy a = hy.a(windowInsets, view2);
                        if (Build.VERSION.SDK_INT < 30) {
                            c.a(windowInsets, view);
                            if (a.equals(this.a)) {
                                return hjVar.a(view2, a).j();
                            }
                        }
                        this.a = a;
                        hy a2 = hjVar.a(view2, a);
                        if (Build.VERSION.SDK_INT >= 30) {
                            return a2.j();
                        }
                        hq.r(view2);
                        return a2.j();
                    }
                });
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(er.b.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: hq$d */
    /* loaded from: classes3.dex */
    private static class d {
        public static hy a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            hy a = hy.a(rootWindowInsets);
            a.a(a);
            a.a(view.getRootView());
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* renamed from: hq$e */
    /* loaded from: classes3.dex */
    public static class e {
        static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }
}
