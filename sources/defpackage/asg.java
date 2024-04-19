package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmTitleLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bm;
/* compiled from: MsRmTitleBinder.java */
/* renamed from: asg  reason: default package */
/* loaded from: classes2.dex */
public class asg extends biv<arr, a> {
    private aru a;
    private MsRmTitleLayout b;

    public asg(aru aruVar) {
        this.a = aruVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2 = bm.a().a(ax.a.MS_RM_TITLE);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.music_item_rm_title_layout, viewGroup, false);
            Log.d("MsRmBinder", "get view by create.");
            bm.a().b(ax.a.MS_RM_TITLE);
        } else {
            Log.d("MsRmBinder", "get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, arr arrVar) {
        aVar.r.setFragment(this.a);
        this.b = aVar.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MsRmTitleBinder.java */
    /* renamed from: asg$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private MsRmTitleLayout r;

        a(View view) {
            super(view);
            this.r = (MsRmTitleLayout) view.findViewById(b.d.rm_title_layout);
        }
    }
}
