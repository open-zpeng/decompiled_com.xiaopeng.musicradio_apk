package com.xiaopeng.musicradio.music.singer.main.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.music.singer.main.view.a;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MsSingerItemPresenter extends BasePresenter<a> {
    private boolean b;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        a(apk.i().x());
        if (a() != null) {
            a().e();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (!this.b || a() == null) {
            return;
        }
        a().a(this.b);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicInfo(age.c cVar) {
        a(apk.i().x());
    }

    private void a(String str) {
        ListSignBean listSignBean = (ListSignBean) z.a(str, (Class<Object>) ListSignBean.class);
        if (listSignBean != null) {
            String extra = listSignBean.getExtra();
            String prefix = listSignBean.getPrefix();
            if (TextUtils.equals(extra, ListSignBean.MUSIC_SINGER_EXTRA) && TextUtils.equals(prefix, ListSignBean.LISTSIGN_ARTIST_RADIO)) {
                if (!this.b) {
                    this.b = true;
                }
                if (a() != null) {
                    a().a(this.b);
                    return;
                }
                return;
            }
            this.b = false;
            if (a() != null) {
                a().a(this.b);
                return;
            }
            return;
        }
        this.b = false;
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChangeEvent(agg.y yVar) {
        if (a() != null) {
            a().e();
        }
    }
}
