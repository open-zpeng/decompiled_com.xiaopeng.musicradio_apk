package com.xiaopeng.musicradio.program.choice.view.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import com.xiaopeng.musicradio.program.b;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class VerticalBannerTitle extends TextSwitcher implements ViewSwitcher.ViewFactory {
    private List<aws> a;
    private Handler b;
    private int c;
    private a d;

    /* loaded from: classes2.dex */
    public interface a {
        void a(long j);

        void a(String str);
    }

    static /* synthetic */ int d(VerticalBannerTitle verticalBannerTitle) {
        int i = verticalBannerTitle.c;
        verticalBannerTitle.c = i + 1;
        return i;
    }

    public VerticalBannerTitle(Context context) {
        super(context);
        this.c = -1;
        this.a = new ArrayList();
    }

    public VerticalBannerTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        this.a = new ArrayList();
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        return LayoutInflater.from(getContext()).inflate(b.e.item_banner_title, (ViewGroup) null);
    }

    public void setCallback(a aVar) {
        this.d = aVar;
    }

    public void setTextList(List<aws> list) {
        this.a.clear();
        this.a.addAll(list);
        this.c = -1;
    }

    public void setTextStillTime(final long j) {
        this.b = new Handler() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.VerticalBannerTitle.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        if (VerticalBannerTitle.this.b.hasMessages(2)) {
                            VerticalBannerTitle.this.b.removeMessages(2);
                        }
                        if (VerticalBannerTitle.this.c == -1) {
                            VerticalBannerTitle.this.b.sendEmptyMessage(2);
                            return;
                        } else {
                            VerticalBannerTitle.this.b.sendEmptyMessageDelayed(2, j);
                            return;
                        }
                    case 1:
                        VerticalBannerTitle.this.b.removeMessages(2);
                        return;
                    case 2:
                        if (VerticalBannerTitle.this.a.size() > 0) {
                            VerticalBannerTitle.d(VerticalBannerTitle.this);
                            VerticalBannerTitle.this.c();
                            VerticalBannerTitle.this.b.sendEmptyMessageDelayed(2, j);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        List<aws> list = this.a;
        setText(list.get(this.c % list.size()).a());
        a aVar = this.d;
        if (aVar != null) {
            List<aws> list2 = this.a;
            aVar.a(list2.get(this.c % list2.size()).b());
            a aVar2 = this.d;
            List<aws> list3 = this.a;
            aVar2.a(list3.get(this.c % list3.size()).a());
        }
    }

    public void setAnimTime(long j) {
        setFactory(this);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) j, 0.0f);
        translateAnimation.setDuration(j);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-j));
        translateAnimation2.setDuration(j);
        translateAnimation2.setInterpolator(new AccelerateInterpolator());
        setInAnimation(translateAnimation);
        setOutAnimation(translateAnimation2);
    }

    public void a() {
        Handler handler = this.b;
        if (handler != null) {
            if (handler.hasMessages(0)) {
                this.b.removeMessages(0);
            }
            this.b.sendEmptyMessage(0);
        }
    }

    public void b() {
        Handler handler = this.b;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
