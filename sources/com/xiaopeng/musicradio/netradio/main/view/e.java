package com.xiaopeng.musicradio.netradio.main.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioPresenter;
import com.xiaopeng.musicradio.proto.Netradio;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NrBaseViewProxy.java */
/* loaded from: classes2.dex */
public class e extends aeu<a, NrAllRadioPresenter> implements a {
    @Override // com.xiaopeng.musicradio.netradio.main.view.a
    public void P_() {
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.a
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public e(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public NrAllRadioPresenter g() {
        Log.d("NrBaseViewProxy_", "createPresenter: create P");
        return new NrAllRadioPresenter();
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.a
    public void a(List<NetRadioInfo> list) {
        Log.d("NrBaseViewProxy_", "getData: " + list);
        a(list, 0);
    }

    public void a(final int i) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.main.view.e.1
            @Override // java.lang.Runnable
            public void run() {
                new ArrayList();
                List d = ((NrAllRadioPresenter) e.this.c).d();
                if (d.size() != 0) {
                    NetRadioInfo netRadioInfo = null;
                    int i2 = i;
                    if (i2 >= 0 && i2 < d.size()) {
                        netRadioInfo = (NetRadioInfo) d.get(i);
                    }
                    Log.i("NrBaseViewProxy_", "byte monoMessage playByIndex: " + netRadioInfo);
                    auo.a().a(netRadioInfo);
                }
            }
        });
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("NrBaseViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "requestAllRadioList")) {
            ((NrAllRadioPresenter) this.c).c();
        } else if (TextUtils.equals(str, "playByIndex")) {
            try {
                int index = Netradio.PlayIndex.parseFrom(bArr).getIndex();
                Log.i("NrBaseViewProxy_", "byte monoMessage index: " + index);
                a(index);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
                Log.e("NrBaseViewProxy_", "byte monoMessage key: " + e.getMessage());
            }
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        a((List<NetRadioInfo>) null, 1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        a((List<NetRadioInfo>) null, 2);
    }

    public void a(List<NetRadioInfo> list, int i) {
        Log.i("NrBaseViewProxy_", "msgId:NrBaseViewProxy_radio_all_getdatalist" + list);
        Netradio.RadioInfoList.a a = Netradio.RadioInfoList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (NetRadioInfo netRadioInfo : list) {
                a.a(bhw.a(netRadioInfo));
            }
        }
        a("NrBaseViewProxy_radio_all_getdatalist", (AbstractMessageLite) a.build());
    }
}
