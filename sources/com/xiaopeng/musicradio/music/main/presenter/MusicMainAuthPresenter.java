package com.xiaopeng.musicradio.music.main.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.music.main.view.b;
import com.xiaopeng.musicradio.utils.u;
/* loaded from: classes.dex */
public class MusicMainAuthPresenter extends MusicBasePresenter<b> {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MusicMainAuthPresenter", "onCreateView");
        u.a(this);
        j();
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.LOCAL_MUSIC_EXTRA) && str.contains(ListSignBean.LISTSIGN_LOCAL_RM_MUSIC) && str.contains(String.valueOf(2000L));
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }
}
