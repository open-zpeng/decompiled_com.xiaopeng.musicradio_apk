package com.xiaopeng.musicradio.music.main.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.music.main.view.c;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agh;
import defpackage.agq;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MusicMainPresenter extends BasePresenter<c> {
    private static final Map<String, Integer> b = new HashMap();

    static {
        b.put("concentration", 0);
        b.put("rank", 1);
        b.put("singer", 2);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MusicMainPresenter", "onCreateView");
        u.a(this);
        if (a() != null) {
            a().a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMusicAuth(agq.h hVar) {
        if (a() != null) {
            a().a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMusicBinded(agq.g gVar) {
        LogUtils.i("MusicMainPresenter", "onMusicBinded: ");
        if (a() != null) {
            a().a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void userLogout(agq.v vVar) {
        LogUtils.i("MusicMainPresenter", "userLogout: ");
        if (a() != null) {
            a().a();
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onSwitchTab(final agh.b bVar) {
        Integer num;
        Log.i("MusicMainPresenter", "onSwitchTab: " + bVar.b());
        if (TextUtils.isEmpty(bVar.b()) || (num = b.get(bVar.b())) == null || a() == null || bVar.a() != 0) {
            return;
        }
        u.d(bVar);
        a().f_(num.intValue());
        Log.i("MusicMainPresenter", "onSwitchTab: ======= " + num);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.music.main.presenter.MusicMainPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                u.e(new agh.a(bVar.a(), bVar.c()));
            }
        });
    }
}
