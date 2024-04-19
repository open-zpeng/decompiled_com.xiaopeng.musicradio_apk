package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: VuiActType.java */
/* renamed from: bif  reason: default package */
/* loaded from: classes2.dex */
public enum bif {
    SEARCH("Search"),
    SELECT("Select"),
    EDIT("Edit"),
    OPEN("Open"),
    DELETE("Delete"),
    DETAIL("Detail"),
    EXPANDFOLD("ExpandFold"),
    ROLL("Roll"),
    TAB("Tab"),
    SELECTTAB("SelectTab"),
    SLIDE("Slide"),
    UP("Up"),
    DOWN("Down"),
    LEFT("Left"),
    RIGHT("Right"),
    SET("Set"),
    SORT("Sort"),
    EXPAND("Expand"),
    ADD("Add"),
    PLAY("Play"),
    NULL("Null");
    
    private String type;

    bif(String str) {
        this.type = str;
    }

    public String a() {
        return this.type;
    }

    public static List<String> b() {
        ArrayList arrayList = new ArrayList();
        for (bif bifVar : values()) {
            arrayList.add(bifVar.a());
        }
        return arrayList;
    }
}
