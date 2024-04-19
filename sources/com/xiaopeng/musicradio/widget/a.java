package com.xiaopeng.musicradio.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.xui.widget.XImageView;
/* compiled from: AccountImageAdapter.java */
/* loaded from: classes2.dex */
public class a extends aes<String, RecyclerView.v> {
    public a(Context context) {
        super(context, f.g.account_image_item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public C0181a a(ViewGroup viewGroup, int i) {
        return new C0181a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, @SuppressLint({"RecyclerView"}) int i) {
        C0181a c0181a = (C0181a) vVar;
        y.b(c0181a.s.getContext(), g(i), f.e.pic_covers_music_list_220, c0181a.s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountImageAdapter.java */
    /* renamed from: com.xiaopeng.musicradio.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0181a extends RecyclerView.v {
        private XImageView s;

        C0181a(View view) {
            super(view);
            this.s = (XImageView) this.a.findViewById(f.C0131f.tab_img);
        }
    }
}
