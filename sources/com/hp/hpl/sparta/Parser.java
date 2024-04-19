package com.hp.hpl.sparta;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
/* loaded from: classes.dex */
public class Parser {
    public static Document parse(String str, Reader reader) {
        BuildDocument buildDocument = new BuildDocument();
        new ParseCharStream(str, reader, (ParseLog) null, (String) null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, Reader reader, ParseLog parseLog) {
        BuildDocument buildDocument = new BuildDocument();
        new ParseCharStream(str, reader, parseLog, (String) null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str) {
        return parse(str.toCharArray());
    }

    public static Document parse(char[] cArr) {
        BuildDocument buildDocument = new BuildDocument();
        new ParseCharStream("file:anonymous-string", cArr, (ParseLog) null, (String) null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(byte[] bArr) {
        BuildDocument buildDocument = new BuildDocument();
        new ParseByteStream("file:anonymous-string", new ByteArrayInputStream(bArr), null, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, Reader reader, ParseLog parseLog, String str2) {
        BuildDocument buildDocument = new BuildDocument();
        new ParseCharStream(str, reader, parseLog, str2, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, InputStream inputStream, ParseLog parseLog) {
        BuildDocument buildDocument = new BuildDocument();
        new ParseByteStream(str, inputStream, parseLog, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, InputStream inputStream) {
        BuildDocument buildDocument = new BuildDocument();
        new ParseByteStream(str, inputStream, null, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static Document parse(String str, InputStream inputStream, ParseLog parseLog, String str2) {
        BuildDocument buildDocument = new BuildDocument();
        new ParseByteStream(str, inputStream, parseLog, str2, buildDocument);
        return buildDocument.getDocument();
    }

    public static void parse(String str, Reader reader, ParseHandler parseHandler) {
        new ParseCharStream(str, reader, (ParseLog) null, (String) null, parseHandler);
    }

    public static void parse(String str, Reader reader, ParseLog parseLog, ParseHandler parseHandler) {
        new ParseCharStream(str, reader, parseLog, (String) null, parseHandler);
    }

    public static void parse(String str, ParseHandler parseHandler) {
        parse(str.toCharArray(), parseHandler);
    }

    public static void parse(char[] cArr, ParseHandler parseHandler) {
        new ParseCharStream("file:anonymous-string", cArr, (ParseLog) null, (String) null, parseHandler);
    }

    public static void parse(byte[] bArr, ParseHandler parseHandler) {
        new ParseByteStream("file:anonymous-string", new ByteArrayInputStream(bArr), null, null, parseHandler);
    }

    public static void parse(String str, InputStream inputStream, ParseLog parseLog, ParseHandler parseHandler) {
        new ParseByteStream(str, inputStream, parseLog, null, parseHandler);
    }

    public static void parse(String str, InputStream inputStream, ParseHandler parseHandler) {
        new ParseByteStream(str, inputStream, null, null, parseHandler);
    }

    public static void parse(String str, InputStream inputStream, ParseLog parseLog, String str2, ParseHandler parseHandler) {
        new ParseByteStream(str, inputStream, parseLog, str2, parseHandler);
    }

    public static void parse(String str, Reader reader, ParseLog parseLog, String str2, ParseHandler parseHandler) {
        new ParseCharStream(str, reader, parseLog, str2, parseHandler);
    }
}
