package com.xiaopeng.musicradio.music.main.view;

import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.bb;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Route(path = "/music/activity/music_detail")
/* loaded from: classes.dex */
public class MsMusicDetailActivity extends com.xiaopeng.musicradio.commonui.vui.a<a, MsMusicDetailPresenter> implements a {
    public DialogTopLayout f;
    public LoadingTipsView g;
    public MusicCircleImageView h;
    public XTextView i;
    public XLinearLayout j;
    public BaseRecycleView k;
    public ate l;
    public String m;
    public String n;
    public XImageView p;
    public XLinearLayout r;
    public XImageView s;
    public XTextView t;
    public Long o = 0L;
    public boolean q = false;
    private String[] u = {be.a(b.f.bt_play_all), be.a(b.f.bt_continue_all), be.a(b.f.vui_label_stop)};
    private String v = null;
    private int w = 2;

    @Override // com.xiaopeng.musicradio.music.main.view.a
    public void a(double d) {
    }

    public void a(int i) {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicDetail";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: t */
    public MsMusicDetailPresenter e() {
        return new MsMusicDetailPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return b.e.music_activity_music_detail;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (DialogTopLayout) findViewById(b.d.ms_top_layout);
        this.g = (LoadingTipsView) findViewById(b.d.loadingview);
        this.h = (MusicCircleImageView) findViewById(b.d.ms_logo);
        this.i = (XTextView) findViewById(b.d.ms_collect_text);
        this.j = (XLinearLayout) findViewById(b.d.ms_collect_layout);
        this.k = (BaseRecycleView) findViewById(b.d.ms_detail_rv);
        this.p = (XImageView) findViewById(b.d.ic_add_collect);
        this.r = (XLinearLayout) findViewById(b.d.play_all_layout);
        this.s = (XImageView) findViewById(b.d.play_ic);
        this.t = (XTextView) findViewById(b.d.play_tv);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        this.g.setAutoClickLoadingEnable(false);
        v();
        a();
        this.f.a(false);
        this.k.setHasFixedSize(true);
        this.k.setItemAnimator(new e());
        this.k.setLayoutManager(new LinearLayoutManager(this));
        this.k.addItemDecoration(new j(12, 0, 0));
        ((q) this.k.getItemAnimator()).a(false);
        this.k.setAdapter(this.l);
        if (this.o.longValue() != 0) {
            this.l.a(this.o.longValue());
        }
        XLinearLayout xLinearLayout = this.r;
        String[] strArr = this.u;
        VuiUtils.setStatefulButtonAttr(xLinearLayout, 2, strArr, big.SETVALUE.a() + "|" + big.CLICK.a());
        this.k.initVuiAttr(m(), VuiEngine.getInstance(this));
        this.k.enableVuiInvisibleFeature(1);
        z();
        this.g.setNoResultText(b.f.copyright_restrict_hint);
        com.xiaopeng.musicradio.vui.c.c(this.r);
        this.r.setVuiPriority(bik.LEVEL2);
        if (anu.a().b(this.o.longValue())) {
            this.j.setVisibility(8);
        }
    }

    public void v() {
        this.l = new ate(this, b.e.music_item_music_detail_list, 8, new aep.b() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.1
            @Override // defpackage.aep.b
            public void a() {
                if (MsMusicDetailActivity.this.l.a() > 0) {
                    MsMusicDetailActivity.this.l.d();
                }
            }
        });
    }

    public void a() {
        if (getIntent() != null) {
            this.o = Long.valueOf(getIntent().getLongExtra("detail_id", 0L));
            this.m = getIntent().getStringExtra("detail_title");
            this.n = getIntent().getStringExtra("detail_LOGO");
            ((MsMusicDetailPresenter) this.b).a(this.o.longValue());
            ((MsMusicDetailPresenter) this.b).c();
            this.f.setTitle(this.m);
            this.q = ant.a().a(this.o.longValue());
            this.j.setVuiLabel(be.a(b.f.vui_collect_music));
            B();
            y.b(this, this.n, b.c.pic_covers_music_220, this.h);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MsMusicDetailActivity.this.g.getState() == 2 || MsMusicDetailActivity.this.g.getState() == 3) {
                    ((MsMusicDetailPresenter) MsMusicDetailActivity.this.b).c();
                }
            }
        });
        this.f.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsMusicDetailActivity.this.finish();
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicRadioItem musicRadioItem = new MusicRadioItem();
                musicRadioItem.setName(MsMusicDetailActivity.this.m);
                musicRadioItem.setLogo(MsMusicDetailActivity.this.n);
                musicRadioItem.setId(MsMusicDetailActivity.this.o.longValue());
                ((MsMusicDetailPresenter) MsMusicDetailActivity.this.b).a(MsMusicDetailActivity.this.q, musicRadioItem);
                MsMusicDetailActivity msMusicDetailActivity = MsMusicDetailActivity.this;
                msMusicDetailActivity.q = !msMusicDetailActivity.q;
                MsMusicDetailActivity.this.B();
            }
        });
        this.r.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String charSequence = MsMusicDetailActivity.this.t.getText().toString();
                if (TextUtils.equals(charSequence, be.a(b.f.bt_play_all))) {
                    List<MusicInfo> o = MsMusicDetailActivity.this.l.o();
                    if (o.size() > 0) {
                        String json = MsMusicDetailActivity.this.s().toJson();
                        int a = bb.a(o);
                        ((MsMusicDetailPresenter) MsMusicDetailActivity.this.b).a(o, json, a, o.get(a));
                    }
                } else if (TextUtils.equals(charSequence, be.a(b.f.bt_pause))) {
                    apk.i().pause();
                } else if (TextUtils.equals(charSequence, be.a(b.f.bt_continue_all))) {
                    apk.i().play();
                }
                List<MusicInfo> o2 = MsMusicDetailActivity.this.l.o();
                if (o2 == null || o2.isEmpty()) {
                    return;
                }
                MsMusicDetailActivity.this.u();
            }
        });
        this.l.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.6
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                List<MusicInfo> o;
                if (i2 >= 0 && (o = MsMusicDetailActivity.this.l.o()) != null && i2 <= MsMusicDetailActivity.this.l.o().size() - 1) {
                    if (i == 0) {
                        ((MsMusicDetailPresenter) MsMusicDetailActivity.this.b).a(o, MsMusicDetailActivity.this.s().toJson(), i2, o.get(i2));
                        MsMusicDetailActivity.this.u();
                    } else if (i != 2) {
                    } else {
                        ((MsMusicDetailPresenter) MsMusicDetailActivity.this.b).a(o.get(i2));
                    }
                }
            }
        });
        r();
    }

    public void r() {
        this.k.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.7
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (recyclerView == null || recyclerView.getAdapter() == null) {
                    return;
                }
                int a = recyclerView.getAdapter().a();
                int r = ((LinearLayoutManager) recyclerView.getLayoutManager()).r();
                int childCount = recyclerView.getChildCount();
                if (i == 0 && r == a - 1 && childCount > 0 && ShakeUtil.canExecuteLong(MsMusicDetailActivity.this.k.getId(), 1000) && MsMusicDetailActivity.this.l.p() != 0 && ((MsMusicDetailPresenter) MsMusicDetailActivity.this.b).h()) {
                    if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                        ((MsMusicDetailPresenter) MsMusicDetailActivity.this.b).c();
                        MsMusicDetailActivity.this.c(0);
                        return;
                    }
                    ak.b(com.xiaopeng.musicradio.a.a, bj.b(-1, null));
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.k.setVisibility(8);
        b(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        if (((MsMusicDetailPresenter) this.b).i() == 1) {
            this.k.setVisibility(8);
            b(2);
        }
        c(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.k.setVisibility(8);
        b(3);
        c(2);
    }

    public void b(int i) {
        this.g.setState(i);
        if (i == 1) {
            this.g.setClickable(false);
        } else {
            this.g.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        baj.a().b();
        y.b(this, this.n, b.c.pic_covers_music_220, this.h);
        this.l.d();
    }

    public void a(ArrayList<MusicInfo> arrayList) {
        this.k.setVisibility(0);
        b(0);
        if (this.l.a() != arrayList.size()) {
            this.l.a((List) arrayList, true);
        } else {
            this.l.a((List) arrayList, false);
            this.l.a(0, arrayList.size());
        }
        arrayList.clear();
        A();
        c(2);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.a
    public void b(ArrayList<MusicInfo> arrayList) {
        c(2);
        this.l.b((List) arrayList, true);
        arrayList.clear();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.a
    public void a(boolean z) {
        this.q = z;
        B();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.a
    public void s_() {
        int l = this.l.l();
        if (l != -1) {
            this.l.c(l);
        }
        if (aei.a().c() == 0) {
            MusicInfo d = apk.i().d();
            if (d != null) {
                List<MusicInfo> o = this.l.o();
                int i = 0;
                while (true) {
                    if (i >= o.size()) {
                        break;
                    } else if (d.equals(o.get(i))) {
                        this.l.c(i);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                q();
            }
        } else {
            q();
        }
        x();
        this.k.updateVuiScene();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.a
    public void a(String str, boolean z) {
        List<MusicInfo> o = this.l.o();
        for (int i = 0; i < o.size(); i++) {
            MusicInfo musicInfo = o.get(i);
            if (TextUtils.equals(str, musicInfo.getHash())) {
                LogUtils.i("MsMusicDetailActivity", "updateLove:" + str + ListSignBean.COLLECTID_SUFFIX + z + ",musicInfo=" + musicInfo.isHttpCache());
                musicInfo.setHot(z);
                this.l.a(i, Boolean.valueOf(z));
                this.k.updateVuiScene(800);
                return;
            }
        }
    }

    private void q() {
        int l = this.l.l();
        if (l != -1) {
            this.l.c(l);
        }
    }

    private void x() {
        int i = 2;
        if (aei.a().c() == 0) {
            if (w()) {
                int playState = apk.i().getPlayState();
                if (playState == 2 || playState == 1) {
                    this.s.setImageResource(b.c.ic_btn_stop_black);
                    this.t.setText(be.a(b.f.bt_pause));
                    i = 1;
                } else {
                    this.s.setImageResource(b.c.ic_btn_playall_black);
                    this.t.setText(be.a(b.f.bt_continue_all));
                }
            } else {
                y();
            }
        } else {
            y();
        }
        if (i != this.w) {
            VuiUtils.setStatefulButtonAttr(this.r, i, this.u, big.SETVALUE.a() + "|" + big.CLICK.a());
            VuiEngine.getInstance(this).updateScene(m(), this.r);
            this.w = i;
        }
    }

    private void y() {
        this.s.setImageResource(b.c.ic_btn_playall_black);
        this.t.setText(be.a(b.f.bt_play_all));
    }

    private void z() {
        int c = aei.a().c();
        if (w() && c == 0) {
            int playState = apk.i().getPlayState();
            if (playState == 2 || playState == 1) {
                this.s.setImageResource(b.c.ic_btn_stop_black);
                this.t.setText(be.a(b.f.bt_pause));
                return;
            }
            this.s.setImageResource(b.c.ic_btn_playall_black);
            this.t.setText(be.a(b.f.bt_continue_all));
            return;
        }
        y();
    }

    private void A() {
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.8
            @Override // java.lang.Runnable
            public void run() {
                MsMusicDetailActivity.this.s_();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.q) {
            this.p.setImageResource(b.c.ic_32_list_like_hl);
            this.i.setText(be.a(b.f.has_collect));
            this.j.setSelected(true);
        } else {
            this.p.setImageResource(b.c.ic_32_list_like_nor_musicdetail);
            this.i.setText(be.a(b.f.collect_music));
            this.j.setSelected(false);
        }
        VuiEngine.getInstance(this).updateScene(m(), this.j);
    }

    public void u() {
        MusicRadioItem musicRadioItem = new MusicRadioItem();
        musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        musicRadioItem.setTitle(this.m);
        musicRadioItem.setName(this.m);
        musicRadioItem.setLogoUrl(this.n);
        musicRadioItem.setLogo(this.n);
        musicRadioItem.setId(this.o.longValue());
        ams.a().a(musicRadioItem);
    }

    public ListSignBean s() {
        return au.b(this.o.longValue(), this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        if (this.k.isComputingLayout()) {
            this.k.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity.9
                @Override // java.lang.Runnable
                public void run() {
                    MsMusicDetailActivity.this.l.f(i);
                }
            });
        } else {
            this.l.f(i);
        }
    }

    public boolean w() {
        String x = apk.i().x();
        if (apk.i().d() == null || TextUtils.isEmpty(x)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(this.o);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return x.contains(sb.toString());
    }

    @Override // com.xiaopeng.musicradio.music.main.view.a
    public void t_() {
        this.l.d();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.a
    public void u_() {
        c(1);
        this.l.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        this.l.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null || view.getId() != this.r.getId()) {
            return;
        }
        String str = (String) bioVar.getEventValue(bioVar);
        List asList = Arrays.asList(this.u);
        if (str == null || !asList.contains(str)) {
            return;
        }
        int indexOf = asList.indexOf(str);
        if (indexOf == 0 || indexOf == 1) {
            if (this.t.getText().equals(be.a(b.f.bt_pause))) {
                VuiEngine.getInstance(this).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经播放了哦").build());
                return;
            }
            VuiFloatingLayerManager.show(view);
            this.r.performClick();
        } else if (this.t.getText().equals(be.a(b.f.bt_pause))) {
            VuiFloatingLayerManager.show(view);
            this.r.performClick();
        } else {
            VuiEngine.getInstance(this).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经暂停了哦").build());
        }
    }
}
