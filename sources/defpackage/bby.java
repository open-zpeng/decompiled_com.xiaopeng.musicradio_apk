package defpackage;

import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.singer.present.SingerMainPresenter;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.bb;
import defpackage.aep;
import java.util.Arrays;
import java.util.List;
/* compiled from: SingerMainFragment.java */
@Route(path = "/usb/main/singer")
/* renamed from: bby  reason: default package */
/* loaded from: classes2.dex */
public class bby extends bau<bbw, SingerMainPresenter, baz> implements bbw {
    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "UsbSingerMain";
    }

    @Override // defpackage.bau
    public int y() {
        return 76;
    }

    @Override // defpackage.bau, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.f.setNoResultText(a.d.no_usb_singer);
    }

    @Override // defpackage.bau, com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        super.E_();
        this.e.a(new aep.c() { // from class: bby.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                baz bazVar = (baz) bby.this.e.g(i2);
                if (apk.i().y() || bazVar == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        ListSignBean a = ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_SINGER_PREFIX + bce.a(bazVar.b()));
                        baz bazVar2 = bbh.a().h().get(bazVar.b());
                        if (bazVar2 != null) {
                            bcd.a().b(bazVar2.c(), a.toJson(), bb.a(bazVar2.c()), null);
                            bcc.e();
                            return;
                        }
                        return;
                    case 1:
                        sp.a().a("/usbview/usb_singer_detail").withString("extra_singer_name", bazVar.b()).navigation();
                        bcc.h();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bau, com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: u */
    public SingerMainPresenter ao_() {
        return new SingerMainPresenter();
    }

    @Override // defpackage.bau, defpackage.bar
    public void a() {
        super.a();
    }

    @Override // defpackage.bau, defpackage.bar
    public void r() {
        super.r();
    }

    @Override // defpackage.bbw
    public void a(List<baz> list) {
        super.A();
        ((bbx) this.e).c(true);
        this.e.a(list);
    }

    @Override // defpackage.bau, defpackage.bar
    public void s() {
        bbx bbxVar = (bbx) this.e;
        String x = apk.i().x();
        int c = aei.a().c();
        int l = bbxVar.l();
        if (l != -1) {
            c(l);
        }
        List<baz> n = bbxVar.n();
        for (int i = 0; i < n.size(); i++) {
            baz bazVar = n.get(i);
            if (c == 0 && !TextUtils.isEmpty(x) && x.contains(ListSignBean.USB_SINGER_PREFIX) && x.contains(bce.a(bazVar.b()))) {
                c(i);
            }
        }
    }

    @Override // defpackage.bau
    protected void b(boolean z) {
        super.b(z);
        ((bbx) this.e).c(true);
    }

    @Override // defpackage.bau, defpackage.bar
    public void t() {
        super.t();
    }

    @Override // defpackage.bau
    public List<baz> v() {
        return ((bbx) this.e).o();
    }

    @Override // defpackage.bau
    public bbn w() {
        return bbp.a();
    }

    @Override // defpackage.bau
    public aes x() {
        return new bbx(getContext());
    }

    @Override // defpackage.bbw
    public void av_() {
        this.e.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MusicUsbMain");
    }
}
