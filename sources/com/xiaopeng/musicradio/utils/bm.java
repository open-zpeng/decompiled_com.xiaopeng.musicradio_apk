package com.xiaopeng.musicradio.utils;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ax;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: XPMusicResourcePreloadUtil.java */
/* loaded from: classes2.dex */
public class bm extends ax {
    private List<SoftReference<View>> a;
    private List<SoftReference<View>> b;
    private List<SoftReference<View>> c;
    private List<SoftReference<View>> d;
    private List<SoftReference<View>> e;
    private List<SoftReference<View>> f;
    private List<SoftReference<View>> g;
    private List<SoftReference<View>> h;
    private List<SoftReference<View>> i;
    private List<SoftReference<View>> j;
    private List<SoftReference<View>> k;
    private List<SoftReference<View>> l;
    private List<SoftReference<View>> m;
    private com.xiaopeng.musicradio.commonui.base.e n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XPMusicResourcePreloadUtil.java */
    /* loaded from: classes2.dex */
    public static class a {
        static final bm a = new bm();
    }

    public static bm a() {
        return a.a;
    }

    private bm() {
        this.a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.g = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new com.xiaopeng.musicradio.commonui.base.e(com.xiaopeng.musicradio.a.a);
    }

    public com.xiaopeng.musicradio.commonui.base.e b() {
        return this.n;
    }

    public void c() {
        d();
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bm.1
            @Override // java.lang.Runnable
            public void run() {
                bm.this.e();
            }
        }, 1000L);
    }

    private void d() {
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bm.2
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                FrameLayout frameLayout = new FrameLayout(bm.this.n);
                if (bm.this.a.size() == 0) {
                    arrayList.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_selection_top, (ViewGroup) frameLayout, false)));
                }
                if (bm.this.b.size() == 0) {
                    arrayList2.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_rm_title_layout, (ViewGroup) frameLayout, false)));
                }
                if (bm.this.h.size() == 0) {
                    for (int i = 0; i < 12; i++) {
                        arrayList3.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_rm_item_layout, (ViewGroup) frameLayout, false)));
                    }
                }
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bm.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bm.this.a.addAll(arrayList);
                        bm.this.b.addAll(arrayList2);
                        bm.this.h.addAll(arrayList3);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bm.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList;
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                final ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                final ArrayList arrayList9 = new ArrayList();
                final ArrayList arrayList10 = new ArrayList();
                final ArrayList arrayList11 = new ArrayList();
                FrameLayout frameLayout = new FrameLayout(bm.this.n);
                if (bm.this.c.size() == 0) {
                    arrayList2.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_xp_play_title_layout, (ViewGroup) frameLayout, false)));
                }
                if (bm.this.d.size() == 0) {
                    arrayList3.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_rank_title_layout, (ViewGroup) frameLayout, false)));
                }
                if (bm.this.e.size() == 0) {
                    arrayList4.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_singer_title_layout, (ViewGroup) frameLayout, false)));
                }
                if (bm.this.f.size() == 0) {
                    arrayList5.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_zone_title_layout, (ViewGroup) frameLayout, false)));
                }
                if (bm.this.g.size() == 0) {
                    arrayList6.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_radio_layout, (ViewGroup) frameLayout, false)));
                }
                if (bm.this.i.size() == 0) {
                    int i = 0;
                    while (i < 1) {
                        arrayList7.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_rm_item_layout, (ViewGroup) frameLayout, false)));
                        i++;
                        arrayList6 = arrayList6;
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = arrayList6;
                }
                if (bm.this.j.size() == 0) {
                    for (int i2 = 0; i2 < 4; i2++) {
                        arrayList8.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_rank_layout, (ViewGroup) frameLayout, false)));
                    }
                }
                if (bm.this.k.size() == 0) {
                    for (int i3 = 0; i3 < 8; i3++) {
                        arrayList9.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_singer_layout, (ViewGroup) frameLayout, false)));
                    }
                }
                if (bm.this.l.size() == 0) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        arrayList10.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_zone_layout, (ViewGroup) frameLayout, false)));
                    }
                }
                if (bm.this.m.size() == 0) {
                    for (int i5 = 0; i5 < 12; i5++) {
                        arrayList11.add(new SoftReference(LayoutInflater.from(bm.this.n).inflate(b.e.music_item_radio_item_layout, (ViewGroup) frameLayout, false)));
                    }
                }
                final ArrayList arrayList12 = arrayList;
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bm.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bm.this.c.addAll(arrayList2);
                        bm.this.d.addAll(arrayList3);
                        bm.this.e.addAll(arrayList4);
                        bm.this.f.addAll(arrayList5);
                        bm.this.g.addAll(arrayList12);
                        bm.this.i.addAll(arrayList7);
                        bm.this.j.addAll(arrayList8);
                        bm.this.k.addAll(arrayList9);
                        bm.this.l.addAll(arrayList10);
                        bm.this.m.addAll(arrayList11);
                    }
                });
                Log.d("XPMusicResourcePreloadUtil", "XPMusic preloadRes success.");
            }
        });
    }

    @Override // com.xiaopeng.musicradio.utils.ax
    public List<SoftReference<View>> c(ax.a aVar) {
        switch (aVar) {
            case MS_SELECTION_TOP:
                return this.a;
            case MS_RM_TITLE:
                return this.b;
            case MS_RM_ITEM:
                return this.h;
            case MS_XP_PLAY_TITLE:
                return this.c;
            case MS_RANK_TITLE:
                return this.d;
            case MS_RANK_ITEM:
                return this.j;
            case MS_SINGER_TITLE:
                return this.e;
            case MS_SINGER_ITEM:
                return this.k;
            case MS_ZONE_TITLE:
                return this.f;
            case MS_ZONE_ITEM:
                return this.l;
            case MS_RADIO_TITLE:
                return this.g;
            case MS_RADIO_ITEM:
                return this.m;
            default:
                return null;
        }
    }
}
