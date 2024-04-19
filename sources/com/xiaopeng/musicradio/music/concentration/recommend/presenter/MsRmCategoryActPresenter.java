package com.xiaopeng.musicradio.music.concentration.recommend.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.xpbean.ReMusicTagInfo;
import com.xiaopeng.musicradio.music.concentration.recommend.view.a;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import defpackage.asc;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MsRmCategoryActPresenter extends MusicBasePresenter<a> {
    private ArrayList<ReMusicTagInfo> c = new ArrayList<>();
    private asc d;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsRmCategoryActPresenter", "onCreate");
        this.d = new asc();
        if (iVar != null) {
            d();
        }
    }

    public void d() {
        if (a() != null) {
            a().r_();
        }
        g();
    }

    private void g() {
        this.d.a(new asc.a() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmCategoryActPresenter.1
            @Override // defpackage.asc.a
            public void a(ArrayList<ReMusicTagInfo> arrayList) {
                if (MsRmCategoryActPresenter.this.a() != null) {
                    MsRmCategoryActPresenter.this.a().a(arrayList);
                    MsRmCategoryActPresenter.this.c.clear();
                    MsRmCategoryActPresenter.this.c.addAll(arrayList);
                }
            }

            @Override // defpackage.asc.a
            public void a(String str) {
                if (MsRmCategoryActPresenter.this.a() != null) {
                    MsRmCategoryActPresenter.this.a().a("");
                }
            }

            @Override // defpackage.asc.a
            public void b(String str) {
                if (MsRmCategoryActPresenter.this.a() != null) {
                    MsRmCategoryActPresenter.this.a().b("");
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) && this.c.size() == 0) {
            d();
        }
    }
}
