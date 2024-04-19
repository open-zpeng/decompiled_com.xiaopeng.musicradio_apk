package com.xiaopeng.lib.libview.observablescrollview;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.List;
/* loaded from: classes.dex */
public class ObservableScrollView extends ScrollView {
    private int a;
    private int b;
    private a c;
    private List<a> d;
    private b e;
    private boolean f;
    private boolean g;
    private boolean h;
    private MotionEvent i;
    private ViewGroup j;
    private boolean k;

    @Override // android.widget.ScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.a = savedState.a;
        this.b = savedState.b;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.widget.ScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.a;
        savedState.b = this.b;
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (b()) {
            return;
        }
        this.b = i2;
        a(i2, this.f, this.g);
        if (this.f) {
            this.f = false;
        }
        int i5 = this.a;
        if (i5 < i2) {
            this.e = b.UP;
        } else if (i2 < i5) {
            this.e = b.DOWN;
        }
        this.a = i2;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (b()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = true;
            this.f = true;
            a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (b()) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getActionMasked()) {
            case 1:
            case 3:
                this.h = false;
                this.g = false;
                a(this.e);
                break;
            case 2:
                if (this.i == null) {
                    this.i = motionEvent;
                }
                float y = motionEvent.getY() - this.i.getY();
                this.i = MotionEvent.obtainNoHistory(motionEvent);
                if (getCurrentScrollY() - y <= 0.0f) {
                    if (this.h) {
                        return false;
                    }
                    final ViewGroup viewGroup = this.j;
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
                        this.h = true;
                        obtainNoHistory.setAction(0);
                        post(new Runnable() { // from class: com.xiaopeng.lib.libview.observablescrollview.ObservableScrollView.1
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
        this.c = aVar;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.j = viewGroup;
    }

    public int getCurrentScrollY() {
        return this.b;
    }

    private void a() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
        if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).a();
            }
        }
    }

    private void a(int i, boolean z, boolean z2) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(i, z, z2);
        }
        if (this.d != null) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                this.d.get(i2).a(i, z, z2);
            }
        }
    }

    private void a(b bVar) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(bVar);
        }
        if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).a(bVar);
            }
        }
    }

    private boolean b() {
        return this.k && this.c == null && this.d == null;
    }

    public void setCheckCallbacks(boolean z) {
        this.k = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.xiaopeng.lib.libview.observablescrollview.ObservableScrollView.SavedState.1
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
        int a;
        int b;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }
    }
}
