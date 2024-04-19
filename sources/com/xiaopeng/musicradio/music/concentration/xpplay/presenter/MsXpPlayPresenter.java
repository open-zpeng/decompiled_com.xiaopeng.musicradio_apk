package com.xiaopeng.musicradio.music.concentration.xpplay.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.XpPlayMusicResult;
import com.xiaopeng.musicradio.music.concentration.xpplay.view.a;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import java.util.List;
/* loaded from: classes.dex */
public class MsXpPlayPresenter extends MusicBasePresenter<a> {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsXpPlayPresenter", "onCreate");
        d();
    }

    public void d() {
        Log.i("MsXpPlayPresenter", "getXpPlayData start");
        aqz.a().h(new avc<XpPlayMusicResult>() { // from class: com.xiaopeng.musicradio.music.concentration.xpplay.presenter.MsXpPlayPresenter.1
            @Override // defpackage.avc
            public void a(XpPlayMusicResult xpPlayMusicResult) {
                Log.i("MsXpPlayPresenter", "getXpPlayData getresult");
                a a = MsXpPlayPresenter.this.a();
                if (a != null && xpPlayMusicResult != null && xpPlayMusicResult.getData() != null && xpPlayMusicResult.getData().getCollectList() != null && xpPlayMusicResult.getData().getCollectList().size() > 0) {
                    List<MusicRadioItem> collectList = xpPlayMusicResult.getData().getCollectList();
                    for (MusicRadioItem musicRadioItem : collectList) {
                        musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                        musicRadioItem.setTitle(musicRadioItem.getName());
                        musicRadioItem.setName(musicRadioItem.getName());
                        musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
                    }
                    Log.i("MsXpPlayPresenter", "getXpPlayData datas.size():" + collectList.size());
                    if (collectList.size() >= 4) {
                        a.a(xpPlayMusicResult.getData().getCategoryId(), xpPlayMusicResult.getData().getName(), collectList.subList(0, 4));
                    } else {
                        a.a(xpPlayMusicResult.getData().getCategoryId(), xpPlayMusicResult.getData().getName(), collectList);
                    }
                    amr.a().a(collectList);
                    return;
                }
                Log.i("MsXpPlayPresenter", "getXpPlayData error");
                if (a != null) {
                    a.a("");
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                Log.i("MsXpPlayPresenter", "getXpPlayData error");
                a a = MsXpPlayPresenter.this.a();
                if (a != null) {
                    a.a(str);
                }
            }
        });
    }
}
