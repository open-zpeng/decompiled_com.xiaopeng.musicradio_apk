package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.xpplay.view.XpPlayTitleLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: XpPlayTitleBinder.java */
/* renamed from: asn  reason: default package */
/* loaded from: classes2.dex */
public class asn extends biv<asp, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_XP_PLAY_TITLE);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_xp_play_title_layout, viewGroup, false);
            Log.d("MsXpPlayTitleBinder", "get view by create.");
            bm.a().b(ax.a.MS_XP_PLAY_TITLE);
        } else {
            Log.d("MsXpPlayTitleBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, asp aspVar) {
        aVar.r.a(aspVar.a(), aspVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: XpPlayTitleBinder.java */
    /* renamed from: asn$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private XpPlayTitleLayout r;

        a(View view) {
            super(view);
            this.r = (XpPlayTitleLayout) view.findViewById(b.d.xp_play_layout);
        }
    }
}
