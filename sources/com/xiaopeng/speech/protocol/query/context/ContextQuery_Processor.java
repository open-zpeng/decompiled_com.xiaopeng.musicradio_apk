package com.xiaopeng.speech.protocol.query.context;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class ContextQuery_Processor implements IQueryProcessor {
    private ContextQuery a;

    public ContextQuery_Processor(ContextQuery contextQuery) {
        this.a = contextQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1787130714:
                if (str.equals("context.widget.curr.location")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -316439674:
                if (str.equals("context.widget.id")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -238543034:
                if (str.equals("context.info.list.top")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -45776075:
                if (str.equals("context.widget.page.size")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 844164185:
                if (str.equals("context.widget.info")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 844502757:
                if (str.equals("context.widget.type")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1220258458:
                if (str.equals("context.info.list.bottom")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2078305126:
                if (str.equals("context.info.list.onepage")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2141234822:
                if (str.equals("context.widget.list.size")) {
                    c = 0;
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
                return this.a.e(str, str2);
            case 4:
                return this.a.f(str, str2);
            case 5:
                return this.a.g(str, str2);
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Integer.valueOf(this.a.i(str, str2));
            case '\b':
                return Integer.valueOf(this.a.j(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"context.widget.list.size", "context.widget.page.size", "context.widget.curr.location", "context.widget.id", "context.widget.type", "context.widget.info", "context.info.list.top", "context.info.list.bottom", "context.info.list.onepage"};
    }
}
