package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.databinding.g;
import com.xiaopeng.musicradio.mine.widget.AlbumPlayStatusButton;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: MineProgramItemLayoutBinding.java */
/* renamed from: aki  reason: default package */
/* loaded from: classes2.dex */
public abstract class aki extends ViewDataBinding {
    public final XImageButton c;
    public final AlbumPlayStatusButton d;
    public final MusicCircleImageView e;
    public final XImageView f;
    public final XImageView g;
    public final XImageView h;
    public final XTextView i;
    public final XTextView j;

    /* JADX INFO: Access modifiers changed from: protected */
    public aki(f fVar, View view, int i, XImageButton xImageButton, AlbumPlayStatusButton albumPlayStatusButton, MusicCircleImageView musicCircleImageView, XImageView xImageView, XImageView xImageView2, XImageView xImageView3, XTextView xTextView, XTextView xTextView2) {
        super(fVar, view, i);
        this.c = xImageButton;
        this.d = albumPlayStatusButton;
        this.e = musicCircleImageView;
        this.f = xImageView;
        this.g = xImageView2;
        this.h = xImageView3;
        this.i = xTextView;
        this.j = xTextView2;
    }

    public static aki c(View view) {
        return a(view, g.a());
    }

    public static aki a(View view, f fVar) {
        return (aki) a(fVar, view, aht.d.mine_program_item_layout);
    }
}
