package defpackage;

import android.view.View;
import android.webkit.WebView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.databinding.m;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: ActivityWebViewBinding.java */
/* renamed from: bdo  reason: default package */
/* loaded from: classes2.dex */
public abstract class bdo extends ViewDataBinding {
    public final XImageButton c;
    public final XFrameLayout d;
    public final m e;
    public final XLoading f;
    public final XTextView g;
    public final WebView h;
    public final XImageView i;
    public final XFrameLayout j;

    /* JADX INFO: Access modifiers changed from: protected */
    public bdo(f fVar, View view, int i, XImageButton xImageButton, XFrameLayout xFrameLayout, m mVar, XLoading xLoading, XTextView xTextView, WebView webView, XImageView xImageView, XFrameLayout xFrameLayout2) {
        super(fVar, view, i);
        this.c = xImageButton;
        this.d = xFrameLayout;
        this.e = mVar;
        this.f = xLoading;
        this.g = xTextView;
        this.h = webView;
        this.i = xImageView;
        this.j = xFrameLayout2;
    }
}
