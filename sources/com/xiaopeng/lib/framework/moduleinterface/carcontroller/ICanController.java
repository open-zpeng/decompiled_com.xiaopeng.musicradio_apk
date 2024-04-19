package com.xiaopeng.lib.framework.moduleinterface.carcontroller;
/* loaded from: classes.dex */
public interface ICanController extends ILifeCycle {

    /* loaded from: classes.dex */
    public static class CanDiagnoseEventMsg extends AbstractEventMsg<String> {
    }

    /* loaded from: classes.dex */
    public static class CanRawDataEventMsg extends AbstractEventMsg<int[]> {
    }

    byte[] getCanRawData();

    void sendCanDataSync();

    void setAdasMeta(byte[] bArr);

    void setAdasPosition(byte[] bArr);

    void setAdasProfLong(byte[] bArr);

    void setAdasProfShort(byte[] bArr);

    void setAdasSegment(byte[] bArr);

    void setAdasStub(byte[] bArr);
}
