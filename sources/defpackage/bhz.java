package defpackage;

import android.view.View;
import org.json.JSONObject;
/* compiled from: IVuiElement.java */
/* renamed from: bhz  reason: default package */
/* loaded from: classes2.dex */
public interface bhz {
    default String getVuiAction() {
        return "";
    }

    default String getVuiBizId() {
        return null;
    }

    default bib getVuiElementChangedListener() {
        return null;
    }

    default String getVuiElementId() {
        return "";
    }

    default String getVuiFatherElementId() {
        return "-1";
    }

    default String getVuiFatherLabel() {
        return "";
    }

    default String getVuiLabel() {
        return null;
    }

    default int getVuiPosition() {
        return -1;
    }

    default JSONObject getVuiProps() {
        return null;
    }

    default Object getVuiValue() {
        return null;
    }

    default boolean isPerformVuiAction() {
        return false;
    }

    default boolean isVuiLayoutLoadable() {
        return false;
    }

    default boolean isVuiModeEnabled() {
        return false;
    }

    default void setPerformVuiAction(boolean z) {
    }

    default void setVuiAction(String str) {
    }

    default void setVuiElementChangedListener(bib bibVar) {
    }

    default void setVuiElementId(String str) {
    }

    default void setVuiElementType(bih bihVar) {
    }

    default void setVuiLabel(String str) {
    }

    default void setVuiPosition(int i) {
    }

    default void setVuiPriority(bik bikVar) {
    }

    default void setVuiProps(JSONObject jSONObject) {
    }

    default void setVuiValue(Object obj, View view) {
    }

    default bik getVuiPriority() {
        return bik.LEVEL3;
    }

    default bih getVuiElementType() {
        return bih.UNKNOWN;
    }

    default bij getVuiMode() {
        return bij.NORMAL;
    }
}
