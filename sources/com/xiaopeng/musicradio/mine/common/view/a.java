package com.xiaopeng.musicradio.mine.common.view;

import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.base.c;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.h;
import com.xiaopeng.musicradio.datalist.i;
import com.xiaopeng.musicradio.datalist.k;
import com.xiaopeng.musicradio.datalist.l;
import com.xiaopeng.musicradio.datalist.o;
import com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.musicradio.mine.widget.d;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import defpackage.aep;
import defpackage.aht;
import java.util.List;
/* compiled from: DataListActivity.java */
/* loaded from: classes.dex */
public abstract class a<VDB extends ViewDataBinding, UIInterface, Presenter extends DataListPresenter<UIInterface>> extends c<VDB, UIInterface, Presenter> implements aep.b, h, i, l, b {
    protected d h;
    protected MineTitleBarLayout i;
    protected com.xiaopeng.musicradio.datalist.c j;
    protected boolean k;
    protected com.xiaopeng.musicradio.datalist.b l;
    protected boolean m;

    protected boolean A() {
        return false;
    }

    protected abstract com.xiaopeng.musicradio.datalist.c r();

    protected String u() {
        return getString(aht.e.empty_no_template, new Object[]{getTitle()});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.b instanceof k) {
            this.h.a(u());
        }
        afd.a(m());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        com.xiaopeng.musicradio.datalist.c cVar = this.j;
        if (cVar != null) {
            cVar.j();
        }
        super.onDestroy();
    }

    @Override // com.xiaopeng.musicradio.datalist.i
    public void h_() {
        com.xiaopeng.musicradio.datalist.c cVar = this.j;
        if (cVar == null || cVar.a() <= 0) {
            this.h.b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        afd.b(m());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity
    public void onStart() {
        super.onStart();
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        this.k = false;
        super.onStop();
    }

    @Override // android.app.Activity
    public void setTitle(int i) {
        super.setTitle(i);
        MineTitleBarLayout mineTitleBarLayout = this.i;
        if (mineTitleBarLayout != null) {
            mineTitleBarLayout.setTitle(i);
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        MineTitleBarLayout mineTitleBarLayout = this.i;
        if (mineTitleBarLayout != null) {
            mineTitleBarLayout.setTitle(charSequence);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.h = new d((ViewGroup) this.f.f());
        this.i = (MineTitleBarLayout) findViewById(aht.c.title_bar);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        if (this.j == null) {
            this.j = r();
            if (this.h.b != null) {
                this.h.b.setAdapter(this.j);
                this.h.b.addItemDecoration(new air(getResources().getDimensionPixelSize(aht.a.mine_data_list_item_margin_bottom)));
                v();
            }
        }
    }

    protected void v() {
        if (TextUtils.isEmpty(m())) {
            return;
        }
        amk.a((BaseRecycleView) this.h.b, m(), true, true, "activity_list");
        this.h.b.enableVuiInvisibleFeature(1);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.i.setOnModeChangedListener(new MineTitleBarLayout.a() { // from class: com.xiaopeng.musicradio.mine.common.view.a.1
            @Override // com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout.a
            public void a(int i) {
                a.this.b(i);
            }
        });
        this.h.a(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.common.view.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.h.a() == 2) {
                    LogUtils.i(getClass().getSimpleName(), "getDataList()");
                    a.this.h.b(1);
                    ((DataListPresenter) a.this.b).h();
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        this.m = true;
        if (list != null) {
            String simpleName = getClass().getSimpleName();
            LogUtils.i(simpleName, "onDataListLoaded:" + list.size());
            this.j.a(((DataListPresenter) this.b).a(list));
        }
        w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
        if (this.j.a() > 0) {
            this.h.b(0);
            x();
            if (A()) {
                return;
            }
            Object i = this.j.i(0);
            if (i instanceof o) {
                i = ((o) i).b();
            }
            this.h.a(0, i);
            if (this.h.c != null) {
                amk.a(m(), this.h.c);
            }
        } else if (this.j.k()) {
        } else {
            y();
            z();
        }
    }

    public void x() {
        MineTitleBarLayout mineTitleBarLayout = this.i;
        if (mineTitleBarLayout == null || mineTitleBarLayout.getMode() == 1) {
            return;
        }
        this.i.a();
    }

    public void y() {
        this.i.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z() {
        this.h.b(3);
        MineTitleBarLayout mineTitleBarLayout = this.i;
        if (mineTitleBarLayout != null && mineTitleBarLayout.getMode() != 0) {
            this.i.a(0, false);
        }
        if (A()) {
            return;
        }
        this.h.a(8, null);
    }

    @Override // com.xiaopeng.musicradio.datalist.l
    public void a(int i) {
        this.h.b(i);
    }

    public void a(boolean z, c.a aVar) {
        this.j.a(z, aVar);
    }

    @Override // com.xiaopeng.musicradio.datalist.m
    public boolean i_() {
        return this.k;
    }

    public void b(int i) {
        this.j.h(i);
        boolean z = true;
        if (i == 2) {
            this.i.d();
            this.i.setTitle(getString(aht.e.title_music_select_template, new Object[]{0}));
            z = false;
        } else {
            this.i.setTitle(getTitle());
        }
        if (this.h.c != null) {
            this.h.c.setEnabled(z);
        }
    }

    public void j_() {
        RecyclerView.a adapter = this.h.b.getAdapter();
        if (adapter != null) {
            adapter.d();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (amk.a(view, bioVar)) {
            return;
        }
        super.onVuiEvent(view, bioVar);
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public void setDataHolder(com.xiaopeng.musicradio.datalist.b bVar) {
        this.l = bVar;
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public com.xiaopeng.musicradio.datalist.b getDataHolder() {
        return this.l;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (acs.b(configuration) && (this.b instanceof DataBasePresenter)) {
            j_();
            ((DataBasePresenter) this.b).w();
        }
    }

    @Override // defpackage.aep.b
    public void a() {
        if (this.m) {
            w();
        }
        if (this.j.a() > 0) {
            this.j.d();
        }
    }
}
