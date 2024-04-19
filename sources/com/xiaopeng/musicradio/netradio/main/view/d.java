package com.xiaopeng.musicradio.netradio.main.view;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.lib.framework.netchannelmodule.common.TrafficStatsEntry;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.netradio.main.presenter.NrCategoryOrAreaDetailPresenter;
import com.xiaopeng.musicradio.proto.Netradio;
import java.util.List;
/* compiled from: NrAreaDetailViewProxy.java */
/* loaded from: classes2.dex */
public class d extends aeu<b, NrCategoryOrAreaDetailPresenter> implements b {
    private int e;

    @Override // com.xiaopeng.musicradio.netradio.main.view.b
    public void O_() {
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.b
    public void a(boolean z) {
    }

    public d(Context context, String str) {
        super(context, str);
        this.e = TrafficStatsEntry.LAST_NETWORK_UID;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public NrCategoryOrAreaDetailPresenter g() {
        Log.d("NrAreaDetailViewProxy_", "createPresenter: create P");
        return new NrCategoryOrAreaDetailPresenter("1", this.e);
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.b
    public void a(List<NetRadioInfo> list) {
        Log.d("NrAreaDetailViewProxy_", "getData: " + list.size());
        a(list, 0);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("NrAreaDetailViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if ("playAllAreaRadio".equalsIgnoreCase(str)) {
            NetRadioInfo f = bhx.f(bArr);
            if (f != null) {
                auo.a().a(f);
            }
        } else if ("requestAreaRadioList".equalsIgnoreCase(str)) {
            try {
                Netradio.NetRadioTagInfo parseFrom = Netradio.NetRadioTagInfo.parseFrom(bArr);
                int bizVal = parseFrom.getBizVal();
                Log.i("NrAreaDetailViewProxy_", "byte monoMessage netRadioTagInfo: " + bizVal + ",,,," + parseFrom);
                ((NrCategoryOrAreaDetailPresenter) this.c).a(bizVal);
                this.e = bizVal;
                ((NrCategoryOrAreaDetailPresenter) this.c).c();
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        a((List<NetRadioInfo>) null, 1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        a((List<NetRadioInfo>) null, 2);
    }

    private void a(int i) {
        Log.i("GetAreaData", "ShowLoadingTip" + i);
    }

    public void a(List<NetRadioInfo> list, int i) {
        Log.i("NrAreaDetailViewProxy_", "msgId:NrAreaDetailViewProxy_radio_arearadio_getdatalist" + list);
        Netradio.RadioInfoList.a a = Netradio.RadioInfoList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (NetRadioInfo netRadioInfo : list) {
                a.a(bhw.a(netRadioInfo));
            }
        }
        a("NrAreaDetailViewProxy_radio_arearadio_getdatalist", (AbstractMessageLite) a.build());
    }
}
