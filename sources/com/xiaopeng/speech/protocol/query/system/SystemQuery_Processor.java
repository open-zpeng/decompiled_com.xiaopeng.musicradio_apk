package com.xiaopeng.speech.protocol.query.system;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SystemQuery_Processor implements IQueryProcessor {
    private SystemQuery a;

    public SystemQuery_Processor(SystemQuery systemQuery) {
        this.a = systemQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2146663530:
                if (str.equals("system.screen.current")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2111346675:
                if (str.equals("system.screen.brightness.max.value")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1976339039:
                if (str.equals("system.music.sound.direction.is.support")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1613537166:
                if (str.equals("system.volume.max.value")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1541034698:
                if (str.equals("system.current.nedc.status")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1469262005:
                if (str.equals("system.sound.scene.is.support")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1423951429:
                if (str.equals("gui.page.open.settings")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1338868101:
                if (str.equals("system.screen.brightness.min.value")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -965726840:
                if (str.equals("system.music.sound.direction.status")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -884498389:
                if (str.equals("system.headrest.driver.mode.is.support")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -853478350:
                if (str.equals("system.sound.scene.status")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -841058592:
                if (str.equals("system.volume.min.value")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -813486830:
                if (str.equals("system.headrest.driver.mode.status")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -701436316:
                if (str.equals("system.icm.brightness.max.value")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -668448824:
                if (str.equals("system.intelligent.dark.light.adapt")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -540074940:
                if (str.equals("system.volume.current")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -288490975:
                if (str.equals("system.settings.auto.screen.status")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -183670776:
                if (str.equals("system.music.sound.effect.status")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 71042258:
                if (str.equals("system.icm.brightness.min.value")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 148702545:
                if (str.equals("system.tips.volume")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1473884338:
                if (str.equals("system.music.is.playing")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1521446945:
                if (str.equals("system.music.sound.effect.is.support")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1587476973:
                if (str.equals("system.music.sound.effect.model.status")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1606123190:
                if (str.equals("system.icm.brightness.current")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1832379462:
                if (str.equals("system.music.sound.effect.dynaudio.is.support")) {
                    c = '\r';
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
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Integer.valueOf(this.a.i(str, str2));
            case '\b':
                return Integer.valueOf(this.a.j(str, str2));
            case '\t':
                return Integer.valueOf(this.a.k(str, str2));
            case '\n':
                return Integer.valueOf(this.a.l(str, str2));
            case 11:
                return Integer.valueOf(this.a.m(str, str2));
            case '\f':
                return Integer.valueOf(this.a.n(str, str2));
            case '\r':
                return Integer.valueOf(this.a.o(str, str2));
            case 14:
                return Integer.valueOf(this.a.p(str, str2));
            case 15:
                return Integer.valueOf(this.a.q(str, str2));
            case 16:
                return Integer.valueOf(this.a.r(str, str2));
            case 17:
                return Integer.valueOf(this.a.s(str, str2));
            case 18:
                return Integer.valueOf(this.a.t(str, str2));
            case 19:
                return Integer.valueOf(this.a.u(str, str2));
            case 20:
                return Integer.valueOf(this.a.v(str, str2));
            case 21:
                return Integer.valueOf(this.a.w(str, str2));
            case 22:
                return Integer.valueOf(this.a.x(str, str2));
            case 23:
                return Integer.valueOf(this.a.y(str, str2));
            case 24:
                return Integer.valueOf(this.a.z(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"system.screen.current", "system.screen.brightness.max.value", "system.screen.brightness.min.value", "system.icm.brightness.current", "system.icm.brightness.max.value", "system.icm.brightness.min.value", "system.volume.current", "system.volume.max.value", "system.volume.min.value", "system.tips.volume", "gui.page.open.settings", "system.music.is.playing", "system.music.sound.effect.model.status", "system.music.sound.effect.dynaudio.is.support", "system.music.sound.effect.is.support", "system.music.sound.effect.status", "system.sound.scene.is.support", "system.sound.scene.status", "system.headrest.driver.mode.is.support", "system.headrest.driver.mode.status", "system.music.sound.direction.is.support", "system.music.sound.direction.status", "system.settings.auto.screen.status", "system.current.nedc.status", "system.intelligent.dark.light.adapt"};
    }
}
