package com.xiaopeng.musicradio.music.concentration.recommend.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmTitlePresenter;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MsRmTitleLayout extends BaseFrameLayout<d, MsRmTitlePresenter> implements d {
    private XLinearLayout c;
    private XLinearLayout d;
    private XTextView e;
    private aru f;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.d
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.d
    public void e() {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public MsRmTitleLayout(Context context) {
        super(context);
    }

    public MsRmTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsRmTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsRmTitlePresenter a() {
        return new MsRmTitlePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.e = (XTextView) findViewById(b.d.recommend_music_tips);
        this.c = (XLinearLayout) findViewById(b.d.change);
        this.d = (XLinearLayout) findViewById(b.d.title_layout);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", "" + this.d.getId());
            ((XConstraintLayout) findViewById(b.d.rm_root_layout)).setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
        this.d.setVuiLabel("");
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.d);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        com.xiaopeng.musicradio.vui.c.a(this.c);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmTitleLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecute(view.getId())) {
                    atv.b();
                    Handler handler = MsRmTitleLayout.this.getHandler();
                    if (handler != null) {
                        handler.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmTitleLayout.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((MsRmTitlePresenter) MsRmTitleLayout.this.b).i();
                                MsRmTitleLayout.this.f.s();
                            }
                        }, 50L);
                    }
                }
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmTitleLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atv.d();
                sp.a().a("/music/activity/rm_category").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).navigation();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_rm_title;
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.d
    public void a(ArrayList<MusicRadioItem> arrayList) {
        if (arrayList.size() > 0) {
            this.c.setVisibility(0);
            this.e.setVisibility(0);
            this.f.e(arrayList);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }

    public void setFragment(aru aruVar) {
        this.f = aruVar;
    }
}
