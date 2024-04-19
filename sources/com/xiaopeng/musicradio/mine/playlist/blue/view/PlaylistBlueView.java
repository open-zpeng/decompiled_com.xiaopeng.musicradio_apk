package com.xiaopeng.musicradio.mine.playlist.blue.view;

import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.base.BindingFrameLayout;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.playlist.blue.presenter.PlaylistBluePresenter;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.y;
import defpackage.aht;
import java.util.List;
/* loaded from: classes.dex */
public class PlaylistBlueView extends BindingFrameLayout<akk, a, PlaylistBluePresenter> implements bic, a {
    private List<MusicInfo> d;

    @Override // com.xiaopeng.musicradio.mine.playlist.blue.view.a
    public void a(c.a aVar) {
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
    }

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public PlaylistBluePresenter a() {
        return new PlaylistBluePresenter(3, "FROM_MAIN");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BindingFrameLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void c() {
        super.c();
        ((akk) this.c).c.setClipToOutline(true);
        ((akk) this.c).c.setVisibility(8);
        amk.a(((akk) this.c).h, getContext().getString(aht.e.playlist_blue_match_title), "title_playlist_blue");
        amk.b((View) ((akk) this.c).h, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BindingFrameLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        ((akk) this.c).h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.playlist.blue.view.PlaylistBlueView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ajd.b();
                sp.a().a("/mine/activity/playlist/blue").navigation();
            }
        });
        ((akk) this.c).d.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.playlist.blue.view.PlaylistBlueView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ajd.c();
                ((PlaylistBluePresenter) PlaylistBlueView.this.b).y();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return aht.d.playlist_blue_view;
    }

    @Override // com.xiaopeng.musicradio.datalist.m
    public boolean i_() {
        return ale.a().c();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        if (list.isEmpty()) {
            ((akk) this.c).c.setVisibility(8);
        } else {
            a(list, 0, ((akk) this.c).e);
            a(list, 1, ((akk) this.c).f);
            a(list, 2, ((akk) this.c).g);
            a(aml.c(), (c.a) null);
            ((akk) this.c).c.setVisibility(0);
        }
        this.d = list;
    }

    private void a(List<MusicInfo> list, int i, ImageView imageView) {
        MusicInfo musicInfo = i < list.size() ? list.get(i) : null;
        if (i > 0 && musicInfo == null) {
            imageView.setImageResource(aht.b.pic_covers_music_220);
        } else if (musicInfo != null) {
            y.a(musicInfo.getLogo(), aht.b.pic_covers_music_220, imageView);
        }
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        if (this.c == 0) {
            return;
        }
        String e = aml.e();
        int i = -1;
        if (e != null && e.equals(ad.b(20))) {
            i = aml.b();
        }
        amk.a(((akk) this.c).d, ((akk) this.c).d.a(i), "blue_ms_play_all");
        amk.a("MainMinePlaylist", ((akk) this.c).d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!acs.b(configuration) || this.d == null || this.c == 0 || this.d.isEmpty()) {
            return;
        }
        a(this.d, 0, ((akk) this.c).e);
        a(this.d, 1, ((akk) this.c).f);
        a(this.d, 2, ((akk) this.c).g);
    }
}
