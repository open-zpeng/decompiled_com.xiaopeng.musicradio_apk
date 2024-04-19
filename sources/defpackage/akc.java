package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.databinding.g;
import com.xiaopeng.musicradio.commonui.widget.ThemeBgXImageView;
import com.xiaopeng.musicradio.mine.widget.ItemPlayStatusLayout;
import com.xiaopeng.musicradio.view.mymusic.MusicListItemLabelView;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.widget.XCheckBox;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: MineMusicItemLayoutBinding.java */
/* renamed from: akc  reason: default package */
/* loaded from: classes2.dex */
public abstract class akc extends ViewDataBinding {
    public final XCheckBox c;
    public final ItemPlayStatusLayout d;
    public final ThemeBgXImageView e;
    public final XImageView f;
    public final XLoading g;
    public final MusicCircleImageView h;
    public final XImageView i;
    public final LinearLayout j;
    public final MusicListItemLabelView k;
    public final XTextView l;
    public final XImageView m;
    public final XTextView n;
    public final XTextView o;
    public final XTextView p;

    /* JADX INFO: Access modifiers changed from: protected */
    public akc(f fVar, View view, int i, XCheckBox xCheckBox, ItemPlayStatusLayout itemPlayStatusLayout, ThemeBgXImageView themeBgXImageView, XImageView xImageView, XLoading xLoading, MusicCircleImageView musicCircleImageView, XImageView xImageView2, LinearLayout linearLayout, MusicListItemLabelView musicListItemLabelView, XTextView xTextView, XImageView xImageView3, XTextView xTextView2, XTextView xTextView3, XTextView xTextView4) {
        super(fVar, view, i);
        this.c = xCheckBox;
        this.d = itemPlayStatusLayout;
        this.e = themeBgXImageView;
        this.f = xImageView;
        this.g = xLoading;
        this.h = musicCircleImageView;
        this.i = xImageView2;
        this.j = linearLayout;
        this.k = musicListItemLabelView;
        this.l = xTextView;
        this.m = xImageView3;
        this.n = xTextView2;
        this.o = xTextView3;
        this.p = xTextView4;
    }

    public static akc c(View view) {
        return a(view, g.a());
    }

    public static akc a(View view, f fVar) {
        return (akc) a(fVar, view, aht.d.mine_music_item_layout);
    }
}
