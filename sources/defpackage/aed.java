package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.aisuggest.ContentBean;
import com.xiaopeng.musicradio.bean.xpbean.AisuggestSingleMusicBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumResult;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectDetailResult;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.am;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.afv;
import defpackage.agg;
import defpackage.agq;
import defpackage.apx;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MusicAisuggest.java */
/* renamed from: aed  reason: default package */
/* loaded from: classes2.dex */
public class aed {
    private AisuggestSingleMusicBean a;

    /* compiled from: MusicAisuggest.java */
    /* renamed from: aed$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aed a = new aed();
    }

    public static aed a() {
        return a.a;
    }

    public aed() {
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void receiveEgg(afv.b bVar) {
        a(bVar.a());
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void receiveAisuggest(afv.a aVar) {
        ContentBean a2 = aVar.a();
        if (a2.getType() == 1) {
            MusicAlbumBean musicAlbumBean = (MusicAlbumBean) z.a(a2.getObject(), (Class<Object>) MusicAlbumBean.class);
            if (musicAlbumBean == null) {
                LogUtils.i("MusicAisuggest", "onReceiveSuggest musicAlbumBean == null");
                return;
            }
            LogUtils.i("MusicAisuggest", "onReceiveSuggest musicAlbumBean == " + musicAlbumBean.getId());
            if (TextUtils.equals(a2.getCmd(), "open")) {
                c(musicAlbumBean.getId());
            } else if (TextUtils.equals(a2.getCmd(), "play")) {
                b(musicAlbumBean.getId());
            } else if (TextUtils.equals(a2.getCmd(), "replay")) {
            } else {
                LogUtils.i("MusicAisuggest", "CMD error, cmd=" + a2.getCmd() + "");
            }
        } else if (a2.getType() == 4) {
            MusicCollectBean musicCollectBean = (MusicCollectBean) z.a(a2.getObject(), (Class<Object>) MusicCollectBean.class);
            if (musicCollectBean == null) {
                LogUtils.i("MusicAisuggest", "onReceiveSuggest musicAlbumBean == null");
            } else if (TextUtils.equals(a2.getCmd(), "open")) {
                d(musicCollectBean.getId());
            } else if (TextUtils.equals(a2.getCmd(), "play")) {
                a(musicCollectBean.getId());
            } else {
                LogUtils.i("MusicAisuggest", "CMD error, cmd=" + a2.getCmd() + "");
            }
        } else if (a2.getType() == 8) {
            Log.i("MusicAisuggest", "onReceiveSuggest: SGST_TYPE_SINGLEMUSIC " + a2.getObject());
            AisuggestSingleMusicBean aisuggestSingleMusicBean = (AisuggestSingleMusicBean) z.a(a2.getObject(), (Class<Object>) AisuggestSingleMusicBean.class);
            if (aisuggestSingleMusicBean == null) {
                return;
            }
            Log.i("MusicAisuggest", "onReceiveSuggest: SGST_TYPE_SINGLEMUSIC cmd = " + a2.getCmd());
            this.a = aisuggestSingleMusicBean;
            a(aisuggestSingleMusicBean.getVoiceId(), aisuggestSingleMusicBean.getId());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMusicBinded(agq.g gVar) {
        AisuggestSingleMusicBean aisuggestSingleMusicBean;
        if (gVar.a.equals("MusicAisuggest") && (aisuggestSingleMusicBean = this.a) != null) {
            a(aisuggestSingleMusicBean.getVoiceId(), this.a.getId());
        }
        this.a = null;
    }

    private void a(final String str, final long j) {
        Log.i("MusicAisuggest", "playSingleMusic: " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!apx.a().d()) {
            ak.b(com.xiaopeng.musicradio.a.a, com.xiaopeng.musicradio.a.a.getString(b.f.login_invalidate));
            u.c(new agg.x("MusicAisuggest"));
            Log.i("MusicAisuggest", "playSingleMusic: postEvent ShowLoginDialog");
            return;
        }
        apx.a().a(new apx.b() { // from class: aed.1
            @Override // defpackage.apx.b
            public boolean a(boolean z) {
                aee.a(str, j);
                aed.this.a = null;
                return true;
            }

            @Override // defpackage.apx.b
            public void a() {
                aed.this.a = null;
            }
        });
    }

    public void a(long j) {
        a(j, true);
    }

    public void b(long j) {
        a(j, false);
    }

    public void c(final long j) {
        LogUtils.i("MusicAisuggest", "try openMusicAlbum id = " + j);
        if (b()) {
            return;
        }
        am.a();
        aqz.a().c(j, new avc<MusicAlbumResult>() { // from class: aed.2
            @Override // defpackage.avc
            public void a(MusicAlbumResult musicAlbumResult) {
                LogUtils.i("MusicAisuggest", "real open openMusicAlbum id = " + j);
                atz.a((long) musicAlbumResult.getData().getId(), musicAlbumResult.getData().getLogo(), musicAlbumResult.getData().getName(), null);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                ak.b(com.xiaopeng.musicradio.a.a, bj.b(i, str));
                LogUtils.i("MusicAisuggest", "real open openMusicAlbum failed id = " + j);
            }
        });
        bch.a(j);
    }

    public void d(final long j) {
        LogUtils.i("MusicAisuggest", "try openMusicCollect id = " + j);
        if (b()) {
            return;
        }
        am.a();
        aqz.a().a(j, new avc<MusicCollectDetailResult>() { // from class: aed.3
            @Override // defpackage.avc
            public void a(MusicCollectDetailResult musicCollectDetailResult) {
                LogUtils.i("MusicAisuggest", "real open openMusicAlbum id = " + j);
                sp.a().a("/music/activity/singer_collect_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", musicCollectDetailResult.getData().getId()).withString("detail_LOGO", musicCollectDetailResult.getData().getLogo()).withString("detail_title", musicCollectDetailResult.getData().getName()).navigation();
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                ak.b(com.xiaopeng.musicradio.a.a, bj.b(i, str));
                LogUtils.i("MusicAisuggest", "real open openMusicAlbum failed id = " + j);
            }
        });
    }

    public void a(long j, boolean z) {
        LogUtils.i("MusicAisuggest", "playMusicAlbum id = " + j + " bCollect=" + z);
        if (b()) {
            return;
        }
        if (!apx.a().d()) {
            ak.b(com.xiaopeng.musicradio.a.a, com.xiaopeng.musicradio.a.a.getString(b.f.login_invalidate));
            apx.a().a(null);
            return;
        }
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_ALBUM);
        if (z) {
            listSignBean.setPrefix(ListSignBean.LISTSIGN_COLLECT);
        }
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_EXTRA_AISUGEST);
        String json = listSignBean.toJson();
        Log.i("MusicAisuggest", "playMusicInternal: " + json);
        final amq amqVar = new amq(json, 50);
        amw.a().c();
        ban.j(new Runnable() { // from class: aed.4
            @Override // java.lang.Runnable
            public void run() {
                apk.i().a(amqVar);
            }
        });
        bch.c(j);
    }

    private boolean b() {
        if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
            return false;
        }
        ak.b(com.xiaopeng.musicradio.a.a, bj.b(-1, null));
        return true;
    }
}
