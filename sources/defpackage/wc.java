package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MotionSpec.java */
/* renamed from: wc  reason: default package */
/* loaded from: classes3.dex */
public class wc {
    private final bl<String, wd> a = new bl<>();
    private final bl<String, PropertyValuesHolder[]> b = new bl<>();

    public boolean a(String str) {
        return this.a.get(str) != null;
    }

    public wd b(String str) {
        if (!a(str)) {
            throw new IllegalArgumentException();
        }
        return this.a.get(str);
    }

    public void a(String str, wd wdVar) {
        this.a.put(str, wdVar);
    }

    public void a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            wd valueAt = this.a.valueAt(i);
            j = Math.max(j, valueAt.a() + valueAt.b());
        }
        return j;
    }

    public static wc a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return a(context, resourceId);
    }

    public static wc a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return a(arrayList);
            }
            return null;
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    private static wc a(List<Animator> list) {
        wc wcVar = new wc();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(wcVar, list.get(i));
        }
        return wcVar;
    }

    private static void a(wc wcVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            wcVar.a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            wcVar.a(objectAnimator.getPropertyName(), wd.a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wc) {
            return this.a.equals(((wc) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
