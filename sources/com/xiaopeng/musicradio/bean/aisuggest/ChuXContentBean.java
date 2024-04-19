package com.xiaopeng.musicradio.bean.aisuggest;
/* loaded from: classes.dex */
public class ChuXContentBean {
    private int bizType;
    private int carState;
    private String content;
    private String messageId;
    private int messageType;
    private int priority;
    private int read_state;
    private int scene;
    private long ts;
    private int type;
    private int uid;
    private long validEndTs;
    private long validStartTs;

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public long getValidStartTs() {
        return this.validStartTs;
    }

    public void setValidStartTs(long j) {
        this.validStartTs = j;
    }

    public long getValidEndTs() {
        return this.validEndTs;
    }

    public void setValidEndTs(long j) {
        this.validEndTs = j;
    }

    public long getTs() {
        return this.ts;
    }

    public void setTs(long j) {
        this.ts = j;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public int getRead_state() {
        return this.read_state;
    }

    public void setRead_state(int i) {
        this.read_state = i;
    }

    public int getScene() {
        return this.scene;
    }

    public void setScene(int i) {
        this.scene = i;
    }

    public int getBizType() {
        return this.bizType;
    }

    public void setBizType(int i) {
        this.bizType = i;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public int getUid() {
        return this.uid;
    }

    public void setUid(int i) {
        this.uid = i;
    }

    public int getMessageType() {
        return this.messageType;
    }

    public void setMessageType(int i) {
        this.messageType = i;
    }

    public int getCarState() {
        return this.carState;
    }

    public void setCarState(int i) {
        this.carState = i;
    }
}
