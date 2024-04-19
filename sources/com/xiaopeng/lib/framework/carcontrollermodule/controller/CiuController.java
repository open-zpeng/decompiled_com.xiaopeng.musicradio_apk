package com.xiaopeng.lib.framework.carcontrollermodule.controller;

import android.car.Car;
import android.car.CarNotConnectedException;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.ciu.CarCiuManager;
import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IEventMsg;
import java.util.List;
/* loaded from: classes.dex */
public class CiuController extends AbstractController implements ICiuController {
    private static final String TAG = "CiuController";
    private CarCiuManager.CarCiuEventCallback mCarCiuEventCallback;
    private CarCiuManager mCarCiuManager;

    private void sendCommand(int i, int i2) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getCiuAutoLockSt() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public boolean getCiuCarWash() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getCiuConfigurationActive() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getCiuDelayOff() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getCiuDeliveryUploadMode() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getCiuRainSw() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getCiuValid() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getDVRFormatStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getDVRStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getDeleteResult() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getDistractionLevel() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getDistractionStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getDmsState() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getDvrLockFB() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getDvrMode() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getErrorType() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getFaceAction() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getFaceIdPrimalStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getFaceIdStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getFaceIdSw() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public boolean getFaceShield() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getFatIgStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getFatigueLevel() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getFatigueStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getLightIntensity() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getSdStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getSdcardStatus() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public int getUid() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initPropertyTypeMap() {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public boolean isDvrEnable() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void photoProcess() {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setCiuCarWash(boolean z) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setCiuConfigurationActive(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setCiuDelayOff(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setCiuDeliveryUploadMode(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setCiuRainSw(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDeleteFaceId(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDeleteMulti(int i, int i2) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDistractionStatus(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDmsMode(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDmsStatus(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDmsStatus(int i, int i2, int i3, int i4) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDvrEnable(boolean z) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDvrLockMode(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setDvrMode(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setFaceActionRequest(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setFaceIdMode(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setFaceIdSw(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setFatIgStatus(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setFatigueStatus(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setFirmFaceCancel(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setFormatMode(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setNotifyCiuAutoLightStatus(boolean z) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setRegHint(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setRegisterRequestMulti(int i, int i2, int i3) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setStartRegFlag(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setStartRegFlow(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setUid(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setVideoOutputMode(int i) {
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICiuController
    public void setVideoTimeLenMode(int i) {
    }

    public CiuController(Car car) {
        super(car);
        this.mCarCiuEventCallback = null;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initCarManager(Car car) {
        this.mCarApiClient = car;
        try {
            this.mCarCiuManager = (CarCiuManager) car.getCarManager("xp_ciu");
        } catch (CarNotConnectedException unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void registerCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarCiuEventCallback == null) {
            this.mCarCiuEventCallback = new CarCiuManager.CarCiuEventCallback() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.CiuController.1
                public void onChangeEvent(CarPropertyValue carPropertyValue) {
                    CiuController ciuController = CiuController.this;
                    ciuController.postEventBusMsg(ciuController.mPropertyTypeMap.get(Integer.valueOf(carPropertyValue.getPropertyId())), carPropertyValue);
                }

                public void onErrorEvent(int i, int i2) {
                    Log.e(CiuController.TAG, "propertyId = " + i + " zone = " + i2);
                }
            };
        }
        try {
            this.mCarCiuManager.registerPropCallback(convertRegisterPropertyList(list), this.mCarCiuEventCallback);
        } catch (Exception unused) {
            Log.e(getClass().getSimpleName(), "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void unregisterCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarCiuEventCallback == null) {
            return;
        }
        try {
            this.mCarCiuManager.unregisterPropCallback(convertUnregisterPropertyList(list), this.mCarCiuEventCallback);
        } catch (CarNotConnectedException e) {
            e.printStackTrace();
        }
    }
}
