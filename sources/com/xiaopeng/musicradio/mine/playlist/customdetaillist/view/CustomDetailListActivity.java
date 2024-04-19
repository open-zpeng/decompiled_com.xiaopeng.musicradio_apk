package com.xiaopeng.musicradio.mine.playlist.customdetaillist.view;

import android.content.Intent;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.MusicListPlayReq;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.playlist.customdetaillist.presenter.CustomDetailListPresenter;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.aht;
import java.util.ArrayList;
import java.util.List;
@Route(path = "/mine/activity/playlist/detail")
/* loaded from: classes.dex */
public class CustomDetailListActivity extends com.xiaopeng.musicradio.mine.common.view.a<aji, a, CustomDetailListPresenter> implements a {
    @Autowired(name = "album_id")
    public long g;
    @Autowired(name = "album_logo")
    public String n;
    @Autowired(name = "album_name")
    public String o;
    @Autowired(name = "album_description")
    public String p;
    private String q;
    private int r = 1;
    private int s = 1;

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected boolean A() {
        return true;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MinePlaylistUserDetail";
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    public void x() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        LogUtils.i("CustomDetailListActivity", "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        sp.a().a(this);
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public CustomDetailListPresenter e() {
        return new CustomDetailListPresenter();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected c r() {
        return new aie(this) { // from class: com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.CustomDetailListActivity.1
            @Override // defpackage.aep
            protected int f() {
                return 10;
            }

            @Override // com.xiaopeng.musicradio.datalist.c
            public void b(Object obj) {
                if (t().size() < 50) {
                    super.b(obj);
                    return;
                }
                CustomDetailListActivity customDetailListActivity = CustomDetailListActivity.this;
                ak.a(customDetailListActivity, customDetailListActivity.getString(aht.e.collected_music_max_selected, 50));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aht.d.activity_custom_detail_list;
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        sp.a().a(this);
        s();
        ((aji) this.f).h.a(aht.b.ic_32_setting, aht.e.management, true);
        ((aji) this.f).g.addItemDecoration(new aiu(getResources().getDimensionPixelSize(aht.a.mine_music_view_item_margin_top)));
        ((aji) this.f).f.setVuiElementType(bih.UNKNOWN);
        new b.a(this).a(this.j).a((DataListPresenter) this.b).a(((aji) this.f).g).a(this).a(true).b(true).a().a("CUSTOM_ADDED", (Object) true);
        amk.d(((aji) this.f).i, true);
        amo.a((RecyclerView) ((aji) this.f).g, 20);
        c(0);
    }

    private void s() {
        ((CustomDetailListPresenter) this.b).a(this.g);
        setTitle(this.o);
        this.q = au.b(this.g, this.o).toJson();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.CustomDetailListActivity.2
            @Override // java.lang.Runnable
            public void run() {
                CustomDetailListActivity.this.h.a(0, CustomDetailListActivity.this.n);
            }
        });
    }

    private void c(int i) {
        ((aji) this.f).e.setEnabled(i > 0);
        ((aji) this.f).e.setDescriptionText(getString(aht.e.desc_collected_music, new Object[]{Integer.valueOf(i)}));
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.j.a((c.b) new c.b<ViewDataBinding, MusicInfo>() { // from class: com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.CustomDetailListActivity.3
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicInfo musicInfo, int i) {
                LogUtils.i("CustomDetailListActivity", "onItemClicked:" + i + ListSignBean.COLLECTID_SUFFIX + CustomDetailListActivity.this.j.p());
                if (CustomDetailListActivity.this.j.p() != 0) {
                    List t = CustomDetailListActivity.this.j.t();
                    ((aji) CustomDetailListActivity.this.f).h.setTitle(CustomDetailListActivity.this.getString(aht.e.title_music_select_template, new Object[]{Integer.valueOf(t.size())}));
                    CustomDetailListActivity.this.a(!t.isEmpty());
                    return;
                }
                aml.a(view, new MusicListPlayReq(((CustomDetailListPresenter) CustomDetailListActivity.this.b).g(), musicInfo, CustomDetailListActivity.this.r, 50, CustomDetailListActivity.this.s, CustomDetailListActivity.this.q));
            }
        });
        ((aji) this.f).h.setOnModeChangedListener(new MineTitleBarLayout.a() { // from class: com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.CustomDetailListActivity.4
            @Override // com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout.a
            public void a(int i) {
                if (i == 1) {
                    CustomDetailListActivity.this.b(2);
                    CustomDetailListActivity.this.t();
                } else {
                    CustomDetailListActivity.this.b(i);
                    CustomDetailListActivity.this.B();
                }
                amk.a(CustomDetailListActivity.this.m(), ((aji) CustomDetailListActivity.this.f).f);
            }
        });
        ((aji) this.f).i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.CustomDetailListActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomDetailListActivity.this.C();
            }
        });
        ((aji) this.f).e.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.CustomDetailListActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                List g = ((CustomDetailListPresenter) CustomDetailListActivity.this.b).g();
                if (g.isEmpty()) {
                    return;
                }
                aml.a(new MusicListPlayReq(g, null, CustomDetailListActivity.this.r, 50, CustomDetailListActivity.this.s, CustomDetailListActivity.this.q));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.h.c.a(aml.a(this.q, this.h.c.getPlayAllText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        ((aji) this.f).f.setVisibility(0);
        ((aji) this.f).i.setVisibility(0);
        ((aji) this.f).c.setVisibility(0);
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        ((aji) this.f).f.setVisibility(8);
        ((aji) this.f).i.setVisibility(8);
        ((aji) this.f).c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        ((aji) this.f).i.setEnabled(z);
        ((aji) this.f).c.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.j.s() || l()) {
            return;
        }
        amd.a(this, this.d, amd.a(this, this.j.t()), new XDialogInterface.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.CustomDetailListActivity.7
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog, int i) {
                CustomDetailListActivity.this.D();
            }
        }, "MineUserDeleteDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        List<MusicInfo> t = this.j.t();
        LogUtils.i("CustomDetailListActivity", "delete:" + t.size());
        ArrayList arrayList = new ArrayList();
        for (MusicInfo musicInfo : t) {
            arrayList.add(musicInfo);
        }
        aml.a(arrayList);
        this.j.b(t);
        ((aji) this.f).h.setMode(0);
        w();
        c(((CustomDetailListPresenter) this.b).y());
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        super.a(list, i);
        c(((CustomDetailListPresenter) this.b).y());
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        super.a(z, aVar);
        this.h.c.a(aml.a(this.q, this.h.c.getPlayAllText()));
    }

    @Override // com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.a
    public void a(int i, int i2) {
        this.r = i;
        this.s = i2;
    }

    @Override // com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.a
    public void a(c.a aVar) {
        this.j.a(aVar);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected String u() {
        return getString(aht.e.copyright_restrict_hint);
    }
}
