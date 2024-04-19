package com.xiaopeng.musicradio.usb.dir.view;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.dir.present.DirMainPresenter;
import com.xiaopeng.musicradio.usb.widget.RecyclerViewFastScroller;
import com.xiaopeng.musicradio.usb.widget.UsbPlayAllButton;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.bb;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
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
/* compiled from: DirMainFragment.java */
@Route(path = "/usb/main/dir")
/* loaded from: classes2.dex */
public class a extends com.xiaopeng.musicradio.commonui.vui.b<c, DirMainPresenter> implements c {
    protected int d;
    protected int e;
    private BaseRecycleView g;
    private LoadingTipsView h;
    private e i;
    private List<Object> j;
    private UsbPlayAllButton l;
    private bay n;
    private RecyclerViewFastScroller o;
    private List<MusicInfo> k = new ArrayList();
    private int m = 2;
    private String[] p = {be.a(a.d.bt_play_all), be.a(a.d.bt_continue_all), be.a(a.d.vui_label_stop)};
    protected int f = 0;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "UsbDirMain";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return a.c.layout_usb_dir_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.h = (LoadingTipsView) a(a.b.loading_item);
        this.g = (BaseRecycleView) a(a.b.dir_rv);
        this.l = (UsbPlayAllButton) a(a.b.play_all);
        this.o = (RecyclerViewFastScroller) a(a.b.dir_fastscroller);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.g.setHasFixedSize(true);
        this.g.setItemAnimator(new androidx.recyclerview.widget.e());
        this.g.setLayoutManager(new LinearLayoutManager(getContext()) { // from class: com.xiaopeng.musicradio.usb.dir.view.a.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void a(RecyclerView.s sVar) {
                super.a(sVar);
                a.this.o.setVisibility(a.this.i.a() > (r() - p()) + 1 ? 0 : 8);
            }
        });
        this.g.addItemDecoration(new j(12, 100, 0));
        ((q) this.g.getItemAnimator()).a(false);
        this.g.setAdapter(this.i);
        this.g.enableVuiInvisibleFeature(1);
        this.h.setNoResultText(a.d.no_usb_music);
        this.h.setVisibility(8);
        this.j = new ArrayList();
        this.i = new e();
        w();
        this.g.setVuiLabel(be.a(b.f.vui_right));
        this.g.setVuiPriority(bik.LEVEL2);
        this.o.setRecyclerView(this.g);
        this.o.a(a.c.recycler_view_fast_scroller, a.b.fastscroller_handle);
    }

    private void w() {
        this.i.a(bbd.class, new bba());
        this.i.a(bbe.class, new bbb());
        this.g.setItemViewCacheSize(50);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.usb.dir.view.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String playText = a.this.l.getPlayText();
                if (TextUtils.equals(playText, be.a(b.f.bt_play_all))) {
                    List<MusicInfo> list = a.this.k;
                    if (list.size() > 0) {
                        bcd.a().d(list, ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_DIR_PREFIX + a.this.n.c()).toJson(), bb.a(list), null);
                        bcc.o();
                    }
                } else if (TextUtils.equals(playText, be.a(b.f.bt_pause))) {
                    apk.i().pause();
                } else if (TextUtils.equals(playText, be.a(b.f.bt_continue_all))) {
                    apk.i().play();
                }
            }
        });
        this.g.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.usb.dir.view.a.3
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                a aVar = a.this;
                aVar.f = i;
                if (aVar.g == null || a.this.g.getAdapter() == null) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) a.this.g.getLayoutManager();
                a.this.d = linearLayoutManager.p();
                a.this.e = linearLayoutManager.r();
                if (a.this.f == 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = a.this.d; i2 < a.this.e + 1; i2++) {
                        Object obj = a.this.j.get(i2);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public DirMainPresenter ao_() {
        return new DirMainPresenter();
    }

    public void b(int i) {
        this.h.setState(i);
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.c
    public void r() {
        b(1);
        this.g.setVisibility(8);
        this.l.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.c
    public void s() {
        b(3);
        this.g.setVisibility(8);
        this.l.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.c
    public void a(bay bayVar) {
        this.n = bayVar;
        this.j.clear();
        b(0);
        this.g.setVisibility(8);
        this.g.setVisibility(0);
        List<bay> b = bayVar.b();
        List<MusicInfo> a = bayVar.a();
        List<MusicInfo> a2 = bce.a(bayVar);
        this.k.clear();
        this.k.addAll(a2);
        for (int i = 0; i < b.size(); i++) {
            this.j.add(new bbd(b.get(i), i, o()));
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            this.j.add(new bbe(a.get(i2), this.k, this.n, i2 + b.size(), 1, o()));
        }
        this.i.a(this.j);
        this.g.setAdapter(this.i);
        int a3 = bce.a(a);
        if (a3 >= 0) {
            this.g.scrollToPosition(b.size() + a3);
        }
        this.l.setCountText(this.k.size());
        x();
        this.l.setVisibility(a2.size() <= 0 ? 8 : 0);
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.c
    public void t() {
        x();
    }

    private void x() {
        int i = 2;
        if (aei.a().c() == 0) {
            if (u()) {
                int playState = apk.i().getPlayState();
                this.l.setPlayState(playState);
                if (playState == 2 || playState == 1) {
                    i = 1;
                }
            } else {
                y();
            }
        } else {
            y();
        }
        VuiUtils.setStatefulButtonAttr(this.l, i, this.p, big.SETVALUE.a() + "|" + big.CLICK.a());
        VuiEngine.getInstance(getContext()).updateScene(o(), this.l);
        this.m = i;
    }

    private void y() {
        this.l.setPlayState(-1);
    }

    public boolean u() {
        String x = apk.i().x();
        MusicInfo d = apk.i().d();
        ListSignBean listSignBean = (ListSignBean) z.a(x, (Class<Object>) ListSignBean.class);
        if (listSignBean == null || d == null || TextUtils.isEmpty(x)) {
            return false;
        }
        String tag = listSignBean.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.USB_DIR_PREFIX);
        sb.append(this.n.c());
        return TextUtils.equals(tag, sb.toString());
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.n != null && this.j.size() > 0) {
            x();
        }
        this.g.updateVuiScene();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MusicUsbMain");
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null || view.getId() != this.l.getId()) {
            return;
        }
        String str = (String) bioVar.getEventValue(bioVar);
        List asList = Arrays.asList(this.p);
        if (str == null || !asList.contains(str)) {
            return;
        }
        int indexOf = asList.indexOf(str);
        if (indexOf == 0 || indexOf == 1) {
            if (this.l.getPlayText().equals(be.a(a.d.bt_pause))) {
                VuiEngine.getInstance(getContext()).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经播放了哦").build());
                return;
            }
            VuiFloatingLayerManager.show(view);
            this.l.performClick();
        } else if (this.l.getPlayText().equals(be.a(a.d.bt_pause))) {
            VuiFloatingLayerManager.show(view);
            this.l.performClick();
        } else {
            VuiEngine.getInstance(getContext()).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经暂停了哦").build());
        }
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.c
    public void v() {
        if (this.g.isComputingLayout()) {
            this.g.post(new Runnable() { // from class: com.xiaopeng.musicradio.usb.dir.view.a.4
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.i == null || a.this.i.a() <= 0) {
                        return;
                    }
                    a.this.i.a(a.this.d, (a.this.e - a.this.d) + 1);
                }
            });
            return;
        }
        e eVar = this.i;
        if (eVar == null || eVar.a() <= 0) {
            return;
        }
        e eVar2 = this.i;
        int i = this.d;
        eVar2.a(i, (this.e - i) + 1);
    }
}
