package com.xiaopeng.musicradio.netradio.concentration.localradio.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.netradio.concentration.localradio.presenter.NrLocationRadioPresenter;
import com.xiaopeng.musicradio.proto.Netradio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: NrLocalRadioViewProxy.java */
/* loaded from: classes.dex */
public class b extends aeu<a, NrLocationRadioPresenter> implements a {
    @Override // com.xiaopeng.musicradio.netradio.concentration.localradio.view.a
    public void L_() {
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.localradio.view.a
    public void M_() {
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.localradio.view.a
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public b(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public NrLocationRadioPresenter g() {
        Log.d("NrLocalRadioViewProxy_", "createPresenter: create P");
        return new NrLocationRadioPresenter();
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.localradio.view.a
    public void a(ArrayList<NetRadioInfo> arrayList, int i, boolean z) {
        Log.d("NrLocalRadioViewProxy_", "getData: " + arrayList.size());
        a(arrayList, 0);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("NrLocalRadioViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "requestLocalRadioList")) {
            ((NrLocationRadioPresenter) this.c).c();
        } else if (TextUtils.equals(str, "playByIndex")) {
            try {
                int index = Netradio.PlayIndex.parseFrom(bArr).getIndex();
                Log.i("NrLocalRadioViewProxy_", "byte monoMessage index: " + index);
                a(index);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
                Log.e("NrLocalRadioViewProxy_", "byte monoMessage key: " + e.getMessage());
            }
        }
    }

    public void a(final int i) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.view.b.1
            @Override // java.lang.Runnable
            public void run() {
                new ArrayList();
                List g = ((NrLocationRadioPresenter) b.this.c).g();
                if (g.size() != 0) {
                    NetRadioInfo netRadioInfo = null;
                    int i2 = i;
                    if (i2 >= 0 && i2 < g.size()) {
                        netRadioInfo = (NetRadioInfo) g.get(i);
                    }
                    ((NrLocationRadioPresenter) b.this.c).a(netRadioInfo);
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        a((ArrayList<NetRadioInfo>) null, 1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        a((ArrayList<NetRadioInfo>) null, 2);
    }

    public void a(ArrayList<NetRadioInfo> arrayList, int i) {
        Log.i("NrLocalRadioViewProxy_", "msgId:NrLocalRadioViewProxy_radio_local_getdatalist" + arrayList);
        Netradio.RadioInfoList.a b = Netradio.RadioInfoList.newBuilder().a(i).b(((NrLocationRadioPresenter) this.c).h());
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<NetRadioInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                b.a(bhw.a(it.next()));
            }
        }
        a("NrLocalRadioViewProxy_radio_local_getdatalist", (AbstractMessageLite) b.build());
    }
}
