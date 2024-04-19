package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;
import defpackage.em;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ViewTransition.java */
/* renamed from: eo  reason: default package */
/* loaded from: classes3.dex */
public class eo {
    private static String e = "ViewTransition";
    int a;
    ea b;
    d.a c;
    Context d;
    private int f;
    private int l;
    private String m;
    private int g = -1;
    private boolean h = false;
    private int i = 0;
    private int j = -1;
    private int k = -1;
    private int n = 0;
    private String o = null;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private int t = -1;
    private int u = -1;
    private int v = -1;
    private int w = -1;

    public int a() {
        return this.g;
    }

    public int b() {
        return this.u;
    }

    public int c() {
        return this.v;
    }

    public String toString() {
        return "ViewTransition(" + du.a(this.d, this.f) + ")";
    }

    Interpolator a(Context context) {
        switch (this.n) {
            case -2:
                return AnimationUtils.loadInterpolator(context, this.p);
            case -1:
                final by a2 = by.a(this.o);
                return new Interpolator() { // from class: eo.1
                    @Override // android.animation.TimeInterpolator
                    public float getInterpolation(float f) {
                        return (float) a2.a(f);
                    }
                };
            case 0:
                return new AccelerateDecelerateInterpolator();
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return null;
            case 4:
                return new BounceInterpolator();
            case 5:
                return new OvershootInterpolator();
            case 6:
                return new AnticipateInterpolator();
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public eo(Context context, XmlPullParser xmlPullParser) {
        this.d = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType != 0) {
                    switch (eventType) {
                        case 2:
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1239391468:
                                    if (name.equals("KeyFrameSet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 61998586:
                                    if (name.equals("ViewTransition")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    a(context, xmlPullParser);
                                    continue;
                                case 1:
                                    this.b = new ea(context, xmlPullParser);
                                    continue;
                                case 2:
                                    this.c = d.b(context, xmlPullParser);
                                    continue;
                                case 3:
                                case 4:
                                    androidx.constraintlayout.widget.a.a(context, xmlPullParser, this.c.g);
                                    continue;
                                default:
                                    Log.e(e, du.b() + " unknown tag " + name);
                                    Log.e(e, ".xml:" + xmlPullParser.getLineNumber());
                                    continue;
                                    continue;
                            }
                        case 3:
                            if ("ViewTransition".equals(xmlPullParser.getName())) {
                                return;
                            }
                            continue;
                        default:
                            continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    private void a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.b.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == h.b.ViewTransition_android_id) {
                this.f = obtainStyledAttributes.getResourceId(index, this.f);
            } else if (index == h.b.ViewTransition_motionTarget) {
                if (ek.a) {
                    this.l = obtainStyledAttributes.getResourceId(index, this.l);
                    if (this.l == -1) {
                        this.m = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.m = obtainStyledAttributes.getString(index);
                } else {
                    this.l = obtainStyledAttributes.getResourceId(index, this.l);
                }
            } else if (index == h.b.ViewTransition_onStateTransition) {
                this.g = obtainStyledAttributes.getInt(index, this.g);
            } else if (index == h.b.ViewTransition_transitionDisable) {
                this.h = obtainStyledAttributes.getBoolean(index, this.h);
            } else if (index == h.b.ViewTransition_pathMotionArc) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == h.b.ViewTransition_duration) {
                this.j = obtainStyledAttributes.getInt(index, this.j);
            } else if (index == h.b.ViewTransition_upDuration) {
                this.k = obtainStyledAttributes.getInt(index, this.k);
            } else if (index == h.b.ViewTransition_viewTransitionMode) {
                this.a = obtainStyledAttributes.getInt(index, this.a);
            } else if (index == h.b.ViewTransition_motionInterpolator) {
                TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                if (peekValue.type == 1) {
                    this.p = obtainStyledAttributes.getResourceId(index, -1);
                    if (this.p != -1) {
                        this.n = -2;
                    }
                } else if (peekValue.type == 3) {
                    this.o = obtainStyledAttributes.getString(index);
                    String str = this.o;
                    if (str != null && str.indexOf("/") > 0) {
                        this.p = obtainStyledAttributes.getResourceId(index, -1);
                        this.n = -2;
                    } else {
                        this.n = -1;
                    }
                } else {
                    this.n = obtainStyledAttributes.getInteger(index, this.n);
                }
            } else if (index == h.b.ViewTransition_setsTag) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == h.b.ViewTransition_clearsTag) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == h.b.ViewTransition_ifTagSet) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == h.b.ViewTransition_ifTagNotSet) {
                this.t = obtainStyledAttributes.getResourceId(index, this.t);
            } else if (index == h.b.ViewTransition_SharedValueId) {
                this.v = obtainStyledAttributes.getResourceId(index, this.v);
            } else if (index == h.b.ViewTransition_SharedValue) {
                this.u = obtainStyledAttributes.getInteger(index, this.u);
            }
        }
        obtainStyledAttributes.recycle();
    }

    void a(ep epVar, ek ekVar, View view) {
        eg egVar = new eg(view);
        egVar.c(view);
        this.b.a(egVar);
        egVar.a(ekVar.getWidth(), ekVar.getHeight(), this.j, System.nanoTime());
        new a(epVar, egVar, this.j, this.k, this.g, a(ekVar.getContext()), this.q, this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTransition.java */
    /* renamed from: eo$a */
    /* loaded from: classes3.dex */
    public static class a {
        eg b;
        int c;
        int d;
        ep f;
        Interpolator g;
        float i;
        float j;
        boolean m;
        private final int n;
        private final int o;
        bz e = new bz();
        boolean h = false;
        Rect l = new Rect();
        long a = System.nanoTime();
        long k = this.a;

        a(ep epVar, eg egVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.m = false;
            this.f = epVar;
            this.b = egVar;
            this.c = i;
            this.d = i2;
            this.f.a(this);
            this.g = interpolator;
            this.n = i4;
            this.o = i5;
            if (i3 == 3) {
                this.m = true;
            }
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            a();
        }

        void a(boolean z) {
            int i;
            this.h = z;
            if (this.h && (i = this.d) != -1) {
                this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f.b();
            this.k = System.nanoTime();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            if (this.h) {
                b();
            } else {
                c();
            }
        }

        void b() {
            long nanoTime = System.nanoTime();
            this.k = nanoTime;
            this.i -= ((float) ((nanoTime - this.k) * 1.0E-6d)) * this.j;
            if (this.i < 0.0f) {
                this.i = 0.0f;
            }
            Interpolator interpolator = this.g;
            float interpolation = interpolator == null ? this.i : interpolator.getInterpolation(this.i);
            eg egVar = this.b;
            boolean a = egVar.a(egVar.b, interpolation, nanoTime, this.e);
            if (this.i <= 0.0f) {
                if (this.n != -1) {
                    this.b.f().setTag(this.n, Long.valueOf(System.nanoTime()));
                }
                if (this.o != -1) {
                    this.b.f().setTag(this.o, null);
                }
                this.f.b(this);
            }
            if (this.i > 0.0f || a) {
                this.f.b();
            }
        }

        void c() {
            long nanoTime = System.nanoTime();
            this.k = nanoTime;
            this.i += ((float) ((nanoTime - this.k) * 1.0E-6d)) * this.j;
            if (this.i >= 1.0f) {
                this.i = 1.0f;
            }
            Interpolator interpolator = this.g;
            float interpolation = interpolator == null ? this.i : interpolator.getInterpolation(this.i);
            eg egVar = this.b;
            boolean a = egVar.a(egVar.b, interpolation, nanoTime, this.e);
            if (this.i >= 1.0f) {
                if (this.n != -1) {
                    this.b.f().setTag(this.n, Long.valueOf(System.nanoTime()));
                }
                if (this.o != -1) {
                    this.b.f().setTag(this.o, null);
                }
                if (!this.m) {
                    this.f.b(this);
                }
            }
            if (this.i < 1.0f || a) {
                this.f.b();
            }
        }

        public void a(int i, float f, float f2) {
            switch (i) {
                case 1:
                    if (this.h) {
                        return;
                    }
                    a(true);
                    return;
                case 2:
                    this.b.f().getHitRect(this.l);
                    if (this.l.contains((int) f, (int) f2) || this.h) {
                        return;
                    }
                    a(true);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ep epVar, ek ekVar, int i, d dVar, final View... viewArr) {
        int[] constraintSetIds;
        if (this.h) {
            return;
        }
        int i2 = this.a;
        if (i2 == 2) {
            a(epVar, ekVar, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : ekVar.getConstraintSetIds()) {
                if (i3 != i) {
                    d c = ekVar.c(i3);
                    for (View view : viewArr) {
                        d.a f = c.f(view.getId());
                        d.a aVar = this.c;
                        if (aVar != null) {
                            aVar.a(f);
                            f.g.putAll(this.c.g);
                        }
                    }
                }
            }
        }
        d dVar2 = new d();
        dVar2.c(dVar);
        for (View view2 : viewArr) {
            d.a f2 = dVar2.f(view2.getId());
            d.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.a(f2);
                f2.g.putAll(this.c.g);
            }
        }
        ekVar.a(i, dVar2);
        ekVar.a(h.a.view_transition, dVar);
        ekVar.setState(h.a.view_transition, -1, -1);
        em.a aVar3 = new em.a(-1, ekVar.b, h.a.view_transition, i);
        for (View view3 : viewArr) {
            a(aVar3, view3);
        }
        ekVar.setTransition(aVar3);
        ekVar.a(new Runnable() { // from class: -$$Lambda$eo$DY_1ffpjh3RfImJdDsYfrWdMMe4
            @Override // java.lang.Runnable
            public final void run() {
                eo.this.a(viewArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View[] viewArr) {
        if (this.q != -1) {
            for (View view : viewArr) {
                view.setTag(this.q, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.r != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.r, null);
            }
        }
    }

    private void a(em.a aVar, View view) {
        int i = this.j;
        if (i != -1) {
            aVar.a(i);
        }
        aVar.b(this.i);
        aVar.a(this.n, this.o, this.p);
        int id = view.getId();
        ea eaVar = this.b;
        if (eaVar != null) {
            ArrayList<dx> a2 = eaVar.a(-1);
            ea eaVar2 = new ea();
            Iterator<dx> it = a2.iterator();
            while (it.hasNext()) {
                eaVar2.a(it.next().clone().a(id));
            }
            aVar.a(eaVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if (!(this.l == -1 && this.m == null) && b(view)) {
            if (view.getId() == this.l) {
                return true;
            }
            return this.m != null && (view.getLayoutParams() instanceof ConstraintLayout.a) && (str = ((ConstraintLayout.a) view.getLayoutParams()).ab) != null && str.matches(this.m);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i) {
        int i2 = this.g;
        return i2 == 1 ? i == 0 : i2 == 2 ? i == 1 : i2 == 3 && i == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view) {
        int i = this.s;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.t;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }
}
