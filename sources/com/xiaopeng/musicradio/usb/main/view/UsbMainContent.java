package com.xiaopeng.musicradio.usb.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.main.presenter.UsbMainContentPresenter;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.MusicRecyclerTabLayout;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aeo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class UsbMainContent extends VuiBaseFrameLayout<Object, UsbMainContentPresenter> {
    private MusicRecyclerTabLayout c;
    private NoScrollViewPager d;
    private aeo e;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public boolean e() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public String getSceneId() {
        return "MusicUsbMain";
    }

    public UsbMainContent(Context context) {
        super(context);
    }

    public UsbMainContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UsbMainContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public UsbMainContentPresenter a() {
        return new UsbMainContentPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (MusicRecyclerTabLayout) findViewById(a.b.tab_usb_main);
        this.d = (NoScrollViewPager) findViewById(a.b.usb_viewpager);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.c.setVuiLayoutLoadable(false);
        this.c.initVuiAttr(getSceneId(), VuiEngine.getInstance(getContext()), true, true, true);
        this.c.setVuiLabel(be.a(a.d.vui_left));
        aw.a((Object) this.d, "mOffscreenPageLimit", (Object) 0);
        this.e = new aeo(getActivity().getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new aeo.a("/usb/main/song", be.a(a.d.usb_main_song_title)));
        arrayList.add(new aeo.a("/usb/main/singer", be.a(a.d.usb_main_singer_title)));
        arrayList.add(new aeo.a("/usb/main/album", be.a(a.d.usb_main_album_title)));
        arrayList.add(new aeo.a("/usb/main/dir", be.a(a.d.usb_main_dir_title)));
        this.e.a((List<aeo.a>) arrayList);
        this.d.setAdapter(this.e);
        this.c.setUpWithViewPager(this.d);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return a.c.layout_usb_main_content;
    }

    public void a(int i) {
        this.c.a(i);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public List<View> getBuildViewList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c);
        return arrayList;
    }
}
