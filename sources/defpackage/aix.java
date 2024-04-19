package defpackage;

import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.g;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.utils.y;
import defpackage.aht;
/* compiled from: MusicViewHolder.java */
/* renamed from: aix  reason: default package */
/* loaded from: classes2.dex */
public class aix extends g<akc> {
    public static int y = 41;
    public static int z = 255;

    public aix(akc akcVar) {
        super(akcVar, true);
        akcVar.e.setOnClickListener(this);
        akcVar.c.setOnClickListener(this);
        Resources resources = akcVar.k.getResources();
        akcVar.k.setHeight(Integer.valueOf(resources.getDimensionPixelSize(aht.a.dp_24)));
        akcVar.k.setMarginRight(Integer.valueOf(resources.getDimensionPixelSize(aht.a.dp_4)));
        akcVar.k.setLabelMarginRight(Integer.valueOf(resources.getDimensionPixelSize(aht.a.dp_10)));
    }

    @Override // com.xiaopeng.musicradio.datalist.g
    public void c(int i) {
        int i2;
        super.c(i);
        MusicInfo musicInfo = (MusicInfo) D();
        int i3 = i + 1;
        ((akc) this.t).l.setText(String.valueOf(i3));
        ((akc) this.t).p.setText(musicInfo.getSong());
        ((akc) this.t).k.setMusicInfo(musicInfo);
        ((akc) this.t).o.setText(musicInfo.getSinger());
        y.a(musicInfo.getLogo(), aht.b.pic_covers_music_list_220, ((akc) this.t).h);
        boolean a = a(musicInfo);
        boolean H = H();
        if (a) {
            ((akc) this.t).f.setVisibility(8);
            ((akc) this.t).f.setOnClickListener(null);
            ((akc) this.t).n.setVisibility(0);
        } else {
            ((akc) this.t).n.setVisibility(8);
            ((akc) this.t).f.setVisibility(0);
            ((akc) this.t).f.setOnClickListener(this);
            boolean a2 = aml.a(musicInfo, H);
            b(a2);
            ((akc) this.t).f.setSelected(a2);
        }
        ((akc) this.t).l.setSelected(false);
        Pair<Boolean, Boolean> c = c(musicInfo);
        boolean booleanValue = ((Boolean) c.first).booleanValue();
        boolean booleanValue2 = ((Boolean) c.second).booleanValue();
        if (this.w.q()) {
            ((akc) this.t).l.setVisibility(0);
            c(false);
            ((akc) this.t).c.setVisibility(0);
            if (b(musicInfo)) {
                ((akc) this.t).c.setEnabled(false);
            } else {
                ((akc) this.t).c.setEnabled(true);
                ((akc) this.t).c.setChecked(this.w.a(E()));
            }
            ((akc) this.t).m.setSelected(false);
            ((akc) this.t).e.setSelected(false);
            booleanValue2 = false;
            i2 = 4;
        } else {
            c(true);
            ((akc) this.t).c.setVisibility(8);
            i2 = 0;
        }
        if (booleanValue2) {
            I();
            i2 = 4;
        } else {
            d(a);
        }
        ((akc) this.t).d.setVisibility(i2);
        amk.a(this.a, i, i3, musicInfo.getSong(), "ms_item_");
        amk.a(this.a, big.CLICK);
        amk.a(((akc) this.t).e, i, (String) null, booleanValue, "ms_play_");
        amk.b(((akc) this.t).f, i, "ms_collect_");
        G();
        amk.b(this.a);
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
        ((akc) this.t).m.setVisibility(h.a().b() ? 0 : 8);
    }

    private void b(boolean z2) {
        if (z2) {
            ((akc) this.t).f.setImageResource(aht.b.ic_32_list_like_hl);
        } else {
            ((akc) this.t).f.setImageResource(aht.b.ic_32_list_like_nor);
        }
    }

    private void c(boolean z2) {
        if (z2) {
            ((akc) this.t).f.setOnClickListener(this);
            ((akc) this.t).f.setImageAlpha(z);
            return;
        }
        ((akc) this.t).f.setOnClickListener(null);
        ((akc) this.t).f.setImageAlpha(y);
    }

    private Pair<Boolean, Boolean> c(MusicInfo musicInfo) {
        int i = -1;
        if (aml.a(musicInfo)) {
            this.w.f(this.u);
            i = aml.b();
        } else if (this.w.m() == this.u) {
            this.w.a(-1, false);
        }
        if (!this.w.q() && (i == 1 || i == 2 || i == 3)) {
            ((akc) this.t).m.setSelected(true);
            if (h.a().b()) {
                ((akc) this.t).l.setSelected(true);
            }
            ((akc) this.t).d.setSelected(true);
            ((akc) this.t).e.setSelected(true);
        } else {
            ((akc) this.t).m.setSelected(false);
            ((akc) this.t).d.setSelected(false);
            ((akc) this.t).e.setSelected(false);
        }
        return ((akc) this.t).d.a(i);
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
            super.onClick(view);
            return;
        }
        super.onClick(view);
        if (this.w.q()) {
            ((akc) this.t).c.setChecked(this.w.a(E()));
        }
    }

    private void I() {
        ((akc) this.t).g.setVisibility(0);
        if (((akc) this.t).f.getVisibility() == 0) {
            ((akc) this.t).f.setVisibility(4);
        }
        if (((akc) this.t).n.getVisibility() == 0) {
            ((akc) this.t).n.setVisibility(4);
        }
    }

    private void d(boolean z2) {
        if (z2) {
            ((akc) this.t).n.setVisibility(0);
        } else {
            ((akc) this.t).f.setVisibility(0);
        }
        ((akc) this.t).g.setVisibility(8);
    }
}
