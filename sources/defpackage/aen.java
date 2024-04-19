package defpackage;
/* compiled from: CloneData.java */
/* renamed from: aen  reason: default package */
/* loaded from: classes2.dex */
public class aen implements Cloneable {
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
