package defpackage;

import com.xiaopeng.libconfig.settings.SettingsUtil;
/* compiled from: VuiFeedbackType.java */
/* renamed from: bii  reason: default package */
/* loaded from: classes2.dex */
public enum bii {
    SOUND(SettingsUtil.PAGE_SOUND),
    TTS("Tts");
    
    private String type;

    bii(String str) {
        this.type = str;
    }

    public String a() {
        return this.type;
    }
}
