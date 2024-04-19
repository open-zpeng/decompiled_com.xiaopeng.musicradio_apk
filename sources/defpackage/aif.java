package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.g;
import defpackage.aht;
/* compiled from: CollectedMusicMainAdapter.java */
/* renamed from: aif  reason: default package */
/* loaded from: classes2.dex */
public class aif extends c<g> {
    public aif(Context context) {
        super(context, aht.d.mine_music_item_main_layout, 0, null);
    }

    @Override // com.xiaopeng.musicradio.datalist.c
    public g a(View view, ViewGroup viewGroup, int i) {
        return new aiw(ake.c(view));
    }
}
