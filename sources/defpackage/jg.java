package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
/* compiled from: ZipUtil.java */
/* renamed from: jg  reason: default package */
/* loaded from: classes3.dex */
final class jg {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZipUtil.java */
    /* renamed from: jg$a */
    /* loaded from: classes3.dex */
    public static class a {
        long a;
        long b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    static a a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j = length - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        long j2 = j >= 0 ? j : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static long a(RandomAccessFile randomAccessFile, a aVar) {
        CRC32 crc32 = new CRC32();
        long j = aVar.b;
        randomAccessFile.seek(aVar.a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min((long) PlaybackStateCompat.ACTION_PREPARE, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min((long) PlaybackStateCompat.ACTION_PREPARE, j));
        }
        return crc32.getValue();
    }
}
