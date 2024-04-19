package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicMatchBean;
import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import com.xiaopeng.musicradio.music.bean.MusicLyricBean;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MusicPlayHandler.java */
/* renamed from: atg  reason: default package */
/* loaded from: classes2.dex */
public class atg implements api {
    private Call<?> a = null;
    private Call<?> b = null;
    private long c;
    private int d;
    private ael e;

    @Override // defpackage.api
    public void a(int i) {
    }

    public atg(aek aekVar) {
        Log.i("MusicPlayHandler", "MusicPlayHandler: =======");
        u.a(this);
        this.c = ay.b("sp_vip_change", 0L);
        this.e = new ael(aekVar);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onVipSuccess(agg.ak akVar) {
        Log.i("MusicPlayHandler", "onVipSuccess: ============= ");
        ay.a("sp_vip_change", System.currentTimeMillis());
        this.c = System.currentTimeMillis();
        if (aei.a().c() != 0 || apk.i().d() == null) {
            return;
        }
        apk.i().h();
    }

    @Override // defpackage.api
    public boolean a(MusicInfo musicInfo) {
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        if (!TextUtils.isEmpty((CharSequence) a(musicInfo, bcuVar != null ? bcuVar.getSongQuality() : 1).first) || TextUtils.isEmpty(musicInfo.getUnplayableMsg())) {
            return true;
        }
        apk.i().b(musicInfo.getUnplayableMsg());
        return false;
    }

    @Override // defpackage.api
    public void a(final MusicInfo musicInfo, final String str, final boolean z, boolean z2, final aph aphVar) {
        this.d = 0;
        b(musicInfo);
        long currentTimeMillis = System.currentTimeMillis() - this.c;
        long currentTimeMillis2 = System.currentTimeMillis() - musicInfo.getListenUrlRefreshTime();
        Log.i("MusicPlayHandler", "play: needRefreshListenUrl = " + z2 + " refreshDeltaTime = " + currentTimeMillis2 + " vipDeltaTime = " + currentTimeMillis);
        if (z2 || ((musicInfo.getTryFileInfo() == null && musicInfo.getFileList() == null) || currentTimeMillis2 >= 86400000 || currentTimeMillis < 86400000)) {
            Log.i("MusicPlayHandler", "play: ======== " + musicInfo + " needRefreshListenUrl = " + z2);
            Call<?> call = this.a;
            if (call != null) {
                call.cancel();
            }
            this.a = ath.a().a(musicInfo.getHash(), new avc<MusicMatchBean>() { // from class: atg.1
                @Override // defpackage.avc
                public void a(MusicMatchBean musicMatchBean) {
                    Log.i("MusicPlayHandler", "response: listenFile = " + musicMatchBean.getData().getListenFile());
                    if (apk.i().a(str)) {
                        if (z && !musicMatchBean.getData().isPlayable() && musicMatchBean.getData().isTryPlayable()) {
                            apk.i().b("歌曲片段试听中，QQ音乐vip会员可畅听完整版");
                        }
                        musicInfo.setPlayable(musicMatchBean.getData().isPlayable());
                        musicInfo.setFileList(musicMatchBean.getData().getFileList());
                        musicInfo.setTryPlayable(musicMatchBean.getData().isTryPlayable());
                        musicInfo.setTryFileInfo(musicMatchBean.getData().getTryFileInfo());
                        musicInfo.setHot(musicMatchBean.getData().isHot());
                        musicInfo.setUnplayableCode(musicMatchBean.getData().getUnplayableCode());
                        musicInfo.setUnplayableMsg(musicMatchBean.getData().getUnplayableMsg());
                        musicInfo.setSongPlayTime(musicMatchBean.getData().getSongPlayTime());
                        if (!musicMatchBean.isFromCache()) {
                            apb.a().b(musicInfo, true);
                        }
                        ban.e(new Runnable() { // from class: atg.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MusicInfo a = anv.a().a(musicInfo.getHash());
                                if (a != null) {
                                    a.setPlayable(musicInfo.isPlayable());
                                    a.setFileList(musicInfo.getFileList());
                                    a.setTryPlayable(musicInfo.isTryPlayable());
                                    a.setTryFileInfo(musicInfo.getTryFileInfo());
                                    a.setHot(musicInfo.isHot());
                                    a.setUnplayableCode(musicInfo.getUnplayableCode());
                                    a.setUnplayableMsg(musicInfo.getUnplayableMsg());
                                    a.setSongPlayTime(musicInfo.getSongPlayTime());
                                    LogUtils.i("MusicPlayHandler", "run: hash = %s, from = %d", a.getHash(), Integer.valueOf(a.getMusicFrom()));
                                    anv.a().a(a, true);
                                }
                            }
                        });
                        MusicInfo u = apk.i().u();
                        if (u == null || TextUtils.equals(u.getHash(), musicInfo.getHash())) {
                            atg.this.a(musicInfo, str, z, aphVar);
                            u.c(new age.s());
                            u.c(new age.r());
                            u.c(new age.c(0));
                            return;
                        }
                        Log.i("MusicPlayHandler", "response: playing = " + u.getHash() + " infoHash = " + musicInfo.getHash());
                    }
                }

                @Override // defpackage.avc
                public void a(int i, String str2) {
                    LogUtils.i("MusicPlayHandler", "detail error: " + i + " msg=" + str2);
                    aph aphVar2 = aphVar;
                    if (aphVar2 != null) {
                        aphVar2.a(musicInfo, str, i, str2);
                    }
                }
            });
            return;
        }
        a(musicInfo, str, z, aphVar);
    }

    private void b(final MusicInfo musicInfo) {
        Call<?> call = this.b;
        if (call != null) {
            call.cancel();
        }
        if (TextUtils.isEmpty(musicInfo.getLrcData())) {
            Log.i("MusicPlayHandler", "refreshLrc: " + musicInfo.getHash());
            this.b = ath.a().c(musicInfo.getHash(), new avc<MusicLyricBean>() { // from class: atg.2
                @Override // defpackage.avc
                public void a(MusicLyricBean musicLyricBean) {
                    Log.i("MusicPlayHandler", "response:lrc ======== ");
                    musicInfo.setLrcData(musicLyricBean.a().getSongLyric());
                    ban.e(new Runnable() { // from class: atg.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MusicInfo a = anv.a().a(musicInfo.getHash());
                            if (a != null) {
                                a.setLrcData(musicInfo.getLrcData());
                                LogUtils.i("MusicPlayHandler", "run: hash = %s, from = %d", a.getHash(), Integer.valueOf(a.getMusicFrom()));
                                anv.a().a(a, true);
                            }
                        }
                    });
                    u.c(new age.h());
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    Log.i("MusicPlayHandler", "error: lrc code = " + i + " msg = " + str);
                    musicInfo.setLrcData("");
                    u.c(new age.h());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MusicInfo musicInfo, String str, boolean z, aph aphVar) {
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        int songQuality = bcuVar != null ? bcuVar.getSongQuality() : 1;
        Pair<String, Integer> a = a(musicInfo, songQuality);
        String str2 = (String) a.first;
        b(musicInfo, ((Integer) a.second).intValue());
        Log.i("MusicPlayHandler", "play: ======= curqualit = " + songQuality + " sec = " + a.second);
        u.c(new age.s());
        if (!TextUtils.isEmpty(str2)) {
            Log.i("MusicPlayHandler", "play: url = " + str2);
            aphVar.a(musicInfo, z, str2);
            return;
        }
        Log.i("MusicPlayHandler", "play: unplayable code = " + musicInfo.getUnplayableCode() + " msg = " + musicInfo.getUnplayableMsg());
        if (aphVar != null) {
            String unplayableMsg = musicInfo.getUnplayableMsg();
            if (TextUtils.isEmpty(unplayableMsg)) {
                unplayableMsg = "无法播放";
            }
            aphVar.a(musicInfo, str, 5000002, unplayableMsg);
        }
    }

    private Pair<String, Integer> a(MusicInfo musicInfo, int i) {
        String str = "";
        SongQualityBean.DataBean.SongQuality songQuality = null;
        if (musicInfo.isPlayable()) {
            List<SongQualityBean.DataBean.SongQuality> fileList = musicInfo.getFileList();
            Log.i("MusicPlayHandler", "play: ============ " + i);
            if (fileList != null) {
                Log.i("MusicPlayHandler", "play: list = " + fileList);
                Iterator<SongQualityBean.DataBean.SongQuality> it = fileList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SongQualityBean.DataBean.SongQuality next = it.next();
                    if (!TextUtils.isEmpty(next.getPlayUrl())) {
                        Log.i("MusicPlayHandler", "getMatchQualtiy: +ret === " + next);
                        songQuality = next;
                    }
                    if (next.getQuality() == i && !TextUtils.isEmpty(next.getPlayUrl())) {
                        str = String.format("%s?xpHash=%s", next.getPlayUrl(), musicInfo.getHash() + "quality=" + next.getQuality());
                        StringBuilder sb = new StringBuilder();
                        sb.append("play: song == ");
                        sb.append(songQuality.getQuality());
                        Log.i("MusicPlayHandler", sb.toString());
                        break;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str) && songQuality != null) {
            str = String.format("%s?xpHash=%s", songQuality.getPlayUrl(), musicInfo.getHash() + "quality=" + songQuality.getQuality());
            Log.i("MusicPlayHandler", "play: ======= " + songQuality.getQuality() + " info = " + musicInfo.getQuality());
            i = songQuality.getQuality();
        }
        if (TextUtils.isEmpty(str) && musicInfo.getTryFileInfo() != null && musicInfo.isTryPlayable() && !TextUtils.isEmpty(musicInfo.getTryFileInfo().getPlayUrl())) {
            str = String.format("%s?xpHash=%s", musicInfo.getTryFileInfo().getPlayUrl(), musicInfo.getHash() + "try");
            this.d = musicInfo.getTryFileInfo().getTryBegin() / 1000;
            i = 1;
        }
        return new Pair<>(str, Integer.valueOf(i));
    }

    @Override // defpackage.api
    public void a(int i, MusicInfo musicInfo) {
        if (aei.a().c() != 0 || musicInfo == null) {
            return;
        }
        if (musicInfo.supportQuality(i)) {
            Pair<String, Integer> a = a(musicInfo, i);
            Log.i("MusicPlayHandler", "rePlayWhenChangeQuality: =======" + i + " match = " + a.second);
            b(musicInfo, ((Integer) a.second).intValue());
            apk.i().z();
            return;
        }
        Log.i("MusicPlayHandler", "rePlayWhenChangeQuality: no support=======");
    }

    private void b(final MusicInfo musicInfo, int i) {
        if (musicInfo.getQuality() != i) {
            musicInfo.setQuality(i);
            ban.e(new Runnable() { // from class: atg.3
                @Override // java.lang.Runnable
                public void run() {
                    MusicInfo a = anv.a().a(musicInfo.getHash());
                    if (a != null) {
                        a.setQuality(musicInfo.getQuality());
                        LogUtils.i("MusicPlayHandler", "run: hash = %s, quality = %d", a.getHash(), Integer.valueOf(a.getQuality()));
                        anv.a().a(a, true);
                    }
                }
            });
        }
    }

    @Override // defpackage.api
    public boolean a(int i, String str) {
        return this.e.a(i, str);
    }

    @Override // defpackage.api
    public int a() {
        return this.d;
    }
}
