package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
/* compiled from: FragmentMineMainBinding.java */
/* renamed from: ajw  reason: default package */
/* loaded from: classes2.dex */
public abstract class ajw extends ViewDataBinding {
    public final FrameLayout c;
    public final ListRecyclerView d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajw(f fVar, View view, int i, FrameLayout frameLayout, ListRecyclerView listRecyclerView) {
        super(fVar, view, i);
        this.c = frameLayout;
        this.d = listRecyclerView;
    }
}
