package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.musicradio.widget.ClickableLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
/* compiled from: ActivityProgramListBinding.java */
/* renamed from: ajq  reason: default package */
/* loaded from: classes2.dex */
public abstract class ajq extends ViewDataBinding {
    public final ClickableLoadingTipsView c;
    public final ListRecyclerView d;
    public final MineTitleBarLayout e;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajq(f fVar, View view, int i, ClickableLoadingTipsView clickableLoadingTipsView, ListRecyclerView listRecyclerView, MineTitleBarLayout mineTitleBarLayout) {
        super(fVar, view, i);
        this.c = clickableLoadingTipsView;
        this.d = listRecyclerView;
        this.e = mineTitleBarLayout;
    }
}
