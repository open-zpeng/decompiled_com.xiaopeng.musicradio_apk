package com.xiaopeng.musicradio.usb.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class RecyclerViewFastScroller extends LinearLayout {
    private View a;
    private RecyclerView b;
    private int c;
    private boolean d;
    private ObjectAnimator e;
    private final RecyclerView.m f;

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.e = null;
        this.f = new RecyclerView.m() { // from class: com.xiaopeng.musicradio.usb.widget.RecyclerViewFastScroller.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                RecyclerViewFastScroller.this.a();
            }
        };
        a(context);
    }

    public RecyclerViewFastScroller(Context context) {
        super(context);
        this.d = false;
        this.e = null;
        this.f = new RecyclerView.m() { // from class: com.xiaopeng.musicradio.usb.widget.RecyclerViewFastScroller.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                RecyclerViewFastScroller.this.a();
            }
        };
        a(context);
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.e = null;
        this.f = new RecyclerView.m() { // from class: com.xiaopeng.musicradio.usb.widget.RecyclerViewFastScroller.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                RecyclerViewFastScroller.this.a();
            }
        };
        a(context);
    }

    protected void a(Context context) {
        if (this.d) {
            return;
        }
        this.d = true;
        setOrientation(0);
        setClipChildren(false);
    }

    public void a(int i, int i2) {
        LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, true);
        this.a = findViewById(i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = i2;
        a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (motionEvent.getX() >= this.a.getX() - hq.j(this.a)) {
                    ObjectAnimator objectAnimator = this.e;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    this.a.setSelected(true);
                    break;
                } else {
                    return false;
                }
            case 1:
            case 3:
                this.a.setSelected(false);
                return true;
            case 2:
                break;
            default:
                return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        setBubbleAndHandlePosition(y);
        setRecyclerViewPosition(y);
        return true;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.f);
            }
            this.b = recyclerView;
            if (this.b == null) {
                return;
            }
            recyclerView.addOnScrollListener(this.f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int a = recyclerView.getAdapter().a();
            float f2 = 0.0f;
            if (this.a.getY() != 0.0f) {
                float y = this.a.getY() + this.a.getHeight();
                int i = this.c;
                f2 = y >= ((float) (i + (-5))) ? 1.0f : f / i;
            }
            ((LinearLayoutManager) this.b.getLayoutManager()).b(a(0, a - 1, (int) (f2 * a)), 0);
        }
    }

    private int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.a.isSelected()) {
            return;
        }
        int computeVerticalScrollOffset = this.b.computeVerticalScrollOffset();
        int i = this.c;
        setBubbleAndHandlePosition(i * (computeVerticalScrollOffset / (this.b.computeVerticalScrollRange() - i)));
    }

    private void setBubbleAndHandlePosition(float f) {
        int height = this.a.getHeight();
        this.a.setY(a(0, this.c - height, (int) (f - (height / 2))));
    }
}
