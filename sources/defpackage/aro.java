package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
import com.xiaopeng.musicradio.vip.view.VipSaleBanner;
/* compiled from: MsTopBinder.java */
/* renamed from: aro  reason: default package */
/* loaded from: classes2.dex */
public class aro extends biv<ars, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_SELECTION_TOP);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_selection_top, viewGroup, false);
            Log.d("MsTopBinder", "get view by create.");
            bm.a().b(ax.a.MS_SELECTION_TOP);
        } else {
            Log.d("MsTopBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, ars arsVar) {
        aVar.r.setVipSaleType(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MsTopBinder.java */
    /* renamed from: aro$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private VipSaleBanner r;

        a(View view) {
            super(view);
            this.r = (VipSaleBanner) view.findViewById(b.d.vipsale_banner);
        }
    }
}
