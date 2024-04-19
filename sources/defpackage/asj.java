package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: SingerTitleBinder.java */
/* renamed from: asj  reason: default package */
/* loaded from: classes2.dex */
public class asj extends biv<asl, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, asl aslVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_SINGER_TITLE);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_singer_title_layout, viewGroup, false);
            Log.d("MsRankTitleBinder", "get view by create.");
            bm.a().b(ax.a.MS_SINGER_TITLE);
        } else {
            Log.d("MsRankTitleBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingerTitleBinder.java */
    /* renamed from: asj$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        a(View view) {
            super(view);
        }
    }
}
