package com.xiaopeng.musicradio.music.main.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.presenter.MusicMainPresenter;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.MusicRecyclerTabLayout;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import defpackage.aeo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MusicMainFragment.java */
@Route(path = "/music/fragment/main")
/* loaded from: classes.dex */
public class d extends com.xiaopeng.musicradio.commonui.vui.b<c, MusicMainPresenter> implements c {
    private MusicRecyclerTabLayout d;
    private NoScrollViewPager e;
    private aeo f;
    private MusicMainAuthLayout g;
    private ConstraintLayout h;
    private boolean i = false;
    private View j;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public boolean n() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainMusicLocalLeft";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("MusicMainFragment", "onCreate: ================");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.music_fragment_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        Log.i("MusicMainFragment", "setView: ===========");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public MusicMainPresenter ao_() {
        return new MusicMainPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.c
    public void a() {
        if (apx.a().d()) {
            MusicMainAuthLayout musicMainAuthLayout = this.g;
            if (musicMainAuthLayout != null) {
                musicMainAuthLayout.setVisibility(8);
                a(8, this.g);
            }
            if (this.h == null) {
                View a = a(b.d.stub_music_main);
                if (a != null) {
                    a.setVisibility(0);
                }
                this.h = (ConstraintLayout) a(b.d.music_main_layout);
                this.d = (MusicRecyclerTabLayout) a(b.d.tab_music_main);
                this.e = (NoScrollViewPager) a(b.d.music_viewpager);
                this.j = this.d;
            }
            ConstraintLayout constraintLayout = this.h;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            s();
            return;
        }
        ConstraintLayout constraintLayout2 = this.h;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
        if (this.g == null) {
            ViewStub viewStub = (ViewStub) a(b.d.stub_auth_mask);
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
            this.g = (MusicMainAuthLayout) a(b.d.auth_mask);
        }
        MusicMainAuthLayout musicMainAuthLayout2 = this.g;
        if (musicMainAuthLayout2 != null) {
            musicMainAuthLayout2.setVisibility(0);
            a(0, this.g);
        }
    }

    private void a(int i, View view) {
        if (view == null) {
            return;
        }
        if (view instanceof MusicMainAuthLayout) {
            ((MusicMainAuthLayout) view).setVuiVisible(i);
        } else if (view instanceof ViewGroup) {
            a(i, ((ViewGroup) view).getChildAt(0));
        }
    }

    private void s() {
        if (this.i) {
            return;
        }
        this.i = true;
        aw.a((Object) this.e, "mOffscreenPageLimit", (Object) 0);
        this.f = new aeo(getChildFragmentManager());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new aeo.a("/music/fragment/concentration", be.a(b.f.music_main_selection_title)));
        arrayList.add(new aeo.a("/music/fragment/rank", be.a(b.f.music_main_rank_title)));
        arrayList.add(new aeo.a("/music/fragment/singer", be.a(b.f.music_main_singer_title)));
        this.f.a((List<aeo.a>) arrayList);
        this.e.setAdapter(this.f);
        this.d.setUpWithViewPager(this.e);
        this.d.setVuiLayoutLoadable(false);
        a(k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        super.d();
        aeo aeoVar = this.f;
        if (aeoVar == null || this.e == null) {
            return;
        }
        aeoVar.a(getChildFragmentManager());
        NoScrollViewPager noScrollViewPager = this.e;
        noScrollViewPager.a(noScrollViewPager.getCurrentItem(), false, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    public View k() {
        return this.j;
    }

    @Override // com.xiaopeng.musicradio.music.main.view.c
    public void f_(int i) {
        this.d.a(i);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.i("MusicMainFragment", "onCreateView: ========");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.i("MusicMainFragment", "onResume: ======");
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.i("MusicMainFragment", "onPause: ========");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.i("MusicMainFragment", "onDestroy: ==========");
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    @SuppressLint({"WrongConstant"})
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null) {
            return;
        }
        VuiFloatingLayerManager.show(view, 0, 0, 0, false);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    @SuppressLint({"WrongConstant"})
    public boolean onInterceptVuiEvent(View view, bio bioVar) {
        if (view != null) {
            VuiFloatingLayerManager.show(view, 0, 0, 0, false);
        }
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public void onBuildScene() {
        super.onBuildScene();
        this.d.updateVuiScene(IInputController.KEYCODE_KNOB_WIND_SPD_UP);
    }
}
