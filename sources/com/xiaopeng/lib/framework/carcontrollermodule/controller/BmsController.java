package com.xiaopeng.lib.framework.carcontrollermodule.controller;

import android.car.Car;
import android.car.CarNotConnectedException;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.bms.CarBmsManager;
import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IEventMsg;
import java.util.List;
/* loaded from: classes.dex */
public class BmsController extends AbstractController implements IBmsController {
    private static final String TAG = "BmsController";
    private CarBmsManager.CarBmsEventCallback mCarBmsEventCallback;
    private CarBmsManager mCarBmsManager;

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public float getAcMaxCurrent() {
        return 0.0f;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getAddedElectricity() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getBatteryTotalVolt() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public float getDCCurrent() {
        return 0.0f;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public float getDCVolt() {
        return 0.0f;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getDcChargeStopReason() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getDtcChargeCurrentOver() {
        return 0;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getDtcErrorStopCurrent() {
        return 0;
    }

    public BmsController(Car car) {
        super(car);
        this.mCarBmsEventCallback = null;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initCarManager(Car car) {
        this.mCarApiClient = car;
        try {
            this.mCarBmsManager = (CarBmsManager) car.getCarManager("xp_bms");
        } catch (CarNotConnectedException | IllegalStateException unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initPropertyTypeMap() {
        this.mPropertyTypeMap.put(557853701, IBmsController.BmsFailureLvlEventMsg.class);
        this.mPropertyTypeMap.put(557853708, IBmsController.CellVoltMaxNumEventMsg.class);
        this.mPropertyTypeMap.put(557853697, IBmsController.CellVoltMinNumEventMsg.class);
        this.mPropertyTypeMap.put(557853713, IBmsController.BatteryTempMaxNumEventMsg.class);
        this.mPropertyTypeMap.put(557853698, IBmsController.BatteryTempMinNumEventMsg.class);
        this.mPropertyTypeMap.put(557853705, IBmsController.BatteryTempMaxEventMsg.class);
        this.mPropertyTypeMap.put(559950866, IBmsController.CellVoltMaxEventMsg.class);
        this.mPropertyTypeMap.put(559950867, IBmsController.CellVoltMinEventMsg.class);
        this.mPropertyTypeMap.put(559950856, IBmsController.BatteryCurrEventMsg.class);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void registerCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarBmsEventCallback == null) {
            this.mCarBmsEventCallback = new CarBmsManager.CarBmsEventCallback() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.BmsController.1
                public void onErrorEvent(int i, int i2) {
                }

                public void onChangeEvent(CarPropertyValue carPropertyValue) {
                    BmsController bmsController = BmsController.this;
                    bmsController.postEventBusMsg(bmsController.mPropertyTypeMap.get(Integer.valueOf(carPropertyValue.getPropertyId())), carPropertyValue);
                }
            };
        }
        try {
            this.mCarBmsManager.registerPropCallback(convertRegisterPropertyList(list), this.mCarBmsEventCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void unregisterCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarBmsEventCallback == null) {
            return;
        }
        try {
            this.mCarBmsManager.unregisterPropCallback(convertUnregisterPropertyList(list), this.mCarBmsEventCallback);
        } catch (CarNotConnectedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getBmsFailureLvl() {
        return this.mCarBmsManager.getBmsFailureLvl();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getVoltMaxNum() {
        return this.mCarBmsManager.getVoltMaxNum();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getVoltMinNum() {
        return this.mCarBmsManager.getVoltMinNum();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getTempMaxNum() {
        return this.mCarBmsManager.getTempMaxNum();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getTempMinNum() {
        return this.mCarBmsManager.getTempMinNum();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public float getTempMax() {
        return this.mCarBmsManager.getTempMax();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public float getVoltMax() {
        return this.mCarBmsManager.getVoltMax();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public float getVoltMin() {
        return this.mCarBmsManager.getVoltMin();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public int getInsulationResistance() {
        return this.mCarBmsManager.getInsulationResistance();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IBmsController
    public float getBatteryCurrent() {
        return this.mCarBmsManager.getBatteryCurrent();
    }
}
