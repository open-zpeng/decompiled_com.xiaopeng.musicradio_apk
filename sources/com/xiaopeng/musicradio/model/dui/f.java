package com.xiaopeng.musicradio.model.dui;

import android.util.Log;
import android.util.SparseArray;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.ThreadUtils;
import com.xiaopeng.musicradio.utils.am;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.protocol.node.music.bean.CollectHistoryMusic;
import com.xiaopeng.speech.protocol.node.music.bean.SearchMusic;
import defpackage.afw;
import io.reactivex.disposables.CompositeDisposable;
/* compiled from: DuiMusicModel.java */
/* loaded from: classes.dex */
public class f extends bgo implements com.xiaopeng.speech.protocol.node.music.a {
    private CompositeDisposable b = new CompositeDisposable();
    private SparseArray<a> c = new SparseArray<>();

    /* compiled from: DuiMusicModel.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(float f);

        void a(String str, CompositeDisposable compositeDisposable);

        void b();

        void b(String str, CompositeDisposable compositeDisposable);

        void c();

        void c(String str, CompositeDisposable compositeDisposable);

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();

        void j();

        void k();
    }

    /* compiled from: DuiMusicModel.java */
    /* loaded from: classes.dex */
    private static class b {
        static final f a = new f();
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void a(String str, SearchMusic searchMusic) {
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void l() {
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void m() {
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void n() {
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void o() {
    }

    public f() {
        LogUtils.i("DuiMusicModel init");
        g.a();
        h.a();
        agr.a().b();
    }

    public static f a() {
        return b.a;
    }

    public void a(int i, a aVar) {
        this.c.put(i, aVar);
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void b() {
        LogUtils.i("DuiMusicModel", "onPlay");
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.1
            @Override // java.lang.Runnable
            public void run() {
                if (i.a(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a();
                    }
                }, "onPlay")) {
                    a();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a() {
                if (aei.a().c() != 0) {
                    if (f.this.c.get(0) != null) {
                        ((a) f.this.c.get(0)).a();
                        return;
                    }
                    return;
                }
                aej c = aeh.a().c();
                if (c == null) {
                    if (f.this.c.get(0) != null) {
                        ((a) f.this.c.get(0)).a();
                        return;
                    }
                    return;
                }
                amw.a().c();
                c.a();
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void c() {
        LogUtils.i("DuiMusicModel", "onPause");
        w();
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void d() {
        LogUtils.i("DuiMusicModel", "onResume");
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.12
            @Override // java.lang.Runnable
            public void run() {
                aej c = aeh.a().c();
                if (c != null) {
                    amw.a().c();
                    c.a();
                    return;
                }
                aei.a().c(0).play();
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void e() {
        LogUtils.i("DuiMusicModel", "onStop");
        w();
    }

    private void w() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.16
            @Override // java.lang.Runnable
            public void run() {
                aej c = aeh.a().c();
                if (c != null) {
                    c.b();
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void f() {
        LogUtils.i("DuiMusicModel", "onPrev");
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.17
            @Override // java.lang.Runnable
            public void run() {
                aej c = aeh.a().c();
                if (c != null) {
                    if (c.e()) {
                        amw.a().c();
                    }
                    c.c();
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void g() {
        LogUtils.i("DuiMusicModel", "onNext");
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.18
            @Override // java.lang.Runnable
            public void run() {
                aej c = aeh.a().c();
                if (c != null) {
                    if (c.e()) {
                        amw.a().c();
                    }
                    c.d();
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void a(String str) {
        final int i;
        LogUtils.i("DuiMusicModel", "onSetPlayMode= " + str);
        if (y()) {
            if ("single".equals(str)) {
                i = 3;
            } else {
                i = "random".equals(str) ? 4 : 2;
            }
            int c = aei.a().c();
            if (c == 0) {
                ThreadUtils.postMainThread(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.19
                    @Override // java.lang.Runnable
                    public void run() {
                        aei.a().c(0).a(i);
                    }
                });
            } else if (c == 3) {
                ThreadUtils.postMainThread(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.20
                    @Override // java.lang.Runnable
                    public void run() {
                        aei.a().c(3).a(i);
                    }
                });
            }
        }
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void h() {
        Log.i("DuiMusicModel", "onControlCollect === ");
        x();
    }

    private void x() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.21
            @Override // java.lang.Runnable
            public void run() {
                if (aei.a().c() == 0 || aei.a().c() == 2) {
                    ((a) f.this.c.get(0)).e();
                } else if (aei.a().c() == 3) {
                    ((a) f.this.c.get(3)).e();
                } else if (aei.a().c() == 4) {
                    u.c(new afw.a());
                } else if (aei.a().c() == 6) {
                    ((a) f.this.c.get(6)).e();
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void i() {
        Log.i("DuiMusicModel", "onDelCollect === ");
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.22
            @Override // java.lang.Runnable
            public void run() {
                if (aei.a().c() == 0 || aei.a().c() == 2) {
                    ((a) f.this.c.get(0)).f();
                } else if (aei.a().c() == 3) {
                    ((a) f.this.c.get(3)).f();
                } else if (aei.a().c() == 4) {
                    u.c(new afw.b());
                } else if (aei.a().c() == 6) {
                    ((a) f.this.c.get(6)).f();
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void j() {
        LogUtils.i("DuiMusicModel", "onPlayBluetooth");
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.2
            @Override // java.lang.Runnable
            public void run() {
                ((a) f.this.c.get(0)).d();
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void b(String str) {
        bgp.a(str, y());
    }

    private boolean y() {
        return aei.a().d() == 0;
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void c(String str) {
        Log.i("DuiMusicModel", "onAudioBookPlay: " + str);
        this.c.get(3).a(str, this.b);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:2|3)|(2:5|(5:7|8|9|(1:11)|(2:13|14)(2:16|17)))|22|8|9|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        r1.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @Override // com.xiaopeng.speech.protocol.node.music.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "DuiMusicModel"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onMusicListPlay: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L42
            r1.<init>(r6)     // Catch: java.lang.Exception -> L42
            java.lang.String r2 = "version"
            boolean r2 = r1.has(r2)     // Catch: java.lang.Exception -> L42
            r3 = 1
            if (r2 == 0) goto L35
            java.lang.String r2 = "V2"
            java.lang.String r4 = "version"
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Exception -> L42
            boolean r2 = r2.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L42
            if (r2 == 0) goto L35
            r2 = r3
            goto L36
        L35:
            r2 = r0
        L36:
            java.lang.String r4 = "complexSearchRespV2"
            boolean r1 = r1.has(r4)     // Catch: java.lang.Exception -> L40
            if (r1 == 0) goto L47
            r2 = r3
            goto L47
        L40:
            r1 = move-exception
            goto L44
        L42:
            r1 = move-exception
            r2 = r0
        L44:
            r1.printStackTrace()
        L47:
            if (r2 == 0) goto L57
            android.util.SparseArray<com.xiaopeng.musicradio.model.dui.f$a> r1 = r5.c
            java.lang.Object r0 = r1.get(r0)
            com.xiaopeng.musicradio.model.dui.f$a r0 = (com.xiaopeng.musicradio.model.dui.f.a) r0
            io.reactivex.disposables.CompositeDisposable r1 = r5.b
            r0.c(r6, r1)
            goto L64
        L57:
            android.util.SparseArray<com.xiaopeng.musicradio.model.dui.f$a> r1 = r5.c
            java.lang.Object r0 = r1.get(r0)
            com.xiaopeng.musicradio.model.dui.f$a r0 = (com.xiaopeng.musicradio.model.dui.f.a) r0
            io.reactivex.disposables.CompositeDisposable r1 = r5.b
            r0.b(r6, r1)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.model.dui.f.d(java.lang.String):void");
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void e(String str) {
        Log.i("DuiMusicModel", "onTwelveNovelPlay() called with: musicBean = [" + str + "]");
        am.a();
        c(str);
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void k() {
        Log.i("DuiMusicModel", "onAudioBookSubscribe === ");
        x();
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void a(CollectHistoryMusic collectHistoryMusic) {
        int type = collectHistoryMusic.getType();
        Log.i("DuiMusicModel", "onPlayCollect: " + type);
        if (type != 4) {
            switch (type) {
                case 0:
                    i.a(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ((a) f.this.c.get(0)).b();
                        }
                    }, "onPlayCollect");
                    return;
                case 1:
                    this.c.get(0).c();
                    return;
                case 2:
                    this.c.get(3).c();
                    return;
                default:
                    return;
            }
        }
        this.c.get(6).c();
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void b(final CollectHistoryMusic collectHistoryMusic) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.4
            @Override // java.lang.Runnable
            public void run() {
                switch (collectHistoryMusic.getType()) {
                    case 0:
                        ((a) f.this.c.get(0)).a();
                        return;
                    case 1:
                        ((a) f.this.c.get(0)).b();
                        return;
                    case 2:
                        ((a) f.this.c.get(3)).b();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void p() {
        this.c.get(0).g();
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void q() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.5
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void a(final int i) {
        Log.i("DuiMusicModel", "onMusicForward: " + i);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.6
            @Override // java.lang.Runnable
            public void run() {
                aek e;
                Log.i("DuiMusicModel", "run: onMusicForward =======");
                int c = aei.a().c();
                if ((c == 0 || c == 3 || c == 7) && (e = aei.a().e()) != null) {
                    int min = Math.min(e.getPosition() + i, e.getDuration());
                    Log.i("DuiMusicModel", "onMusicForward: " + min);
                    e.seekTo(min);
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void b(final int i) {
        Log.i("DuiMusicModel", "onMusicBackward: " + i);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.7
            @Override // java.lang.Runnable
            public void run() {
                aek e;
                Log.i("DuiMusicModel", "run: =============");
                int c = aei.a().c();
                if ((c == 0 || c == 3 || c == 7) && (e = aei.a().e()) != null) {
                    int max = Math.max(e.getPosition() - i, 0);
                    Log.i("DuiMusicModel", "onMusicBackward: " + max);
                    e.seekTo(max);
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void c(final int i) {
        Log.i("DuiMusicModel", "onMusicSettime: " + i);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.8
            @Override // java.lang.Runnable
            public void run() {
                aek e;
                Log.i("DuiMusicModel", "run: onMusicSettime =====");
                int c = aei.a().c();
                if ((c == 0 || c == 3 || c == 7) && (e = aei.a().e()) != null) {
                    int min = Math.min(e.getDuration(), Math.max(i, 0));
                    Log.i("DuiMusicModel", "onMusicSettime: " + min);
                    e.seekTo(min);
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void r() {
        Log.i("DuiMusicModel", "onMusicSpeedUp: ");
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.9
            @Override // java.lang.Runnable
            public void run() {
                Log.i("DuiMusicModel", "run: onMusicSpeedUp");
                int c = aei.a().c();
                if (c == 3 || c == 7) {
                    ((a) f.this.c.get(c)).h();
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void s() {
        Log.i("DuiMusicModel", "onMusicSpeedDown: ");
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.10
            @Override // java.lang.Runnable
            public void run() {
                Log.i("DuiMusicModel", "run: onMusicSpeedDown");
                int c = aei.a().c();
                if (c == 3 || c == 7) {
                    ((a) f.this.c.get(c)).i();
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void a(final float f) {
        Log.i("DuiMusicModel", "onMusicSpeedSet: " + f);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.11
            @Override // java.lang.Runnable
            public void run() {
                Log.i("DuiMusicModel", "run: onMusicSpeedSet");
                int c = aei.a().c();
                if (c == 3 || c == 7) {
                    ((a) f.this.c.get(c)).a(f);
                }
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void t() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.13
            @Override // java.lang.Runnable
            public void run() {
                Log.i("DuiMusicModel", "run: onMusicSettime =====");
                ((a) f.this.c.get(3)).j();
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void u() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.14
            @Override // java.lang.Runnable
            public void run() {
                Log.i("DuiMusicModel", "run: onMusicSettime =====");
                ((a) f.this.c.get(0)).k();
            }
        });
    }

    @Override // com.xiaopeng.speech.protocol.node.music.a
    public void v() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.f.15
            @Override // java.lang.Runnable
            public void run() {
                bas basVar = (bas) com.xiaopeng.musicradio.service.c.a().b(bas.class);
                if (basVar != null) {
                    basVar.playUsbMusic();
                }
            }
        });
    }
}
