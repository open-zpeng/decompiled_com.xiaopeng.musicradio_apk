package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.reading.HeadSpeechHistoryRecord;
import com.xiaopeng.musicradio.bean.reading.OneKeyReadingHistoryRecord;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsChannelBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ReadingMediaSource.java */
/* renamed from: axm  reason: default package */
/* loaded from: classes2.dex */
public class axm extends ahp<ProgramBean> {
    private RdAlbumBean a;
    private RdAlbumBean b;
    private long c;
    private long d;
    private int e;

    @Override // defpackage.ahp
    public boolean n() {
        return true;
    }

    public axm(String str, int i, int i2, int i3, String str2, RdAlbumBean rdAlbumBean, boolean z, List<ProgramBean> list, int i4) {
        super(str, i, i2, i3, str2, z, list, i4);
        this.a = rdAlbumBean;
    }

    public axm(String str, int i, int i2, int i3, String str2, RdAlbumBean rdAlbumBean, boolean z, List<ProgramBean> list, int i4, boolean z2, String str3) {
        super(str, i, i2, i3, str2, z, list, i4, z2, str3);
        this.a = rdAlbumBean;
    }

    public axm(a aVar) {
        this(aVar.a, aVar.i, aVar.c, aVar.b, aVar.d, aVar.h, aVar.g, aVar.e, aVar.f);
    }

    @Override // defpackage.ahp
    protected String t() {
        return com.xiaopeng.musicradio.a.a.getString(b.f.program_mediasource_error_hint);
    }

    public long B() {
        return this.c;
    }

    public void a(long j) {
        this.c = j;
    }

    public int C() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public long D() {
        return this.d;
    }

    public void b(long j) {
        this.d = j;
    }

    @Override // defpackage.ahp
    public void a(ahp ahpVar) {
        super.a(ahpVar);
        if (ahpVar == null || !(ahpVar instanceof axm)) {
            return;
        }
        axm axmVar = (axm) ahpVar;
        this.a = axmVar.a;
        this.b = axmVar.b;
    }

    /* compiled from: ReadingMediaSource.java */
    /* renamed from: axm$a */
    /* loaded from: classes2.dex */
    public static class a {
        public boolean j;
        public long l;
        public long m;
        public int n;
        public String a = null;
        public int b = 20;
        public int c = -1;
        public String d = null;
        public List<ProgramBean> e = null;
        public int f = -1;
        public boolean g = false;
        public RdAlbumBean h = null;
        public int i = -1;
        public String k = null;

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a a(int i) {
            this.i = i;
            return this;
        }

        public a b(int i) {
            this.b = i;
            return this;
        }

        public a b(String str) {
            this.d = str;
            return this;
        }

        public a a(RdAlbumBean rdAlbumBean) {
            this.h = rdAlbumBean;
            return this;
        }

        public a a(List<ProgramBean> list) {
            this.e = list;
            return this;
        }

        public a c(int i) {
            this.f = i;
            return this;
        }

        public a d(int i) {
            this.c = i;
            return this;
        }

        public a a(long j) {
            this.l = j;
            return this;
        }

        public a e(int i) {
            this.n = i;
            return this;
        }

        public a b(long j) {
            this.m = j;
            return this;
        }

        public a a(boolean z) {
            this.g = z;
            return this;
        }

        public a b(boolean z) {
            this.j = z;
            return this;
        }

        public a c(String str) {
            this.k = str;
            return this;
        }

        public axm a() {
            axm axmVar = new axm(this.a, this.i, this.c, this.b, this.d, this.h, this.g, this.e, this.f, this.j, this.k);
            axmVar.a(this.l);
            axmVar.b(this.m);
            axmVar.c(this.n);
            return axmVar;
        }
    }

    @Override // defpackage.ahp
    public void a(boolean z, int i, int i2, String str, boolean z2) {
        String b = b();
        LogUtils.d("ReadingMediaSource", "onReqList page:" + i + ", pagesize:" + i2 + " sort = " + str);
        if (b.equals("headspeech")) {
            e(z, i, i2, str);
        } else if (b.startsWith("reading_album_")) {
            if (this.a == null) {
                a(z, -1, "");
                LogUtils.e("ReadingMediaSource", "error, mAlbumBean == null");
                return;
            }
            f(z, i, i2, str);
        } else if (b.contains("headspeech")) {
            if (this.e > 0) {
                a(z, i, i2, str);
            } else if (this.c > 0) {
                if (i == 1) {
                    c(z, i, i2, str);
                } else {
                    b(z, i, i2, str);
                }
            }
        }
    }

    private void a(final boolean z, final int i, int i2, String str) {
        Log.i("ReadingMediaSource", "onNewHeadSpeechReqList: ===========");
        v();
        axp.a().b(new avc<TodayNewsCardBean>() { // from class: axm.1
            @Override // defpackage.avc
            public void a(TodayNewsCardBean todayNewsCardBean) {
                if (todayNewsCardBean.getData() == null || todayNewsCardBean.getData().getList() == null || todayNewsCardBean.getData().getList().size() == 0) {
                    return;
                }
                if (todayNewsCardBean.isFromCache()) {
                    LogUtils.i("ReadingMediaSource", "is cache data,not udpated, just return");
                    return;
                }
                LogUtils.d("ReadingMediaSource", "before channelId:" + axm.this.e + ", relativeId:" + axm.this.d);
                List<TodayNewsCardBean.DataBean.ListBean> list = todayNewsCardBean.getData().getList();
                TodayNewsCardBean.DataBean.ListBean listBean = list.get(0);
                Iterator<TodayNewsCardBean.DataBean.ListBean> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TodayNewsCardBean.DataBean.ListBean next = it.next();
                    if (next.getCardId() == axm.this.e) {
                        listBean = next;
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (listBean.getTrackInfoBos() != null && listBean.getTrackInfoBos().size() > 0) {
                    for (TodayNewsCardBean.DataBean.ListBean.TrackInfoBosBean trackInfoBosBean : listBean.getTrackInfoBos()) {
                        arrayList.add(aq.a(trackInfoBosBean, listBean));
                    }
                }
                axm.this.a(ad.b(listBean.getCardId()).toJson());
                Log.i("ReadingMediaSource", "response: =========== " + arrayList.size());
                axm.this.e = listBean.getCardId();
                axm.this.a(listBean, z, i);
            }

            @Override // defpackage.avc
            public void a(int i3, String str2) {
                axm.this.a(z, i3, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final TodayNewsCardBean.DataBean.ListBean listBean, final boolean z, final int i) {
        axp.a().b(this.e, new avc<FMAlbumTracksBean>() { // from class: axm.2
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                if (fMAlbumTracksBean.getData() == null) {
                    a(-1, "empty data");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < fMAlbumTracksBean.getData().getList().size(); i2++) {
                    ProgramBean a2 = aq.a(fMAlbumTracksBean.getData().getList().get(i2), listBean);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                axm.this.a(z, i, 1, arrayList);
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                axm.this.a(z, i2, str);
            }
        });
    }

    private void b(final boolean z, int i, int i2, String str) {
        LogUtils.i("ReadingMediaSource", "onOtherPageNewHeadTracksReqList:--------");
        axp.a().a(this.d, i, i2, str, new avc<FMAlbumTracksBean>() { // from class: axm.3
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                if (fMAlbumTracksBean.getData() == null) {
                    a(-1, "empty data");
                } else if (fMAlbumTracksBean.isFromCache()) {
                    LogUtils.i("ReadingMediaSource", "onOtherPageNewHeadTracksReqList fromCahce, just return");
                } else {
                    int totalPage = fMAlbumTracksBean.getData().getPage().getTotalPage();
                    int page = fMAlbumTracksBean.getData().getPage().getPage();
                    ArrayList arrayList = new ArrayList();
                    for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                        arrayList.add(aq.a(listBean, "", (RdAlbumBean) null));
                    }
                    axm.this.a(z, page, totalPage, arrayList);
                }
            }

            @Override // defpackage.avc
            public void a(int i3, String str2) {
                axm.this.a(z, i3, str2);
            }
        }, (String) null);
    }

    private void c(final boolean z, final int i, int i2, String str) {
        Log.i("ReadingMediaSource", "onNewHeadSpeechReqList: ===========");
        v();
        axp.a().a(new avc<TodayNewsChannelBean>() { // from class: axm.4
            @Override // defpackage.avc
            public void a(TodayNewsChannelBean todayNewsChannelBean) {
                if (todayNewsChannelBean.getData() == null || todayNewsChannelBean.getData().getList() == null || todayNewsChannelBean.getData().getList().size() == 0) {
                    return;
                }
                if (todayNewsChannelBean.isFromCache()) {
                    LogUtils.i("ReadingMediaSource", "is cache data,not udpated, just return");
                    return;
                }
                LogUtils.d("ReadingMediaSource", "before channelId:" + axm.this.c + ", relativeId:" + axm.this.d);
                List<TodayNewsChannelBean.DataBean.ListBean> list = todayNewsChannelBean.getData().getList();
                TodayNewsChannelBean.DataBean.ListBean listBean = list.get(0);
                Iterator<TodayNewsChannelBean.DataBean.ListBean> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TodayNewsChannelBean.DataBean.ListBean next = it.next();
                    if (next.getChannelId() == axm.this.c) {
                        listBean = next;
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (listBean.getTrackInfoBos() != null && listBean.getTrackInfoBos().size() > 0) {
                    for (TodayNewsChannelBean.DataBean.TrackInfoBosItem trackInfoBosItem : listBean.getTrackInfoBos()) {
                        arrayList.add(aq.a(trackInfoBosItem, listBean.getChannelId(), listBean.getRelativeId()));
                    }
                }
                axm.this.a(ad.a(listBean.getChannelId()).toJson());
                Log.i("ReadingMediaSource", "response: =========== " + arrayList.size());
                axm.this.c = (long) listBean.getChannelId();
                try {
                    axm.this.d = Long.parseLong(listBean.getRelativeId());
                } catch (Exception unused) {
                }
                LogUtils.d("ReadingMediaSource", "after channelId:" + axm.this.c + ", relativeId:" + axm.this.d);
                axm.this.a(z, i, listBean.getTotal() / 10, arrayList);
            }

            @Override // defpackage.avc
            public void a(int i3, String str2) {
                axm.this.a(z, i3, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z, int i, int i2, String str) {
        b(false);
        LogUtils.i("ReadingMediaSource", "onSimpleHeadSpeechReqlist");
        if (axl.a().b().isEmpty()) {
            axp.a().a(-1L, -1L, i, i2, new avc<FMAlbumTracksBean>() { // from class: axm.5
                @Override // defpackage.avc
                public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                    ArrayList arrayList = new ArrayList();
                    for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                        ProgramBean a2 = aq.a(listBean, "头条新闻", (RdAlbumBean) null);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    axl.a().a(arrayList);
                    axl.a().a(fMAlbumTracksBean.getData().getMode());
                    axm.this.a(z, 1, 1, arrayList);
                }

                @Override // defpackage.avc
                public void a(int i3, String str2) {
                    axm.this.a(z, i3, str2);
                    ak.a(com.xiaopeng.musicradio.a.a, bj.b(i3, str2));
                }
            });
            return;
        }
        LogUtils.i("ReadingMediaSource", "onSimpleHeadSpeechReqlist HeadSpeechMgr.getInstance().getListData() not empty, use it!");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(axl.a().b());
        a(arrayList);
        a(0);
        a(z, 1, 1, arrayList);
    }

    private void e(boolean z, int i, int i2, String str) {
        Log.i("ReadingMediaSource", "onHeadSpeechReqList: " + i);
        if (v()) {
            ban.d(new AnonymousClass6(i, i2, z, str));
        } else {
            d(z, i, i2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReadingMediaSource.java */
    /* renamed from: axm$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ String d;

        AnonymousClass6(int i, int i2, boolean z, String str) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            final HeadSpeechHistoryRecord headSpeechHistoryRecord = (HeadSpeechHistoryRecord) z.a(afk.a().a("key_cache_headspeach_record"), (Class<Object>) HeadSpeechHistoryRecord.class);
            ban.g(new Runnable() { // from class: axm.6.1
                @Override // java.lang.Runnable
                public void run() {
                    HeadSpeechHistoryRecord headSpeechHistoryRecord2 = headSpeechHistoryRecord;
                    if (headSpeechHistoryRecord2 == null) {
                        axm.this.d(AnonymousClass6.this.c, AnonymousClass6.this.a, AnonymousClass6.this.b, AnonymousClass6.this.d);
                        return;
                    }
                    final long trackId = headSpeechHistoryRecord2.getTrackId();
                    final long albumId = headSpeechHistoryRecord.getAlbumId();
                    if (axl.a().b().isEmpty()) {
                        axp.a().a(albumId, trackId, AnonymousClass6.this.a, AnonymousClass6.this.b, new avc<FMAlbumTracksBean>() { // from class: axm.6.1.1
                            @Override // defpackage.avc
                            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                                ProgramBean programBean;
                                Log.i("ReadingMediaSource", "response: ");
                                List<ProgramBean> arrayList = new ArrayList<>();
                                ProgramBean programBean2 = null;
                                for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                                    ProgramBean a = aq.a(listBean, "头条新闻", (RdAlbumBean) null);
                                    if (a != null) {
                                        arrayList.add(a);
                                        if (a.getTrackId() == trackId && a.getAlbumId() == albumId) {
                                            programBean2 = a;
                                        }
                                    }
                                }
                                if (!axl.a().b().isEmpty()) {
                                    arrayList = axl.a().b();
                                    Iterator<ProgramBean> it = arrayList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            programBean = programBean2;
                                            break;
                                        }
                                        programBean = it.next();
                                        if (programBean != null && programBean.getTrackId() == trackId && programBean.getAlbumId() == albumId) {
                                            break;
                                        }
                                    }
                                    if (TextUtils.equals(axl.a().c(), "continue")) {
                                        r2 = programBean;
                                    }
                                } else {
                                    r2 = TextUtils.equals(fMAlbumTracksBean.getData().getMode(), "continue") ? programBean2 : null;
                                    axl.a().a(arrayList);
                                    axl.a().a(fMAlbumTracksBean.getData().getMode());
                                    LogUtils.i("ReadingMediaSource", "save list data!!");
                                }
                                axm.this.a(arrayList);
                                if (r2 == null) {
                                    LogUtils.i("ReadingMediaSource", "HEADSPEECH history track=" + trackId + "not found set to 0 index!listsize=" + arrayList.size());
                                    axm.this.a(0);
                                } else {
                                    LogUtils.i("ReadingMediaSource", "HEADSPEECH begin from " + r2.getTrackId());
                                    axm.this.a(arrayList.indexOf(r2));
                                }
                                axm.this.a(AnonymousClass6.this.c, 1, 1, arrayList);
                            }

                            @Override // defpackage.avc
                            public void a(int i, String str) {
                                axm.this.a(AnonymousClass6.this.c, i, str);
                                ak.a(com.xiaopeng.musicradio.a.a, bj.b(i, str));
                            }
                        });
                        return;
                    }
                    LogUtils.i("ReadingMediaSource", "HeadSpeechMgr.getInstance().getListData() not empty, use it!");
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(axl.a().b());
                    ProgramBean programBean = null;
                    if (TextUtils.equals(axl.a().c(), "continue")) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ProgramBean programBean2 = (ProgramBean) it.next();
                            if (programBean2.getTrackId() == trackId && programBean2.getAlbumId() == albumId) {
                                LogUtils.i("ReadingMediaSource", "use localList, and begin from aid:tid" + albumId + ":" + trackId);
                                programBean = programBean2;
                                break;
                            }
                        }
                    }
                    axm.this.a(arrayList);
                    if (programBean == null) {
                        axm.this.a(0);
                        axm.this.b(false);
                        LogUtils.i("ReadingMediaSource", "use localList, no target tid, begin from 0");
                    } else {
                        int indexOf = arrayList.indexOf(programBean);
                        axm.this.a(indexOf);
                        LogUtils.i("ReadingMediaSource", "use localList, target tid find, begin from index:" + indexOf);
                    }
                    axm.this.a(AnonymousClass6.this.c, 1, 1, arrayList);
                }
            });
        }
    }

    private void f(final boolean z, final int i, int i2, String str) {
        OneKeyReadingHistoryRecord oneKeyReadingHistoryRecord = null;
        ReadHistoryInfo a2 = (v() || i()) ? axi.a().a(this.a.getId()) : null;
        String b = b();
        if (b != null && b.startsWith("reading_album_onkey_")) {
            oneKeyReadingHistoryRecord = (OneKeyReadingHistoryRecord) z.a(afk.a().a("key_cache_one_album_record"), (Class<Object>) OneKeyReadingHistoryRecord.class);
        }
        if (a2 != null || oneKeyReadingHistoryRecord != null) {
            final long trackId = oneKeyReadingHistoryRecord != null ? oneKeyReadingHistoryRecord.getTrackId() : a2 != null ? a2.getTrackId() : 0L;
            Log.i("ReadingMediaSource", "onReandingTracksReqList1: " + str);
            axp.a().a(this.a.getId(), trackId, i2, str, new avc<FMAlbumTracksBean>() { // from class: axm.7
                @Override // defpackage.avc
                public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                    ArrayList arrayList = new ArrayList();
                    ProgramBean programBean = null;
                    for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                        listBean.setAlbumId(axm.this.a.getId());
                        ProgramBean a3 = aq.a(listBean, axm.this.a);
                        a3.setChannelId((int) axm.this.c);
                        if (a3 != null) {
                            arrayList.add(a3);
                            if (a3.getTrackId() == trackId) {
                                programBean = a3;
                            }
                        }
                    }
                    if (programBean == null) {
                        axm.this.a(arrayList);
                        axm.this.a(0);
                        axm.this.b(false);
                    } else {
                        axm.this.a(arrayList);
                        axm.this.a(arrayList.indexOf(programBean));
                    }
                    axm.this.b(fMAlbumTracksBean.getData().getSort());
                    axm.this.a(z, fMAlbumTracksBean.getData().getPage().getPage(), fMAlbumTracksBean.getData().getPage().getTotalPage(), arrayList);
                }

                @Override // defpackage.avc
                public void a(int i3, String str2) {
                    axm.this.a(z, i3, str2);
                }
            }, j());
            return;
        }
        b(false);
        Log.i("ReadingMediaSource", "onReandingTracksReqList2: " + str);
        axp.a().a(this.a.getId(), i, i2, str, new avc<FMAlbumTracksBean>() { // from class: axm.8
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                ArrayList arrayList = new ArrayList();
                for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                    ProgramBean a3 = aq.a(listBean, axm.this.a);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                axm.this.b(fMAlbumTracksBean.getData().getSort());
                axm.this.a(z, i, fMAlbumTracksBean.getData().getPage().getTotalPage(), arrayList);
            }

            @Override // defpackage.avc
            public void a(int i3, String str2) {
                axm.this.a(z, i3, str2);
            }
        }, j());
    }
}
