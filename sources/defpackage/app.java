package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoBean;
import com.xiaopeng.musicradio.bean.xpbean.NetScheduleListBean;
import com.xiaopeng.musicradio.utils.an;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.age;
import defpackage.apu;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: LiveDataProvider.java */
/* renamed from: app  reason: default package */
/* loaded from: classes2.dex */
public class app extends apu<NetRadioProgramInfo> {
    private NetRadioInfo c;
    private c d;
    private String e;

    /* compiled from: LiveDataProvider.java */
    /* renamed from: app$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(int i, String str);

        void a(NetRadioInfo netRadioInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.apu
    public boolean a() {
        super.a();
        if (this.b >= this.a.size()) {
            this.b = 0;
        }
        h();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.apu
    public boolean b() {
        super.b();
        if (this.b < 0) {
            this.b = this.a.size() - 1;
        }
        h();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(NetRadioProgramInfo netRadioProgramInfo, final b bVar) {
        boolean z;
        Log.i("LiveDataProvider", " programInfo = " + netRadioProgramInfo);
        if (this.a.size() == 0) {
            if (netRadioProgramInfo.getParentInfo().getProgramInfos() != null) {
                this.a.addAll(netRadioProgramInfo.getParentInfo().getProgramInfos());
            }
            if (netRadioProgramInfo.getParentInfo().getPlayingInfo() != null) {
                Iterator it = this.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((NetRadioProgramInfo) it.next()).equals(netRadioProgramInfo.getParentInfo().getPlayingInfo())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    this.a.add(netRadioProgramInfo.getParentInfo().getPlayingInfo());
                }
            }
            this.c = netRadioProgramInfo.getParentInfo();
            if (this.c.getProgramInfos() != null) {
                Log.i("LiveDataProvider", "play: programSize = " + this.c.getProgramInfos().size());
            }
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (((NetRadioProgramInfo) this.a.get(i)).equals(netRadioProgramInfo)) {
                this.b = i;
                Log.i("LiveDataProvider", "play: =======" + this.b);
                h();
            }
        }
        b(netRadioProgramInfo.getParentInfo());
        this.d = new d(netRadioProgramInfo.getParentInfo(), new b() { // from class: app.1
            @Override // defpackage.app.b
            public void a(NetRadioInfo netRadioInfo) {
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(netRadioInfo);
                }
            }

            @Override // defpackage.app.b
            public void a(int i2, String str) {
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(i2, str);
                }
            }
        });
        this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, final b bVar) {
        NetRadioInfo netRadioInfo;
        Log.i("LiveDataProvider", "play: size = " + this.a.size() + " lastRadio = " + this.c);
        if (TextUtils.equals(this.e, str) && this.a.size() > 0 && (netRadioInfo = this.c) != null) {
            if (bVar != null) {
                bVar.a(netRadioInfo);
                return;
            }
            return;
        }
        this.b = 0;
        h();
        this.e = str;
        this.c = null;
        this.a.clear();
        if (this.b == -1) {
            return;
        }
        this.d = new a(str, new b() { // from class: app.2
            @Override // defpackage.app.b
            public void a(NetRadioInfo netRadioInfo2) {
                app.this.a.clear();
                app.this.a.addAll(netRadioInfo2.getProgramInfos());
                app appVar = app.this;
                appVar.b = appVar.a.size() - 1;
                app.this.h();
                bVar.a(netRadioInfo2);
                if (netRadioInfo2 != null) {
                    app.this.c = netRadioInfo2;
                    app.this.b(netRadioInfo2);
                    app.this.b(netRadioInfo2.getPlayingInfo());
                }
                u.c(new age.d(6, ""));
            }

            @Override // defpackage.app.b
            public void a(int i, String str2) {
                bVar.a(i, str2);
            }
        });
        this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(NetRadioInfo netRadioInfo, final b bVar) {
        if (!netRadioInfo.equals(this.c)) {
            this.c = netRadioInfo;
            this.a.clear();
            this.e = null;
            this.b = 0;
            h();
            this.d = new d(netRadioInfo, new b() { // from class: app.3
                @Override // defpackage.app.b
                public void a(NetRadioInfo netRadioInfo2) {
                    app.this.a.clear();
                    app.this.a.addAll(netRadioInfo2.getProgramInfos());
                    app appVar = app.this;
                    appVar.b = appVar.a.size() - 1;
                    app.this.h();
                    Log.i("LiveDataProvider", "play: " + netRadioInfo2 + " playIndex = " + app.this.b + " programInfo = " + netRadioInfo2.getPlayingInfo());
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(netRadioInfo2);
                    }
                    app.this.b(netRadioInfo2);
                    app.this.b(netRadioInfo2.getPlayingInfo());
                    u.c(new age.d(6, ""));
                }

                @Override // defpackage.app.b
                public void a(int i, String str) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(i, str);
                    }
                }
            });
            this.d.a();
            return;
        }
        a(netRadioInfo.getPlayingInfo(), bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NetRadioProgramInfo netRadioProgramInfo) {
        a(netRadioProgramInfo);
    }

    @Override // defpackage.apu
    protected apo c() {
        NetRadioInfo netRadioInfo = this.c;
        if (netRadioInfo == null) {
            return null;
        }
        return new apq(String.valueOf(netRadioInfo.getId()));
    }

    @Override // defpackage.apu
    protected void a(apu.a aVar, NetRadioInfo netRadioInfo) {
        int i = i();
        Log.i("LiveDataProvider", "rebootPlayCallback: " + i + " info = " + netRadioInfo);
        if (i == -1 || netRadioInfo.getProgramInfos() == null || i >= netRadioInfo.getProgramInfos().size()) {
            aVar.a(netRadioInfo.getPlayingInfo());
            return;
        }
        Log.i("LiveDataProvider", "rebootPlayCallback: ======");
        aVar.a(netRadioInfo.getProgramInfos().get(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.apu
    public void d() {
        super.d();
        c cVar = this.d;
        if (cVar != null) {
            cVar.b();
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.apu
    public NetRadioProgramInfo e() {
        if (this.b == -1) {
            return null;
        }
        if (this.b < this.a.size()) {
            return (NetRadioProgramInfo) this.a.get(this.b);
        }
        NetRadioInfo netRadioInfo = this.c;
        if (netRadioInfo != null) {
            return netRadioInfo.getPlayingInfo();
        }
        if (TextUtils.isEmpty(this.e)) {
            return null;
        }
        NetRadioProgramInfo netRadioProgramInfo = new NetRadioProgramInfo();
        NetRadioInfo netRadioInfo2 = new NetRadioInfo();
        netRadioInfo2.setId(-1);
        netRadioInfo2.setHz(Double.parseDouble(this.e));
        netRadioInfo2.setPlayingInfo(netRadioProgramInfo);
        netRadioProgramInfo.setId(-1);
        return netRadioProgramInfo;
    }

    @Override // defpackage.apu
    protected void a(NetRadioInfo netRadioInfo) {
        this.c = netRadioInfo;
        b(netRadioInfo.getPlayingInfo());
        u.c(new age.c(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LiveDataProvider.java */
    /* renamed from: app$c */
    /* loaded from: classes2.dex */
    public static class c {
        protected boolean a;
        protected b b;

        public void a() {
        }

        public c(b bVar) {
            this.b = bVar;
        }

        public void b() {
            this.a = true;
        }

        protected void a(final NetRadioInfo netRadioInfo) {
            Observable.zip(aqy.a(String.valueOf(netRadioInfo.getId()), bg.b()), aqy.a(String.valueOf(netRadioInfo.getId()), bg.a()), new BiFunction<NetScheduleListBean, NetScheduleListBean, ArrayList<NetRadioProgramInfo>>() { // from class: app.c.3
                @Override // io.reactivex.functions.BiFunction
                /* renamed from: a */
                public ArrayList<NetRadioProgramInfo> apply(NetScheduleListBean netScheduleListBean, NetScheduleListBean netScheduleListBean2) {
                    ArrayList<NetRadioProgramInfo> arrayList = new ArrayList<>();
                    List<NetScheduleListBean.DataBean.ListBean> list = netScheduleListBean.getData().getList();
                    boolean z = true;
                    for (int i = 0; i < list.size(); i++) {
                        NetRadioProgramInfo a = an.a(list.get(i), netRadioInfo);
                        if (a != null) {
                            if (z) {
                                a.setType(0);
                            }
                            a.setDayOfWeek(bg.b());
                            a.setTime(bg.c() - 86400000);
                            arrayList.add(a);
                            z = false;
                        }
                    }
                    List<NetScheduleListBean.DataBean.ListBean> list2 = netScheduleListBean2.getData().getList();
                    boolean z2 = true;
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        NetRadioProgramInfo a2 = an.a(list2.get(i2), netRadioInfo);
                        if (a2 != null) {
                            if (z2) {
                                a2.setType(1);
                            }
                            a2.setDayOfWeek(bg.a());
                            a2.setTime(bg.c());
                            arrayList.add(a2);
                            z2 = false;
                        }
                    }
                    if (netRadioInfo.getPlayingInfo() != null) {
                        netRadioInfo.getPlayingInfo().setType(2);
                        arrayList.add(netRadioInfo.getPlayingInfo());
                    }
                    return arrayList;
                }
            }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<ArrayList<NetRadioProgramInfo>>() { // from class: app.c.1
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(ArrayList<NetRadioProgramInfo> arrayList) {
                    netRadioInfo.setProgramInfos(arrayList);
                    if (c.this.a || c.this.b == null) {
                        return;
                    }
                    c.this.b.a(netRadioInfo);
                }
            }, new Consumer<Throwable>() { // from class: app.c.2
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Throwable th) {
                    Log.e("LiveDataProvider", "accept: ", th);
                    if (c.this.a || c.this.b == null) {
                        return;
                    }
                    if (th != null && (th instanceof auw)) {
                        auw auwVar = (auw) th;
                        c.this.b.a(auwVar.a(), auwVar.getMessage());
                        return;
                    }
                    c.this.b.a(-1, "");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LiveDataProvider.java */
    /* renamed from: app$a */
    /* loaded from: classes2.dex */
    public static class a extends c {
        private String c;

        public a(String str, b bVar) {
            super(bVar);
            this.c = str;
        }

        @Override // defpackage.app.c
        public void a() {
            ara.a().a(this.c, apd.a().b(), new avc<NetRadioInfoBean>() { // from class: app.a.1
                @Override // defpackage.avc
                public void a(NetRadioInfoBean netRadioInfoBean) {
                    Log.i("LiveDataProvider", "response: " + z.a(netRadioInfoBean.getData()) + " data = ");
                    if (a.this.a || a.this.b == null) {
                        return;
                    }
                    a.this.a(netRadioInfoBean.getData());
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    Log.e("LiveDataProvider", "error: " + i + " msg = " + str);
                    if (a.this.a || a.this.b == null) {
                        return;
                    }
                    a.this.b.a(i, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LiveDataProvider.java */
    /* renamed from: app$d */
    /* loaded from: classes2.dex */
    public static class d extends c {
        private NetRadioInfo c;

        public d(NetRadioInfo netRadioInfo, b bVar) {
            super(bVar);
            this.c = netRadioInfo;
        }

        @Override // defpackage.app.c
        public void a() {
            a(this.c);
        }
    }
}
