package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.bean.xpbean.CollectListBean;
import com.xiaopeng.musicradio.utils.u;
import defpackage.ark;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: MusicAlbumModel.java */
/* renamed from: anb  reason: default package */
/* loaded from: classes2.dex */
public class anb {
    private AtomicLong a;
    private boolean b;
    private long c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicAlbumModel.java */
    /* renamed from: anb$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final anb a = new anb();
    }

    public static anb a() {
        return a.a;
    }

    private anb() {
        this.a = new AtomicLong(0L);
        this.c = System.currentTimeMillis() - 31536000000L;
    }

    public String b() {
        return ((aqs) apx.a().b()).a();
    }

    public void c() {
        a(0, false);
    }

    public void a(int i, final boolean z) {
        long j;
        boolean d = apx.a().d();
        if (!this.b && d) {
            this.a.set(0L);
        }
        this.b = d;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.a.get();
        final String b = b();
        LogUtils.i("MusicAlbumModel", "fetchCollectedAlbum:kugouBinded=" + d + ",deltaTime=" + j2 + ",fetchType=" + i);
        switch (i) {
            case 1:
                j = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
                break;
            case 2:
                j = ListSignBean.USB_MUSIC_ID;
                break;
            default:
                j = 10000;
                break;
        }
        if (!d || j2 < j) {
            return;
        }
        this.c = currentTimeMillis - 31536000000L;
        this.a.set(currentTimeMillis);
        anf.a(new avc<CollectListBean>() { // from class: anb.1
            @Override // defpackage.avc
            public void a(CollectListBean collectListBean) {
                Log.d("MusicAlbumModel", "response: " + collectListBean.isFromCache());
                if (collectListBean.isFromCache()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                HashSet<Long> hashSet = new HashSet<>();
                ArrayList arrayList2 = new ArrayList();
                List<CollectListBean.DataBean> data = collectListBean.getData();
                if (data != null) {
                    for (CollectListBean.DataBean dataBean : data) {
                        if (dataBean.getCollectType() == 2) {
                            a(dataBean, arrayList, hashSet);
                        } else if (dataBean.getCollectType() == 1) {
                            a(dataBean, arrayList2);
                        }
                    }
                }
                ant.a().a(b, arrayList, hashSet, z);
                anu.a().a(b, arrayList2, z);
            }

            private void a(CollectListBean.DataBean dataBean, List<MusicAlbumCollect> list, HashSet<Long> hashSet) {
                List<CollectListBean.DataBean.ListBean> list2 = dataBean.getList();
                if (list2 != null) {
                    Log.d("MusicAlbumModel", "handleCollectTypeCollect: " + list2.size());
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        MusicAlbumCollect a2 = ang.a(list2.get(i2));
                        a2.setCacheTime(anb.this.c - i2);
                        a2.setUid(b);
                        hashSet.add(Long.valueOf(a2.getId()));
                        list.add(a2);
                    }
                }
            }

            private void a(CollectListBean.DataBean dataBean, List<MusicAlbumCustom> list) {
                List<CollectListBean.DataBean.ListBean> list2 = dataBean.getList();
                if (list2 != null) {
                    if (list2.size() > 1) {
                        Log.d("MusicAlbumModel", "handleCollectTypeSelf: " + list2.size());
                        for (int i2 = 1; i2 < list2.size(); i2++) {
                            MusicAlbumCustom b2 = ang.b(list2.get(i2));
                            b2.setCacheTime(anb.this.c - i2);
                            b2.setUid(b);
                            list.add(b2);
                        }
                    }
                }
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                LogUtils.i("MusicAlbumModel", "error: %d, %s", Integer.valueOf(i2), str);
                anb.this.a.set(0L);
                u.c(new ark.a(-1));
            }
        });
    }

    public void d() {
        this.a.set(0L);
    }
}
