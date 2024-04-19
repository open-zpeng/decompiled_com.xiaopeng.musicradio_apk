package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.view.mymusic.MusicListItemLabelView;
import com.xiaopeng.musicradio.widget.AVLoadingIndicatorView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import java.util.List;
/* compiled from: MusicPlayListAdapter.java */
/* loaded from: classes.dex */
public class k extends aet<d, RecyclerView.v> {
    private c f;

    /* compiled from: MusicPlayListAdapter.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(MusicInfo musicInfo);

        void b(MusicInfo musicInfo);
    }

    /* compiled from: MusicPlayListAdapter.java */
    /* loaded from: classes.dex */
    public static class d extends aen {
        public String a;
        public int b;
        public MusicInfo c;
        public boolean d;
        public boolean e;
        public boolean f;
    }

    public k(Context context) {
        super(context, b.e.item_music_play_list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aer
    public boolean a(d dVar, d dVar2, int i, int i2) {
        return be.a(dVar.a, dVar2.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aer
    public boolean b(d dVar, d dVar2, int i, int i2) {
        return dVar.b == dVar2.b && dVar.d == dVar2.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(b.e.item_foot_view, viewGroup, false));
        }
        View h = h();
        h.setLayoutParams(new ViewGroup.LayoutParams(viewGroup.getResources().getDimensionPixelOffset(b.C0147b.play_list_item_width), viewGroup.getResources().getDimensionPixelOffset(b.C0147b.playlist_height)));
        return new b(h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        if (vVar instanceof b) {
            a((b) vVar, i);
        }
    }

    private void a(b bVar, int i) {
        final d dVar = (d) g(i);
        if (dVar == null || dVar.c == null) {
            return;
        }
        bVar.s.setText(String.valueOf(i + 1));
        bVar.w.setText(dVar.c.getSong());
        if (TextUtils.isEmpty(dVar.c.getSinger())) {
            bVar.x.setVisibility(8);
            bVar.B.setVisibility(8);
        } else {
            bVar.x.setVisibility(0);
            bVar.B.setVisibility(0);
            bVar.x.setText(dVar.c.getSinger());
            bVar.B.setMusicInfo(dVar.c);
        }
        bVar.u.setSelected(dVar.d);
        y.a(be.a((CharSequence) dVar.c.getLogo()) ? dVar.c.getAlbumLogo() : dVar.c.getLogo(), b.c.pic_covers_music_220, bVar.z);
        bVar.u.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.k.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (k.this.f != null) {
                    k.this.f.a(dVar.c);
                }
            }
        });
        bVar.C.setVisibility(dVar.e ? 0 : 8);
        bVar.u.setVisibility(dVar.e ? 8 : 0);
        if (dVar.b == -1) {
            bVar.v.c();
            bVar.v.setVisibility(8);
            bVar.y.setVisibility(8);
            bVar.E.setVisibility(8);
            bVar.D.setSelected(false);
        } else {
            bVar.D.setSelected(true);
            if (dVar.b == 1) {
                bVar.y.setVisibility(0);
                bVar.v.c();
                bVar.v.setVisibility(4);
                bVar.E.setVisibility(0);
                bVar.u.setVisibility(8);
                bVar.C.setVisibility(8);
            } else if (dVar.b == 2) {
                bVar.v.a();
                bVar.v.setVisibility(0);
                bVar.y.setVisibility(8);
                bVar.E.setVisibility(0);
            } else {
                bVar.v.e();
                bVar.v.setVisibility(0);
                bVar.E.setVisibility(0);
                bVar.y.setVisibility(8);
            }
        }
        bVar.t.setVisibility(com.xiaopeng.musicradio.model.dui.h.a().b() ? 0 : 8);
        bVar.s.setSelected(false);
        bVar.t.setSelected(false);
        if (dVar.b != -1) {
            bVar.t.setSelected(true);
            if (com.xiaopeng.musicradio.model.dui.h.a().b()) {
                bVar.s.setSelected(true);
            }
        }
        bVar.r.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.k.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (k.this.f != null) {
                    k.this.f.b(dVar.c);
                }
            }
        });
        bVar.u.setVuiPosition(i);
        XImageView xImageView = bVar.u;
        xImageView.setVuiElementId(bVar.u.getId() + "_" + i);
        com.xiaopeng.musicradio.vui.b.a(i, dVar.c.getSong(), bVar.r, dVar.b, bVar.A);
        VuiEngine.getInstance(bVar.r.getContext()).setExecuteVirtualTag(bVar.r);
        VuiEngine.getInstance(bVar.A.getContext()).setExecuteVirtualTag(bVar.A);
        apb.a().b(dVar.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aer
    public void l() {
        super.l();
        if (com.xiaopeng.musicradio.model.dui.h.a().b()) {
            d();
        }
    }

    @Override // defpackage.aep
    public boolean k() {
        d dVar = (d) g(a() - 1);
        if (dVar != null) {
            return dVar.f;
        }
        return false;
    }

    @Override // defpackage.aep, androidx.recyclerview.widget.RecyclerView.a
    public int a(int i) {
        d dVar = (d) g(i);
        return (dVar == null || !dVar.f) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MusicPlayListAdapter.java */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.v {
        XView A;
        MusicListItemLabelView B;
        XTextView C;
        XView D;
        XView E;
        XConstraintLayout r;
        XTextView s;
        XImageView t;
        XImageView u;
        AVLoadingIndicatorView v;
        XTextView w;
        XTextView x;
        View y;
        XImageView z;

        public b(View view) {
            super(view);
            this.s = (XTextView) view.findViewById(b.d.tv_num);
            this.t = (XImageView) view.findViewById(b.d.tv_index_bg);
            this.u = (XImageView) view.findViewById(b.d.img_love);
            this.v = (AVLoadingIndicatorView) view.findViewById(b.d.iv_play_list_state);
            this.w = (XTextView) view.findViewById(b.d.tv_play_list_song);
            this.x = (XTextView) view.findViewById(b.d.tv_play_list_singer);
            this.r = (XConstraintLayout) view.findViewById(b.d.item_music_play_list_root);
            this.y = view.findViewById(b.d.lottie_loading);
            this.z = (XImageView) view.findViewById(b.d.img_album);
            this.A = (XView) view.findViewById(b.d.view_item_vui);
            this.B = (MusicListItemLabelView) view.findViewById(b.d.music_label);
            this.C = (XTextView) view.findViewById(b.d.txt_local);
            this.D = (XView) view.findViewById(b.d.iv_selected_view);
            this.E = (XView) view.findViewById(b.d.view_album_mask);
            this.u.setImageResource(b.c.bg_love_32_selector);
        }
    }

    /* compiled from: MusicPlayListAdapter.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.v {
        XTextView r;
        XLoading s;

        public a(View view) {
            super(view);
            this.r = (XTextView) view.findViewById(b.d.tv_foot);
            this.s = (XLoading) view.findViewById(b.d.foot_loading);
        }
    }

    public List<d> o() {
        return n();
    }

    public void a(c cVar) {
        this.f = cVar;
    }
}
