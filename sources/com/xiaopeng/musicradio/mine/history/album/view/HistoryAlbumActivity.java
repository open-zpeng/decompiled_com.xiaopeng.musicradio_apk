package com.xiaopeng.musicradio.mine.history.album.view;

import android.content.res.Resources;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.history.album.presenter.HistoryAlbumPresenter;
import defpackage.aht;
@Route(path = "/mine/activity/history/album")
/* loaded from: classes.dex */
public class HistoryAlbumActivity extends com.xiaopeng.musicradio.mine.common.view.a<aje, c, HistoryAlbumPresenter> implements c {
    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MineHistoryAlbum";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public HistoryAlbumPresenter e() {
        return new HistoryAlbumPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected com.xiaopeng.musicradio.datalist.c r() {
        return new ako(this, 20, this, true) { // from class: com.xiaopeng.musicradio.mine.history.album.view.HistoryAlbumActivity.1
            @Override // defpackage.aep
            protected int f() {
                return 28;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aht.d.activity_album_list;
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        setTitle(aht.e.title_history_album);
        ((aje) this.f).e.a(aht.b.ic_32_setting, aht.e.management, true);
        Resources resources = getResources();
        ((aje) this.f).d.addItemDecoration(new ais(((aje) this.f).d.getSpanCount(), resources.getDimensionPixelSize(aht.a.mine_album_view_item_width), resources.getDimensionPixelSize(aht.a.mine_album_view_item_margin_top)));
        new b.a(this).a(this.j).a((DataListPresenter) this.b).a(((aje) this.f).d).a(true).a(this).a();
        amo.a((RecyclerView) ((aje) this.f).d, 40);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.j.a((c.b) new c.b<ViewDataBinding, MusicRadioItem>() { // from class: com.xiaopeng.musicradio.mine.history.album.view.HistoryAlbumActivity.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicRadioItem musicRadioItem, int i) {
                LogUtils.i("HistoryAlbumActivity", "onItemClicked:" + i + ListSignBean.COLLECTID_SUFFIX + HistoryAlbumActivity.this.j.p());
                if (view.getId() == aht.c.btn_delete || HistoryAlbumActivity.this.j.p() != 0) {
                    HistoryAlbumActivity.this.a(musicRadioItem);
                } else {
                    aml.a(view, musicRadioItem, "history");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MusicRadioItem musicRadioItem) {
        aml.d(musicRadioItem);
        this.j.d(musicRadioItem);
        w();
    }
}
