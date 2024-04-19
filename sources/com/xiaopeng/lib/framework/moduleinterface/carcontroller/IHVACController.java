package com.xiaopeng.lib.framework.moduleinterface.carcontroller;
/* loaded from: classes.dex */
public interface IHVACController extends ILifeCycle {

    /* loaded from: classes.dex */
    public static class HVACAutoModeBlowLevelEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class HVACAutoModeEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class HVACCirculationModeEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class HVACEconEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class HVACFrontDefrostModeEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class HVACInnerTempEventMsg extends AbstractEventMsg<Float> {
    }

    /* loaded from: classes.dex */
    public static class HVACPowerModeEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class HVACQualityInnerPM25ValueEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class HVACQualityOutsideLevelEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class HVACQualityOutsideStatusEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class HVACQualityPurgeModeEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class HVACTempACModeEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class HVACTempDriverValueEventMsg extends AbstractEventMsg<Float> {
    }

    /* loaded from: classes.dex */
    public static class HVACTempPTCStatusEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class HVACTempPsnValueEventMsg extends AbstractEventMsg<Float> {
    }

    /* loaded from: classes.dex */
    public static class HVACTempSyncModEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class HVACWindBlowModeEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class HVACWindSpeedLevelEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class OutsideAirTempEventMsg extends AbstractEventMsg<Float> {
    }

    int[] getCompressorErrorInfo();

    boolean getHVACAutoMode();

    int getHVACAutoModeBlowLevel();

    int getHVACCirculationMode();

    boolean getHVACEcon();

    boolean getHVACFrontDefrostMode();

    float getHVACInnerTemp();

    boolean getHVACPowerMode();

    int getHVACQualityInnerPM25Value();

    int getHVACQualityOutsideLevel();

    int getHVACQualityOutsideStatus();

    boolean getHVACQualityPurgeMode();

    boolean getHVACTempACMode();

    float getHVACTempDriverValue();

    float getHVACTempPsnValue();

    boolean getHVACTempSyncMode();

    int getHVACWindBlowMode();

    int getHVACWindSpeedLevel();

    float getOutsideAirTemp();

    int getPtcError();

    int getTempPTCStatus();

    boolean isError();

    void setHVACAutoMode();

    void setHVACAutoMode(boolean z);

    void setHVACAutoModeBlowLevel(int i);

    void setHVACCirculationMode();

    void setHVACCirculationMode(int i);

    void setHVACEcon(boolean z);

    void setHVACFrontDefrostMode();

    void setHVACFrontDefrostMode(boolean z);

    @Deprecated
    void setHVACPowerMode();

    void setHVACPowerMode(boolean z);

    void setHVACQualityPurgeMode();

    void setHVACQualityPurgeMode(boolean z);

    void setHVACTempACMode();

    void setHVACTempACMode(boolean z);

    void setHVACTempDriverDown();

    void setHVACTempDriverDown(float f);

    void setHVACTempDriverUp();

    void setHVACTempDriverUp(float f);

    void setHVACTempDriverValue(float f);

    void setHVACTempPsnDown();

    void setHVACTempPsnDown(float f);

    void setHVACTempPsnUp();

    void setHVACTempPsnUp(float f);

    void setHVACTempPsnValue(float f);

    void setHVACTempSyncMode();

    void setHVACTempSyncMode(boolean z);

    void setHVACWindBlowMode(int i);

    void setHVACWindSpeedDown();

    void setHVACWindSpeedDown(int i);

    void setHVACWindSpeedLevel(int i);

    void setHVACWindSpeedUp();

    void setHVACWindSpeedUp(int i);

    void setTempPTCStatus(int i);
}
