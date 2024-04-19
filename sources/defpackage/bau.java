package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.bumptech.glide.Glide;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XRecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UsbBaseFragment.java */
/* renamed from: bau  reason: default package */
/* loaded from: classes2.dex */
public class bau<UIInterface, Presenter extends BasePresenter<UIInterface>, T> extends b<UIInterface, Presenter> {
    protected XRecyclerView d;
    protected aes e;
    protected LoadingTipsView f;
    protected int g;
    protected int h;
    protected int i = 0;
    private int j = 40;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected Presenter ao_() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z) {
    }

    public List<T> v() {
        return null;
    }

    public bbn w() {
        return null;
    }

    public aes x() {
        return null;
    }

    public int y() {
        return 0;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return a.c.layout_usb_base_fragment;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.f = (LoadingTipsView) a(a.b.loading_item);
        this.d = (XRecyclerView) a(a.b.rv);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    public void g() {
        this.e = x();
        this.d.setItemAnimator(new e());
        h hVar = new h(4, y(), false);
        hVar.a(32);
        this.d.addItemDecoration(hVar);
        this.d.addItemDecoration(new j(0, 100));
        this.d.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.d.setHasFixedSize(true);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.e);
        this.d.initVuiAttr(o(), VuiEngine.getInstance(getContext()), true, true, true);
        this.f.setNoResultText(a.d.copyright_restrict_hint);
        this.f.setVisibility(8);
        this.d.setVuiLabel(be.a(b.f.vui_right));
        this.d.setVuiPriority(bik.LEVEL2);
        this.d.setItemViewCacheSize(this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    public void E_() {
        this.d.addOnScrollListener(new RecyclerView.m() { // from class: bau.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                switch (i) {
                    case 0:
                        try {
                            if (bau.this.getContext() != null) {
                                Glide.with(bau.this.getContext()).resumeRequests();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        bau.this.b(true);
                        break;
                    case 1:
                    case 2:
                        try {
                            if (bau.this.getContext() != null) {
                                Glide.with(bau.this.getContext()).pauseRequests();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        bau.this.b(false);
                        break;
                }
                bau bauVar = bau.this;
                bauVar.i = i;
                bauVar.B();
            }
        });
    }

    public void b(int i) {
        this.f.setState(i);
    }

    public void a() {
        b(1);
        this.d.setVisibility(8);
    }

    public void r() {
        this.e.a(new ArrayList());
        b(3);
        this.d.setVisibility(8);
    }

    public void A() {
        b(0);
        this.d.setVisibility(0);
        B();
    }

    public void s() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: bau.2
                @Override // java.lang.Runnable
                public void run() {
                    if (bau.this.e == null || bau.this.e.a() <= 0) {
                        return;
                    }
                    bau.this.e.d();
                }
            });
            return;
        }
        aes aesVar = this.e;
        if (aesVar == null || aesVar.a() <= 0) {
            return;
        }
        this.e.d();
    }

    public void c(final int i) {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: bau.3
                @Override // java.lang.Runnable
                public void run() {
                    if (bau.this.e == null || bau.this.e.a() <= 0) {
                        return;
                    }
                    bau.this.e.c(i);
                }
            });
            return;
        }
        aes aesVar = this.e;
        if (aesVar == null || aesVar.a() <= 0) {
            return;
        }
        this.e.c(i);
    }

    public void t() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: bau.4
                @Override // java.lang.Runnable
                public void run() {
                    if (bau.this.e == null || bau.this.e.a() <= 0) {
                        return;
                    }
                    bau.this.e.a(bau.this.g, (bau.this.h - bau.this.g) + 1);
                }
            });
            return;
        }
        aes aesVar = this.e;
        if (aesVar == null || aesVar.a() <= 0) {
            return;
        }
        aes aesVar2 = this.e;
        int i = this.g;
        aesVar2.a(i, (this.h - i) + 1);
    }

    public void B() {
        ban.b(new Runnable() { // from class: bau.5
            @Override // java.lang.Runnable
            public void run() {
                if (bau.this.d == null || bau.this.d.getAdapter() == null) {
                    return;
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) bau.this.d.getLayoutManager();
                bau.this.g = gridLayoutManager.p();
                bau.this.h = gridLayoutManager.r();
                if (bau.this.i != 0 || bau.this.v() == null || bau.this.v().size() <= 0 || bau.this.g < 0 || bau.this.h < 0) {
                    return;
                }
                if (bau.this.h > bau.this.v().size() - 1) {
                    bau bauVar = bau.this;
                    bauVar.h = bauVar.v().size() - 1;
                }
                bau.this.w().c((List) bau.this.v().subList(bau.this.g, bau.this.h + 1));
            }
        }, 150L);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.d.updateVuiScene();
    }
}
