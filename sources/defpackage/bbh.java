package defpackage;

import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.exoplayer2.ext.cornet.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.AudioParseInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.common.d;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.f;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.v;
import defpackage.age;
import defpackage.agg;
import defpackage.bbf;
import defpackage.bbr;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: UsbMusicModel.java */
/* renamed from: bbh  reason: default package */
/* loaded from: classes2.dex */
public class bbh implements bbr.a {
    private static HashMap<String, String> m = new HashMap<>();
    private Runnable A;
    private Runnable B;
    private int a;
    private Disposable b;
    private Runnable c;
    private Disposable d;
    private long e;
    private boolean f;
    private long g;
    private List<MusicInfo> h;
    private Map<String, MusicInfo> i;
    private Map<String, baz> j;
    private Map<String, bav> k;
    private Map<String, bay> l;
    private Map<String, bay> n;
    private bay o;
    private bbs p;
    private int q;
    private AtomicInteger r;
    private boolean s;
    private d.a t;
    private long u;
    private AtomicInteger v;
    private Collection<Runnable> w;
    private Pattern x;
    private Pattern y;
    private ExecutorService z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UsbMusicModel.java */
    /* renamed from: bbh$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final bbh a = new bbh();
    }

    public static bbh a() {
        return a.a;
    }

    private bbh() {
        this.a = 3;
        this.c = new Runnable() { // from class: bbh.1
            @Override // java.lang.Runnable
            public void run() {
                bbh.this.o();
            }
        };
        this.e = Long.MAX_VALUE;
        this.f = false;
        this.g = 0L;
        this.h = new CopyOnWriteArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ArrayMap();
        this.k = new ArrayMap();
        this.l = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.r = new AtomicInteger();
        this.t = new d.a() { // from class: bbh.2
            @Override // com.xiaopeng.musicradio.common.d.a
            public void a(boolean z) {
                Log.i("UsbMusicModel", "onAttached: " + z);
                if (z) {
                    return;
                }
                bbh.this.a(1);
            }

            @Override // com.xiaopeng.musicradio.common.d.a
            public void a(String str) {
                Log.i("UsbMusicModel", "onMounted: " + str);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (bbh.this.b != null) {
                    bbh.this.b.dispose();
                }
                bbh.this.b = Observable.timer(500L, TimeUnit.MILLISECONDS).subscribe(new Consumer<Long>() { // from class: bbh.2.1
                    @Override // io.reactivex.functions.Consumer
                    /* renamed from: a */
                    public void accept(Long l) {
                        bbh.this.m();
                    }
                });
            }

            @Override // com.xiaopeng.musicradio.common.d.a
            public void b(String str) {
                Log.i("UsbMusicModel", "onUnmounted: " + str);
                bbh.this.u();
                bbh.this.b(str);
            }

            @Override // com.xiaopeng.musicradio.common.d.a
            public void b() {
                bbh.this.u();
                bbh.this.l();
            }

            @Override // com.xiaopeng.musicradio.common.d.a
            public void a() {
                Log.i("UsbMusicModel", "onDetached: ");
                bbh.this.a(1);
                u.c(new agg.ae.a());
                if (!bbh.this.b()) {
                    bbh.this.a(3);
                } else {
                    ban.a(bbh.this.c, 10000L);
                }
            }
        };
        this.v = new AtomicInteger();
        this.w = new LinkedBlockingDeque();
        this.x = Pattern.compile(".+\\.(mp3|mp4|m4a|flac|wav|ogg|aac|mkv)", 2);
        this.y = Pattern.compile(".+\\..+", 2);
        this.z = new ThreadPoolExecutor(3, 5, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: bbh.3
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("UsbThread");
                return thread;
            }
        });
        this.A = new Runnable() { // from class: bbh.8
            @Override // java.lang.Runnable
            public void run() {
                if (bbh.this.s) {
                    return;
                }
                Log.i("UsbMusicModel", "mParseTimeoutRun: ====");
                bbh.this.s();
            }
        };
        this.B = new Runnable() { // from class: bbh.9
            @Override // java.lang.Runnable
            public void run() {
                bbh.this.r();
            }
        };
        Log.i("UsbMusicModel", "UsbMusicModel: 初始化");
        d.a().a(this.t);
        u.a(this);
        this.p = new bbs(10000);
        this.p.a(this);
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ak.a(com.xiaopeng.musicradio.a.a, com.xiaopeng.musicradio.a.a.getString(b.f.usb_unmountable));
        if (m.size() == 0) {
            this.a = 3;
            b(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        MusicInfo d;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (m.containsKey(str)) {
            m.remove(str);
        }
        if (m.size() > 0) {
            LogUtils.i("UsbMusicModel", "at least 1 mounted disk, callback refresh files");
            ban.b(this.c);
            o();
        } else {
            a(3, true);
        }
        if (aei.a().c() == 0 && ad.b(apk.i().x()) && (d = apk.i().d()) != null && d.getMusicFrom() == 61) {
            apk.i().stop();
        }
    }

    public boolean b() {
        int i = 0;
        for (StorageVolume storageVolume : ((StorageManager) com.xiaopeng.musicradio.a.a.getSystemService(StorageManager.class)).getStorageVolumes()) {
            if (storageVolume.isRemovable() && "mounted".equalsIgnoreCase(storageVolume.getState())) {
                i++;
            }
        }
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        List<StorageVolume> storageVolumes = ((StorageManager) com.xiaopeng.musicradio.a.a.getSystemService(StorageManager.class)).getStorageVolumes();
        m.clear();
        for (StorageVolume storageVolume : storageVolumes) {
            if (storageVolume.isRemovable() && "mounted".equalsIgnoreCase(storageVolume.getState())) {
                m.put(storageVolume.getUuid(), String.valueOf(aw.b(storageVolume, "mPath")));
            }
            LogUtils.d("UsbMusicModel", "uuid:" + storageVolume.getUuid() + ", isRemovable:" + storageVolume.isRemovable() + ", isemulated:" + storageVolume.isEmulated() + ", state:" + storageVolume.getState());
            LogUtils.d("UsbMusicModel", String.valueOf(aw.b(storageVolume, "mPath")));
        }
        if (m.size() > 0) {
            o();
        } else {
            a(3);
        }
    }

    public void c() {
        m.put("abcd", "/sdcard/Music");
        o();
    }

    private void n() {
        this.q = 0;
        this.r.set(0);
        this.n.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.s = false;
        this.o = null;
        ban.h(this.B);
        ban.h(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void o() {
        a(1);
        u();
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : m.entrySet()) {
            arrayList.add(entry.getValue());
        }
        n();
        long currentTimeMillis = System.currentTimeMillis();
        this.u = currentTimeMillis;
        Log.i("UsbMusicModel", "listCandidateMusics: " + currentTimeMillis);
        this.o = new bay();
        if (arrayList.size() > 1) {
            for (String str : arrayList) {
                bay bayVar = new bay();
                bayVar.a(str);
                this.o.a(bayVar);
                this.n.put(str, bayVar);
            }
        } else if (arrayList.size() == 1) {
            this.o.a((String) arrayList.get(0));
            this.n.put(arrayList.get(0), this.o);
        }
        for (String str2 : arrayList) {
            a(new File(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Log.i("UsbMusicModel", "finishFindAllFile: " + this.a);
        if (this.a != 3) {
            e(this.h);
            a(2);
            r();
        }
    }

    private void a(final File file) {
        this.v.incrementAndGet();
        Runnable runnable = new Runnable() { // from class: bbh.4
            @Override // java.lang.Runnable
            public void run() {
                bbh.this.b(file);
                bbh.this.w.remove(this);
                if (bbh.this.v.decrementAndGet() == 0) {
                    bbh.this.p();
                    Log.i("UsbMusicModel", "listCandidateMusics: count = " + bbh.this.r + " time = " + (System.currentTimeMillis() - bbh.this.u));
                }
            }
        };
        this.w.add(runnable);
        this.z.execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(File file) {
        bay bayVar = this.n.get(file.getAbsolutePath());
        if (bayVar == null) {
            bayVar = new bay();
            this.n.put(file.getPath(), bayVar);
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (this.x.matcher(name).matches()) {
                    this.r.incrementAndGet();
                    MusicInfo c = c(file2);
                    bayVar.a(c);
                    this.l.put(c.getHash(), bayVar);
                    final MusicInfo clone = c.clone();
                    this.i.put(c.getHash(), clone);
                    this.h.add(clone);
                    this.z.execute(new Runnable() { // from class: bbh.5
                        @Override // java.lang.Runnable
                        public void run() {
                            bbh.this.p.a(clone);
                        }
                    });
                    Log.i("UsbMusicModel", "accept: file path = " + file2.getAbsolutePath());
                } else if (!this.y.matcher(name).matches() && file2.isDirectory()) {
                    bay bayVar2 = new bay();
                    bayVar2.a(file2.getAbsolutePath());
                    bayVar.a(bayVar2);
                    Log.i("UsbMusicModel", "accept: fold path = " + file2.getAbsolutePath());
                    this.n.put(file2.getAbsolutePath(), bayVar2);
                    a(file2);
                } else {
                    Log.i("UsbMusicModel", "not findAllFoldAndMusicFile: " + file2.getAbsolutePath());
                }
            }
        }
        e(bayVar.a());
        f(bayVar.b());
    }

    private void e(List<MusicInfo> list) {
        Collections.sort(list, new Comparator<MusicInfo>() { // from class: bbh.6
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(MusicInfo musicInfo, MusicInfo musicInfo2) {
                if (musicInfo.getSong() == null) {
                    return musicInfo2.getSong() == null ? 0 : -1;
                } else if (musicInfo2.getSong() == null) {
                    return 1;
                } else {
                    return musicInfo.getSong().compareTo(musicInfo2.getSong());
                }
            }
        });
    }

    private void f(List<bay> list) {
        Collections.sort(list, new Comparator<bay>() { // from class: bbh.7
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(bay bayVar, bay bayVar2) {
                if (bayVar.c() == null) {
                    return -1;
                }
                if (bayVar2.c() == null) {
                    return 1;
                }
                return v.b(bayVar.c()).compareTo(v.b(bayVar2.c()));
            }
        });
    }

    @Override // defpackage.bbr.a
    public void a(MusicInfo musicInfo, AudioParseInfo audioParseInfo) {
        Log.i("UsbMusicModel", "onSuccess: " + audioParseInfo);
        if (!audioParseInfo.isAudio()) {
            c(musicInfo);
            q();
            return;
        }
        MusicInfo musicInfo2 = this.i.get(musicInfo.getHash());
        if (musicInfo2 != null) {
            musicInfo = musicInfo2;
        }
        if (!TextUtils.isEmpty(audioParseInfo.getSong())) {
            musicInfo.setSong(audioParseInfo.getSong());
        } else {
            musicInfo.setSongId("parse_no_song");
        }
        if (!TextUtils.isEmpty(audioParseInfo.getSinger())) {
            musicInfo.setSinger(audioParseInfo.getSinger());
        }
        musicInfo.setAlbumName(TextUtils.isEmpty(audioParseInfo.getAlbumTitle()) ? "" : audioParseInfo.getAlbumTitle());
        musicInfo.setHasParse(true);
        musicInfo.setLogo(audioParseInfo.getLogo());
        Log.i("UsbMusicModel", "onSuccess updateSongLogo: name = " + musicInfo.getSong() + " logo = " + audioParseInfo.getLogo());
        a(musicInfo);
        if (!TextUtils.isEmpty(audioParseInfo.getSong()) || !TextUtils.isEmpty(audioParseInfo.getSinger()) || !TextUtils.isEmpty(audioParseInfo.getAlbumTitle())) {
            u.c(new bbf.b(audioParseInfo.getId()));
        }
        b(musicInfo);
        q();
    }

    private void a(MusicInfo musicInfo) {
        bay bayVar = this.l.get(musicInfo.getHash());
        if (bayVar != null) {
            MusicInfo c = bayVar.c(musicInfo);
            c.setLogo(musicInfo.getLogo());
            c.setSinger(musicInfo.getSinger());
            c.setHasParse(true);
        }
    }

    private void b(MusicInfo musicInfo) {
        MusicInfo d = apk.i().d();
        if (aei.a().c() == 0 && d != null && TextUtils.equals(d.getHash(), musicInfo.getHash())) {
            Log.i("UsbMusicModel", "refreshCurrentPlay: infologo:" + musicInfo.getLogo() + "playingInfolgo:" + d.getLogo());
            u.c(new age.c(0));
            d.setLogo(musicInfo.getLogo());
            z();
        }
    }

    private void c(MusicInfo musicInfo) {
        Log.i("UsbMusicModel", "removeNoAudio: " + musicInfo);
        boolean remove = this.h.remove(musicInfo);
        bay bayVar = this.l.get(musicInfo.getHash());
        if (bayVar != null) {
            bayVar.b(musicInfo);
            this.l.remove(musicInfo.getHash());
        }
        if (remove) {
            u.c(new bbf.a(musicInfo.getHash()));
        }
    }

    public void a(List<MusicInfo> list) {
        this.p.a(list);
    }

    public void b(List<baw> list) {
        ArrayList arrayList = new ArrayList();
        for (baw bawVar : list) {
            if (this.i.containsKey(bawVar.a())) {
                MusicInfo musicInfo = this.i.get(bawVar.a());
                Log.i("UsbMusicModel", "updateSongLogo: name = " + musicInfo.getSong() + " songId = " + musicInfo.getSongId() + " logo = " + bawVar.b());
                if (!"parse_no_song".equals(musicInfo.getSongId())) {
                    musicInfo.setLogo(bawVar.b());
                    arrayList.add(musicInfo);
                    a(musicInfo);
                    d(musicInfo);
                }
            }
        }
        this.p.b(list);
        u.c(new agg.ad(arrayList));
    }

    private void d(MusicInfo musicInfo) {
        MusicInfo d = apk.i().d();
        if (aei.a().c() == 0) {
            Log.i("UsbMusicModel", "updateCurrentPlayLogo: " + musicInfo.getHash() + " infologo:" + musicInfo.getLogo() + "playingInfologo:" + d.getLogo() + " playing = " + d);
            if (d == null || !TextUtils.equals(d.getHash(), musicInfo.getHash())) {
                return;
            }
            d.setLogo(musicInfo.getLogo());
            u.c(new age.c(0));
        }
    }

    public void c(List<baw> list) {
        ArrayList arrayList = new ArrayList();
        for (baw bawVar : list) {
            if (this.j.containsKey(bawVar.a())) {
                baz bazVar = this.j.get(bawVar.a());
                bazVar.a(bawVar.b());
                arrayList.add(bazVar);
            }
        }
        u.c(new bbf.e(arrayList));
    }

    public void d(List<baw> list) {
        ArrayList arrayList = new ArrayList();
        for (baw bawVar : list) {
            if (this.k.containsKey(bawVar.a())) {
                bav bavVar = this.k.get(bawVar.a());
                bavVar.a(bawVar.b());
                arrayList.add(bavVar);
            }
        }
        u.c(new bbf.d(arrayList));
    }

    @Override // defpackage.bbr.a
    public void b(MusicInfo musicInfo, AudioParseInfo audioParseInfo) {
        Log.i("UsbMusicModel", "onFail: " + musicInfo);
        if (audioParseInfo != null && !audioParseInfo.isAudio()) {
            c(musicInfo);
        }
        q();
    }

    private void q() {
        this.q++;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Log.i("UsbMusicModel", "checkParseState mParseCount : " + this.q + " mUsbFileCount = " + this.r);
        if (u.a()) {
            ban.h(this.A);
            if (!this.s && this.q >= this.r.get() && this.a == 2) {
                Log.i("UsbMusicModel", "checkParseState finish : " + (System.currentTimeMillis() - this.u));
                s();
                return;
            }
            ban.b(this.A, 15000L);
            return;
        }
        ban.g(this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        Log.i("UsbMusicModel", "finishParseAll: =====");
        t();
        this.s = true;
        u.c(new bbf.c());
    }

    public boolean d() {
        return this.s;
    }

    private void t() {
        for (MusicInfo musicInfo : this.h) {
            e(musicInfo);
            f(musicInfo);
        }
    }

    private synchronized void e(MusicInfo musicInfo) {
        String a2 = be.a(a.d.music_unknow_singer);
        if (!TextUtils.isEmpty(musicInfo.getSinger())) {
            a2 = musicInfo.getSinger();
        }
        baz bazVar = this.j.get(a2);
        if (bazVar == null) {
            bazVar = new baz();
            this.j.put(a2, bazVar);
        }
        Log.i("UsbMusicModel", "handlerSingerList: " + a2 + " info = " + musicInfo);
        bazVar.b(a2);
        bazVar.a(musicInfo);
    }

    private synchronized void f(MusicInfo musicInfo) {
        String a2 = be.a(a.d.radio_unknown_album);
        if (!TextUtils.isEmpty(musicInfo.getAlbumName())) {
            a2 = musicInfo.getAlbumName();
        }
        bav bavVar = this.k.get(a2);
        if (bavVar == null) {
            bavVar = new bav();
            this.k.put(a2, bavVar);
        }
        Log.i("UsbMusicModel", "handlerAlbumList: " + a2 + " info = " + musicInfo);
        bavVar.b(a2);
        bavVar.a(musicInfo);
    }

    private MusicInfo c(File file) {
        String a2 = be.a(a.d.music_unknow_singer);
        long currentTimeMillis = System.currentTimeMillis();
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setHash(ListSignBean.LOCAL_USB_PREFIX + bbq.a(file));
        Log.i("UsbMusicModel", "genMusicInfo: md5 time = " + (System.currentTimeMillis() - currentTimeMillis));
        musicInfo.setSong(v.b(file.getAbsolutePath()));
        musicInfo.setData(file.getAbsolutePath());
        musicInfo.setMusicFrom(61);
        musicInfo.setArtistId(-1234L);
        musicInfo.setSinger(a2);
        return musicInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        Disposable disposable = this.d;
        if (disposable != null && !disposable.isDisposed()) {
            this.d.dispose();
        }
        for (Runnable runnable : this.w) {
            ban.h(runnable);
        }
        this.w.clear();
    }

    public int e() {
        return this.a;
    }

    public List<MusicInfo> f() {
        return this.h;
    }

    public bay g() {
        return this.o;
    }

    public Map<String, baz> h() {
        return this.j;
    }

    public Map<String, bav> i() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        a(i, false);
    }

    private void a(int i, boolean z) {
        LogUtils.i("UsbMusicModel", "updateState:" + i, new Throwable());
        boolean z2 = this.a != 3 && i == 3;
        this.a = i;
        b(i);
        if (i == 1 || i == 2 || i != 3) {
            return;
        }
        if (ad.b(apk.i().x())) {
            u.f(new agg.ab(com.xiaopeng.musicradio.a.a.getString(a.d.usb_unmounted_hint)));
        }
        u();
        if (z && ad.b(apk.i().x()) && System.currentTimeMillis() - this.g > 10000 && z2) {
            ak.a(com.xiaopeng.musicradio.a.a, a.d.usb_unmounted_hint);
            this.g = System.currentTimeMillis();
        }
        v();
        w();
    }

    private void v() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (MusicInfo musicInfo : this.h) {
            if (i < 999) {
                i++;
                arrayList.add(musicInfo.getHash());
            }
        }
        bbj.a().a(10000, arrayList);
    }

    private void w() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (String str : this.k.keySet()) {
            if (i2 < 999) {
                i2++;
                arrayList.add(str);
            }
        }
        for (String str2 : this.j.keySet()) {
            if (i < 999) {
                i++;
                arrayList.add(str2);
            }
        }
        bbi.a().a(10000, arrayList);
    }

    private void b(int i) {
        if (i == 2) {
            u.c(new agg.ae.c());
            x();
        } else if (i == 1) {
            u.c(new agg.ae.d());
        } else if (i == 3) {
            u.c(new agg.ae.e());
        }
    }

    private void x() {
        if (this.f) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
            LogUtils.i("UsbMusicModel", "rebootPlayIfNeed:" + elapsedRealtime);
            if (elapsedRealtime > 0 && elapsedRealtime <= TimeUnit.MINUTES.toMillis(2L) && !f.c() && y()) {
                apk.i().play();
            }
            this.e = Long.MAX_VALUE;
            this.f = false;
        }
    }

    private boolean y() {
        try {
            MusicInfo d = apk.i().d();
            if (d != null && !be.a((CharSequence) d.getData())) {
                File file = new File(d.getData());
                if (file.exists()) {
                    return file.canRead();
                }
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int j() {
        if (b()) {
            return this.h.size() > 0 ? 3 : 2;
        }
        return 1;
    }

    public void k() {
        LogUtils.i("UsbMusicModel", "addRebootPlayTask");
        this.f = true;
        this.e = System.currentTimeMillis();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        if (lVar.b() == 0) {
            MusicInfo d = apk.i().d();
            if (d != null) {
                if (d.getMusicFrom() == 61) {
                    if (lVar.a() == 2) {
                        this.f = false;
                        return;
                    }
                    return;
                } else if (lVar.a() != -1) {
                    this.f = false;
                    return;
                } else {
                    return;
                }
            }
            this.f = false;
            return;
        }
        this.f = false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onInfoChanged(age.c cVar) {
        if (aei.a().c() == 0 && ad.b(apk.i().x())) {
            z();
        }
    }

    private void z() {
        MusicInfo d = apk.i().d();
        if (d != null) {
            if (d.isHasParse()) {
                Log.i("UsbMusicModel", "updateCurrentPlayInfo1: logo:" + d.getLogo() + "songId" + d.getSongId() + "info:" + d);
                bbm.a().d((bbm) d);
                return;
            }
            Log.i("UsbMusicModel", "updateCurrentPlayInfo2: logo:" + d.getLogo() + "songId" + d.getSongId() + "info:" + d);
            this.p.b(d);
        }
    }

    public bay a(String str) {
        if (this.n.containsKey(str)) {
            return this.n.get(str);
        }
        return null;
    }
}
