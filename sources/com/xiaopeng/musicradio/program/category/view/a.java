package com.xiaopeng.musicradio.program.category.view;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.category.presenter.CategoryListPresenter;
import com.xiaopeng.musicradio.utils.ap;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.aep;
import java.util.List;
/* compiled from: CategoryListFragment.java */
@Route(path = "/program/fragment/sub/category")
/* loaded from: classes2.dex */
public class a extends com.xiaopeng.musicradio.program.common.view.a<c, CategoryListPresenter> implements awf, c {
    protected awo d;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SubProgramCategoryList";
    }

    @Override // com.xiaopeng.musicradio.widget.d, com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.d.a(new aep.c() { // from class: com.xiaopeng.musicradio.program.category.view.a.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                RdAlbumBean g;
                if (!ShakeUtil.canExecute(b.e.item_reading_category_album) || (g = a.this.d.g(i2)) == null) {
                    return;
                }
                if (i != 0) {
                    if (i == 1) {
                        ((CategoryListPresenter) a.this.b).b(g);
                        axt.d(g.getCategoryName());
                        return;
                    }
                    return;
                }
                g.setFromSource("classification");
                sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(g))).navigation();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public CategoryListPresenter ao_() {
        if (getArguments() != null) {
            return new CategoryListPresenter(ap.b(getArguments().getString("category_id", "0")));
        }
        return new CategoryListPresenter(0L);
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a
    protected void r() {
        ((CategoryListPresenter) this.b).d();
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a
    protected awe s() {
        return this.d;
    }

    @Override // com.xiaopeng.musicradio.program.common.view.a, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.d = new awo(getContext(), b.e.item_rank_album, this, 1);
        this.e.setAdapter(this.d);
        this.e.setOnTipsViewClick(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.category.view.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((CategoryListPresenter) a.this.b).c();
            }
        });
        this.g.a(new GridLayoutManager.c() { // from class: com.xiaopeng.musicradio.program.category.view.a.3
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (a.this.d.f(i)) {
                    return a.this.g.c();
                }
                return 1;
            }
        });
        this.e.setLayoutManager(this.g);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.c
    public void a(List<RdAlbumBean> list, int i, boolean z) {
        if (i == 1) {
            this.d.a(list);
        } else {
            this.d.a((List) list, i);
        }
    }

    @Override // defpackage.awf
    public boolean a(long j) {
        return ((CategoryListPresenter) this.b).b(j);
    }
}
