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
/* compiled from: MineAlbumItemLayoutBinding.java */
/* renamed from: aka  reason: default package */
/* loaded from: classes2.dex */
public abstract class aka extends ViewDataBinding {
    public final XImageButton c;
    public final XTextView d;
    public final AlbumPlayStatusButton e;
    public final MusicCircleImageView f;
    public final XImageView g;
    public final XFrameLayout h;
    public final XTextView i;
    public final XTextView j;

    /* JADX INFO: Access modifiers changed from: protected */
    public aka(f fVar, View view, int i, XImageButton xImageButton, XTextView xTextView, AlbumPlayStatusButton albumPlayStatusButton, MusicCircleImageView musicCircleImageView, XImageView xImageView, XFrameLayout xFrameLayout, XTextView xTextView2, XTextView xTextView3) {
        super(fVar, view, i);
        this.c = xImageButton;
        this.d = xTextView;
        this.e = albumPlayStatusButton;
        this.f = musicCircleImageView;
        this.g = xImageView;
        this.h = xFrameLayout;
        this.i = xTextView2;
        this.j = xTextView3;
    }

    public static aka c(View view) {
        return a(view, g.a());
    }

    public static aka a(View view, f fVar) {
        return (aka) a(fVar, view, aht.d.mine_album_item_layout);
    }
}
