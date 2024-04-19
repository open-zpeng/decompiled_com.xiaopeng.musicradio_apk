package com.hp.hpl.sparta.xpath;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
import java.io.Reader;
/* loaded from: classes.dex */
public class SimpleStreamTokenizer {
    private static final int QUOTE = -6;
    public static final int TT_EOF = -1;
    public static final int TT_NUMBER = -2;
    public static final int TT_WORD = -3;
    private static final int WHITESPACE = -5;
    private int nextType_;
    private final Reader reader_;
    public int ttype = Integer.MIN_VALUE;
    public int nval = Integer.MIN_VALUE;
    public String sval = "";
    private final StringBuffer buf_ = new StringBuffer();
    private final int[] charType_ = new int[IRadioController.TEF663x_PCHANNEL];
    private boolean pushedBack_ = false;
    private char inQuote_ = 0;

    public String toString() {
        int i = this.ttype;
        if (i != 34) {
            if (i != 39) {
                switch (i) {
                    case -3:
                        break;
                    case -2:
                        return Integer.toString(this.nval);
                    case -1:
                        return "(EOF)";
                    default:
                        return "'" + ((char) this.ttype) + "'";
                }
            } else {
                return "'" + this.sval + "'";
            }
        }
        return "\"" + this.sval + "\"";
    }

    public SimpleStreamTokenizer(Reader reader) {
        this.reader_ = reader;
        for (char c = 0; c < this.charType_.length; c = (char) (c + 1)) {
            if (('A' <= c && c <= 'Z') || (('a' <= c && c <= 'z') || c == '-')) {
                this.charType_[c] = -3;
            } else if ('0' <= c && c <= '9') {
                this.charType_[c] = -2;
            } else if (c >= 0 && c <= ' ') {
                this.charType_[c] = -5;
            } else {
                this.charType_[c] = c;
            }
        }
        nextToken();
    }

    public void ordinaryChar(char c) {
        this.charType_[c] = c;
    }

    public void wordChars(char c, char c2) {
        while (c <= c2) {
            this.charType_[c] = -3;
            c = (char) (c + 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int nextToken() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hp.hpl.sparta.xpath.SimpleStreamTokenizer.nextToken():int");
    }

    public void pushBack() {
        this.pushedBack_ = true;
    }
}
