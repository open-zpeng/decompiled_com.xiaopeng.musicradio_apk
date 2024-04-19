package defpackage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.view.guesslike.GuessLikeLayout;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bo;
/* compiled from: GuessLikeBinder.java */
/* renamed from: awx  reason: default package */
/* loaded from: classes2.dex */
public class awx extends biv<axb, a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    /* renamed from: a */
    public a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.d("GuessLikeBinder", "GuessLikeBinder onCreateViewHolder");
        View a2 = bo.a().a(ax.a.READING_GUESS_LIKE_BINDER);
        if (a2 == null) {
            a2 = LayoutInflater.from(viewGroup.getContext()).inflate(b.e.layout_guess_like_binder, viewGroup, false);
            Log.d("GuessLikeBinder", "GuessLikeBinder get view by create.");
            bo.a().b(ax.a.READING_GUESS_LIKE_BINDER);
        } else {
            Log.d("GuessLikeBinder", "GuessLikeBinder get view from cache.");
        }
        return new a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.biv
    public void a(a aVar, axb axbVar) {
        Log.d("GuessLikeBinder", "GuessLikeBinder onBindViewHolder");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GuessLikeBinder.java */
    /* renamed from: awx$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        GuessLikeLayout r;

        public a(View view) {
            super(view);
            this.r = (GuessLikeLayout) view.findViewById(b.d.guess_like_layout);
        }
    }
}
