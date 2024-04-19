package com.xiaopeng.musicradio.main.view;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout;
import com.xiaopeng.musicradio.commonui.widget.MusicViewPager;
import com.xiaopeng.musicradio.main.presenter.MainPresenter;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.MTabLayout;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTabLayout;
import com.xiaopeng.xui.widget.XTabsBar;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aeo;
import defpackage.agh;
import defpackage.aho;
import defpackage.yb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MainLayout extends VuiBaseFrameLayout<a, MainPresenter> implements a {
    private static final Map<String, Integer> d = new HashMap();
    XTabsBar.OnTabsBarClickListener c;
    private MTabLayout e;
    private MusicViewPager f;
    private aeo g;
    private XRelativeLayout h;
    private XLinearLayout i;
    private XLinearLayout j;
    private XRelativeLayout k;
    private XLoading l;
    private XImageView m;
    private XImageView n;
    private boolean o;
    private List<aeo.a> p;
    private int q;
    private XTextView r;
    private boolean s;
    private List<yb.f> t;
    private yb.f u;

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public boolean e() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public String getSceneId() {
        return "MainLocalTop";
    }

    static {
        d.put(SkillStatisticsBean.PAGE_MUSIC, 0);
        d.put("reading", 1);
        d.put("radio", 2);
        d.put("mine", 3);
    }

    public MainLayout(Context context) {
        super(context);
        this.q = -1;
        this.t = new ArrayList();
        this.c = new XTabsBar.OnTabsBarClickListener() { // from class: com.xiaopeng.musicradio.main.view.MainLayout.1
            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public void onTabChangeStart(XTabLayout xTabLayout, int i, boolean z, boolean z2) {
            }

            @Override // com.xiaopeng.xui.widget.XTabsBar.OnTabsBarClickListener
            public void onTabsBarCloseClick(View view) {
            }

            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public boolean onInterceptTabChange(XTabLayout xTabLayout, int i, boolean z, boolean z2) {
                aox.a().a(((aeo.a) MainLayout.this.p.get(i)).a(), true);
                MainLayout.this.f.a(i, false, false);
                Log.i("MainLayout", "onInterceptTabChange: ===== " + i);
                return false;
            }

            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public void onTabChangeEnd(XTabLayout xTabLayout, int i, boolean z, boolean z2) {
                if (MainLayout.this.q != i) {
                    VuiEngine.getInstance(MainLayout.this.getContext()).updateScene(MainLayout.this.getSceneId(), MainLayout.this.e);
                    MainLayout.this.q = i;
                }
            }
        };
    }

    public MainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = -1;
        this.t = new ArrayList();
        this.c = new XTabsBar.OnTabsBarClickListener() { // from class: com.xiaopeng.musicradio.main.view.MainLayout.1
            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public void onTabChangeStart(XTabLayout xTabLayout, int i, boolean z, boolean z2) {
            }

            @Override // com.xiaopeng.xui.widget.XTabsBar.OnTabsBarClickListener
            public void onTabsBarCloseClick(View view) {
            }

            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public boolean onInterceptTabChange(XTabLayout xTabLayout, int i, boolean z, boolean z2) {
                aox.a().a(((aeo.a) MainLayout.this.p.get(i)).a(), true);
                MainLayout.this.f.a(i, false, false);
                Log.i("MainLayout", "onInterceptTabChange: ===== " + i);
                return false;
            }

            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public void onTabChangeEnd(XTabLayout xTabLayout, int i, boolean z, boolean z2) {
                if (MainLayout.this.q != i) {
                    VuiEngine.getInstance(MainLayout.this.getContext()).updateScene(MainLayout.this.getSceneId(), MainLayout.this.e);
                    MainLayout.this.q = i;
                }
            }
        };
    }

    public MainLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = -1;
        this.t = new ArrayList();
        this.c = new XTabsBar.OnTabsBarClickListener() { // from class: com.xiaopeng.musicradio.main.view.MainLayout.1
            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public void onTabChangeStart(XTabLayout xTabLayout, int i2, boolean z, boolean z2) {
            }

            @Override // com.xiaopeng.xui.widget.XTabsBar.OnTabsBarClickListener
            public void onTabsBarCloseClick(View view) {
            }

            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public boolean onInterceptTabChange(XTabLayout xTabLayout, int i2, boolean z, boolean z2) {
                aox.a().a(((aeo.a) MainLayout.this.p.get(i2)).a(), true);
                MainLayout.this.f.a(i2, false, false);
                Log.i("MainLayout", "onInterceptTabChange: ===== " + i2);
                return false;
            }

            @Override // com.xiaopeng.xui.widget.XTabLayout.OnTabChangeListener
            public void onTabChangeEnd(XTabLayout xTabLayout, int i2, boolean z, boolean z2) {
                if (MainLayout.this.q != i2) {
                    VuiEngine.getInstance(MainLayout.this.getContext()).updateScene(MainLayout.this.getSceneId(), MainLayout.this.e);
                    MainLayout.this.q = i2;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public MainPresenter a() {
        return new MainPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.e = (MTabLayout) findViewById(aho.c.layout_main_tab);
        this.f = (MusicViewPager) findViewById(aho.c.viewpager);
        this.h = (XRelativeLayout) findViewById(aho.c.dsp_top_layout);
        this.i = (XLinearLayout) findViewById(aho.c.bt_top_layout);
        this.j = (XLinearLayout) findViewById(aho.c.usb_top_layout);
        this.k = (XRelativeLayout) findViewById(aho.c.voice_search_layout);
        this.r = (XTextView) findViewById(aho.c.bt_txt);
        this.l = (XLoading) findViewById(aho.c.loading_bt);
        this.m = (XImageView) findViewById(aho.c.bt_icon);
        this.n = (XImageView) findViewById(aho.c.usb_icon);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        aw.a((Object) this.f, "mOffscreenPageLimit", (Object) 0);
        this.g = new aeo(getActivity().getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new aeo.a("/music/fragment/main", getResources().getString(aho.e.main_tab_music)));
        arrayList.add(new aeo.a("/program/fragment/main", getResources().getString(aho.e.main_tab_program)));
        arrayList.add(new aeo.a("/netradio/fragment/main", getResources().getString(aho.e.main_tab_netradio)));
        arrayList.add(new aeo.a("/mine/fragment/main", getResources().getString(aho.e.main_tab_mine)));
        this.p = arrayList;
        this.g.a((List<aeo.a>) arrayList);
        this.f.setAdapter(this.g);
        this.t.add(a(getResources().getString(aho.e.main_tab_music), 0));
        this.t.add(a(getResources().getString(aho.e.main_tab_program), aho.b.ic_music_logo_himalayas));
        this.t.add(a(getResources().getString(aho.e.main_tab_netradio), 0));
        this.t.add(a(getResources().getString(aho.e.main_tab_mine), 0));
        for (int i = 0; i < this.t.size(); i++) {
            this.e.a(this.t.get(i), i);
        }
        this.e.setVuiElementType(bih.XTABLAYOUT);
        this.e.enableViewVuiMode(true);
        MTabLayout mTabLayout = this.e;
        mTabLayout.updateVui(mTabLayout);
        int b = ay.b("msg_type", 0);
        Log.i("MainLayout", "setView: =======" + b);
        if (b == 3) {
            aox.a().a("/program/fragment/main");
            this.e.c(this.t.get(1));
            this.f.a(1, false, true);
            Log.i("MainLayout", "setView: ======== TAB_READING");
            setTabTextColor(this.t.get(1));
        } else if (b == 6) {
            aox.a().a("/netradio/fragment/main");
            this.e.c(this.t.get(2));
            this.f.a(2, false, true);
            setTabTextColor(this.t.get(2));
            Log.i("MainLayout", "setView: ======== TAB_RADIO");
        } else {
            aox.a().a("/music/fragment/main");
            this.e.c(this.t.get(0));
            this.f.a(0, false, true);
            setTabTextColor(this.t.get(0));
            Log.i("MainLayout", "setView: ======== TAB_MUSIC");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VuiConstants.PROPS_FEEDBACK, true);
            this.i.setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
    }

    private yb.f a(String str, int i) {
        yb.f a = this.e.a();
        a.a(aho.d.m_tab_item);
        XTextView xTextView = (XTextView) a.a().findViewById(aho.c.x_tab_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i > 0) {
            spannableStringBuilder.append((CharSequence) ("  " + str));
            spannableStringBuilder.setSpan(new ImageSpan(getContext(), aho.b.ic_music_logo_himalayas), 0, 1, 33);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        xTextView.setText(spannableStringBuilder);
        xTextView.enableViewVuiMode(true);
        return a;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.e.a(new yb.c() { // from class: com.xiaopeng.musicradio.main.view.MainLayout.2
            @Override // defpackage.yb.b
            public void b(yb.f fVar) {
            }

            @Override // defpackage.yb.b
            public void c(yb.f fVar) {
            }

            @Override // defpackage.yb.b
            public void a(yb.f fVar) {
                MainLayout.this.setTabTextColor(fVar);
                int c = fVar.c();
                aox.a().a(((aeo.a) MainLayout.this.p.get(c)).a(), true);
                MainLayout.this.f.a(c, false, false);
                if (MainLayout.this.q != c) {
                    VuiEngine.getInstance(MainLayout.this.getContext()).updateScene(MainLayout.this.getSceneId(), MainLayout.this.e);
                    MainLayout.this.q = c;
                }
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.main.view.MainLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MainPresenter) MainLayout.this.b).d();
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.main.view.MainLayout.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecute(aho.c.bt_top_layout)) {
                    ((MainPresenter) MainLayout.this.b).a(MainLayout.this.getContext());
                }
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.main.view.MainLayout.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((bas) c.a().b(bas.class)).startUsbMain();
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.main.view.MainLayout.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MainPresenter) MainLayout.this.b).a((View) MainLayout.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTabTextColor(yb.f fVar) {
        TextView textView;
        this.u = fVar;
        for (int i = 0; i < this.t.size(); i++) {
            yb.f fVar2 = this.t.get(i);
            View a = fVar2.a();
            if (a != null && (textView = (TextView) a.findViewById(aho.c.x_tab_text)) != null) {
                if (fVar2.c() == fVar.c()) {
                    textView.setTextColor(getContext().getColor(aho.a.x_theme_text_01));
                } else {
                    textView.setTextColor(getContext().getColor(aho.a.x_theme_text_03));
                }
            }
        }
    }

    @Override // com.xiaopeng.musicradio.main.view.a
    public void a(boolean z, int i) {
        LogUtils.d("MainLayout", "updatePlayingState isPlaying:" + z + ", audioType:" + i);
        if (i != 0) {
            if (i == 2) {
                this.m.setVisibility(8);
                this.o = z;
                if (z) {
                    this.m.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        this.n.setVisibility(8);
        if (ad.b(apk.i().x())) {
            this.s = z;
            MusicInfo u = apk.i().u();
            if (u != null) {
                this.s = u.getHash().startsWith(ListSignBean.LOCAL_USB_PREFIX) & this.s;
            } else {
                this.s = false;
            }
            if (this.s) {
                this.n.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.m.setImageTintList(getResources().getColorStateList(aho.a.bt_text_selector));
        this.n.setImageTintList(getResources().getColorStateList(aho.a.bt_text_selector));
        yb.f fVar = this.u;
        if (fVar != null) {
            setTabTextColor(fVar);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return aho.d.layout_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public List<View> getBuildViewList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.e);
        arrayList.add(this.h);
        arrayList.add(this.i);
        arrayList.add(this.j);
        arrayList.add(this.k);
        return arrayList;
    }

    public void a(Uri uri) {
        Integer num;
        if (uri == null) {
            return;
        }
        String queryParameter = uri.getQueryParameter("tab");
        String queryParameter2 = uri.getQueryParameter("position");
        String queryParameter3 = uri.getQueryParameter("element");
        Log.i("MainLayout", "selectTab: " + queryParameter + " pos = " + queryParameter2 + " element = " + queryParameter3);
        if (TextUtils.isEmpty(queryParameter) || (num = d.get(queryParameter)) == null) {
            return;
        }
        agh.b bVar = new agh.b(num.intValue(), queryParameter2, queryParameter3);
        aox.a().a(bVar);
        this.e.c(this.t.get(num.intValue()));
        u.e(bVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        Log.i("MainLayout", "onResume: visible = " + getVisibility() + " width = " + getWidth() + " height = " + getHeight());
    }
}
