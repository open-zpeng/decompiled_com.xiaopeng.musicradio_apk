package com.xiaopeng.musicradio.bean.search;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* loaded from: classes.dex */
public class DuiSemanticBean {
    private String domain;
    private IntentsBean intents;

    public IntentsBean getIntents() {
        return this.intents;
    }

    public void setIntents(IntentsBean intentsBean) {
        this.intents = intentsBean;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    /* loaded from: classes.dex */
    public static class IntentsBean {
        @SerializedName("music_search_play")
        private MusicSearchPlayBean musicSearchPlay;

        public MusicSearchPlayBean getMusicSearchPlay() {
            return this.musicSearchPlay;
        }

        public void setMusicSearchPlay(MusicSearchPlayBean musicSearchPlayBean) {
            this.musicSearchPlay = musicSearchPlayBean;
        }

        /* loaded from: classes.dex */
        public static class MusicSearchPlayBean {
            private double intentConfidence;
            private String intentName;
            private int slotConfidence;
            private List<SlotsBean> slots;

            public String getIntentName() {
                return this.intentName;
            }

            public void setIntentName(String str) {
                this.intentName = str;
            }

            public double getIntentConfidence() {
                return this.intentConfidence;
            }

            public void setIntentConfidence(double d) {
                this.intentConfidence = d;
            }

            public int getSlotConfidence() {
                return this.slotConfidence;
            }

            public void setSlotConfidence(int i) {
                this.slotConfidence = i;
            }

            public List<SlotsBean> getSlots() {
                return this.slots;
            }

            public void setSlots(List<SlotsBean> list) {
                this.slots = list;
            }

            /* loaded from: classes.dex */
            public static class SlotsBean {
                private String name;
                private List<Integer> pos;
                private String rawvalue;
                private String value;
                @SerializedName("value_type")
                private String valueType;

                public String getValueType() {
                    return this.valueType;
                }

                public void setValueType(String str) {
                    this.valueType = str;
                }

                public String getRawvalue() {
                    return this.rawvalue;
                }

                public void setRawvalue(String str) {
                    this.rawvalue = str;
                }

                public String getName() {
                    return this.name;
                }

                public void setName(String str) {
                    this.name = str;
                }

                public String getValue() {
                    return this.value;
                }

                public void setValue(String str) {
                    this.value = str;
                }

                public List<Integer> getPos() {
                    return this.pos;
                }

                public void setPos(List<Integer> list) {
                    this.pos = list;
                }
            }
        }
    }
}
