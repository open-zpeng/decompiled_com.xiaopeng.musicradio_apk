package defpackage;

import android.content.Context;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.e;
import android.support.rastermill.h;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamLoader.java */
/* renamed from: p  reason: default package */
/* loaded from: classes3.dex */
public class p extends k {
    private InputStream c;

    @Override // defpackage.o
    public int f() {
        return 4;
    }

    public p(Context context, String str, InputStream inputStream) {
        super(context);
        this.c = inputStream;
        if (TextUtils.isEmpty(str)) {
            str = "inputStream@" + inputStream.hashCode();
        }
        this.b = str;
    }

    @Override // defpackage.o
    public boolean g() {
        try {
            if (this.c != null) {
                return this.c.available() > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.k
    public FrameSequence e() {
        InputStream inputStream = this.c;
        try {
            FrameSequence decodeStream = FrameSequence.decodeStream(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return decodeStream;
                } catch (IOException unused) {
                    return decodeStream;
                }
            }
            return decodeStream;
        } catch (Throwable th) {
            try {
                Log.e(e.class.toString(), "decodeFile", th);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.k, defpackage.o
    public void d() {
        if (h.a()) {
            h.a("InputStreamLoader release : " + this.b);
        }
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        this.c = null;
    }
}
