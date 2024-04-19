package com.xiaopeng.speech.protocol.query.speech.camera;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechCameraQuery_Processor implements IQueryProcessor {
    private SpeechCameraQuery a;

    public SpeechCameraQuery_Processor(SpeechCameraQuery speechCameraQuery) {
        this.a = speechCameraQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2010416950:
                if (str.equals("camera.angle")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 137950515:
                if (str.equals("camera.height.state")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 753266552:
                if (str.equals("camera.display.mode")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1558434298:
                if (str.equals("camera.roof.position")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1886102880:
                if (str.equals("camera.roof.state")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1936425711:
                if (str.equals("camera.has.pano")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1936498769:
                if (str.equals("camera.has.roof")) {
                    c = 4;
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
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return Boolean.valueOf(this.a.e(str, str2));
            case 4:
                return Boolean.valueOf(this.a.f(str, str2));
            case 5:
                return Integer.valueOf(this.a.g(str, str2));
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"camera.angle", "camera.height.state", "camera.display.mode", "camera.has.pano", "camera.has.roof", "camera.roof.state", "camera.roof.position"};
    }
}
