package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: LayoutWebViewFailBinding.java */
/* renamed from: bdq  reason: default package */
/* loaded from: classes2.dex */
public abstract class bdq extends ViewDataBinding {
    public final XButton c;
    public final XLinearLayout d;
    public final XImageView e;
    public final XTextView f;
    public final XTextView g;

    /* JADX INFO: Access modifiers changed from: protected */
    public bdq(f fVar, View view, int i, XButton xButton, XLinearLayout xLinearLayout, XImageView xImageView, XTextView xTextView, XTextView xTextView2) {
        super(fVar, view, i);
        this.c = xButton;
        this.d = xLinearLayout;
        this.e = xImageView;
        this.f = xTextView;
        this.g = xTextView2;
    }
}
