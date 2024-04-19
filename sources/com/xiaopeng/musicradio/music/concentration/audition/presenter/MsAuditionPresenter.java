package com.xiaopeng.musicradio.music.concentration.audition.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MsAuditionPresenter extends MusicBasePresenter<arm> {
    private List<Long> c = new ArrayList();

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsAuditionPresenter", "onCreateView");
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        Log.i("MsAuditionPresenter", "onResume");
        d();
    }

    private void d() {
        List<Long> b = arl.a().b();
        if (b != null && b.size() > 0) {
            this.c.clear();
            this.c.addAll(b);
            j();
            return;
        }
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.audition.presenter.MsAuditionPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                List b2 = z.b(ay.a("SP_AUDITION_ID_LIST"), Long.class);
                if (b2 != null && b2.size() > 0) {
                    MsAuditionPresenter.this.c.clear();
                    MsAuditionPresenter.this.c.addAll(b2);
                }
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.audition.presenter.MsAuditionPresenter.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MsAuditionPresenter.this.j();
                    }
                });
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        boolean z = false;
        if (str.contains(ListSignBean.LISTSIGN_LOCAL_RM_MUSIC) && str.contains(String.valueOf(2000L))) {
            return true;
        }
        if (str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
            for (Long l : this.c) {
                if (str.contains(String.valueOf(l))) {
                    z = true;
                }
            }
            return z;
        }
        return false;
    }
}
