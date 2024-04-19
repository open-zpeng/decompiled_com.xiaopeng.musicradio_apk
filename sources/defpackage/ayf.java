package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicArtistBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.view.mymusic.MusicListItemLabelView;
import com.xiaopeng.musicradio.vui.b;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.PlayStateWidget;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
/* compiled from: SearchSongItemAdapter.java */
/* renamed from: ayf  reason: default package */
/* loaded from: classes2.dex */
public class ayf extends axy<MusicSongBean, a> {
    public ayf(Context context, int i, axz axzVar) {
        super(context, i, axzVar);
        a(new aep.c() { // from class: ayf.1
            @Override // defpackage.aep.c
            public void a(int i2, int i3) {
                MusicSongBean g = ayf.this.g(i3);
                if (i2 == 2) {
                    if (ayf.this.g != null) {
                        ayf.this.g.b(g);
                    }
                } else if (i2 != 1 || ayf.this.g == null) {
                } else {
                    ayf.this.g.a(g);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axy, defpackage.aeq
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View b = super.b(layoutInflater, viewGroup);
        if (b.getLayoutParams() instanceof GridLayoutManager.b) {
            ((GridLayoutManager.b) b.getLayoutParams()).topMargin = 0;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axy
    /* renamed from: b */
    public a a(View view) {
        return new a(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        MusicSongBean g;
        if (f(i) || !(vVar instanceof a) || (g = g(i)) == null) {
            return;
        }
        a aVar = (a) vVar;
        String str = "";
        MusicArtistBean artist = g.getArtist();
        MusicAlbumBean album = g.getAlbum();
        if (album != null && !TextUtils.isEmpty(album.getLogo())) {
            str = album.getLogo();
        }
        if (artist != null && TextUtils.isEmpty(str) && !TextUtils.isEmpty(artist.getLogo())) {
            str = artist.getLogo();
        }
        y.c(this.f, str, a.c.pic_covers_music_220, aVar.s);
        aVar.w.setText(TextUtils.isEmpty(g.getHighlightSongName()) ? g.getSongName() : g.getHighlightSongName());
        aVar.x.setText(TextUtils.isEmpty(g.getHightlightSinger()) ? g.getSingers() : g.getHightlightSinger());
        aVar.u.setText(String.valueOf(i + 1));
        aVar.y.a(g.isNeedVip(), 40, g.getSupportSq().booleanValue());
        int a2 = this.g.a(g.getHash(), g.getAlbum().getId());
        aVar.v.a(a2, a2 != -1);
        aVar.A.setVisibility(h.a().b() ? 0 : 8);
        if (a2 != -1) {
            aVar.a.setSelected(true);
            aVar.v.setVisibility(0);
            if (a2 == 1) {
                aVar.z.setVisibility(0);
                aVar.t.setVisibility(8);
            } else {
                aVar.z.setVisibility(8);
                aVar.t.setVisibility(0);
            }
            if (!h.a().b()) {
                aVar.u.setSelected(false);
            } else {
                aVar.u.setSelected(true);
            }
        } else {
            aVar.a.setSelected(false);
            aVar.z.setVisibility(8);
            aVar.t.setVisibility(0);
        }
        aVar.t.setSelected(this.g.c(g));
        aVar.E.a(i);
        aVar.D.a(i);
        aVar.t.setVuiPosition(i);
        XImageView xImageView = aVar.t;
        xImageView.setVuiElementId(aVar.t.getId() + "_" + i);
        b.a(i, g.getSongName(), aVar.B, a2, aVar.C);
        VuiEngine.getInstance(aVar.B.getContext()).setExecuteVirtualTag(aVar.B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchSongItemAdapter.java */
    /* renamed from: ayf$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private XImageView A;
        private XRelativeLayout B;
        private XView C;
        private aep<RecyclerView.v>.e D;
        private aep<RecyclerView.v>.e E;
        private MusicCircleImageView s;
        private XImageView t;
        private XTextView u;
        private PlayStateWidget v;
        private XTextView w;
        private XTextView x;
        private MusicListItemLabelView y;
        private XLoading z;

        public a(View view) {
            super(view);
            this.s = (MusicCircleImageView) view.findViewById(a.d.iv_logo);
            this.t = (XImageView) view.findViewById(a.d.iv_fav_icon);
            this.v = (PlayStateWidget) view.findViewById(a.d.iv_play_list_state);
            this.u = (XTextView) view.findViewById(a.d.rank_number);
            this.w = (XTextView) view.findViewById(a.d.tv_title);
            this.x = (XTextView) view.findViewById(a.d.tv_sub_title);
            this.y = (MusicListItemLabelView) view.findViewById(a.d.music_label);
            this.z = (XLoading) view.findViewById(a.d.lottie_loading);
            this.A = (XImageView) view.findViewById(a.d.tv_index_bg);
            this.C = (XView) view.findViewById(a.d.view_item_vui);
            this.B = (XRelativeLayout) view.findViewById(a.d.layout_item_root);
            this.D = new aep.e();
            this.D.b(2);
            this.t.setOnClickListener(this.D);
            this.E = new aep.e();
            this.E.b(1);
            view.setOnClickListener(this.E);
            this.t.setImageResource(a.c.bg_btn_love_selector);
        }
    }
}
