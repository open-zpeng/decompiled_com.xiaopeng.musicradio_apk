package com.xiaopeng.lib.framework.carcontrollermodule.controller;

import android.car.Car;
import android.car.CarNotConnectedException;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.can.CarCanManager;
import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IEventMsg;
import java.util.List;
/* loaded from: classes.dex */
public class CanController extends AbstractController implements ICanController {
    private static final String TAG = "CanController";
    private CarCanManager.CarCanEventCallback mCarCanEventCallback;
    private CarCanManager mCarCanManager;

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initPropertyTypeMap() {
    }

    public CanController(Car car) {
        super(car);
        this.mCarCanEventCallback = null;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initCarManager(Car car) {
        this.mCarApiClient = car;
        try {
            this.mCarCanManager = (CarCanManager) car.getCarManager("xp_can");
        } catch (CarNotConnectedException | IllegalStateException unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void registerCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarCanEventCallback == null) {
            this.mCarCanEventCallback = new CarCanManager.CarCanEventCallback() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.CanController.1
                public void onChangeEvent(CarPropertyValue carPropertyValue) {
                    CanController canController = CanController.this;
                    canController.postEventBusMsg(canController.mPropertyTypeMap.get(Integer.valueOf(carPropertyValue.getPropertyId())), carPropertyValue);
                }

                public void onErrorEvent(int i, int i2) {
                    String simpleName = getClass().getSimpleName();
                    Log.e(simpleName, "propertyId = " + i + " zone = " + i2);
                }
            };
        }
        try {
            this.mCarCanManager.registerPropCallback(convertRegisterPropertyList(list), this.mCarCanEventCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void unregisterCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarCanEventCallback == null) {
            return;
        }
        try {
            this.mCarCanManager.unregisterPropCallback(convertUnregisterPropertyList(list), this.mCarCanEventCallback);
        } catch (CarNotConnectedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController
    public void sendCanDataSync() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController
    public byte[] getCanRawData() {
        throw new IllegalAccessException("not support any more!");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController
    public void setAdasMeta(byte[] bArr) {
        this.mCarCanManager.setAdasMeta(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController
    public void setAdasStub(byte[] bArr) {
        this.mCarCanManager.setAdasStub(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController
    public void setAdasProfShort(byte[] bArr) {
        this.mCarCanManager.setAdasProfShort(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController
    public void setAdasSegment(byte[] bArr) {
        this.mCarCanManager.setAdasSegment(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController
    public void setAdasPosition(byte[] bArr) {
        this.mCarCanManager.setAdasPosition(bArr);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ICanController
    public void setAdasProfLong(byte[] bArr) {
        this.mCarCanManager.setAdasProfLong(bArr);
    }
}
