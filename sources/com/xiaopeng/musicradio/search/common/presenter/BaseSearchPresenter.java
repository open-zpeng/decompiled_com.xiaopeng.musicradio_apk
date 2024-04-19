package com.xiaopeng.musicradio.search.common.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agh;
import defpackage.agp;
import java.util.List;
/* loaded from: classes2.dex */
public class BaseSearchPresenter<UIInterface> extends BasePresenter<UIInterface> {
    private boolean d(int i) {
        return i == 2 || i == 1;
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    private int c(int i) {
        if (aei.a().e() == null || i != aei.a().c()) {
            return -1;
        }
        return aei.a().e().getPlayState();
    }

    public int a(String str, long j) {
        arh playingInfo;
        arf arfVar = (arf) c.a().b(arf.class);
        if (arfVar == null || (playingInfo = arfVar.getPlayingInfo()) == null || playingInfo.a() == null || !playingInfo.a().equalsIgnoreCase(str) || playingInfo.f() != j || aei.a().c() != 0) {
            return -1;
        }
        return c(0);
    }

    public int a(long j) {
        awk playingInfo;
        awh awhVar = (awh) c.a().b(awh.class);
        if (awhVar == null || (playingInfo = awhVar.getPlayingInfo()) == null || playingInfo.d() != j || aei.a().c() != 3) {
            return -1;
        }
        return c(3);
    }

    public int a(int i) {
        NetRadioProgramInfo netRadioProgramInfo = (NetRadioProgramInfo) ((aua) c.a().b(aua.class)).getPlayingInfo();
        if (netRadioProgramInfo != null) {
            NetRadioInfo parentInfo = netRadioProgramInfo.getParentInfo();
            if (aei.a().c() == 6 && parentInfo.getId() == i) {
                return c(6);
            }
            return -1;
        }
        return -1;
    }

    public void a(NetRadioInfo netRadioInfo) {
        u.c(new agh.d(false));
        aua auaVar = (aua) c.a().b(aua.class);
        if (auaVar != null) {
            if (d(a(netRadioInfo.getId()))) {
                aei.a().e().pause();
            } else {
                auaVar.play(netRadioInfo);
            }
        }
    }

    public void a(boolean z) {
        arf arfVar = (arf) c.a().b(arf.class);
        if (arfVar != null) {
            if (z) {
                arfVar.play();
            } else {
                arfVar.pause();
            }
        }
    }

    public int a(long j, String str) {
        String c = c();
        if (TextUtils.isEmpty(c) || !c.contains("listsign_singer_single_music")) {
            return -1;
        }
        if (c.contains(ListSignBean.COLLECTID_PREFIX + j + ListSignBean.COLLECTID_SUFFIX)) {
            return c(0);
        }
        return -1;
    }

    public int b(long j, String str) {
        String c = c();
        if (TextUtils.isEmpty(c) || !c.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
            return -1;
        }
        if (c.contains(ListSignBean.COLLECTID_PREFIX + j + ListSignBean.COLLECTID_SUFFIX)) {
            return c(0);
        }
        return -1;
    }

    public void a(RdAlbumBean rdAlbumBean) {
        u.c(new agh.d(false));
        awh awhVar = (awh) c.a().b(awh.class);
        if (awhVar != null) {
            if (d(a(rdAlbumBean.getId()))) {
                awhVar.pause();
            } else {
                awhVar.playReading(rdAlbumBean);
            }
        }
    }

    public void c(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
        arf arfVar = (arf) c.a().b(arf.class);
        u.c(new agh.d(false));
        if (arfVar != null) {
            if (d(b(j, str))) {
                arfVar.pause();
            } else {
                arfVar.playMusicByListSign(listSignBean.toJson());
            }
        }
    }

    public void a(long j, String str, String str2) {
        ((arf) c.a().b(arf.class)).recordMusicCollect(j, str, str2);
    }

    public void d(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix("listsign_singer_single_music");
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_SINGER_EXTRA);
        arf arfVar = (arf) c.a().b(arf.class);
        u.c(new agh.d(false));
        if (arfVar != null) {
            if (d(a(j, str))) {
                u.c(new agh.d(true));
            } else {
                arfVar.playMusicByListSign(listSignBean.toJson());
            }
        }
    }

    public void a(String str, int i, int i2, int i3, avc<MixSearchResultBean> avcVar) {
        if (apx.a().d() || i == 5 || i == 6) {
            ayi.a().a(str, i, i2, i3, avcVar);
            return;
        }
        u.c(new agp.a());
        apx.a().a(null);
    }

    protected String c() {
        return ((arf) c.a().b(arf.class)).getListSign();
    }

    public void a(MusicSongBean musicSongBean) {
        arf arfVar = (arf) c.a().b(arf.class);
        u.c(new agh.d(false));
        if (arfVar != null) {
            if (d(a(musicSongBean.getHash(), musicSongBean.getAlbum().getId()))) {
                arfVar.pause();
            } else {
                arfVar.playMusic(z.a(musicSongBean));
            }
        }
    }

    public void b(MusicSongBean musicSongBean) {
        arf arfVar = (arf) c.a().b(arf.class);
        if (arfVar != null) {
            arfVar.favMusicOrNot(musicSongBean);
        }
    }

    public boolean c(MusicSongBean musicSongBean) {
        if (musicSongBean == null || !musicSongBean.isHot()) {
            arf arfVar = (arf) c.a().b(arf.class);
            if (arfVar == null || musicSongBean == null) {
                return false;
            }
            return arfVar.isLove(musicSongBean);
        }
        return true;
    }

    public boolean b(long j) {
        return d(a(j));
    }

    public boolean b(int i) {
        return d(a(i));
    }

    public boolean e(long j, String str) {
        return d(a(j, str));
    }

    public boolean f(long j, String str) {
        return d(b(j, str));
    }

    public void a(MusicSongBean musicSongBean, List<MusicSongBean> list, int i) {
        arf arfVar = (arf) c.a().b(arf.class);
        if (arfVar != null) {
            arfVar.playMusic(z.a(musicSongBean), z.a(list), ListSignBean.LISTSIGN_SEARCH_SONG);
        }
    }

    public String d() {
        arh playingInfo;
        arf arfVar = (arf) c.a().b(arf.class);
        if (arfVar == null || (playingInfo = arfVar.getPlayingInfo()) == null) {
            return null;
        }
        return playingInfo.a();
    }
}
