package com.xiaopeng.musicradio;

import com.xiaopeng.musicradio.netradio.main.view.d;
import com.xiaopeng.musicradio.netradio.main.view.e;
import com.xiaopeng.musicradio.netradio.main.view.f;
import java.util.Arrays;
import java.util.List;
/* compiled from: NrViewProxyFactory.java */
/* loaded from: classes.dex */
public class c implements aew {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aew
    public aev a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1515870491:
                if (str.equals("AreaRadios")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1449216811:
                if (str.equals("NrLocalRadioViewProxy")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1313219050:
                if (str.equals("NrCategoryDetailViewProxy")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1298276820:
                if (str.equals("CategoryDetailRadio")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1169749132:
                if (str.equals("NrBaseViewProxy")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1010365584:
                if (str.equals("LocalRadio")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -978363929:
                if (str.equals("NrCategoryViewProxy")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -465931691:
                if (str.equals("NrAllRadioActViewProxy")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 994801831:
                if (str.equals("NrAreaDetailViewProxy")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1125254525:
                if (str.equals("CategoryRadio")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1850338042:
                if (str.equals("AllRadio")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1885475560:
                if (str.equals("AreaLists")) {
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
                return new com.xiaopeng.musicradio.netradio.category.category.view.c(a.a(), str);
            case 2:
            case 3:
                return new e(a.a(), str);
            case 4:
            case 5:
                return new com.xiaopeng.musicradio.netradio.concentration.localradio.view.b(a.a(), str);
            case 6:
            case 7:
                return new com.xiaopeng.musicradio.netradio.concentration.allradio.view.b(a.a(), str);
            case '\b':
            case '\t':
                return new d(a.a(), str);
            case '\n':
            case 11:
                return new f(a.a(), str);
            default:
                return null;
        }
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("AllRadio", "LocalRadio", "CategoryRadio", "AreaList", "AreaRadio", "CategoryDetailRadio", "AreaLists", "AreaRadios", "NrCategoryViewProxy", "NrBaseViewProxy", "NrLocalRadioViewProxy", "NrAllRadioActViewProxy", "NrAreaDetailViewProxy", "NrCategoryDetailViewProxy");
    }
}
