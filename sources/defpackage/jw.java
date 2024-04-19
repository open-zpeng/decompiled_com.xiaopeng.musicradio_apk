package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Transition.java */
/* renamed from: jw  reason: default package */
/* loaded from: classes3.dex */
public abstract class jw implements Cloneable {
    private b H;
    private bf<String, String> I;
    jz g;
    private ArrayList<kc> y;
    private ArrayList<kc> z;
    private static final int[] h = {2, 1, 3, 4};
    private static final jq i = new jq() { // from class: jw.1
        @Override // defpackage.jq
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static ThreadLocal<bf<Animator, a>> A = new ThreadLocal<>();
    private String j = getClass().getName();
    private long k = -1;
    long a = -1;
    private TimeInterpolator l = null;
    ArrayList<Integer> b = new ArrayList<>();
    ArrayList<View> c = new ArrayList<>();
    private ArrayList<String> m = null;
    private ArrayList<Class<?>> n = null;
    private ArrayList<Integer> o = null;
    private ArrayList<View> p = null;
    private ArrayList<Class<?>> q = null;
    private ArrayList<String> r = null;
    private ArrayList<Integer> s = null;
    private ArrayList<View> t = null;
    private ArrayList<Class<?>> u = null;
    private kd v = new kd();
    private kd w = new kd();
    ka d = null;
    private int[] x = h;
    private ViewGroup B = null;
    boolean e = false;
    ArrayList<Animator> f = new ArrayList<>();
    private int C = 0;
    private boolean D = false;
    private boolean E = false;
    private ArrayList<c> F = null;
    private ArrayList<Animator> G = new ArrayList<>();

    /* renamed from: J  reason: collision with root package name */
    private jq f163J = i;

    /* compiled from: Transition.java */
    /* renamed from: jw$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
    }

    /* compiled from: Transition.java */
    /* renamed from: jw$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(jw jwVar);

        void b(jw jwVar);

        void c(jw jwVar);

        void d(jw jwVar);

        void e(jw jwVar);
    }

    public Animator a(ViewGroup viewGroup, kc kcVar, kc kcVar2) {
        return null;
    }

    public abstract void a(kc kcVar);

    public String[] a() {
        return null;
    }

    public abstract void b(kc kcVar);

    public jw a(long j) {
        this.a = j;
        return this;
    }

    public long b() {
        return this.a;
    }

    public jw b(long j) {
        this.k = j;
        return this;
    }

    public long c() {
        return this.k;
    }

    public jw a(TimeInterpolator timeInterpolator) {
        this.l = timeInterpolator;
        return this;
    }

    public TimeInterpolator d() {
        return this.l;
    }

    private void a(bf<View, kc> bfVar, bf<View, kc> bfVar2) {
        kc remove;
        for (int size = bfVar.size() - 1; size >= 0; size--) {
            View keyAt = bfVar.keyAt(size);
            if (keyAt != null && a(keyAt) && (remove = bfVar2.remove(keyAt)) != null && a(remove.b)) {
                this.y.add(bfVar.removeAt(size));
                this.z.add(remove);
            }
        }
    }

    private void a(bf<View, kc> bfVar, bf<View, kc> bfVar2, bi<View> biVar, bi<View> biVar2) {
        View a2;
        int b2 = biVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            View c2 = biVar.c(i2);
            if (c2 != null && a(c2) && (a2 = biVar2.a(biVar.b(i2))) != null && a(a2)) {
                kc kcVar = bfVar.get(c2);
                kc kcVar2 = bfVar2.get(a2);
                if (kcVar != null && kcVar2 != null) {
                    this.y.add(kcVar);
                    this.z.add(kcVar2);
                    bfVar.remove(c2);
                    bfVar2.remove(a2);
                }
            }
        }
    }

    private void a(bf<View, kc> bfVar, bf<View, kc> bfVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && a(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && a(view)) {
                kc kcVar = bfVar.get(valueAt);
                kc kcVar2 = bfVar2.get(view);
                if (kcVar != null && kcVar2 != null) {
                    this.y.add(kcVar);
                    this.z.add(kcVar2);
                    bfVar.remove(valueAt);
                    bfVar2.remove(view);
                }
            }
        }
    }

    private void a(bf<View, kc> bfVar, bf<View, kc> bfVar2, bf<String, View> bfVar3, bf<String, View> bfVar4) {
        View view;
        int size = bfVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = bfVar3.valueAt(i2);
            if (valueAt != null && a(valueAt) && (view = bfVar4.get(bfVar3.keyAt(i2))) != null && a(view)) {
                kc kcVar = bfVar.get(valueAt);
                kc kcVar2 = bfVar2.get(view);
                if (kcVar != null && kcVar2 != null) {
                    this.y.add(kcVar);
                    this.z.add(kcVar2);
                    bfVar.remove(valueAt);
                    bfVar2.remove(view);
                }
            }
        }
    }

    private void b(bf<View, kc> bfVar, bf<View, kc> bfVar2) {
        for (int i2 = 0; i2 < bfVar.size(); i2++) {
            kc valueAt = bfVar.valueAt(i2);
            if (a(valueAt.b)) {
                this.y.add(valueAt);
                this.z.add(null);
            }
        }
        for (int i3 = 0; i3 < bfVar2.size(); i3++) {
            kc valueAt2 = bfVar2.valueAt(i3);
            if (a(valueAt2.b)) {
                this.z.add(valueAt2);
                this.y.add(null);
            }
        }
    }

    private void a(kd kdVar, kd kdVar2) {
        bf<View, kc> bfVar = new bf<>(kdVar.a);
        bf<View, kc> bfVar2 = new bf<>(kdVar2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.x;
            if (i2 < iArr.length) {
                switch (iArr[i2]) {
                    case 1:
                        a(bfVar, bfVar2);
                        break;
                    case 2:
                        a(bfVar, bfVar2, kdVar.d, kdVar2.d);
                        break;
                    case 3:
                        a(bfVar, bfVar2, kdVar.b, kdVar2.b);
                        break;
                    case 4:
                        a(bfVar, bfVar2, kdVar.c, kdVar2.c);
                        break;
                }
                i2++;
            } else {
                b(bfVar, bfVar2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, kd kdVar, kd kdVar2, ArrayList<kc> arrayList, ArrayList<kc> arrayList2) {
        int i2;
        int i3;
        View view;
        Animator animator;
        kc kcVar;
        long j;
        Animator animator2;
        kc kcVar2;
        bf<Animator, a> r = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            kc kcVar3 = arrayList.get(i4);
            kc kcVar4 = arrayList2.get(i4);
            if (kcVar3 != null && !kcVar3.c.contains(this)) {
                kcVar3 = null;
            }
            if (kcVar4 != null && !kcVar4.c.contains(this)) {
                kcVar4 = null;
            }
            if (kcVar3 == null && kcVar4 == null) {
                i2 = size;
                i3 = i4;
            } else if (kcVar3 == null || kcVar4 == null || a(kcVar3, kcVar4)) {
                Animator a2 = a(viewGroup, kcVar3, kcVar4);
                if (a2 != null) {
                    if (kcVar4 != null) {
                        view = kcVar4.b;
                        String[] a3 = a();
                        if (a3 != null && a3.length > 0) {
                            kcVar2 = new kc(view);
                            i2 = size;
                            kc kcVar5 = kdVar2.a.get(view);
                            if (kcVar5 != null) {
                                int i5 = 0;
                                while (i5 < a3.length) {
                                    kcVar2.a.put(a3[i5], kcVar5.a.get(a3[i5]));
                                    i5++;
                                    i4 = i4;
                                    kcVar5 = kcVar5;
                                }
                                i3 = i4;
                            } else {
                                i3 = i4;
                            }
                            int size2 = r.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = a2;
                                    break;
                                }
                                a aVar = r.get(r.keyAt(i6));
                                if (aVar.c != null && aVar.a == view && aVar.b.equals(q()) && aVar.c.equals(kcVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i2 = size;
                            i3 = i4;
                            animator2 = a2;
                            kcVar2 = null;
                        }
                        animator = animator2;
                        kcVar = kcVar2;
                    } else {
                        i2 = size;
                        i3 = i4;
                        view = kcVar3.b;
                        animator = a2;
                        kcVar = null;
                    }
                    if (animator != null) {
                        jz jzVar = this.g;
                        if (jzVar != null) {
                            long a4 = jzVar.a(viewGroup, this, kcVar3, kcVar4);
                            sparseIntArray.put(this.G.size(), (int) a4);
                            j = Math.min(a4, j2);
                        } else {
                            j = j2;
                        }
                        r.put(animator, new a(view, q(), this, km.b(viewGroup), kcVar));
                        this.G.add(animator);
                        j2 = j;
                    }
                } else {
                    i2 = size;
                    i3 = i4;
                }
            } else {
                i2 = size;
                i3 = i4;
            }
            i4 = i3 + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.G.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay((sparseIntArray.valueAt(i7) - j2) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.o;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.p;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.q;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.q.get(i2).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.r == null || hq.p(view) == null || !this.r.contains(hq.p(view))) {
                    if ((this.b.size() == 0 && this.c.size() == 0 && (((arrayList = this.n) == null || arrayList.isEmpty()) && ((arrayList2 = this.m) == null || arrayList2.isEmpty()))) || this.b.contains(Integer.valueOf(id)) || this.c.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.m;
                    if (arrayList6 == null || !arrayList6.contains(hq.p(view))) {
                        if (this.n != null) {
                            for (int i3 = 0; i3 < this.n.size(); i3++) {
                                if (this.n.get(i3).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static bf<Animator, a> r() {
        bf<Animator, a> bfVar = A.get();
        if (bfVar == null) {
            bf<Animator, a> bfVar2 = new bf<>();
            A.set(bfVar2);
            return bfVar2;
        }
        return bfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        j();
        bf<Animator, a> r = r();
        Iterator<Animator> it = this.G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (r.containsKey(next)) {
                j();
                a(next, r);
            }
        }
        this.G.clear();
        k();
    }

    private void a(Animator animator, final bf<Animator, a> bfVar) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: jw.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    jw.this.f.add(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    bfVar.remove(animator2);
                    jw.this.f.remove(animator2);
                }
            });
            a(animator);
        }
    }

    public jw b(View view) {
        this.c.add(view);
        return this;
    }

    public jw c(View view) {
        this.c.remove(view);
        return this;
    }

    public List<Integer> f() {
        return this.b;
    }

    public List<View> g() {
        return this.c;
    }

    public List<String> h() {
        return this.m;
    }

    public List<Class<?>> i() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        bf<String, String> bfVar;
        a(z);
        if ((this.b.size() > 0 || this.c.size() > 0) && (((arrayList = this.m) == null || arrayList.isEmpty()) && ((arrayList2 = this.n) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.b.get(i2).intValue());
                if (findViewById != null) {
                    kc kcVar = new kc(findViewById);
                    if (z) {
                        a(kcVar);
                    } else {
                        b(kcVar);
                    }
                    kcVar.c.add(this);
                    c(kcVar);
                    if (z) {
                        a(this.v, findViewById, kcVar);
                    } else {
                        a(this.w, findViewById, kcVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.c.size(); i3++) {
                View view = this.c.get(i3);
                kc kcVar2 = new kc(view);
                if (z) {
                    a(kcVar2);
                } else {
                    b(kcVar2);
                }
                kcVar2.c.add(this);
                c(kcVar2);
                if (z) {
                    a(this.v, view, kcVar2);
                } else {
                    a(this.w, view, kcVar2);
                }
            }
        } else {
            c(viewGroup, z);
        }
        if (z || (bfVar = this.I) == null) {
            return;
        }
        int size = bfVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(this.v.d.remove(this.I.keyAt(i4)));
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.v.d.put(this.I.valueAt(i5), view2);
            }
        }
    }

    private static void a(kd kdVar, View view, kc kcVar) {
        kdVar.a.put(view, kcVar);
        int id = view.getId();
        if (id >= 0) {
            if (kdVar.b.indexOfKey(id) >= 0) {
                kdVar.b.put(id, null);
            } else {
                kdVar.b.put(id, view);
            }
        }
        String p = hq.p(view);
        if (p != null) {
            if (kdVar.d.containsKey(p)) {
                kdVar.d.put(p, null);
            } else {
                kdVar.d.put(p, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (kdVar.c.c(itemIdAtPosition) >= 0) {
                    View a2 = kdVar.c.a(itemIdAtPosition);
                    if (a2 != null) {
                        hq.a(a2, false);
                        kdVar.c.b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                hq.a(view, true);
                kdVar.c.b(itemIdAtPosition, view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (z) {
            this.v.a.clear();
            this.v.b.clear();
            this.v.c.d();
            return;
        }
        this.w.a.clear();
        this.w.b.clear();
        this.w.c.d();
    }

    private void c(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.o;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.p;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.q;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.q.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    kc kcVar = new kc(view);
                    if (z) {
                        a(kcVar);
                    } else {
                        b(kcVar);
                    }
                    kcVar.c.add(this);
                    c(kcVar);
                    if (z) {
                        a(this.v, view, kcVar);
                    } else {
                        a(this.w, view, kcVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.s;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.t;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.u;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.u.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                c(viewGroup.getChildAt(i4), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public kc a(View view, boolean z) {
        ka kaVar = this.d;
        if (kaVar != null) {
            return kaVar.a(view, z);
        }
        return (z ? this.v : this.w).a.get(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public kc b(View view, boolean z) {
        ka kaVar = this.d;
        if (kaVar != null) {
            return kaVar.b(view, z);
        }
        ArrayList<kc> arrayList = z ? this.y : this.z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            kc kcVar = arrayList.get(i3);
            if (kcVar == null) {
                return null;
            }
            if (kcVar.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            return (z ? this.z : this.y).get(i2);
        }
        return null;
    }

    public void d(View view) {
        if (this.E) {
            return;
        }
        bf<Animator, a> r = r();
        int size = r.size();
        kw b2 = km.b(view);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            a valueAt = r.valueAt(i2);
            if (valueAt.a != null && b2.equals(valueAt.d)) {
                jk.a(r.keyAt(i2));
            }
        }
        ArrayList<c> arrayList = this.F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.F.clone();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((c) arrayList2.get(i3)).c(this);
            }
        }
        this.D = true;
    }

    public void e(View view) {
        if (this.D) {
            if (!this.E) {
                bf<Animator, a> r = r();
                int size = r.size();
                kw b2 = km.b(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    a valueAt = r.valueAt(i2);
                    if (valueAt.a != null && b2.equals(valueAt.d)) {
                        jk.b(r.keyAt(i2));
                    }
                }
                ArrayList<c> arrayList = this.F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.F.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((c) arrayList2.get(i3)).d(this);
                    }
                }
            }
            this.D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
        a aVar;
        this.y = new ArrayList<>();
        this.z = new ArrayList<>();
        a(this.v, this.w);
        bf<Animator, a> r = r();
        int size = r.size();
        kw b2 = km.b(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator keyAt = r.keyAt(i2);
            if (keyAt != null && (aVar = r.get(keyAt)) != null && aVar.a != null && b2.equals(aVar.d)) {
                kc kcVar = aVar.c;
                View view = aVar.a;
                kc a2 = a(view, true);
                kc b3 = b(view, true);
                if (a2 == null && b3 == null) {
                    b3 = this.w.a.get(view);
                }
                if (!(a2 == null && b3 == null) && aVar.e.a(kcVar, b3)) {
                    if (keyAt.isRunning() || keyAt.isStarted()) {
                        keyAt.cancel();
                    } else {
                        r.remove(keyAt);
                    }
                }
            }
        }
        a(viewGroup, this.v, this.w, this.y, this.z);
        e();
    }

    public boolean a(kc kcVar, kc kcVar2) {
        if (kcVar == null || kcVar2 == null) {
            return false;
        }
        String[] a2 = a();
        if (a2 != null) {
            for (String str : a2) {
                if (a(kcVar, kcVar2, str)) {
                    return true;
                }
            }
            return false;
        }
        for (String str2 : kcVar.a.keySet()) {
            if (a(kcVar, kcVar2, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(kc kcVar, kc kcVar2, String str) {
        Object obj = kcVar.a.get(str);
        Object obj2 = kcVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    protected void a(Animator animator) {
        if (animator == null) {
            k();
            return;
        }
        if (b() >= 0) {
            animator.setDuration(b());
        }
        if (c() >= 0) {
            animator.setStartDelay(c() + animator.getStartDelay());
        }
        if (d() != null) {
            animator.setInterpolator(d());
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: jw.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                jw.this.k();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        if (this.C == 0) {
            ArrayList<c> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).e(this);
                }
            }
            this.E = false;
        }
        this.C++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        this.C--;
        if (this.C == 0) {
            ArrayList<c> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).b(this);
                }
            }
            for (int i3 = 0; i3 < this.v.c.b(); i3++) {
                View c2 = this.v.c.c(i3);
                if (c2 != null) {
                    hq.a(c2, false);
                }
            }
            for (int i4 = 0; i4 < this.w.c.b(); i4++) {
                View c3 = this.w.c.c(i4);
                if (c3 != null) {
                    hq.a(c3, false);
                }
            }
            this.E = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            this.f.get(size).cancel();
        }
        ArrayList<c> arrayList = this.F;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.F.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((c) arrayList2.get(i2)).a(this);
        }
    }

    public jw a(c cVar) {
        if (this.F == null) {
            this.F = new ArrayList<>();
        }
        this.F.add(cVar);
        return this;
    }

    public jw b(c cVar) {
        ArrayList<c> arrayList = this.F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.F.size() == 0) {
            this.F = null;
        }
        return this;
    }

    public void a(jq jqVar) {
        if (jqVar == null) {
            this.f163J = i;
        } else {
            this.f163J = jqVar;
        }
    }

    public jq m() {
        return this.f163J;
    }

    public void a(b bVar) {
        this.H = bVar;
    }

    public b n() {
        return this.H;
    }

    public void a(jz jzVar) {
        this.g = jzVar;
    }

    public jz o() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(kc kcVar) {
        String[] a2;
        if (this.g == null || kcVar.a.isEmpty() || (a2 = this.g.a()) == null) {
            return;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= a2.length) {
                z = true;
                break;
            } else if (!kcVar.a.containsKey(a2[i2])) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return;
        }
        this.g.a(kcVar);
    }

    public String toString() {
        return a("");
    }

    @Override // 
    /* renamed from: p */
    public jw clone() {
        try {
            jw jwVar = (jw) super.clone();
            jwVar.G = new ArrayList<>();
            jwVar.v = new kd();
            jwVar.w = new kd();
            jwVar.y = null;
            jwVar.z = null;
            return jwVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String q() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.a != -1) {
            str2 = str2 + "dur(" + this.a + ") ";
        }
        if (this.k != -1) {
            str2 = str2 + "dly(" + this.k + ") ";
        }
        if (this.l != null) {
            str2 = str2 + "interp(" + this.l + ") ";
        }
        if (this.b.size() > 0 || this.c.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.b.size() > 0) {
                String str4 = str3;
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    if (i2 > 0) {
                        str4 = str4 + ", ";
                    }
                    str4 = str4 + this.b.get(i2);
                }
                str3 = str4;
            }
            if (this.c.size() > 0) {
                for (int i3 = 0; i3 < this.c.size(); i3++) {
                    if (i3 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.c.get(i3);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.java */
    /* renamed from: jw$a */
    /* loaded from: classes3.dex */
    public static class a {
        View a;
        String b;
        kc c;
        kw d;
        jw e;

        a(View view, String str, jw jwVar, kw kwVar, kc kcVar) {
            this.a = view;
            this.b = str;
            this.c = kcVar;
            this.d = kwVar;
            this.e = jwVar;
        }
    }
}
