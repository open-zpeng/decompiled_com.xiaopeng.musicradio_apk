package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.g;
import defpackage.aep;
import defpackage.aht;
/* compiled from: CollectedMusicAdapter.java */
/* renamed from: aie  reason: default package */
/* loaded from: classes2.dex */
public class aie extends c<g> {
    public aie(Context context) {
        this(context, 0, null);
    }

    public aie(Context context, int i, aep.b bVar) {
        super(context, aht.d.mine_music_item_layout, i, bVar);
    }

    @Override // com.xiaopeng.musicradio.datalist.c
    public g a(View view, ViewGroup viewGroup, int i) {
        return new aix(akc.c(view));
    }
}
