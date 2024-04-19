package com.xiaopeng.lib.framework.aiassistantmodule.sensor.item;

import com.xiaopeng.lib.framework.moduleinterface.aiassistantmodule.sensor.BaseSensor;
/* loaded from: classes.dex */
public abstract class CarFaultSensor extends BaseSensor {
    private int frontCollisionSecurity;
    private int longCtrlRemind;

    public int getFrontCollisionSecurity() {
        return this.frontCollisionSecurity;
    }

    public void setFrontCollisionSecurity(int i) {
        this.frontCollisionSecurity = i;
    }

    public int getLongCtrlRemind() {
        return this.longCtrlRemind;
    }

    public void setLongCtrlRemind(int i) {
        this.longCtrlRemind = i;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.aiassistantmodule.sensor.BaseSensor
    public String sensorName() {
        return CarFaultSensor.class.getSimpleName();
    }
}
