package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: FileLoader.java */
/* renamed from: m  reason: default package */
/* loaded from: classes3.dex */
public class m extends k {
    private File c;

    @Override // defpackage.o
    public int f() {
        return 2;
    }

    public m(Context context, File file) {
        super(context);
        this.c = file;
        this.b = file.getAbsolutePath();
    }

    @Override // defpackage.o
    public boolean g() {
        File file = this.c;
        return file != null && file.exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r1 == null) goto L10;
     */
    @Override // defpackage.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.support.rastermill.FrameSequence e() {
        /*
            r6 = this;
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L17
            java.io.File r2 = r6.c     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            android.support.rastermill.FrameSequence r0 = android.support.rastermill.FrameSequence.decodeStream(r1)     // Catch: java.lang.Throwable -> L10
        Lc:
            r1.close()     // Catch: java.io.IOException -> L27
            goto L27
        L10:
            r2 = move-exception
            goto L19
        L12:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L29
        L17:
            r2 = move-exception
            r1 = r0
        L19:
            java.lang.Class<android.support.rastermill.e> r3 = android.support.rastermill.e.class
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "decodeFile"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L27
            goto Lc
        L27:
            return r0
        L28:
            r0 = move-exception
        L29:
            if (r1 == 0) goto L2e
            r1.close()     // Catch: java.io.IOException -> L2e
        L2e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m.e():android.support.rastermill.FrameSequence");
    }
}
