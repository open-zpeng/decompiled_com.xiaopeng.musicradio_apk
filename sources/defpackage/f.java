package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* compiled from: HttpUrlFetcher.java */
/* renamed from: f  reason: default package */
/* loaded from: classes3.dex */
public class f {
    private static final b a = new a();
    private final i b;
    private final b c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: f$b */
    /* loaded from: classes3.dex */
    public interface b {
        HttpURLConnection a(URL url);
    }

    public f(i iVar) {
        this(iVar, a);
    }

    f(i iVar, b bVar) {
        this.b = iVar;
        this.c = bVar;
    }

    public InputStream a() {
        return a(this.b.a(), 0, null, this.b.b());
    }

    private InputStream a(URL url, int i, URL url2, Map<String, String> map) {
        if (i >= 5) {
            throw new IOException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new IOException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.d = this.c.a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.d.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.d.setConnectTimeout(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
        this.d.setReadTimeout(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
        this.d.setUseCaches(false);
        this.d.setDoInput(true);
        this.d.connect();
        if (this.f) {
            return null;
        }
        int responseCode = this.d.getResponseCode();
        int i2 = responseCode / 100;
        if (i2 == 2) {
            return a(this.d);
        }
        if (i2 != 3) {
            if (responseCode == -1) {
                throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
            } else {
                throw new IOException("Request failed " + responseCode + ": " + this.d.getResponseMessage());
            }
        }
        String headerField = this.d.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new IOException("Received empty or null redirect url");
        }
        return a(new URL(url, headerField), i + 1, url, map);
    }

    private InputStream a(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.e = c.a(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.e = httpURLConnection.getInputStream();
        }
        return this.e;
    }

    public void b() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: f$a */
    /* loaded from: classes3.dex */
    private static class a implements b {
        private a() {
        }

        @Override // defpackage.f.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }
}
