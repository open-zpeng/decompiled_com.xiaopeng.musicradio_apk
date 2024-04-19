package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import defpackage.aht;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: MineVuiUtils.java */
/* renamed from: amk  reason: default package */
/* loaded from: classes2.dex */
public class amk {
    private static SparseArray<Integer> a = new SparseArray<>();
    private static String[] b;
    private static String[] c;

    static {
        a.put(f.h.bt_play_all, 0);
        a.put(f.h.bt_pause_all, 1);
        a.put(f.h.bt_continue_all, 2);
        Application a2 = a.a();
        b = new String[]{a2.getString(f.h.bt_play_all), a2.getString(f.h.bt_pause_all), a2.getString(f.h.bt_continue_all)};
        c = new String[]{a2.getString(f.h.bt_play_all), a2.getString(f.h.vui_label_stop), a2.getString(f.h.bt_continue_all)};
    }

    public static void a(View view, List<MusicInfo> list, String str) {
        aml.a(list, str);
    }

    public static boolean a(String str) {
        if (str != null) {
            for (String str2 : b) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(View view, bio bioVar) {
        if ((view instanceof VuiView) && a(view)) {
            String str = (String) bioVar.getEventValue(bioVar);
            if (a(str)) {
                String str2 = (String) view.getTag(aht.c.tag_vui_current_text);
                LogUtils.i("MineVuiUtils", "onClickVuiPlayAll:currentText=" + str2 + ",value=" + str);
                if (b[2].equals(str) || b[0].equals(str)) {
                    if (b[1].equals(str2)) {
                        a(view, 0, aht.e.vui_already_play);
                    } else {
                        b(view, str);
                    }
                } else if (b[1].equals(str)) {
                    if (b[1].equals(str2)) {
                        b(view, str);
                    } else {
                        a(view, 1, aht.e.vui_already_pause);
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static void b(View view, String str) {
        view.setTag(aht.c.tag_vui_value, str);
        VuiFloatingLayerManager.show(view);
        view.performClick();
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        return "1".equals(view.getTag(aht.c.tag_vui_play_all));
    }

    public static void a(String str, View view) {
        afd.a(str, view);
    }

    public static void b(View view) {
        VuiEngine.getInstance(a.a()).setExecuteVirtualTag(view);
    }

    public static void a(View view, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        VuiEngine.getInstance(a.a()).setVuiElementTag(view, str);
    }

    public static void a(View view, boolean z) {
        if (view instanceof VuiView) {
            ((VuiView) view).enableViewVuiMode(z);
        }
    }

    public static void a(View view, bih bihVar) {
        if (view instanceof VuiView) {
            ((VuiView) view).setVuiElementType(bihVar);
        }
    }

    public static void b(View view, boolean z) {
        if (view instanceof VuiView) {
            ((VuiView) view).setVuiLayoutLoadable(z);
        }
    }

    public static void a(View view, big... bigVarArr) {
        if (view instanceof VuiView) {
            VuiView vuiView = (VuiView) view;
            if (bigVarArr.length == 1) {
                vuiView.setVuiAction(bigVarArr[0].a());
            } else if (bigVarArr.length > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(bigVarArr[0].a());
                for (int i = 1; i < bigVarArr.length; i++) {
                    sb.append("|");
                    sb.append(bigVarArr[i].a());
                }
                vuiView.enableViewVuiMode(true);
            } else {
                vuiView.setVuiAction(null);
                vuiView.enableViewVuiMode(false);
            }
        }
    }

    public static List<String> a() {
        return Arrays.asList("MainMineLocalLeft", "MainLocalTop");
    }

    public static void a(BaseRecycleView baseRecycleView, String str, boolean z, boolean z2, String str2) {
        baseRecycleView.initVuiAttr(str, VuiEngine.getInstance(a.a()), z, z2, z2);
        a(baseRecycleView, str2);
    }

    public static void a(View view, boolean z, String str) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setPlayStatus skipped:tag=" + str + ",playing=" + z);
        }
        VuiView vuiView = (VuiView) view;
        Application a2 = a.a();
        if (!TextUtils.isEmpty(str)) {
            VuiEngine.getInstance(a2).setVuiElementTag(view, str);
        }
        vuiView.setVuiLabel("");
        if (view instanceof TextView) {
            VuiEngine.getInstance(a.a()).setVuiLabelUnSupportText(view);
        }
        vuiView.enableViewVuiMode(true);
        c.a(a2, view, z);
    }

    public static void a(View view, int i, String str, boolean z, String str2) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setPlayStatus skipped:tag=" + str2 + ",name=" + str + ",position=" + i);
        }
        VuiView vuiView = (VuiView) view;
        Application a2 = a.a();
        VuiEngine vuiEngine = VuiEngine.getInstance(a2);
        vuiEngine.setVuiElementTag(view, str2 + i);
        vuiView.setVuiLabel(str);
        vuiView.setVuiPosition(i);
        vuiView.enableViewVuiMode(true);
        c.a(a2, view, z);
    }

    public static void a(View view, int i, String str) {
        Application a2 = a.a();
        String string = a2.getString(i);
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setListPlayStatus skipped:tag=" + str + ",name=" + string);
        }
        VuiView vuiView = (VuiView) view;
        VuiEngine.getInstance(a2).setVuiElementTag(view, str);
        vuiView.setVuiLabel("");
        if (view instanceof TextView) {
            VuiEngine.getInstance(a.a()).setVuiLabelUnSupportText(view);
        }
        vuiView.enableViewVuiMode(true);
        vuiView.setVuiPriority(bik.LEVEL2);
        d(view, true);
        view.setTag(aht.c.tag_vui_play_all, "1");
        view.setTag(aht.c.tag_vui_current_text, a2.getText(i));
        a(a2, view, aml.d(i));
    }

    public static void a(Context context, View view, int i) {
        int intValue = a.get(i).intValue();
        String[] strArr = c;
        VuiUtils.setStatefulButtonAttr(view, intValue, strArr, big.SETVALUE.a() + "|" + big.CLICK.a());
    }

    public static void a(View view, String str, String str2) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setVuiLabel skipped:tag=" + str2 + ",name=" + str);
        }
        Application a2 = a.a();
        VuiView vuiView = (VuiView) view;
        if (!(view instanceof TextView)) {
            vuiView.setVuiLabel(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            VuiEngine.getInstance(a2).setVuiElementTag(view, str2);
        }
        vuiView.setVuiElementType(bih.BUTTON);
        vuiView.setVuiAction(big.CLICK.a());
        vuiView.enableViewVuiMode(true);
    }

    public static void a(View view, int i, String str, String str2) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setVuiLabel skipped:tag=" + str2 + ",name=" + str + ",position=" + i);
        }
        Application a2 = a.a();
        VuiView vuiView = (VuiView) view;
        if (!(view instanceof TextView)) {
            vuiView.setVuiLabel(str);
        }
        vuiView.setVuiPosition(i);
        VuiEngine vuiEngine = VuiEngine.getInstance(a2);
        vuiEngine.setVuiElementTag(view, str2 + i);
        vuiView.setVuiElementType(bih.BUTTON);
        vuiView.setVuiAction(big.CLICK.a());
        vuiView.enableViewVuiMode(true);
    }

    public static void b(View view, int i, String str) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setVuiPosition skipped:tag=" + str + ",position=" + i);
        }
        Application a2 = a.a();
        VuiView vuiView = (VuiView) view;
        vuiView.setVuiPosition(i);
        VuiEngine vuiEngine = VuiEngine.getInstance(a2);
        vuiEngine.setVuiElementTag(view, str + i);
        vuiView.enableViewVuiMode(true);
    }

    public static void a(View view, int i, int i2, String str, String str2) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setGroupVuiLabelOfList skipped:tag=" + str2 + ",name=" + str);
        }
        Application a2 = a.a();
        VuiView vuiView = (VuiView) view;
        vuiView.setVuiLabel(String.format(a2.getResources().getString(aht.e.vui_play_position), c.a(str), Integer.valueOf(i2), Integer.valueOf(i2)));
        vuiView.setVuiPosition(i);
        VuiEngine vuiEngine = VuiEngine.getInstance(a2);
        vuiEngine.setVuiElementTag(view, str2 + i);
        vuiView.setVuiElementType(bih.GROUP);
        vuiView.enableViewVuiMode(true);
    }

    public static void c(View view, boolean z) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setCanVoiceControl skipped:canVoiceControl=" + z);
        }
        VuiView vuiView = (VuiView) view;
        try {
            JSONObject vuiProps = vuiView.getVuiProps();
            if (vuiProps == null) {
                vuiProps = new JSONObject();
            }
            vuiProps.put(VuiConstants.PROPS_VOICECONTROL, z);
            vuiView.setVuiProps(vuiProps);
        } catch (JSONException unused) {
        }
    }

    public static void a(View view, bik bikVar) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "setVuiPriority skipped:priority=" + bikVar);
        }
        ((VuiView) view).setVuiPriority(bikVar);
    }

    public static void d(View view, boolean z) {
        if (!(view instanceof VuiView)) {
            LogUtils.e("MineVuiUtils", "hasFeedback skipped:hasFeedback=" + z);
        }
        VuiView vuiView = (VuiView) view;
        try {
            JSONObject vuiProps = vuiView.getVuiProps();
            if (vuiProps == null) {
                vuiProps = new JSONObject();
            }
            vuiProps.put(VuiConstants.PROPS_FEEDBACK, z);
            vuiView.setVuiProps(vuiProps);
        } catch (JSONException unused) {
        }
    }

    public static void a(View view, int i, int i2) {
        if (view instanceof VuiView) {
            Context context = view.getContext();
            VuiEngine.getInstance(context).vuiFeedback(view, new VuiFeedback.Builder().state(i).content(context.getString(i2)).build());
        }
    }
}
