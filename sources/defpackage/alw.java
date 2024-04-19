package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.g;
import defpackage.aep;
import defpackage.aht;
/* compiled from: PlaylistUserAdapter.java */
/* renamed from: alw  reason: default package */
/* loaded from: classes2.dex */
public class alw extends c<g> {
    private boolean i;
    private boolean j;
    private boolean k;

    public alw(Context context, int i, aep.b bVar, boolean z, boolean z2, boolean z3) {
        super(context, aht.d.mine_album_item_layout, i, bVar);
        this.i = z;
        this.j = false;
        this.k = z3;
    }

    @Override // defpackage.aep
    public aep.f[] g() {
        return new aep.f[]{new aep.f(1, aht.d.playlist_user_item_layout, 1)};
    }

    @Override // com.xiaopeng.musicradio.datalist.c
    public g a(View view, ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new alx(akm.c(view), this.i);
        }
        return new aiv(aka.c(view), this.i, this.j, this.k);
    }
}
