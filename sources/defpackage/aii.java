package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.g;
import defpackage.aep;
import defpackage.aht;
/* compiled from: CollectedNetradioAdapter.java */
/* renamed from: aii  reason: default package */
/* loaded from: classes2.dex */
public class aii extends c<g> {
    private boolean i;

    public aii(Context context) {
        this(context, 0, null, false);
    }

    public aii(Context context, int i, aep.b bVar, boolean z) {
        super(context, aht.d.mine_netradio_item_layout, i, bVar);
        this.i = z;
    }

    @Override // com.xiaopeng.musicradio.datalist.c
    public g a(View view, ViewGroup viewGroup, int i) {
        return new aiy(akg.c(view), this.i);
    }
}
