package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationRadioLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bn;
import defpackage.beo;
/* compiled from: NrLocalRadioBinder.java */
/* renamed from: auh  reason: default package */
/* loaded from: classes2.dex */
public class auh extends biv<auj, a> {
    NrLocationRadioLayout a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bn.a().a(ax.a.NR_LOCATION_RADIO);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(beo.d.netradio_item_selection_localradio, viewGroup, false);
            Log.d("NrLocalRadioBinder", "get view by create.");
            bn.a().b(ax.a.NR_LOCATION_RADIO);
        } else {
            Log.d("NrLocalRadioBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, auj aujVar) {
        this.a = aVar.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NrLocalRadioBinder.java */
    /* renamed from: auh$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        NrLocationRadioLayout r;

        a(View view) {
            super(view);
            this.r = (NrLocationRadioLayout) view.findViewById(beo.c.nRLocationRadioLayout);
        }
    }
}
