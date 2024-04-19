package com.xiaopeng.lib.framework.carcontrollermodule.controller;

import android.car.Car;
import android.car.CarNotConnectedException;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.bcm.CarBcmManager;
import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IEventMsg;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IBcmController;
import java.util.List;
/* loaded from: classes.dex */
public class BcmController extends AbstractController implements IBcmController {
    private static final int INTERVAL_SEND_WINDOWS_COMMAND = 300;
    private static final int STATE_SEAT = 1;
    private static final int STATE_UNSEAT = 0;
    private static final String TAG = "BcmController";
    private CarBcmManager.CarBcmEventCallback mCarBcmEventCallback;
    private CarBcmManager mCarBcmManager;

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getBcmFrontWiperOutputStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getChargeGunLockSt() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getFrontBonnetStatus() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getPollingOpenCfg() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public Integer getRearViewAutoDownCfg() {
        return null;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getSeatFrHeatLevel() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getWinLockStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getWiperIntermittentMode() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean isAirbagFault() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean isHighBeamFail() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean isLeftTurnLampFail() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean isLowBeamFail() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean isRightTurnLampFail() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean isSystemError() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean isWasherFluidWarning() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBackWindows(boolean z) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setLeftBackWindow(boolean z) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setPollingOpenCfg(boolean z) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setRearViewAutoDownCfg(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setRightBackWindow(boolean z) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setSeatFrHeatLevel(int i) {
    }

    public BcmController(Car car) {
        super(car);
        this.mCarBcmEventCallback = null;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initCarManager(Car car) {
        this.mCarApiClient = car;
        try {
            this.mCarBcmManager = (CarBcmManager) car.getCarManager("xp_bcm");
        } catch (CarNotConnectedException | IllegalStateException unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initPropertyTypeMap() {
        this.mPropertyTypeMap.put(557849627, IBcmController.LightMeHomeEventMsg.class);
        this.mPropertyTypeMap.put(557849602, IBcmController.RearFogLampEventMsg.class);
        this.mPropertyTypeMap.put(289410561, IBcmController.FarLampEventMsg.class);
        this.mPropertyTypeMap.put(557849712, IBcmController.InternalLightEventMsg.class);
        this.mPropertyTypeMap.put(557849631, IBcmController.EmergencyBrakeWarningEventMsg.class);
        this.mPropertyTypeMap.put(557849647, IBcmController.AtwsStateEventMsg.class);
        this.mPropertyTypeMap.put(557849628, IBcmController.DriveAutoLockEventMsg.class);
        this.mPropertyTypeMap.put(557849629, IBcmController.ParkingAutoUnlockEventMsg.class);
        this.mPropertyTypeMap.put(557849609, IBcmController.DoorLockStateEventMsg.class);
        this.mPropertyTypeMap.put(557849610, IBcmController.TrunkStateEventMsg.class);
        this.mPropertyTypeMap.put(557849601, IBcmController.ChairWelcomeModeEventMsg.class);
        this.mPropertyTypeMap.put(557849635, IBcmController.ElectricSeatBeltEventMsg.class);
        this.mPropertyTypeMap.put(557849636, IBcmController.RearSeatBeltWarningEventMsg.class);
        this.mPropertyTypeMap.put(557849630, IBcmController.UnlockResponseEventMsg.class);
        this.mPropertyTypeMap.put(557915161, IBcmController.DoorsStateEventMsg.class);
        this.mPropertyTypeMap.put(560012320, IBcmController.WindowsStateEventMsg.class);
        this.mPropertyTypeMap.put(557849633, IBcmController.NearLampStateEventMsg.class);
        this.mPropertyTypeMap.put(557849626, IBcmController.LocationLampStateEventMsg.class);
        this.mPropertyTypeMap.put(557849637, IBcmController.BCMBackDefrostModeEventMsg.class);
        this.mPropertyTypeMap.put(557849665, IBcmController.BCMBackMirrorHeatModeEventMsg.class);
        this.mPropertyTypeMap.put(557849638, IBcmController.BCMSeatHeatLevelEventMsg.class);
        this.mPropertyTypeMap.put(356517139, IBcmController.BCMSeatBlowLevelEventMsg.class);
        this.mPropertyTypeMap.put(557849607, IBcmController.DriveSeatStateEventMsg.class);
        this.mPropertyTypeMap.put(557849644, IBcmController.WelcomeModeBackStatusEventMsg.class);
        this.mPropertyTypeMap.put(557849641, IBcmController.FrontBonnetStatusEventMsg.class);
        this.mPropertyTypeMap.put(557849648, IBcmController.DriverBeltWarningEventMsgV2.class);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void registerCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarBcmEventCallback == null) {
            this.mCarBcmEventCallback = new CarBcmManager.CarBcmEventCallback() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.BcmController.1
                public void onChangeEvent(CarPropertyValue carPropertyValue) {
                    Log.d(BcmController.TAG, "onChangeEvent bcm = " + carPropertyValue.toString());
                    BcmController bcmController = BcmController.this;
                    bcmController.postEventBusMsg(bcmController.mPropertyTypeMap.get(Integer.valueOf(carPropertyValue.getPropertyId())), carPropertyValue);
                }

                public void onErrorEvent(int i, int i2) {
                    String simpleName = getClass().getSimpleName();
                    Log.e(simpleName, "propertyId = " + i + " zone = " + i2);
                }
            };
        }
        try {
            this.mCarBcmManager.registerPropCallback(convertRegisterPropertyList(list), this.mCarBcmEventCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void unregisterCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarBcmEventCallback == null) {
            return;
        }
        try {
            this.mCarBcmManager.unregisterPropCallback(convertUnregisterPropertyList(list), this.mCarBcmEventCallback);
        } catch (CarNotConnectedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setLightMeHome(boolean z) {
        if (z) {
            this.mCarBcmManager.setLightMeHome(3);
        } else {
            this.mCarBcmManager.setLightMeHome(1);
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getLightMeHome() {
        return this.mCarBcmManager.getLightMeHome();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getRearFogLamp() {
        return this.mCarBcmManager.getRearFogLamp() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setChargingPortUnlock() {
        this.mCarBcmManager.setChargePortUnlock(0, 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setChargeGunLock() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getChargePortStatus() {
        this.mCarBcmManager.getChargePortStatus(0);
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setRearFogLamp(boolean z) {
        this.mCarBcmManager.setRearFogLamp(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setRearViewMirror(int i) {
        this.mCarBcmManager.setRearViewMirror(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setHeadLampGroup(int i) {
        this.mCarBcmManager.setHeadLampGroup(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getHeadLampGroup() {
        return this.mCarBcmManager.getHeadLampGroup();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getFarLampState() {
        return this.mCarBcmManager.getFarLampState() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setInternalLight(boolean z) {
        this.mCarBcmManager.setInternalLight(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getInternalLight() {
        return this.mCarBcmManager.getInternalLight() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setEmergencyBrakeWarning(boolean z) {
        this.mCarBcmManager.setEmergencyBrakeWarning(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getEmergencyBrakeWarning() {
        return this.mCarBcmManager.getEmergencyBrakeWarning() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setAllWindowManualOrAuto(int i) {
        this.mCarBcmManager.setAllWindowManualOrAuto(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getATWSState() {
        return this.mCarBcmManager.getAtwsState();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getOled() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setOled(int i) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    @Deprecated
    public void setDriverWindowAuto(boolean z) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setCopilotWindowAuto(boolean z) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setDriveAutoLock(boolean z) {
        this.mCarBcmManager.setDriveAutoLock(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int[] getChairDirection() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getDriveAutoLock() {
        return this.mCarBcmManager.getDriveAutoLock() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setParkingAutoUnlock(boolean z) {
        this.mCarBcmManager.setParkingAutoUnlock(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getParkingAutoUnlock() {
        return this.mCarBcmManager.getParkingAutoUnlock() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setHazardLight(boolean z) {
        this.mCarBcmManager.setHazardLight(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setDoorLock() {
        this.mCarBcmManager.setDoorLock(1);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setDoorUnlocked() {
        this.mCarBcmManager.setDoorLock(0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getDoorLockState() {
        return this.mCarBcmManager.getDoorLockState() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setTrunk(int i) {
        this.mCarBcmManager.setTrunk(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getTrunk() {
        return this.mCarBcmManager.getTrunk();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setWiperInterval(int i) {
        this.mCarBcmManager.setWiperInterval(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setChairSlowlyAhead(int i) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setChairSlowlyBack(int i) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setChairSlowlyEnd(int i) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setChairPositionStart(int i, int i2, int i3) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setChairPositionEnd() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getChairWelcomeMode() {
        return this.mCarBcmManager.getChairWelcomeMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setChairWelcomeMode(boolean z) {
        this.mCarBcmManager.setChairWelcomeMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getElectricSeatBelt() {
        return this.mCarBcmManager.getElectricSeatBelt() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setElectricSeatBelt(boolean z) {
        this.mCarBcmManager.setElectricSeatBelt(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getRearSeatBeltWarning() {
        return this.mCarBcmManager.getRearSeatBeltWarning() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setRearSeatBeltWarning(boolean z) {
        this.mCarBcmManager.setRearSeatBeltWarning(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setUnlockResponse(int i) {
        this.mCarBcmManager.setUnlockResponse(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getUnlockResponse() {
        return this.mCarBcmManager.getUnlockResponse();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setWheelDefinedButton(int i) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int[] getDoorsState() {
        return this.mCarBcmManager.getDoorsState();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public float[] getWindowsState() {
        return this.mCarBcmManager.getWindowsState();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int[] getChairLocationValue() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBCMBackDefrostMode() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBCMBackDefrostMode(boolean z) {
        this.mCarBcmManager.setBcmBackDefrostMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getBCMBackDefrostMode() {
        return this.mCarBcmManager.getBcmBackDefrostMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBCMBackMirrorHeatMode() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBCMBackMirrorHeatMode(boolean z) {
        this.mCarBcmManager.setBcmBackMirrorHeatMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getBCMBackMirrorHeatMode() {
        return this.mCarBcmManager.getBcmBackMirrorHeatMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBCMSeatHeatLevel() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBCMSeatHeatLevel(int i) {
        this.mCarBcmManager.setBcmSeatHeatLevel(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getBCMSeatHeatLevel() {
        return this.mCarBcmManager.getBcmSeatHeatLevel();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBCMSeatBlowLevel() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setBCMSeatBlowLevel(int i) {
        this.mCarBcmManager.setBcmSeatBlowLevel(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getBCMSeatBlowLevel() {
        return this.mCarBcmManager.getBcmSeatBlowLevel();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getLocationLampState() {
        return this.mCarBcmManager.getLocationLampState() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getNearLampState() {
        return this.mCarBcmManager.getNearLampState() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getDriveSeatState() {
        return this.mCarBcmManager.getDriverOnSeat();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int getBCMIgStatus() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setFactoryOledData(byte[] bArr) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setFactoryOledDisplayMode(int i) {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getSeatErrorState() {
        return this.mCarBcmManager.getSeatErrorState() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setVentilate() {
        this.mCarBcmManager.setVentilate();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getWelcomeModeBackStatus() {
        return this.mCarBcmManager.getWelcomeModeBackStatus() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public void setFrontWindows(final boolean z) {
        new Thread(new Runnable() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.BcmController.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    BcmController.this.setDriverWindowAuto(z);
                    Thread.sleep(300L);
                    BcmController.this.setCopilotWindowAuto(z);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public boolean getDriverBeltWarning() {
        return this.mCarBcmManager.getDriverBeltWarning() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBcmController
    public int[] getMsmErrorInfo() {
        return new int[0];
    }
}
