package com.xiaopeng.lib.framework.carcontrollermodule.controller;

import android.car.Car;
import android.car.CarNotConnectedException;
import android.car.hardware.CarPropertyValue;
import android.car.hardware.avm.CarAvmManager;
import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IEventMsg;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IAvmController;
import java.util.List;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
/* loaded from: classes.dex */
public class AvmController extends AbstractController implements IAvmController {
    private static final String TAG = "AvmController";
    private CarAvmManager.CarAvmEventCallback mCarAvmEventCallback;
    private CarAvmManager mCarAvmManager;

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public boolean getHasPanoCamera() {
        return false;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public int getRoofMoveCameraState() {
        return 0;
    }

    public AvmController(Car car) {
        super(car);
        this.mCarAvmEventCallback = null;
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initCarManager(Car car) {
        this.mCarApiClient = car;
        try {
            this.mCarAvmManager = (CarAvmManager) car.getCarManager("xp_avm");
        } catch (Exception unused) {
            Log.e(TAG, "Car not connected");
        }
    }

    @Override // com.xiaopeng.lib.framework.carcontrollermodule.controller.AbstractController
    public void initPropertyTypeMap() {
        this.mPropertyTypeMap.put(557855753, IAvmController.CameraAngleEventMsg.class);
        this.mPropertyTypeMap.put(557855755, IAvmController.CameraHeightEventMsg.class);
        this.mPropertyTypeMap.put(557855752, IAvmController.CameraRoofEventMsg.class);
        this.mPropertyTypeMap.put(560014876, IAvmController.V2FrontRadarDataEventMsg.class);
        this.mPropertyTypeMap.put(560014877, IAvmController.V2TailRadarDataEventMsg.class);
        this.mPropertyTypeMap.put(559948806, IAvmController.CameraSteerAngleEventMsg.class);
        this.mPropertyTypeMap.put(557855756, IAvmController.CameraRoofStateEventMsg.class);
        this.mPropertyTypeMap.put(557855758, IAvmController.CameraRoofPosEventMsg.class);
        this.mPropertyTypeMap.put(557855754, IAvmController.CameraRoofMoveStateEventMsg.class);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void registerCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarAvmEventCallback == null) {
            this.mCarAvmEventCallback = new CarAvmManager.CarAvmEventCallback() { // from class: com.xiaopeng.lib.framework.carcontrollermodule.controller.AvmController.1
                public void onChangeEvent(CarPropertyValue carPropertyValue) {
                    AvmController avmController = AvmController.this;
                    avmController.postEventBusMsg(avmController.mPropertyTypeMap.get(Integer.valueOf(carPropertyValue.getPropertyId())), carPropertyValue);
                }

                public void onErrorEvent(int i, int i2) {
                    Log.e(AvmController.TAG, "propertyId = " + i + " zone = " + i2);
                }
            };
        }
        try {
            this.mCarAvmManager.registerPropCallback(convertRegisterPropertyList(list), this.mCarAvmEventCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.ILifeCycle
    public void unregisterCanEventMsg(List<Class<? extends IEventMsg>> list) {
        if (this.mCarAvmEventCallback == null) {
            return;
        }
        try {
            this.mCarAvmManager.unregisterPropCallback(convertUnregisterPropertyList(list), this.mCarAvmEventCallback);
        } catch (CarNotConnectedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public void setCameraAngle(int i) {
        this.mCarAvmManager.setCameraAngle(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public int getCameraAngle() {
        return this.mCarAvmManager.getCameraAngle();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public void setCameraHeight(boolean z) {
        this.mCarAvmManager.setCameraHeight(z ? 1 : 0);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public boolean getCameraHeight() {
        throw new IllegalAccessException("not support");
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public void setCameraDisplayMode(int i) {
        this.mCarAvmManager.setCameraDisplayMode(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public int getCameraDisplayMode() {
        return this.mCarAvmManager.getCameraDisplayMode();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public boolean getHasRoofCamera() {
        return this.mCarAvmManager.getHasRoofCamera() == 1;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public float[] getFrontRadarData() {
        return this.mCarAvmManager.getFrontRadarData();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public float[] getTailRadarData() {
        return this.mCarAvmManager.getTailRadarData();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public float getSteerWheelRotationAngle() {
        return this.mCarAvmManager.getSteerWheelRotationAngle();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public int getRoofCameraState() {
        return this.mCarAvmManager.getRoofCameraState();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public int getRoofCameraPosition() {
        return this.mCarAvmManager.getRoofCameraPosition();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.IAvmController
    public int[] getCameraFailInfo() {
        return new int[0];
    }

    private float byte2float(byte[] bArr, int i) {
        return Float.intBitsToFloat((int) ((bArr[i + 3] << 24) | (((int) ((((int) ((bArr[i + 0] & 255) | (bArr[i + 1] << 8))) & MetadataDescriptor.WORD_MAXVALUE) | (bArr[i + 2] << 16))) & 16777215)));
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IAvmController
    public void setOverlayWorkSt(int i) {
        this.mCarAvmManager.setOverlayWorkSt(i);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IAvmController
    public int getOverlayWorkSt() {
        return this.mCarAvmManager.getOverlayWorkSt();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IAvmController
    public void setMultipleDisplayProperties(int i, int i2, int i3, int i4, int i5) {
        this.mCarAvmManager.setMultipleDisplayProperties(i, i2, i3, i4, i5);
    }
}
