package defpackage;

import android.content.Context;
import android.view.View;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.view.mymusic.MusicListItemLabelView;
import com.xiaopeng.musicradio.vui.b;
import com.xiaopeng.musicradio.widget.PlayStateWidget;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: SongItemView.java */
/* renamed from: azv  reason: default package */
/* loaded from: classes2.dex */
public class azv extends azn {
    protected XTextView d;
    protected XTextView e;
    protected MusicListItemLabelView f;
    protected XImageView g;
    protected PlayStateWidget h;
    private XLoading i;
    private XImageView j;
    private XRelativeLayout k;
    private XView l;

    public azv(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azn
    public void a() {
        super.a();
        this.d = (XTextView) findViewById(a.d.rank_number);
        this.e = (XTextView) findViewById(a.d.tv_sub_title);
        this.f = (MusicListItemLabelView) findViewById(a.d.music_label);
        this.g = (XImageView) findViewById(a.d.iv_fav_icon);
        this.h = (PlayStateWidget) findViewById(a.d.iv_play_list_state);
        this.i = (XLoading) findViewById(a.d.lottie_loading);
        this.j = (XImageView) findViewById(a.d.tv_index_bg);
        this.k = (XRelativeLayout) findViewById(a.d.layout_item_root);
        this.l = (XView) findViewById(a.d.view_item_vui);
    }

    @Override // defpackage.azn
    protected int getLayoutId() {
        return a.e.item_search_song_layout;
    }

    @Override // defpackage.azn
    protected int getDeafultAlbumLogo() {
        return a.c.pic_covers_music_220;
    }

    public void setIndex(int i) {
        this.d.setText(String.valueOf(i));
        this.g.setVuiPosition(i - 1);
        XImageView xImageView = this.g;
        xImageView.setVuiElementId(this.g.getId() + "_" + i);
    }

    public void a(String str, boolean z, boolean z2) {
        this.e.setText(str);
        this.f.a(z, 40, z2);
        be.a(getContext(), this.e, bak.c(a.C0165a.x_theme_primary_normal), str, ayi.a().c());
    }

    @Override // defpackage.azn
    public void a(String str, String str2) {
        super.a(str, str2);
        this.j.setVisibility(h.a().b() ? 0 : 8);
    }

    public void setIsLove(boolean z) {
        this.g.setSelected(z);
    }

    public void setFavClickListener(View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    @Override // defpackage.azn
    public void a(int i, int i2, String str) {
        if (i != -1) {
            this.h.setVisibility(0);
            this.h.a(i, i != -1);
            if (i == 1) {
                this.i.setVisibility(0);
                this.g.setVisibility(8);
            } else {
                this.i.setVisibility(8);
                this.g.setVisibility(0);
            }
            if (!h.a().b()) {
                this.d.setSelected(false);
            } else {
                this.d.setSelected(true);
            }
        } else {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            this.g.setVisibility(0);
        }
        this.l.setVuiPosition(i2);
        b.a(this.g.getVuiPosition(), this.b.getText().toString(), this.k, i, this.l);
    }
}
