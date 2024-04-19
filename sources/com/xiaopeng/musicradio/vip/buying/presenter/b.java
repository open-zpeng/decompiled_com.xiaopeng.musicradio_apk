package com.xiaopeng.musicradio.vip.buying.presenter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.widget.lifecycle.e;
/* compiled from: XmlyVipBuyingPresenter.java */
/* loaded from: classes2.dex */
public class b extends e<Object> {
    public void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:" + str.replaceAll(" ", "")));
        intent.setFlags(C.ENCODING_PCM_MU_LAW);
        context.startActivity(intent);
    }
}
