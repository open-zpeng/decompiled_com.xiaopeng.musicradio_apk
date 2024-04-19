package defpackage;

import com.xiaopeng.musicradio.a;
import java.util.Arrays;
import java.util.List;
/* compiled from: LoginViewProxyFactory.java */
/* renamed from: agx  reason: default package */
/* loaded from: classes2.dex */
public class agx implements aew {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aew
    public aev a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1148866471:
                if (str.equals("WxLoginDialogViewProxy")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -40864108:
                if (str.equals("LoginManagerFragment")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 144478303:
                if (str.equals("MineLoginWxDialog")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 146690618:
                if (str.equals("XmlyLoginDialogViewProxy")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 654959710:
                if (str.equals("MineLoginQqDialog")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1010080280:
                if (str.equals("QqLoginDialogViewProxy")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1060008709:
                if (str.equals("LoginManagerViewProxy")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1090013824:
                if (str.equals("MineLoginXmlyDialog")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return new ahk(a.a(), str);
            case 2:
            case 3:
                return new ahg(a.a(), str);
            case 4:
            case 5:
                return new ahf(a.a(), str);
            case 6:
            case 7:
                return new ahh(a.a(), str);
            default:
                return null;
        }
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("LoginManagerFragment", "MineLoginWxDialog", "MineLoginQqDialog", "MineLoginXmlyDialog", "LoginManagerViewProxy", "WxLoginDialogViewProxy", "QqLoginDialogViewProxy", "XmlyLoginDialogViewProxy");
    }
}
