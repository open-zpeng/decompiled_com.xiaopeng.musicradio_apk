package com.xiaopeng.speech.protocol.query.speech;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechSensorQuery_Processor implements IQueryProcessor {
    private SpeechSensorQuery a;

    public SpeechSensorQuery_Processor(SpeechSensorQuery speechSensorQuery) {
        this.a = speechSensorQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1914865600:
                if (str.equals("speech.sound.location")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1584155906:
                if (str.equals("speech.scene.switch.status")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1563492784:
                if (str.equals("is.userexpression.opened")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -414885244:
                if (str.equals("speech.current.mode")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -323965442:
                if (str.equals("speech.enable.wakeup")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 386767985:
                if (str.equals("speech.get.car.platform")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 907076707:
                if (str.equals("tts.engine.status")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1205362780:
                if (str.equals("speech.account.login")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1352584367:
                if (str.equals("speech.app.query")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1717410403:
                if (str.equals("app.is.installed")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1990811260:
                if (str.equals("speech.first.status")) {
                    c = 7;
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
                return Boolean.valueOf(this.a.e(str, str2));
            case 4:
                return Integer.valueOf(this.a.f(str, str2));
            case 5:
                return this.a.g(str, str2);
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Integer.valueOf(this.a.i(str, str2));
            case '\b':
                return Integer.valueOf(this.a.j(str, str2));
            case '\t':
                return Boolean.valueOf(this.a.k(str, str2));
            case '\n':
                return Boolean.valueOf(this.a.l(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"speech.sound.location", "speech.app.query", "speech.account.login", "speech.enable.wakeup", "speech.current.mode", "speech.get.car.platform", "speech.scene.switch.status", "speech.first.status", "tts.engine.status", "app.is.installed", "is.userexpression.opened"};
    }
}
