package com.xiaopeng.musicradio.mine.collect.music.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.MusicListPlayReq;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.music.presenter.CollectedMusicPresenter;
import com.xiaopeng.musicradio.mine.collect.music.presenter.MusicCollectedMusicPresenter;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.m;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.aht;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Route(path = "/mine/activity/collect/music")
/* loaded from: classes.dex */
public class CollectMusicActivity extends com.xiaopeng.musicradio.mine.common.view.a<ajg, c, CollectedMusicPresenter> implements c {
    @Autowired(name = "mode")
    public String g;
    private int n = 1;
    private int o = 1;

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MineCollectMusic";
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void s() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aml.e(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String str = this.g;
        setIntent(intent);
        sp.a().a(this);
        if (Objects.equals(str, this.g)) {
            return;
        }
        D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public MusicCollectedMusicPresenter e() {
        return new MusicCollectedMusicPresenter();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected com.xiaopeng.musicradio.datalist.c r() {
        return new aie(this) { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectMusicActivity.1
            @Override // defpackage.aep
            protected int f() {
                return 10;
            }

            @Override // com.xiaopeng.musicradio.datalist.c
            public void b(Object obj) {
                if (t().size() < 50) {
                    super.b(obj);
                    return;
                }
                CollectMusicActivity collectMusicActivity = CollectMusicActivity.this;
                ak.a(collectMusicActivity, collectMusicActivity.getString(aht.e.collected_music_max_selected, 50));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aht.d.activity_collected_music_list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        return "select".equals(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        return RequestParameters.SUBRESOURCE_DELETE.equals(this.g);
    }

    private void D() {
        if (B()) {
            ((ajg) this.f).h.a(aht.b.ic_title_btn_plus_add_list_text_color, aht.e.playlist_user_add_other, false);
            ((ajg) this.f).h.setTitle(getString(aht.e.title_music_select_template, new Object[]{0}));
            ((ajg) this.f).h.setTitleBtnEnable(false);
            b(2);
        } else if (C()) {
            ((ajg) this.f).h.a(false);
            ((ajg) this.f).f.setVisibility(0);
            ((ajg) this.f).j.setVisibility(8);
            ((ajg) this.f).i.setEnabled(false);
            ((ajg) this.f).c.setEnabled(false);
            ((ajg) this.f).h.setTitle(getString(aht.e.title_music_select_template, new Object[]{0}));
            b(2);
            F();
        } else {
            ((ajg) this.f).h.a(aht.b.ic_32_setting, aht.e.management, true);
        }
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        sp.a().a(this);
        setTitle(aht.e.title_collected_music);
        if (this.j != null) {
            D();
        }
        ((ajg) this.f).g.addItemDecoration(new aiu(getResources().getDimensionPixelSize(aht.a.mine_music_view_item_margin_top)));
        ((ajg) this.f).f.setVuiElementType(bih.UNKNOWN);
        new b.a(this).a(this.j).a((DataListPresenter) this.b).a(((ajg) this.f).g).a(this).a(true).b(true).a().a("CUSTOM_ADDED", (Object) true);
        amk.d(((ajg) this.f).i, true);
        amk.d(((ajg) this.f).j, true);
        amo.a((RecyclerView) ((ajg) this.f).g, 20);
    }

    private void E() {
        ((ajg) this.f).e.setDescriptionText(getString(aht.e.desc_collected_music, new Object[]{Integer.valueOf(aml.h())}));
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.j.a((c.b) new c.b<ViewDataBinding, MusicInfo>() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectMusicActivity.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicInfo musicInfo, int i) {
                LogUtils.i("CollectMusicActivity", "onItemClicked:" + i + ListSignBean.COLLECTID_SUFFIX + CollectMusicActivity.this.j.p());
                if (CollectMusicActivity.this.j.p() != 0) {
                    List t = CollectMusicActivity.this.j.t();
                    ((ajg) CollectMusicActivity.this.f).h.setTitle(CollectMusicActivity.this.getString(aht.e.title_music_select_template, new Object[]{Integer.valueOf(t.size())}));
                    if (CollectMusicActivity.this.B()) {
                        ((ajg) CollectMusicActivity.this.f).h.setTitleBtnEnable(!t.isEmpty());
                        return;
                    } else if (CollectMusicActivity.this.C()) {
                        ((ajg) CollectMusicActivity.this.f).i.setEnabled(!t.isEmpty());
                        ((ajg) CollectMusicActivity.this.f).c.setEnabled(!t.isEmpty());
                        return;
                    } else {
                        CollectMusicActivity.this.a(!t.isEmpty());
                        return;
                    }
                }
                if (view.getId() == aht.c.iv_icon) {
                    CollectMusicActivity.this.j.d(musicInfo);
                    if (CollectMusicActivity.this.j.a() <= 0) {
                        CollectMusicActivity.this.z();
                    }
                }
                aml.a(view, new MusicListPlayReq(((CollectedMusicPresenter) CollectMusicActivity.this.b).g(), musicInfo, CollectMusicActivity.this.n, 50, CollectMusicActivity.this.o, aml.a((Integer) 50)));
            }
        });
        ((ajg) this.f).h.setOnModeChangedListener(new MineTitleBarLayout.a() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectMusicActivity.3
            @Override // com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout.a
            public void a(int i) {
                if (i == 1) {
                    CollectMusicActivity.this.b(2);
                    CollectMusicActivity.this.F();
                } else {
                    CollectMusicActivity.this.b(i);
                    CollectMusicActivity.this.G();
                }
                amk.a(CollectMusicActivity.this.m(), ((ajg) CollectMusicActivity.this.f).f);
            }
        });
        ((ajg) this.f).i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectMusicActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CollectMusicActivity.this.H();
            }
        });
        ((ajg) this.f).j.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectMusicActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CollectMusicActivity.this.j.t();
                ((ajg) CollectMusicActivity.this.f).h.setMode(0);
            }
        });
        if (B()) {
            ((ajg) this.f).h.getTitleBtn().setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectMusicActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    m.a().a("add_list", CollectMusicActivity.this.j.t());
                    CollectMusicActivity.this.setResult(-1);
                    CollectMusicActivity.this.finish();
                }
            });
        }
        ((ajg) this.f).e.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectMusicActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                List g = ((CollectedMusicPresenter) CollectMusicActivity.this.b).g();
                if (g.isEmpty()) {
                    return;
                }
                aml.a(new MusicListPlayReq(g, null, CollectMusicActivity.this.n, 50, CollectMusicActivity.this.o, aml.a((Integer) 50)));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.h.c.a(aml.a(50, this.h.c.getPlayAllText()));
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        ((ajg) this.f).f.setVisibility(0);
        ((ajg) this.f).i.setVisibility(0);
        ((ajg) this.f).c.setVisibility(0);
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        ((ajg) this.f).f.setVisibility(8);
        ((ajg) this.f).i.setVisibility(8);
        ((ajg) this.f).c.setVisibility(8);
        ((ajg) this.f).j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        ((ajg) this.f).j.setEnabled(z);
        ((ajg) this.f).i.setEnabled(z);
        ((ajg) this.f).c.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        if (this.j.s() || l()) {
            return;
        }
        amd.a(this, this.d, amd.a(this, this.j.t()), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectMusicActivity.8
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog, int i) {
                CollectMusicActivity.this.I();
            }
        }, "MineCollectDeleteDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        List<MusicInfo> t = this.j.t();
        LogUtils.i("CollectMusicActivity", "delete:" + t.size());
        ArrayList arrayList = new ArrayList();
        for (MusicInfo musicInfo : t) {
            arrayList.add(musicInfo);
        }
        aml.a(arrayList);
        this.j.b(t);
        if (C()) {
            this.j.u();
            if (!isFinishing()) {
                finish();
            }
        } else {
            ((ajg) this.f).h.setMode(0);
            w();
        }
        E();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        super.a(z, aVar);
        this.h.c.a(aml.a(50, this.h.c.getPlayAllText()));
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
        super.j_();
        E();
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void a(int i, int i2) {
        this.n = i;
        this.o = i2;
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void t() {
        E();
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void a(Object obj) {
        this.j.d(obj);
        if (this.j.a() <= 0) {
            z();
        }
        w();
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void b(Object obj) {
        if (this.j.n().contains(obj)) {
            this.j.n().remove(obj);
        }
        this.j.b(0, obj);
        w();
    }
}
