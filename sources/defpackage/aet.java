package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.v;
import defpackage.aen;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RvShallowDataAdapter.java */
/* renamed from: aet  reason: default package */
/* loaded from: classes2.dex */
public abstract class aet<K extends aen, T extends RecyclerView.v> extends aer<K, T> {
    public aet(Context context, int i) {
        super(context, i);
    }

    @Override // defpackage.aer
    protected List<K> b(List<K> list) {
        ArrayList arrayList = new ArrayList();
        for (K k : list) {
            arrayList.add((aen) k.clone());
        }
        return arrayList;
    }
}
