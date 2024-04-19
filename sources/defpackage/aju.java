package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.widget.ClickableLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
/* compiled from: FragmentMineHistoryBinding.java */
/* renamed from: aju  reason: default package */
/* loaded from: classes2.dex */
public abstract class aju extends ViewDataBinding {
    public final ClickableLoadingTipsView c;
    public final ListRecyclerView d;

    /* JADX INFO: Access modifiers changed from: protected */
    public aju(f fVar, View view, int i, ClickableLoadingTipsView clickableLoadingTipsView, ListRecyclerView listRecyclerView) {
        super(fVar, view, i);
        this.c = clickableLoadingTipsView;
        this.d = listRecyclerView;
    }
}
