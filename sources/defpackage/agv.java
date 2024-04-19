package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.home.view.a;
import java.util.Arrays;
import java.util.List;
/* compiled from: HomeViewProxyFactory.java */
/* renamed from: agv  reason: default package */
/* loaded from: classes2.dex */
public class agv implements aew {
    @Override // defpackage.aew
    public aev a(String str) {
        char c;
        Log.i("HomeViewProxyFactory", "createViewProxy: " + str);
        int hashCode = str.hashCode();
        if (hashCode != -1095046492) {
            if (hashCode == -907007760 && str.equals("MainViewProxy")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("Home_Panel")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
            case 1:
                return new a(com.xiaopeng.musicradio.a.a(), str);
            default:
                return null;
        }
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("Home_Panel", "MainViewProxy");
    }
}
