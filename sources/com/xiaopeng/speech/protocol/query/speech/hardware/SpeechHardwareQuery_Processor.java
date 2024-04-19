package com.xiaopeng.speech.protocol.query.speech.hardware;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechHardwareQuery_Processor implements IQueryProcessor {
    private SpeechHardwareQuery a;

    public SpeechHardwareQuery_Processor(SpeechHardwareQuery speechHardwareQuery) {
        this.a = speechHardwareQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1802748326:
                if (str.equals("hardware.car.type")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1289226848:
                if (str.equals("hardware.cpu.temp")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -147500196:
                if (str.equals("hardware.roll.speed")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 412745551:
                if (str.equals("hardware.ctrl.curr")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 413236465:
                if (str.equals("hardware.ctrl.temp")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 413305630:
                if (str.equals("hardware.ctrl.volt")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1437417016:
                if (str.equals("hardware.ipu.fail.info")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1466238608:
                if (str.equals("hardware.mcu.id")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1677700304:
                if (str.equals("hardware.torque")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1749101026:
                if (str.equals("hardware.stream.type")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2019491538:
                if (str.equals("hardware.motor.state")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2120141088:
                if (str.equals("hardware.checklist")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2143370611:
                if (str.equals("hardware.motor.temp")) {
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
                return this.a.b(str, str2);
            case 1:
                return Integer.valueOf(this.a.c(str, str2));
            case 2:
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return Double.valueOf(this.a.e(str, str2));
            case 4:
                return Double.valueOf(this.a.f(str, str2));
            case 5:
                return Integer.valueOf(this.a.g(str, str2));
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Double.valueOf(this.a.i(str, str2));
            case '\b':
                return Integer.valueOf(this.a.j(str, str2));
            case '\t':
                return Integer.valueOf(this.a.k(str, str2));
            case '\n':
                return this.a.l(str, str2);
            case 11:
                return Integer.valueOf(this.a.m(str, str2));
            case '\f':
                return Integer.valueOf(this.a.n(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"hardware.mcu.id", "hardware.cpu.temp", "hardware.ipu.fail.info", "hardware.ctrl.volt", "hardware.ctrl.curr", "hardware.ctrl.temp", "hardware.motor.temp", "hardware.torque", "hardware.roll.speed", "hardware.motor.state", "hardware.car.type", "hardware.stream.type", "hardware.checklist"};
    }
}
