package com.xiaopeng.musicradio.music.main.view;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.daily.view.MsDailyDetailActivity;
import com.xiaopeng.xui.widget.XTextView;
@Route(path = "/music/activity/fav_daily_detail")
/* loaded from: classes.dex */
public class FavMsDailyDetailActivity extends MsDailyDetailActivity {
    private XTextView u;

    @Override // com.xiaopeng.musicradio.music.concentration.daily.view.MsDailyDetailActivity, com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        super.g();
        this.u = (XTextView) findViewById(b.d.description);
    }

    @Override // com.xiaopeng.musicradio.music.concentration.daily.view.MsDailyDetailActivity, com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        this.u.setText(getString(b.f.daily_txt));
    }
}
