package com.xiaopeng.lib.framework.carcontrollermodule.controller;

import android.car.Car;
import android.car.CarNotConnectedException;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.radio.CarRadioManager;
import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IEventMsg;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
import java.util.List;
/* loaded from: classes.dex */
public class RadioController extends AbstractController implements IRadioController {
    private static final String TAG = "RadioController";
    private CarRadioManager.CarRadioEventCallback mCarRadioEventCallback;
    private CarRadioManager mCarRadioManager;

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public String getAudioDspInfo() {
        return null;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public int getRadioBand() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public String getRadioInfo() {
        return null;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public int[] getRadioVolumePercent() {
        return null;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public boolean getTunerPowerStatus() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public int getXSoundType() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setXSoundType(int i) {
    }

    public RadioController(Car car) {
        super(car);
        this.mCarRadioEventCallback = null;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initCarManager(Car car) {
        try {
            this.mCarRadioManager = (CarRadioManager) car.getCarManager("xp_radio");
        } catch (Exception unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initPropertyTypeMap() {
        this.mPropertyTypeMap.put(1879053320, IRadioController.RadioInfoEventMsg.class);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void registerCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarRadioEventCallback == null) {
            this.mCarRadioEventCallback = new CarRadioManager.CarRadioEventCallback() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.RadioController.1
                public void onChangeEvent(CarPropertyValue carPropertyValue) {
                    RadioController radioController = RadioController.this;
                    radioController.postEventBusMsg(radioController.mPropertyTypeMap.get(Integer.valueOf(carPropertyValue.getPropertyId())), carPropertyValue);
                }

                public void onErrorEvent(int i, int i2) {
                    Log.e(RadioController.TAG, "propertyId = " + i + " zone = " + i2);
                }
            };
        }
        try {
            this.mCarRadioManager.registerPropCallback(convertRegisterPropertyList(list), this.mCarRadioEventCallback);
        } catch (Exception unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void unregisterCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarRadioEventCallback == null) {
            return;
        }
        try {
            this.mCarRadioManager.unregisterPropCallback(convertUnregisterPropertyList(list), this.mCarRadioEventCallback);
        } catch (CarNotConnectedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setPowerOnTuner() {
        this.mCarRadioManager.setPowerOnTunner();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setPowerOffTuner() {
        this.mCarRadioManager.setPowerOffTunner();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setFmVolume(int i, int i2) {
        this.mCarRadioManager.setFmVolume(i, i2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setExhibitionModeVolume(int i) {
        this.mCarRadioManager.setCarExhibitionModeVol(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setRadioSearchUp() {
        this.mCarRadioManager.setRadioSearchStationUp();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setRadioSearchDown() {
        this.mCarRadioManager.setRadioSearchStationDown();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setStartFullBandScan() {
        this.mCarRadioManager.setStartFullBandScan();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setStopFullBandScan() {
        this.mCarRadioManager.setStopFullBandScan();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setRadioBand(int i) {
        this.mCarRadioManager.setRadioBand(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setRadioVolumePercent(int i, int i2) {
        this.mCarRadioManager.setRadioVolumePercent(i, i2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setRadioVolumeAutoFocus(int i) {
        this.mCarRadioManager.setRadioVolumeAutoFocus(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public int getRadioVolumeAutoFocus() {
        return this.mCarRadioManager.getRadioVolumeAutoFocus();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setRadioFrequency(int i, int i2) {
        this.mCarRadioManager.setRadioFrequency(i, i2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public int[] getRadioFrequency() {
        return this.mCarRadioManager.getRadioFrequency();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setMainAudioMode(int i, int i2) {
        this.mCarRadioManager.setAudioMode(i, i2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public int[] getAudioMode() {
        return this.mCarRadioManager.getAudioMode();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setAudioGEQParams(int i, int i2, int i3, int i4) {
        this.mCarRadioManager.setAudioGEQParams(i, i2, i3, i4);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void setAudioBalanceFader(int i, int i2) {
        this.mCarRadioManager.setAudioBalanceFader(i, i2);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController
    public void enableAudioDpsInfoCallback() {
        this.mCarRadioManager.setAudioParameters();
    }
}
