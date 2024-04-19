package com.xiaopeng.musicradio.usb.dir.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.dir.present.SongItemPresenter;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.AVLoadingIndicatorView;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SongItemLayout extends BaseFrameLayout<d, SongItemPresenter> implements d {
    private Context c;
    private XTextView d;
    private XImageView e;
    private MusicCircleImageView f;
    private XTextView g;
    private XTextView h;
    private XConstraintLayout i;
    private AVLoadingIndicatorView j;
    private XLoading k;
    private XView l;
    private XView m;
    private XView n;
    private MusicInfo o;
    private List<MusicInfo> p;
    private bay q;
    private acv r;
    private int s;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    public SongItemLayout(Context context) {
        super(context);
        this.c = context;
    }

    public SongItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        this.r = acv.a(context, attributeSet);
    }

    public SongItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
        this.r = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: h */
    public SongItemPresenter a() {
        return new SongItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return a.c.usb_song_detail_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (XTextView) findViewById(a.b.tv_index);
        this.e = (XImageView) findViewById(a.b.tv_index_bg);
        this.f = (MusicCircleImageView) findViewById(a.b.ms_logo);
        this.g = (XTextView) findViewById(a.b.ms_song);
        this.h = (XTextView) findViewById(a.b.ms_singer);
        this.i = (XConstraintLayout) findViewById(a.b.root_layout);
        this.j = (AVLoadingIndicatorView) findViewById(a.b.iv_play_list_state);
        this.k = (XLoading) findViewById(a.b.lottie_loading);
        this.l = (XView) findViewById(a.b.view_album_mask);
        this.n = (XView) findViewById(a.b.iv_selected_view);
        this.m = (XView) findViewById(a.b.view_item_vui);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.usb.dir.view.SongItemLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                List<MusicInfo> list = SongItemLayout.this.p;
                if (list.size() > 0) {
                    String json = ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_DIR_PREFIX + SongItemLayout.this.q.c()).toJson();
                    if (TextUtils.equals(json, apk.i().x())) {
                        bcd.a().d(list, json, list.indexOf(SongItemLayout.this.o), SongItemLayout.this.o);
                    } else {
                        bcd.a().d(list, json, list.indexOf(SongItemLayout.this.o), null);
                    }
                    if (SongItemLayout.this.s == 2) {
                        bcc.p();
                    }
                }
            }
        });
    }

    public void a(MusicInfo musicInfo, int i, List<MusicInfo> list, bay bayVar, int i2, String str) {
        this.s = i2;
        if (musicInfo != null) {
            this.p = list;
            this.o = musicInfo;
            bbm.a().d((bbm) this.o);
            this.q = bayVar;
            y.b(this.f.getContext(), musicInfo.getLogo(), a.C0175a.pic_covers_music_list_220, this.f);
            XTextView xTextView = this.d;
            StringBuilder sb = new StringBuilder();
            int i3 = i + 1;
            sb.append(i3);
            sb.append("");
            xTextView.setText(sb.toString());
            this.g.setText(musicInfo.getSong());
            this.h.setText(musicInfo.getSinger());
            if (TextUtils.isEmpty(musicInfo.getSinger())) {
                this.h.setVisibility(8);
            } else {
                this.h.setVisibility(0);
                this.h.setText(musicInfo.getSinger());
            }
            this.i.setVuiPosition(i);
            XConstraintLayout xConstraintLayout = this.i;
            xConstraintLayout.setVuiElementId(this.i.getId() + "_" + i);
            XConstraintLayout xConstraintLayout2 = this.i;
            xConstraintLayout2.setTag(this.i.getId() + "_" + i);
            this.m.setVuiPosition(i);
            XView xView = this.m;
            xView.setVuiElementId(this.m.getId() + "_" + i);
            XView xView2 = this.m;
            xView2.setTag(this.m.getId() + "_" + i);
            XConstraintLayout xConstraintLayout3 = this.i;
            xConstraintLayout3.setVuiLabel(String.format(xConstraintLayout3.getContext().getString(a.d.vui_play_position), musicInfo.getSong(), Integer.valueOf(i3), Integer.valueOf(i3)));
            this.i.setVuiLayoutLoadable(true);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("defaultExecElementId", this.m.getId() + "_" + i);
                this.i.setVuiProps(jSONObject);
            } catch (Exception unused) {
            }
            VuiEngine.getInstance(this.i.getContext()).setExecuteVirtualTag(this.i);
            VuiEngine.getInstance(this.c).updateScene(str, this);
        }
    }

    private void i() {
        boolean z;
        arf arfVar = (arf) com.xiaopeng.musicradio.service.c.a().b(arf.class);
        arh playingInfo = arfVar.getPlayingInfo();
        int c = aei.a().c();
        String listSign = arfVar.getListSign();
        boolean z2 = false;
        if (c == 0) {
            z = (TextUtils.isEmpty(listSign) || playingInfo == null || !TextUtils.equals(playingInfo.a(), this.o.getHash())) ? false : true;
        } else {
            z = false;
        }
        if (z) {
            int playState = aei.a().c(aei.a().c()).getPlayState();
            switch (playState) {
                case 1:
                case 3:
                    a(playState, this.o);
                    setMsNumState(true);
                    break;
                case 2:
                    a(playState, this.o);
                    setMsNumState(true);
                    z2 = true;
                    break;
                default:
                    a(0, this.o);
                    setMsNumState(false);
                    break;
            }
        } else {
            a(0, this.o);
            setMsNumState(false);
        }
        com.xiaopeng.musicradio.vui.c.a(this.m.getContext(), this.m, z2);
    }

    private void setMsNumState(boolean z) {
        this.e.setVisibility(h.a().b() ? 0 : 8);
        this.d.setSelected(false);
        this.e.setSelected(false);
        if (z) {
            this.e.setSelected(true);
            if (h.a().b()) {
                this.d.setSelected(true);
            }
        }
    }

    protected void a(int i, MusicInfo musicInfo) {
        switch (i) {
            case 1:
                this.j.b();
                this.k.setVisibility(0);
                this.l.setVisibility(0);
                this.n.setSelected(true);
                return;
            case 2:
                this.j.a();
                this.k.setVisibility(8);
                this.l.setVisibility(0);
                this.n.setSelected(true);
                return;
            case 3:
                this.j.setVisibility(0);
                this.j.e();
                this.k.setVisibility(8);
                this.l.setVisibility(0);
                this.n.setSelected(true);
                return;
            default:
                this.j.b();
                this.k.setVisibility(8);
                this.l.setVisibility(8);
                this.n.setSelected(false);
                return;
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        MusicInfo musicInfo = this.o;
        if (musicInfo == null || TextUtils.isEmpty(musicInfo.getLogo())) {
            return;
        }
        y.b(this.f.getContext(), this.o.getLogo(), a.C0175a.pic_covers_music_list_220, this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r.a(this, configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.b(this);
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.d
    public void e() {
        i();
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.d
    public void f() {
        i();
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.d
    public void g() {
        y.b(this.f.getContext(), this.o.getLogo(), a.C0175a.pic_covers_music_list_220, this.f);
    }
}
