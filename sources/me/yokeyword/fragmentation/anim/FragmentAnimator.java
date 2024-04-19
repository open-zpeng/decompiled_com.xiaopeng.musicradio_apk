package me.yokeyword.fragmentation.anim;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class FragmentAnimator implements Parcelable {
    public static final Parcelable.Creator<FragmentAnimator> CREATOR = new Parcelable.Creator<FragmentAnimator>() { // from class: me.yokeyword.fragmentation.anim.FragmentAnimator.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentAnimator createFromParcel(Parcel parcel) {
            return new FragmentAnimator(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentAnimator[] newArray(int i) {
            return new FragmentAnimator[i];
        }
    };
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FragmentAnimator() {
    }

    public FragmentAnimator(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public FragmentAnimator a() {
        return new FragmentAnimator(b(), c(), d(), e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentAnimator(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
