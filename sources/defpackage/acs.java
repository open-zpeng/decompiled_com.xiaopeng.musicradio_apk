package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.SystemProperties;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.List;
/* compiled from: ThemeManager.java */
/* renamed from: acs  reason: default package */
/* loaded from: classes2.dex */
public class acs {
    public static final boolean a;
    public static final boolean b;
    public static final long c;
    public static final long d;
    private Context e;
    private acr f = new acr();

    static {
        a = SystemProperties.getInt("persist.sys.theme.logger", 0) == 1;
        b = a;
        c = UiModeManager.THEME_ANIMATION_INTERVAL;
        d = UiModeManager.THEME_TIMEOUT_DELAY;
    }

    private acs(Context context, View view, String str, List<acu> list) {
        this.e = context.getApplicationContext();
        acr acrVar = this.f;
        acrVar.b = str;
        acrVar.a = view;
        acrVar.c = list;
    }

    public static acs a(Context context, View view, String str, List<acu> list) {
        return new acs(context, view, str, list);
    }

    public void a(Configuration configuration) {
        acw.a().a(this.e, this.f, configuration);
    }

    public static boolean b(Configuration configuration) {
        return (configuration == null || (configuration.uiMode & 192) == 0) ? false : true;
    }

    public static int a(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getThemeMode();
    }

    public static int b(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getDayNightMode();
    }

    public static int c(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Configuration configuration = applicationContext != null ? applicationContext.getResources().getConfiguration() : null;
        if (configuration != null) {
            return configuration.uiMode;
        }
        return 0;
    }

    public static boolean d(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Configuration configuration = applicationContext != null ? applicationContext.getResources().getConfiguration() : null;
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    public static boolean e(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).isThemeWorking();
    }

    public static void a(Configuration configuration, Window window, int i) {
        if (!b(configuration) || window == null) {
            return;
        }
        try {
            window.setBackgroundDrawableResource(i);
        } catch (Exception unused) {
        }
    }

    public static void a(Configuration configuration, Window window, Drawable drawable) {
        if (!b(configuration) || window == null) {
            return;
        }
        try {
            window.setBackgroundDrawable(drawable);
        } catch (Exception unused) {
        }
    }

    public static HashMap<String, Integer> a(Context context, AttributeSet attributeSet) {
        return acw.a(context, attributeSet, 0, 0, (HashMap<String, List<String>>) null);
    }

    public static HashMap<String, Integer> a(Context context, AttributeSet attributeSet, int i, int i2, HashMap<String, List<String>> hashMap) {
        return acw.a(context, attributeSet, i, i2, hashMap);
    }

    public static void a(View view, HashMap<String, Integer> hashMap) {
        acw.a(view, hashMap);
    }

    /* compiled from: ThemeManager.java */
    /* renamed from: acs$b */
    /* loaded from: classes2.dex */
    public static class b {
        public static void a(String str) {
            if (acs.b) {
                Log.i("ThemeManager", str);
            }
        }

        public static void a(String str, String str2) {
            Log.i(str, str2);
        }
    }

    /* compiled from: ThemeManager.java */
    /* renamed from: acs$c */
    /* loaded from: classes2.dex */
    public static class c {
        public static final HashMap<String, Integer> a = new HashMap<>();

        static {
            a.clear();
            a.put("anim", 0);
            a.put("array", 1);
            a.put("attr", 2);
            a.put("bool", 3);
            a.put(TtmlNode.ATTR_TTS_COLOR, 4);
            a.put("dimen", 5);
            a.put("drawable", 6);
            a.put("id", 7);
            a.put("integer", 8);
            a.put(TtmlNode.TAG_LAYOUT, 9);
            a.put("mipmap", 10);
            a.put("string", 11);
            a.put(TtmlNode.TAG_STYLE, 12);
            a.put("styleable", 13);
        }

        public static int a(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return a.get(str).intValue();
        }
    }

    /* compiled from: ThemeManager.java */
    /* renamed from: acs$a */
    /* loaded from: classes2.dex */
    public static class a {
        public static final HashMap<String, Integer> a = new HashMap<>();

        static {
            a.clear();
            a.put(TtmlNode.TAG_STYLE, 0);
            a.put("theme", 16842752);
            a.put("alpha", 16843551);
            a.put("foreground", 16843017);
            a.put("background", 16842964);
            a.put("scrollbarThumbVertical", 16842853);
            a.put("src", 16843033);
            a.put("textColor", 16842904);
            a.put("textColorHint", 16842906);
            a.put("drawableLeft", 16843119);
            a.put("drawableTop", 16843117);
            a.put("drawableRight", 16843120);
            a.put("drawableBottom", 16843118);
            a.put("drawableStart", 16843666);
            a.put("drawableEnd", 16843667);
            a.put("progressDrawable", 16843068);
            a.put("thumb", 16843074);
            a.put("button", 16843015);
            a.put("divider", 16843049);
        }

        public static boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return a.containsKey(str);
        }

        public static boolean b(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return "theme".equals(str);
        }

        public static boolean c(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return TtmlNode.TAG_STYLE.equals(str);
        }
    }
}
