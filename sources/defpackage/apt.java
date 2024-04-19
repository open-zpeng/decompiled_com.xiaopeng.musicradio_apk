package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import com.xiaopeng.musicradio.bean.dao.NetRadioCollectDao;
import com.xiaopeng.musicradio.bean.db.NetRadioCollect;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoListBean;
import com.xiaopeng.musicradio.utils.an;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agm;
import defpackage.aud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: NetRadioOperation.java */
/* renamed from: apt  reason: default package */
/* loaded from: classes2.dex */
public class apt {
    private List<NetRadioCollect> a;
    private final NetRadioCollectDao b;
    private HashMap<Integer, Integer> c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetRadioOperation.java */
    /* renamed from: apt$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final apt a = new apt();
    }

    public static apt a() {
        return a.a;
    }

    private apt() {
        this.a = new ArrayList();
        this.c = new HashMap<>();
        this.b = aff.a().b().getNetRadioCollectDao();
        u.a(this);
        d();
    }

    private void d() {
        ban.e(new Runnable() { // from class: apt.1
            @Override // java.lang.Runnable
            public void run() {
                List<NetRadioCollect> list = apt.this.b.queryBuilder().list();
                synchronized (apt.this.a) {
                    apt.this.a.clear();
                    if (!list.isEmpty()) {
                        for (NetRadioCollect netRadioCollect : list) {
                            if (!TextUtils.isEmpty(netRadioCollect.getName())) {
                                apt.this.a.add(netRadioCollect);
                            }
                        }
                    }
                }
                ban.b(new Runnable() { // from class: apt.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        u.c(new agm.b());
                    }
                }, 1000L);
            }
        });
    }

    public void a(final String str) {
        final n nVar = new n();
        nVar.a((o) new o<List<NetRadioInfo>>() { // from class: apt.2
            @Override // androidx.lifecycle.o
            public void a(List<NetRadioInfo> list) {
                nVar.b((o) this);
                apt.this.a(str, list);
            }
        });
        ban.e(new Runnable() { // from class: apt.3
            @Override // java.lang.Runnable
            public void run() {
                nVar.a((n) apr.a().a(1, Long.MAX_VALUE));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<NetRadioInfo> list) {
        NetRadioInfo parentInfo;
        int c = aei.a().c();
        if (list.size() > 0) {
            NetRadioProgramInfo d = aps.i().d();
            if (d != null && (parentInfo = d.getParentInfo()) != null && parentInfo.getId() == list.get(0).getId() && c == 6) {
                if (aps.i().getPlayState() != 2) {
                    aps.i().play();
                    return;
                }
                return;
            }
            aps.i().a(list.get(0));
            return;
        }
        ara.a().a(str, new avc<NetRadioInfoListBean>() { // from class: apt.4
            @Override // defpackage.avc
            public void a(int i, String str2) {
            }

            @Override // defpackage.avc
            public void a(NetRadioInfoListBean netRadioInfoListBean) {
                if (netRadioInfoListBean.getData() == null || netRadioInfoListBean.getData().getList() == null || netRadioInfoListBean.getData().getList().size() <= 0) {
                    return;
                }
                aps.i().a(netRadioInfoListBean.getData().getList().get(0));
            }
        });
    }

    public ArrayList<NetRadioInfo> b() {
        LinkedList linkedList;
        ArrayList<NetRadioInfo> arrayList = new ArrayList<>();
        synchronized (this.a) {
            linkedList = new LinkedList(this.a);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(an.a((NetRadioCollect) it.next()));
        }
        return arrayList;
    }

    public List<NetRadioInfo> a(int i, long j) {
        QueryBuilder<NetRadioCollect> orderDesc = this.b.queryBuilder().orderDesc(NetRadioCollectDao.Properties.CacheTime);
        orderDesc.where(NetRadioCollectDao.Properties.CacheTime.lt(Long.valueOf(j)), new WhereCondition[0]).limit(i);
        List<NetRadioCollect> list = orderDesc.list();
        ArrayList arrayList = new ArrayList();
        for (NetRadioCollect netRadioCollect : list) {
            if (!TextUtils.isEmpty(netRadioCollect.getName())) {
                arrayList.add(an.a(netRadioCollect));
            }
        }
        return arrayList;
    }

    public void a(List<NetRadioCollect> list) {
        final LinkedList linkedList = new LinkedList();
        synchronized (this.a) {
            long currentTimeMillis = System.currentTimeMillis();
            int size = this.a.size();
            for (NetRadioCollect netRadioCollect : this.a) {
                if (currentTimeMillis - netRadioCollect.getCacheTime() <= 120000) {
                    linkedList.add(netRadioCollect);
                }
            }
            this.a.clear();
            if (!linkedList.isEmpty()) {
                this.a.addAll(linkedList);
            }
            Log.i("NetRadioOperation", "saveLoveNetRadioInfoList:recentList=" + linkedList.size() + ",lastSize=" + size);
            if (list != null && !list.isEmpty()) {
                if (!linkedList.isEmpty()) {
                    list.removeAll(linkedList);
                }
                this.a.addAll(list);
            }
        }
        if (list != null && !list.isEmpty()) {
            ArrayList<NetRadioCollect> arrayList = new ArrayList();
            arrayList.addAll(list);
            Log.i("NetRadioOperation", "saveLoveNetRadioInfoList:sourceList=" + arrayList.size());
            final ArrayList arrayList2 = new ArrayList();
            for (NetRadioCollect netRadioCollect2 : arrayList) {
                if (!TextUtils.isEmpty(netRadioCollect2.getName())) {
                    arrayList2.add(netRadioCollect2);
                }
            }
            ban.e(new Runnable() { // from class: apt.5
                @Override // java.lang.Runnable
                public void run() {
                    apt.this.b.insertOrReplaceInTx(arrayList2);
                    u.c(new aud.b(true));
                }
            });
            return;
        }
        ban.e(new Runnable() { // from class: apt.6
            @Override // java.lang.Runnable
            public void run() {
                apt.this.b.deleteAll();
                LinkedList linkedList2 = linkedList;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    Log.i("NetRadioOperation", "saveLoveNetRadioInfoList:recentList=" + linkedList.size());
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        NetRadioCollect netRadioCollect3 = (NetRadioCollect) it.next();
                        if (!TextUtils.isEmpty(netRadioCollect3.getName())) {
                            arrayList3.add(netRadioCollect3);
                        }
                    }
                    apt.this.b.insertOrReplaceInTx(arrayList3);
                }
                u.c(new aud.b(true));
            }
        });
    }

    public void a(NetRadioInfo netRadioInfo, boolean z) {
        if (netRadioInfo == null) {
            return;
        }
        NetRadioCollect b = an.b(netRadioInfo);
        if (z) {
            if (TextUtils.isEmpty(netRadioInfo.getName()) || netRadioInfo.getId() <= 0) {
                return;
            }
            b(b);
            return;
        }
        a(b);
    }

    private void b(final NetRadioCollect netRadioCollect) {
        netRadioCollect.setCacheTime(System.currentTimeMillis());
        synchronized (this.a) {
            if (this.a.contains(netRadioCollect)) {
                this.a.remove(netRadioCollect);
            }
            this.a.add(0, netRadioCollect);
        }
        ban.e(new Runnable() { // from class: apt.7
            @Override // java.lang.Runnable
            public void run() {
                apt.this.b.insertOrReplace(netRadioCollect);
            }
        });
        u.c(new agg.k(netRadioCollect.getId(), true));
    }

    public void a(final NetRadioCollect netRadioCollect) {
        synchronized (this.a) {
            this.a.remove(netRadioCollect);
        }
        ban.e(new Runnable() { // from class: apt.8
            @Override // java.lang.Runnable
            public void run() {
                apt.this.b.deleteByKey(Long.valueOf(netRadioCollect.getId()));
            }
        });
        u.c(new agg.k(netRadioCollect.getId(), false));
    }

    public boolean a(NetRadioInfo netRadioInfo) {
        return a(netRadioInfo.getId());
    }

    public boolean a(long j) {
        boolean z;
        synchronized (this.a) {
            Iterator<NetRadioCollect> it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().getId() == j) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public void c() {
        Log.i("NetRadioOperation", "deleteAll: ==");
        synchronized (this.a) {
            this.a.clear();
        }
        this.b.deleteAll();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onEvent(agi agiVar) {
        d();
    }

    public void a(int i, int i2) {
        this.c.put(Integer.valueOf(i), Integer.valueOf(i2));
        u.c(new agm.a(i2, i));
    }

    public int a(int i) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            return this.c.get(Integer.valueOf(i)).intValue();
        }
        return 0;
    }
}
