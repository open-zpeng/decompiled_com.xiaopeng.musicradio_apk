package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import defpackage.acs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: ThemeViewModel.java */
/* renamed from: acv  reason: default package */
/* loaded from: classes2.dex */
public class acv {
    private int a;
    private a b;
    private List<a> c = new ArrayList();
    private HashMap<String, Integer> d;

    /* compiled from: ThemeViewModel.java */
    /* renamed from: acv$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onThemeChanged();
    }

    public void b(View view) {
    }

    private acv(Context context, HashMap<String, Integer> hashMap) {
        this.a = context.getResources().getConfiguration().uiMode;
        this.d = hashMap == null ? new HashMap<>() : hashMap;
    }

    public static acv a(Context context, AttributeSet attributeSet) {
        return new acv(context, acs.a(context, attributeSet, 0, 0, null));
    }

    public static acv a(Context context, AttributeSet attributeSet, int i, int i2, Object obj) {
        return new acv(context, acs.a(context, attributeSet, i, i2, a(obj)));
    }

    public static HashMap<String, List<String>> a(String str, String... strArr) {
        if (TextUtils.isEmpty(str) || strArr == null) {
            return null;
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        hashMap.put(str, Arrays.asList(strArr));
        return hashMap;
    }

    public static HashMap<String, List<String>> a(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return null;
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        hashMap.put(str, list);
        return hashMap;
    }

    public static HashMap<String, List<String>> a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof List) {
                    return a("extra_append", (List) obj);
                }
                if (obj instanceof HashMap) {
                    return (HashMap) obj;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void b(a aVar) {
        List<a> list;
        if (aVar == null || (list = this.c) == null) {
            return;
        }
        list.add(aVar);
    }

    public void a(View view) {
        int c = acs.c(view.getContext());
        if (acs.b) {
            acs.b.a("ThemeViewModel onAttachedToWindow newMode=" + c + " oldMode=" + this.a + " view=" + d(view));
        }
        if (c(c)) {
            c(view);
        }
        this.a = c;
    }

    public void a(View view, boolean z) {
        if (z) {
            int c = acs.c(view.getContext());
            if (acs.b) {
                acs.b.a("ThemeViewModel onWindowFocusChanged newMode=" + c + " oldMode=" + this.a + " view=" + d(view));
            }
            if (c(c)) {
                c(view);
            }
            this.a = c;
        }
    }

    public void a(View view, Configuration configuration) {
        int i = configuration != null ? configuration.uiMode : 0;
        boolean b = acs.b(configuration);
        if (acs.b) {
            acs.b.a("ThemeViewModel onConfigurationChanged isThemeChanged=" + b + " uiMode=" + i + " view=" + d(view));
        }
        if (b) {
            c(view);
            this.a = configuration != null ? configuration.uiMode : this.a;
        }
    }

    public void a(int i) {
        this.d.put("background", Integer.valueOf(i));
    }

    public void b(int i) {
        this.d.put("src", Integer.valueOf(i));
    }

    private boolean c(int i) {
        return i != this.a;
    }

    private void c(View view) {
        if (acs.b) {
            acs.b.a("ThemeViewModel updateThemeResource view=" + d(view) + " attr=" + a());
        }
        acs.a(view, this.d);
        a aVar = this.b;
        if (aVar != null) {
            aVar.onThemeChanged();
        }
        List<a> list = this.c;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (a aVar2 : this.c) {
            if (aVar2 != null) {
                aVar2.onThemeChanged();
            }
        }
    }

    private String a() {
        try {
            return (this.d == null || this.d.keySet() == null) ? "" : Arrays.toString(this.d.keySet().toArray());
        } catch (Exception unused) {
            return "";
        }
    }

    private String d(View view) {
        return view != null ? view.toString() : "view null";
    }
}
