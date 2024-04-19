package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.view.XView;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class AVLoadingIndicatorView extends XView implements bal, ThemeWatcher.OnThemeSwitchListener, com.xiaopeng.musicradio.commonui.lifecycle.a {
    int a;
    int b;
    int c;
    int d;
    private bek e;
    private long f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final Runnable l;
    private final Runnable m;
    private bej n;
    private int o;
    private int p;
    private boolean q;

    public void f() {
    }

    @p(a = f.a.ON_CREATE)
    public void onCreate(i iVar) {
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.a
    @p(a = f.a.ON_DESTROY)
    public void onDestroy(i iVar) {
    }

    @p(a = f.a.ON_START)
    public void onStart(i iVar) {
    }

    @p(a = f.a.ON_STOP)
    public void onStop(i iVar) {
    }

    @p(a = f.a.ON_RESUME)
    public void onResume(i iVar) {
        LogUtils.i("AVLoadingIndicatorView", "onResume " + this.j);
        this.k = true;
        if (this.j) {
            d();
        }
        h();
    }

    @p(a = f.a.ON_PAUSE)
    public void onPause(i iVar) {
        LogUtils.i("AVLoadingIndicatorView", "onPause " + this.j);
        this.k = false;
        boolean z = this.j;
        e();
        this.j = z;
        h();
    }

    /* loaded from: classes2.dex */
    private static class a implements Runnable {
        private boolean a;
        private WeakReference<AVLoadingIndicatorView> b;

        a(boolean z, AVLoadingIndicatorView aVLoadingIndicatorView) {
            this.a = z;
            this.b = new WeakReference<>(aVLoadingIndicatorView);
        }

        @Override // java.lang.Runnable
        public void run() {
            AVLoadingIndicatorView aVLoadingIndicatorView = this.b.get();
            if (aVLoadingIndicatorView != null) {
                if (this.a) {
                    aVLoadingIndicatorView.h = false;
                    if (aVLoadingIndicatorView.i) {
                        return;
                    }
                    aVLoadingIndicatorView.f = System.currentTimeMillis();
                    aVLoadingIndicatorView.setVisibility(0);
                    aVLoadingIndicatorView.d();
                    return;
                }
                aVLoadingIndicatorView.g = false;
                aVLoadingIndicatorView.f = -1L;
                aVLoadingIndicatorView.setVisibility(4);
                aVLoadingIndicatorView.e();
            }
        }
    }

    public AVLoadingIndicatorView(Context context) {
        super(context);
        this.e = new bek();
        this.f = -1L;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = new a(false, this);
        this.m = new a(true, this);
        a(context, null, 0, 0);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new bek();
        this.f = -1L;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = new a(false, this);
        this.m = new a(true, this);
        a(context, attributeSet, 0, f.i.AVLoadingIndicatorView);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new bek();
        this.f = -1L;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = new a(false, this);
        this.m = new a(true, this);
        a(context, attributeSet, i, f.i.AVLoadingIndicatorView);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = 24;
        this.b = 48;
        this.c = 24;
        this.d = 48;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.AVLoadingIndicatorView, i, i2);
        this.a = obtainStyledAttributes.getDimensionPixelSize(f.j.AVLoadingIndicatorView_minWidth, this.a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(f.j.AVLoadingIndicatorView_maxWidth, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(f.j.AVLoadingIndicatorView_minHeight, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(f.j.AVLoadingIndicatorView_maxHeight, this.d);
        obtainStyledAttributes.getString(f.j.AVLoadingIndicatorView_indicatorName);
        this.o = obtainStyledAttributes.getResourceId(f.j.AVLoadingIndicatorView_indicatorColor, 0);
        this.p = obtainStyledAttributes.getColor(f.j.AVLoadingIndicatorView_indicatorColor, -1);
        if (this.n == null) {
            setIndicator(this.e);
        }
        if (baj.a().d()) {
            applyTheme();
        }
        obtainStyledAttributes.recycle();
    }

    public bej getIndicator() {
        return this.n;
    }

    public void setIndicator(bej bejVar) {
        bej bejVar2 = this.n;
        if (bejVar2 != bejVar) {
            if (bejVar2 != null) {
                bejVar2.setCallback(null);
                unscheduleDrawable(this.n);
            }
            this.n = bejVar;
            bej bejVar3 = this.n;
            if (bejVar3 != null) {
                bejVar3.a(this.p);
            }
            if (bejVar != null) {
                bejVar.setCallback(this);
            }
            postInvalidate();
        }
    }

    public void setIndicatorColor(int i) {
        this.o = 0;
        this.p = i;
        this.n.a(i);
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.contains(".")) {
            sb.append(getClass().getPackage().getName());
            sb.append(".indicators");
            sb.append(".");
        }
        sb.append(str);
        try {
            setIndicator((bej) Class.forName(sb.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e("AVLoadingIndicatorView", "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        }
    }

    public void a() {
        setVisibility(0);
        this.k = true;
        d();
    }

    public void b() {
        setVisibility(4);
        e();
    }

    public void c() {
        this.i = true;
        removeCallbacks(this.m);
        this.h = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f;
        long j2 = currentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(4);
            e();
        } else if (this.g) {
        } else {
            removeCallbacks(this.l);
            postDelayed(this.l, 500 - j2);
            this.g = true;
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public void d() {
        if (getVisibility() != 0) {
            return;
        }
        this.j = true;
        if (this.k) {
            bej bejVar = this.n;
            if (bejVar != null) {
                if (bejVar.isRunning()) {
                    return;
                }
                this.q = true;
                this.n.start();
            }
            postInvalidate();
        }
    }

    public void e() {
        this.j = false;
        bej bejVar = this.n;
        if (bejVar != null) {
            bejVar.stop();
            this.q = false;
        }
        postInvalidate();
    }

    @Override // com.xiaopeng.xui.view.XView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (verifyDrawable(drawable)) {
            Rect bounds = drawable.getBounds();
            int scrollX = getScrollX() + getPaddingLeft();
            int scrollY = getScrollY() + getPaddingTop();
            invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
            return;
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        a(i, i2);
    }

    private void a(int i, int i2) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        bej bejVar = this.n;
        if (bejVar != null) {
            float intrinsicWidth = bejVar.getIntrinsicWidth() / this.n.getIntrinsicHeight();
            float f = paddingRight / paddingTop;
            if (intrinsicWidth != f) {
                if (f > intrinsicWidth) {
                    paddingRight += 0;
                } else {
                    paddingTop += 0;
                }
            }
            this.n.setBounds(0, 0, paddingRight, paddingTop);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
    }

    void a(Canvas canvas) {
        bej bejVar = this.n;
        if (bejVar != null) {
            int save = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            bejVar.draw(canvas);
            canvas.restoreToCount(save);
            if (this.q && (bejVar instanceof Animatable)) {
                bejVar.start();
                this.q = false;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Drawable background = getBackground();
        bej bejVar = this.n;
        if (background != null) {
            int max = Math.max(this.a, background.getIntrinsicWidth());
            i4 = Math.max(this.c, background.getIntrinsicHeight());
            i3 = max;
        } else if (bejVar != null) {
            i3 = Math.max(this.a, Math.min(this.b, bejVar.getIntrinsicWidth()));
            i4 = Math.max(this.c, Math.min(this.d, bejVar.getIntrinsicHeight()));
        } else {
            i3 = 0;
            i4 = 0;
        }
        g();
        setMeasuredDimension(resolveSizeAndState(i3 + getPaddingLeft() + getPaddingRight(), i, 0), resolveSizeAndState(i4 + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        g();
    }

    private void g() {
        int[] drawableState = getDrawableState();
        bej bejVar = this.n;
        if (bejVar == null || !bejVar.isStateful()) {
            return;
        }
        this.n.setState(drawableState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.view.XView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        applyTheme();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.view.XView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.xiaopeng.musicradio.commonui.base.f.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.view.XView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k = false;
        e();
        com.xiaopeng.musicradio.commonui.base.f.b(this);
        f();
    }

    private void h() {
        removeCallbacks(this.l);
        removeCallbacks(this.m);
    }

    @Override // com.xiaopeng.lib.themeswitch.ThemeWatcher.OnThemeSwitchListener
    public void onSwitchTheme(int i) {
        applyTheme();
    }

    @Override // defpackage.bal
    public void applyTheme() {
        bej bejVar;
        int i = this.o;
        if (i == 0 || (bejVar = this.n) == null) {
            return;
        }
        bejVar.a(bak.a(i));
    }
}
