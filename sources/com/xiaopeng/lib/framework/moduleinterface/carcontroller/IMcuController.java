package com.xiaopeng.lib.framework.moduleinterface.carcontroller;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public interface IMcuController extends ILifeCycle, com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IMcuController {
    public static final int ACTION_POWER_OFF_COUNTDOWN_CANCLE = 0;
    public static final int ACTION_POWER_OFF_COUNTDOWN_END = 1;
    public static final int AUTO_POWER_OFF_MODE_DISABLE = 0;
    public static final int AUTO_POWER_OFF_MODE_ENABLE = 1;
    public static final int COMMAND_LAMP_ACTIVE_AUTO_LIGHT = 1;
    public static final int COMMAND_LAMP_ACTIVE_PARKING_AND_LOW_BEAM = 3;
    public static final int COMMAND_LAMP_ACTIVE_PARKING_LIGHT = 2;
    public static final int COMMAND_LAMP_OFF = 4;
    public static final int COMMAND_REAR_FOG_OFF = 2;
    public static final int COMMAND_REAR_FOG_ON = 1;
    public static final int COMMAND_SEAT_PENDING = 2;
    public static final int COMMAND_SEAT_START = 1;
    public static final int COMMAND_SEAT_STOP = 3;
    public static final int COMMAND_WINDOWS_AUTO_DOWN = 2;
    public static final int COMMAND_WINDOWS_AUTO_DOWN_FRONT = 7;
    public static final int COMMAND_WINDOWS_AUTO_DOWN_FRONT_LEFT = 13;
    public static final int COMMAND_WINDOWS_AUTO_DOWN_FRONT_RIGHT = 14;
    public static final int COMMAND_WINDOWS_AUTO_DOWN_REAR = 8;
    public static final int COMMAND_WINDOWS_AUTO_DOWN_REAR_LEFT = 15;
    public static final int COMMAND_WINDOWS_AUTO_DOWN_REAR_RIGHT = 16;
    public static final int COMMAND_WINDOWS_AUTO_UP = 1;
    public static final int COMMAND_WINDOWS_AUTO_UP_FRONT = 5;
    public static final int COMMAND_WINDOWS_AUTO_UP_FRONT_LEFT = 9;
    public static final int COMMAND_WINDOWS_AUTO_UP_FRONT_RIGHT = 10;
    public static final int COMMAND_WINDOWS_AUTO_UP_REAR = 6;
    public static final int COMMAND_WINDOWS_AUTO_UP_REAR_LEFT = 11;
    public static final int COMMAND_WINDOWS_AUTO_UP_REAR_RIGHT = 12;
    public static final int COMMAND_WINDOWS_STOP = 3;
    public static final int COMMAND_WINDOWS_VENTILATE_MODE = 4;
    public static final int DRIVING_STATUS_MODE_COMFORT = 0;
    public static final int DRIVING_STATUS_MODE_ECO = 1;
    public static final int DRIVING_STATUS_MODE_SPORT = 2;
    public static final int MCU_CHARGE_COMPLETE_FINISHED = 1;
    public static final int MCU_CHARGE_COMPLETE_UNFINISHED = 0;
    public static final int MCU_DRIVING_MODE_ANTISICKNESS = 7;
    public static final int MCU_DRIVING_MODE_COMFORT = 1;
    public static final int MCU_DRIVING_MODE_ECO = 2;
    public static final int MCU_DRIVING_MODE_ECO_PLUS = 3;
    public static final int MCU_DRIVING_MODE_SHOW_1 = 5;
    public static final int MCU_DRIVING_MODE_SHOW_2 = 6;
    public static final int MCU_DRIVING_MODE_SPORT = 4;
    public static final int MCU_VENTILATE_INVALID = 0;
    public static final int MCU_VENTILATE_STATE = 1;
    public static final int NOTICE_POWER_OFF_COUNTDOWN_END = 1;
    public static final int NOTICE_POWER_OFF_COUNTDOWN_START = 0;
    public static final int REMIND_WARNING_NO = 0;
    public static final int REMIND_WARNING_YES = 1;
    public static final int SEAT_DIRECTION_HORIZONAL_DECREASE = 2;
    public static final int SEAT_DIRECTION_HORIZONAL_INCREASE = 1;
    public static final int SEAT_DIRECTION_TILTING_DECREASE = 6;
    public static final int SEAT_DIRECTION_TILTING_INCREASE = 5;
    public static final int SEAT_DIRECTION_VERTICAL_DECREASE = 4;
    public static final int SEAT_DIRECTION_VERTICAL_INCREASE = 3;
    public static final int SEAT_SLOW_MOVE_ANGL_BACKWARD = 6;
    public static final int SEAT_SLOW_MOVE_ANGL_FORWARD = 5;
    public static final int SEAT_SLOW_MOVE_HORI_BACKWARD = 2;
    public static final int SEAT_SLOW_MOVE_HORI_FORWARD = 1;
    public static final int SEAT_SLOW_MOVE_PENDING = 2;
    public static final int SEAT_SLOW_MOVE_START = 1;
    public static final int SEAT_SLOW_MOVE_STOP = 3;
    public static final int SEAT_SLOW_MOVE_VERT_BACKWARD = 4;
    public static final int SEAT_SLOW_MOVE_VERT_FORWARD = 3;
    public static final int SHOCK_HANDLE_OVER = 0;
    public static final int SHOCK_HANDLE_PROCESSING = 1;
    public static final int SHOCK_SWITCH_OFF = 0;
    public static final int SHOCK_SWITCH_ON = 1;
    public static final int VEHICLE_PM_STATUS_DEEP_SLEEP = 3;
    public static final int VEHICLE_PM_STATUS_FAKE_OFF = 1;
    public static final int VEHICLE_PM_STATUS_NORMAL = 0;
    public static final int VEHICLE_PM_STATUS_OFF = 4;
    public static final int VEHICLE_PM_STATUS_SLEEP_OFF = 2;

    /* loaded from: classes.dex */
    public static class AutoPowerOffNoticeEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class AutoPowerOffStateEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class BurnErrorEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class BurnFinishEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class BurnProgressEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class ChargeInfoEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class FactoryDisplayTypeMsgToMcuEventMsg extends AbstractEventMsg<String> {
    }

    /* loaded from: classes.dex */
    public static class FactoryDugReqMsgToMcuEventMsg extends AbstractEventMsg<byte[]> {
    }

    /* loaded from: classes.dex */
    public static class FactoryMcuBmsMsgToMcuEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class FactoryPwrDebugMsgToMcuEventMsg extends AbstractEventMsg<byte[]> {
    }

    /* loaded from: classes.dex */
    public static class FactorySecretKeyToMcuEventMsg extends AbstractEventMsg<byte[]> {
    }

    /* loaded from: classes.dex */
    public static class FactoryTestMsgToMcuEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class Mcu4gErrorEventMsg extends AbstractEventMsg<byte[]> {
    }

    /* loaded from: classes.dex */
    public static class McuAckPwrDebugEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class McuChargeCompleteEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class McuDtcReportEVChangeEvent extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class McuFaultInfoEventMsg extends AbstractEventMsg<byte[]> {
    }

    /* loaded from: classes.dex */
    public static class McuGpsInfoEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class McuGsensorOffsetEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class McuIgStatusChangeEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class McuOta1EventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class McuPmStatusEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class McuPsuOtaEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class McuRemindWarningEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class McuReqSaveQxdmLogEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class McuReset4gEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class McuRoadAttributeEventMsg extends AbstractEventMsg<String> {
    }

    /* loaded from: classes.dex */
    public static class McuTheftStateEventMsg extends AbstractEventMsg<int[]> {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface VehiclePmStatus {
    }

    int getAutoPowerOffMode();

    int getCpuTemperature();

    int[] getDtcReportEV();

    String getFactoryDisplayTypeMsgToMcu();

    int[] getFactoryDugReqMsgToMcu();

    int getFactoryMcuBmsMsgToMcu();

    int getFactoryPmSilentMsgToMcu();

    int[] getFactoryPwrDebugMsgToMcu();

    int[] getGSensorOffset();

    String getHardwareCarStage();

    String getHardwareCarType();

    int getHardwareVersion();

    int[] getIgStatus();

    int getMcu4GErrorStatus();

    int getMcuChargeComplete();

    byte[] getMcuFaultInfo();

    String getMcuHardwareId();

    int getMcuRemindWarningSt();

    int getMcuRequestSavingQxdmLog();

    int getMcuTheftState();

    int getMcuVentilateState();

    int getPmStatus();

    int getPowerOffCountdownNotice();

    String getRoadAttribute(int i, int i2);

    int[] getShockInfo();

    int getShockSwMode();

    String getXpCduType();

    void sendChargeCompleteTime2Mcu(int i);

    void sendDiagnoseMsgToMcu(int[] iArr);

    void sendFactoryDisplayTypeMsgToMcu(int i);

    void sendFactoryDugReqMsgToMcu(int[] iArr);

    void sendFactoryMcuBmsMsgToMcu(int i);

    void sendFactoryPmSilentMsgToMcu(int i);

    void sendFactoryPwrDebugMsgToMcu(int[] iArr);

    void sendFactorySecretKeyToMcu(byte[] bArr);

    void sendFactoryTestMsgToMcu(int[] iArr);

    void sendGpsInfoMsgToMcu(int[] iArr);

    void sendOta1MsgToMcu(int[] iArr);

    void sendPsuOtaMsgToMcu(int[] iArr);

    void sendRequestWakeToMcu(int i);

    void sendReset4gMsgToMcu(int[] iArr);

    void sendResetModemMsgToMcu(int i);

    void sendToMcuAppReadCfg(int i, int[] iArr);

    void sendToMcuAppWriteCfg(int i, int i2, int i3);

    void setAutoPowerOff(int i);

    void setChairSlowlyMove(int[] iArr);

    void setDriveMode(int i);

    void setFlash(boolean z);

    void setHorn(boolean z);

    void setIgHeartBeat();

    void setIgOff();

    void setIgOn();

    void setLampCommand(int i);

    void setMcuIsWakeUpByPhone(boolean z);

    void setMqttLogInfo(String str, String str2, String str3, String str4);

    void setPowerOffCountdownAction(int i);

    void setRearFogCommand(int i);

    void setRepairMode(boolean z);

    void setSeatControlCommand(int i, int i2);

    void setShockHandleCmd(int i);

    void setShockSwMode(int i);

    void setShockValue2Mcu(int i);

    void setTheftHeartBeatOff();

    void setTheftHeartBeatOn();

    void setWindowsCommand(int i);

    void updateMcu(String str);
}
