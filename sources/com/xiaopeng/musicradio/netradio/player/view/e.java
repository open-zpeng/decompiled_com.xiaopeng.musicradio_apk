package com.xiaopeng.musicradio.netradio.player.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.netradio.player.presenter.NetRadioPlayListPresenter;
import com.xiaopeng.musicradio.proto.Player;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NetRadioPlayListViewProxy.java */
/* loaded from: classes2.dex */
public class e extends aeu<com.xiaopeng.musicradio.netradio.player.view.a, NetRadioPlayListPresenter> implements com.xiaopeng.musicradio.netradio.player.view.a {
    private List<NetRadioProgramInfo> e;

    /* compiled from: NetRadioPlayListViewProxy.java */
    /* loaded from: classes2.dex */
    public static class a {
        public int a;
        public String b;
        public String c;
        public String d;
        public int e;
        public String f;
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.a
    public void R_() {
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.a
    public void S_() {
    }

    public e(Context context, String str) {
        super(context, str);
        this.e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public NetRadioPlayListPresenter g() {
        return new NetRadioPlayListPresenter();
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.a
    public void a(List<NetRadioProgramInfo> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (NetRadioProgramInfo netRadioProgramInfo : list) {
            a aVar = new a();
            aVar.a = netRadioProgramInfo.getId();
            aVar.d = netRadioProgramInfo.getEndTime();
            aVar.c = netRadioProgramInfo.getStartTime();
            aVar.b = netRadioProgramInfo.getName();
            aVar.e = netRadioProgramInfo.getType();
            aVar.f = netRadioProgramInfo.getDayOfWeek();
            arrayList.add(aVar);
        }
        this.e.clear();
        this.e.addAll(list);
        Player.NetRadioPlayList.a newBuilder = Player.NetRadioPlayList.newBuilder();
        for (NetRadioProgramInfo netRadioProgramInfo2 : list) {
            newBuilder.a(Player.NetRadioPlayInfo.newBuilder().a(netRadioProgramInfo2.getId()).c(be.e(netRadioProgramInfo2.getEndTime())).b(be.e(netRadioProgramInfo2.getStartTime())).a(be.e(netRadioProgramInfo2.getName())).b(netRadioProgramInfo2.getType()).d(be.e(netRadioProgramInfo2.getDayOfWeek())).build());
        }
        a("NetRadioPlayListViewProxy_player_netradio_updatelist", (AbstractMessageLite) newBuilder.build());
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.a
    public void a(int i, int i2) {
        a("NetRadioPlayListViewProxy_player_netradio_refreshstate", (AbstractMessageLite) Player.NetRadioPlayStatus.newBuilder().a(i).b(i2).build());
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        Log.i("NetRadioPlayListViewPro", "monoMessage: " + str + " value = " + bArr);
        try {
            if ("playOrPause".equals(str)) {
                a(Player.NetRadioPlayInfo.parseFrom(bArr));
            } else if (TextUtils.equals("getCurrent", str)) {
                ((NetRadioPlayListPresenter) this.c).c();
            }
        } catch (Exception e) {
            Log.e("NetRadioPlayListViewPro", "monoMessage: ", e);
        }
    }

    private void a(Player.NetRadioPlayInfo netRadioPlayInfo) {
        if (netRadioPlayInfo != null) {
            for (NetRadioProgramInfo netRadioProgramInfo : this.e) {
                if (netRadioPlayInfo.getId() == netRadioProgramInfo.getId() && TextUtils.equals(netRadioPlayInfo.getStartTime(), netRadioProgramInfo.getStartTime()) && TextUtils.equals(netRadioPlayInfo.getDayOfWeek(), netRadioProgramInfo.getDayOfWeek())) {
                    ((NetRadioPlayListPresenter) this.c).a(netRadioProgramInfo);
                    return;
                }
            }
        }
    }
}
