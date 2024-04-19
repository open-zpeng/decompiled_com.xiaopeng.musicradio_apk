package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.song.present.SongMainPresenter;
import com.xiaopeng.musicradio.usb.widget.RecyclerViewFastScroller;
import com.xiaopeng.musicradio.usb.widget.UsbPlayAllButton;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.bb;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import defpackage.aep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: SongMainFragment.java */
@Route(path = "/usb/main/song")
/* renamed from: bcb  reason: default package */
/* loaded from: classes2.dex */
public class bcb extends b<bbz, SongMainPresenter> implements bbz {
    private BaseRecycleView d;
    private bca e;
    private LoadingTipsView f;
    private UsbPlayAllButton g;
    private int i;
    private int j;
    private RecyclerViewFastScroller l;
    private int h = 2;
    private int k = 0;
    private String[] m = {be.a(a.d.bt_play_all), be.a(a.d.bt_continue_all), be.a(a.d.vui_label_stop)};

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "UsbSongMain";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return a.c.layout_usb_song_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.f = (LoadingTipsView) a(a.b.loading_item);
        this.d = (BaseRecycleView) a(a.b.song_rv);
        this.g = (UsbPlayAllButton) a(a.b.play_all);
        this.l = (RecyclerViewFastScroller) a(a.b.song_fastscroller);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.d.setHasFixedSize(true);
        this.d.setItemAnimator(new e());
        this.d.setLayoutManager(new LinearLayoutManager(getContext()) { // from class: bcb.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void a(RecyclerView.s sVar) {
                super.a(sVar);
                bcb.this.l.setVisibility(bcb.this.e.a() > (r() - p()) + 1 ? 0 : 8);
            }
        });
        this.d.addItemDecoration(new j(12, 100, 0));
        ((q) this.d.getItemAnimator()).a(false);
        r();
        this.d.setAdapter(this.e);
        this.d.enableVuiInvisibleFeature(1);
        this.f.setNoResultText(a.d.no_usb_music);
        v();
        this.d.initVuiAttr(o(), VuiEngine.getInstance(getContext()), true, true, true);
        this.d.setVuiLabel(be.a(b.f.vui_right));
        this.d.setVuiPriority(bik.LEVEL2);
        this.l.setRecyclerView(this.d);
        this.l.a(a.c.recycler_view_fast_scroller, a.b.fastscroller_handle);
    }

    public void r() {
        this.e = new bca(getContext(), a.c.usb_song_detail_item, 12, new aep.b() { // from class: bcb.2
            @Override // defpackage.aep.b
            public void a() {
                if (bcb.this.e.a() > 0) {
                    bcb.this.e.d();
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.e.a(new aep.c() { // from class: bcb.3
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                List<MusicInfo> f;
                if (i2 >= 0 && (f = bbh.a().f()) != null && i2 <= f.size() - 1 && f.size() > 0) {
                    String json = ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_SONG_PREFIX).toJson();
                    if (TextUtils.equals(json, apk.i().x())) {
                        bcd.a().a(f, json, i2, f.get(i2));
                    } else {
                        bcd.a().a(f, json, i2, null);
                    }
                    bcc.b();
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: bcb.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String playText = bcb.this.g.getPlayText();
                if (TextUtils.equals(playText, be.a(b.f.bt_play_all))) {
                    List<MusicInfo> f = bbh.a().f();
                    if (f.size() > 0) {
                        String json = ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_SONG_PREFIX).toJson();
                        int a = bb.a(f);
                        bcd.a().a(f, json, a, f.get(a));
                        bcc.c();
                    }
                } else if (TextUtils.equals(playText, be.a(b.f.bt_pause))) {
                    apk.i().pause();
                } else if (TextUtils.equals(playText, be.a(b.f.bt_continue_all))) {
                    apk.i().play();
                }
            }
        });
        this.d.addOnScrollListener(new RecyclerView.m() { // from class: bcb.5
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                bcb.this.k = i;
                bcb.this.u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        ban.b(new Runnable() { // from class: bcb.6
            @Override // java.lang.Runnable
            public void run() {
                if (bcb.this.d == null || bcb.this.d.getAdapter() == null) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) bcb.this.d.getLayoutManager();
                bcb.this.i = linearLayoutManager.p();
                bcb.this.j = linearLayoutManager.r();
                if (bcb.this.k != 0 || bcb.this.e.l() == null || bcb.this.e.l().size() <= 0 || bcb.this.i < 0 || bcb.this.j < 0) {
                    return;
                }
                if (bcb.this.j > bcb.this.e.l().size() - 1) {
                    bcb bcbVar = bcb.this;
                    bcbVar.j = bcbVar.e.l().size() - 1;
                }
                List<MusicInfo> subList = bcb.this.e.l().subList(bcb.this.i, bcb.this.j + 1);
                bbh.a().a(subList);
                bbm.a().c((List) subList);
            }
        }, 150L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: s */
    public SongMainPresenter ao_() {
        return new SongMainPresenter();
    }

    public void b(int i) {
        this.f.setState(i);
    }

    @Override // defpackage.bbz
    public void a() {
        b(1);
        this.d.setVisibility(8);
        this.g.setVisibility(8);
    }

    @Override // defpackage.bbz
    public void aw_() {
        b(3);
        this.e.a(new ArrayList());
        this.d.setVisibility(8);
        this.g.setVisibility(8);
    }

    @Override // defpackage.bbz
    public void a(List<MusicInfo> list) {
        this.g.setVisibility(0);
        this.g.setCountText(list.size());
        b(0);
        this.e.a(list);
        this.d.setVisibility(0);
        int a = bce.a(list);
        if (a >= 0) {
            this.d.scrollToPosition(a);
        }
        u();
    }

    @Override // defpackage.bbz
    public void ax_() {
        this.e.d();
        v();
    }

    @Override // defpackage.bbz
    public void a(final int i, final MusicInfo musicInfo) {
        if (i >= this.i && i < this.j && this.k == 0) {
            bbm.a().d((bbm) musicInfo);
        }
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: bcb.7
                @Override // java.lang.Runnable
                public void run() {
                    if (bcb.this.e == null || bcb.this.e.a() <= 0) {
                        return;
                    }
                    bcb.this.e.a(i, musicInfo);
                }
            });
            return;
        }
        bca bcaVar = this.e;
        if (bcaVar == null || bcaVar.a() <= 0) {
            return;
        }
        this.e.a(i, musicInfo);
    }

    @Override // defpackage.bbz
    public void m_(final int i) {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: bcb.8
                @Override // java.lang.Runnable
                public void run() {
                    if (bcb.this.e == null || bcb.this.e.a() <= 0) {
                        return;
                    }
                    bcb.this.c(i);
                }
            });
            return;
        }
        bca bcaVar = this.e;
        if (bcaVar == null || bcaVar.a() <= 0) {
            return;
        }
        c(i);
    }

    @Override // defpackage.bbz
    public void ay_() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: bcb.9
                @Override // java.lang.Runnable
                public void run() {
                    if (bcb.this.e == null || bcb.this.e.a() <= 0) {
                        return;
                    }
                    bcb.this.e.a(bcb.this.i, (bcb.this.j - bcb.this.i) + 1);
                }
            });
            return;
        }
        bca bcaVar = this.e;
        if (bcaVar == null || bcaVar.a() <= 0) {
            return;
        }
        bca bcaVar2 = this.e;
        int i = this.i;
        bcaVar2.a(i, (this.j - i) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.e.l().remove(i);
        this.e.d(i);
        this.g.setCountText(this.e.l().size());
        u();
    }

    private void v() {
        int i = 2;
        if (aei.a().c() == 0) {
            if (t()) {
                int playState = apk.i().getPlayState();
                this.g.setPlayState(playState);
                if (playState == 2 || playState == 1) {
                    i = 1;
                }
            } else {
                w();
            }
        } else {
            w();
        }
        VuiUtils.setStatefulButtonAttr(this.g, i, this.m, big.SETVALUE.a() + "|" + big.CLICK.a());
        VuiEngine.getInstance(getContext()).updateScene(o(), this.g);
        this.h = i;
    }

    private void w() {
        this.g.setPlayState(-1);
    }

    public boolean t() {
        String x = apk.i().x();
        return (apk.i().d() == null || TextUtils.isEmpty(x) || !x.contains(ListSignBean.USB_SONG_PREFIX)) ? false : true;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        v();
        this.d.updateVuiScene();
    }

    @Override // defpackage.bbz
    public void j() {
        this.e.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MusicUsbMain");
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public boolean n() {
        return super.n();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null || view.getId() != this.g.getId()) {
            return;
        }
        String str = (String) bioVar.getEventValue(bioVar);
        List asList = Arrays.asList(this.m);
        if (str == null || !asList.contains(str)) {
            return;
        }
        int indexOf = asList.indexOf(str);
        if (indexOf == 0 || indexOf == 1) {
            if (this.g.getPlayText().equals(be.a(a.d.bt_pause))) {
                VuiEngine.getInstance(getContext()).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经播放了哦").build());
                return;
            }
            VuiFloatingLayerManager.show(view);
            this.g.performClick();
        } else if (this.g.getPlayText().equals(be.a(a.d.bt_pause))) {
            VuiFloatingLayerManager.show(view);
            this.g.performClick();
        } else {
            VuiEngine.getInstance(getContext()).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经暂停了哦").build());
        }
    }
}
