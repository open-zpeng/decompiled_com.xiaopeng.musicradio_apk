package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
import com.xiaopeng.musicradio.music.b;
/* compiled from: SongQualityGuidePopWindow.java */
/* renamed from: atd  reason: default package */
/* loaded from: classes2.dex */
public class atd extends PopupWindow implements ThemeWatcher.OnThemeSwitchListener {
    private TextView a;
    private CountDownTimer b;

    public atd(Context context) {
        super(context);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        View inflate = LayoutInflater.from(context).inflate(b.e.layout_song_quality_guide_pop, (ViewGroup) null, false);
        setContentView(inflate);
        this.a = (TextView) inflate.findViewById(b.d.tv_tips);
        this.a.setBackground(bak.b(b.c.img_tost_layer));
        this.a.setTextColor(bak.a(b.a.album_name));
    }

    @Override // com.xiaopeng.lib.themeswitch.ThemeWatcher.OnThemeSwitchListener
    public void onSwitchTheme(int i) {
        this.a.setBackground(bak.b(b.c.img_tost_layer));
        this.a.setTextColor(bak.a(b.a.album_name));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
        a();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        b();
        super.dismiss();
    }

    public void a() {
        this.b = new CountDownTimer(10000L, 1000L) { // from class: atd.1
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (atd.this.isShowing()) {
                    atd.this.dismiss();
                }
            }
        };
        this.b.start();
    }

    private void b() {
        CountDownTimer countDownTimer = this.b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.b = null;
        }
    }

    public void a(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
