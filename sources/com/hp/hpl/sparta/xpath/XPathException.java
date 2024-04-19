package com.hp.hpl.sparta.xpath;

import java.io.IOException;
/* loaded from: classes.dex */
public class XPathException extends Exception {
    private Throwable cause_;

    public XPathException(XPath xPath, String str) {
        super(xPath + " " + str);
        this.cause_ = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public XPathException(XPath xPath, String str, SimpleStreamTokenizer simpleStreamTokenizer, String str2) {
        this(xPath, str + " got \"" + toString(simpleStreamTokenizer) + "\" instead of expected " + str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public XPathException(XPath xPath, Exception exc) {
        super(xPath + " " + exc);
        this.cause_ = null;
        this.cause_ = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause_;
    }

    private static String toString(SimpleStreamTokenizer simpleStreamTokenizer) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(tokenToString(simpleStreamTokenizer));
            if (simpleStreamTokenizer.ttype != -1) {
                simpleStreamTokenizer.nextToken();
                stringBuffer.append(tokenToString(simpleStreamTokenizer));
                simpleStreamTokenizer.pushBack();
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            return "(cannot get  info: " + e + ")";
        }
    }

    private static String tokenToString(SimpleStreamTokenizer simpleStreamTokenizer) {
        switch (simpleStreamTokenizer.ttype) {
            case -3:
                return simpleStreamTokenizer.sval;
            case -2:
                return simpleStreamTokenizer.nval + "";
            case -1:
                return "<end of expression>";
            default:
                return ((char) simpleStreamTokenizer.ttype) + "";
        }
    }
}
