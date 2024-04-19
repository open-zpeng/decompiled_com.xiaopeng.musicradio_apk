package com.xiaopeng.musicradio.music.main.view;

import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.xui.widget.XTextView;
@Route(path = "/music/activity/fav_music_detail")
/* loaded from: classes.dex */
public class FavMsMusicDetailActivity extends MsMusicDetailActivity {
    private XTextView u;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return b.e.music_activity_music_detail;
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        super.g();
        this.u = (XTextView) findViewById(b.d.description);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void a() {
        super.a();
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("detail_description");
            if (TextUtils.isEmpty(stringExtra)) {
                this.u.setText("");
                return;
            }
            XTextView xTextView = this.u;
            xTextView.setText(getString(b.f.description_txt) + be.d(stringExtra));
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.music.main.view.a
    public void a(int i) {
        super.a(i);
        if (TextUtils.isEmpty(this.u.getText().toString()) || "showCount".equals(this.u.getTag(b.d.tag_type))) {
            this.u.setTag(b.d.tag_type, "showCount");
            this.u.setText(getString(b.f.total_song_txt, new Object[]{Integer.valueOf(i)}));
        }
    }
}
