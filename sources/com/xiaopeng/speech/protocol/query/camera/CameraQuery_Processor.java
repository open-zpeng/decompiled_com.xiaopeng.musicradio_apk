package com.xiaopeng.speech.protocol.query.camera;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class CameraQuery_Processor implements IQueryProcessor {
    private CameraQuery a;

    public CameraQuery_Processor(CameraQuery cameraQuery) {
        this.a = cameraQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1268994260:
                if (str.equals("camera.three.d.support")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -504669293:
                if (str.equals("camera.support.top.status")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -94871978:
                if (str.equals("camera.is.recording")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -9645022:
                if (str.equals("camera.transparent.chassis.support")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 180040983:
                if (str.equals("camera.business.status")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1273362324:
                if (str.equals("camera.support.rear.status")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1391541314:
                if (str.equals("camera.support.panoramic.status")) {
                    c = 1;
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
                return Integer.valueOf(this.a.c(str, str2));
            case 2:
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return Integer.valueOf(this.a.e(str, str2));
            case 4:
                return Integer.valueOf(this.a.f(str, str2));
            case 5:
                return Integer.valueOf(this.a.g(str, str2));
            case 6:
                return Boolean.valueOf(this.a.h(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"camera.support.top.status", "camera.support.panoramic.status", "camera.support.rear.status", "camera.business.status", "camera.three.d.support", "camera.transparent.chassis.support", "camera.is.recording"};
    }
}
