package defpackage;

import com.lzy.okgo.adapter.Call;
import com.xiaopeng.musicradio.bean.xpbean.CategoryAlbumListBean;
import defpackage.axx;
import io.reactivex.Observable;
/* compiled from: RxReadingModel.java */
/* renamed from: axo  reason: default package */
/* loaded from: classes2.dex */
public class axo {
    public static Observable<CategoryAlbumListBean> a(final long j, final boolean z, final int i, final int i2) {
        return new axx<CategoryAlbumListBean>() { // from class: axo.1
            @Override // defpackage.axx
            protected axx.a<CategoryAlbumListBean> a() {
                return new axx.a<CategoryAlbumListBean>() { // from class: axo.1.1
                };
            }

            @Override // defpackage.axx
            protected Call<CategoryAlbumListBean> a(avc<CategoryAlbumListBean> avcVar) {
                return axp.a().a(j, z, i, i2, avcVar);
            }
        };
    }
}
