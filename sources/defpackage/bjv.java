package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
/* compiled from: SevenZOutputFile.java */
/* renamed from: bjv  reason: default package */
/* loaded from: classes3.dex */
public class bjv implements Closeable {
    private final RandomAccessFile a;
    private bkb h;
    private bkb[] i;
    private final List<bjr> b = new ArrayList();
    private int c = 0;
    private final CRC32 d = new CRC32();
    private final CRC32 e = new CRC32();
    private long f = 0;
    private boolean g = false;
    private Iterable<? extends bju> j = Collections.singletonList(new bju(bjt.LZMA2));
    private final Map<bjr, long[]> k = new HashMap();

    static /* synthetic */ long a(bjv bjvVar, long j) {
        long j2 = bjvVar.f + j;
        bjvVar.f = j2;
        return j2;
    }

    static /* synthetic */ long d(bjv bjvVar) {
        long j = bjvVar.f;
        bjvVar.f = 1 + j;
        return j;
    }

    public bjv(File file) {
        this.a = new RandomAccessFile(file, "rw");
        this.a.seek(32L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.g) {
            b();
        }
        this.a.close();
    }

    public bjr a(File file, String str) {
        bjr bjrVar = new bjr();
        bjrVar.b(file.isDirectory());
        bjrVar.a(str);
        bjrVar.a(new Date(file.lastModified()));
        return bjrVar;
    }

    public void a(bjh bjhVar) {
        this.b.add((bjr) bjhVar);
    }

    public void a() {
        bkb bkbVar = this.h;
        if (bkbVar != null) {
            bkbVar.flush();
            this.h.close();
        }
        List<bjr> list = this.b;
        bjr bjrVar = list.get(list.size() - 1);
        int i = 0;
        if (this.f > 0) {
            bjrVar.a(true);
            this.c++;
            bjrVar.c(this.h.a());
            bjrVar.d(this.f);
            bjrVar.a(this.d.getValue());
            bjrVar.b(this.e.getValue());
            bjrVar.c(true);
            bkb[] bkbVarArr = this.i;
            if (bkbVarArr != null) {
                long[] jArr = new long[bkbVarArr.length];
                while (true) {
                    bkb[] bkbVarArr2 = this.i;
                    if (i >= bkbVarArr2.length) {
                        break;
                    }
                    jArr[i] = bkbVarArr2[i].a();
                    i++;
                }
                this.k.put(bjrVar, jArr);
            }
        } else {
            bjrVar.a(false);
            bjrVar.c(0L);
            bjrVar.d(0L);
            bjrVar.c(false);
        }
        this.h = null;
        this.i = null;
        this.d.reset();
        this.e.reset();
        this.f = 0L;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            c().write(bArr, i, i2);
        }
    }

    public void b() {
        if (this.g) {
            throw new IOException("This archive has already been finished");
        }
        this.g = true;
        long filePointer = this.a.getFilePointer();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        a(dataOutputStream);
        dataOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.a.write(byteArray);
        CRC32 crc32 = new CRC32();
        this.a.seek(0L);
        this.a.write(bjs.a);
        this.a.write(0);
        this.a.write(2);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
        dataOutputStream2.writeLong(Long.reverseBytes(filePointer - 32));
        dataOutputStream2.writeLong(Long.reverseBytes(4294967295L & byteArray.length));
        crc32.reset();
        crc32.update(byteArray);
        dataOutputStream2.writeInt(Integer.reverseBytes((int) crc32.getValue()));
        dataOutputStream2.flush();
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        crc32.reset();
        crc32.update(byteArray2);
        this.a.writeInt(Integer.reverseBytes((int) crc32.getValue()));
        this.a.write(byteArray2);
    }

    private OutputStream c() {
        if (this.h == null) {
            this.h = d();
        }
        return this.h;
    }

    private bkb d() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No current 7z entry");
        }
        bkb aVar = new a();
        ArrayList arrayList = new ArrayList();
        List<bjr> list = this.b;
        boolean z = true;
        for (bju bjuVar : a(list.get(list.size() - 1))) {
            if (!z) {
                bkb bkbVar = new bkb(aVar);
                arrayList.add(bkbVar);
                aVar = bkbVar;
            }
            aVar = bjn.a(aVar, bjuVar.a(), bjuVar.b());
            z = false;
        }
        if (!arrayList.isEmpty()) {
            this.i = (bkb[]) arrayList.toArray(new bkb[arrayList.size()]);
        }
        return new bkb(aVar) { // from class: bjv.1
            @Override // defpackage.bkb, java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                super.write(i);
                bjv.this.d.update(i);
            }

            @Override // defpackage.bkb, java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) {
                super.write(bArr);
                bjv.this.d.update(bArr);
            }

            @Override // defpackage.bkb, java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                super.write(bArr, i, i2);
                bjv.this.d.update(bArr, i, i2);
            }
        };
    }

    private Iterable<? extends bju> a(bjr bjrVar) {
        Iterable<? extends bju> q = bjrVar.q();
        return q == null ? this.j : q;
    }

    private void a(DataOutput dataOutput) {
        dataOutput.write(1);
        dataOutput.write(4);
        b(dataOutput);
        f(dataOutput);
        dataOutput.write(0);
    }

    private void b(DataOutput dataOutput) {
        if (this.c > 0) {
            c(dataOutput);
            d(dataOutput);
        }
        e(dataOutput);
        dataOutput.write(0);
    }

    private void c(DataOutput dataOutput) {
        dataOutput.write(6);
        a(dataOutput, 0L);
        a(dataOutput, this.c & 4294967295L);
        dataOutput.write(9);
        for (bjr bjrVar : this.b) {
            if (bjrVar.b()) {
                a(dataOutput, bjrVar.p());
            }
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (bjr bjrVar2 : this.b) {
            if (bjrVar2.b()) {
                dataOutput.writeInt(Integer.reverseBytes((int) bjrVar2.n()));
            }
        }
        dataOutput.write(0);
    }

    private void d(DataOutput dataOutput) {
        dataOutput.write(7);
        dataOutput.write(11);
        a(dataOutput, this.c);
        dataOutput.write(0);
        for (bjr bjrVar : this.b) {
            if (bjrVar.b()) {
                a(dataOutput, bjrVar);
            }
        }
        dataOutput.write(12);
        for (bjr bjrVar2 : this.b) {
            if (bjrVar2.b()) {
                long[] jArr = this.k.get(bjrVar2);
                if (jArr != null) {
                    for (long j : jArr) {
                        a(dataOutput, j);
                    }
                }
                a(dataOutput, bjrVar2.o());
            }
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (bjr bjrVar3 : this.b) {
            if (bjrVar3.b()) {
                dataOutput.writeInt(Integer.reverseBytes((int) bjrVar3.m()));
            }
        }
        dataOutput.write(0);
    }

    private void a(DataOutput dataOutput, bjr bjrVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        for (bju bjuVar : a(bjrVar)) {
            i2++;
            a(bjuVar, byteArrayOutputStream);
        }
        a(dataOutput, i2);
        dataOutput.write(byteArrayOutputStream.toByteArray());
        while (i < i2 - 1) {
            int i3 = i + 1;
            a(dataOutput, i3);
            a(dataOutput, i);
            i = i3;
        }
    }

    private void a(bju bjuVar, OutputStream outputStream) {
        byte[] a2 = bjuVar.a().a();
        byte[] b = bjn.a(bjuVar.a()).b(bjuVar.b());
        int length = a2.length;
        if (b.length > 0) {
            length |= 32;
        }
        outputStream.write(length);
        outputStream.write(a2);
        if (b.length > 0) {
            outputStream.write(b.length);
            outputStream.write(b);
        }
    }

    private void e(DataOutput dataOutput) {
        dataOutput.write(8);
        dataOutput.write(0);
    }

    private void f(DataOutput dataOutput) {
        dataOutput.write(5);
        a(dataOutput, this.b.size());
        g(dataOutput);
        h(dataOutput);
        i(dataOutput);
        j(dataOutput);
        k(dataOutput);
        l(dataOutput);
        m(dataOutput);
        n(dataOutput);
        dataOutput.write(0);
    }

    private void g(DataOutput dataOutput) {
        int i;
        boolean z;
        Iterator<bjr> it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().b()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            dataOutput.write(14);
            BitSet bitSet = new BitSet(this.b.size());
            for (i = 0; i < this.b.size(); i++) {
                bitSet.set(i, !this.b.get(i).b());
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            a(dataOutputStream, bitSet, this.b.size());
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void h(DataOutput dataOutput) {
        boolean z = false;
        BitSet bitSet = new BitSet(0);
        int i = 0;
        for (bjr bjrVar : this.b) {
            if (!bjrVar.b()) {
                boolean c = bjrVar.c();
                bitSet.set(i, !c);
                z |= !c;
                i++;
            }
        }
        if (z) {
            dataOutput.write(15);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            a(dataOutputStream, bitSet, i);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void i(DataOutput dataOutput) {
        boolean z = false;
        BitSet bitSet = new BitSet(0);
        int i = 0;
        for (bjr bjrVar : this.b) {
            if (!bjrVar.b()) {
                boolean d = bjrVar.d();
                bitSet.set(i, d);
                z |= d;
                i++;
            }
        }
        if (z) {
            dataOutput.write(16);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            a(dataOutputStream, bitSet, i);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void j(DataOutput dataOutput) {
        dataOutput.write(17);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.write(0);
        for (bjr bjrVar : this.b) {
            dataOutputStream.write(bjrVar.a().getBytes("UTF-16LE"));
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        a(dataOutput, byteArray.length);
        dataOutput.write(byteArray);
    }

    private void k(DataOutput dataOutput) {
        int i = 0;
        for (bjr bjrVar : this.b) {
            if (bjrVar.e()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(18);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.b.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.b.size());
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    bitSet.set(i2, this.b.get(i2).e());
                }
                a(dataOutputStream, bitSet, this.b.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (bjr bjrVar2 : this.b) {
                if (bjrVar2.e()) {
                    dataOutputStream.writeLong(Long.reverseBytes(bjr.b(bjrVar2.f())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void l(DataOutput dataOutput) {
        int i = 0;
        for (bjr bjrVar : this.b) {
            if (bjrVar.i()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(19);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.b.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.b.size());
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    bitSet.set(i2, this.b.get(i2).i());
                }
                a(dataOutputStream, bitSet, this.b.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (bjr bjrVar2 : this.b) {
                if (bjrVar2.i()) {
                    dataOutputStream.writeLong(Long.reverseBytes(bjr.b(bjrVar2.j())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void m(DataOutput dataOutput) {
        int i = 0;
        for (bjr bjrVar : this.b) {
            if (bjrVar.g()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(20);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.b.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.b.size());
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    bitSet.set(i2, this.b.get(i2).g());
                }
                a(dataOutputStream, bitSet, this.b.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (bjr bjrVar2 : this.b) {
                if (bjrVar2.g()) {
                    dataOutputStream.writeLong(Long.reverseBytes(bjr.b(bjrVar2.h())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void n(DataOutput dataOutput) {
        int i = 0;
        for (bjr bjrVar : this.b) {
            if (bjrVar.k()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(21);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.b.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.b.size());
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    bitSet.set(i2, this.b.get(i2).k());
                }
                a(dataOutputStream, bitSet, this.b.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (bjr bjrVar2 : this.b) {
                if (bjrVar2.k()) {
                    dataOutputStream.writeInt(Integer.reverseBytes(bjrVar2.l()));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void a(DataOutput dataOutput, long j) {
        int i = 0;
        int i2 = 128;
        int i3 = 0;
        while (true) {
            if (i >= 8) {
                break;
            }
            int i4 = i + 1;
            if (j < (1 << (i4 * 7))) {
                i3 = (int) (i3 | (j >>> (i * 8)));
                break;
            }
            i3 |= i2;
            i2 >>>= 1;
            i = i4;
        }
        dataOutput.write(i3);
        while (i > 0) {
            dataOutput.write((int) (255 & j));
            j >>>= 8;
            i--;
        }
    }

    private void a(DataOutput dataOutput, BitSet bitSet, int i) {
        int i2 = 7;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 |= (bitSet.get(i4) ? 1 : 0) << i2;
            i2--;
            if (i2 < 0) {
                dataOutput.write(i3);
                i2 = 7;
                i3 = 0;
            }
        }
        if (i2 != 7) {
            dataOutput.write(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SevenZOutputFile.java */
    /* renamed from: bjv$a */
    /* loaded from: classes3.dex */
    public class a extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        private a() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            bjv.this.a.write(i);
            bjv.this.e.update(i);
            bjv.d(bjv.this);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            bjv.this.a.write(bArr, i, i2);
            bjv.this.e.update(bArr, i, i2);
            bjv.a(bjv.this, i2);
        }
    }
}
