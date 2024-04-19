package com.xiaopeng.musicradio.model.bluetooth;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicMatchBean;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.v;
import defpackage.agd;
import defpackage.agg;
import defpackage.agq;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: XpMusicBluetoothModel.java */
/* loaded from: classes.dex */
public class l implements c {
    private f a;
    private Disposable b;
    private List<String> c;
    private List<String> d;
    private Handler e;
    private Runnable f;
    private Call<MusicMatchBean> g;

    @Override // com.xiaopeng.musicradio.model.bluetooth.c
    public void a() {
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.c
    public void b() {
        u.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XpMusicBluetoothModel.java */
    /* loaded from: classes.dex */
    public static class a {
        private static final l a = new l();
    }

    private l() {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new Handler();
        this.f = new Runnable() { // from class: com.xiaopeng.musicradio.model.bluetooth.l.1
            @Override // java.lang.Runnable
            public void run() {
                HashSet hashSet = new HashSet();
                for (String str : l.this.d) {
                    Iterator it = l.this.c.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (TextUtils.equals(str2, str)) {
                            LogUtils.d("XpMusicBluetoothModel", "remove match history: " + str2);
                            it.remove();
                            hashSet.add(str);
                        }
                    }
                }
                l.this.d.clear();
                u.c(new agg.f(hashSet));
            }
        };
        com.xiaopeng.musicradio.model.bluetooth.a.i().a(this);
        if (aei.a().c() == 2) {
            u.a(this);
        }
        this.a = new f();
    }

    public static l c() {
        return a.a;
    }

    public List<String> d() {
        return this.c;
    }

    public MusicInfo a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(str2) && this.a.a(str)) {
            f fVar = this.a;
            String[] b = fVar.b(str, fVar.b(str));
            if (b.length == 2) {
                str = b[0];
                str2 = b[1];
            }
        }
        MusicInfo d = d(str, str2);
        return d == null ? d(str2, str) : d;
    }

    private MusicInfo d(String str, String str2) {
        String str3 = com.xiaopeng.musicradio.model.bluetooth.a.i().j().get(c(str, str2));
        MusicInfo a2 = str3 != null ? anv.a().a(str3) : null;
        if (a2 == null) {
            MusicInfo b = anv.a().b(c(str, str2));
            return b == null ? anv.a().a(str, str2) : b;
        }
        return a2;
    }

    public void a(String str) {
        if (!this.d.contains(str)) {
            this.d.add(str);
        }
        this.e.removeCallbacks(this.f);
        this.e.postDelayed(this.f, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public void b(String str, String str2) {
        Disposable disposable = this.b;
        if (disposable != null) {
            disposable.dispose();
        }
        Call<MusicMatchBean> call = this.g;
        if (call != null && call.isExecuted()) {
            this.g.cancel();
        }
        Log.i("XpMusicBluetoothModel", "saveBlueHistory: ========== ");
        this.b = Observable.timer(1L, TimeUnit.SECONDS).subscribe(new AnonymousClass2(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: XpMusicBluetoothModel.java */
    /* renamed from: com.xiaopeng.musicradio.model.bluetooth.l$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Consumer<Long> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        AnonymousClass2(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: XpMusicBluetoothModel.java */
        /* renamed from: com.xiaopeng.musicradio.model.bluetooth.l$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                final MusicInfo a = l.this.a(AnonymousClass2.this.a, AnonymousClass2.this.b);
                if (a == null || TextUtils.isEmpty(a.getLrcData())) {
                    l.this.a(0, "");
                    Log.i("XpMusicBluetoothModel", "run: =============== " + AnonymousClass2.this.a + " login = " + apx.a().d());
                    if (apx.a().d()) {
                        l.this.g = aqz.a().a(AnonymousClass2.this.b, AnonymousClass2.this.a, new avc<MusicMatchBean>() { // from class: com.xiaopeng.musicradio.model.bluetooth.l.2.1.1
                            @Override // defpackage.avc
                            public void a(final MusicMatchBean musicMatchBean) {
                                String song = com.xiaopeng.musicradio.model.bluetooth.a.i().d().getSong();
                                String singer = com.xiaopeng.musicradio.model.bluetooth.a.i().d().getSinger();
                                int duration = com.xiaopeng.musicradio.model.bluetooth.a.i().d().getDuration();
                                if (!l.this.f() || TextUtils.isEmpty(song) || TextUtils.isEmpty(singer) || song.contains(com.xiaopeng.musicradio.model.bluetooth.a.a) || song.contains(com.xiaopeng.musicradio.model.bluetooth.a.b) || duration <= 0 || com.xiaopeng.musicradio.model.bluetooth.a.b.equals(singer) || !AnonymousClass2.this.a.equals(song) || !AnonymousClass2.this.b.equals(singer)) {
                                    return;
                                }
                                Log.i("XpMusicBluetoothModel", "response: ======== ");
                                MusicInfo c = ab.c(musicMatchBean.getData());
                                MusicInfo musicInfo = a;
                                if (musicInfo == null) {
                                    c.setSearchSongText(l.this.c(AnonymousClass2.this.a, AnonymousClass2.this.b));
                                    boolean contains = l.this.c.contains(c.getHash());
                                    if (!contains) {
                                        l.this.c.add(c.getHash());
                                        com.xiaopeng.musicradio.model.bluetooth.a.i().j().put(l.this.c(AnonymousClass2.this.a, AnonymousClass2.this.b), c.getHash());
                                    }
                                    LogUtils.i("XpMusicBluetoothModel", "try2SaveUser : hash = " + c.getHash() + ", from = " + c.getMusicFrom() + ", isInMatchHistory=" + contains);
                                    anc.a().e(c);
                                } else {
                                    musicInfo.setLrcData(c.getLrcData());
                                    LogUtils.i("XpMusicBluetoothModel", "saveBlueHistory : hash = %s, from = %d, lrc = %s", a.getHash(), Integer.valueOf(a.getMusicFrom()), c.getLrcData());
                                    anv.a().b(a.clone());
                                }
                                v.a("/mnt/sdcard/xiaopengmusic/lrc", musicMatchBean.getData().getHash(), musicMatchBean.getData().getLyricContent());
                                l.this.a(1, musicMatchBean.getData().getLyricContent());
                                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.bluetooth.l.2.1.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (com.xiaopeng.musicradio.model.bluetooth.a.i().d() == null || AnonymousClass2.this.b == null || AnonymousClass2.this.a == null || !AnonymousClass2.this.b.equalsIgnoreCase(com.xiaopeng.musicradio.model.bluetooth.a.i().d().getSinger()) || !AnonymousClass2.this.a.equalsIgnoreCase(com.xiaopeng.musicradio.model.bluetooth.a.i().d().getSong())) {
                                            return;
                                        }
                                        l.this.b(musicMatchBean.getData().getAlbum().getLogo());
                                    }
                                });
                                u.c(new agq.a());
                            }

                            @Override // defpackage.avc
                            public void a(int i, String str) {
                                LogUtils.i("XpMusicBluetoothModel", "error: " + i + " msg=" + str);
                                l.this.a(2, (String) null);
                            }
                        });
                        return;
                    }
                    return;
                }
                com.xiaopeng.musicradio.model.bluetooth.a.i().j().put(l.this.c(AnonymousClass2.this.a, AnonymousClass2.this.b), a.getHash());
                a.setSearchSongText(l.this.c(AnonymousClass2.this.a, AnonymousClass2.this.b));
                a.setOldMusicFrom(20);
                LogUtils.i("XpMusicBluetoothModel", "match run: hash = %s, musicFrom = %d", a.getHash(), Integer.valueOf(a.getMusicFrom()));
                anv.a().a(a.clone());
                a.setPlayTime(System.currentTimeMillis());
                a.setPlayCount(a.getPlayCount() + 1);
                com.xiaopeng.musicradio.model.bluetooth.a.i().d().setLogo(a.getLogo());
                if (TextUtils.isEmpty(a.getLrcData())) {
                    l.this.a(2, "");
                } else {
                    l.this.a(1, a.getLrcData());
                }
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.bluetooth.l.2.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        u.c(new agq.i(a));
                        apk.i().o().g(a);
                    }
                });
            }
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Long l) {
            ban.d(new AnonymousClass1());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSaveBtPlayingInfo(agd.h hVar) {
        e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onKugouBinded(agq.g gVar) {
        e();
    }

    public void a(int i, String str) {
        Log.i("XpMusicBluetoothModel", "onLrcLoadStateChanged() called with: state = [" + i + "]");
        switch (i) {
            case 0:
                com.xiaopeng.musicradio.model.bluetooth.a.i().d().setLrcContent(null);
                break;
            case 1:
                com.xiaopeng.musicradio.model.bluetooth.a.i().d().setLrcContent(str);
                break;
            case 2:
                com.xiaopeng.musicradio.model.bluetooth.a.i().d().setLrcContent("");
                break;
        }
        com.xiaopeng.musicradio.model.bluetooth.a.i().s();
    }

    public void b(String str) {
        Log.i("XpMusicBluetoothModel", "onCoverLoaded() called with: url = [" + str + "]");
        com.xiaopeng.musicradio.model.bluetooth.a.i().d().setLogo(str);
        com.xiaopeng.musicradio.model.bluetooth.a.i().s();
    }

    private void e() {
        String song = com.xiaopeng.musicradio.model.bluetooth.a.i().d().getSong();
        String singer = com.xiaopeng.musicradio.model.bluetooth.a.i().d().getSinger();
        int duration = com.xiaopeng.musicradio.model.bluetooth.a.i().d().getDuration();
        if (f() && com.xiaopeng.musicradio.model.bluetooth.a.i().p() && song != null && !song.contains(com.xiaopeng.musicradio.model.bluetooth.a.a) && !song.contains(com.xiaopeng.musicradio.model.bluetooth.a.b) && duration > 0 && !com.xiaopeng.musicradio.model.bluetooth.a.b.equals(singer) && apx.a().d()) {
            b(song, singer);
        } else {
            a(2, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return aei.a().c() == 2;
    }

    public String c(String str, String str2) {
        return str + "_" + str2;
    }
}
