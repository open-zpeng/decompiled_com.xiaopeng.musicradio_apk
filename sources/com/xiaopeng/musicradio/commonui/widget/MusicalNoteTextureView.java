package com.xiaopeng.musicradio.commonui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import defpackage.aem;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class MusicalNoteTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    private a a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private Surface j;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public MusicalNoteTextureView(Context context) {
        super(context);
        this.i = true;
        a(null);
    }

    public MusicalNoteTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aem.d.MusicalNoteTextureView);
            this.d = obtainStyledAttributes.getDimensionPixelSize(aem.d.MusicalNoteTextureView_note_count, 4);
            this.b = obtainStyledAttributes.getDimensionPixelSize(aem.d.MusicalNoteTextureView_note_width, 5);
            this.c = obtainStyledAttributes.getDimensionPixelSize(aem.d.MusicalNoteTextureView_note_height, 40);
            this.e = obtainStyledAttributes.getColor(aem.d.MusicalNoteTextureView_note_color, getResources().getColor(aem.a.color_forward_normal));
            this.f = obtainStyledAttributes.getDimensionPixelOffset(aem.d.MusicalNoteTextureView_note_padding, 5);
            int i = this.b;
            int i2 = this.f;
            this.g = ((i + i2) * this.d) - i2;
            obtainStyledAttributes.recycle();
        }
        setSurfaceTextureListener(this);
        setOpaque(false);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(this.g, this.c);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(this.g, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, this.c);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.d("MusicalNoteTextureView", "onSurfaceTextureAvailable ========== height = " + i2);
        this.g = i;
        this.h = i2;
        this.j = new Surface(surfaceTexture);
        c();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.d("MusicalNoteTextureView", "onSurfaceTextureSizeChanged: ========");
        this.g = i;
        this.h = i2;
        this.j = new Surface(surfaceTexture);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this.j);
            this.a.a(i, i2);
            a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.d("MusicalNoteTextureView", "onSurfaceTextureDestroyed ==========");
        setBackgroundDrawable(null);
        d();
        b();
        return false;
    }

    private void b() {
        Surface surface = this.j;
        if (surface == null || !surface.isValid()) {
            return;
        }
        this.j.release();
        this.j = null;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        Log.d("MusicalNoteTextureView", "onVisibilityChanged: ========== " + i);
        if (i == 0) {
            c();
        } else {
            d();
        }
    }

    public void a() {
        this.i = true;
        this.a.a(true);
    }

    private void c() {
        if (getVisibility() == 0 && this.a == null && this.j != null) {
            this.a = new a.C0132a().e(this.g).f(this.h).a(this.d).b(this.b).c(this.c).d(this.f).g(this.e).a(this.j);
            this.a.a(this.i);
            ban.a(this.a);
        }
    }

    private void d() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b(true);
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        private Surface a;
        private Paint b;
        private Rect c;
        private boolean d;
        private int e;
        private int f;
        private int g;
        private int h;
        private AtomicBoolean i;
        private SparseArray<b> j;

        public void a() {
        }

        private a(Surface surface, C0132a c0132a) {
            this.d = false;
            this.i = new AtomicBoolean(true);
            this.j = new SparseArray<>();
            this.a = surface;
            a(c0132a);
        }

        private void a(C0132a c0132a) {
            this.c = new Rect(0, 0, c0132a.e, c0132a.f);
            this.b = new Paint();
            this.b.setColor(c0132a.g);
            this.g = c0132a.c;
            this.f = c0132a.b;
            this.e = c0132a.a;
            this.h = c0132a.d;
            for (int i = 0; i < this.e; i++) {
                b bVar = new b();
                int i2 = this.f;
                bVar.a((this.h + i2) * i, i2, this.g);
                bVar.a(c0132a.f);
                this.j.append(i, bVar);
            }
        }

        public void a(Surface surface) {
            this.a = surface;
        }

        public void a(int i, int i2) {
            this.c.set(0, 0, i, i2);
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                this.j.valueAt(i3).a(i2);
            }
        }

        public void a(boolean z) {
            this.i.set(z);
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.d) {
                Canvas canvas = null;
                try {
                    if (this.a.isValid()) {
                        canvas = this.a.lockCanvas(this.c);
                        a(canvas);
                    }
                    Thread.sleep(83L);
                } catch (Exception unused) {
                    if (0 != 0 && this.a.isValid()) {
                    }
                } catch (Throwable th) {
                    if (0 != 0 && this.a.isValid()) {
                        this.a.unlockCanvasAndPost(null);
                    }
                    throw th;
                }
                if (canvas != null && this.a.isValid()) {
                    this.a.unlockCanvasAndPost(canvas);
                }
            }
        }

        private void a(Canvas canvas) {
            if (this.d) {
                return;
            }
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            for (int i = 0; i < this.j.size(); i++) {
                this.j.valueAt(i).a(canvas, this.b, this.i.get());
            }
        }

        public void b(boolean z) {
            this.d = z;
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class b {
            private RectF a;
            private int b;
            private int c;
            private int d;
            private float e;
            private float f;
            private float g;
            private long h;
            private boolean i;
            private int j;

            private b() {
                this.a = new RectF();
            }

            public void a(int i, int i2, int i3) {
                RectF rectF = this.a;
                rectF.left = 0.0f;
                rectF.right = i2;
                rectF.top = -i3;
                rectF.bottom = 0.0f;
                this.b = i;
                this.c = i3;
                this.f = 0.4f;
                this.d = ((int) (Math.random() * 700.0d)) + 100;
                float f = this.f;
                this.e = ((1.0f - f) / 600.0f) * 83.0f;
                this.g = f + (((int) (Math.random() * 4.0d)) * 0.1f);
            }

            public void a(int i) {
                int i2 = this.c;
                this.j = ((i - i2) / 2) + i2;
            }

            public void a(Canvas canvas, Paint paint, boolean z) {
                if (this.h == 0) {
                    this.h = System.currentTimeMillis();
                }
                if (System.currentTimeMillis() - this.h >= this.d && z) {
                    if (this.i) {
                        this.g -= this.e;
                        float f = this.g;
                        float f2 = this.f;
                        if (f <= f2) {
                            this.i = false;
                            this.g = f2;
                        }
                    } else {
                        this.g += this.e;
                        if (this.g >= 1.0f) {
                            this.i = true;
                            this.g = 1.0f;
                        }
                    }
                }
                canvas.save();
                canvas.translate(this.b, this.j);
                canvas.scale(1.0f, this.g);
                canvas.drawRoundRect(this.a, 4.0f, 4.0f, paint);
                canvas.restore();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.xiaopeng.musicradio.commonui.widget.MusicalNoteTextureView$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0132a {
            private int a;
            private int b;
            private int c;
            private int d;
            private int e;
            private int f;
            private int g;

            private C0132a() {
            }

            public C0132a a(int i) {
                this.a = i;
                return this;
            }

            public C0132a b(int i) {
                this.b = i;
                return this;
            }

            public C0132a c(int i) {
                this.c = i;
                return this;
            }

            public C0132a d(int i) {
                this.d = i;
                return this;
            }

            public C0132a e(int i) {
                this.e = i;
                return this;
            }

            public C0132a f(int i) {
                this.f = i;
                return this;
            }

            public C0132a g(int i) {
                this.g = i;
                return this;
            }

            public a a(Surface surface) {
                return new a(surface, this);
            }
        }
    }
}
