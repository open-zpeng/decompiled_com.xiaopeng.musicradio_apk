package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: FileLock.java */
/* renamed from: blj  reason: default package */
/* loaded from: classes3.dex */
public class blj {
    private File a;
    private RandomAccessFile b;
    private Object c;

    public blj(File file, String str) {
        this.a = new File(file, str);
        if (bli.a("java.nio.channels.FileLock")) {
            try {
                this.b = new RandomAccessFile(this.a, "rw");
                Object invoke = this.b.getClass().getMethod("getChannel", new Class[0]).invoke(this.b, new Object[0]);
                this.c = invoke.getClass().getMethod("tryLock", new Class[0]).invoke(invoke, new Object[0]);
            } catch (IllegalAccessException unused) {
                this.c = null;
            } catch (IllegalArgumentException unused2) {
                this.c = null;
            } catch (NoSuchMethodException unused3) {
                this.c = null;
            }
            if (this.c != null) {
                return;
            }
            a();
            throw new Exception("Problem obtaining file lock");
        }
    }

    public void a() {
        try {
            if (this.c != null) {
                this.c.getClass().getMethod("release", new Class[0]).invoke(this.c, new Object[0]);
                this.c = null;
            }
        } catch (Exception unused) {
        }
        RandomAccessFile randomAccessFile = this.b;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            this.b = null;
        }
        File file = this.a;
        if (file != null && file.exists()) {
            this.a.delete();
        }
        this.a = null;
    }
}
