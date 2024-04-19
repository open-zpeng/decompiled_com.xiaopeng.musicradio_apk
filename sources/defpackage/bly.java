package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* compiled from: WebSocketHandshake.java */
/* renamed from: bly  reason: default package */
/* loaded from: classes3.dex */
public class bly {
    InputStream a;
    OutputStream b;
    String c;
    String d;
    int e;

    public bly(InputStream inputStream, OutputStream outputStream, String str, String str2, int i) {
        this.a = inputStream;
        this.b = outputStream;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    public void a() {
        byte[] bArr = new byte[16];
        System.arraycopy(UUID.randomUUID().toString().getBytes(), 0, bArr, 0, 16);
        String a = blu.a(bArr);
        a(a);
        b(a);
    }

    private void a(String str) {
        String userInfo;
        try {
            String str2 = "/mqtt";
            URI uri = new URI(this.c);
            if (uri.getRawPath() != null && !uri.getRawPath().isEmpty()) {
                str2 = uri.getRawPath();
                if (uri.getRawQuery() != null && !uri.getRawQuery().isEmpty()) {
                    str2 = String.valueOf(str2) + "?" + uri.getRawQuery();
                }
            }
            PrintWriter printWriter = new PrintWriter(this.b);
            printWriter.print("GET " + str2 + " HTTP/1.1\r\n");
            if (this.e != 80 && this.e != 443) {
                printWriter.print("Host: " + this.d + ":" + this.e + "\r\n");
            } else {
                printWriter.print("Host: " + this.d + "\r\n");
            }
            printWriter.print("Upgrade: websocket\r\n");
            printWriter.print("Connection: Upgrade\r\n");
            printWriter.print("Sec-WebSocket-Key: " + str + "\r\n");
            printWriter.print("Sec-WebSocket-Protocol: mqtt\r\n");
            printWriter.print("Sec-WebSocket-Version: 13\r\n");
            if (uri.getUserInfo() != null) {
                printWriter.print("Authorization: Basic " + blu.a(userInfo) + "\r\n");
            }
            printWriter.print("\r\n");
            printWriter.flush();
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    private void b(String str) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a));
        ArrayList arrayList = new ArrayList();
        String readLine = bufferedReader.readLine();
        if (readLine == null) {
            throw new IOException("WebSocket Response header: Invalid response from Server, It may not support WebSockets.");
        }
        while (!readLine.equals("")) {
            arrayList.add(readLine);
            readLine = bufferedReader.readLine();
        }
        Map a = a(arrayList);
        String str2 = (String) a.get("connection");
        if (str2 == null || str2.equalsIgnoreCase("upgrade")) {
            throw new IOException("WebSocket Response header: Incorrect connection header");
        }
        String str3 = (String) a.get("upgrade");
        if (str3 == null || !str3.toLowerCase().contains("websocket")) {
            throw new IOException("WebSocket Response header: Incorrect upgrade.");
        }
        if (((String) a.get("sec-websocket-protocol")) == null) {
            throw new IOException("WebSocket Response header: empty sec-websocket-protocol");
        }
        if (!a.containsKey("sec-websocket-accept")) {
            throw new IOException("WebSocket Response header: Missing Sec-WebSocket-Accept");
        }
        try {
            a(str, (String) a.get("sec-websocket-accept"));
        } catch (blw unused) {
            throw new IOException("WebSocket Response header: Incorrect Sec-WebSocket-Key");
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e.getMessage());
        }
    }

    private Map a(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i < arrayList.size(); i++) {
            String[] split = ((String) arrayList.get(i)).split(":");
            hashMap.put(split[0].toLowerCase(), split[1]);
        }
        return hashMap;
    }

    private void a(String str, String str2) {
        if (!blu.a(c(String.valueOf(str) + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).trim().equals(str2.trim())) {
            throw new blw();
        }
    }

    private byte[] c(String str) {
        return MessageDigest.getInstance("SHA1").digest(str.getBytes());
    }
}
