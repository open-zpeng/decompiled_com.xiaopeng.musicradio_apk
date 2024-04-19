package defpackage;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.xpbean.HotRankListBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.presenter.ProgramChoicePresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.recyclerview.VuiRecyclerViewWithLoading;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.ago;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProgramChoiceFragment.java */
@Route(path = "/program/fragment/choice")
/* renamed from: awu  reason: default package */
/* loaded from: classes2.dex */
public class awu extends b<awt, ProgramChoicePresenter> implements awt {
    protected VuiRecyclerViewWithLoading d;
    h e;
    e.a f;
    private awr g;
    private List<Object> h = new ArrayList();
    private axa i = new axa();
    private axb j = new axb();
    private int k = 4;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // defpackage.awt
    public void af_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainProgramEditorChoice";
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public void onBuildScene() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.fragment_program_choice;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.d = (VuiRecyclerViewWithLoading) a(b.d.choice_recyclerview);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        s();
        this.d.initVuiAttr("MainProgramEditorChoice", VuiEngine.getInstance(getContext()), true, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public ProgramChoicePresenter ao_() {
        return new ProgramChoicePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MainProgramLocalLeft", "MainLocalTop");
    }

    private void s() {
        this.f = new e.a() { // from class: awu.1
            @Override // com.xiaopeng.musicradio.widget.recyclerview.e.a
            public void a(int i, int i2) {
                LogUtils.i("ProgramChoiceFragment", "click type = " + i + " position = " + i2);
                if (i != 3) {
                    switch (i) {
                        case 0:
                            awu.this.d(i2);
                            return;
                        case 1:
                            awu.this.c(i2);
                            return;
                        default:
                            return;
                    }
                }
                awu.this.b(i2);
            }
        };
        this.g = new awr();
        this.g.a(axa.class, new aww());
        this.g.a(axb.class, new awx());
        this.g.a(axd.class, new awz(this.f));
        this.g.a(axc.class, new awy(this.f));
        this.g.a(this.f);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), this.k);
        gridLayoutManager.a(new GridLayoutManager.c() { // from class: awu.2
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (awu.this.h.get(i) instanceof axc) {
                    return 1;
                }
                return awu.this.k;
            }
        });
        gridLayoutManager.f(30);
        this.e = new h(4, 33, false);
        this.e.c(90);
        this.d.addItemDecoration(this.e);
        this.d.setLayoutManager(gridLayoutManager);
        this.d.getRecycledViewPool().a(3, 50);
        this.d.setHasFixedSize(true);
        this.d.setAdapter(this.g);
        this.d.setOnTipsViewClick(new View.OnClickListener() { // from class: awu.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                axe.c().a(false, true);
                axe.c().b(1);
                ((ProgramChoicePresenter) awu.this.b).c();
                u.e(new ago.e(3));
            }
        });
        ae_();
        this.d.setVuiAction(big.SCROLLBYY.a());
        this.d.setVuiLayoutLoadable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object obj;
        List<Object> list = this.h;
        if (list == null || list.size() < i || (obj = this.h.get(i)) == null || !(obj instanceof axd)) {
            return;
        }
        axd axdVar = (axd) obj;
        ((ProgramChoicePresenter) this.b).a(axdVar.b(), axdVar.a());
        axt.a(axdVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Object obj;
        List<Object> list = this.h;
        if (list == null || list.size() < i || (obj = this.h.get(i)) == null || !(obj instanceof axc)) {
            return;
        }
        ((ProgramChoicePresenter) this.b).a(((axc) obj).d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        Object obj;
        List<Object> list = this.h;
        if (list == null || list.size() < i || (obj = this.h.get(i)) == null || !(obj instanceof axc)) {
            return;
        }
        RdAlbumBean d = ((axc) obj).d();
        ((ProgramChoicePresenter) this.b).b(d);
        axt.b(d.getTitle());
    }

    @Override // defpackage.awt
    public void a(List<HotRankListBean.DataBean.RankBean> list) {
        if (list == null) {
            return;
        }
        int i = 0;
        this.d.setTipsState(0);
        if (list != null) {
            this.h.clear();
            this.h.add(this.i);
            this.h.add(this.j);
            int i2 = 7;
            int i3 = 0;
            for (HotRankListBean.DataBean.RankBean rankBean : list) {
                this.h.add(new axd(rankBean.getRankName(), rankBean.getRankId(), i3));
                int size = rankBean.getAlbumInfos().size();
                int i4 = i;
                int i5 = i2;
                for (int i6 = i4; i6 < this.k; i6++) {
                    if (i6 < size) {
                        this.h.add(new axc(rankBean.getRankName(), rankBean.getAlbumInfos().get(i6), rankBean.getRankId(), i4, i5));
                        i4++;
                        i5++;
                    } else {
                        this.h.add(new axc(rankBean.getRankName(), null, rankBean.getRankId(), 0, 0));
                    }
                }
                i3++;
                i2 = i5;
                i = 0;
            }
        }
        this.e.c(100);
        this.d.removeItemDecoration(this.e);
        this.d.addItemDecoration(this.e);
        this.g.a(this.h);
        this.g.d();
        super.onBuildScene();
        ((ProgramChoicePresenter) this.b).d();
    }

    @Override // defpackage.awt
    public void a() {
        this.d.setTipsState(2);
        this.d.setVisibility(4);
    }

    @Override // defpackage.awt
    public void ad_() {
        this.d.setTipsState(0);
        this.d.setVisibility(0);
    }

    @Override // defpackage.awt
    public void ae_() {
        this.d.setTipsState(1);
        this.d.setVisibility(4);
    }

    @Override // defpackage.awt
    public void i_(int i) {
        this.d.c(i);
    }
}
