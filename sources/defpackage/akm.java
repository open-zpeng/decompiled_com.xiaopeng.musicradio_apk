package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.databinding.g;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: PlaylistUserItemLayoutBinding.java */
/* renamed from: akm  reason: default package */
/* loaded from: classes2.dex */
public abstract class akm extends ViewDataBinding {
    public final XImageView c;
    public final XFrameLayout d;
    public final XRelativeLayout e;
    public final XTextView f;
    public final XTextView g;

    /* JADX INFO: Access modifiers changed from: protected */
    public akm(f fVar, View view, int i, XImageView xImageView, XFrameLayout xFrameLayout, XRelativeLayout xRelativeLayout, XTextView xTextView, XTextView xTextView2) {
        super(fVar, view, i);
        this.c = xImageView;
        this.d = xFrameLayout;
        this.e = xRelativeLayout;
        this.f = xTextView;
        this.g = xTextView2;
    }

    public static akm c(View view) {
        return a(view, g.a());
    }

    public static akm a(View view, f fVar) {
        return (akm) a(fVar, view, aht.d.playlist_user_item_layout);
    }
}
