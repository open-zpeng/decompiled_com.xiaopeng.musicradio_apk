package com.xiaopeng.speech.protocol.query.personalCenter;

import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import com.xiaopeng.speech.annotation.QueryAnnotation;
import com.xiaopeng.speech.common.util.c;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PersonalCenterQuery extends bfd<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int b(String str, String str2) {
        return ((a) this.b).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int c(String str, String str2) {
        int i;
        c.b("PersonalCenterQuery", "getControlProfileHabitNumSupport data = " + str2 + " , event = " + str);
        try {
            i = new JSONObject(str2).optInt(Constants.INDEX);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 0;
        }
        return ((a) this.b).a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int d(String str, String str2) {
        c.b("PersonalCenterQuery", "getGuiPageOpenState data = " + str2 + " , event = " + str);
        return ((a) this.b).a(str2);
    }
}
