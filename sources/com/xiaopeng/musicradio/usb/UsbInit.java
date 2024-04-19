package com.xiaopeng.musicradio.usb;

import com.xiaopeng.musicradio.service.c;
/* loaded from: classes2.dex */
public class UsbInit extends arb {
    @Override // defpackage.arb
    public void igOff() {
    }

    @Override // defpackage.arb
    public void igOn() {
    }

    @Override // defpackage.arb
    public void initDelay() {
    }

    @Override // defpackage.arb
    public void initNow() {
    }

    @Override // defpackage.arb
    public void initPlayer() {
    }

    @Override // defpackage.arb
    public void onMusicBinded() {
    }

    @Override // defpackage.arb
    public void registerService() {
        c.a().a(bas.class, "com.xiaopeng.musicradio.service.UsbService");
    }
}
