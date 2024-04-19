package com.xiaopeng.musicradio.usb.dir.detail;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.vui.a;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.dir.detail.present.UsbDirDetailPresenter;
import com.xiaopeng.musicradio.usb.widget.RecyclerViewFastScroller;
import com.xiaopeng.musicradio.usb.widget.UsbPlayAllButton;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.bb;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.v;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Route(path = "/usbview/usb_dir_detail")
/* loaded from: classes2.dex */
public class DirDetailActivity extends a<bbc, UsbDirDetailPresenter> implements bbc {
    public DialogTopLayout f;
    public LoadingTipsView g;
    protected int h;
    protected int i;
    private BaseRecycleView k;
    private e l;
    private List<Object> m;
    private UsbPlayAllButton o;
    private bay q;
    private RecyclerViewFastScroller r;
    private List<MusicInfo> n = new ArrayList();
    private int p = 2;
    protected int j = 0;
    private String[] s = {be.a(a.d.bt_play_all), be.a(a.d.bt_continue_all), be.a(a.d.vui_label_stop)};

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicUsbDirDetail";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public UsbDirDetailPresenter e() {
        return new UsbDirDetailPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return a.c.layout_usb_dir_detail;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (DialogTopLayout) findViewById(a.b.ms_top_layout);
        this.k = (BaseRecycleView) findViewById(a.b.dir_rv);
        this.o = (UsbPlayAllButton) findViewById(a.b.play_all);
        this.g = (LoadingTipsView) findViewById(a.b.loadingview);
        this.g.setNoResultText(a.d.no_usb_music);
        this.r = (RecyclerViewFastScroller) findViewById(a.b.detail_fastscroller);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        this.f.a(false);
        this.k.setHasFixedSize(true);
        this.k.setItemAnimator(new androidx.recyclerview.widget.e());
        this.k.setLayoutManager(new LinearLayoutManager(this) { // from class: com.xiaopeng.musicradio.usb.dir.detail.DirDetailActivity.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void a(RecyclerView.s sVar) {
                super.a(sVar);
                DirDetailActivity.this.r.setVisibility(DirDetailActivity.this.l.a() > (r() - p()) + 1 ? 0 : 8);
            }
        });
        this.k.addItemDecoration(new j(12, 100, 0));
        ((q) this.k.getItemAnimator()).a(false);
        this.k.setAdapter(this.l);
        this.k.initVuiAttr(m(), VuiEngine.getInstance(this));
        this.k.enableVuiInvisibleFeature(1);
        this.m = new ArrayList();
        this.l = new e();
        u();
        if (getIntent() != null) {
            bay a = bbh.a().a(getIntent().getStringExtra("extra_dir_path"));
            if (a != null) {
                this.f.setTitle(v.b(a.c()));
                a(a);
            }
        }
        UsbPlayAllButton usbPlayAllButton = this.o;
        String[] strArr = this.s;
        VuiUtils.setStatefulButtonAttr(usbPlayAllButton, 2, strArr, big.SETVALUE.a() + "|" + big.CLICK.a());
        this.k.initVuiAttr(m(), VuiEngine.getInstance(this));
        this.k.enableVuiInvisibleFeature(1);
        c.c(this.o);
        this.o.setVuiPriority(bik.LEVEL2);
        this.r.setRecyclerView(this.k);
        this.r.a(a.c.recycler_view_fast_scroller, a.b.fastscroller_handle);
    }

    private void u() {
        this.l.a(bbd.class, new bba());
        this.l.a(bbe.class, new bbb());
        this.k.setItemViewCacheSize(50);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.f.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.usb.dir.detail.DirDetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DirDetailActivity.this.finish();
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.usb.dir.detail.DirDetailActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String playText = DirDetailActivity.this.o.getPlayText();
                if (TextUtils.equals(playText, be.a(b.f.bt_play_all))) {
                    List<MusicInfo> list = DirDetailActivity.this.n;
                    if (list.size() > 0) {
                        String json = ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_DIR_PREFIX + DirDetailActivity.this.q.c()).toJson();
                        int a = bb.a(list);
                        bcd.a().d(list, json, a, list.get(a));
                        bcc.q();
                    }
                } else if (TextUtils.equals(playText, be.a(b.f.bt_pause))) {
                    apk.i().pause();
                } else if (TextUtils.equals(playText, be.a(b.f.bt_continue_all))) {
                    apk.i().play();
                }
            }
        });
        this.k.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.usb.dir.detail.DirDetailActivity.4
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                DirDetailActivity dirDetailActivity = DirDetailActivity.this;
                dirDetailActivity.j = i;
                if (dirDetailActivity.k == null || DirDetailActivity.this.k.getAdapter() == null) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) DirDetailActivity.this.k.getLayoutManager();
                DirDetailActivity.this.h = linearLayoutManager.p();
                DirDetailActivity.this.i = linearLayoutManager.r();
                if (DirDetailActivity.this.j == 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = DirDetailActivity.this.h; i2 < DirDetailActivity.this.i + 1; i2++) {
                        Object obj = DirDetailActivity.this.m.get(i2);
                        if (obj instanceof bbe) {
                            arrayList.add(((bbe) obj).a());
                        }
                    }
                    bbh.a().a(arrayList);
                    bbm.a().c((List) arrayList);
                }
            }
        });
    }

    @Override // defpackage.bbc
    public void q() {
        finish();
    }

    public void a(bay bayVar) {
        this.q = bayVar;
        List<bay> b = bayVar.b();
        List<MusicInfo> a = bayVar.a();
        if (b.size() == 0 && a.size() == 0) {
            this.g.setState(3);
            this.k.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        this.g.setState(0);
        this.m.clear();
        this.k.setVisibility(0);
        List<MusicInfo> a2 = bce.a(bayVar);
        this.n.clear();
        this.n.addAll(a2);
        for (int i = 0; i < b.size(); i++) {
            this.m.add(new bbd(b.get(i), i, m()));
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            this.m.add(new bbe(a.get(i2), this.n, this.q, i2 + b.size(), 2, m()));
        }
        this.l.a(this.m);
        this.k.setAdapter(this.l);
        int a3 = bce.a(a);
        if (a3 >= 0) {
            this.k.scrollToPosition(b.size() + a3);
        }
        this.o.setCountText(this.n.size());
        v();
    }

    @Override // defpackage.bbc
    public void r() {
        v();
    }

    @Override // defpackage.bbc
    public void s() {
        if (this.k.isComputingLayout()) {
            this.k.post(new Runnable() { // from class: com.xiaopeng.musicradio.usb.dir.detail.DirDetailActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    if (DirDetailActivity.this.l == null || DirDetailActivity.this.l.a() <= 0) {
                        return;
                    }
                    DirDetailActivity.this.l.a(DirDetailActivity.this.h, (DirDetailActivity.this.i - DirDetailActivity.this.h) + 1);
                }
            });
            return;
        }
        e eVar = this.l;
        if (eVar == null || eVar.a() <= 0) {
            return;
        }
        e eVar2 = this.l;
        int i = this.h;
        eVar2.a(i, (this.i - i) + 1);
    }

    private void v() {
        int i = 2;
        if (aei.a().c() == 0) {
            if (t()) {
                int playState = apk.i().getPlayState();
                this.o.setPlayState(playState);
                if (playState == 2 || playState == 1) {
                    i = 1;
                }
            } else {
                w();
            }
        } else {
            w();
        }
        if (i != this.p) {
            VuiUtils.setStatefulButtonAttr(this.o, i, this.s, big.SETVALUE.a() + "|" + big.CLICK.a());
            VuiEngine.getInstance(this).updateScene(m(), this.o);
            this.p = i;
        }
    }

    private void w() {
        this.o.setPlayState(-1);
    }

    public boolean t() {
        String x = apk.i().x();
        MusicInfo d = apk.i().d();
        ListSignBean listSignBean = (ListSignBean) z.a(x, (Class<Object>) ListSignBean.class);
        if (listSignBean == null || d == null || TextUtils.isEmpty(x)) {
            return false;
        }
        String tag = listSignBean.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.USB_DIR_PREFIX);
        sb.append(this.q.c());
        return TextUtils.equals(tag, sb.toString());
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.q == null || this.m.size() <= 0) {
            return;
        }
        v();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null || view.getId() != this.o.getId()) {
            return;
        }
        String str = (String) bioVar.getEventValue(bioVar);
        List asList = Arrays.asList(this.s);
        if (str == null || !asList.contains(str)) {
            return;
        }
        int indexOf = asList.indexOf(str);
        if (indexOf == 0 || indexOf == 1) {
            if (this.o.getPlayText().equals(be.a(a.d.bt_pause))) {
                VuiEngine.getInstance(this).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经播放了哦").build());
                return;
            }
            VuiFloatingLayerManager.show(view);
            this.o.performClick();
        } else if (this.o.getPlayText().equals(be.a(a.d.bt_pause))) {
            VuiFloatingLayerManager.show(view);
            this.o.performClick();
        } else {
            VuiEngine.getInstance(this).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经暂停了哦").build());
        }
    }
}
