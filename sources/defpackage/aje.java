package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.musicradio.widget.ClickableLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
/* compiled from: ActivityAlbumListBinding.java */
/* renamed from: aje  reason: default package */
/* loaded from: classes2.dex */
public abstract class aje extends ViewDataBinding {
    public final ClickableLoadingTipsView c;
    public final ListRecyclerView d;
    public final MineTitleBarLayout e;

    /* JADX INFO: Access modifiers changed from: protected */
    public aje(f fVar, View view, int i, ClickableLoadingTipsView clickableLoadingTipsView, ListRecyclerView listRecyclerView, MineTitleBarLayout mineTitleBarLayout) {
        super(fVar, view, i);
        this.c = clickableLoadingTipsView;
        this.d = listRecyclerView;
        this.e = mineTitleBarLayout;
    }
}
