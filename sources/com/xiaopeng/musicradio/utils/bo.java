package com.xiaopeng.musicradio.utils;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.utils.ax;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: XPProgramResourcePreloadUtil.java */
/* loaded from: classes2.dex */
public class bo extends ax {
    private List<SoftReference<View>> a;
    private List<SoftReference<View>> b;
    private List<SoftReference<View>> c;
    private List<SoftReference<View>> d;
    private List<SoftReference<View>> e;
    private List<SoftReference<View>> f;
    private List<SoftReference<View>> g;
    private List<SoftReference<View>> h;
    private com.xiaopeng.musicradio.commonui.base.e i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XPProgramResourcePreloadUtil.java */
    /* loaded from: classes2.dex */
    public static class a {
        static final bo a = new bo();
    }

    public static bo a() {
        return a.a;
    }

    private bo() {
        this.a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.g = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.i = new com.xiaopeng.musicradio.commonui.base.e(com.xiaopeng.musicradio.a.a);
    }

    public com.xiaopeng.musicradio.commonui.base.e b() {
        return this.i;
    }

    public void c() {
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bo.1
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final ArrayList arrayList6 = new ArrayList();
                if (bo.this.a.size() == 0) {
                    for (int i = 0; i < 34; i++) {
                        arrayList.add(new SoftReference(LayoutInflater.from(bo.this.i).inflate(b.e.item_program_category, (ViewGroup) null, false)));
                    }
                }
                if (bo.this.d.size() == 0) {
                    for (int i2 = 0; i2 < 1; i2++) {
                        arrayList2.add(new SoftReference(LayoutInflater.from(bo.this.i).inflate(b.e.layout_banner_binder, (ViewGroup) null, false)));
                    }
                }
                if (bo.this.e.size() == 0) {
                    for (int i3 = 0; i3 < 1; i3++) {
                        arrayList3.add(new SoftReference(LayoutInflater.from(bo.this.i).inflate(b.e.layout_guess_like_binder, (ViewGroup) null, false)));
                    }
                }
                if (bo.this.f.size() == 0) {
                    for (int i4 = 0; i4 < 20; i4++) {
                        arrayList4.add(new SoftReference(LayoutInflater.from(com.xiaopeng.musicradio.a.a).inflate(b.e.layout_rank_binder, (ViewGroup) null, false)));
                    }
                }
                if (bo.this.g.size() == 0) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        arrayList5.add(new SoftReference(LayoutInflater.from(com.xiaopeng.musicradio.a.a).inflate(b.e.layout_rank_title_binder, (ViewGroup) null, false)));
                    }
                }
                if (bo.this.h.size() == 0) {
                    for (int i6 = 0; i6 < 9; i6++) {
                        arrayList6.add(new SoftReference(LayoutInflater.from(com.xiaopeng.musicradio.a.a).inflate(b.e.item_banner_wrapper, (ViewGroup) null, false)));
                    }
                }
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bo.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bo.this.a.addAll(arrayList);
                        bo.this.d.addAll(arrayList2);
                        bo.this.e.addAll(arrayList3);
                        bo.this.f.addAll(arrayList4);
                        bo.this.g.addAll(arrayList5);
                        bo.this.h.addAll(arrayList6);
                    }
                });
                Log.d("XPProgramResourcePreloadUtil", "XPProgram preloadRes success.");
            }
        });
    }

    @Override // com.xiaopeng.musicradio.utils.ax
    public List<SoftReference<View>> c(ax.a aVar) {
        switch (aVar) {
            case READING_CATEGORY_ITEM:
                return this.a;
            case READING_SCENE_COLLAPSE_ITEM:
                return this.b;
            case READING_SCENE_EXPAND_ITEM:
                return this.c;
            case READING_GUESS_LIKE_BINDER:
                return this.e;
            case READING_BANNER_BINDER:
                return this.d;
            case READING_RANK_BINDER:
                return this.f;
            case READING_RANK_TITLE_BINDER:
                return this.g;
            case READING_BANNER_HOLDER_CREATOR:
                return this.h;
            default:
                return null;
        }
    }
}
