package com.xiaopeng.musicradio.music.concentration.audition.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.RecommentMusicResult;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.v;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MsPsevenPresenter extends MusicBasePresenter<arn> {
    private ArrayList<MusicRadioItem> c = new ArrayList<>();

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsPsevenPresenter", "onCreateView");
        d();
    }

    public void d() {
        g();
    }

    private void g() {
        if (a() != null) {
            a().r_();
        }
        aqz.a().l(new avc<RecommentMusicResult>() { // from class: com.xiaopeng.musicradio.music.concentration.audition.presenter.MsPsevenPresenter.1
            @Override // defpackage.avc
            public void a(RecommentMusicResult recommentMusicResult) {
                MsPsevenPresenter.this.a(recommentMusicResult);
                MsPsevenPresenter.this.k();
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (MsPsevenPresenter.this.a() != null) {
                    MsPsevenPresenter.this.a().a(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecommentMusicResult recommentMusicResult) {
        if (recommentMusicResult.getData() != null && recommentMusicResult.getData().getList().size() >= 0) {
            if (recommentMusicResult.getData().getList().size() == 0) {
                if (a() != null) {
                    a().b("");
                    return;
                }
                return;
            }
            this.c.clear();
            ArrayList arrayList = new ArrayList();
            for (MusicRadioItem musicRadioItem : recommentMusicResult.getData().getList()) {
                musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                musicRadioItem.setTitle(musicRadioItem.getName());
                musicRadioItem.setName(musicRadioItem.getName());
                musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
                this.c.add(musicRadioItem);
                arrayList.add(Long.valueOf(musicRadioItem.getId()));
            }
            MusicRadioItem musicRadioItem2 = new MusicRadioItem();
            musicRadioItem2.setTitle(ListSignBean.LOCAL_MUSIC_TITLE);
            musicRadioItem2.setName(ListSignBean.LOCAL_MUSIC_TITLE);
            musicRadioItem2.setId(2000L);
            musicRadioItem2.setType(ListSignBean.LISTSIGN_LOCAL_RM_MUSIC);
            String a = v.a(a.a, b.c.pic_music_showcarcover_audition);
            musicRadioItem2.setLogoUrl(a);
            musicRadioItem2.setLogo(a);
            arrayList.add(2000L);
            arl.a().a(arrayList);
            ay.a("SP_AUDITION_ID_LIST", z.a(arrayList));
            this.c.add(0, musicRadioItem2);
            if (a() != null) {
                a().a(this.c);
            }
        } else if (a() != null) {
            a().a("");
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (NetUtils.isNetworkAvailable(a.a) && this.c.size() == 0) {
            d();
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.LISTSIGN_LOCAL_RM_MUSIC) || str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().a();
        }
    }
}
