package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.databinding.g;
import com.xiaopeng.musicradio.commonui.widget.ThemeBgXImageView;
import com.xiaopeng.musicradio.mine.widget.ItemPlayStatusLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: MineMusicItemMainLayoutBinding.java */
/* renamed from: ake  reason: default package */
/* loaded from: classes2.dex */
public abstract class ake extends ViewDataBinding {
    public final ItemPlayStatusLayout c;
    public final ThemeBgXImageView d;
    public final XImageView e;
    public final XLoading f;
    public final XTextView g;
    public final XImageView h;
    public final XTextView i;
    public final XTextView j;
    public final XTextView k;

    /* JADX INFO: Access modifiers changed from: protected */
    public ake(f fVar, View view, int i, ItemPlayStatusLayout itemPlayStatusLayout, ThemeBgXImageView themeBgXImageView, XImageView xImageView, XLoading xLoading, XTextView xTextView, XImageView xImageView2, XTextView xTextView2, XTextView xTextView3, XTextView xTextView4) {
        super(fVar, view, i);
        this.c = itemPlayStatusLayout;
        this.d = themeBgXImageView;
        this.e = xImageView;
        this.f = xLoading;
        this.g = xTextView;
        this.h = xImageView2;
        this.i = xTextView2;
        this.j = xTextView3;
        this.k = xTextView4;
    }

    public static ake c(View view) {
        return a(view, g.a());
    }

    public static ake a(View view, f fVar) {
        return (ake) a(fVar, view, aht.d.mine_music_item_main_layout);
    }
}
