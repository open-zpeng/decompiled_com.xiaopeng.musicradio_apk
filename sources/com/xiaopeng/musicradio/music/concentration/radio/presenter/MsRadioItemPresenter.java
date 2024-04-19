package com.xiaopeng.musicradio.music.concentration.radio.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.music.concentration.radio.view.b;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
/* loaded from: classes.dex */
public class MsRadioItemPresenter extends MusicBasePresenter<b> {
    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void h() {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsRadioItemPresenter", "onCreateView");
        j();
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_RADIO_SING_EXTRA) && str.contains(ListSignBean.LISTSIGN_TAGS);
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().e();
        }
    }
}
