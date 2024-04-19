package com.xiaopeng.musicradio.mine.collect.album.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.album.presenter.CollectedAlbumPresenter;
import com.xiaopeng.musicradio.utils.ak;
import defpackage.aht;
@Route(path = "/mine/activity/collect/album")
/* loaded from: classes.dex */
public class CollectAlbumActivity extends com.xiaopeng.musicradio.mine.common.view.a<aje, c, CollectedAlbumPresenter> implements c {
    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MineCollectAlbum";
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        aml.f(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public CollectedAlbumPresenter e() {
        return new CollectedAlbumPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected com.xiaopeng.musicradio.datalist.c r() {
        return new ahw(this, 20, this, true) { // from class: com.xiaopeng.musicradio.mine.collect.album.view.CollectAlbumActivity.1
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
        setTitle(aht.e.title_collected_album);
        ((aje) this.f).e.a(aht.b.ic_32_setting, aht.e.management, true);
        Resources resources = getResources();
        ((aje) this.f).d.addItemDecoration(new ais(((aje) this.f).d.getSpanCount(), resources.getDimensionPixelSize(aht.a.mine_album_view_item_width), resources.getDimensionPixelSize(aht.a.mine_album_view_item_margin_top)));
        new b.a(this).a(this.j).a((DataListPresenter) this.b).a(((aje) this.f).d).a(true).a(this).a();
        amo.a((RecyclerView) ((aje) this.f).d, 40);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.j.a((c.b) new c.b<ViewDataBinding, MusicRadioItem>() { // from class: com.xiaopeng.musicradio.mine.collect.album.view.CollectAlbumActivity.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicRadioItem musicRadioItem, int i) {
                LogUtils.i("CollectAlbumActivity", "onItemClicked:" + i + ListSignBean.COLLECTID_SUFFIX + CollectAlbumActivity.this.j.p());
                if (view.getId() == aht.c.btn_delete || CollectAlbumActivity.this.j.p() != 0) {
                    CollectAlbumActivity.this.a(musicRadioItem);
                } else {
                    aml.a(view, musicRadioItem, "collect");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MusicRadioItem musicRadioItem) {
        final LiveData<Boolean> a = aml.a(musicRadioItem, false);
        a.a(new o<Boolean>() { // from class: com.xiaopeng.musicradio.mine.collect.album.view.CollectAlbumActivity.3
            @Override // androidx.lifecycle.o
            public void a(Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    a.b((o) this);
                    CollectAlbumActivity.this.j.d(musicRadioItem);
                    CollectAlbumActivity.this.w();
                    return;
                }
                Context applicationContext = CollectAlbumActivity.this.getApplicationContext();
                ak.a(applicationContext, applicationContext.getString(aht.e.delete_album_fail_template, musicRadioItem.getTitle()));
            }
        });
    }
}
