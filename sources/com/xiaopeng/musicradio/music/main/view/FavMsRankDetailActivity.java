package com.xiaopeng.musicradio.music.main.view;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.rank.rank.view.MsRankDetailActivity;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.xui.widget.XTextView;
@Route(path = "/music/activity/fav_rank_detail")
/* loaded from: classes.dex */
public class FavMsRankDetailActivity extends MsRankDetailActivity {
    private XTextView u;

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        super.g();
        this.u = (XTextView) findViewById(b.d.description);
    }

    @Override // com.xiaopeng.musicradio.music.rank.rank.view.MsRankDetailActivity, com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        XTextView xTextView = this.u;
        xTextView.setText(getString(b.f.update_txt) + bg.h(System.currentTimeMillis()));
    }
}
