package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.v;
import defpackage.jw;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* renamed from: jo  reason: default package */
/* loaded from: classes3.dex */
public class jo extends v {
    @Override // androidx.fragment.app.v
    public boolean a(Object obj) {
        return obj instanceof jw;
    }

    @Override // androidx.fragment.app.v
    public Object b(Object obj) {
        if (obj != null) {
            return ((jw) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.v
    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        ka kaVar = new ka();
        kaVar.a((jw) obj);
        return kaVar;
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ka kaVar = (ka) obj;
        List<View> g = kaVar.g();
        g.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a(g, arrayList.get(i));
        }
        g.add(view);
        arrayList.add(view);
        a(kaVar, arrayList);
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            a(view, rect);
            ((jw) obj).a(new jw.b() { // from class: jo.1
            });
        }
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, ArrayList<View> arrayList) {
        jw jwVar = (jw) obj;
        if (jwVar == null) {
            return;
        }
        int i = 0;
        if (jwVar instanceof ka) {
            ka kaVar = (ka) jwVar;
            int r = kaVar.r();
            while (i < r) {
                a(kaVar.b(i), arrayList);
                i++;
            }
        } else if (a(jwVar) || !a((List) jwVar.g())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                jwVar.b(arrayList.get(i));
                i++;
            }
        }
    }

    private static boolean a(jw jwVar) {
        return (a((List) jwVar.f()) && a((List) jwVar.h()) && a((List) jwVar.i())) ? false : true;
    }

    @Override // androidx.fragment.app.v
    public Object a(Object obj, Object obj2, Object obj3) {
        ka kaVar = new ka();
        if (obj != null) {
            kaVar.a((jw) obj);
        }
        if (obj2 != null) {
            kaVar.a((jw) obj2);
        }
        if (obj3 != null) {
            kaVar.a((jw) obj3);
        }
        return kaVar;
    }

    @Override // androidx.fragment.app.v
    public void b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((jw) obj).a(new jw.c() { // from class: jo.2
            @Override // defpackage.jw.c
            public void a(jw jwVar) {
            }

            @Override // defpackage.jw.c
            public void c(jw jwVar) {
            }

            @Override // defpackage.jw.c
            public void d(jw jwVar) {
            }

            @Override // defpackage.jw.c
            public void e(jw jwVar) {
            }

            @Override // defpackage.jw.c
            public void b(jw jwVar) {
                jwVar.b(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.v
    public Object b(Object obj, Object obj2, Object obj3) {
        jw jwVar = (jw) obj;
        jw jwVar2 = (jw) obj2;
        jw jwVar3 = (jw) obj3;
        if (jwVar != null && jwVar2 != null) {
            jwVar = new ka().a(jwVar).a(jwVar2).a(1);
        } else if (jwVar == null) {
            jwVar = jwVar2 != null ? jwVar2 : null;
        }
        if (jwVar3 != null) {
            ka kaVar = new ka();
            if (jwVar != null) {
                kaVar.a(jwVar);
            }
            kaVar.a(jwVar3);
            return kaVar;
        }
        return jwVar;
    }

    @Override // androidx.fragment.app.v
    public void a(ViewGroup viewGroup, Object obj) {
        jy.a(viewGroup, (jw) obj);
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((jw) obj).a(new jx() { // from class: jo.3
            @Override // defpackage.jx, defpackage.jw.c
            public void e(jw jwVar) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    jo.this.b(obj5, arrayList, (ArrayList<View>) null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    jo.this.b(obj6, arrayList2, (ArrayList<View>) null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    jo.this.b(obj7, arrayList3, (ArrayList<View>) null);
                }
            }

            @Override // defpackage.jx, defpackage.jw.c
            public void b(jw jwVar) {
                jwVar.b(this);
            }
        });
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        ka kaVar = (ka) obj;
        if (kaVar != null) {
            kaVar.g().clear();
            kaVar.g().addAll(arrayList2);
            b((Object) kaVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.v
    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        jw jwVar = (jw) obj;
        int i = 0;
        if (jwVar instanceof ka) {
            ka kaVar = (ka) jwVar;
            int r = kaVar.r();
            while (i < r) {
                b((Object) kaVar.b(i), arrayList, arrayList2);
                i++;
            }
        } else if (!a(jwVar)) {
            List<View> g = jwVar.g();
            if (g.size() == arrayList.size() && g.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    jwVar.b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    jwVar.c(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.v
    public void b(Object obj, View view) {
        if (obj != null) {
            ((jw) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.v
    public void c(Object obj, View view) {
        if (obj != null) {
            ((jw) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, final Rect rect) {
        if (obj != null) {
            ((jw) obj).a(new jw.b() { // from class: jo.4
            });
        }
    }
}
