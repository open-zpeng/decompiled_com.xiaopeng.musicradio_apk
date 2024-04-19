package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: IVuiEngine.java */
/* renamed from: bid  reason: default package */
/* loaded from: classes2.dex */
public interface bid {
    void addVuiSceneListener(String str, View view, bie bieVar);

    void addVuiSceneListener(String str, View view, bie bieVar, bib bibVar);

    void buildScene(String str, View view, List<Integer> list, bic bicVar, String str2, bie bieVar);

    void enterScene(String str, String str2);

    void exitScene(String str, String str2, bie bieVar);

    void removeVuiSceneListener(String str, bie bieVar);

    void updateElementAttribute(String str, View view);

    void updateScene(String str, View view);
}
