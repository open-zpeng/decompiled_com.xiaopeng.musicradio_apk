package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.databinding.g;
import com.xiaopeng.musicradio.mine.widget.AlbumPlayStatusButton;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: MineNetradioItemLayoutBinding.java */
/* renamed from: akg  reason: default package */
/* loaded from: classes2.dex */
public abstract class akg extends ViewDataBinding {
    public final XImageButton c;
    public final AlbumPlayStatusButton d;
    public final XFrameLayout e;
    public final MusicCircleImageView f;
    public final XImageView g;
    public final XImageView h;
    public final XImageView i;
    public final XTextView j;
    public final XTextView k;

    /* JADX INFO: Access modifiers changed from: protected */
    public akg(f fVar, View view, int i, XImageButton xImageButton, AlbumPlayStatusButton albumPlayStatusButton, XFrameLayout xFrameLayout, MusicCircleImageView musicCircleImageView, XImageView xImageView, XImageView xImageView2, XImageView xImageView3, XTextView xTextView, XTextView xTextView2) {
        super(fVar, view, i);
        this.c = xImageButton;
        this.d = albumPlayStatusButton;
        this.e = xFrameLayout;
        this.f = musicCircleImageView;
        this.g = xImageView;
        this.h = xImageView2;
        this.i = xImageView3;
        this.j = xTextView;
        this.k = xTextView2;
    }

    public static akg c(View view) {
        return a(view, g.a());
    }

    public static akg a(View view, f fVar) {
        return (akg) a(fVar, view, aht.d.mine_netradio_item_layout);
    }
}
