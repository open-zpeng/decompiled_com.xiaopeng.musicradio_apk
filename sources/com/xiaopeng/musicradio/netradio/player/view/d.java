package com.xiaopeng.musicradio.netradio.player.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.widget.AVLoadingIndicatorView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XListSingle;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.beo;
/* compiled from: NetRadioPlayListAdapter.java */
/* loaded from: classes2.dex */
public class d extends aes<NetRadioProgramInfo, a> {
    private int f;
    private int g;
    private b h;

    /* compiled from: NetRadioPlayListAdapter.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(NetRadioProgramInfo netRadioProgramInfo);
    }

    public d(Context context) {
        super(context, beo.d.item_netradio_play_list);
        this.f = -1;
        this.g = -1;
    }

    public void e(int i, int i2) {
        int i3 = this.f;
        if (i3 != -1 && i3 != i) {
            c(i3);
            if (this.d instanceof BaseRecycleView) {
                ((BaseRecycleView) this.d).updateVuiScene();
            }
        }
        this.f = i;
        this.g = i2;
        int i4 = this.f;
        if (i4 != -1) {
            c(i4);
            if (this.d instanceof BaseRecycleView) {
                ((BaseRecycleView) this.d).updateVuiScene();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.xiaopeng.musicradio.netradio.player.view.d.a r15, int r16) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.netradio.player.view.d.a(com.xiaopeng.musicradio.netradio.player.view.d$a, int):void");
    }

    public void a(b bVar) {
        this.h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NetRadioPlayListAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        XTextView A;
        XImageView B;
        XView C;
        XConstraintLayout r;
        AVLoadingIndicatorView s;
        XTextView t;
        XListSingle u;
        View v;
        XTextView w;
        XTextView x;
        XTextView y;
        XTextView z;

        public a(View view) {
            super(view);
            this.r = (XConstraintLayout) view.findViewById(beo.c.layout_netradio_play_list_item);
            this.s = (AVLoadingIndicatorView) view.findViewById(beo.c.iv_play_list_state);
            this.t = (XTextView) view.findViewById(beo.c.tv_program);
            this.u = (XListSingle) view.findViewById(beo.c.view_bg);
            this.A = (XTextView) view.findViewById(beo.c.net_radio_list_oder);
            this.B = (XImageView) view.findViewById(beo.c.tv_index_bg);
            this.v = view.findViewById(beo.c.lottie_loading);
            this.w = (XTextView) view.findViewById(beo.c.huiting_txt);
            this.x = (XTextView) view.findViewById(beo.c.live_txt);
            this.y = (XTextView) view.findViewById(beo.c.day_text);
            this.z = (XTextView) view.findViewById(beo.c.time_text);
            this.C = (XView) view.findViewById(beo.c.iv_selected_view);
        }
    }
}
