package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.xui.widget.XImageView;
/* loaded from: classes2.dex */
public class MusicCircleImageView extends XImageView {
    private static final ImageView.ScaleType d = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config e = Bitmap.Config.ARGB_8888;
    private static final int f;
    protected final RectF a;
    protected final RectF b;
    protected int c;
    private final Matrix g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private int k;
    private int l;
    private boolean m;
    private Bitmap n;
    private BitmapShader o;
    private int p;
    private int q;
    private float r;
    private float s;
    private float t;
    private ColorFilter u;
    private boolean v;
    private boolean w;
    private boolean x;

    static {
        f = w.a() ? 167772160 : C.ENCODING_PCM_MU_LAW;
    }

    public MusicCircleImageView(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.g = new Matrix();
        this.h = new Paint();
        this.i = new Paint();
        this.j = new Paint();
        this.k = f;
        this.c = 0;
        this.l = 0;
        this.m = true;
    }

    public MusicCircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MusicCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new RectF();
        this.b = new RectF();
        this.g = new Matrix();
        this.h = new Paint();
        this.i = new Paint();
        this.j = new Paint();
        this.k = f;
        this.c = 0;
        this.l = 0;
        this.m = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.MusicCircleImageView, i, 0);
        if (obtainStyledAttributes != null) {
            this.c = obtainStyledAttributes.getDimensionPixelSize(f.j.MusicCircleImageView_border_width, 0);
            this.k = obtainStyledAttributes.getColor(f.j.MusicCircleImageView_border_color, f);
            this.m = obtainStyledAttributes.getBoolean(f.j.MusicCircleImageView_border_overlay, true);
            this.l = obtainStyledAttributes.getColor(f.j.MusicCircleImageView_fill_color, 0);
            this.t = obtainStyledAttributes.getDimensionPixelSize(f.j.MusicCircleImageView_round_radius, 0);
        }
        obtainStyledAttributes.recycle();
    }

    private void d() {
        super.setScaleType(d);
        setWillNotDraw(false);
        this.v = true;
        if (this.w) {
            a();
            this.w = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return d;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != d) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.x) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmap = this.n;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (this.t > 0.0f) {
            a(canvas);
        } else {
            b(canvas);
        }
    }

    protected void a(Canvas canvas) {
        if (this.l != 0) {
            RectF rectF = this.a;
            float f2 = this.t;
            canvas.drawRoundRect(rectF, f2, f2, this.j);
        }
        RectF rectF2 = this.a;
        float f3 = this.t;
        canvas.drawRoundRect(rectF2, f3, f3, this.h);
        if (this.c > 0) {
            RectF rectF3 = this.b;
            float f4 = this.t;
            canvas.drawRoundRect(rectF3, f4, f4, this.i);
        }
    }

    protected void b(Canvas canvas) {
        if (this.l != 0) {
            canvas.drawCircle(this.a.centerX(), this.a.centerY(), this.r, this.j);
        }
        canvas.drawCircle(this.a.centerX(), this.a.centerY(), this.r, this.h);
        if (this.c > 0) {
            canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.s, this.i);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        a();
    }

    public int getBorderColor() {
        return this.k;
    }

    public void setBorderColor(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        this.i.setColor(this.k);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    @Deprecated
    public int getFillColor() {
        return this.l;
    }

    @Deprecated
    public void setFillColor(int i) {
        if (i == this.l) {
            return;
        }
        this.l = i;
        this.j.setColor(i);
        invalidate();
    }

    @Deprecated
    public void setFillColorResource(int i) {
        setFillColor(getContext().getResources().getColor(i));
    }

    public int getBorderWidth() {
        return this.c;
    }

    public void setBorderWidth(int i) {
        if (i == this.c) {
            return;
        }
        this.c = i;
        a();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        a();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
        f();
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        f();
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        f();
    }

    @Override // com.xiaopeng.xui.widget.XImageView, androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        f();
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        f();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.u) {
            return;
        }
        this.u = colorFilter;
        e();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.u;
    }

    private void e() {
        Paint paint = this.h;
        if (paint != null) {
            paint.setColorFilter(this.u);
        }
    }

    public void setRoundRadius(float f2) {
        this.t = f2;
    }

    private Bitmap a(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, e);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), e);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void f() {
        if (this.x) {
            this.n = null;
        } else {
            this.n = a(getDrawable());
        }
        a();
    }

    protected void a() {
        if (!this.v) {
            this.w = true;
        } else if (getWidth() == 0 && getHeight() == 0) {
        } else {
            Bitmap bitmap = this.n;
            if (bitmap == null || bitmap.isRecycled()) {
                invalidate();
                return;
            }
            this.o = new BitmapShader(this.n, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.h.setAntiAlias(true);
            this.h.setShader(this.o);
            this.i.setStyle(Paint.Style.STROKE);
            this.i.setAntiAlias(true);
            this.i.setColor(this.k);
            this.i.setStrokeWidth(this.c);
            this.j.setStyle(Paint.Style.FILL);
            this.j.setAntiAlias(true);
            this.j.setColor(this.l);
            this.q = this.n.getHeight();
            this.p = this.n.getWidth();
            if (this.t > 0.0f) {
                b();
            } else {
                c();
            }
            e();
            i();
            invalidate();
        }
    }

    protected void b() {
        this.a.set(h());
        this.b.set(this.a);
        this.s = this.t;
    }

    protected void c() {
        int i;
        this.b.set(g());
        this.s = Math.min((this.b.height() - this.c) / 2.0f, (this.b.width() - this.c) / 2.0f);
        this.a.set(this.b);
        if (!this.m && (i = this.c) > 0) {
            this.a.inset(i - 1.0f, i - 1.0f);
        }
        this.r = Math.min(this.a.height() / 2.0f, this.a.width() / 2.0f);
    }

    private RectF g() {
        int width;
        int height;
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((width - min) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - min) / 2.0f);
        float f2 = min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f2, f2 + paddingTop);
    }

    private RectF h() {
        return new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    }

    private void i() {
        float width;
        float height;
        this.g.set(null);
        float f2 = 0.0f;
        if (this.p * this.a.height() > this.a.width() * this.q) {
            width = this.a.height() / this.q;
            height = 0.0f;
            f2 = (this.a.width() - (this.p * width)) * 0.5f;
        } else {
            width = this.a.width() / this.p;
            height = (this.a.height() - (this.q * width)) * 0.5f;
        }
        this.g.setScale(width, width);
        this.g.postTranslate(((int) (f2 + 0.5f)) + this.a.left, ((int) (height + 0.5f)) + this.a.top);
        this.o.setLocalMatrix(this.g);
    }
}
