package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.view.banner.ChoiceBannerLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bo;
/* compiled from: BannerBinder.java */
/* renamed from: aww  reason: default package */
/* loaded from: classes2.dex */
public class aww extends biv<axa, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.d("BannerBinder", "BannerBinder onCreateViewHolder");
        View a2 = bo.a().a(ax.a.READING_BANNER_BINDER);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.layout_banner_binder, viewGroup, false);
            Log.d("BannerBinder", "BannerBinder get view by create.");
            bo.a().b(ax.a.READING_BANNER_BINDER);
        } else {
            Log.d("BannerBinder", "BannerBinder get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, axa axaVar) {
        Log.d("BannerBinder", "BannerBinder onBindViewHolder");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerBinder.java */
    /* renamed from: aww$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        ChoiceBannerLayout r;

        public a(View view) {
            super(view);
            this.r = (ChoiceBannerLayout) view.findViewById(b.d.choice_banner_view);
        }
    }
}
