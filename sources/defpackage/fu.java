package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ParcelableCompat.java */
@Deprecated
/* renamed from: fu  reason: default package */
/* loaded from: classes3.dex */
public final class fu {
    @Deprecated
    public static <T> Parcelable.Creator<T> a(fv<T> fvVar) {
        return new a(fvVar);
    }

    /* compiled from: ParcelableCompat.java */
    /* renamed from: fu$a */
    /* loaded from: classes3.dex */
    static class a<T> implements Parcelable.ClassLoaderCreator<T> {
        private final fv<T> a;

        a(fv<T> fvVar) {
            this.a = fvVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.a.a(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.a.a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.a.a(i);
        }
    }
}
