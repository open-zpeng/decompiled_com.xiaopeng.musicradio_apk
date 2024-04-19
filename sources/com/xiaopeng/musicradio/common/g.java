package com.xiaopeng.musicradio.common;

import android.graphics.drawable.Drawable;
import com.xiaopeng.musicradio.common.f;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ResourcePreloadMgr.java */
/* loaded from: classes.dex */
public class g {
    private final List<Integer> a = new ArrayList();
    private Map<Integer, SoftReference<Drawable>> b = new ConcurrentHashMap();

    /* compiled from: ResourcePreloadMgr.java */
    /* loaded from: classes.dex */
    private static class a {
        static final g a = new g();
    }

    public static g a() {
        return a.a;
    }

    public g() {
        c();
    }

    private void c() {
        this.a.add(Integer.valueOf(f.e.pic_covers_music_list_220));
        this.a.add(Integer.valueOf(f.e.pic_covers_music_220));
        this.a.add(Integer.valueOf(f.e.ic_failed_no_net_smaller));
        this.a.add(Integer.valueOf(f.e.ic_failed_no_list_night));
        this.a.add(Integer.valueOf(f.e.pic_program_default_220));
        this.a.add(Integer.valueOf(f.e.ic_failed_no_net));
        this.a.add(Integer.valueOf(f.e.ic_failed_no_net_night));
        this.a.add(Integer.valueOf(f.e.ic_failed_no_list));
        this.a.add(Integer.valueOf(f.e.img_playing));
        this.a.add(Integer.valueOf(f.e.img_playing_night));
        this.a.add(Integer.valueOf(f.e.bg_btn_love_selector));
        this.a.add(Integer.valueOf(f.e.bg_btn_love_selector));
    }

    public void b() {
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.common.g.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < g.this.a.size(); i++) {
                    g.this.b.put(g.this.a.get(i), new SoftReference(com.xiaopeng.musicradio.a.a.getResources().getDrawable(((Integer) g.this.a.get(i)).intValue())));
                }
            }
        });
    }

    public Drawable a(int i) {
        SoftReference<Drawable> softReference = this.b.get(Integer.valueOf(i));
        if (softReference == null || softReference.get() == null) {
            return com.xiaopeng.musicradio.a.a.getResources().getDrawable(i);
        }
        return softReference.get();
    }
}
