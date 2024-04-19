package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import org.jaudiotagger.tag.id3.AbstractID3v1Tag;
/* compiled from: MutiProcessLock.java */
/* renamed from: uy  reason: default package */
/* loaded from: classes3.dex */
public class uy {
    static File a;
    static FileChannel b;
    static FileLock c;

    public static synchronized boolean a(Context context) {
        FileLock fileLock;
        synchronized (uy.class) {
            if (a == null) {
                a = new File(context.getFilesDir() + File.separator + "ap.Lock");
            }
            boolean exists = a.exists();
            if (!exists) {
                try {
                    exists = a.createNewFile();
                } catch (IOException unused) {
                }
            }
            if (exists) {
                if (b == null) {
                    try {
                        b = new RandomAccessFile(a, "rw").getChannel();
                    } catch (Exception unused2) {
                        return false;
                    }
                }
                try {
                    fileLock = b.tryLock();
                    if (fileLock != null) {
                        c = fileLock;
                        return true;
                    }
                } catch (Throwable unused3) {
                    fileLock = null;
                }
                Log.d(AbstractID3v1Tag.TAG, "mLock:" + fileLock);
                return false;
            }
            return true;
        }
    }

    public static synchronized void a() {
        synchronized (uy.class) {
            if (c != null) {
                try {
                    c.release();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    c = null;
                    throw th;
                }
                c = null;
            }
            if (b != null) {
                try {
                    b.close();
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    b = null;
                    throw th2;
                }
                b = null;
            }
        }
    }
}
