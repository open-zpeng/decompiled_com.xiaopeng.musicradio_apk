package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.g;
import defpackage.aep;
import defpackage.aht;
/* compiled from: CollectedProgramAdapter.java */
/* renamed from: aik  reason: default package */
/* loaded from: classes2.dex */
public class aik extends c<g> {
    private boolean i;

    public aik(Context context) {
        this(context, 0, null, false);
    }

    public aik(Context context, int i, aep.b bVar, boolean z) {
        super(context, aht.d.mine_program_item_layout, i, bVar);
        this.i = z;
    }

    @Override // com.xiaopeng.musicradio.datalist.c
    public g a(View view, ViewGroup viewGroup, int i) {
        return new aiz(aki.c(view), this.i);
    }
}
