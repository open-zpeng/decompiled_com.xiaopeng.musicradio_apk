package defpackage;

import android.content.Context;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.k;
import com.airbnb.lottie.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
/* compiled from: NetworkFetcher.java */
/* renamed from: qm  reason: default package */
/* loaded from: classes3.dex */
public class qm {
    private final Context a;
    private final String b;
    private final ql c;

    public static l<d> a(Context context, String str) {
        return new qm(context, str).b();
    }

    private qm(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
        this.c = new ql(this.a, str);
    }

    private l<d> b() {
        return new l<>(new Callable<k<d>>() { // from class: qm.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public k<d> call() {
                return qm.this.a();
            }
        });
    }

    public k<d> a() {
        d c = c();
        if (c != null) {
            return new k<>(c);
        }
        c.a("Animation for " + this.b + " not found in cache. Fetching from network.");
        return d();
    }

    private d c() {
        k<d> a;
        gn<qk, InputStream> a2 = this.c.a();
        if (a2 == null) {
            return null;
        }
        qk qkVar = a2.a;
        InputStream inputStream = a2.b;
        if (qkVar == qk.Zip) {
            a = e.a(new ZipInputStream(inputStream), this.b);
        } else {
            a = e.a(inputStream, this.b);
        }
        if (a.a() != null) {
            return a.a();
        }
        return null;
    }

    private k<d> d() {
        try {
            return e();
        } catch (IOException e) {
            return new k<>(e);
        }
    }

    private k e() {
        qk qkVar;
        k<d> a;
        c.a("Fetching " + this.b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        if (httpURLConnection.getErrorStream() != null || httpURLConnection.getResponseCode() != 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    return new k((Throwable) new IllegalArgumentException("Unable to fetch " + this.b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + ((Object) sb)));
                }
            }
        } else {
            String contentType = httpURLConnection.getContentType();
            char c = 65535;
            int hashCode = contentType.hashCode();
            if (hashCode != -1248325150) {
                if (hashCode == -43840953 && contentType.equals("application/json")) {
                    c = 1;
                }
            } else if (contentType.equals("application/zip")) {
                c = 0;
            }
            if (c == 0) {
                c.a("Handling zip response.");
                qkVar = qk.Zip;
                a = e.a(new ZipInputStream(new FileInputStream(this.c.a(httpURLConnection.getInputStream(), qkVar))), this.b);
            } else {
                c.a("Received json response.");
                qkVar = qk.Json;
                a = e.a(new FileInputStream(new File(this.c.a(httpURLConnection.getInputStream(), qkVar).getAbsolutePath())), this.b);
            }
            if (a.a() != null) {
                this.c.a(qkVar);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Completed fetch from network. Success: ");
            sb2.append(a.a() != null);
            c.a(sb2.toString());
            return a;
        }
    }
}
