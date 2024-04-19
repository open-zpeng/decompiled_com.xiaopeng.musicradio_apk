package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import defpackage.aht;
/* compiled from: BlueMusicViewHolder.java */
/* renamed from: alm  reason: default package */
/* loaded from: classes2.dex */
public class alm extends aix {
    public alm(akc akcVar) {
        super(akcVar);
    }

    @Override // defpackage.aix, com.xiaopeng.musicradio.datalist.g
    public void c(int i) {
        super.c(i);
        if (aml.b((MusicInfo) D())) {
            ((akc) this.t).o.setText(aht.e.playlist_new_blue_tips);
        }
    }
}
