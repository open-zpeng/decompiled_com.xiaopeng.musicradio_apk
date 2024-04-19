package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.netradio.concentration.allradio.view.NrAllRadioLayout;
import defpackage.beo;
/* compiled from: NrAllRadioBinder.java */
/* renamed from: aug  reason: default package */
/* loaded from: classes2.dex */
public class aug extends biv<aui, a> {
    NrAllRadioLayout a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(beo.d.netradio_item_selection_allradio, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, aui auiVar) {
        this.a = aVar.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NrAllRadioBinder.java */
    /* renamed from: aug$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        NrAllRadioLayout r;

        a(View view) {
            super(view);
            this.r = (NrAllRadioLayout) view.findViewById(beo.c.nRAllRadioLayout);
        }
    }
}
