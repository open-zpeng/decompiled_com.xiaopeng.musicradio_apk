package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IDataLog;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IMoleEvent;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IMoleEventBuilder;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IStatEvent;
import com.xiaopeng.lib.framework.moduleinterface.datalogmodule.IStatEventBuilder;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.ThreadUtils;
import defpackage.abg;
import java.util.HashMap;
import java.util.Map;
/* compiled from: _DataLogHostHelper.java */
/* renamed from: abl  reason: default package */
/* loaded from: classes2.dex */
public class abl {
    private static Gson a = new Gson();

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(IMoleEventBuilder iMoleEventBuilder, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            iMoleEventBuilder.setProperty(str, (String) obj);
        } else if (obj instanceof Number) {
            iMoleEventBuilder.setProperty(str, (Number) obj);
        } else if (obj instanceof Boolean) {
            iMoleEventBuilder.setProperty(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Character) {
            iMoleEventBuilder.setProperty(str, ((Character) obj).charValue());
        } else if (obj instanceof HashMap) {
            HashMap hashMap = (HashMap) obj;
            for (Object obj2 : hashMap.keySet()) {
                if (obj2 instanceof String) {
                    b(iMoleEventBuilder, (String) obj2, hashMap.get(obj2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(IStatEventBuilder iStatEventBuilder, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            iStatEventBuilder.setProperty(str, (String) obj);
        } else if (obj instanceof Number) {
            iStatEventBuilder.setProperty(str, (Number) obj);
        } else if (obj instanceof Boolean) {
            iStatEventBuilder.setProperty(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Character) {
            iStatEventBuilder.setProperty(str, ((Character) obj).charValue());
        } else if (obj instanceof HashMap) {
            HashMap hashMap = (HashMap) obj;
            for (Object obj2 : hashMap.keySet()) {
                if (obj2 instanceof String) {
                    b(iStatEventBuilder, (String) obj2, hashMap.get(obj2));
                }
            }
        }
    }

    private static void a(HashMap<String, Object> hashMap, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            hashMap.put(str, (String) obj);
        } else if (obj instanceof Number) {
            hashMap.put(str, (Number) obj);
        } else if (obj instanceof Boolean) {
            hashMap.put(str, (Boolean) obj);
        } else if (obj instanceof Character) {
            hashMap.put(str, (Character) obj);
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                if (obj2 instanceof String) {
                    a(hashMap, (String) obj2, map.get(obj2));
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            hashMap.put(str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, IMoleEventBuilder iMoleEventBuilder, int i) {
        IMoleEvent build = iMoleEventBuilder.build();
        ((IDataLog) Module.get(abh.class).get(IDataLog.class)).sendStatData(build);
        if (i == 1) {
            if (TextUtils.isEmpty(str)) {
                str = "_DataLogHost";
            }
            LogUtils.i(str, "sendStatData : %s", build.toJson());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, IStatEventBuilder iStatEventBuilder, int i) {
        IStatEvent build = iStatEventBuilder.build();
        ((IDataLog) Module.get(abh.class).get(IDataLog.class)).sendStatData(build);
        if (i == 1) {
            if (TextUtils.isEmpty(str)) {
                str = "_DataLogHost";
            }
            LogUtils.i(str, "sendStatData(D) : %s", build.toJson());
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, int i, String str6) {
        boolean z = (abg.a() && !"false".equals(str6)) || (!abg.a() && "true".equals(str6));
        String c = TextUtils.isEmpty(str2) ? abg.c() : str2;
        if (z) {
            HashMap hashMap3 = new HashMap();
            a(hashMap3, (String) null, hashMap);
            hashMap3.put("page_id", str4);
            hashMap3.put("button_id", str5);
            a(str, c, str3, hashMap3, hashMap2, i);
            return;
        }
        a(str, c, str3, str4, str5, hashMap, hashMap2, i);
    }

    private static void a(final String str, final String str2, final String str3, final String str4, final String str5, final HashMap<String, Object> hashMap, final HashMap<String, Object> hashMap2, final int i) {
        ThreadUtils.postBackground(new Runnable() { // from class: abl.1
            @Override // java.lang.Runnable
            public void run() {
                IMoleEventBuilder buildMoleEvent = ((IDataLog) Module.get(abh.class).get(IDataLog.class)).buildMoleEvent();
                abg.a b = abg.b();
                if (b != null) {
                    b.a(hashMap);
                    b.b(hashMap2);
                }
                buildMoleEvent.setModule(str2);
                if (!TextUtils.isEmpty(str3)) {
                    buildMoleEvent.setEvent(str3);
                }
                buildMoleEvent.setPageId(str4);
                buildMoleEvent.setButtonId(str5);
                abl.b(buildMoleEvent, (String) null, hashMap);
                abl.b(buildMoleEvent, (String) null, hashMap2);
                abl.b(str, buildMoleEvent, i);
            }
        });
    }

    private static void a(final String str, final String str2, final String str3, final HashMap<String, Object> hashMap, final HashMap<String, Object> hashMap2, final int i) {
        ThreadUtils.postBackground(new Runnable() { // from class: abl.2
            @Override // java.lang.Runnable
            public void run() {
                IStatEventBuilder buildStat = ((IDataLog) Module.get(abh.class).get(IDataLog.class)).buildStat();
                abg.a b = abg.b();
                if (b != null) {
                    b.a(hashMap);
                    b.b(hashMap2);
                }
                buildStat.setProperty("para", abl.a.toJson(hashMap));
                abl.b(buildStat, (String) null, hashMap2);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    if (!str3.startsWith(str2)) {
                        buildStat.setEventName(str2 + "_" + str3);
                    } else {
                        buildStat.setEventName(str3);
                    }
                } else {
                    buildStat.setEventName(str3);
                }
                abl.b(str, buildStat, i);
            }
        });
    }
}
