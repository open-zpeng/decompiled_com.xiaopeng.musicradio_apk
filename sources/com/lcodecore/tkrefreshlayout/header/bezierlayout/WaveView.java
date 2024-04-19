package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class WaveView extends View {
    Path a;
    Paint b;
    private int c;
    private int d;

    public WaveView(Context context) {
        this(context, null, 0);
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.a = new Path();
        this.b = new Paint();
        this.b.setColor(-14736346);
        this.b.setAntiAlias(true);
    }

    public int getHeadHeight() {
        return this.d;
    }

    public void setHeadHeight(int i) {
        this.d = i;
    }

    public int getWaveHeight() {
        return this.c;
    }

    public void setWaveHeight(int i) {
        this.c = i;
    }

    public void setWaveColor(int i) {
        Paint paint = this.b;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.reset();
        this.a.lineTo(0.0f, this.d);
        this.a.quadTo(getMeasuredWidth() / 2, this.d + this.c, getMeasuredWidth(), this.d);
        this.a.lineTo(getMeasuredWidth(), 0.0f);
        canvas.drawPath(this.a, this.b);
    }
}
