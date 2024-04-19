package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.playercomponent.big.view.j;
import java.util.Arrays;
import java.util.List;
/* compiled from: ShareCommunityProxyFactory.java */
/* renamed from: avr  reason: default package */
/* loaded from: classes2.dex */
public class avr implements aew {
    @Override // defpackage.aew
    public aev a(String str) {
        Log.i("ShareCommunityProxyFactory", "createViewProxy: " + str);
        if (TextUtils.equals("ShareCommunityViewProxy", str)) {
            return new j(a.a(), str);
        }
        return null;
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("ShareCommunityViewProxy", "ShareCommunityViewProxy");
    }
}
