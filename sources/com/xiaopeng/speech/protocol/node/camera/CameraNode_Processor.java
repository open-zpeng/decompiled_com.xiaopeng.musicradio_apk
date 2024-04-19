package com.xiaopeng.speech.protocol.node.camera;

import com.xiaopeng.speech.annotation.ICommandProcessor;
/* loaded from: classes2.dex */
public class CameraNode_Processor implements ICommandProcessor {
    private CameraNode a;

    public CameraNode_Processor(CameraNode cameraNode) {
        this.a = cameraNode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public void a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1960069370:
                if (str.equals("command://camera.front.take")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1876486015:
                if (str.equals("command://camera.photoalbum.open")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1734758414:
                if (str.equals("command://camera.top.on")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1275719440:
                if (str.equals("command://camera.transparent.chassis")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1212502159:
                if (str.equals("command://camera.transparent.chassis.off")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1080240309:
                if (str.equals("command://camera.right.on")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1041501812:
                if (str.equals("command://camera.left.on")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -886954978:
                if (str.equals("command://camera.front.on")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -655385126:
                if (str.equals("command://camera.top.take")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -499850625:
                if (str.equals("command://camera.rear.off")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -392525311:
                if (str.equals("command://camera.rear.on.new")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -313369279:
                if (str.equals("command://camera.rear.record")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -155721484:
                if (str.equals("command://camera.left.take")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -16124209:
                if (str.equals("command://camera.rear.on")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 184229895:
                if (str.equals("command://camera.top.rotate.left")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 184408484:
                if (str.equals("command://camera.top.rotate.rear")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 446223610:
                if (str.equals("command://camera.overall.on")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 621719934:
                if (str.equals("command://camera.left.record")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1207813021:
                if (str.equals("command://camera.transparent.chassis.on")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1271288563:
                if (str.equals("command://camera.right.take")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1411014185:
                if (str.equals("command://camera.top.rotate.front")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1421820444:
                if (str.equals("command://camera.top.rotate.right")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1584286675:
                if (str.equals("command://camera.three.d.on")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1684644215:
                if (str.equals("command://camera.rear.take")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1810189072:
                if (str.equals("command://camera.front.record")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1868246523:
                if (str.equals("command://camera.three.d.off")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1883807677:
                if (str.equals("command://camera.right.record")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2057063868:
                if (str.equals("command://camera.top.off")) {
                    c = 15;
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
                this.a.b(str, str2);
                return;
            case 1:
                this.a.c(str, str2);
                return;
            case 2:
                this.a.d(str, str2);
                return;
            case 3:
                this.a.e(str, str2);
                return;
            case 4:
                this.a.f(str, str2);
                return;
            case 5:
                this.a.g(str, str2);
                return;
            case 6:
                this.a.h(str, str2);
                return;
            case 7:
                this.a.i(str, str2);
                return;
            case '\b':
                this.a.j(str, str2);
                return;
            case '\t':
                this.a.k(str, str2);
                return;
            case '\n':
                this.a.l(str, str2);
                return;
            case 11:
                this.a.m(str, str2);
                return;
            case '\f':
                this.a.n(str, str2);
                return;
            case '\r':
                this.a.o(str, str2);
                return;
            case 14:
                this.a.p(str, str2);
                return;
            case 15:
                this.a.q(str, str2);
                return;
            case 16:
                this.a.r(str, str2);
                return;
            case 17:
                this.a.s(str, str2);
                return;
            case 18:
                this.a.t(str, str2);
                return;
            case 19:
                this.a.u(str, str2);
                return;
            case 20:
                this.a.v(str, str2);
                return;
            case 21:
                this.a.w(str, str2);
                return;
            case 22:
                this.a.x(str, str2);
                return;
            case 23:
                this.a.y(str, str2);
                return;
            case 24:
                this.a.z(str, str2);
                return;
            case 25:
                this.a.A(str, str2);
                return;
            case 26:
                this.a.B(str, str2);
                return;
            case 27:
                this.a.C(str, str2);
                return;
            default:
                return;
        }
    }

    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public String[] a() {
        return new String[]{"command://camera.overall.on", "command://camera.rear.take", "command://camera.rear.record", "command://camera.front.take", "command://camera.front.record", "command://camera.left.take", "command://camera.left.record", "command://camera.right.take", "command://camera.right.record", "command://camera.left.on", "command://camera.right.on", "command://camera.rear.on", "command://camera.rear.on.new", "command://camera.front.on", "command://camera.rear.off", "command://camera.top.off", "command://camera.top.on", "command://camera.top.take", "command://camera.top.rotate.left", "command://camera.top.rotate.right", "command://camera.top.rotate.front", "command://camera.top.rotate.rear", "command://camera.transparent.chassis", "command://camera.three.d.on", "command://camera.three.d.off", "command://camera.transparent.chassis.on", "command://camera.transparent.chassis.off", "command://camera.photoalbum.open"};
    }
}
