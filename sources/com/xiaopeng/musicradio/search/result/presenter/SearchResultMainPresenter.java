package com.xiaopeng.musicradio.search.result.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import defpackage.agp;
import defpackage.ayg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class SearchResultMainPresenter extends BasePresenter<azr> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewVoiceSearchRsult(agp.d dVar) {
        LogUtils.i("SearchResultMainPresenter", "onNewVoiec.getSearchType() handle tab change: " + dVar.b());
        if (w.f() == 2) {
            if (dVar.b() == 1) {
                if (a() != null) {
                    a().l_(1);
                }
            } else if (dVar.b() == 2) {
                if (a() != null) {
                    a().l_(2);
                }
            } else if (dVar.b() == 5) {
                if (a() != null) {
                    a().l_(4);
                }
            } else if (dVar.b() == 3) {
                if (a() != null) {
                    a().l_(3);
                }
            } else if (dVar.b() != 6 || a() == null) {
            } else {
                a().l_(5);
            }
        } else if (dVar.d()) {
            if (dVar.b() == 1) {
                if (a() != null) {
                    a().l_(1);
                }
            } else if (dVar.b() == 2) {
                if (a() != null) {
                    a().l_(2);
                }
            } else if (dVar.b() == 5) {
                if (a() != null) {
                    a().l_(4);
                }
            } else if (dVar.b() == 3) {
                if (a() != null) {
                    a().l_(3);
                }
            } else if (dVar.b() != 6 || a() == null) {
            } else {
                a().l_(5);
            }
        } else if (dVar.b() == 2) {
            if (a() != null) {
                a().l_(4);
            }
        } else if (dVar.b() != 1 || a() == null) {
        } else {
            a().l_(1);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSearchTopBarKeyword(ayg.a aVar) {
        if (a() == null || a().a() == 0) {
            return;
        }
        a().l_(0);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        ayi.a().b();
    }
}
