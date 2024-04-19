package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: VuiAction.java */
/* renamed from: big  reason: default package */
/* loaded from: classes2.dex */
public enum big {
    CLICK("Click"),
    SETVALUE("SetValue"),
    SCROLLBYX("ScrollByX"),
    SCROLLBYY("ScrollByY"),
    SETCHECK("SetCheck"),
    ITEMCLICK("ItemClick"),
    SELECTTAB("SelectTab"),
    SCROLLTO("ScrollTo"),
    SETSELECTED("SetSelected");
    
    private String name;

    big(String str) {
        this.name = str;
    }

    public String a() {
        return this.name;
    }

    public static List<String> b() {
        ArrayList arrayList = new ArrayList();
        for (big bigVar : values()) {
            arrayList.add(bigVar.a());
        }
        return arrayList;
    }
}
