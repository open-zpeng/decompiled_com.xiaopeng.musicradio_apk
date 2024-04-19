package com.xiaopeng.speech.protocol.query.phone;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class PhoneQuery_Processor implements IQueryProcessor {
    private PhoneQuery a;

    public PhoneQuery_Processor(PhoneQuery phoneQuery) {
        this.a = phoneQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -991919164) {
            if (str.equals("gui.page.open.btphone")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 579161930) {
            if (hashCode == 1113652927 && str.equals("phone.get.contact.sync.status")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("phone.get.bluetooth.status")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return Integer.valueOf(this.a.b(str, str2));
            case 1:
                return Boolean.valueOf(this.a.c(str, str2));
            case 2:
                return Integer.valueOf(this.a.d(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"gui.page.open.btphone", "phone.get.bluetooth.status", "phone.get.contact.sync.status"};
    }
}
