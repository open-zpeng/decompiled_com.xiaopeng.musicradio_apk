package defpackage;

import com.xiaopeng.musicradio.a;
import java.util.Arrays;
import java.util.List;
/* compiled from: VipViewProxyFactory.java */
/* renamed from: bcs  reason: default package */
/* loaded from: classes2.dex */
public class bcs implements aew {
    @Override // defpackage.aew
    public aev a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -177778650) {
            if (hashCode == 1944418512 && str.equals("VipBuyingViewProxy")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("VipBuyingDlg")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
            case 1:
                return new bcz(a.a(), str);
            default:
                return null;
        }
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("VipBuyingDlg", "VipBuyingViewProxy");
    }
}
