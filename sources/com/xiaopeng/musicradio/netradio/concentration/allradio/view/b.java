package com.xiaopeng.musicradio.netradio.concentration.allradio.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioActPresenter;
import com.xiaopeng.musicradio.proto.Netradio;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NrAllRadioActViewProxy.java */
/* loaded from: classes.dex */
public class b extends aeu<a, NrAllRadioActPresenter> implements a {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public b(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public NrAllRadioActPresenter g() {
        Log.d("NrAllRadioActViewProxy_", "createPresenter: create P");
        return new NrAllRadioActPresenter();
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.allradio.view.a
    public void a(ArrayList<NetRadioTagInfo> arrayList) {
        Log.d("NrAllRadioActViewProxy_", "getData: " + arrayList.size());
        a(arrayList, 0);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("NrAllRadioActViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "requestAllAreaList")) {
            ((NrAllRadioActPresenter) this.c).c();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        a((ArrayList<NetRadioTagInfo>) null, 1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        a((ArrayList<NetRadioTagInfo>) null, 2);
    }

    public void a(ArrayList<NetRadioTagInfo> arrayList, int i) {
        Log.i("NrAllRadioActViewProxy_", "msgId:NrAllRadioActViewProxy_radio_area_getdatalist" + arrayList);
        Netradio.RadioTagList.a a = Netradio.RadioTagList.newBuilder().a(i);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<NetRadioTagInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                a.a(bhw.a(it.next()));
            }
        }
        a("NrAllRadioActViewProxy_radio_area_getdatalist", (AbstractMessageLite) a.build());
    }
}
