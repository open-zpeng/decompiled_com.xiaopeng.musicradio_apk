package com.xiaopeng.lib.framework.carcontrollermodule.controller;

import android.car.Car;
import android.car.CarNotConnectedException;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.icm.CarIcmManager;
import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IEventMsg;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IIcmController;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class IcmController extends AbstractController implements IIcmController {
    public static int ICM_METER_ALARMVOLUME = 557848069;
    public static int ICM_METER_MEDIASOURCE = 557848118;
    public static int ICM_METER_SCREENLIGHT = 557848119;
    public static int ICM_METER_SPEEDLIMIT_WARNINGSWITCH = 557848098;
    public static int ICM_METER_SPEEDLIMIT_WARNINGVALUE = 557848109;
    public static int ICM_METER_TEMPRATURE = 557848101;
    public static int ICM_METER_WINDMODE = 557848097;
    public static int ICM_METER_WINDPOWER = 557848103;
    private static final String TAG = "IcmController";
    private CarIcmManager.CarIcmEventCallback mCarIcmEventCallback;
    private CarIcmManager mCarIcmManager;

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public int getContacts() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public float getDriveTotalMileage() {
        return 0.0f;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public int[] getICMSystemTimeValue() {
        return null;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public int getIcmFeedback() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getIcmNavigation() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public float getMeterMileageA() {
        return 0.0f;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public float getMeterMileageB() {
        return 0.0f;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public int getWheelEvent() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmDistractionLevel(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmDmsMode(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmFatigueLevel(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmNavigation(boolean z) {
    }

    public IcmController(Car car) {
        super(car);
        this.mCarIcmEventCallback = null;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initCarManager(Car car) {
        this.mCarApiClient = car;
        try {
            this.mCarIcmManager = (CarIcmManager) car.getCarManager("xp_icm");
        } catch (CarNotConnectedException | IllegalStateException unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initPropertyTypeMap() {
        this.mPropertyTypeMap.put(557848069, IIcmController.AlarmVolumeEventMsg.class);
        this.mPropertyTypeMap.put(557848101, IIcmController.IcmTemperatureEventMsg.class);
        this.mPropertyTypeMap.put(557848103, IIcmController.IcmWindPowerEventMsg.class);
        this.mPropertyTypeMap.put(557848097, IIcmController.IcmWindModeEventMsg.class);
        this.mPropertyTypeMap.put(557848118, IIcmController.IcmMediaSourceEventMsg.class);
        this.mPropertyTypeMap.put(557848119, IIcmController.IcmScreenLightEventMsg.class);
        this.mPropertyTypeMap.put(560993821, IIcmController.IcmNavigationEventMsg.class);
        this.mPropertyTypeMap.put(557848106, IIcmController.IcmDayNightEventMsg.class);
        this.mPropertyTypeMap.put(557848098, IIcmController.SpeedLimitWarningSwitchEventMsg.class);
        this.mPropertyTypeMap.put(557848109, IIcmController.SpeedLimitWarningValueEventMsg.class);
        this.mPropertyTypeMap.put(559945262, IIcmController.IcmDriveTotalMileageEventMsg.class);
        this.mPropertyTypeMap.put(559945264, IIcmController.IcmLastChargeMileageEventMsg.class);
        this.mPropertyTypeMap.put(559945263, IIcmController.IcmStartUpMileageEventMsg.class);
        this.mPropertyTypeMap.put(559945265, IIcmController.IcmMileageAEventMsg.class);
        this.mPropertyTypeMap.put(559945266, IIcmController.IcmMileageBEventMsg.class);
        this.mPropertyTypeMap.put(557848095, IIcmController.ICMWindLevelEventMsg.class);
        this.mPropertyTypeMap.put(559945269, IIcmController.ICMDriverTempValueEventMsg.class);
        this.mPropertyTypeMap.put(557913644, IIcmController.ICMSystemTimeValueEventMsg.class);
        this.mPropertyTypeMap.put(560993803, IIcmController.ICMBTContactsEventMsg.class);
        this.mPropertyTypeMap.put(557848104, IIcmController.ICMLightChangeEventMsg.class);
        this.mPropertyTypeMap.put(557848078, IIcmController.IcmConnectEventMsgV2.class);
        this.mPropertyTypeMap.put(557913610, IIcmController.IcmSendResultEventMsg.class);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void registerCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarIcmEventCallback == null) {
            this.mCarIcmEventCallback = new CarIcmManager.CarIcmEventCallback() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.IcmController.1
                public void onChangeEvent(CarPropertyValue carPropertyValue) {
                    IcmController icmController = IcmController.this;
                    icmController.postEventBusMsg(icmController.mPropertyTypeMap.get(Integer.valueOf(carPropertyValue.getPropertyId())), carPropertyValue);
                }

                public void onErrorEvent(int i, int i2) {
                    Log.e(IcmController.TAG, "propertyId = " + i + " zone = " + i2);
                }
            };
        }
        try {
            this.mCarIcmManager.registerPropCallback(convertRegisterPropertyList(list), this.mCarIcmEventCallback);
        } catch (Exception unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void unregisterCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarIcmEventCallback == null) {
            return;
        }
        try {
            this.mCarIcmManager.unregisterPropCallback(convertUnregisterPropertyList(list), this.mCarIcmEventCallback);
        } catch (CarNotConnectedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void resetMeterMileageA() {
        this.mCarIcmManager.resetMeterMileageA();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void resetMeterMileageB() {
        this.mCarIcmManager.resetMeterMileageB();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public float getLastChargeMileage() {
        return this.mCarIcmManager.getLastChargeMileage();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public float getLastStartUpMileage() {
        return this.mCarIcmManager.getLastStartUpMileage();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void sendContacts(byte[] bArr) {
        this.mCarIcmManager.sendContacts(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setMeterSoundState(int i, int i2, boolean z) {
        this.mCarIcmManager.setMeterSoundState(i, i2, z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setWeatherInfo(byte[] bArr) {
        this.mCarIcmManager.setWeatherInfo(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setNavigationInfo(byte[] bArr) {
        this.mCarIcmManager.setNavigationInfo(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setMusicInfo(byte[] bArr, byte[] bArr2) {
        this.mCarIcmManager.setMusicInfo(bArr, bArr2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setNetRadioInfo(byte[] bArr, byte[] bArr2) {
        this.mCarIcmManager.setNetRadioInfo(bArr, bArr2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setRadioInfo(byte[] bArr) {
        this.mCarIcmManager.setRadioInfo(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setBtStateMessage(byte[] bArr) {
        this.mCarIcmManager.setBtMusicState(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void sendSpeechStateInfo(byte[] bArr) {
        this.mCarIcmManager.setSpeechStateInfo(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public int getIcmAlarmVolume() {
        return this.mCarIcmManager.getIcmAlarmVolume();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmAlarmVolume(int i) {
        this.mCarIcmManager.setIcmAlarmVolume(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmTimeFormat(int i) {
        this.mCarIcmManager.setIcmTimeFormat(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getIcmTemperature() {
        return this.mCarIcmManager.getIcmTemperature() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmTemperature(boolean z) {
        this.mCarIcmManager.setIcmTemperature(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getIcmWindPower() {
        return this.mCarIcmManager.getIcmWindPower() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmWindPower(boolean z) {
        this.mCarIcmManager.setIcmWindPower(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getIcmWindMode() {
        return this.mCarIcmManager.getIcmWindMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmWindMode(boolean z) {
        this.mCarIcmManager.setIcmWindMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getIcmMediaSource() {
        return this.mCarIcmManager.getIcmMediaSource() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmMediaSource(boolean z) {
        this.mCarIcmManager.setIcmMediaSource(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getIcmScreenLight() {
        return this.mCarIcmManager.getIcmScreenLight() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmScreenLight(boolean z) {
        this.mCarIcmManager.setIcmScreenLight(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setMeterBackLightLevel(int i) {
        this.mCarIcmManager.setMeterBackLightLevel(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getIcmDayNightSwitch() {
        return this.mCarIcmManager.getIcmDayNightSwitch() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmDayNightSwitch(boolean z) {
        this.mCarIcmManager.setIcmDayNightSwitch(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getSpeedLimitWarningSwitch() {
        return this.mCarIcmManager.getSpeedLimitWarningSwitch() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setSpeedLimitWarningSwitch(boolean z) {
        this.mCarIcmManager.setSpeedLimitWarningSwitch(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public int getSpeedLimitWarningValue() {
        return this.mCarIcmManager.getSpeedLimitWarningValue();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setSpeedLimitWarningValue(int i) {
        this.mCarIcmManager.setSpeedLimitWarningValue(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setICMWindBlowMode(int i) {
        this.mCarIcmManager.setIcmWindBlowMode(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    @Deprecated
    public int getICMWindBlowMode() {
        return this.mCarIcmManager.getIcmWindBlowMode();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setICMWindLevel(int i) {
        this.mCarIcmManager.setIcmWindLevel(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public int getICMWindLevel() {
        return this.mCarIcmManager.getIcmWindLevel();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setICMDriverTempValue(float f) {
        this.mCarIcmManager.setIcmDriverTempValue(f);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public float getICMDriverTempValue() {
        return this.mCarIcmManager.getIcmDriverTempValue();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setICMSystemTimeValue(int i, int i2) {
        this.mCarIcmManager.setIcmSystemTimeValue(i, i2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public boolean getIcmConnectionState() {
        return this.mCarIcmManager.getIcmConnectionState() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void sendBinMsg(int i, byte[] bArr, byte[] bArr2) {
        this.mCarIcmManager.sendRomBinMsg(i, bArr, bArr2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    @Deprecated
    public void sendRomBinMsgNew(byte[] bArr) {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmAccount(byte[] bArr) {
        this.mCarIcmManager.setIcmAccount(new String(bArr));
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    public void setIcmMultiProperty(LinkedList<HashMap<Integer, Object>> linkedList) {
        CarPropertyValue carPropertyValue;
        LinkedList linkedList2 = new LinkedList();
        if (linkedList != null && linkedList.size() > 0) {
            for (int i = 0; i < linkedList.size(); i++) {
                for (Map.Entry<Integer, Object> entry : linkedList.get(i).entrySet()) {
                    int intValue = entry.getKey().intValue();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        carPropertyValue = new CarPropertyValue(intValue, Integer.valueOf(((Integer) value).intValue()));
                    } else if (value instanceof Boolean) {
                        carPropertyValue = new CarPropertyValue(intValue, Boolean.valueOf(((Boolean) value).booleanValue()));
                    } else {
                        carPropertyValue = new CarPropertyValue(intValue, Boolean.valueOf(((Boolean) value).booleanValue()));
                    }
                    linkedList2.add(carPropertyValue);
                    Log.d(TAG, "SetIcmMultiProperty Add Property = " + carPropertyValue.toString());
                }
            }
            Log.d(TAG, "SetIcmMultiProperty, linkedList size = " + linkedList.size() + ", paramLinkedList size = " + linkedList2.size());
            return;
        }
        Log.d(TAG, "SetIcmMultiProperty, linkedList is null or size 0");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IIcmController
    @Deprecated
    public void setIcmDayNightMode(int i) {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IIcmController
    public void setRadioType(int i) {
        this.mCarIcmManager.setRadioType(i);
    }
}
