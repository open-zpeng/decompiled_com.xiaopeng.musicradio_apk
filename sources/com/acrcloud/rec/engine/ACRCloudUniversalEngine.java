package com.acrcloud.rec.engine;
/* loaded from: classes.dex */
public class ACRCloudUniversalEngine {
    protected static native byte[] native_create_fingerprint(byte[] bArr, int i, int i2, String str, String str2);

    protected static native byte[] native_encrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    protected static native byte[] native_resample(byte[] bArr, int i, int i2, int i3, int i4);

    protected static native void native_set_log(int i);

    protected native int native_tinyalsa_get_buffer_size(long j);

    protected native int native_tinyalsa_get_recording_state(long j);

    protected native long native_tinyalsa_init(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    protected native byte[] native_tinyalsa_read(long j, int i);

    protected native void native_tinyalsa_release(long j);

    static {
        try {
            System.loadLibrary("ACRCloudUniversalEngine");
        } catch (Exception unused) {
            System.err.println("ACRCloudUniversalEngine loadLibrary error!");
        }
    }
}
