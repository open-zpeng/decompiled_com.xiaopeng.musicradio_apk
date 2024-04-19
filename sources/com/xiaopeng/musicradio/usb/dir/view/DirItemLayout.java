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
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.usb.dir.present.DirItemPresenter;
import com.xiaopeng.musicradio.utils.v;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.AVLoadingIndicatorView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class DirItemLayout extends BaseFrameLayout<b, DirItemPresenter> implements b {
    private Context c;
    private XImageView d;
    private XTextView e;
    private XConstraintLayout f;
    private bay g;
    private acv h;
    private AVLoadingIndicatorView i;
    private XLoading j;
    private XView k;
    private XImageView l;
    private XTextView m;
    private XImageView n;
    private XView o;

    public DirItemLayout(Context context) {
        super(context);
        this.c = context;
    }

    public DirItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        this.h = acv.a(context, attributeSet);
    }

    public DirItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
        this.h = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public DirItemPresenter a() {
        return new DirItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return a.c.usb_dir_detail_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (XImageView) findViewById(a.b.ms_logo);
        this.e = (XTextView) findViewById(a.b.dir_name);
        this.f = (XConstraintLayout) findViewById(a.b.root_layout);
        this.i = (AVLoadingIndicatorView) findViewById(a.b.iv_play_list_state);
        this.j = (XLoading) findViewById(a.b.lottie_loading);
        this.k = (XView) findViewById(a.b.iv_selected_view);
        this.l = (XImageView) findViewById(a.b.more);
        this.m = (XTextView) findViewById(a.b.tv_index);
        this.n = (XImageView) findViewById(a.b.tv_index_bg);
        this.o = (XView) findViewById(a.b.view_item_vui);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.i.a();
        this.j.setVisibility(8);
        this.k.setSelected(true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.usb.dir.view.DirItemLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DirItemLayout.this.g == null) {
                    return;
                }
                sp.a().a("/usbview/usb_dir_detail").withString("extra_dir_path", DirItemLayout.this.g.c()).navigation();
                bcc.r();
            }
        });
    }

    public void a(bay bayVar, int i, String str) {
        if (bayVar != null) {
            this.g = bayVar;
            this.e.setText(v.b(bayVar.c()));
            XTextView xTextView = this.m;
            StringBuilder sb = new StringBuilder();
            int i2 = i + 1;
            sb.append(i2);
            sb.append("");
            xTextView.setText(sb.toString());
            XConstraintLayout xConstraintLayout = this.f;
            xConstraintLayout.setVuiPosition(i);
            VuiEngine vuiEngine = VuiEngine.getInstance(this.c);
            XConstraintLayout xConstraintLayout2 = this.f;
            vuiEngine.setVuiElementTag(xConstraintLayout2, "usb_dir_item_" + i);
            xConstraintLayout.setVuiLabel(String.format(this.f.getContext().getResources().getString(b.f.vui_play_position), this.g.c(), Integer.valueOf(i2), Integer.valueOf(i2)));
            this.f.setVuiPosition(i);
            XConstraintLayout xConstraintLayout3 = this.f;
            xConstraintLayout3.setVuiElementId(this.f.getId() + "_" + i);
            XConstraintLayout xConstraintLayout4 = this.f;
            xConstraintLayout4.setTag(this.f.getId() + "_" + i);
            this.f.setVuiElementType(bih.BUTTON);
            this.f.setVuiAction(big.CLICK.a());
            this.f.setVuiLayoutLoadable(true);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("defaultExecElementId", this.f.getId() + "_" + i);
                xConstraintLayout.setVuiProps(jSONObject);
            } catch (Exception unused) {
            }
            VuiEngine.getInstance(this.c).updateScene(str, this);
        }
    }

    private void setMsNumState(boolean z) {
        this.n.setVisibility(h.a().b() ? 0 : 8);
        this.m.setVisibility(h.a().b() ? 0 : 8);
        this.m.setSelected(false);
        this.n.setSelected(false);
        if (z) {
            this.n.setSelected(true);
            if (h.a().b()) {
                this.m.setSelected(true);
            }
            this.i.setVisibility(h.a().b() ? 8 : 0);
            return;
        }
        this.i.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h.a(this, configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.b(this);
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.b
    public void f() {
        if (this.g == null) {
            return;
        }
        if (aei.a().c() == 0) {
            if (h()) {
                setStatus(apk.i().getPlayState());
                setMsNumState(true);
                return;
            }
            setStatus(0);
            setMsNumState(false);
            return;
        }
        setStatus(0);
        setMsNumState(false);
    }

    @Override // com.xiaopeng.musicradio.usb.dir.view.b
    public void g() {
        f();
    }

    protected void setStatus(int i) {
        switch (i) {
            case 1:
                this.i.b();
                this.j.setVisibility(0);
                this.k.setSelected(true);
                return;
            case 2:
                this.i.a();
                this.j.setVisibility(8);
                this.k.setSelected(true);
                return;
            case 3:
                this.i.setVisibility(0);
                this.i.e();
                this.j.setVisibility(8);
                this.k.setSelected(true);
                return;
            default:
                this.i.b();
                this.j.setVisibility(8);
                this.k.setSelected(false);
                return;
        }
    }

    public boolean h() {
        ListSignBean listSignBean;
        String x = apk.i().x();
        MusicInfo d = apk.i().d();
        if (d == null || TextUtils.isEmpty(x) || (listSignBean = (ListSignBean) z.a(x, (Class<Object>) ListSignBean.class)) == null || TextUtils.isEmpty(listSignBean.getTag()) || TextUtils.isEmpty(d.getData())) {
            return false;
        }
        String tag = listSignBean.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.USB_DIR_PREFIX);
        sb.append(this.g.c());
        return tag.startsWith(sb.toString()) || d.getData().contains(this.g.c());
    }
}
