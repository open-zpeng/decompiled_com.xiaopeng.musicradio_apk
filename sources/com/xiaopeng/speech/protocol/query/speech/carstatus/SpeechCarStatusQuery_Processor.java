package com.xiaopeng.speech.protocol.query.speech.carstatus;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechCarStatusQuery_Processor implements IQueryProcessor {
    private SpeechCarStatusQuery a;

    public SpeechCarStatusQuery_Processor(SpeechCarStatusQuery speechCarStatusQuery) {
        this.a = speechCarStatusQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1466888283:
                if (str.equals("status.ac.tempdrivervalue")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -340187300:
                if (str.equals("status.ac.qualitypurge")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 44068250:
                if (str.equals("status.ac.circulationmode")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 147719594:
                if (str.equals("status.ac.temppsnvalue")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 513100557:
                if (str.equals("status.cur.mode")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 641487541:
                if (str.equals("status.ac.power")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1438013613:
                if (str.equals("status.ac.windblowmode")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1962152437:
                if (str.equals("status.ac.windspeedlevel")) {
                    c = 5;
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
                return Integer.valueOf(this.a.b(str, str2));
            case 1:
                return Boolean.valueOf(this.a.c(str, str2));
            case 2:
                return Boolean.valueOf(this.a.d(str, str2));
            case 3:
                return Float.valueOf(this.a.e(str, str2));
            case 4:
                return Float.valueOf(this.a.f(str, str2));
            case 5:
                return Integer.valueOf(this.a.g(str, str2));
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Integer.valueOf(this.a.i(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"status.cur.mode", "status.ac.power", "status.ac.qualitypurge", "status.ac.tempdrivervalue", "status.ac.temppsnvalue", "status.ac.windspeedlevel", "status.ac.windblowmode", "status.ac.circulationmode"};
    }
}
