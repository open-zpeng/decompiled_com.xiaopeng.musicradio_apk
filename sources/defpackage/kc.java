package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TransitionValues.java */
/* renamed from: kc  reason: default package */
/* loaded from: classes3.dex */
public class kc {
    public View b;
    public final Map<String, Object> a = new HashMap();
    final ArrayList<jw> c = new ArrayList<>();

    @Deprecated
    public kc() {
    }

    public kc(View view) {
        this.b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof kc) {
            kc kcVar = (kc) obj;
            return this.b == kcVar.b && this.a.equals(kcVar.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
