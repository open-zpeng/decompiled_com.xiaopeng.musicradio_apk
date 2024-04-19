package com.xiaopeng.speech.protocol.query.personalCenter;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class PersonalCenterQuery_Processor implements IQueryProcessor {
    private PersonalCenterQuery a;

    public PersonalCenterQuery_Processor(PersonalCenterQuery personalCenterQuery) {
        this.a = personalCenterQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1082449569) {
            if (str.equals("gui.page.open.status.personal.center")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 982269335) {
            if (hashCode == 1404633087 && str.equals("control.profile.habit.support")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("control.profile.habit.num.support")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return Integer.valueOf(this.a.b(str, str2));
            case 1:
                return Integer.valueOf(this.a.c(str, str2));
            case 2:
                return Integer.valueOf(this.a.d(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"control.profile.habit.support", "control.profile.habit.num.support", "gui.page.open.status.personal.center"};
    }
}
