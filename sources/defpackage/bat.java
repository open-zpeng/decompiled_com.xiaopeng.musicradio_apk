package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.commonui.vui.a;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.widget.UsbPlayAllButton;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import defpackage.aep;
import java.util.Arrays;
import java.util.List;
/* compiled from: UsbBaseActivity.java */
/* renamed from: bat  reason: default package */
/* loaded from: classes2.dex */
public abstract class bat<UIInterface, Presenter extends BasePresenter<UIInterface>> extends a<UIInterface, Presenter> {
    protected DialogTopLayout f;
    protected BaseRecycleView g;
    protected bca h;
    protected UsbPlayAllButton i;
    protected String k;
    protected int m;
    protected int n;
    protected int j = 2;
    protected String[] l = {be.a(a.d.bt_play_all), be.a(a.d.bt_continue_all), be.a(a.d.vui_label_stop)};
    protected int o = 0;

    protected ListSignBean q() {
        return null;
    }

    protected List<MusicInfo> r() {
        return null;
    }

    protected boolean v() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x() {
        int i = 2;
        if (aei.a().c() == 0) {
            if (v()) {
                int playState = apk.i().getPlayState();
                this.i.setPlayState(playState);
                if (playState == 2 || playState == 1) {
                    i = 1;
                }
            } else {
                y();
            }
        } else {
            y();
        }
        VuiUtils.setStatefulButtonAttr(this.i, i, this.l, big.SETVALUE.a() + "|" + big.CLICK.a());
        VuiEngine.getInstance(this).updateScene(m(), this.i);
        this.j = i;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (DialogTopLayout) findViewById(a.b.ms_top_layout);
        this.g = (BaseRecycleView) findViewById(a.b.dir_rv);
        this.i = (UsbPlayAllButton) findViewById(a.b.play_all);
    }

    protected void y() {
        this.i.setPlayState(-1);
    }

    protected void z() {
        ban.b(new Runnable() { // from class: bat.1
            @Override // java.lang.Runnable
            public void run() {
                if (bat.this.g == null || bat.this.g.getAdapter() == null) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) bat.this.g.getLayoutManager();
                bat.this.m = linearLayoutManager.p();
                bat.this.n = linearLayoutManager.r();
                if (bat.this.o != 0 || bat.this.h.l() == null || bat.this.h.l().size() <= 0 || bat.this.m < 0 || bat.this.n < 0) {
                    return;
                }
                if (bat.this.n > bat.this.h.l().size() - 1) {
                    bat batVar = bat.this;
                    batVar.n = batVar.h.l().size() - 1;
                }
                List<MusicInfo> subList = bat.this.h.l().subList(bat.this.m, bat.this.n + 1);
                bbh.a().a(subList);
                bbm.a().c((List) subList);
            }
        }, 150L);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        this.f.a(false);
        this.g.setHasFixedSize(true);
        this.g.setItemAnimator(new e());
        this.g.setLayoutManager(new LinearLayoutManager(this));
        this.g.addItemDecoration(new j(12, 100, 0));
        ((q) this.g.getItemAnimator()).a(false);
        B();
        this.g.setAdapter(this.h);
        this.g.initVuiAttr(m(), VuiEngine.getInstance(this));
        this.g.enableVuiInvisibleFeature(1);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.f.setCloseListener(new View.OnClickListener() { // from class: bat.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                bat.this.finish();
            }
        });
        this.g.addOnScrollListener(new RecyclerView.m() { // from class: bat.3
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                bat batVar = bat.this;
                batVar.o = i;
                batVar.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A() {
        if (this.g.isComputingLayout()) {
            this.g.post(new Runnable() { // from class: bat.4
                @Override // java.lang.Runnable
                public void run() {
                    if (bat.this.h == null || bat.this.h.a() <= 0) {
                        return;
                    }
                    bat.this.h.a(bat.this.m, (bat.this.n - bat.this.m) + 1);
                }
            });
            return;
        }
        bca bcaVar = this.h;
        if (bcaVar == null || bcaVar.a() <= 0) {
            return;
        }
        bca bcaVar2 = this.h;
        int i = this.m;
        bcaVar2.a(i, (this.n - i) + 1);
    }

    public void B() {
        this.h = new bca(this, a.c.usb_song_detail_item, 12, new aep.b() { // from class: bat.5
            @Override // defpackage.aep.b
            public void a() {
                if (bat.this.h.a() > 0) {
                    bat.this.h.d();
                }
            }
        });
    }

    public void a(List<MusicInfo> list) {
        int a = bce.a(list);
        this.i.setCountText(list.size());
        this.h.a(list);
        if (a >= 0) {
            this.g.scrollToPosition(a);
        }
        this.g.setVisibility(0);
        x();
        z();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        if (TextUtils.isEmpty(this.k)) {
            return;
        }
        x();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null || view.getId() != this.i.getId()) {
            return;
        }
        String str = (String) bioVar.getEventValue(bioVar);
        List asList = Arrays.asList(this.l);
        if (str == null || !asList.contains(str)) {
            return;
        }
        int indexOf = asList.indexOf(str);
        if (indexOf == 0 || indexOf == 1) {
            if (this.i.getPlayText().equals(be.a(a.d.bt_pause))) {
                VuiEngine.getInstance(this).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经播放了哦").build());
                return;
            }
            VuiFloatingLayerManager.show(view);
            this.i.performClick();
        } else if (this.i.getPlayText().equals(be.a(a.d.bt_pause))) {
            VuiFloatingLayerManager.show(view);
            this.i.performClick();
        } else {
            VuiEngine.getInstance(this).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经暂停了哦").build());
        }
    }
}
