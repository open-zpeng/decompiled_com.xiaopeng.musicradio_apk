package com.xiaopeng.musicradio.music.concentration.zone.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.VipMusicMoreInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.detail.presenter.ZomeMusicChildrenItemPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ZoneMusicChildrenLayout extends BaseFrameLayout implements View.OnClickListener, b {
    private XTextView c;
    private XTextView d;
    private XTextView e;
    private XTextView f;
    private XTextView g;
    private XTextView h;
    private XTextView i;
    private XTextView j;
    private XTextView k;
    private int l;
    private List<VipMusicMoreInfo.ModuleBean> m;
    private List<XTextView> n;
    private List<XTextView> o;
    private int p;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    public ZoneMusicChildrenLayout(Context context) {
        super(context);
        this.l = 0;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
    }

    public ZoneMusicChildrenLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 0;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
    }

    public ZoneMusicChildrenLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = 0;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (XTextView) findViewById(b.d.music_title);
        this.d = (XTextView) findViewById(b.d.children_1);
        this.e = (XTextView) findViewById(b.d.children_2);
        this.f = (XTextView) findViewById(b.d.children_3);
        this.g = (XTextView) findViewById(b.d.children_4);
        this.h = (XTextView) findViewById(b.d.tv_speech_num1);
        this.i = (XTextView) findViewById(b.d.tv_speech_num2);
        this.j = (XTextView) findViewById(b.d.tv_speech_num3);
        this.k = (XTextView) findViewById(b.d.tv_speech_num4);
        this.n.add(this.h);
        this.n.add(this.i);
        this.n.add(this.j);
        this.n.add(this.k);
        this.o.add(this.d);
        this.o.add(this.e);
        this.o.add(this.f);
        this.o.add(this.g);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_zone_children_item;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        List<VipMusicMoreInfo.ModuleBean> list;
        if (ShakeUtil.canExecuteLong(view.getId())) {
            VipMusicMoreInfo.ModuleBean moduleBean = new VipMusicMoreInfo.ModuleBean() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.ZoneMusicChildrenLayout.1
                {
                    setZoneId(2L);
                }
            };
            if (view.getId() == b.d.children_1) {
                List<VipMusicMoreInfo.ModuleBean> list2 = this.m;
                if (list2 != null && list2.size() > 0) {
                    moduleBean = this.m.get(0);
                }
            } else if (view.getId() == b.d.children_2) {
                List<VipMusicMoreInfo.ModuleBean> list3 = this.m;
                if (list3 != null && list3.size() > 1) {
                    moduleBean = this.m.get(1);
                }
            } else if (view.getId() == b.d.children_3) {
                List<VipMusicMoreInfo.ModuleBean> list4 = this.m;
                if (list4 != null && list4.size() > 2) {
                    moduleBean = this.m.get(2);
                }
            } else if (view.getId() == b.d.children_4 && (list = this.m) != null && list.size() > 3) {
                moduleBean = this.m.get(3);
            }
            if (moduleBean != null) {
                sp.a().a("/music/activity/zone_child_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withString("module_info", z.a(moduleBean)).navigation();
            }
        }
    }

    public void a(String str) {
        this.c.setText(str);
    }

    public void a(List<VipMusicMoreInfo.ModuleBean> list, int i) {
        if (list != null) {
            this.m.clear();
            this.m.addAll(list);
        }
        this.p = this.m.size();
        if (this.p >= 4) {
            this.p = 4;
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            this.o.get(i2).setVisibility(8);
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            this.n.get(i3).setVisibility(8);
        }
        for (int i4 = 0; i4 < this.p; i4++) {
            XTextView xTextView = this.o.get(i4);
            xTextView.setText(list.get(i4).getName());
            xTextView.setVisibility(0);
            xTextView.setVuiLabel(String.format(xTextView.getContext().getResources().getString(b.f.vui_play_child_position), Integer.valueOf(i + i4), list.get(i4).getName().replace("-", be.a(b.f.zone_child_replace_split))));
        }
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.d, this.e, this.f, this.g);
        this.l = i;
        VuiEngine.getInstance(getContext()).setVuiElementTag(this, "zone_music_child_item");
        setVuiLabel(this.c.getText().toString());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected BasePresenter a() {
        return new ZomeMusicChildrenItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.detail.view.b
    public void e() {
        f();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        f();
    }

    private void f() {
        for (int i = 0; i < this.p; i++) {
            XTextView xTextView = this.n.get(i);
            xTextView.setText(String.valueOf(this.l + i));
            xTextView.setVuiLabel(String.format(xTextView.getContext().getResources().getString(b.f.vui_play_position), this.m.get(i).getName(), Integer.valueOf(this.l + i), Integer.valueOf(this.l + i)));
            xTextView.setVisibility(h.a().b() ? 0 : 8);
        }
    }
}
