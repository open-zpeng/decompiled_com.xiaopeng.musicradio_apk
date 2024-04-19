package com.xiaopeng.speech.protocol.node.dialog;

import com.xiaopeng.speech.annotation.ICommandProcessor;
import com.xiaopeng.speech.vui.constants.VuiConstants;
/* loaded from: classes2.dex */
public class DialogNode_Processor implements ICommandProcessor {
    private DialogNode a;

    public DialogNode_Processor(DialogNode dialogNode) {
        this.a = dialogNode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public void a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1434480195:
                if (str.equals("sys.dialog.status.changed")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1411139995:
                if (str.equals("sys.vad.end")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1293262773:
                if (str.equals("sys.wakeup.result")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -931531412:
                if (str.equals("sys.dialog.continue")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -771523855:
                if (str.equals("jarvis.dm.wait")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -153794717:
                if (str.equals("sys.dialog.error")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1083473887:
                if (str.equals(VuiConstants.DM_END_EVENT)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1101097907:
                if (str.equals("sys.vad.begin")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1849428582:
                if (str.equals(VuiConstants.DM_START_EVENT)) {
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
            default:
                return;
        }
    }

    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public String[] a() {
        return new String[]{VuiConstants.DM_START_EVENT, "sys.dialog.error", VuiConstants.DM_END_EVENT, "jarvis.dm.wait", "sys.dialog.continue", "sys.wakeup.result", "sys.vad.begin", "sys.vad.end", "sys.dialog.status.changed"};
    }
}
