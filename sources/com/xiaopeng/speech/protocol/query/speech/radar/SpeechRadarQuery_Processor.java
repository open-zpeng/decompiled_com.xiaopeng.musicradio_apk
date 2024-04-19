package com.xiaopeng.speech.protocol.query.speech.radar;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechRadarQuery_Processor implements IQueryProcessor {
    private SpeechRadarQuery a;

    public SpeechRadarQuery_Processor(SpeechRadarQuery speechRadarQuery) {
        this.a = speechRadarQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2090752681:
                if (str.equals("radar.front.lv")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -636748384:
                if (str.equals("radar.tail.data")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -3443915:
                if (str.equals("radar.front.fault")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 781459712:
                if (str.equals("radar.tail.lv")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 831113271:
                if (str.equals("radar.front.data")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1737485036:
                if (str.equals("radar.tail.fault")) {
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
                return this.a.b(str, str2);
            case 1:
                return this.a.c(str, str2);
            case 2:
                return this.a.d(str, str2);
            case 3:
                return this.a.e(str, str2);
            case 4:
                return this.a.f(str, str2);
            case 5:
                return this.a.g(str, str2);
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"radar.front.data", "radar.tail.data", "radar.front.lv", "radar.tail.lv", "radar.front.fault", "radar.tail.fault"};
    }
}
