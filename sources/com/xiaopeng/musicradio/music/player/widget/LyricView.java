package com.xiaopeng.musicradio.music.player.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.xiaopeng.musicradio.bean.lyrics.LrcEntry;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ag;
import com.xiaopeng.musicradio.utils.n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class LyricView extends View implements bal {
    private int A;
    private boolean B;
    private int C;
    private int D;
    private a E;
    private boolean F;
    private int G;
    private long H;
    private ValueAnimator I;

    /* renamed from: J  reason: collision with root package name */
    private float f156J;
    private int K;
    private String L;
    private int M;
    private d N;
    private e O;
    private boolean P;
    private int Q;
    private Paint R;
    private TextPaint S;
    private Paint T;
    private TextPaint U;
    private Bitmap V;
    private boolean W;
    Handler a;
    private RectF aa;
    private b b;
    private c c;
    private ArrayList<LrcEntry> d;
    private HashMap<Integer, ArrayList<String>> e;
    private TextPaint f;
    private TextPaint g;
    private TextPaint h;
    private float i;
    private float j;
    private int k;
    private int l;
    private float m;
    private float n;
    private Scroller o;
    private int p;
    private boolean q;
    private float r;
    private float s;
    private float t;
    private float u;
    private int v;
    private int w;
    private VelocityTracker x;
    private int y;
    private int z;

    /* loaded from: classes.dex */
    public interface d {
        void a(ArrayList<LrcEntry> arrayList);

        void f();

        void g();
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(int i);
    }

    public LyricView(Context context) {
        super(context);
        this.d = new ArrayList<>();
        this.e = new HashMap<>();
        this.k = 16777215;
        this.l = -2130706433;
        this.m = 33.0f;
        this.n = 33.0f;
        this.p = 0;
        this.q = false;
        this.v = -1;
        this.A = -1;
        this.B = true;
        this.D = 0;
        this.F = false;
        this.Q = -1;
        this.a = new Handler() { // from class: com.xiaopeng.musicradio.music.player.widget.LyricView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                LyricView.this.F = false;
                LyricView lyricView = LyricView.this;
                lyricView.a(lyricView.G, false, true);
            }
        };
    }

    public LyricView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList<>();
        this.e = new HashMap<>();
        this.k = 16777215;
        this.l = -2130706433;
        this.m = 33.0f;
        this.n = 33.0f;
        this.p = 0;
        this.q = false;
        this.v = -1;
        this.A = -1;
        this.B = true;
        this.D = 0;
        this.F = false;
        this.Q = -1;
        this.a = new Handler() { // from class: com.xiaopeng.musicradio.music.player.widget.LyricView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                LyricView.this.F = false;
                LyricView lyricView = LyricView.this;
                lyricView.a(lyricView.G, false, true);
            }
        };
        a(attributeSet);
    }

    public LyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ArrayList<>();
        this.e = new HashMap<>();
        this.k = 16777215;
        this.l = -2130706433;
        this.m = 33.0f;
        this.n = 33.0f;
        this.p = 0;
        this.q = false;
        this.v = -1;
        this.A = -1;
        this.B = true;
        this.D = 0;
        this.F = false;
        this.Q = -1;
        this.a = new Handler() { // from class: com.xiaopeng.musicradio.music.player.widget.LyricView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                LyricView.this.F = false;
                LyricView lyricView = LyricView.this;
                lyricView.a(lyricView.G, false, true);
            }
        };
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.h.LrcView);
        this.j = obtainStyledAttributes.getDimension(b.h.LrcView_lrcTextSize, ag.b(getContext(), 24.0f));
        this.i = obtainStyledAttributes.getDimension(b.h.LrcView_lrcSelectTextSize, ag.b(getContext(), 32.0f));
        this.m = obtainStyledAttributes.getDimension(b.h.LrcView_lrcDividerHeight, ag.a(getContext(), 33.0f));
        this.n = obtainStyledAttributes.getDimension(b.h.LrcView_lrcCurrentDividerHeight, ag.a(getContext(), 33.0f));
        this.l = obtainStyledAttributes.getColor(b.h.LrcView_lrcNormalTextColor, getResources().getColor(b.a.lrc_other_color));
        this.k = obtainStyledAttributes.getColor(b.h.LrcView_lrcCurrentTextColor, getResources().getColor(b.a.lrc_current_color));
        this.M = obtainStyledAttributes.getInt(b.h.LrcView_lrcStartLine, -1);
        this.H = obtainStyledAttributes.getInt(b.h.LrcView_lrcAnimationDuration, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
        long j = this.H;
        if (j < 0) {
            j = 2500;
        }
        this.H = j;
        this.K = obtainStyledAttributes.getDimensionPixelOffset(b.h.LrcView_lrcPadding, 0);
        this.L = obtainStyledAttributes.getString(b.h.LrcView_lrcLabel);
        obtainStyledAttributes.recycle();
        this.o = new Scroller(getContext());
        this.g = new TextPaint();
        this.g.setAntiAlias(true);
        this.g.setColor(this.k);
        this.g.setTextSize(this.i);
        this.U = new TextPaint();
        this.U.setAntiAlias(true);
        this.U.setColor(this.k);
        this.U.setTextSize(this.j);
        this.f = new TextPaint();
        this.f.setAntiAlias(true);
        this.f.setColor(this.l);
        this.f.setTextSize(this.j);
        this.h = new TextPaint();
        this.h.setAntiAlias(true);
        this.h.setTextSize(this.j);
        this.h.setColor(this.l);
        this.R = new Paint();
        this.R.setDither(true);
        this.R.setAntiAlias(true);
        this.R.setColor(getResources().getColor(b.a.primary_neutral_normal));
        this.S = new TextPaint();
        this.S.setDither(true);
        this.S.setAntiAlias(true);
        this.S.setColor(getResources().getColor(b.a.color_0f1520));
        this.S.setTextAlign(Paint.Align.LEFT);
        this.S.setTextSize(getResources().getDimensionPixelSize(b.C0147b.lrc_play_time_text_size));
        this.T = new Paint();
        this.T.setDither(true);
        this.T.setAntiAlias(true);
        this.T.setColor(getResources().getColor(b.a.black));
        this.T.setAlpha(41);
        this.T.setStrokeWidth(1.0f);
        this.T.setStyle(Paint.Style.STROKE);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.w = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.z = viewConfiguration.getScaledMaximumFlingVelocity();
        b();
    }

    private void b() {
        Drawable drawable = getContext().getDrawable(b.c.ic_24_playall);
        this.V = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(getResources().getColor(b.a.transparent));
        Canvas canvas = new Canvas(this.V);
        canvas.drawPaint(paint);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
    }

    public void a(boolean z) {
        this.W = z;
    }

    public void setOtherTextSize(float f) {
        this.j = f;
        this.f.setTextSize(this.j);
    }

    public void setCurrentTextSize(float f) {
        this.i = f;
        this.g.setTextSize(this.i);
    }

    public void setOtherPadding(float f) {
        this.m = f;
    }

    public void setCurrentPadding(float f) {
        this.n = f;
    }

    private void c(int i) {
        this.o.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, (int) getMaxLyricCanvasOffset()));
        invalidate();
    }

    private float getMaxLyricCanvasOffset() {
        if (this.d == null) {
            return 0.0f;
        }
        return getTotalDrawLines() * (this.i + this.n);
    }

    private int getTotalDrawLines() {
        Collection<ArrayList<String>> values;
        ArrayList<LrcEntry> arrayList = this.d;
        int size = arrayList != null ? 0 + arrayList.size() : 0;
        HashMap<Integer, ArrayList<String>> hashMap = this.e;
        if (hashMap == null || (values = hashMap.values()) == null) {
            return size;
        }
        int size2 = values.size();
        for (ArrayList<String> arrayList2 : this.e.values()) {
            size += arrayList2.size();
        }
        return size - size2;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentTxtColor(getResources().getColor(b.a.lyric_text_current));
        setOtherTxtColor(getResources().getColor(b.a.lyric_text_other));
        this.R.setColor(getResources().getColor(b.a.primary_neutral_normal));
        this.S.setColor(getResources().getColor(b.a.color_0f1520));
        this.T.setColor(getResources().getColor(b.a.lyric_text_current));
        b();
        invalidate();
    }

    private void c() {
        this.C = getWidth() - this.K;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.C <= 0) {
            c();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        ArrayList<LrcEntry> arrayList = this.d;
        if (arrayList == null || arrayList.size() == 0 || this.C <= 0) {
            a(canvas, this.f, this.L, getFirstLineOffsetY());
            return;
        }
        if (this.p == 0) {
            this.p = (int) (getHeight() / (this.i + this.n));
            this.p = Math.max(1, this.p);
        }
        b(canvas);
        a(canvas);
    }

    private void a(Canvas canvas) {
        if (this.P) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(b.C0147b.dp_56);
            float firstLineOffsetY = (getFirstLineOffsetY() + this.o.getCurrY()) - (dimensionPixelOffset / 2);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(b.C0147b.dp_25);
            int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(b.C0147b.dp_124) + dimensionPixelOffset2;
            float f = dimensionPixelOffset2;
            this.aa = new RectF(f, firstLineOffsetY, dimensionPixelOffset3, dimensionPixelOffset + firstLineOffsetY);
            float f2 = 50;
            canvas.drawRoundRect(this.aa, f2, f2, this.R);
            canvas.drawBitmap(this.V, this.aa.left + f + 5.0f, this.aa.centerY() - (this.V.getHeight() / 2), (Paint) null);
            Paint.FontMetricsInt fontMetricsInt = this.S.getFontMetricsInt();
            canvas.drawText(n.a(getSeekLineTime()), this.aa.left + getResources().getDimensionPixelOffset(b.C0147b.dp_50), this.aa.centerY() - ((fontMetricsInt.top + fontMetricsInt.bottom) / 2), this.S);
            Path path = new Path();
            path.moveTo(this.aa.right + getResources().getDimensionPixelOffset(b.C0147b.dp_27), this.aa.top + (this.aa.height() / 2.0f));
            path.lineTo(this.aa.right + getResources().getDimensionPixelOffset(b.C0147b.dp_27) + 750.0f, this.aa.top + (this.aa.height() / 2.0f));
            canvas.drawPath(path, this.T);
        }
    }

    private int getSeekLineTime() {
        int i = this.Q;
        if (i < 0 || i >= this.d.size()) {
            return 0;
        }
        return (int) (this.d.get(Math.max(Math.min(this.Q, this.d.size() - 1), 0)).getTime() / 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends Thread {
        boolean a = false;

        a() {
        }

        void a() {
            this.a = true;
        }

        boolean b() {
            return this.a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            c();
            if (b()) {
                return;
            }
            ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.widget.LyricView.a.1
                @Override // java.lang.Runnable
                public void run() {
                    LyricView.this.postInvalidate();
                    LyricView.this.D = 2;
                }
            });
        }

        private void c() {
            char charAt;
            if (LyricView.this.d == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) LyricView.this.d.clone();
            HashMap hashMap = new HashMap();
            for (int i = 0; i < arrayList.size() && !this.a; i++) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String text = ((LrcEntry) arrayList.get(i)).getText();
                if (!TextUtils.isEmpty(text)) {
                    float measureText = LyricView.this.g.measureText(text);
                    ArrayList arrayList2 = null;
                    while (measureText > LyricView.this.C && !this.a) {
                        try {
                            Thread.sleep(5L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                        int unused = LyricView.this.C;
                        int breakText = LyricView.this.g.breakText(text, true, LyricView.this.C, null) - 1;
                        for (int i2 = breakText; i2 >= 0 && !this.a; i2--) {
                            try {
                                Thread.sleep(2L);
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                            if (text.length() > i2 && ((charAt = text.charAt(i2)) == ' ' || charAt == ',' || charAt == '.' || charAt == '?' || charAt == '!' || charAt == '\n' || charAt == '\t')) {
                                breakText = i2;
                                break;
                            }
                        }
                        int min = Math.min(breakText + 1, text.length());
                        String substring = text.substring(0, min);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(substring);
                        if (min >= text.length()) {
                            measureText = 0.0f;
                            text = null;
                        } else {
                            text = text.substring(min, text.length());
                            measureText = LyricView.this.g.measureText(text);
                        }
                    }
                    if (arrayList2 != null && text != null) {
                        arrayList2.add(text);
                        hashMap.put(Integer.valueOf(i), arrayList2);
                    }
                }
            }
            if (b()) {
                return;
            }
            LyricView.this.e = hashMap;
        }
    }

    private void b(Canvas canvas) {
        float f;
        TextPaint textPaint;
        if (this.D == 0) {
            this.D = 1;
            this.E = new a();
            this.E.start();
        }
        if (this.D == 1 || this.e == null) {
            return;
        }
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getMaxLyricCanvasOffset() + getHeight());
        int i = this.M;
        if (i == -1) {
            f = ((getHeight() / 2) - (this.j / 2.0f)) + 5.0f;
        } else {
            int i2 = i - 1;
            if (i2 <= 0) {
                f = -this.f.getFontMetrics().top;
            } else {
                f = (i2 * ((this.m + this.j) + this.f.getFontMetrics().bottom)) - this.f.getFontMetrics().top;
            }
        }
        for (int i3 = 0; i3 <= this.d.size() - 1; i3++) {
            if (i3 == this.v) {
                textPaint = this.g;
                textPaint.setTextSize(this.i - this.f156J);
            } else if (this.P && this.Q == i3) {
                textPaint = this.U;
            } else {
                textPaint = this.f;
                if (i3 == this.v - 1) {
                    textPaint = this.h;
                    textPaint.setTextSize(this.j + this.f156J);
                }
            }
            ArrayList<String> arrayList = this.e.get(Integer.valueOf(i3));
            if (arrayList == null) {
                a(canvas, textPaint, this.d.get(i3).getText(), f);
                f += this.i + this.n;
            } else {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    a(canvas, textPaint, it.next(), f);
                    f += this.i + this.n;
                }
            }
        }
        canvas.restore();
    }

    private void a(Canvas canvas, Paint paint, String str, float f) {
        canvas.drawText(str, Math.max((getWidth() - paint.measureText(str)) / 2.0f, 0.0f), f, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.music.player.widget.LyricView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean a(float f, float f2) {
        RectF rectF;
        return this.P && (rectF = this.aa) != null && f >= rectF.left - (this.aa.width() / 2.0f) && f <= (this.aa.right + ((float) getResources().getDimensionPixelOffset(b.C0147b.dp_27))) + 750.0f && f2 >= ((float) (getMeasuredHeight() / 2)) - this.aa.height() && f2 <= ((float) (getMeasuredHeight() / 2)) + this.aa.height();
    }

    private float getFirstLineOffsetY() {
        int i = this.M;
        if (i == -1) {
            return (getHeight() / 2) - (this.j / 2.0f);
        }
        int i2 = i - 1;
        if (i2 <= 0) {
            return -this.f.getFontMetrics().top;
        }
        return (i2 * ((this.m + this.j) + this.f.getFontMetrics().bottom)) - this.f.getFontMetrics().top;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.F = !z;
        this.P = false;
        this.Q = -1;
    }

    private int d(int i) {
        int i2;
        ArrayList<LrcEntry> arrayList = this.d;
        if (arrayList == null || (i2 = i + 1) >= arrayList.size()) {
            return 0;
        }
        return (int) this.d.get(i2).getTime();
    }

    private int a(int i, int i2, int i3) {
        HashMap<Integer, ArrayList<String>> hashMap;
        ArrayList<String> arrayList;
        int i4;
        int i5;
        if (this.d != null) {
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                HashMap<Integer, ArrayList<String>> hashMap2 = this.e;
                if (hashMap2 != null) {
                    ArrayList<String> arrayList2 = hashMap2.get(Integer.valueOf(i7));
                    i6 = arrayList2 != null ? i6 + arrayList2.size() : i6 + 1;
                }
            }
            if (i2 != i3 && (hashMap = this.e) != null && (arrayList = hashMap.get(Integer.valueOf(i))) != null) {
                int size = arrayList.size();
                int d2 = d(i);
                if (d2 != 0 && (i4 = (d2 - i3) / size) != 0 && (i5 = (i2 - i3) / i4) > 0) {
                    i6 += i5;
                }
            }
            return (int) (i6 * (this.i + this.n));
        }
        return 0;
    }

    private boolean e(int i) {
        HashMap<Integer, ArrayList<String>> hashMap = this.e;
        return (hashMap == null || hashMap.get(Integer.valueOf(i)) == null) ? false : true;
    }

    public void a(int i, boolean z) {
        ArrayList<LrcEntry> arrayList = this.d;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        for (int size = this.d.size() - 1; size >= 0; size--) {
            double time = this.d.get(size).getTime() != 0 ? this.d.get(size).getTime() / 1000 : -1.0d;
            if (time != -1.0d && (size == 0 || i >= ((int) (time * 1000.0d)))) {
                if (e(this.v) || this.v != size) {
                    int i2 = this.v;
                    if (this.F) {
                        return;
                    }
                    this.v = size;
                    int i3 = this.v;
                    if (i2 == i3) {
                        return;
                    }
                    if (!this.q) {
                        this.Q = -1;
                        this.P = false;
                        int a2 = a(i3, i, (int) (time * 1000.0d));
                        boolean z2 = Math.abs(getScrollY() - a2) > getHeight() * 2;
                        if (z || z2) {
                            if (!this.o.isFinished()) {
                                this.o.forceFinished(true);
                            }
                            scrollTo(getScrollX(), a2);
                        } else {
                            a(a2, (int) this.H);
                            d();
                        }
                    }
                    invalidate();
                    return;
                }
                return;
            }
        }
    }

    public void a(int i, boolean z, boolean z2) {
        ArrayList<LrcEntry> arrayList;
        if (i == this.G || (arrayList = this.d) == null || arrayList.size() == 0 || this.F) {
            return;
        }
        for (int size = this.d.size() - 1; size >= 0; size--) {
            double time = this.d.get(size).getTime() != 0 ? this.d.get(size).getTime() / 1000 : -1.0d;
            if (time != -1.0d && (size == 0 || i >= ((int) (time * 1000.0d)) || z2)) {
                int a2 = a(this.v, i, (int) (time * 1000.0d));
                boolean z3 = Math.abs(getScrollY() - a2) > getHeight() * 2;
                if (z || z3) {
                    if (!this.o.isFinished()) {
                        this.o.forceFinished(true);
                    }
                    scrollTo(getScrollX(), a2);
                } else {
                    a(a2, (int) this.H);
                    d();
                }
                invalidate();
                return;
            }
        }
    }

    private void d() {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.I.cancel();
            this.f156J = 0.0f;
        }
        this.I = ValueAnimator.ofFloat(this.i - this.j, 0.0f);
        this.I.setInterpolator(new LinearInterpolator());
        this.I.setDuration(this.H);
        this.I.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xiaopeng.musicradio.music.player.widget.LyricView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LyricView.this.f156J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
            }
        });
        this.I.start();
    }

    public void a() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.cancel(true);
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.G = 0;
        if (!this.o.isFinished()) {
            this.o.forceFinished(true);
        }
        a aVar = this.E;
        if (aVar != null && aVar.isAlive()) {
            this.E.a();
        }
        this.d = null;
        HashMap<Integer, ArrayList<String>> hashMap = this.e;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.e = new HashMap<>();
        this.P = false;
        this.D = 0;
        this.v = -1;
        this.q = false;
        this.p = 0;
        scrollTo(getScrollX(), 0);
        postInvalidate();
    }

    private void a(int i, int i2) {
        this.o.startScroll(getScrollX(), getScrollY(), getScrollX(), i - getScrollY(), i2);
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            return;
        }
        int scrollY = getScrollY();
        int currY = this.o.getCurrY();
        int maxLyricCanvasOffset = (int) getMaxLyricCanvasOffset();
        int i = 0;
        if (currY < 0) {
            currY = 0;
        } else if (currY > maxLyricCanvasOffset) {
            currY = maxLyricCanvasOffset;
        }
        if (scrollY != currY) {
            scrollTo(0, currY);
        }
        if (this.q && this.W) {
            this.Q = -1;
            this.P = true;
        }
        if (this.P) {
            float f = this.n;
            int floor = (int) Math.floor((this.o.getCurrY() + (f / 2.0f)) / (this.i + f));
            int i2 = 0;
            while (true) {
                if (i >= this.d.size()) {
                    break;
                }
                HashMap<Integer, ArrayList<String>> hashMap = this.e;
                if (hashMap != null) {
                    ArrayList<String> arrayList = hashMap.get(Integer.valueOf(i));
                    i2 = arrayList != null ? i2 + arrayList.size() : i2 + 1;
                    if (i2 > floor) {
                        this.Q = i;
                        break;
                    } else if (i == this.d.size() - 1) {
                        this.Q = i2 - 1;
                        break;
                    }
                }
                i++;
            }
        }
        invalidate();
    }

    public void a(int i) {
        this.G = i;
        a(i, true);
    }

    public void b(int i) {
        this.G = i;
        a(i, false);
    }

    public void a(String str) {
        this.b = new b();
        this.b.execute(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        d dVar = this.N;
        if (dVar != null) {
            dVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<LrcEntry> arrayList) {
        int i = this.G;
        if (arrayList != null && !arrayList.isEmpty()) {
            a();
            c();
            this.d = arrayList;
        }
        if (i > 0) {
            b(i);
        } else {
            postInvalidate();
        }
        d dVar = this.N;
        if (dVar != null) {
            dVar.a(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        d dVar = this.N;
        if (dVar != null) {
            dVar.g();
        }
    }

    @Override // defpackage.bal
    public void applyTheme() {
        setCurrentTxtColor(bak.a(b.a.lrc_current_color));
        setOtherTxtColor(bak.a(b.a.lrc_other_color));
        postInvalidate();
    }

    public void setCurrentTxtColor(int i) {
        this.k = i;
        this.g.setColor(i);
        this.U.setColor(i);
    }

    public void setOtherTxtColor(int i) {
        this.l = i;
        this.f.setColor(i);
        this.h.setColor(i);
    }

    public void setLrcLabel(String str) {
        this.L = str;
        ArrayList<LrcEntry> arrayList = this.d;
        if (arrayList == null || arrayList.size() == 0 || this.C <= 0) {
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AsyncTask<String, Integer, ArrayList<LrcEntry>> {
        private final WeakReference<LyricView> a;

        private b(LyricView lyricView) {
            this.a = new WeakReference<>(lyricView);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            a().e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public ArrayList<LrcEntry> doInBackground(String... strArr) {
            if (a() == null) {
                return null;
            }
            return LrcEntry.parseLrc(strArr[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(ArrayList<LrcEntry> arrayList) {
            if (a() == null) {
                return;
            }
            if (arrayList != null) {
                a().a(arrayList);
                a().setTag(null);
                return;
            }
            a().f();
        }

        private LyricView a() {
            return this.a.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends AsyncTask<File, Integer, ArrayList<LrcEntry>> {
        private final WeakReference<LyricView> a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public ArrayList<LrcEntry> doInBackground(File... fileArr) {
            if (a() == null) {
                return null;
            }
            return LrcEntry.parseLrc(fileArr[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(ArrayList<LrcEntry> arrayList) {
            if (a() == null || arrayList == null) {
                return;
            }
            a().a(arrayList);
            a().setTag(null);
        }

        private LyricView a() {
            return this.a.get();
        }
    }

    public void setOnLoadLrcListener(d dVar) {
        this.N = dVar;
    }

    public void setOnSeekListener(e eVar) {
        this.O = eVar;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.removeCallbacksAndMessages(null);
    }
}
