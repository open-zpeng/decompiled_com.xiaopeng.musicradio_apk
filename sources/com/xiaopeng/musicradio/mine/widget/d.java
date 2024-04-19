package com.xiaopeng.musicradio.mine.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import defpackage.aht;
/* compiled from: DataListViewHolder.java */
/* loaded from: classes.dex */
public class d {
    public final ViewGroup a;
    public final ListRecyclerView b;
    public final MusicListLogoView c;
    private LoadingTipsView d;
    private String e;
    private View.OnClickListener f;

    public d(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = (ListRecyclerView) viewGroup.findViewById(aht.c.rv_list);
        this.d = (LoadingTipsView) viewGroup.findViewById(aht.c.loading_tips_view);
        this.c = (MusicListLogoView) viewGroup.findViewById(aht.c.logo_view);
        amk.a(this.c, bih.UNKNOWN);
    }

    public void a(int i) {
        a(this.a.getContext().getString(i));
    }

    public void a(String str) {
        this.e = str;
    }

    public void b(int i) {
        LogUtils.i("DataListViewHolder", "setState" + i);
        b();
        if (i == 3) {
            this.d.setNoResultText(this.e);
        }
        if (i == 0) {
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(4);
        }
        if (i == 2) {
            this.d.setOnClickListener(this.f);
        } else {
            this.d.setOnClickListener(null);
        }
        if (i != this.d.getState()) {
            this.d.setState(i);
        }
    }

    private void b() {
        if (this.d != null) {
            return;
        }
        this.d = new LoadingTipsView(this.a.getContext());
        this.d.setId(aht.c.loading_tips_view);
        this.a.addView(this.d, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    public void a(int i, Object obj) {
        MusicListLogoView musicListLogoView = this.c;
        if (musicListLogoView != null) {
            musicListLogoView.setVisibility(i);
            if (obj instanceof MusicInfo) {
                this.c.setLogo(((MusicInfo) obj).getLogo());
            } else if (obj instanceof String) {
                this.c.setLogo((String) obj);
            }
        }
    }

    public void a(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public int a() {
        LoadingTipsView loadingTipsView = this.d;
        if (loadingTipsView == null) {
            return 0;
        }
        return loadingTipsView.getState();
    }
}
