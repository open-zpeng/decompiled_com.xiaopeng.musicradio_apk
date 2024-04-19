package defpackage;

import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.album.present.AlbumMainPresenter;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.bb;
import defpackage.aep;
import java.util.Arrays;
import java.util.List;
/* compiled from: AlbumMainFragment.java */
@Route(path = "/usb/main/album")
/* renamed from: baq  reason: default package */
/* loaded from: classes2.dex */
public class baq extends bau<bar, AlbumMainPresenter, bav> implements bar {
    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "UsbAlbumMain";
    }

    @Override // defpackage.bau
    public int y() {
        return 33;
    }

    @Override // defpackage.bau, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.f.setNoResultText(a.d.no_usb_album);
    }

    @Override // defpackage.bau, com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        super.E_();
        this.e.a(new aep.c() { // from class: baq.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                bav bavVar = (bav) baq.this.e.g(i2);
                if (apk.i().y() || bavVar == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        ListSignBean a = ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_ALBUM_PREFIX + bce.a(bavVar.c()));
                        bav bavVar2 = bbh.a().i().get(bavVar.c());
                        if (bavVar2 != null) {
                            bcd.a().c(bavVar2.d(), a.toJson(), bb.a(bavVar2.d()), null);
                            bcc.j();
                            return;
                        }
                        return;
                    case 1:
                        sp.a().a("/usbview/usb_album_detail").withString("extra_album_name", bavVar.c()).navigation();
                        bcc.m();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @Override // defpackage.bau, defpackage.bar
    public void a() {
        super.a();
    }

    @Override // defpackage.bau, defpackage.bar
    public void r() {
        super.r();
    }

    @Override // defpackage.bar
    public void a(List<bav> list) {
        super.A();
        ((bap) this.e).c(true);
        this.e.a(list);
    }

    @Override // defpackage.bau, defpackage.bar
    public void s() {
        bap bapVar = (bap) this.e;
        String x = apk.i().x();
        int c = aei.a().c();
        int l = bapVar.l();
        if (l != -1) {
            c(l);
        }
        List<bav> n = bapVar.n();
        for (int i = 0; i < n.size(); i++) {
            bav bavVar = n.get(i);
            if (c == 0 && !TextUtils.isEmpty(x) && x.contains(ListSignBean.USB_ALBUM_PREFIX) && x.contains(bce.a(bavVar.c()))) {
                c(i);
            }
        }
    }

    @Override // defpackage.bau, defpackage.bar
    public void t() {
        super.t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bau, com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: u */
    public AlbumMainPresenter ao_() {
        return new AlbumMainPresenter();
    }

    @Override // defpackage.bau
    public List<bav> v() {
        return ((bap) this.e).o();
    }

    @Override // defpackage.bau
    public bbn w() {
        return bbk.a();
    }

    @Override // defpackage.bau
    public aes x() {
        return new bap(getContext());
    }

    @Override // defpackage.bar
    public void z() {
        this.e.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MusicUsbMain");
    }

    @Override // defpackage.bau
    protected void b(boolean z) {
        super.b(z);
        ((bap) this.e).c(true);
    }
}
