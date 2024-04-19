package com.xiaopeng.musicradio.widget.gallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.vui.VuiView;
import defpackage.auk;
import defpackage.beo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class XmGallery extends FrameLayout implements View.OnTouchListener, bic, VuiView {
    private ViewPager a;
    private beh b;
    private int c;
    private int d;
    private int e;
    private long f;
    private boolean g;
    private PointF h;
    private a i;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i);

        void b();

        void b(int i);

        void c();

        void c(int i);
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void enableViewVuiMode(boolean z) {
    }

    @Override // defpackage.bhz
    public String getVuiBizId() {
        return null;
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public boolean getVuiDisableHitEffect() {
        return false;
    }

    @Override // defpackage.bhz
    public String getVuiFatherElementId() {
        return null;
    }

    @Override // defpackage.bhz
    public String getVuiFatherLabel() {
        return null;
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public bii getVuiFeedbackType() {
        return null;
    }

    @Override // defpackage.bhz
    public String getVuiLabel() {
        return "";
    }

    @Override // defpackage.bhz
    public int getVuiPosition() {
        return -1;
    }

    @Override // defpackage.bhz
    public boolean isPerformVuiAction() {
        return false;
    }

    @Override // defpackage.bhz
    public boolean isVuiLayoutLoadable() {
        return true;
    }

    @Override // defpackage.bhz
    public boolean isVuiModeEnabled() {
        return false;
    }

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    @Override // defpackage.bhz
    public void setPerformVuiAction(boolean z) {
    }

    @Override // defpackage.bhz
    public void setVuiAction(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiBizId(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiDisableHitEffect(boolean z) {
    }

    @Override // defpackage.bhz
    public void setVuiElementId(String str) {
    }

    @Override // defpackage.bhz
    public void setVuiElementType(bih bihVar) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiFatherElementId(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiFatherLabel(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiFeedbackType(bii biiVar) {
    }

    @Override // defpackage.bhz
    public void setVuiLabel(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiLayoutLoadable(boolean z) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiMode(bij bijVar) {
    }

    @Override // defpackage.bhz
    public void setVuiPosition(int i) {
    }

    @Override // defpackage.bhz
    public void setVuiPriority(bik bikVar) {
    }

    @Override // defpackage.bhz
    public void setVuiProps(JSONObject jSONObject) {
    }

    public XmGallery(Context context) {
        super(context);
        this.f = -1L;
        this.h = new PointF();
        a(context, null, 0);
    }

    public XmGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1L;
        this.h = new PointF();
        a(context, attributeSet, 0);
    }

    public XmGallery(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1L;
        this.h = new PointF();
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, beo.f.XMGallery, i, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(beo.f.XMGallery_xm_gallery_itemWidth, -1);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(beo.f.XMGallery_xm_gallery_itemHeight, -1);
        obtainStyledAttributes.recycle();
        this.a = new ViewPager(context);
        this.a.setClipChildren(false);
        this.a.setOverScrollMode(2);
        this.a.setHorizontalScrollBarEnabled(false);
        this.a.setOffscreenPageLimit(15);
        this.a.setPageMargin(20);
        setPageTransformer(new bei());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset2);
        layoutParams.gravity = 17;
        addView(this.a, layoutParams);
        setClipChildren(false);
        setOnTouchListener(this);
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d = ViewConfiguration.getTapTimeout();
        this.e = dimensionPixelOffset;
        this.a.addOnPageChangeListener(new ViewPager.f() { // from class: com.xiaopeng.musicradio.widget.gallery.XmGallery.1
            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageSelected(int i2) {
                if (XmGallery.this.i != null) {
                    XmGallery.this.i.b(i2);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageScrollStateChanged(int i2) {
                if (XmGallery.this.i != null) {
                    XmGallery.this.i.c(i2);
                }
            }
        });
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.a.getAdapter() == null || this.a.getAdapter().getCount() == 0) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                this.g = true;
                this.f = SystemClock.uptimeMillis();
                this.h.set(motionEvent.getX(), motionEvent.getY());
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
            case 1:
            case 3:
                if (this.g) {
                    a(this.h.x);
                }
                this.g = false;
                this.f = -1L;
                break;
            case 2:
                if (Math.abs(x - this.h.x) > this.c || Math.abs(y - this.h.y) > this.c) {
                    this.g = false;
                    break;
                }
                break;
        }
        return this.a.dispatchTouchEvent(motionEvent);
    }

    private void a(float f) {
        float width = f - (getWidth() / 2.0f);
        boolean z = width >= 0.0f;
        float abs = Math.abs(width);
        int i = this.e;
        int i2 = ((int) (abs + (i / 2.0f))) / i;
        int currentItem = this.a.getCurrentItem();
        if (!z) {
            i2 = -i2;
        }
        int i3 = currentItem + i2;
        if (this.a.getAdapter() == null || i3 < 0 || i3 >= this.a.getAdapter().getCount()) {
            a aVar = this.i;
            if (aVar != null) {
                aVar.b();
            }
        } else if (this.a.getCurrentItem() == i3) {
            a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.b();
            }
        } else {
            a(i3, true);
            a aVar3 = this.i;
            if (aVar3 != null) {
                aVar3.a(i3);
            }
        }
    }

    public void setPageTransformer(beh behVar) {
        this.b = behVar;
        this.a.setPageTransformer(true, behVar);
    }

    public void setPageOffscreenLimit(int i) {
        this.a.setOffscreenPageLimit(i);
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        this.a.setAdapter(aVar);
        if (aVar instanceof auk) {
            ((auk) aVar).a(new auk.a() { // from class: com.xiaopeng.musicradio.widget.gallery.XmGallery.2
                @Override // defpackage.auk.a
                public void a(int i) {
                    if (XmGallery.this.a.getCurrentItem() != i || XmGallery.this.i == null) {
                        return;
                    }
                    XmGallery.this.i.c();
                }
            });
        }
    }

    public void a(int i, boolean z) {
        ViewPager viewPager = this.a;
        if (viewPager == null || i != viewPager.getCurrentItem()) {
            this.a.setCurrentItem(i, z);
        }
    }

    public void setOnGalleryPageSelectListener(a aVar) {
        this.i = aVar;
    }

    @Override // defpackage.bhz
    public bik getVuiPriority() {
        return bik.LEVEL3;
    }

    @Override // defpackage.bhz
    public String getVuiAction() {
        return big.SCROLLBYX.a();
    }

    @Override // defpackage.bhz
    public bih getVuiElementType() {
        return bih.VIEWPAGER;
    }

    @Override // defpackage.bhz
    public String getVuiElementId() {
        return "" + getId();
    }

    @Override // defpackage.bhz
    public JSONObject getVuiProps() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VuiConstants.PROPS_SCROLLLEFT, true);
            jSONObject.put(VuiConstants.PROPS_SCROLLRIGHT, true);
            jSONObject.put(VuiConstants.PROPS_VOICECONTROL, true);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // defpackage.bhz
    public bij getVuiMode() {
        return bij.NORMAL;
    }
}
