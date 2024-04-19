package com.xiaopeng.musicradio.usb.singer.detail;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.singer.detail.present.UsbSingerDetailPresenter;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.bb;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
import defpackage.aep;
import java.util.List;
@Route(path = "/usbview/usb_singer_detail")
/* loaded from: classes2.dex */
public class SingerDetailActivity extends bat<bbv, UsbSingerDetailPresenter> implements bbv {
    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicUsbSingerDetail";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public UsbSingerDetailPresenter e() {
        return new UsbSingerDetailPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return a.c.layout_usb_base_detail;
    }

    @Override // defpackage.bat, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        if (getIntent() != null) {
            this.k = getIntent().getStringExtra("extra_singer_name");
            a(bbh.a().h().get(this.k).c());
            this.f.setTitle(this.k);
        }
    }

    @Override // defpackage.bat, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.h.a(new aep.c() { // from class: com.xiaopeng.musicradio.usb.singer.detail.SingerDetailActivity.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                List<MusicInfo> r;
                if (i2 >= 0 && (r = SingerDetailActivity.this.r()) != null && i2 <= r.size() - 1 && r.size() > 0) {
                    String json = SingerDetailActivity.this.q().toJson();
                    if (TextUtils.equals(json, apk.i().x())) {
                        bcd.a().b(r, json, i2, r.get(i2));
                    } else {
                        bcd.a().b(r, json, i2, null);
                    }
                    bcc.f();
                }
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.usb.singer.detail.SingerDetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String playText = SingerDetailActivity.this.i.getPlayText();
                if (TextUtils.equals(playText, be.a(b.f.bt_play_all))) {
                    List<MusicInfo> r = SingerDetailActivity.this.r();
                    if (r.size() > 0) {
                        bcd.a().b(r, SingerDetailActivity.this.q().toJson(), bb.a(r), null);
                        bcc.g();
                    }
                } else if (TextUtils.equals(playText, be.a(b.f.bt_pause))) {
                    apk.i().pause();
                } else if (TextUtils.equals(playText, be.a(b.f.bt_continue_all))) {
                    apk.i().play();
                }
            }
        });
    }

    @Override // defpackage.bat
    protected ListSignBean q() {
        return ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_SINGER_PREFIX + bce.a(this.k));
    }

    @Override // defpackage.bat
    protected List<MusicInfo> r() {
        return bbh.a().h().get(this.k).c();
    }

    @Override // defpackage.bbv
    public void s() {
        finish();
    }

    @Override // defpackage.bbv
    public void t() {
        x();
        this.h.d();
    }

    @Override // defpackage.bbv
    public void u() {
        A();
    }

    @Override // defpackage.bat
    protected boolean v() {
        String x = apk.i().x();
        MusicInfo d = apk.i().d();
        ListSignBean listSignBean = (ListSignBean) z.a(x, (Class<Object>) ListSignBean.class);
        if (listSignBean == null || d == null || TextUtils.isEmpty(x)) {
            return false;
        }
        String tag = listSignBean.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.USB_SINGER_PREFIX);
        sb.append(bce.a(this.k));
        return TextUtils.equals(tag, sb.toString());
    }

    @Override // defpackage.bbv
    public void w() {
        this.h.d();
    }
}
