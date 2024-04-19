package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.asm.Opcodes;
/* loaded from: classes.dex */
public class RoundDotView extends View {
    private Paint a;
    private float b;
    private int c;
    private int d;

    public void setCir_x(int i) {
        this.d = i;
    }

    public RoundDotView(Context context) {
        this(context, null, 0);
    }

    public RoundDotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 15.0f;
        this.c = 7;
        a();
    }

    private void a() {
        this.a = new Paint();
        this.a.setAntiAlias(true);
        this.a.setColor(Color.rgb(114, 114, 114));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = (getMeasuredWidth() / this.c) - 10;
        for (int i = 0; i < this.c; i++) {
            switch (i) {
                case 0:
                    this.a.setAlpha(35);
                    canvas.drawCircle(((getMeasuredWidth() / 2) - (this.d * 3)) - (((measuredWidth * 3) / 3) * 2), getMeasuredHeight() / 2, this.b, this.a);
                    break;
                case 1:
                    this.a.setAlpha(105);
                    canvas.drawCircle(((getMeasuredWidth() / 2) - (this.d * 2)) - (((measuredWidth * 2) / 3) * 2), getMeasuredHeight() / 2, this.b, this.a);
                    break;
                case 2:
                    this.a.setAlpha(Opcodes.I2B);
                    canvas.drawCircle(((getMeasuredWidth() / 2) - (this.d * 1)) - ((measuredWidth / 3) * 2), getMeasuredHeight() / 2, this.b, this.a);
                    break;
                case 3:
                    this.a.setAlpha(255);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.b, this.a);
                    break;
                case 4:
                    this.a.setAlpha(Opcodes.I2B);
                    canvas.drawCircle((getMeasuredWidth() / 2) + (this.d * 1) + ((measuredWidth / 3) * 2), getMeasuredHeight() / 2, this.b, this.a);
                    break;
                case 5:
                    this.a.setAlpha(105);
                    canvas.drawCircle((getMeasuredWidth() / 2) + (this.d * 2) + (((measuredWidth * 2) / 3) * 2), getMeasuredHeight() / 2, this.b, this.a);
                    break;
                case 6:
                    this.a.setAlpha(35);
                    canvas.drawCircle((getMeasuredWidth() / 2) + (this.d * 3) + (((measuredWidth * 3) / 3) * 2), getMeasuredHeight() / 2, this.b, this.a);
                    break;
            }
        }
    }
}
