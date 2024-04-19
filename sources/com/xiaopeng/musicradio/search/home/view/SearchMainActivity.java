package com.xiaopeng.musicradio.search.home.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.home.presenter.SearchActivityMainPresenter;
import com.xiaopeng.musicradio.search.widget.view.SearchTopBar;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agh;
import defpackage.agp;
import defpackage.ayg;
@Route(path = "/search/activity/main")
/* loaded from: classes2.dex */
public class SearchMainActivity extends com.xiaopeng.musicradio.widget.c<c, SearchActivityMainPresenter> implements c {
    @Autowired(name = "search_voice_type")
    protected int f;
    @Autowired(name = "search_voice_keyword")
    protected String g;
    @Autowired(name = "search_voice_result")
    protected String h;
    @Autowired(name = "search_voice_total_page")
    protected int i;
    @Autowired(name = "voice_list_version")
    protected String j;
    private SearchTopBar m;
    private Runnable n = new Runnable() { // from class: com.xiaopeng.musicradio.search.home.view.SearchMainActivity.1
        @Override // java.lang.Runnable
        public void run() {
            SearchMainActivity.this.m.g();
        }
    };

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public SearchActivityMainPresenter e() {
        return new SearchActivityMainPresenter();
    }

    @Override // com.xiaopeng.musicradio.widget.c, com.xiaopeng.musicradio.commonui.base.a
    protected int f() {
        return a.e.activity_search_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.m = (SearchTopBar) findViewById(a.d.top_bar);
    }

    @Override // com.xiaopeng.musicradio.widget.c, com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ayi.a().b((String) null);
        if ("/search/fragment/home/main".equalsIgnoreCase(this.k)) {
            ((SearchActivityMainPresenter) this.b).a(false);
        } else {
            ((SearchActivityMainPresenter) this.b).a(true);
        }
        ban.b(this.n, 500L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        Runnable runnable = this.n;
        if (runnable != null) {
            ban.b(runnable);
        }
        u.c(new agh.d(false));
        this.m.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        A();
        if (aqi.a().e()) {
            return;
        }
        u.c(new agh.d(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (!((SearchActivityMainPresenter) this.b).d() && !(x() instanceof d)) {
            this.m.setSearchText("");
        } else {
            u();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.m.setCallback(new SearchTopBar.a() { // from class: com.xiaopeng.musicradio.search.home.view.SearchMainActivity.2
            @Override // com.xiaopeng.musicradio.search.widget.view.SearchTopBar.a
            public void a() {
                SearchMainActivity.this.y();
            }

            @Override // com.xiaopeng.musicradio.search.widget.view.SearchTopBar.a
            public void b() {
                SearchMainActivity.this.z();
            }

            @Override // com.xiaopeng.musicradio.search.widget.view.SearchTopBar.a
            public void a(String str) {
                ayi.a().a(str);
                ayi.a().b((String) null);
                u.c(new ayg.b(str, false));
                if (SearchMainActivity.this.x() != null) {
                    if (SearchMainActivity.this.x() instanceof d) {
                        SearchMainActivity.this.a(str);
                        return;
                    } else {
                        u.c(new ayg.a());
                        return;
                    }
                }
                u.c(new ayg.a());
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.c
    protected void r() {
        super.r();
        if (be.a((CharSequence) this.k)) {
            this.k = "/search/fragment/home/main";
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            y();
            return true;
        }
        return true;
    }

    @Override // com.xiaopeng.musicradio.widget.c, com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.h = null;
        ayi.a().b(this.h);
        super.onNewIntent(intent);
        if (!com.xiaopeng.musicradio.utils.a.a().f() || "/search/fragment/home/main".equalsIgnoreCase(this.k)) {
            return;
        }
        ((SearchActivityMainPresenter) this.b).a(true);
    }

    @Override // com.xiaopeng.musicradio.widget.c
    protected void s() {
        if (!TextUtils.isEmpty(this.k) && (this.k.contains("voice_search_type=1") || this.k.contains("voice_search_type=2") || this.k.contains("&voice_list="))) {
            ((SearchActivityMainPresenter) this.b).b(true);
        }
        if (x() != null) {
            if (x() instanceof azu) {
                u.c(new agp.d(this.h, this.f, this.i, this.j != null));
                return;
            } else {
                super.s();
                return;
            }
        }
        super.s();
    }

    @Override // com.xiaopeng.musicradio.search.home.view.c
    public void a() {
        this.m.setSearchText("");
    }

    @Override // com.xiaopeng.musicradio.search.home.view.c
    public void a(String str) {
        if (x() instanceof azu) {
            LogUtils.d("SearchMainActivity", "top fragment is search result fragment, return");
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("keyword", str);
        this.m.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.search.home.view.SearchMainActivity.3
            @Override // java.lang.Runnable
            public void run() {
                SearchMainActivity.this.a("/search/fragment/home/search_result", bundle);
            }
        }, 100L);
    }

    @Override // com.xiaopeng.musicradio.search.home.view.c
    public void b() {
        finish();
    }

    @Override // com.xiaopeng.musicradio.search.home.view.c
    public void a(int i) {
        if (i > 0 && i <= 10) {
            this.m.a(i);
        } else {
            this.m.a(-1);
        }
    }

    @Override // com.xiaopeng.musicradio.search.home.view.c
    public void b(String str) {
        if (str == null || str.equals(this.m.getSearchText())) {
            return;
        }
        this.m.setSearchText(str);
    }

    @Override // com.xiaopeng.musicradio.search.home.view.c
    public boolean ap_() {
        return com.xiaopeng.musicradio.utils.a.a().c() == this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (((SearchActivityMainPresenter) this.b).d()) {
            return;
        }
        if (!(x() instanceof d)) {
            u();
        }
        u.c(new agh.d(true));
    }

    private void A() {
        if (TextUtils.isEmpty(this.h)) {
            return;
        }
        Runnable runnable = this.n;
        if (runnable != null) {
            ban.b(runnable);
        }
        ayi.a().b(this.h);
        if (!TextUtils.isEmpty(this.g)) {
            this.m.setSearchText(this.g);
            ayi.a().a(this.g);
        }
        ayi.a().d(this.f);
        ayi.a().c(this.j);
        ayi.a().c(this.i);
        u.c(new agh.d(true));
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.search.home.view.SearchMainActivity.4
            @Override // java.lang.Runnable
            public void run() {
                u.c(new agp.b());
            }
        }, 1000L);
        this.h = null;
    }
}
