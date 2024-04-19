package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.ListDetailBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.utils.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: LocalLoveManager.java */
/* renamed from: apb  reason: default package */
/* loaded from: classes2.dex */
public class apb implements aqb {
    private ConcurrentHashMap<String, Long> a = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Call> b = new ConcurrentHashMap<>();
    private LinkedList<String> c = new LinkedList<>();
    private Handler d = new Handler(Looper.getMainLooper()) { // from class: apb.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 100) {
                apb.this.b();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalLoveManager.java */
    /* renamed from: apb$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final apb a = new apb();
    }

    @Override // defpackage.aqb
    public void d() {
    }

    public static apb a() {
        return a.a;
    }

    public apb() {
        aqe.b().a(this);
    }

    @Override // defpackage.aqb
    public void c() {
        Log.i("LocalLoveManager", "clearUserData: ==========");
        this.a.clear();
        synchronized (this.c) {
            this.c.clear();
            this.d.removeMessages(100);
        }
        if (!this.b.isEmpty()) {
            for (Map.Entry<String, Call> entry : this.b.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().cancel();
                }
            }
            this.b.clear();
        }
        ans.a().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a())) {
            LogUtils.i("LocalLoveManager", "fetchQueue:network not available");
            return;
        }
        final LinkedList linkedList = new LinkedList();
        synchronized (this.c) {
            for (int i = 0; !this.c.isEmpty() && i < 50; i++) {
                linkedList.add(this.c.pollFirst());
            }
            if (!this.c.isEmpty()) {
                this.d.sendEmptyMessageDelayed(100, 1000L);
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        final String a2 = a((LinkedList<String>) linkedList);
        this.b.put(a2, ath.a().b(a2, new avc<ListDetailBean>() { // from class: apb.2
            @Override // defpackage.avc
            public void a(ListDetailBean listDetailBean) {
                apb.this.b.remove(a2);
                List<MusicSongBean> data = listDetailBean.getData();
                if (data == null) {
                    return;
                }
                LinkedList linkedList2 = new LinkedList();
                for (MusicSongBean musicSongBean : data) {
                    linkedList2.add(ab.a(musicSongBean, 10, MusicInfo.TAG_MUSIC.get(10)));
                }
                apb.a((List<MusicInfo>) linkedList2);
                ans.a().a(linkedList2);
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                apb.this.b.remove(a2);
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    apb.this.a.remove((String) it.next());
                }
            }
        }));
    }

    public static void a(List<MusicInfo> list) {
        MusicInfo u = apk.i().u();
        if (u == null || list == null || list.isEmpty()) {
            return;
        }
        for (MusicInfo musicInfo : list) {
            if (Objects.equals(u.getHash(), musicInfo.getHash())) {
                u.setHot(musicInfo.isHot());
            }
        }
    }

    public static void a(MusicInfo musicInfo) {
        MusicInfo u = apk.i().u();
        if (u == null || musicInfo == null || !Objects.equals(u.getHash(), musicInfo.getHash())) {
            return;
        }
        u.setHot(musicInfo.isHot());
    }

    public static String a(LinkedList<String> linkedList) {
        StringBuilder sb = new StringBuilder();
        int size = linkedList.size() - 1;
        Iterator<String> it = linkedList.iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i < size) {
                sb.append(',');
            }
            i++;
        }
        return sb.toString();
    }

    public void b(MusicInfo musicInfo) {
        a(musicInfo, false);
    }

    public void a(final MusicInfo musicInfo, final boolean z) {
        if (musicInfo == null) {
            LogUtils.e("LocalLoveManager", "updateMusicLove", new RuntimeException());
        } else {
            ban.d(new Runnable() { // from class: apb.3
                @Override // java.lang.Runnable
                public void run() {
                    if (z) {
                        apb.this.a.remove(musicInfo.getHash());
                    }
                    apb.this.d(musicInfo);
                }
            });
        }
    }

    public boolean c(MusicInfo musicInfo) {
        if (musicInfo == null) {
            return false;
        }
        MusicInfo a2 = anv.a().a(musicInfo.getHash(), false);
        if (a2 != null && a2.getMusicFrom() == 0 && a2.isAppend()) {
            return false;
        }
        if (ans.a().a(musicInfo)) {
            return true;
        }
        if (a2 == null || a2.getMusicFrom() != 0) {
            return anv.a().e(musicInfo);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MusicInfo musicInfo) {
        String removeLast;
        String hash = musicInfo.getHash();
        Long l = this.a.get(hash);
        long currentTimeMillis = System.currentTimeMillis();
        if (l == null || currentTimeMillis - l.longValue() > 300000) {
            this.a.put(hash, Long.valueOf(currentTimeMillis));
            synchronized (this.c) {
                this.c.remove(hash);
                removeLast = this.c.size() >= 100 ? this.c.removeLast() : null;
                this.c.addFirst(hash);
            }
            if (removeLast != null) {
                this.a.remove(removeLast);
            }
            this.d.removeMessages(100);
            this.d.sendEmptyMessageDelayed(100, 1000L);
        }
    }

    public void b(MusicInfo musicInfo, boolean z) {
        if (musicInfo == null) {
            return;
        }
        if (z) {
            this.a.put(musicInfo.getHash(), Long.valueOf(System.currentTimeMillis()));
        }
        a(musicInfo);
        ans.a().b(musicInfo);
    }

    public void a(List<MusicInfo> list, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            for (MusicInfo musicInfo : list) {
                this.a.put(musicInfo.getHash(), Long.valueOf(currentTimeMillis));
            }
        }
        a(list);
        ans.a().a(list);
    }
}
