package com.xiaopeng.speech.protocol.query.speech.radio;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechRadioQuery_Processor implements IQueryProcessor {
    private SpeechRadioQuery a;

    public SpeechRadioQuery_Processor(SpeechRadioQuery speechRadioQuery) {
        this.a = speechRadioQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1465934626:
                if (str.equals("radio.state")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -971371186:
                if (str.equals("radio.dsp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -47471690:
                if (str.equals("radio.mode")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 928420887:
                if (str.equals("radio.volume.focus")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1543073577:
                if (str.equals("radio.frequency")) {
                    c = 3;
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
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return this.a.e(str, str2);
            case 4:
                return this.a.f(str, str2);
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"radio.dsp", "radio.state", "radio.volume.focus", "radio.frequency", "radio.mode"};
    }
}
