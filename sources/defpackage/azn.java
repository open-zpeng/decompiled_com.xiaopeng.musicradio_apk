package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.PlayControlView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: BaseSearchItemView.java */
/* renamed from: azn  reason: default package */
/* loaded from: classes2.dex */
public abstract class azn extends XRelativeLayout {
    protected XImageView a;
    protected XTextView b;
    protected PlayControlView c;

    protected abstract int getDeafultAlbumLogo();

    protected abstract int getLayoutId();

    public azn(Context context) {
        super(context);
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        this.a = (XImageView) findViewById(a.d.iv_logo);
        this.b = (XTextView) findViewById(a.d.tv_title);
        this.c = (PlayControlView) findViewById(a.d.item_play_status_layout);
    }

    public void setOnPlayControlListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void a(String str, String str2) {
        this.b.setText(str2);
        be.a(getContext(), this.b, bak.c(a.C0165a.x_theme_primary_normal), str2, ayi.a().c());
        y.c(getContext(), str, getDeafultAlbumLogo(), this.a);
    }

    public PlayControlView getPlayControlWidget() {
        return this.c;
    }

    public void a(int i, String str, boolean z) {
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        vuiEngine.setVuiElementTag(this, "program_item_" + i);
        setVuiLabel(String.format(getResources().getString(a.f.vui_play_position), c.a(str), Integer.valueOf(i), Integer.valueOf(i)));
        setVuiPosition(i);
        this.c.setVuiPosition(i);
        PlayControlView playControlView = this.c;
        playControlView.setVuiElementId(this.c.getId() + "_" + i);
        c.a(getContext(), this.c, z);
        this.a.setVuiAction(big.CLICK.a());
        XImageView xImageView = this.a;
        xImageView.setVuiElementId(this.a.getId() + "_" + i);
        this.a.setVuiPosition(i);
        c.a(this, this.a.getId() + "_" + i);
    }

    public void a(int i, int i2, String str) {
        this.c.setPlayState(i);
    }
}
