package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.presenter.SearchResultMainPresenter;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.widget.MusicRecyclerTabLayout;
import com.xiaopeng.musicradio.widget.d;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aeo;
import defpackage.agh;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SearchResultMainFragment.java */
@Route(path = "/search/fragment/home/search_result")
/* renamed from: azu  reason: default package */
/* loaded from: classes2.dex */
public class azu extends d<azr, SearchResultMainPresenter> implements azr {
    protected String d;
    protected int e;
    private MusicRecyclerTabLayout f;
    private NoScrollViewPager g;
    private aeo h;
    private boolean i = true;
    private String j;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public boolean n() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SearchResultLocalLeftTab";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return a.e.fragment_search_result_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.f = (MusicRecyclerTabLayout) a(a.d.tab_search_result_main);
        this.g = (NoScrollViewPager) a(a.d.search_result_viewpager);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        if (getArguments() != null) {
            try {
                this.e = Integer.parseInt(a("voice_search_type"));
                LogUtils.i("SearchResultMian", "setView mVoiceSearchType: " + this.e);
            } catch (Exception unused) {
            }
        }
        this.d = a("voice_list");
        this.j = a("voice_list_version");
        Bundle bundle = new Bundle();
        ayi.a().c(this.j);
        if (w.f() == 2) {
            int i = this.e;
            if (i == 1) {
                ayi.a().d(1);
            } else if (i == 2) {
                ayi.a().d(2);
            } else if (i == 3) {
                ayi.a().d(3);
            } else if (i == 5) {
                ayi.a().d(5);
            } else if (i == 6) {
                ayi.a().d(6);
            }
            bundle.putString("voice_list", this.d);
        } else if (be.a((CharSequence) this.j)) {
            int i2 = this.e;
            if (i2 == 2) {
                ayi.a().d(2);
            } else if (i2 == 1) {
                ayi.a().d(1);
            }
            bundle.putString("voice_list", this.d);
        } else {
            ayi.a().d(this.e);
            bundle.putString("voice_list", this.d);
        }
        aw.a((Object) this.g, "mOffscreenPageLimit", (Object) 0);
        this.h = new aeo(getChildFragmentManager());
        ArrayList arrayList = new ArrayList();
        if (w.f() == 2) {
            arrayList.add(new aeo.a("/search/fragment/result/mix", be.a(a.f.tab_search_mix)));
            arrayList.add(new aeo.a("/search/fragment/result/song", be.a(a.f.tab_search_song), bundle));
            arrayList.add(new aeo.a("/search/fragment/result/album", be.a(a.f.tab_search_album), bundle));
            arrayList.add(new aeo.a("/search/fragment/result/song_list", be.a(a.f.tab_search_song_list), bundle));
            arrayList.add(new aeo.a("/search/fragment/result/program", be.a(a.f.tab_search_program), bundle));
            arrayList.add(new aeo.a("/search/fragment/result/netradio", be.a(a.f.tab_search_net_radio), bundle));
        } else {
            arrayList.add(new aeo.a("/search/fragment/result/mix", be.a(a.f.tab_search_mix)));
            arrayList.add(new aeo.a("/search/fragment/result/song", be.a(a.f.tab_search_song), bundle));
            arrayList.add(new aeo.a("/search/fragment/result/album", be.a(a.f.tab_search_album), bundle));
            arrayList.add(new aeo.a("/search/fragment/result/song_list", be.a(a.f.tab_search_song_list), bundle));
            arrayList.add(new aeo.a("/search/fragment/result/program", be.a(a.f.tab_search_program), bundle));
            arrayList.add(new aeo.a("/search/fragment/result/netradio", be.a(a.f.tab_search_net_radio), bundle));
        }
        this.h.a((List<aeo.a>) arrayList);
        this.g.setAdapter(this.h);
        this.f.setUpWithViewPager(this.g);
        this.f.addOnScrollListener(new RecyclerView.m() { // from class: azu.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                super.onScrollStateChanged(recyclerView, i3);
                if (i3 == 0) {
                    u.c(new agh.d(true));
                } else if (i3 == 1) {
                    u.c(new agh.d(false));
                }
            }
        });
        this.f.initVuiAttr(o(), VuiEngine.getInstance(this.a));
    }

    @Override // com.xiaopeng.musicradio.widget.d, com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.i) {
            if (w.f() == 2) {
                int i = this.e;
                if (i == 1) {
                    this.g.setCurrentItem(1);
                    this.f.a(1);
                } else if (i == 2) {
                    this.g.setCurrentItem(2);
                    this.f.a(2);
                } else if (i == 5) {
                    this.g.setCurrentItem(4);
                    this.f.a(4);
                } else if (i == 3) {
                    this.g.setCurrentItem(3);
                    this.f.a(3);
                } else if (i == 6) {
                    this.g.setCurrentItem(5);
                    this.f.a(5);
                }
            } else if (be.a((CharSequence) this.j)) {
                int i2 = this.e;
                if (i2 == 2) {
                    this.g.setCurrentItem(4);
                    this.f.a(4);
                } else if (i2 == 1) {
                    this.g.setCurrentItem(1);
                    this.f.a(1);
                }
            } else {
                int i3 = this.e;
                if (i3 == 1) {
                    this.g.setCurrentItem(1);
                    this.f.a(1);
                } else if (i3 == 2) {
                    this.g.setCurrentItem(2);
                    this.f.a(2);
                } else if (i3 == 5) {
                    this.g.setCurrentItem(4);
                    this.f.a(4);
                } else if (i3 == 3) {
                    this.g.setCurrentItem(3);
                    this.f.a(3);
                } else if (i3 == 6) {
                    this.g.setCurrentItem(5);
                    this.f.a(5);
                }
            }
            this.i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        super.d();
        this.h.a(getChildFragmentManager());
        NoScrollViewPager noScrollViewPager = this.g;
        noScrollViewPager.a(noScrollViewPager.getCurrentItem(), false, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    public View k() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public SearchResultMainPresenter ao_() {
        return new SearchResultMainPresenter();
    }

    @Override // defpackage.azr
    public void l_(int i) {
        this.f.a(i);
    }

    @Override // defpackage.azr
    public int a() {
        return this.g.getCurrentItem();
    }

    protected String a(String str) {
        if (getArguments() != null) {
            return getArguments().getString(str, "");
        }
        return null;
    }
}
