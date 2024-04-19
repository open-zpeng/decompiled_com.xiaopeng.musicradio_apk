package com.xiaopeng.musicradio.program.player.view;

import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout;
import com.xiaopeng.musicradio.playercomponent.big.view.ShareButtonLayout;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.player.presenter.ProgramPlayerPresenter;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import com.xiaopeng.xui.widget.XImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProgramPlayerFragment.java */
@Route(path = "/program/fragment/player")
/* loaded from: classes2.dex */
public class e extends com.xiaopeng.musicradio.playercomponent.big.view.g<b, ProgramPlayerPresenter> implements b {
    private static final String[] d = {"1", "1.25", "1.5", "2"};
    private PlayerCommonLayout e;
    private XImageView f;
    private XImageView g;
    private View h;
    private ShareButtonLayout i;
    private boolean j = false;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "PlayerMainProgram";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.fragment_program_player;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.e = (PlayerCommonLayout) a(b.d.layout_player_base);
        this.f = (XImageView) a(b.d.img_speed);
        this.g = (XImageView) a(b.d.img_love);
        this.i = (ShareButtonLayout) a(b.d.view_share);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.e.setSceneId(o());
        a();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.player.view.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((ProgramPlayerPresenter) e.this.b).j();
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.player.view.e.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(b.d.img_love, 1000)) {
                    awd.h();
                    ((ProgramPlayerPresenter) e.this.b).i();
                }
            }
        });
        com.xiaopeng.musicradio.vui.c.c(this.g);
        this.e.setPlayListClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.player.view.e.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewStub viewStub;
                VuiEngine.getInstance(e.this.getContext()).updateScene(e.this.o(), view);
                e.this.j = view.isSelected();
                boolean z = false;
                if (e.this.j) {
                    e.this.g.setVisibility(8);
                    e.this.f.setVisibility(8);
                    e.this.i.setVisibility(8);
                    if (e.this.h == null && (viewStub = (ViewStub) e.this.a(b.d.view_stub_play_list_holder)) != null) {
                        e.this.h = viewStub.inflate();
                        VuiEngine.getInstance(e.this.getContext()).updateScene(e.this.o(), e.this.h);
                    }
                    e.this.h.setVisibility(0);
                    e.this.v();
                    return;
                }
                e.this.g.setVisibility(0);
                e.this.f.setVisibility(0);
                e.this.a();
                e eVar = e.this;
                if (((ProgramPlayerPresenter) eVar.b).k() && !e.this.j) {
                    z = true;
                }
                eVar.b(z);
                e.this.a();
                if (e.this.h != null) {
                    e.this.h.setVisibility(8);
                }
                e.this.v();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: t */
    public ProgramPlayerPresenter ao_() {
        return new ProgramPlayerPresenter();
    }

    @Override // com.xiaopeng.musicradio.program.player.view.b
    public void a(float f) {
        int i = b.c.icon_player_speed;
        if (f == 1.0f) {
            i = b.c.ic_120_10;
            VuiUtils.setStatefulButtonAttr(this.f, 0, u(), null);
        } else if (f == 1.25f) {
            i = b.c.ic_120_x125;
            VuiUtils.setStatefulButtonAttr(this.f, 1, u(), null);
        } else if (f == 1.5f) {
            i = b.c.ic_120_15;
            VuiUtils.setStatefulButtonAttr(this.f, 2, u(), null);
        } else if (f == 2.0f) {
            i = b.c.ic_120_20;
            VuiUtils.setStatefulButtonAttr(this.f, 3, u(), null);
        }
        try {
            JSONObject vuiProps = this.f.getVuiProps();
            vuiProps.put(VuiConstants.PROPS_UNIT, "speed");
            this.f.setVuiProps(vuiProps);
        } catch (Exception unused) {
        }
        this.f.setImageResource(i);
        VuiEngine.getInstance(getContext()).updateScene(o(), this.f);
    }

    private String[] u() {
        return new String[]{getString(b.f.program_xui_speed_1), getString(b.f.program_xui_speed_125), getString(b.f.program_xui_speed_150), getString(b.f.program_xui_speed_2)};
    }

    @Override // com.xiaopeng.musicradio.program.player.view.b
    public void f_(boolean z) {
        b(((ProgramPlayerPresenter) this.b).k() && !this.j);
        this.g.setSelected(z);
        VuiEngine.getInstance(getContext()).updateScene(o(), this.g);
    }

    @Override // com.xiaopeng.musicradio.program.player.view.b
    public void a(int i, boolean z) {
        this.e.a(i, z);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void b(String str, String str2) {
        this.e.a(str, str2);
        this.e.c(true);
        c(true);
        b(true);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void F_() {
        this.e.f();
        this.e.a(b.c.pic_program_default_220);
        b(false);
        c(false);
    }

    public void b(boolean z) {
        this.g.setClickable(z);
        this.g.setEnabled(z);
        if (z) {
            this.g.setAlpha(1.0f);
        } else {
            this.g.setAlpha(0.15f);
        }
        VuiEngine.getInstance(getContext()).updateScene(o(), this.g);
    }

    public void c(boolean z) {
        this.f.setClickable(z);
        this.f.setEnabled(z);
        if (z) {
            this.f.setAlpha(1.0f);
        } else {
            this.f.setAlpha(0.15f);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("PlayerSubTop");
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        super.onVuiEvent(view, bioVar);
        a(view, bioVar);
    }

    public void a(View view, bio bioVar) {
        Log.i("ProgramPlayerFragment", "handleVuiEvent: =======");
        if (view == null || view.getId() != this.f.getId()) {
            return;
        }
        VuiFloatingLayerManager.show(view);
        String str = (String) bioVar.getEventValue(bioVar);
        Log.i("ProgramPlayerFragment", "handleVuiEvent: " + str);
        List asList = Arrays.asList(d);
        if (str == null || !asList.contains(str)) {
            return;
        }
        int indexOf = asList.indexOf(str);
        if (indexOf == 0) {
            ((ProgramPlayerPresenter) this.b).a(1.0f);
        } else if (indexOf == 1) {
            ((ProgramPlayerPresenter) this.b).a(1.25f);
        } else if (indexOf == 2) {
            ((ProgramPlayerPresenter) this.b).a(1.5f);
        } else {
            ((ProgramPlayerPresenter) this.b).a(2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e.getUpdateViews());
        arrayList.addAll(Arrays.asList(this.g, this.f));
        VuiEngine.getInstance(getContext()).updateScene(o(), arrayList);
        if (this.h != null) {
            VuiEngine.getInstance(getContext()).updateElementAttribute(o(), this.h);
        }
    }

    @Override // com.xiaopeng.musicradio.program.player.view.b
    public void a() {
        if (((ProgramPlayerPresenter) this.b).k() && !this.j) {
            this.i.setVisibility(0);
            VuiEngine.getInstance(getContext()).updateScene(o(), this.i);
            return;
        }
        this.i.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public boolean onInterceptVuiEvent(View view, bio bioVar) {
        Log.i("ProgramPlayerFragment", "onInterceptVuiEvent: View ID is: " + view.getId() + "LoveView ID is " + this.g.getId());
        if (this.g != null && view.getId() == this.g.getId() && !aqf.a().e()) {
            VuiEngine.getInstance(getContext()).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("订阅读物需要先登录喜马拉雅账号").build());
        }
        return super.onInterceptVuiEvent(view, bioVar);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.g
    public boolean r() {
        return this.e.q();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.g
    public void s() {
        this.e.g();
    }
}
