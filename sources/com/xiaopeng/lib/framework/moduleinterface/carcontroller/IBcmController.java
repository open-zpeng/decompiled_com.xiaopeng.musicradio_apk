package com.xiaopeng.lib.framework.moduleinterface.carcontroller;
/* loaded from: classes.dex */
public interface IBcmController extends ILifeCycle, com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IBcmController {
    public static final int ATWS_STATUS_DEFENCE = 0;
    public static final int ATWS_STATUS_PRE_DEFENCE = 1;
    public static final int ATWS_STATUS_UNDEFENCE = 2;
    public static final int BCM_DOOR_CLOSE = 0;
    public static final int BCM_DOOR_OPEN = 1;
    public static final int BCM_LAMP_LOCATION = 1;
    public static final int BCM_LAMP_STATE_AUTO = 3;
    public static final int BCM_LAMP_STATE_CLOSE = 0;
    public static final int BCM_LAMP_STATE_NEAR = 2;
    public static final int BCM_LIGHT_ALL = 0;
    public static final int BCM_LIGHT_ME_HOME_LOW_BEAM = 1;
    public static final int BCM_LIGHT_ME_HOME_LOW_BEAM_PARKING = 2;
    public static final int BCM_LIGHT_ME_HOME_NOT_ACTIVE = 0;
    public static final int BCM_LIGHT_OUTSIDE = 1;
    public static final int BCM_REAR_TRUNK_CLOSE = 0;
    public static final int BCM_REAR_TRUNK_OPEN = 2;
    public static final int BCM_REAR_TRUNK_STOP = 1;
    public static final int BCM_REAR_VIEW_MIRROR_TYPE_CLOSE = 0;
    public static final int BCM_REAR_VIEW_MIRROR_TYPE_OPEN = 1;
    public static final int BCM_SEAT_TYPE_ANGLE = 3;
    public static final int BCM_SEAT_TYPE_HEIGHT = 2;
    public static final int BCM_SEAT_TYPE_LEVEL_LOCATION = 1;
    public static final int BCM_UNLOCK_LIGHT_AND_HORN = 0;
    public static final int BCM_UNLOCK_RESPONSE_LIGHT = 1;
    public static final int BCM_WHEEL_DEFINED_BUTTON_HIGH = 3;
    public static final int BCM_WHEEL_DEFINED_BUTTON_LOW = 1;
    public static final int BCM_WHEEL_DEFINED_BUTTON_MIDDLE = 2;
    public static final int BCM_WINDOW_TYPE_DOWN_AUTO = 4;
    public static final int BCM_WINDOW_TYPE_DOWN_MANUALLY = 3;
    public static final int BCM_WINDOW_TYPE_INVALID = 0;
    public static final int BCM_WINDOW_TYPE_UP_AUTO = 2;
    public static final int BCM_WINDOW_TYPE_UP_MANUALLY = 1;
    public static final int BCM_WIPER_INTERNAL_GEAR_1 = 3;
    public static final int BCM_WIPER_INTERNAL_GEAR_2 = 2;
    public static final int BCM_WIPER_INTERNAL_GEAR_3 = 1;
    public static final int BCM_WIPER_INTERNAL_GEAR_4 = 0;
    public static final int HEADLAMPS_STATUS_LAMP_AUTO = 3;
    public static final int HEADLAMPS_STATUS_LAMP_FAR = 4;
    public static final int HEADLAMPS_STATUS_LAMP_LOCATION = 1;
    public static final int HEADLAMPS_STATUS_LAMP_NEAR = 2;
    public static final int HEADLAMPS_STATUS_LAMP_OFF = 0;
    public static final int OLED_STATUS_LIGHT_ALL = 0;
    public static final int OLED_STATUS_LIGHT_OUTSIDE = 1;
    public static final int REARVIEW_AUTODOWN_CFG_CLOSE = 1;
    public static final int REARVIEW_AUTODOWN_CFG_OPEN = 2;
    public static final int REAR_TRUNK_STATUS_CLOSED = 0;
    public static final int REAR_TRUNK_STATUS_OPENED = 2;
    public static final int REAR_TRUNK_STATUS_OPENING = 1;
    public static final int SEAT_MOVE_DIRECTION_BACKWARD = 2;
    public static final int SEAT_MOVE_DIRECTION_FORWARD = 1;
    public static final int SEAT_MOVE_DIRECTION_NOT_MOVE = 0;
    public static final int UNLOCK_STATUS_LIGHT = 1;
    public static final int UNLOCK_STATUS_LIGHT_AND_HORN = 0;
    public static final int WIN_LOCK_STATUS_ACTIVE = 1;
    public static final int WIN_LOCK_STATUS_INACTIVE = 0;
    public static final int WIPER_INTERMITTENT_ACTIVE = 1;
    public static final int WIPER_INTERMITTENT_NOT_ACTIVE = 0;

    /* loaded from: classes.dex */
    public static class AtwsStateEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class BCMBackDefrostModeEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class BCMBackMirrorHeatModeEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class BCMDriveDoorEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class BCMSeatBlowLevelEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class BCMSeatFrHeatLevelEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class BCMSeatHeatLevelEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class BcmFrontWiperOutputSTEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class BcmFrontWiperOutputStatusEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class ChairDirectionEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class ChairLocationEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class ChairWelcomeModeEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class ChargeGunLockStEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class ChargePortEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class DoorLockStateEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class DoorsStateEventMsg extends AbstractEventMsg<int[]> {
    }

    /* loaded from: classes.dex */
    public static class DriveAutoLockEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class DriveSeatStateEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class DriverBeltWarningEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class ElectricSeatBeltEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class EmergencyBrakeWarningEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class FarLampEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class FrontBonnetStatusEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class HeadLampGroupEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class InternalLightEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class LightMeHomeEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class LocationLampStateEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class NearLampStateEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class OledEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class ParkingAutoUnlockEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class PollingOpenCfgEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class PowerModeStateEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class RearFogLampEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class RearSeatBeltWarningEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class RearViewAutoDownCfgEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class TrunkStateEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class UnlockResponseEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class WelcomeModeBackStatusEventMsg extends AbstractEventMsg<Boolean> {
    }

    /* loaded from: classes.dex */
    public static class WinLockStateEventMsg extends AbstractEventMsg<Integer> {
    }

    /* loaded from: classes.dex */
    public static class WindowsStateEventMsg extends AbstractEventMsg<float[]> {
    }

    /* loaded from: classes.dex */
    public static class WiperIntermittentModeEventMsg extends AbstractEventMsg<Integer> {
    }

    int getATWSState();

    boolean getBCMBackDefrostMode();

    @Deprecated
    boolean getBCMBackMirrorHeatMode();

    int getBCMIgStatus();

    int getBCMSeatBlowLevel();

    int getBCMSeatHeatLevel();

    int getBcmFrontWiperOutputStatus();

    int getCduDiagMode();

    int[] getChairDirection();

    int[] getChairLocationValue();

    boolean getChairWelcomeMode();

    boolean getChargeGunLockSt();

    boolean getChargePortStatus();

    boolean getDoorLockState();

    int[] getDoorsState();

    boolean getDriveAutoLock();

    int getDriveSeatState();

    boolean getDriverBeltWarning();

    boolean getElectricSeatBelt();

    boolean getEmergencyBrakeWarning();

    boolean getFarLampState();

    boolean getFrontBonnetStatus();

    int getHeadLampGroup();

    boolean getInternalLight();

    int getLightMeHome();

    boolean getLocationLampState();

    int[] getMsmErrorInfo();

    boolean getNearLampState();

    int getOled();

    boolean getParkingAutoUnlock();

    boolean getPollingOpenCfg();

    boolean getRearFogLamp();

    boolean getRearSeatBeltWarning();

    Integer getRearViewAutoDownCfg();

    boolean getSeatErrorState();

    int getSeatFrHeatLevel();

    int getTrunk();

    int getUnlockResponse();

    boolean getWelcomeModeBackStatus();

    int getWinLockStatus();

    float[] getWindowsState();

    int getWiperIntermittentMode();

    boolean isAirbagFault();

    boolean isHighBeamFail();

    boolean isLeftTurnLampFail();

    boolean isLowBeamFail();

    boolean isRightTurnLampFail();

    boolean isSystemError();

    boolean isWasherFluidWarning();

    void setAllWindowManualOrAuto(int i);

    void setBCMBackDefrostMode();

    void setBCMBackDefrostMode(boolean z);

    @Deprecated
    void setBCMBackMirrorHeatMode();

    @Deprecated
    void setBCMBackMirrorHeatMode(boolean z);

    void setBCMSeatBlowLevel();

    void setBCMSeatBlowLevel(int i);

    void setBCMSeatHeatLevel();

    void setBCMSeatHeatLevel(int i);

    void setBackWindows(boolean z);

    void setChairPositionEnd();

    void setChairPositionStart(int i, int i2, int i3);

    void setChairSlowlyAhead(int i);

    void setChairSlowlyBack(int i);

    void setChairSlowlyEnd(int i);

    void setChairWelcomeMode(boolean z);

    void setChargeGunLock();

    void setChargingPortUnlock();

    void setCopilotWindowAuto(boolean z);

    void setDoorLock();

    void setDoorUnlocked();

    void setDriveAutoLock(boolean z);

    void setDriverWindowAuto(boolean z);

    void setElectricSeatBelt(boolean z);

    void setEmergencyBrakeWarning(boolean z);

    void setFactoryOledData(byte[] bArr);

    void setFactoryOledDisplayMode(int i);

    void setFrontWindows(boolean z);

    void setHazardLight(boolean z);

    void setHeadLampGroup(int i);

    void setInternalLight(boolean z);

    void setLeftBackWindow(boolean z);

    void setLightMeHome(boolean z);

    void setOled(int i);

    void setParkingAutoUnlock(boolean z);

    void setPollingOpenCfg(boolean z);

    void setRearFogLamp(boolean z);

    void setRearSeatBeltWarning(boolean z);

    void setRearViewAutoDownCfg(int i);

    void setRearViewMirror(int i);

    void setRightBackWindow(boolean z);

    void setSeatFrHeatLevel(int i);

    void setTrunk(int i);

    void setUnlockResponse(int i);

    void setVentilate();

    void setWheelDefinedButton(int i);

    void setWiperInterval(int i);
}
