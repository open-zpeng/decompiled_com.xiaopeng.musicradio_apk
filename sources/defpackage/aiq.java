package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.datalist.h;
import com.xiaopeng.musicradio.datalist.j;
import com.xiaopeng.musicradio.datalist.m;
import com.xiaopeng.musicradio.proto.Mine;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.recyclerview.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: DataListViewProxy.java */
/* renamed from: aiq  reason: default package */
/* loaded from: classes2.dex */
public abstract class aiq<UIInterface, Presenter extends DataListPresenter<UIInterface>> extends aeu<UIInterface, Presenter> implements h, j, m, i {
    protected b h;

    protected int a(int i) {
        return i;
    }

    protected String h() {
        return null;
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public void k() {
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public boolean l() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public void setLoadMoreEnable(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public void setLoadMoreMode(int i) {
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.i
    public void setOnLoadMoreListener(i.a aVar) {
    }

    public aiq(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void d() {
        super.d();
        new b.a(this.a).a((DataListPresenter) this.c).a((i) this).a((h) this).a();
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        if ("getDataList".equals(str)) {
            boolean z = false;
            try {
                z = Mine.MineDataListReq.parseFrom(bArr).getMore();
            } catch (Throwable unused) {
            }
            a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        ((DataListPresenter) this.c).b(z);
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public void setDataHolder(b bVar) {
        this.h = bVar;
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public b getDataHolder() {
        return this.h;
    }

    @Override // com.xiaopeng.musicradio.datalist.m
    public boolean i_() {
        return c();
    }

    protected void a(f fVar, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("error", Boolean.valueOf(z));
        hashMap.put("more", Boolean.valueOf(fVar.l));
        hashMap.put("hasMore", Boolean.valueOf(fVar.n));
        hashMap.put("dataList", fVar.o == null ? new ArrayList() : fVar.o);
        hashMap.put("total", Integer.valueOf(a(fVar.f)));
        c_("OnDataListLoaded", z.a(hashMap));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error", false);
        hashMap.put("more", false);
        hashMap.put("hasMore", false);
        hashMap.put("dataList", list);
        hashMap.put("total", Integer.valueOf(a(list.size())));
        c_("OnDataListLoaded", z.a(hashMap));
    }

    public void a(f fVar) {
        a(fVar, false);
        String h = h();
        if (TextUtils.isEmpty(h)) {
            return;
        }
        a(h, fVar, false);
    }

    @Override // com.xiaopeng.musicradio.datalist.j
    public void b(f fVar) {
        a(fVar, true);
        String h = h();
        if (TextUtils.isEmpty(h)) {
            return;
        }
        a(h, fVar, true);
    }

    protected void a(String str, f fVar, boolean z) {
        a(str, amb.a(str, z, fVar.l, fVar.n, fVar.o == null ? new ArrayList() : fVar.o, a(fVar.f)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, List list) {
        ArrayList arrayList = list == null ? new ArrayList() : list;
        a(str, amb.a(str, false, false, false, arrayList, a(arrayList.size())));
    }
}
