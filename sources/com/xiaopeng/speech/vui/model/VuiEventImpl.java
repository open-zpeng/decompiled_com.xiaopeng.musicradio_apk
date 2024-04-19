package com.xiaopeng.speech.vui.model;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import com.xiaopeng.speech.vui.utils.LogUtils;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class VuiEventImpl extends bio {
    private bin data;
    private String userQuery = null;
    private String eventName = null;
    private String props = null;

    public VuiEventImpl(bin binVar) {
        this.data = null;
        this.data = binVar;
    }

    @Override // defpackage.bio
    public <T> T getEventValue(bio bioVar) {
        bin hitVuiElement;
        Map map;
        LogUtils.logDebug("getEventValue", new Gson().toJson(bioVar));
        if (bioVar == null || (hitVuiElement = bioVar.getHitVuiElement()) == null || hitVuiElement.getResultActions() == null || hitVuiElement.getResultActions().isEmpty()) {
            return null;
        }
        Object obj = (String) hitVuiElement.getResultActions().get(0);
        if ((hitVuiElement.getValues() instanceof LinkedTreeMap) && (map = (Map) hitVuiElement.getValues()) != null) {
            if (map.get(obj) instanceof LinkedTreeMap) {
                Map map2 = (Map) map.get(obj);
                if (map2 != null) {
                    if (map2.containsKey("value")) {
                        if (map2.get("value") != null) {
                            return (T) map2.get("value");
                        }
                    } else if (map2.containsKey(Constants.INDEX) && map2.get(Constants.INDEX) != null) {
                        return (T) map2.get(Constants.INDEX);
                    }
                }
            } else if (map.get(map) != null) {
                return (T) map.get("value");
            }
        }
        return null;
    }

    public String getUserQuery() {
        return this.userQuery;
    }

    public String getEventName() {
        return this.eventName;
    }

    @Override // defpackage.bio
    public bin getHitVuiElement() {
        bin binVar = this.data;
        if (binVar != null) {
            if (binVar.getResultActions() != null && !this.data.getResultActions().isEmpty()) {
                return this.data;
            }
            List<bin> hitVuiElements = getHitVuiElements(this.data.getElements());
            if (hitVuiElements == null || hitVuiElements.isEmpty()) {
                return null;
            }
            return hitVuiElements.get(0);
        }
        return null;
    }

    public bin getMetaData() {
        return this.data;
    }

    public String getProps() {
        return this.props;
    }

    public void setUserQuery(String str) {
        this.userQuery = str;
    }

    public void setEventName(String str) {
        this.eventName = str;
    }

    public void setData(bin binVar) {
        this.data = binVar;
    }

    public void setProps(String str) {
        this.props = str;
    }

    @Override // defpackage.bio
    public List<bin> getHitVuiElements(List<bin> list) {
        if (list == null || list.isEmpty() || isLeafNode(list.get(0))) {
            return list;
        }
        if (list.get(0) == null) {
            return null;
        }
        return getHitVuiElements(list.get(0).getElements());
    }

    private boolean isLeafNode(bin binVar) {
        return (binVar == null || binVar.getResultActions() == null || binVar.getResultActions().isEmpty()) ? false : true;
    }
}
