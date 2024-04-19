package com.xiaopeng.lib.framework.carcontrollermodule.controller;

import android.car.Car;
import android.car.CarNotConnectedException;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.hvac.CarHvacManager;
import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IEventMsg;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController;
import java.util.List;
/* loaded from: classes.dex */
public class HVACController extends AbstractController implements IHVACController {
    private static final String TAG = "HVACController";
    private CarHvacManager.CarHvacEventCallback mCarHVACEventCallback;
    private CarHvacManager mCarHVACManager;

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public boolean getHVACEcon() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public float getOutsideAirTemp() {
        return 0.0f;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getPtcError() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getTempPTCStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public boolean isError() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACEcon(boolean z) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setTempPTCStatus(int i) {
    }

    public HVACController(Car car) {
        super(car);
        this.mCarHVACEventCallback = null;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initCarManager(Car car) {
        this.mCarApiClient = car;
        try {
            this.mCarHVACManager = (CarHvacManager) car.getCarManager("hvac");
        } catch (Exception unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initPropertyTypeMap() {
        this.mPropertyTypeMap.put(557849130, IHVACController.HVACPowerModeEventMsg.class);
        this.mPropertyTypeMap.put(557849127, IHVACController.HVACTempACModeEventMsg.class);
        this.mPropertyTypeMap.put(358614275, IHVACController.HVACTempDriverValueEventMsg.class);
        this.mPropertyTypeMap.put(559946242, IHVACController.HVACTempPsnValueEventMsg.class);
        this.mPropertyTypeMap.put(557849129, IHVACController.HVACAutoModeEventMsg.class);
        this.mPropertyTypeMap.put(557849091, IHVACController.HVACAutoModeBlowLevelEventMsg.class);
        this.mPropertyTypeMap.put(356517128, IHVACController.HVACCirculationModeEventMsg.class);
        this.mPropertyTypeMap.put(557849126, IHVACController.HVACFrontDefrostModeEventMsg.class);
        this.mPropertyTypeMap.put(356517121, IHVACController.HVACWindBlowModeEventMsg.class);
        this.mPropertyTypeMap.put(356517120, IHVACController.HVACWindSpeedLevelEventMsg.class);
        this.mPropertyTypeMap.put(557849089, IHVACController.HVACQualityPurgeModeEventMsg.class);
        this.mPropertyTypeMap.put(557849094, IHVACController.HVACQualityOutsideStatusEventMsg.class);
        this.mPropertyTypeMap.put(557849093, IHVACController.HVACQualityOutsideLevelEventMsg.class);
        this.mPropertyTypeMap.put(559946285, IHVACController.HVACInnerTempEventMsg.class);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void registerCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarHVACEventCallback == null) {
            this.mCarHVACEventCallback = new CarHvacManager.CarHvacEventCallback() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.HVACController.1
                public void onChangeEvent(CarPropertyValue carPropertyValue) {
                    HVACController hVACController = HVACController.this;
                    hVACController.postEventBusMsg(hVACController.mPropertyTypeMap.get(Integer.valueOf(carPropertyValue.getPropertyId())), carPropertyValue);
                }

                public void onErrorEvent(int i, int i2) {
                    Log.e(HVACController.TAG, "onErrorEvent arg1 = " + i + " arg2 = " + i2);
                }
            };
        }
        try {
            this.mCarHVACManager.registerPropCallback(convertRegisterPropertyList(list), this.mCarHVACEventCallback);
        } catch (Exception unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void unregisterCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarHVACEventCallback == null) {
            return;
        }
        try {
            this.mCarHVACManager.unregisterPropCallback(convertRegisterPropertyList(list), this.mCarHVACEventCallback);
        } catch (CarNotConnectedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    @Deprecated
    public void setHVACPowerMode() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACPowerMode(boolean z) {
        this.mCarHVACManager.setHvacPowerMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public boolean getHVACPowerMode() {
        return this.mCarHVACManager.getHvacPowerMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempACMode() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempACMode(boolean z) {
        this.mCarHVACManager.setHvacTempAcMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public boolean getHVACTempACMode() {
        return this.mCarHVACManager.getHvacTempAcMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempSyncMode() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempSyncMode(boolean z) {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public boolean getHVACTempSyncMode() {
        return this.mCarHVACManager.getHvacTempSyncMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempDriverValue(float f) {
        this.mCarHVACManager.setHvacTempDriverValue(f);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempDriverUp() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempDriverUp(float f) {
        this.mCarHVACManager.setHvacTempDriverUp(f);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempDriverDown() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempDriverDown(float f) {
        this.mCarHVACManager.setHvacTempDriverDown(f);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public float getHVACTempDriverValue() {
        return this.mCarHVACManager.getHvacTempDriverValue();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempPsnValue(float f) {
        this.mCarHVACManager.setHvacTempPsnValue(f);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempPsnUp() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempPsnUp(float f) {
        this.mCarHVACManager.setHvacTempPsnUp(f);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempPsnDown() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACTempPsnDown(float f) {
        this.mCarHVACManager.setHvacTempPsnDown(f);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public float getHVACTempPsnValue() {
        return this.mCarHVACManager.getHvacTempPsnValue();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACAutoMode() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACAutoMode(boolean z) {
        this.mCarHVACManager.setHvacAutoMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public boolean getHVACAutoMode() {
        return this.mCarHVACManager.getHvacAutoMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACAutoModeBlowLevel(int i) {
        this.mCarHVACManager.setHvacAutoModeBlowLevel(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getHVACAutoModeBlowLevel() {
        return this.mCarHVACManager.getHvacAutoModeBlowLevel();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACCirculationMode() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACCirculationMode(int i) {
        this.mCarHVACManager.setHvacCirculationMode(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getHVACCirculationMode() {
        return this.mCarHVACManager.getHvacCirculationMode();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACFrontDefrostMode() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACFrontDefrostMode(boolean z) {
        this.mCarHVACManager.setHvacFrontDefrostMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public boolean getHVACFrontDefrostMode() {
        return this.mCarHVACManager.getHVACFrontDefrostMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACWindBlowMode(int i) {
        this.mCarHVACManager.setHvacWindBlowMode(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getHVACWindBlowMode() {
        return this.mCarHVACManager.getHvacWindBlowMode();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACWindSpeedLevel(int i) {
        this.mCarHVACManager.setHvacWindSpeedLevel(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACWindSpeedUp() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACWindSpeedUp(int i) {
        this.mCarHVACManager.setHvacWindSpeedUp(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACWindSpeedDown() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACWindSpeedDown(int i) {
        this.mCarHVACManager.setHvacWindSpeedDown(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getHVACWindSpeedLevel() {
        return this.mCarHVACManager.getHvacWindSpeedLevel();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACQualityPurgeMode() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public void setHVACQualityPurgeMode(boolean z) {
        this.mCarHVACManager.setHvacQualityPurgeMode(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public boolean getHVACQualityPurgeMode() {
        return this.mCarHVACManager.getHvacQualityPurgeMode() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getHVACQualityInnerPM25Value() {
        return this.mCarHVACManager.getHvacQualityInnerPm25Value();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getHVACQualityOutsideStatus() {
        return this.mCarHVACManager.getHvacQualityOutsideStatus();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int getHVACQualityOutsideLevel() {
        return this.mCarHVACManager.getHvacQualityOutsideLevel();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public float getHVACInnerTemp() {
        return this.mCarHVACManager.getHvacInnerTemp();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IHVACController
    public int[] getCompressorErrorInfo() {
        return new int[0];
    }
}
