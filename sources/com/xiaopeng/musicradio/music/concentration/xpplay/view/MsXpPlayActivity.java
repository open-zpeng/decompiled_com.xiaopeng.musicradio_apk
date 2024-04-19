package com.xiaopeng.musicradio.music.concentration.xpplay.view;

import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryDetailLayout;
import com.xiaopeng.musicradio.music.concentration.xpplay.presenter.MsXpPlayActPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
@Route(path = "/music/activity/xp_play")
/* loaded from: classes.dex */
public class MsXpPlayActivity extends com.xiaopeng.musicradio.commonui.vui.a<Object, MsXpPlayActPresenter> {
    private DialogTopLayout f;
    private MsRmCategoryDetailLayout g;

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicXpPlay";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public MsXpPlayActPresenter e() {
        return new MsXpPlayActPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return b.e.music_activity_xp_play;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (DialogTopLayout) findViewById(b.d.xp_play_top_title);
        this.g = (MsRmCategoryDetailLayout) findViewById(b.d.xp_play_layout);
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("rm_category_id", 0);
            String stringExtra = getIntent().getStringExtra("rm_category_name");
            this.g.setmType(3);
            this.g.setmId(String.valueOf(intExtra));
            this.g.setmName(stringExtra);
            this.g.g();
        }
        q();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        this.f.a(false);
        this.f.setTitle(be.a(b.f.music_main_selection_xpplay_title));
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.f.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.xpplay.view.MsXpPlayActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsXpPlayActivity.this.finish();
            }
        });
    }

    protected void q() {
        this.g.a(m(), "", bik.LEVEL1);
    }
}
