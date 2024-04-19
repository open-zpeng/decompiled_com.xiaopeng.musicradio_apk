package com.xiaopeng.musicradio.program.choice.view.guesslike;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.presenter.guesslike.GuessLikeListPresenter;
import com.xiaopeng.musicradio.utils.z;
import defpackage.aep;
import java.util.List;
/* compiled from: GuessLikeListFragment.java */
@Route(path = "/program/fragment/sub/guess_you_like")
/* loaded from: classes2.dex */
public class a extends com.xiaopeng.musicradio.program.common.view.a<e, GuessLikeListPresenter> implements awf, e {
    private awo d;

    @Override // com.xiaopeng.musicradio.program.common.view.a
    protected int W_() {
        return 4;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SubProgramGuessLikeList";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.d.a(new aep.c() { // from class: com.xiaopeng.musicradio.program.choice.view.guesslike.a.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                if (ShakeUtil.canExecute(b.e.item_rank_album)) {
                    RdAlbumBean g = a.this.d.g(i2);
                    if (i == 0) {
                        sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(g))).navigation();
                    } else if (i == 1) {
                        if (g != null) {
                            ((GuessLikeListPresenter) a.this.b).b(g);
                        } else {
                            LogUtils.e("GuessLikeListFragment", "playControl call null object");
                        }
                    }
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a
    protected void r() {
        ((GuessLikeListPresenter) this.b).d();
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a
    protected awe s() {
        return this.d;
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.d = new awo(getContext(), b.e.item_rank_album, this, 2);
        this.e.setAdapter(this.d);
        this.e.setOnTipsViewClick(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.guesslike.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((GuessLikeListPresenter) a.this.b).c();
            }
        });
        this.g.a(new GridLayoutManager.c() { // from class: com.xiaopeng.musicradio.program.choice.view.guesslike.a.3
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (a.this.d.f(i)) {
                    return a.this.g.c();
                }
                return 1;
            }
        });
        this.e.setLayoutManager(this.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: t */
    public GuessLikeListPresenter ao_() {
        return new GuessLikeListPresenter();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.guesslike.e
    public void a(List<RdAlbumBean> list, int i, boolean z) {
        if (i == 1) {
            this.d.a(list);
        } else {
            this.d.a((List) list, i);
        }
    }

    @Override // defpackage.awf
    public boolean a(long j) {
        return ((GuessLikeListPresenter) this.b).b(j);
    }
}
