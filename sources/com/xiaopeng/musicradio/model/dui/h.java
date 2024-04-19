package com.xiaopeng.musicradio.model.dui;

import android.util.Log;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.protocol.node.dialog.DialogNode;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.agg;
import defpackage.bep;
/* compiled from: DuiSpeechModel.java */
/* loaded from: classes.dex */
public class h extends bgo {
    private boolean b = bfb.b().g().g();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DuiSpeechModel.java */
    /* loaded from: classes.dex */
    public static class a {
        static final h a = new h();
    }

    public static h a() {
        return a.a;
    }

    public h() {
        Log.i("DuiSpeechModel", "DuiSpeechModel: =====" + this.b);
        a(DialogNode.class, new com.xiaopeng.speech.protocol.node.dialog.a() { // from class: com.xiaopeng.musicradio.model.dui.h.1
            @Override // com.xiaopeng.speech.protocol.node.dialog.a, com.xiaopeng.speech.protocol.node.dialog.b
            public void a(bgy bgyVar) {
                super.a(bgyVar);
                Log.i("DuiSpeechModel", "onDialogStart: ======");
                h.this.b = true;
                u.c(new agg.y());
            }

            @Override // com.xiaopeng.speech.protocol.node.dialog.a, com.xiaopeng.speech.protocol.node.dialog.b
            public void a(bgx bgxVar) {
                super.a(bgxVar);
                Log.i("DuiSpeechModel", "onDialogEnd: =====");
                h.this.b = false;
                u.c(new agg.y());
            }
        });
        bfb.b().a(com.xiaopeng.musicradio.a.a, new bep.a() { // from class: com.xiaopeng.musicradio.model.dui.h.2
            @Override // defpackage.bep.a
            public void a(bew bewVar) {
            }

            @Override // defpackage.bep.a
            public void a() {
                Log.i("DuiSpeechModel", "onDisconnect: ======");
                h.this.b = false;
                u.c(new agg.y());
            }
        });
    }

    public void a(bgy bgyVar) {
        Log.i("DuiSpeechModel", "onDialogStart: ======");
    }

    public void a(bgx bgxVar) {
        Log.i("DuiSpeechModel", "onDialogEnd: =====");
    }

    public boolean b() {
        return this.b && !VuiEngine.getInstance(com.xiaopeng.musicradio.a.a).isVuiFeatureDisabled();
    }

    public boolean c() {
        return this.b;
    }
}
