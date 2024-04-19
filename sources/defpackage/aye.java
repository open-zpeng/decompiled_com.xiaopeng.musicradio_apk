package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.PlayControlView;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: SearchRoundRectAdapter.java */
/* renamed from: aye  reason: default package */
/* loaded from: classes2.dex */
public abstract class aye<T> extends axy<T, a> {
    public aye(Context context, axz axzVar) {
        super(context, a.e.item_search_roundrect_layout, axzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axy
    /* renamed from: b */
    public a a(View view) {
        return new a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchRoundRectAdapter.java */
    /* renamed from: aye$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        protected MusicCircleImageView r;
        protected XTextView s;
        protected PlayControlView t;
        protected XRelativeLayout u;
        protected XTextView v;
        protected XImageView w;

        public a(View view) {
            super(view);
            this.r = (MusicCircleImageView) view.findViewById(a.d.iv_logo);
            this.s = (XTextView) view.findViewById(a.d.tv_title);
            this.t = (PlayControlView) view.findViewById(a.d.item_play_status_layout);
            this.u = (XRelativeLayout) view.findViewById(a.d.root_layout);
            this.v = (XTextView) view.findViewById(a.d.tv_speech_num);
            this.w = (XImageView) view.findViewById(a.d.top_right_label);
        }
    }
}
