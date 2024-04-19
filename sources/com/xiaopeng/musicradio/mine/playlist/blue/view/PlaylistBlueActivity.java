package com.xiaopeng.musicradio.mine.playlist.blue.view;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.playlist.blue.presenter.PlaylistBluePresenter;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.aht;
import java.util.ArrayList;
import java.util.List;
@Route(path = "/mine/activity/playlist/blue")
/* loaded from: classes.dex */
public class PlaylistBlueActivity extends com.xiaopeng.musicradio.mine.common.view.a<ajo, a, PlaylistBluePresenter> implements a {
    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MinePlaylistBlue";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public PlaylistBluePresenter e() {
        return new PlaylistBluePresenter(1000, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected c r() {
        return new all(this, 8, this) { // from class: com.xiaopeng.musicradio.mine.playlist.blue.view.PlaylistBlueActivity.1
            @Override // defpackage.aep
            protected int f() {
                return 10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aht.d.activity_playlist_blue;
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        setTitle(aht.e.title_playlist_blue);
        ((ajo) this.f).h.a(aht.b.ic_32_setting, aht.e.management, true);
        ((ajo) this.f).g.addItemDecoration(new aiu(getResources().getDimensionPixelSize(aht.a.mine_music_view_item_margin_top)));
        ((ajo) this.f).e.setTvSourceVisibility(8);
        new b.a(this).a(this.j).a((DataListPresenter) this.b).a(((ajo) this.f).g).a(this).a();
        ((ajo) this.f).f.setVuiElementType(bih.UNKNOWN);
        amk.d(((ajo) this.f).i, true);
        amo.a((RecyclerView) ((ajo) this.f).g, 20);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.j.a((c.b) new c.b<ViewDataBinding, MusicInfo>() { // from class: com.xiaopeng.musicradio.mine.playlist.blue.view.PlaylistBlueActivity.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicInfo musicInfo, int i) {
                LogUtils.i("PlaylistBlueActivity", "onItemClicked:" + i + ListSignBean.COLLECTID_SUFFIX + PlaylistBlueActivity.this.j.p());
                if (PlaylistBlueActivity.this.j.p() != 0) {
                    List t = PlaylistBlueActivity.this.j.t();
                    ((ajo) PlaylistBlueActivity.this.f).h.setTitle(PlaylistBlueActivity.this.getString(aht.e.title_music_select_template, new Object[]{Integer.valueOf(t.size())}));
                    if (t.isEmpty()) {
                        PlaylistBlueActivity.this.a(false);
                        return;
                    } else {
                        PlaylistBlueActivity.this.a(true);
                        return;
                    }
                }
                aml.a(view, alo.a().b(), musicInfo, aml.a((Integer) 20));
            }
        });
        ((ajo) this.f).h.setOnModeChangedListener(new MineTitleBarLayout.a() { // from class: com.xiaopeng.musicradio.mine.playlist.blue.view.PlaylistBlueActivity.3
            @Override // com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout.a
            public void a(int i) {
                if (i == 1) {
                    PlaylistBlueActivity.this.b(2);
                    PlaylistBlueActivity.this.s();
                } else {
                    PlaylistBlueActivity.this.b(i);
                    PlaylistBlueActivity.this.t();
                }
                amk.a(PlaylistBlueActivity.this.m(), ((ajo) PlaylistBlueActivity.this.f).f);
            }
        });
        ((ajo) this.f).i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.playlist.blue.view.PlaylistBlueActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PlaylistBlueActivity.this.B();
            }
        });
        ((ajo) this.f).e.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.playlist.blue.view.PlaylistBlueActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                amk.a(view, alo.a().b(), aml.a((Integer) 20));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.h.c.a(aml.a(20, this.h.c.getPlayAllText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        ((ajo) this.f).f.setVisibility(0);
        ((ajo) this.f).i.setVisibility(0);
        ((ajo) this.f).c.setVisibility(0);
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        ((ajo) this.f).f.setVisibility(8);
        ((ajo) this.f).i.setVisibility(8);
        ((ajo) this.f).c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        ((ajo) this.f).i.setEnabled(z);
        ((ajo) this.f).c.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.j.s() || this.d.a()) {
            return;
        }
        amd.a(this, this.d, amd.a(this, this.j.t()), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.playlist.blue.view.PlaylistBlueActivity.6
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog, int i) {
                PlaylistBlueActivity.this.C();
            }
        }, "MineBlueDeleteDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        List t = this.j.t();
        LogUtils.i("PlaylistBlueActivity", "delete:" + t.size());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(t);
        aml.c(arrayList);
        this.j.b(t);
        ((ajo) this.f).h.setMode(0);
        w();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        super.a(z, aVar);
        this.h.c.a(aml.a(20, this.h.c.getPlayAllText()));
    }

    @Override // com.xiaopeng.musicradio.mine.playlist.blue.view.a
    public void a(c.a aVar) {
        this.j.a(aVar);
    }
}
