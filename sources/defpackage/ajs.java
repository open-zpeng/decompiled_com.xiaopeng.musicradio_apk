package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
/* compiled from: FragmentMineCollectBinding.java */
/* renamed from: ajs  reason: default package */
/* loaded from: classes2.dex */
public abstract class ajs extends ViewDataBinding {
    public final MineLoadingTipsView c;
    public final ListRecyclerView d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajs(f fVar, View view, int i, MineLoadingTipsView mineLoadingTipsView, ListRecyclerView listRecyclerView) {
        super(fVar, view, i);
        this.c = mineLoadingTipsView;
        this.d = listRecyclerView;
    }
}
