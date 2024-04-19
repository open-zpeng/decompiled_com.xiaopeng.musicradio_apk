package com.xiaopeng.speech.vui.utils;

import android.content.Context;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* loaded from: classes2.dex */
public class ResourceUtil {
    public static int getId(Context context, String str) {
        return getIdentifierByType(context, str, "id");
    }

    public static int getLayoutId(Context context, String str) {
        return getIdentifierByType(context, str, TtmlNode.TAG_LAYOUT);
    }

    public static int getStringId(Context context, String str) {
        return getIdentifierByType(context, str, "string");
    }

    public static int getDrawableId(Context context, String str) {
        return getIdentifierByType(context, str, "drawable");
    }

    public static int getMipmapId(Context context, String str) {
        return getIdentifierByType(context, str, "mipmap");
    }

    public static int getColorId(Context context, String str) {
        return getIdentifierByType(context, str, TtmlNode.ATTR_TTS_COLOR);
    }

    public static int getDimenId(Context context, String str) {
        return getIdentifierByType(context, str, "dimen");
    }

    public static int getAttrId(Context context, String str) {
        return getIdentifierByType(context, str, "attr");
    }

    public static int getStyleId(Context context, String str) {
        return getIdentifierByType(context, str, TtmlNode.TAG_STYLE);
    }

    public static int getAnimId(Context context, String str) {
        return getIdentifierByType(context, str, "anim");
    }

    public static int getArrayId(Context context, String str) {
        return getIdentifierByType(context, str, "array");
    }

    public static int getIntegerId(Context context, String str) {
        return getIdentifierByType(context, str, "integer");
    }

    public static int getBoolId(Context context, String str) {
        return getIdentifierByType(context, str, "bool");
    }

    private static int getIdentifierByType(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }
}
