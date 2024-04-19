package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.g;
import defpackage.aep;
import defpackage.aht;
/* compiled from: HistoryProgramAdapter.java */
/* renamed from: alb  reason: default package */
/* loaded from: classes2.dex */
public class alb extends c<g> {
    private boolean i;

    public alb(Context context) {
        this(context, 0, null, false);
    }

    public alb(Context context, int i, aep.b bVar, boolean z) {
        super(context, aht.d.mine_program_item_layout, i, bVar);
        this.i = z;
    }

    @Override // com.xiaopeng.musicradio.datalist.c
    public g a(View view, ViewGroup viewGroup, int i) {
        return new aiz(aki.c(view), this.i);
    }
}
