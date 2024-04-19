package defpackage;

import android.content.Context;
import com.airbnb.lottie.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
/* compiled from: NetworkCache.java */
/* renamed from: ql  reason: default package */
/* loaded from: classes3.dex */
class ql {
    private final Context a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ql(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gn<qk, InputStream> a() {
        qk qkVar;
        try {
            File a = a(this.b);
            if (a == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(a);
                if (a.getAbsolutePath().endsWith(".zip")) {
                    qkVar = qk.Zip;
                } else {
                    qkVar = qk.Json;
                }
                c.a("Cache hit for " + this.b + " at " + a.getAbsolutePath());
                return new gn<>(qkVar, fileInputStream);
            } catch (FileNotFoundException unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(InputStream inputStream, qk qkVar) {
        File file = new File(this.a.getCacheDir(), a(this.b, qkVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(qk qkVar) {
        File file = new File(this.a.getCacheDir(), a(this.b, qkVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        c.a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    private File a(String str) {
        File file = new File(this.a.getCacheDir(), a(str, qk.Json, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.a.getCacheDir(), a(str, qk.Zip, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private static String a(String str, qk qkVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? qkVar.extension : qkVar.a());
        return sb.toString();
    }
}
