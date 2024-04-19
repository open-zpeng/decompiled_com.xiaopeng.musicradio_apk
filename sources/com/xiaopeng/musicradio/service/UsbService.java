package com.xiaopeng.musicradio.service;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.bb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class UsbService extends a implements bas {
    private static final String TAG = "UsbService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    @Override // defpackage.bas
    public void startUsbMain() {
        sp.a().a("/usbview/usbmainview").navigation();
    }

    @Override // defpackage.bas
    public void requestMusicInfos(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MusicInfo) it.next());
        }
        bbh.a().a(arrayList);
        bbm.a().c((List) arrayList);
    }

    @Override // defpackage.bas
    public int getUsbState4XiaoP() {
        return bbh.a().j();
    }

    @Override // defpackage.bas
    public void addRebootPlayTask() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.service.UsbService.1
            @Override // java.lang.Runnable
            public void run() {
                bbh.a().k();
            }
        });
    }

    @Override // defpackage.bas
    public boolean hasMountedUsbDisk() {
        return bbh.a().b();
    }

    @Override // defpackage.bas
    public void playUsbMusic() {
        List<MusicInfo> f = bbh.a().f();
        if (f != null) {
            if (ad.b(apk.i().x())) {
                if (apk.i().getPlayState() != 2) {
                    apk.i().play();
                    return;
                }
                return;
            }
            amq amqVar = new amq(ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_MUSIC_TITLE).toJson(), 1, 50, f, bb.a(f)) { // from class: com.xiaopeng.musicradio.service.UsbService.2
                @Override // defpackage.ahp
                public boolean n() {
                    return true;
                }
            };
            amqVar.b(f.size() / 50);
            apk.i().a(amqVar);
            return;
        }
        LogUtils.e(TAG, "getUsbMusicInfos:null");
    }
}
