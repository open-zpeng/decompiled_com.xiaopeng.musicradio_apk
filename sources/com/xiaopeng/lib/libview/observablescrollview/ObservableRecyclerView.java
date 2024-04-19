package com.xiaopeng.lib.libview.observablescrollview;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes.dex */
public class ObservableRecyclerView extends RecyclerView {
    private static int a = 22;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private SparseIntArray g;
    private a h;
    private List<a> i;
    private b j;
    private boolean k;
    private boolean l;
    private boolean m;
    private MotionEvent n;
    private ViewGroup o;
    private boolean p;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.b = savedState.a;
        this.c = savedState.b;
        this.d = savedState.c;
        this.e = savedState.d;
        this.f = savedState.e;
        this.g = savedState.f;
        super.onRestoreInstanceState(savedState.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.b;
        savedState.b = this.c;
        savedState.c = this.d;
        savedState.d = this.e;
        savedState.e = this.f;
        savedState.f = this.g;
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        int height;
        int i6;
        int height2;
        super.onScrollChanged(i, i2, i3, i4);
        if (!b() && getChildCount() > 0) {
            int childAdapterPosition = getChildAdapterPosition(getChildAt(0));
            int childAdapterPosition2 = getChildAdapterPosition(getChildAt(getChildCount() - 1));
            int i7 = 0;
            int i8 = childAdapterPosition;
            while (i8 <= childAdapterPosition2) {
                View childAt = getChildAt(i7);
                this.g.put(i8, (childAt == null || (this.g.indexOfKey(i8) >= 0 && childAt.getHeight() == this.g.get(i8))) ? 0 : childAt.getHeight());
                i8++;
                i7++;
            }
            View childAt2 = getChildAt(0);
            if (childAt2 != null) {
                int i9 = this.b;
                if (i9 < childAdapterPosition) {
                    if (childAdapterPosition - i9 != 1) {
                        i6 = 0;
                        for (int i10 = childAdapterPosition - 1; i10 > this.b; i10--) {
                            if (this.g.indexOfKey(i10) > 0) {
                                if (this.g.get(i10) == 0) {
                                    height2 = childAt2.getHeight();
                                } else {
                                    height2 = this.g.get(i10);
                                }
                            } else {
                                height2 = childAt2.getHeight();
                            }
                            i6 += height2;
                        }
                    } else {
                        i6 = 0;
                    }
                    this.d += this.c + i6;
                    this.c = childAt2.getHeight();
                } else if (childAdapterPosition < i9) {
                    if (i9 - childAdapterPosition != 1) {
                        i5 = 0;
                        for (int i11 = i9 - 1; i11 > childAdapterPosition; i11--) {
                            if (this.g.indexOfKey(i11) > 0) {
                                if (this.g.get(i11) == 0) {
                                    height = childAt2.getHeight();
                                } else {
                                    height = this.g.get(i11);
                                }
                            } else {
                                height = childAt2.getHeight();
                            }
                            i5 += height;
                        }
                    } else {
                        i5 = 0;
                    }
                    this.d -= childAt2.getHeight() + i5;
                    this.c = childAt2.getHeight();
                } else if (childAdapterPosition == 0) {
                    this.c = childAt2.getHeight();
                    this.d = 0;
                }
                if (this.c < 0) {
                    this.c = 0;
                }
                this.f = (this.d - childAt2.getTop()) + getPaddingTop();
                Log.d("ObservableRecyclerView", "mScrollY=" + this.f + " mPrevScrolledChildrenHeight=" + this.d + " firstVisiblePosition=" + childAdapterPosition + " firstVisibleChild.getTop()=" + childAt2.getTop() + " getPaddingTop()=" + getPaddingTop() + " mPrevFirstVisibleChildHeight=" + this.c);
                this.b = childAdapterPosition;
                a(this.f, this.k, this.l);
                if (this.k) {
                    this.k = false;
                }
                int i12 = this.e;
                int i13 = this.f;
                if (i12 < i13) {
                    this.j = b.UP;
                } else if (i13 < i12) {
                    this.j = b.DOWN;
                } else {
                    this.j = b.STOP;
                }
                this.e = this.f;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (b()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            this.l = true;
            this.k = true;
            a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (b()) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getActionMasked()) {
            case 1:
            case 3:
                this.m = false;
                this.l = false;
                a(this.j);
                break;
            case 2:
                if (this.n == null) {
                    this.n = motionEvent;
                }
                float y = motionEvent.getY() - this.n.getY();
                this.n = MotionEvent.obtainNoHistory(motionEvent);
                if (getCurrentScrollY() - y <= 0.0f) {
                    if (this.m) {
                        return false;
                    }
                    final ViewGroup viewGroup = this.o;
                    if (viewGroup == null) {
                        viewGroup = (ViewGroup) getParent();
                    }
                    float f = 0.0f;
                    float f2 = 0.0f;
                    for (View view = this; view != null && view != viewGroup; view = (View) view.getParent()) {
                        f += view.getLeft() - view.getScrollX();
                        f2 += view.getTop() - view.getScrollY();
                    }
                    final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    obtainNoHistory.offsetLocation(f, f2);
                    if (viewGroup.onInterceptTouchEvent(obtainNoHistory)) {
                        this.m = true;
                        obtainNoHistory.setAction(0);
                        post(new Runnable() { // from class: com.xiaopeng.lib.libview.observablescrollview.ObservableRecyclerView.1
                            @Override // java.lang.Runnable
                            public void run() {
                                viewGroup.dispatchTouchEvent(obtainNoHistory);
                            }
                        });
                        return false;
                    }
                    return super.onTouchEvent(motionEvent);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollViewCallbacks(a aVar) {
        this.h = aVar;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.o = viewGroup;
    }

    public int getCurrentScrollY() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getChildAdapterPosition(View view) {
        if (22 <= a) {
            return super.getChildAdapterPosition(view);
        }
        return getChildPosition(view);
    }

    private void a() {
        a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
        if (this.i != null) {
            for (int i = 0; i < this.i.size(); i++) {
                this.i.get(i).a();
            }
        }
    }

    private void a(int i, boolean z, boolean z2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.a(i, z, z2);
        }
        if (this.i != null) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                this.i.get(i2).a(i, z, z2);
            }
        }
    }

    private void a(b bVar) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.a(bVar);
        }
        if (this.i != null) {
            for (int i = 0; i < this.i.size(); i++) {
                this.i.get(i).a(bVar);
            }
        }
    }

    private boolean b() {
        return this.p && this.h == null && this.i == null;
    }

    public void setCheckCallbacks(boolean z) {
        this.p = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        int a;
        int b;
        int c;
        int d;
        int e;
        SparseIntArray f;
        Parcelable g;
        public static final SavedState EMPTY_STATE = new SavedState() { // from class: com.xiaopeng.lib.libview.observablescrollview.ObservableRecyclerView.SavedState.1
        };
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.xiaopeng.lib.libview.observablescrollview.ObservableRecyclerView.SavedState.2
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private SavedState() {
            this.b = -1;
            this.g = null;
        }

        SavedState(Parcelable parcelable) {
            this.b = -1;
            this.g = parcelable == EMPTY_STATE ? null : parcelable;
        }

        private SavedState(Parcel parcel) {
            this.b = -1;
            Parcelable readParcelable = parcel.readParcelable(RecyclerView.class.getClassLoader());
            this.g = readParcelable == null ? EMPTY_STATE : readParcelable;
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = new SparseIntArray();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                for (int i = 0; i < readInt; i++) {
                    this.f.put(parcel.readInt(), parcel.readInt());
                }
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.g, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            SparseIntArray sparseIntArray = this.f;
            int size = sparseIntArray == null ? 0 : sparseIntArray.size();
            parcel.writeInt(size);
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    parcel.writeInt(this.f.keyAt(i2));
                    parcel.writeInt(this.f.valueAt(i2));
                }
            }
        }

        public Parcelable a() {
            return this.g;
        }
    }
}
