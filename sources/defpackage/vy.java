package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import defpackage.vu;
/* compiled from: ChildrenAlphaProperty.java */
/* renamed from: vy  reason: default package */
/* loaded from: classes3.dex */
public class vy extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new vy("childrenAlpha");

    private vy(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(vu.f.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(vu.f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
