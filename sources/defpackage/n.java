package defpackage;

import android.content.Context;
import android.support.rastermill.a;
import java.io.File;
/* compiled from: HttpLoader.java */
/* renamed from: n  reason: default package */
/* loaded from: classes3.dex */
public class n extends k {
    private File c;

    @Override // defpackage.k, defpackage.o
    public boolean b() {
        return true;
    }

    @Override // defpackage.o
    public int f() {
        return 5;
    }

    public n(Context context, String str) {
        super(context);
        this.b = str;
    }

    @Override // defpackage.o
    public boolean g() {
        if (this.c == null) {
            this.c = a.a().b().a(this.b);
        }
        File file = this.c;
        return file != null && file.exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1 != null) goto L40;
     */
    @Override // defpackage.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.support.rastermill.FrameSequence e() {
        /*
            r6 = this;
            java.io.File r0 = r6.c
            if (r0 != 0) goto L14
            android.support.rastermill.a r0 = android.support.rastermill.a.a()
            a r0 = r0.b()
            java.lang.String r1 = r6.b
            java.io.File r0 = r0.a(r1)
            r6.c = r0
        L14:
            java.io.File r0 = r6.c
            r1 = 0
            if (r0 == 0) goto L6b
            boolean r0 = r0.exists()
            if (r0 == 0) goto L6b
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L44
            java.io.File r2 = r6.c     // Catch: java.lang.Throwable -> L44
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L44
            android.support.rastermill.FrameSequence r1 = android.support.rastermill.FrameSequence.decodeStream(r0)     // Catch: java.lang.Throwable -> L3d
            r0.close()     // Catch: java.io.IOException -> L2d
        L2d:
            if (r1 != 0) goto L6b
        L2f:
            android.support.rastermill.a r0 = android.support.rastermill.a.a()
            a r0 = r0.b()
            java.lang.String r2 = r6.b
            r0.b(r2)
            goto L6b
        L3d:
            r2 = move-exception
            goto L46
        L3f:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L58
        L44:
            r2 = move-exception
            r0 = r1
        L46:
            java.lang.Class<android.support.rastermill.e> r3 = android.support.rastermill.e.class
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "decodeFile"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.io.IOException -> L2f
            goto L2f
        L57:
            r1 = move-exception
        L58:
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.io.IOException -> L5d
        L5d:
            android.support.rastermill.a r0 = android.support.rastermill.a.a()
            a r0 = r0.b()
            java.lang.String r2 = r6.b
            r0.b(r2)
            throw r1
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n.e():android.support.rastermill.FrameSequence");
    }
}
