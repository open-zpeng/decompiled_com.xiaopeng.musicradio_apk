package com.xiaopeng.musicradio.utils;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.utils.ax;
import defpackage.beo;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: XPNetradioResourcePreloadUtil.java */
/* loaded from: classes2.dex */
public class bn extends ax {
    private List<SoftReference<View>> a;
    private List<SoftReference<View>> b;
    private List<SoftReference<View>> c;
    private com.xiaopeng.musicradio.commonui.base.e d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XPNetradioResourcePreloadUtil.java */
    /* loaded from: classes2.dex */
    public static class a {
        static final bn a = new bn();
    }

    public static bn a() {
        return a.a;
    }

    private bn() {
        this.a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new com.xiaopeng.musicradio.commonui.base.e(com.xiaopeng.musicradio.a.a);
    }

    public com.xiaopeng.musicradio.commonui.base.e b() {
        return this.d;
    }

    public void c() {
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bn.1
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                if (bn.this.a.size() == 0) {
                    arrayList.add(new SoftReference(LayoutInflater.from(bn.this.d).inflate(beo.d.netradio_item_selection_localradio, (ViewGroup) null, false)));
                }
                if (bn.this.b.size() == 0) {
                    arrayList2.add(new SoftReference(LayoutInflater.from(bn.this.d).inflate(beo.d.netradio_item_selection_allradio, (ViewGroup) null, false)));
                }
                if (bn.this.c.size() == 0) {
                    for (int i = 0; i < 8; i++) {
                        arrayList3.add(new SoftReference(LayoutInflater.from(bn.this.d).inflate(beo.d.netradio_item_localradio, (ViewGroup) null, false)));
                    }
                }
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bn.this.a.addAll(arrayList);
                        bn.this.b.addAll(arrayList2);
                        bn.this.c.addAll(arrayList3);
                    }
                });
                Log.d("XPNetradioResourcePreloadUtil", "XPNetradio preloadRes success.");
            }
        });
    }

    @Override // com.xiaopeng.musicradio.utils.ax
    public List<SoftReference<View>> c(ax.a aVar) {
        switch (aVar) {
            case NR_LOCATION_RADIO:
                return this.a;
            case NR_ALL_RADIO:
                return this.b;
            case NR_LOCATION_RADIO_ITEM:
                return this.c;
            default:
                return null;
        }
    }
}
