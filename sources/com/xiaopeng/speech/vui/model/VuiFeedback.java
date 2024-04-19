package com.xiaopeng.speech.vui.model;
/* loaded from: classes2.dex */
public class VuiFeedback {
    public VuiFeedbackCode code;
    public String content;
    private bii feedbackType;
    public String resourceName;
    public int state;

    public void setState(int i) {
        this.state = i;
    }

    public int getState() {
        return this.state;
    }

    public VuiFeedbackCode getCode() {
        return this.code;
    }

    public String getContent() {
        return this.content;
    }

    public void setCode(VuiFeedbackCode vuiFeedbackCode) {
        this.code = vuiFeedbackCode;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setResourceName(String str) {
        this.resourceName = str;
    }

    public void setFeedbackType(bii biiVar) {
        this.feedbackType = biiVar;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public bii getFeedbackType() {
        return this.feedbackType;
    }

    public String toString() {
        return "VuiFeedback{code=" + this.code.getFeedbackCode() + ", content='" + this.content + "', resourceName='" + this.resourceName + "', state=" + this.state + ", feedbackType=" + this.feedbackType.a() + '}';
    }

    private VuiFeedback(Builder builder) {
        this.code = VuiFeedbackCode.SUCCESS;
        this.feedbackType = bii.TTS;
        this.state = builder.state;
        this.content = builder.content;
        this.code = builder.code;
        this.feedbackType = builder.type;
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private String content;
        private int state = -1;
        private VuiFeedbackCode code = VuiFeedbackCode.SUCCESS;
        private bii type = bii.TTS;

        public Builder state(int i) {
            this.state = i;
            return this;
        }

        public Builder content(String str) {
            this.content = str;
            return this;
        }

        public Builder code(VuiFeedbackCode vuiFeedbackCode) {
            this.code = vuiFeedbackCode;
            return this;
        }

        public Builder type(bii biiVar) {
            this.type = biiVar;
            return this;
        }

        public VuiFeedback build() {
            return new VuiFeedback(this);
        }
    }
}
