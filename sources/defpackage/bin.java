package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.List;
import org.json.JSONObject;
/* compiled from: VuiElement.java */
/* renamed from: bin  reason: default package */
/* loaded from: classes2.dex */
public class bin implements Cloneable {
    public JsonObject actions;
    public bim animation;
    private List<bin> elements;
    private Boolean enabled;
    public String fatherElementId;
    public String fatherLabel;
    private String feedbackType;
    public String id;
    public String label;
    private Boolean layoutLoadable;
    private String mode;
    private int position;
    private int priority;
    private JsonObject props;
    private String resourceName;
    public List<String> resultActions;
    private long timestamp;
    public String type;
    public Object values;
    private Boolean visible;

    public void setValues(Object obj) {
        this.values = obj;
    }

    public void setLayoutLoadable(Boolean bool) {
        this.layoutLoadable = bool;
    }

    public Object getValues() {
        return this.values;
    }

    public Boolean isLayoutLoadable() {
        return this.layoutLoadable;
    }

    public bim getAnimation() {
        return this.animation;
    }

    public void setAnimation(bim bimVar) {
        this.animation = bimVar;
    }

    public void setResultActions(List<String> list) {
        this.resultActions = list;
    }

    public List<String> getResultActions() {
        return this.resultActions;
    }

    public String getMode() {
        return this.mode;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(String str) {
        this.resourceName = str;
    }

    public void setFatherElementId(String str) {
        this.fatherElementId = str;
    }

    public void setActions(String str) {
        this.actions = getElementAction(str);
    }

    public void setVisible(Boolean bool) {
        this.visible = bool;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public void setFeedbackType(String str) {
        this.feedbackType = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public int getPriority() {
        return this.priority;
    }

    public JsonObject getProps() {
        return this.props;
    }

    public String getId() {
        return this.id;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public String getLabel() {
        return this.label;
    }

    public String getFatherLabel() {
        return this.fatherLabel;
    }

    public String getType() {
        return this.type;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setFatherLabel(String str) {
        this.fatherLabel = str;
    }

    public void setProps(JsonObject jsonObject) {
        this.props = jsonObject;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getFatherElementId() {
        return this.fatherElementId;
    }

    public JsonObject getActions() {
        return this.actions;
    }

    public Boolean isVisible() {
        return this.visible;
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public String getFeedbackType() {
        return this.feedbackType;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public List<bin> getElements() {
        return this.elements;
    }

    public void setElements(List<bin> list) {
        this.elements = list;
    }

    public bin() {
        this.id = null;
        this.fatherElementId = null;
        this.label = "";
        this.fatherLabel = null;
        this.values = null;
        this.props = null;
        this.type = null;
        this.actions = null;
        this.layoutLoadable = null;
        this.resourceName = null;
        this.mode = null;
        this.resultActions = null;
        this.animation = null;
        this.position = -1;
        this.visible = null;
        this.enabled = null;
        this.feedbackType = null;
        this.timestamp = -1L;
        this.priority = -1;
        this.elements = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VuiElement{id='");
        sb.append(this.id);
        sb.append('\'');
        sb.append(", fatherElementId='");
        sb.append(this.fatherElementId);
        sb.append('\'');
        sb.append(", label='");
        sb.append(this.label);
        sb.append('\'');
        sb.append(", fatherLabel='");
        sb.append(this.fatherLabel);
        sb.append('\'');
        sb.append(", values=");
        sb.append(this.values);
        sb.append(", props=");
        sb.append(this.props);
        sb.append(", type='");
        sb.append(this.type);
        sb.append('\'');
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", layoutLoadable=");
        sb.append(this.layoutLoadable);
        sb.append(", resourceName='");
        sb.append(this.resourceName);
        sb.append('\'');
        sb.append(", mode='");
        sb.append(this.mode);
        sb.append('\'');
        sb.append(", resultActions=");
        sb.append(this.resultActions);
        sb.append(", animation=");
        bim bimVar = this.animation;
        sb.append(bimVar == null ? "" : bimVar.toString());
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", feedbackType='");
        sb.append(this.feedbackType);
        sb.append('\'');
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", elements=");
        sb.append(this.elements);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bin) {
            bin binVar = (bin) obj;
            if (isEqualsOfString(this.type, binVar.getType()) && isEqualsOfString(this.label, binVar.getLabel()) && isEqualsOfString(this.fatherElementId, binVar.getFatherElementId()) && isEqualsOfString(this.fatherLabel, binVar.getFatherLabel()) && isEqualsOfString(this.mode, binVar.getMode()) && isEqualsOfString(this.resourceName, binVar.getResourceName()) && this.position == binVar.getPosition() && this.priority == binVar.getPriority() && isEqualsOfBoolean(this.layoutLoadable, binVar.layoutLoadable) && isEqualsOfBoolean(this.visible, binVar.visible) && isEqualsOfJson(this.actions, binVar.actions) && isEqualsOfJson(this.props, binVar.props) && isEqualsOfJson(this.values, binVar.values)) {
                if (this.elements == null && binVar.getElements() == null) {
                    return true;
                }
                if (this.elements == null || binVar.getElements() == null || this.elements.size() != binVar.getElements().size()) {
                    return false;
                }
                for (int i = 0; i < this.elements.size(); i++) {
                    if (!this.elements.get(i).equals(binVar.elements.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isEqualsOfString(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return true;
        }
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) ? false : true;
    }

    private boolean isEqualsOfBoolean(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        return (bool == null || bool2 == null || bool.booleanValue() != bool2.booleanValue()) ? false : true;
    }

    private boolean isEqualsOfJson(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    public bin(a aVar) {
        this.id = null;
        this.fatherElementId = null;
        this.label = "";
        this.fatherLabel = null;
        this.values = null;
        this.props = null;
        this.type = null;
        this.actions = null;
        this.layoutLoadable = null;
        this.resourceName = null;
        this.mode = null;
        this.resultActions = null;
        this.animation = null;
        this.position = -1;
        this.visible = null;
        this.enabled = null;
        this.feedbackType = null;
        this.timestamp = -1L;
        this.priority = -1;
        this.elements = null;
        this.type = aVar.a;
        this.label = aVar.b;
        this.id = aVar.c;
        this.timestamp = aVar.d;
        this.actions = aVar.e;
        this.visible = aVar.f;
        this.enabled = aVar.g;
        this.props = aVar.i;
        this.values = aVar.h;
        this.resourceName = aVar.j;
    }

    public static JsonObject getElementAction(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\|");
        JSONObject jSONObject = new JSONObject();
        List<String> b = big.b();
        List<String> b2 = bif.b();
        for (int i = 0; i < split.length; i++) {
            if (split[i].contains(":")) {
                int indexOf = split[i].indexOf(":");
                String substring = split[i].substring(0, indexOf);
                if (!b.contains(substring)) {
                    return null;
                }
                String[] split2 = split[i].substring(indexOf + 1).split(ListSignBean.COLLECTID_SUFFIX);
                if (split2.length < 2) {
                    return null;
                }
                try {
                    if (!b2.contains(split2[0])) {
                        return null;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("actType", split2[0]);
                    jSONObject2.put("bizType", split2[1]);
                    jSONObject.put(substring, jSONObject2);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                try {
                    if (!b.contains(split[i])) {
                        return null;
                    }
                    jSONObject.put(split[i], new JSONObject());
                } catch (Exception unused2) {
                    return null;
                }
            }
        }
        return (JsonObject) new Gson().fromJson(jSONObject.toString(), (Class<Object>) JsonObject.class);
    }

    /* compiled from: VuiElement.java */
    /* renamed from: bin$a */
    /* loaded from: classes2.dex */
    public static class a {
        private String a = null;
        private String b = "";
        private String c = null;
        private long d = System.currentTimeMillis();
        private JsonObject e = null;
        private Boolean f = null;
        private Boolean g = null;
        private Object h = null;
        private JsonObject i = null;
        private String j = null;

        public a a(String str) {
            this.a = str;
            return this;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a a(long j) {
            this.d = j;
            return this;
        }

        public a d(String str) {
            this.e = bin.getElementAction(str);
            return this;
        }

        public bin a() {
            return new bin(this);
        }
    }

    /* renamed from: clone */
    public bin m1clone() {
        try {
            return (bin) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
