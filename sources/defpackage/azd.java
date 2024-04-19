package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: NetRadioItemView.java */
/* renamed from: azd  reason: default package */
/* loaded from: classes2.dex */
public class azd extends azn {
    private XTextView d;

    @Override // defpackage.azn
    protected int getLayoutId() {
        return a.e.item_search_netradio_layout;
    }

    @Override // defpackage.azn
    protected int getDeafultAlbumLogo() {
        return a.c.pic_netradio_cover_240;
    }

    public azd(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azn
    public void a() {
        super.a();
        this.d = (XTextView) findViewById(a.d.tv_speech_num);
    }

    public void setPosition(int i) {
        if (h.a().b()) {
            this.d.setVisibility(0);
            this.d.setText(String.valueOf(i));
            return;
        }
        this.d.setVisibility(8);
    }
}
