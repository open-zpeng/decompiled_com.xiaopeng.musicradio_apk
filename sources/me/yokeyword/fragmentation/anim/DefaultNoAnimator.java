package me.yokeyword.fragmentation.anim;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class DefaultNoAnimator extends FragmentAnimator implements Parcelable {
    public static final Parcelable.Creator<DefaultNoAnimator> CREATOR = new Parcelable.Creator<DefaultNoAnimator>() { // from class: me.yokeyword.fragmentation.anim.DefaultNoAnimator.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DefaultNoAnimator createFromParcel(Parcel parcel) {
            return new DefaultNoAnimator(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DefaultNoAnimator[] newArray(int i) {
            return new DefaultNoAnimator[i];
        }
    };

    @Override // me.yokeyword.fragmentation.anim.FragmentAnimator, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DefaultNoAnimator() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    protected DefaultNoAnimator(Parcel parcel) {
        super(parcel);
    }

    @Override // me.yokeyword.fragmentation.anim.FragmentAnimator, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
