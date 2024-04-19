package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
/* compiled from: MqttDefaultFilePersistence.java */
/* renamed from: bnd  reason: default package */
/* loaded from: classes3.dex */
public class bnd implements bkp {
    private static FilenameFilter d;
    private File a;
    private File b;
    private blj c;

    private static FilenameFilter a() {
        if (d == null) {
            d = new bnf(".msg");
        }
        return d;
    }

    public bnd() {
        this(System.getProperty("user.dir"));
    }

    public bnd(String str) {
        this.b = null;
        this.c = null;
        this.a = new File(str);
    }

    @Override // defpackage.bkp
    public void open(String str, String str2) {
        if (this.a.exists() && !this.a.isDirectory()) {
            throw new bkv();
        }
        if (!this.a.exists() && !this.a.mkdirs()) {
            throw new bkv();
        }
        if (!this.a.canWrite()) {
            throw new bkv();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (a(charAt)) {
                stringBuffer.append(charAt);
            }
        }
        stringBuffer.append("-");
        for (int i2 = 0; i2 < str2.length(); i2++) {
            char charAt2 = str2.charAt(i2);
            if (a(charAt2)) {
                stringBuffer.append(charAt2);
            }
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new File(this.a, stringBuffer.toString());
                if (!this.b.exists()) {
                    this.b.mkdir();
                }
            }
            try {
                this.c = new blj(this.b, ".lck");
            } catch (Exception unused) {
            }
            a(this.b);
        }
    }

    private void b() {
        if (this.b == null) {
            throw new bkv();
        }
    }

    @Override // defpackage.bkp
    public void close() {
        synchronized (this) {
            if (this.c != null) {
                this.c.a();
            }
            if (c().length == 0) {
                this.b.delete();
            }
            this.b = null;
        }
    }

    @Override // defpackage.bkp
    public void put(String str, bku bkuVar) {
        b();
        File file = this.b;
        File file2 = new File(file, String.valueOf(str) + ".msg");
        File file3 = this.b;
        File file4 = new File(file3, String.valueOf(str) + ".msg.bup");
        if (file2.exists() && !file2.renameTo(file4)) {
            file4.delete();
            file2.renameTo(file4);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bkuVar.a(), bkuVar.c(), bkuVar.b());
                if (bkuVar.d() != null) {
                    fileOutputStream.write(bkuVar.d(), bkuVar.f(), bkuVar.aC_());
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file4.exists()) {
                    file4.delete();
                }
            } catch (IOException e) {
                throw new bkv(e);
            }
        } finally {
            if (file4.exists() && !file4.renameTo(file2)) {
                file2.delete();
                file4.renameTo(file2);
            }
        }
    }

    @Override // defpackage.bkp
    public bku get(String str) {
        b();
        try {
            File file = this.b;
            FileInputStream fileInputStream = new FileInputStream(new File(file, String.valueOf(str) + ".msg"));
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            for (int i = 0; i < available; i += fileInputStream.read(bArr, i, available - i)) {
            }
            fileInputStream.close();
            return new blm(str, bArr, 0, bArr.length, null, 0, 0);
        } catch (IOException e) {
            throw new bkv(e);
        }
    }

    @Override // defpackage.bkp
    public void remove(String str) {
        b();
        File file = this.b;
        File file2 = new File(file, String.valueOf(str) + ".msg");
        if (file2.exists()) {
            file2.delete();
        }
    }

    @Override // defpackage.bkp
    public Enumeration keys() {
        String name;
        b();
        File[] c = c();
        Vector vector = new Vector(c.length);
        for (File file : c) {
            vector.addElement(file.getName().substring(0, name.length() - 4));
        }
        return vector.elements();
    }

    private File[] c() {
        b();
        File[] listFiles = this.b.listFiles(a());
        if (listFiles != null) {
            return listFiles;
        }
        throw new bkv();
    }

    private boolean a(char c) {
        return Character.isJavaIdentifierPart(c) || c == '-';
    }

    private void a(File file) {
        File[] listFiles = file.listFiles(new bne(".bup"));
        if (listFiles == null) {
            throw new bkv();
        }
        for (int i = 0; i < listFiles.length; i++) {
            File file2 = new File(file, listFiles[i].getName().substring(0, listFiles[i].getName().length() - 4));
            if (!listFiles[i].renameTo(file2)) {
                file2.delete();
                listFiles[i].renameTo(file2);
            }
        }
    }

    @Override // defpackage.bkp
    public boolean containsKey(String str) {
        b();
        File file = this.b;
        return new File(file, String.valueOf(str) + ".msg").exists();
    }

    @Override // defpackage.bkp
    public void clear() {
        b();
        for (File file : c()) {
            file.delete();
        }
        this.b.delete();
    }
}
