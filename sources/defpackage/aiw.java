package defpackage;

import android.util.Pair;
import android.view.View;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.g;
import com.xiaopeng.musicradio.model.dui.h;
import defpackage.aht;
/* compiled from: MusicMainViewHolder.java */
/* renamed from: aiw  reason: default package */
/* loaded from: classes2.dex */
public class aiw extends g<ake> {
    public static int y = 41;
    public static int z = 255;

    public aiw(ake akeVar) {
        super(akeVar, true);
        akeVar.d.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.g
    public void c(int i) {
        super.c(i);
        MusicInfo musicInfo = (MusicInfo) D();
        int i2 = i + 1;
        ((ake) this.t).g.setText(String.valueOf(i2));
        ((ake) this.t).k.setText(musicInfo.getSong());
        ((ake) this.t).j.setText(musicInfo.getSinger());
        boolean a = a(musicInfo);
        boolean H = H();
        if (a) {
            ((ake) this.t).e.setVisibility(8);
            ((ake) this.t).e.setOnClickListener(null);
            ((ake) this.t).i.setVisibility(0);
        } else {
            ((ake) this.t).i.setVisibility(8);
            ((ake) this.t).e.setVisibility(0);
            ((ake) this.t).e.setOnClickListener(this);
            boolean a2 = aml.a(musicInfo, H);
            b(a2);
            ((ake) this.t).e.setSelected(a2);
        }
        ((ake) this.t).g.setSelected(false);
        Pair<Boolean, Boolean> c = c(musicInfo);
        boolean booleanValue = ((Boolean) c.first).booleanValue();
        boolean booleanValue2 = ((Boolean) c.second).booleanValue();
        if (this.w.q()) {
            ((ake) this.t).g.setVisibility(0);
            c(false);
            ((ake) this.t).h.setSelected(false);
            ((ake) this.t).d.setSelected(false);
            booleanValue2 = false;
        } else {
            c(true);
        }
        if (booleanValue2) {
            I();
        } else {
            d(a);
        }
        amk.a(this.a, i, i2, musicInfo.getSong(), "ms_item_");
        amk.a(this.a, big.CLICK);
        amk.a(((ake) this.t).d, i, (String) null, booleanValue, "ms_play_");
        amk.b(((ake) this.t).e, i, "ms_collect_");
        G();
        if (H) {
            aml.c(musicInfo);
        }
    }

    private boolean a(MusicInfo musicInfo) {
        return musicInfo.getMusicFrom() == 61 || musicInfo.getMusicFrom() == 60 || musicInfo.getOldMusicFrom() == 61 || musicInfo.getOldMusicFrom() == 60;
    }

    private boolean b(MusicInfo musicInfo) {
        return a("CUSTOM_ADDED", false) && musicInfo.isCustomAdded();
    }

    private boolean H() {
        return a("HISTORY_MUSIC", false);
    }

    public void G() {
        ((ake) this.t).h.setVisibility(h.a().b() ? 0 : 8);
    }

    private void b(boolean z2) {
        if (z2) {
            ((ake) this.t).e.setImageResource(aht.b.ic_32_list_like_hl);
        } else {
            ((ake) this.t).e.setImageResource(aht.b.ic_32_list_like_nor);
        }
    }

    private void c(boolean z2) {
        if (z2) {
            ((ake) this.t).e.setOnClickListener(this);
            ((ake) this.t).e.setImageAlpha(z);
            return;
        }
        ((ake) this.t).e.setOnClickListener(null);
        ((ake) this.t).e.setImageAlpha(y);
    }

    private Pair<Boolean, Boolean> c(MusicInfo musicInfo) {
        int i = -1;
        if (aml.a(musicInfo)) {
            this.w.f(this.u);
            i = aml.b();
        } else if (this.w.m() == this.u) {
            this.w.a(-1, false);
        }
        if (i == 1 || i == 2 || i == 3) {
            ((ake) this.t).h.setSelected(true);
            if (h.a().b()) {
                ((ake) this.t).g.setSelected(true);
            }
            ((ake) this.t).d.setSelected(true);
        } else {
            ((ake) this.t).h.setSelected(false);
            ((ake) this.t).d.setSelected(false);
        }
        return ((ake) this.t).c.a(i);
    }

    @Override // com.xiaopeng.musicradio.datalist.g, android.view.View.OnClickListener
    public void onClick(View view) {
        MusicInfo musicInfo = (MusicInfo) D();
        if (b(musicInfo)) {
            return;
        }
        if (view.getId() == aht.c.iv_icon) {
            if (aml.a(musicInfo, H())) {
                aml.b(musicInfo, false);
            } else {
                aml.b(musicInfo, true);
            }
        }
        super.onClick(view);
    }

    private void I() {
        ((ake) this.t).f.setVisibility(0);
        if (((ake) this.t).e.getVisibility() == 0) {
            ((ake) this.t).e.setVisibility(4);
        }
        if (((ake) this.t).i.getVisibility() == 0) {
            ((ake) this.t).i.setVisibility(4);
        }
    }

    private void d(boolean z2) {
        if (((ake) this.t).d.isSelected()) {
            if (((ake) this.t).e.getVisibility() == 0) {
                ((ake) this.t).e.setVisibility(4);
            }
            if (((ake) this.t).i.getVisibility() == 0) {
                ((ake) this.t).i.setVisibility(4);
            }
        } else if (z2) {
            ((ake) this.t).i.setVisibility(0);
        } else {
            ((ake) this.t).e.setVisibility(0);
        }
        ((ake) this.t).f.setVisibility(8);
    }
}
