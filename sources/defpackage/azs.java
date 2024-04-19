package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: RoundRectItemView.java */
/* renamed from: azs  reason: default package */
/* loaded from: classes2.dex */
public class azs extends azn {
    private XTextView d;
    private XTextView e;
    private XImageView f;

    @Override // defpackage.azn
    protected int getLayoutId() {
        return a.e.item_search_roundrect_layout;
    }

    @Override // defpackage.azn
    protected int getDeafultAlbumLogo() {
        return a.c.pic_covers_music_220;
    }

    public azs(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azn
    public void a() {
        super.a();
        this.d = (XTextView) findViewById(a.d.tv_title);
        this.e = (XTextView) findViewById(a.d.tv_speech_num);
        this.f = (XImageView) findViewById(a.d.top_right_label);
    }

    public void a(int i, boolean z) {
        if (i == 0) {
            this.f.setImageDrawable(null);
        } else if (i == 1) {
            this.f.setImageResource(a.c.ic_xmly_cover_label_vip);
        } else if (i == 2) {
            this.f.setImageResource(a.c.ic_xmly_cover_label_payment);
        } else {
            this.f.setImageDrawable(null);
        }
    }

    public void setItemTitle(String str) {
        this.d.setText(str);
        be.a(getContext(), this.b, bak.c(a.C0165a.x_theme_primary_normal), str, ayi.a().c());
    }

    public void setPosition(int i) {
        if (h.a().b()) {
            this.e.setVisibility(0);
            this.e.setText(String.valueOf(i));
            return;
        }
        this.e.setVisibility(8);
    }
}
