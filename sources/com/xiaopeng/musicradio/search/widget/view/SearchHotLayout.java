package com.xiaopeng.musicradio.search.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.s;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.view.mymusic.MusicListItemLabelView;
import com.xiaopeng.musicradio.widget.PlayStateWidget;
import com.xiaopeng.musicradio.widget.e;
import com.xiaopeng.musicradio.widget.recyclerview.VuiRecyclerViewWithLoading;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.agq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public class SearchHotLayout extends XLinearLayout {
    private VuiRecyclerViewWithLoading a;
    private a b;
    private c c;
    private int d;
    private com.xiaopeng.musicradio.search.widget.view.a e;

    /* loaded from: classes2.dex */
    public interface c {
        int a(String str, long j);

        String a();

        void a(MusicSongBean musicSongBean);

        void a(String str);

        void a(boolean z, int i);

        boolean b(MusicSongBean musicSongBean);
    }

    public void setLoadingState(int i) {
    }

    public SearchHotLayout(Context context) {
        super(context);
        this.d = 2;
        e();
    }

    public SearchHotLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 2;
        e();
    }

    public SearchHotLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 2;
        e();
    }

    public SearchHotLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = 2;
        e();
    }

    private void e() {
        LayoutInflater.from(getContext()).inflate(a.e.layout_search_hot_song, this);
        this.a = (VuiRecyclerViewWithLoading) findViewById(a.d.hot_list_recycleview);
        this.a.setTipsState(0);
        this.a.setLayoutManager(new GridLayoutManager(getContext(), 1));
        h hVar = new h(1, s.a(0.0f), false);
        hVar.b(s.a(0.0f));
        hVar.c(100);
        hVar.a(12);
        this.a.addItemDecoration(hVar);
        this.e = new com.xiaopeng.musicradio.search.widget.view.a(getContext());
        this.b = new a();
        this.a.setAdapter(this.b);
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        VuiRecyclerViewWithLoading vuiRecyclerViewWithLoading = this.a;
        vuiEngine.setVuiElementTag(vuiRecyclerViewWithLoading, "search_hot_layout_" + this.a.getId());
    }

    public void a() {
        this.a.initVuiAttr("SearchMain", VuiEngine.getInstance(getContext()), true, true);
        this.a.enableVuiInvisibleFeature(1);
        com.xiaopeng.musicradio.vui.c.b(this.a);
    }

    public com.xiaopeng.musicradio.search.widget.view.a getSearchHistoryLayout() {
        return this.e;
    }

    public void a(List<MusicSongBean> list) {
        if (list == null || list.size() == 0) {
            this.e.setHotTitleVisible(false);
        } else {
            this.e.setHotTitleVisible(true);
            this.b.a_(list);
        }
        VuiEngine.getInstance(getContext()).updateScene("SearchMain", this.a);
    }

    public void a(int i) {
        ArrayList<String> arrayList = new ArrayList();
        c cVar = this.c;
        if (cVar != null) {
            String a2 = cVar.a();
            for (Map.Entry<String, Integer> entry : this.b.f().entrySet()) {
                if (entry.getValue().intValue() != -1) {
                    arrayList.add(entry.getKey());
                }
                if (a2 != null && a2.equalsIgnoreCase(entry.getKey())) {
                    arrayList.add(a2);
                }
            }
        } else {
            for (Map.Entry<String, Integer> entry2 : this.b.f().entrySet()) {
                if (entry2.getValue().intValue() != -1) {
                    arrayList.add(entry2.getKey());
                }
            }
        }
        for (String str : arrayList) {
            int i2 = 1;
            while (true) {
                if (i2 >= this.b.a()) {
                    break;
                }
                if (this.b.f(i2).getHash() != null && this.b.f(i2).getHash().equalsIgnoreCase(str)) {
                    this.b.c(i2);
                    break;
                }
                i2++;
            }
        }
    }

    public void b() {
        this.b.d();
    }

    public void a(agq.l lVar) {
        for (MusicSongBean musicSongBean : this.b.k()) {
            if (Objects.equals(musicSongBean.getHash(), lVar.a())) {
                musicSongBean.setHot(lVar.c());
            }
        }
    }

    public boolean c() {
        a aVar = this.b;
        return aVar != null && aVar.a() > 1;
    }

    public void d() {
        VuiEngine.getInstance(getContext()).updateScene("SearchMain", this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends e<MusicSongBean, b> {
        private HashMap<String, Integer> b;

        @Override // com.xiaopeng.musicradio.widget.e
        protected View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return null;
        }

        @Override // com.xiaopeng.musicradio.widget.e
        public void a_(List<MusicSongBean> list) {
            this.b.clear();
            for (MusicSongBean musicSongBean : list) {
                this.b.put(musicSongBean.getHash(), -1);
            }
            super.a_(list);
        }

        public a() {
            super(new ArrayList(), true, false);
            this.b = new HashMap<>();
        }

        public HashMap<String, Integer> f() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaopeng.musicradio.widget.e
        /* renamed from: a */
        public b d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(a.e.item_search_song_layout, viewGroup, false));
        }

        @Override // com.xiaopeng.musicradio.widget.e
        protected View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return SearchHotLayout.this.e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void a(RecyclerView.v vVar, final int i) {
            if (vVar instanceof b) {
                b bVar = (b) vVar;
                MusicSongBean f = f(i);
                bVar.s.setText(String.valueOf(i));
                y.b(bVar.z.getContext(), f.getAlbum().getLogo(), a.c.pic_covers_music_list_220, bVar.A);
                int a = SearchHotLayout.this.c.a(f.getHash(), f.getAlbum().getId());
                this.b.put(f.getHash(), Integer.valueOf(a));
                if (a != -1) {
                    bVar.a.setSelected(true);
                    bVar.v.setVisibility(0);
                    bVar.v.a(a, a != -1);
                    if (a == 1) {
                        bVar.B.setVisibility(0);
                        bVar.z.setVisibility(8);
                    } else {
                        bVar.B.setVisibility(8);
                        bVar.z.setVisibility(0);
                    }
                    if (!com.xiaopeng.musicradio.model.dui.h.a().b()) {
                        bVar.s.setSelected(false);
                    }
                } else {
                    bVar.a.setSelected(false);
                    bVar.v.setVisibility(8);
                    bVar.B.setVisibility(8);
                    bVar.z.setVisibility(0);
                }
                bVar.z.setSelected(SearchHotLayout.this.c.b(f));
                bVar.t.setText(f.getSongName());
                bVar.u.setText(f.getSingers());
                bVar.C.setVisibility(com.xiaopeng.musicradio.model.dui.h.a().b() ? 0 : 8);
                bVar.x.a(f.isNeedVip(), 40, f.getSupportSq().booleanValue());
                f.getHash();
                bVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchHotLayout.a.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        MusicSongBean f2 = SearchHotLayout.this.b.f(i);
                        if (SearchHotLayout.this.c.a(f2.getHash(), f2.getAlbum().getId()) == 2) {
                            if (SearchHotLayout.this.c != null) {
                                SearchHotLayout.this.c.a(false, 0);
                            }
                        } else if (SearchHotLayout.this.c != null) {
                            if (SearchHotLayout.this.c.a(f2.getHash(), f2.getAlbum().getId()) != -1) {
                                SearchHotLayout.this.c.a(true, 0);
                            } else {
                                SearchHotLayout.this.c.a(f2.getHash());
                            }
                        }
                    }
                });
                bVar.z.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.search.widget.view.SearchHotLayout.a.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (SearchHotLayout.this.c != null) {
                            SearchHotLayout.this.c.a(SearchHotLayout.this.b.f(i));
                        }
                    }
                });
                int i2 = i - 1;
                bVar.z.setVuiPosition(i2);
                XImageView xImageView = bVar.z;
                xImageView.setVuiElementId(bVar.z.getId() + "_" + i2);
                com.xiaopeng.musicradio.vui.b.a(i2, f.getSongName(), bVar.y, a, bVar.w);
                VuiEngine.getInstance(bVar.y.getContext()).setExecuteVirtualTag(bVar.y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.v {
        private XImageView A;
        private XLoading B;
        private XImageView C;
        private XTextView s;
        private XTextView t;
        private XTextView u;
        private PlayStateWidget v;
        private XView w;
        private MusicListItemLabelView x;
        private XRelativeLayout y;
        private XImageView z;

        public b(View view) {
            super(view);
            this.y = (XRelativeLayout) view.findViewById(a.d.layout_item_root);
            this.s = (XTextView) view.findViewById(a.d.rank_number);
            this.t = (XTextView) view.findViewById(a.d.tv_title);
            this.u = (XTextView) view.findViewById(a.d.tv_sub_title);
            this.v = (PlayStateWidget) view.findViewById(a.d.iv_play_list_state);
            this.x = (MusicListItemLabelView) view.findViewById(a.d.music_label);
            this.z = (XImageView) view.findViewById(a.d.iv_fav_icon);
            this.A = (XImageView) view.findViewById(a.d.iv_logo);
            this.B = (XLoading) view.findViewById(a.d.lottie_loading);
            this.C = (XImageView) view.findViewById(a.d.tv_index_bg);
            this.w = (XView) view.findViewById(a.d.view_item_vui);
            this.z.setImageResource(a.c.bg_btn_love_selector);
        }
    }

    public void setCurrentPlayState(int i) {
        this.d = i;
    }

    public void setCallback(c cVar) {
        this.c = cVar;
    }
}
