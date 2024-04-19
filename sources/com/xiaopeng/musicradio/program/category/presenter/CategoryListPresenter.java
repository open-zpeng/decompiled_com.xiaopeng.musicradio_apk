package com.xiaopeng.musicradio.program.category.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.CategoryAlbumListBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.category.view.c;
import com.xiaopeng.musicradio.program.common.presenter.BaseProgramListPresenter;
import defpackage.age;
import defpackage.agg;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class CategoryListPresenter extends BaseProgramListPresenter<c> {
    private long d;
    private Disposable e;

    public CategoryListPresenter(long j) {
        this.d = j;
    }

    public CategoryListPresenter() {
    }

    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        e();
    }

    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramListPresenter
    protected void a(final int i) {
        if (this.d == 0) {
            return;
        }
        if (a() != 0) {
            ((c) a()).a(true, i, this.c);
        }
        e();
        this.e = axo.a(this.d, false, i, 50).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new Consumer<CategoryAlbumListBean>() { // from class: com.xiaopeng.musicradio.program.category.presenter.CategoryListPresenter.1
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(CategoryAlbumListBean categoryAlbumListBean) {
                List<RdAlbumBean> list = categoryAlbumListBean.getData().getList();
                if (list == null || list.isEmpty()) {
                    if (categoryAlbumListBean.getData().getPage().getTotalPage() == 0 && CategoryListPresenter.this.a() != 0) {
                        ((c) CategoryListPresenter.this.a()).X_();
                    }
                    CategoryListPresenter.this.c = 0;
                    CategoryListPresenter.this.b = 0;
                    return;
                }
                CategoryListPresenter.this.c = categoryAlbumListBean.getData().getPage().getTotalPage();
                CategoryListPresenter.this.b = categoryAlbumListBean.getData().getPage().getPage();
                if (CategoryListPresenter.this.a() != 0) {
                    ((c) CategoryListPresenter.this.a()).a(list, CategoryListPresenter.this.b, categoryAlbumListBean.isFromCache());
                    ((c) CategoryListPresenter.this.a()).a(false, i, CategoryListPresenter.this.c);
                }
            }
        }, new Consumer<Throwable>() { // from class: com.xiaopeng.musicradio.program.category.presenter.CategoryListPresenter.2
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Throwable th) {
                String message = th.getMessage();
                if (CategoryListPresenter.this.a() != 0) {
                    ((c) CategoryListPresenter.this.a()).a(message, i);
                }
                Log.w("CategoryListPresenter", "getRankTotalAlbumList#error() called with: msg = [" + message + "]");
            }
        });
    }

    private void e() {
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public void c() {
        a(1);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        ProgramBean r;
        if (lVar.b() != 3 || a() == 0 || (r = axn.i().r()) == null) {
            return;
        }
        ((c) a()).a_(r.getAlbumId());
    }

    public void a(long j) {
        this.d = j;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChange(agg.y yVar) {
        if (a() != 0) {
            ((c) a()).a_(0L);
        }
    }
}
