package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;
/* compiled from: ComplexColorCompat.java */
/* renamed from: ex  reason: default package */
/* loaded from: classes3.dex */
public final class ex {
    private final Shader a;
    private final ColorStateList b;
    private int c;

    private ex(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    static ex a(Shader shader) {
        return new ex(shader, null, 0);
    }

    static ex a(ColorStateList colorStateList) {
        return new ex(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ex a(int i) {
        return new ex(null, null, i);
    }

    public Shader a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public void b(int i) {
        this.c = i;
    }

    public boolean c() {
        return this.a != null;
    }

    public boolean d() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean a(int[] iArr) {
        if (d()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        return c() || this.c != 0;
    }

    public static ex a(Resources resources, int i, Resources.Theme theme) {
        try {
            return b(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r1.equals("gradient") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.ex b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r7)
        L8:
            int r1 = r7.next()
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L13
            if (r1 == r2) goto L13
            goto L8
        L13:
            if (r1 != r3) goto L70
            java.lang.String r1 = r7.getName()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 89650992(0x557f730, float:1.01546526E-35)
            if (r4 == r5) goto L33
            r2 = 1191572447(0x4705f3df, float:34291.87)
            if (r4 == r2) goto L29
            goto L3c
        L29:
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L3c
            r2 = 0
            goto L3d
        L33:
            java.lang.String r4 = "gradient"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            r2 = r3
        L3d:
            switch(r2) {
                case 0: goto L67;
                case 1: goto L5e;
                default: goto L40;
            }
        L40:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r8.append(r7)
            java.lang.String r7 = ": unsupported complex color tag "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L5e:
            android.graphics.Shader r6 = defpackage.ez.a(r6, r7, r0, r8)
            ex r6 = a(r6)
            return r6
        L67:
            android.content.res.ColorStateList r6 = defpackage.ew.a(r6, r7, r0, r8)
            ex r6 = a(r6)
            return r6
        L70:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.b(android.content.res.Resources, int, android.content.res.Resources$Theme):ex");
    }
}
