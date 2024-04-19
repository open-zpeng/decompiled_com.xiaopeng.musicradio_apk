package com.xiaopeng.speech.vui.event;

import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.gson.internal.LinkedTreeMap;
import com.xiaopeng.speech.vui.utils.LogUtils;
import java.util.Map;
/* loaded from: classes2.dex */
public class SetCheckEvent extends BaseEvent {
    @Override // com.xiaopeng.speech.vui.event.IVuiEvent
    public <T extends View> T run(T t, bin binVar) {
        Boolean bool;
        if (t == null) {
            return null;
        }
        if (binVar != null && binVar.getResultActions() != null && !binVar.getResultActions().isEmpty() && (bool = (Boolean) getSetCheck(binVar)) != null) {
            if (t instanceof CompoundButton) {
                CompoundButton compoundButton = (CompoundButton) t;
                if ((!bool.booleanValue()) == compoundButton.isChecked()) {
                    LogUtils.d("SetCheckEvent run on CompoundButton");
                    boolean z = t instanceof bhz;
                    if (z) {
                        ((bhz) t).setPerformVuiAction(true);
                    }
                    compoundButton.setChecked(bool.booleanValue());
                    if (z) {
                        ((bhz) t).setPerformVuiAction(false);
                    }
                }
            } else if (t instanceof Checkable) {
                if ((!bool.booleanValue()) == ((Checkable) t).isChecked()) {
                    LogUtils.d("SetCheckEvent run on Checkable view");
                    boolean z2 = t instanceof bhz;
                    if (z2) {
                        ((bhz) t).setPerformVuiAction(true);
                    }
                    t.performClick();
                    if (z2) {
                        ((bhz) t).setPerformVuiAction(false);
                    }
                }
            } else if ((!bool.booleanValue()) == t.isSelected()) {
                LogUtils.d("SetCheckEvent run on setSelected view");
                boolean z3 = t instanceof bhz;
                if (z3) {
                    ((bhz) t).setPerformVuiAction(true);
                }
                t.performClick();
                if (z3) {
                    ((bhz) t).setPerformVuiAction(false);
                }
            }
        }
        return t;
    }

    private <T> T getSetCheck(bin binVar) {
        Map map;
        if (binVar == null || binVar.getResultActions() == null || binVar.getResultActions().isEmpty()) {
            return null;
        }
        Object obj = (String) binVar.getResultActions().get(0);
        if (!(binVar.getValues() instanceof LinkedTreeMap) || (map = (Map) binVar.getValues()) == null) {
            return null;
        }
        if (map.get(obj) instanceof LinkedTreeMap) {
            Map map2 = (Map) map.get(obj);
            if (map2 == null || map2.get("value") == null) {
                return null;
            }
            return (T) map2.get("value");
        } else if (map.get(map) != null) {
            return (T) map.get("value");
        } else {
            return null;
        }
    }
}
