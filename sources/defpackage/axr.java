package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.common.view.a;
import com.xiaopeng.musicradio.program.rank.presenter.RankListPresenter;
import com.xiaopeng.musicradio.utils.ap;
import com.xiaopeng.musicradio.utils.z;
import defpackage.aep;
import java.util.List;
/* compiled from: RankListFragment.java */
@Route(path = "/program/fragment/sub/rank")
/* renamed from: axr  reason: default package */
/* loaded from: classes2.dex */
public class axr extends a<axq, RankListPresenter> implements awf, axq {
    private awo d;

    @Override // com.xiaopeng.musicradio.program.common.view.a
    protected int W_() {
        return 4;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SubProgramRankList";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.d.a(new aep.c() { // from class: axr.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                if (ShakeUtil.canExecute(b.e.item_rank_album)) {
                    RdAlbumBean g = axr.this.d.g(i2);
                    if (i == 0) {
                        sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(g))).navigation();
                    } else if (i == 1) {
                        if (g != null) {
                            ((RankListPresenter) axr.this.b).b(g);
                        } else {
                            LogUtils.e("RankListFragment", "playControl call null object");
                        }
                    }
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a
    protected void r() {
        ((RankListPresenter) this.b).d();
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a
    protected awe s() {
        return this.d;
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.d = new awo(getContext(), b.e.item_rank_album, this, 3);
        this.e.setAdapter(this.d);
        this.e.setOnTipsViewClick(new View.OnClickListener() { // from class: axr.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((RankListPresenter) axr.this.b).c();
            }
        });
        this.g.a(new GridLayoutManager.c() { // from class: axr.3
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (axr.this.d.f(i)) {
                    return axr.this.g.c();
                }
                return 1;
            }
        });
        this.e.setLayoutManager(this.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: t */
    public RankListPresenter ao_() {
        if (getArguments() != null) {
            return new RankListPresenter(ap.a(getArguments().getString("rank_id", "0")));
        }
        return new RankListPresenter(0);
    }

    @Override // defpackage.axq
    public void a(List<RdAlbumBean> list, int i, boolean z) {
        if (i == 1) {
            this.d.a(list);
        } else {
            this.d.a((List) list, i);
        }
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a, defpackage.axq
    public void a_(long j) {
        this.d.d();
    }

    @Override // defpackage.awf
    public boolean a(long j) {
        return ((RankListPresenter) this.b).b(j);
    }
}
