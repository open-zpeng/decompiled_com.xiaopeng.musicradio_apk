package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: FragmentMinePlaylistBinding.java */
/* renamed from: ajy  reason: default package */
/* loaded from: classes2.dex */
public abstract class ajy extends ViewDataBinding {
    public final XTextView c;
    public final MineLoadingTipsView d;
    public final RelativeLayout e;
    public final ListRecyclerView f;
    public final XTextView g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajy(f fVar, View view, int i, XTextView xTextView, MineLoadingTipsView mineLoadingTipsView, RelativeLayout relativeLayout, ListRecyclerView listRecyclerView, XTextView xTextView2) {
        super(fVar, view, i);
        this.c = xTextView;
        this.d = mineLoadingTipsView;
        this.e = relativeLayout;
        this.f = listRecyclerView;
        this.g = xTextView2;
    }
}
