package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import com.google.android.material.internal.n;
import defpackage.vu;
/* compiled from: MaterialCheckBox.java */
/* renamed from: wj  reason: default package */
/* loaded from: classes3.dex */
public class wj extends g {
    private static final int a = vu.k.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[][] b = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList c;
    private boolean d;

    public wj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vu.b.checkboxStyle);
    }

    public wj(Context context, AttributeSet attributeSet, int i) {
        super(yc.a(context, attributeSet, i, a), attributeSet, i);
        Context context2 = getContext();
        TypedArray a2 = n.a(context2, attributeSet, vu.l.MaterialCheckBox, i, a, new int[0]);
        if (a2.hasValue(vu.l.MaterialCheckBox_buttonTint)) {
            c.a(this, xa.a(context2, a2, vu.l.MaterialCheckBox_buttonTint));
        }
        this.d = a2.getBoolean(vu.l.MaterialCheckBox_useMaterialThemeColors, false);
        a2.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d && c.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.d = z;
        if (z) {
            c.a(this, getMaterialThemeColorsTintList());
        } else {
            c.a(this, (ColorStateList) null);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.c == null) {
            int[] iArr = new int[b.length];
            int a2 = wp.a(this, vu.b.colorControlActivated);
            int a3 = wp.a(this, vu.b.colorSurface);
            int a4 = wp.a(this, vu.b.colorOnSurface);
            iArr[0] = wp.a(a3, a2, 1.0f);
            iArr[1] = wp.a(a3, a4, 0.54f);
            iArr[2] = wp.a(a3, a4, 0.38f);
            iArr[3] = wp.a(a3, a4, 0.38f);
            this.c = new ColorStateList(b, iArr);
        }
        return this.c;
    }
}
