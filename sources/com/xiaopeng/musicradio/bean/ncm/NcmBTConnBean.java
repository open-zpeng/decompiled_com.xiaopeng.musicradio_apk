package com.xiaopeng.musicradio.bean.ncm;
/* loaded from: classes.dex */
public class NcmBTConnBean extends BaseIcmBean {
    private NotifyBean notify;

    public NotifyBean getNotify() {
        return this.notify;
    }

    public void setNotify(NotifyBean notifyBean) {
        this.notify = notifyBean;
    }

    /* loaded from: classes.dex */
    public static class NotifyBean {
        private String MsgIndex = "";
        private String NomalRoadName = "";
        private String CDUrecording = "";
        private String CDUUSBInsert = "";
        private String BluetoothMusic = "";
        private String NomalSpeedLimit = "";
        private String ChargeTime = "";

        public String getMsgIndex() {
            return this.MsgIndex;
        }

        public void setMsgIndex(String str) {
            this.MsgIndex = str;
        }

        public String getNomalRoadName() {
            return this.NomalRoadName;
        }

        public void setNomalRoadName(String str) {
            this.NomalRoadName = str;
        }

        public String getCDUrecording() {
            return this.CDUrecording;
        }

        public void setCDUrecording(String str) {
            this.CDUrecording = str;
        }

        public String getCDUUSBInsert() {
            return this.CDUUSBInsert;
        }

        public void setCDUUSBInsert(String str) {
            this.CDUUSBInsert = str;
        }

        public String getBluetoothMusic() {
            return this.BluetoothMusic;
        }

        public void setBluetoothMusic(String str) {
            this.BluetoothMusic = str;
        }

        public String getNomalSpeedLimit() {
            return this.NomalSpeedLimit;
        }

        public void setNomalSpeedLimit(String str) {
            this.NomalSpeedLimit = str;
        }

        public String getChargeTime() {
            return this.ChargeTime;
        }

        public void setChargeTime(String str) {
            this.ChargeTime = str;
        }

        public String toString() {
            return "NotifyBean{MsgIndex='" + this.MsgIndex + "', NomalRoadName='" + this.NomalRoadName + "', CDUrecording='" + this.CDUrecording + "', CDUUSBInsert='" + this.CDUUSBInsert + "', BluetoothMusic='" + this.BluetoothMusic + "', NomalSpeedLimit='" + this.NomalSpeedLimit + "', ChargeTime='" + this.ChargeTime + "'}";
        }
    }

    public String toString() {
        return "NcmBTConnBean{enable='" + getEnable() + "', msgtype='" + getMsgtype() + "', notify=" + this.notify + '}';
    }
}
