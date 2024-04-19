package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.musicradio.mine.widget.MusicListLogoView;
import com.xiaopeng.musicradio.widget.ClickableLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
/* compiled from: ActivityMusicListBinding.java */
/* renamed from: ajk  reason: default package */
/* loaded from: classes2.dex */
public abstract class ajk extends ViewDataBinding {
    public final XImageView c;
    public final ClickableLoadingTipsView d;
    public final MusicListLogoView e;
    public final XRelativeLayout f;
    public final ListRecyclerView g;
    public final MineTitleBarLayout h;
    public final XButton i;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajk(f fVar, View view, int i, XImageView xImageView, ClickableLoadingTipsView clickableLoadingTipsView, MusicListLogoView musicListLogoView, XRelativeLayout xRelativeLayout, ListRecyclerView listRecyclerView, MineTitleBarLayout mineTitleBarLayout, XButton xButton) {
        super(fVar, view, i);
        this.c = xImageView;
        this.d = clickableLoadingTipsView;
        this.e = musicListLogoView;
        this.f = xRelativeLayout;
        this.g = listRecyclerView;
        this.h = mineTitleBarLayout;
        this.i = xButton;
    }
}
