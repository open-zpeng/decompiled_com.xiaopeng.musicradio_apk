package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.bean.db.AudioLogoInfo;
import defpackage.bbi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: UsbCacheRequestManager.java */
/* renamed from: bbl  reason: default package */
/* loaded from: classes2.dex */
public abstract class bbl<T> extends bbn<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    public void a(final List<T> list, final List<String> list2, final List<String> list3) {
        Log.i("UsbCacheRequestManager", "requestLogo: " + list2);
        bbi.a().a(list2, new bbi.a() { // from class: bbl.1
            @Override // defpackage.bbi.a
            public void a(List<AudioLogoInfo> list4) {
                if (list4.size() > 0) {
                    Map g = bbl.this.g(list4);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < list2.size(); i++) {
                        if (!g.containsKey(list2.get(i))) {
                            arrayList.add(list2.get(i));
                            arrayList2.add(list3.get(i));
                        }
                    }
                    List<baw> f = bbl.this.f(list4);
                    bbl.this.a(f);
                    Log.i("UsbCacheRequestManager", "onLoadInfo1: " + f);
                    Log.i("UsbCacheRequestManager", "onLoadInfo2: " + arrayList);
                    if (arrayList.size() > 0) {
                        bbl.super.a(list, arrayList, arrayList2);
                        return;
                    } else {
                        bbl.this.e(list);
                        return;
                    }
                }
                bbl.super.a(list, list2, list3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<baw> f(List<AudioLogoInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (AudioLogoInfo audioLogoInfo : list) {
            baw bawVar = new baw();
            bawVar.a(audioLogoInfo.getName());
            bawVar.b(audioLogoInfo.getLogo());
            arrayList.add(bawVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, AudioLogoInfo> g(List<AudioLogoInfo> list) {
        HashMap hashMap = new HashMap();
        for (AudioLogoInfo audioLogoInfo : list) {
            hashMap.put(audioLogoInfo.getName(), audioLogoInfo);
        }
        return hashMap;
    }

    @Override // defpackage.bbn
    protected void b(List<baw> list) {
        Log.i("UsbCacheRequestManager", "updateCache: " + list);
        if (list.size() > 0) {
            bbi.a().a(h(list));
        }
    }

    private List<AudioLogoInfo> h(List<baw> list) {
        ArrayList arrayList = new ArrayList();
        for (baw bawVar : list) {
            AudioLogoInfo audioLogoInfo = new AudioLogoInfo();
            audioLogoInfo.setName(bawVar.a());
            audioLogoInfo.setLogo(bawVar.b());
            arrayList.add(audioLogoInfo);
        }
        return arrayList;
    }
}
