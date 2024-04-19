package com.xiaopeng.musicradio.mine.history.music.view;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.history.music.presenter.HistoryMusicPresenter;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.aht;
import java.util.ArrayList;
import java.util.List;
@Route(path = "/mine/activity/history/music")
/* loaded from: classes.dex */
public class HistoryMusicActivity extends com.xiaopeng.musicradio.mine.common.view.a<ajk, c, HistoryMusicPresenter> implements c {
    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MineHistoryMusic";
    }

    @Override // com.xiaopeng.musicradio.mine.history.music.view.c
    public void s() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public HistoryMusicPresenter e() {
        return new HistoryMusicPresenter(IInputController.KEYCODE_KNOB_WIND_SPD_UP);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected com.xiaopeng.musicradio.datalist.c r() {
        return new akv(this, 8, this) { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicActivity.1
            @Override // defpackage.aep
            protected int f() {
                return 10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aht.d.activity_music_list;
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        setTitle(aht.e.title_history_music);
        ((ajk) this.f).e.setDescriptionText(getString(aht.e.desc_history_music, new Object[]{Integer.valueOf((int) IInputController.KEYCODE_KNOB_WIND_SPD_UP)}));
        ((ajk) this.f).h.a(aht.b.ic_32_setting, aht.e.management, true);
        ((ajk) this.f).g.addItemDecoration(new aiu(getResources().getDimensionPixelSize(aht.a.mine_music_view_item_margin_top)));
        new b.a(this).a(this.j).a((DataListPresenter) this.b).a(((ajk) this.f).g).a(this).a().a("HISTORY_MUSIC", (Object) true);
        ((ajk) this.f).f.setVuiElementType(bih.UNKNOWN);
        amk.d(((ajk) this.f).i, true);
        amo.a((RecyclerView) ((ajk) this.f).g, 20);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.j.a((c.b) new c.b<ViewDataBinding, MusicInfo>() { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicActivity.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicInfo musicInfo, int i) {
                LogUtils.i("HistoryMusicActivity", "onItemClicked:" + i + ListSignBean.COLLECTID_SUFFIX + HistoryMusicActivity.this.j.p());
                if (HistoryMusicActivity.this.j.p() != 0) {
                    List t = HistoryMusicActivity.this.j.t();
                    ((ajk) HistoryMusicActivity.this.f).h.setTitle(HistoryMusicActivity.this.getString(aht.e.title_music_select_template, new Object[]{Integer.valueOf(t.size())}));
                    if (t.isEmpty()) {
                        HistoryMusicActivity.this.a(false);
                        return;
                    } else {
                        HistoryMusicActivity.this.a(true);
                        return;
                    }
                }
                aml.a(view, akx.a().b(), musicInfo, aml.a((Integer) 10));
            }
        });
        ((ajk) this.f).h.setOnModeChangedListener(new MineTitleBarLayout.a() { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicActivity.3
            @Override // com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout.a
            public void a(int i) {
                if (i == 1) {
                    HistoryMusicActivity.this.b(2);
                    HistoryMusicActivity.this.t();
                } else {
                    HistoryMusicActivity.this.b(i);
                    HistoryMusicActivity.this.B();
                }
                amk.a(HistoryMusicActivity.this.m(), ((ajk) HistoryMusicActivity.this.f).f);
            }
        });
        ((ajk) this.f).i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HistoryMusicActivity.this.C();
            }
        });
        ((ajk) this.f).e.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                amk.a(view, akx.a().b(), aml.a((Integer) 10));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.h.c.a(aml.a(10, this.h.c.getPlayAllText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        ((ajk) this.f).f.setVisibility(0);
        ((ajk) this.f).i.setVisibility(0);
        ((ajk) this.f).c.setVisibility(0);
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        ((ajk) this.f).f.setVisibility(8);
        ((ajk) this.f).i.setVisibility(8);
        ((ajk) this.f).c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        ((ajk) this.f).i.setEnabled(z);
        ((ajk) this.f).c.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.j.s() || this.d.a()) {
            return;
        }
        amd.a(this, this.d, amd.a(this, this.j.t()), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicActivity.6
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog, int i) {
                HistoryMusicActivity.this.D();
            }
        }, "MineHistoryDeleteDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        List t = this.j.t();
        LogUtils.i("HistoryMusicActivity", "delete:" + t.size());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(t);
        aml.b(arrayList);
        this.j.b(t);
        ((ajk) this.f).h.setMode(0);
        w();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        super.a(z, aVar);
        this.h.c.a(aml.a(10, this.h.c.getPlayAllText()));
    }

    @Override // com.xiaopeng.musicradio.mine.history.music.view.c
    public void a(c.a aVar) {
        this.j.a(aVar);
    }
}
