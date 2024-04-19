package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* compiled from: MultiDexExtractor.java */
/* renamed from: jf  reason: default package */
/* loaded from: classes3.dex */
final class jf implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MultiDexExtractor.java */
    /* renamed from: jf$a */
    /* loaded from: classes3.dex */
    public static class a extends File {
        public long crc;

        public a(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jf(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.a = file;
        this.c = file2;
        this.b = b(file);
        File file3 = new File(file2, "MultiDex.lock");
        this.d = new RandomAccessFile(file3, "rw");
        try {
            this.e = this.d.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f = this.e.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                a(this.e);
                throw e;
            } catch (Error e2) {
                e = e2;
                a(this.e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                a(this.e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            a(this.d);
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends File> a(Context context, String str, boolean z) {
        List<a> a2;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.a.getPath() + ", " + z + ", " + str + ")");
        if (!this.f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !a(context, this.a, this.b, str)) {
            try {
                a2 = a(context, str);
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                a2 = a();
                a(context, str, a(this.a), this.b, a2);
            }
        } else {
            if (z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            a2 = a();
            a(context, str, a(this.a), this.b, a2);
        }
        Log.i("MultiDex", "load found " + a2.size() + " secondary dex files");
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }

    private List<a> a(Context context, String str) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.a.getName() + ".classes";
        SharedPreferences a2 = a(context);
        int i = a2.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            a aVar = new a(this.c, str2 + i2 + ".zip");
            if (aVar.isFile()) {
                aVar.crc = b(aVar);
                long j = a2.getLong(str + "dex.crc." + i2, -1L);
                long j2 = a2.getLong(str + "dex.time." + i2, -1L);
                long lastModified = aVar.lastModified();
                if (j2 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = a2;
                    if (j == aVar.crc) {
                        arrayList.add(aVar);
                        i2++;
                        a2 = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException("Invalid extracted dex: " + aVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + aVar.crc);
            }
            throw new IOException("Missing extracted secondary dex file '" + aVar.getPath() + "'");
        }
        return arrayList;
    }

    private static boolean a(Context context, File file, long j, String str) {
        SharedPreferences a2 = a(context);
        if (a2.getLong(str + "timestamp", -1L) == a(file)) {
            if (a2.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    private static long a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long b(File file) {
        long a2 = jg.a(file);
        return a2 == -1 ? a2 - 1 : a2;
    }

    private List<a> a() {
        String str = this.a.getName() + ".classes";
        b();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.a);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                a aVar = new a(this.c, str + i + ".zip");
                arrayList.add(aVar);
                Log.i("MultiDex", "Extraction is needed for file " + aVar);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    a(zipFile, entry, aVar, str);
                    try {
                        aVar.crc = b(aVar);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(aVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(aVar.length());
                    sb.append(" - crc: ");
                    sb.append(aVar.crc);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        aVar.delete();
                        if (aVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
        }
    }

    private static void a(Context context, String str, long j, long j2, List<a> list) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (a aVar : list) {
            edit.putLong(str + "dex.crc." + i, aVar.crc);
            edit.putLong(str + "dex.time." + i, aVar.lastModified());
            i++;
        }
        edit.commit();
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private void b() {
        File[] listFiles = this.c.listFiles(new FileFilter() { // from class: jf.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.c.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (!createTempFile.setReadOnly()) {
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            }
            Log.i("MultiDex", "Renaming to " + file.getPath());
            if (createTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } finally {
            a(inputStream);
            createTempFile.delete();
        }
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
