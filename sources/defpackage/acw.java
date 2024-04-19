package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.internal.util.ArrayUtils;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import defpackage.acs;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/* compiled from: ThemeWrapper.java */
/* renamed from: acw  reason: default package */
/* loaded from: classes2.dex */
public class acw {
    private static HashMap<String, List<acu>> b;
    private Handler c = new a();
    public static final boolean a = acs.b;
    private static volatile acw d = null;

    private acw() {
        b = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static acw a() {
        if (d == null) {
            synchronized (acw.class) {
                if (d == null) {
                    d = new acw();
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.c.removeCallbacksAndMessages(null);
        HashMap<String, List<acu>> hashMap = b;
        if (hashMap != null) {
            hashMap.clear();
        }
        b = null;
        d = null;
        this.c = null;
        if (a) {
            acs.b.a("onTimeout time=" + b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(Context context, acr acrVar, Configuration configuration) {
        Context applicationContext = context.getApplicationContext();
        boolean d2 = acs.d(applicationContext);
        boolean b2 = acs.b(configuration);
        acs.b.a("ThemeWrapper", "onConfigurationChanged isNightMode=" + d2 + " isThemeChanged=" + b2);
        if (b2) {
            a(applicationContext, acrVar);
        }
    }

    private synchronized void a(Context context, acr acrVar) {
        if (a) {
            acs.b.a("handleThemeChanged");
        }
        b(context, acrVar);
        e();
        c(context, acrVar);
    }

    private void b(final Context context, final acr acrVar) {
        if (context == null || acrVar == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(acrVar.b)) {
                return;
            }
            this.c.post(new Runnable() { // from class: acw.1
                @Override // java.lang.Runnable
                public void run() {
                    acw.b.put(acrVar.b, act.a(context, acrVar.b));
                }
            });
        } catch (Exception unused) {
        }
    }

    private void c(Context context, acr acrVar) {
        d(context, acrVar);
        e(context, acrVar);
    }

    private void e() {
        this.c.removeMessages(100);
        this.c.sendEmptyMessageDelayed(100, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    private void d(Context context, acr acrVar) {
        if (acrVar == null || acrVar.c == null) {
            return;
        }
        for (acu acuVar : acrVar.c) {
            b(context, acrVar.a, acuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final Context context, final acr acrVar) {
        if (acrVar == null || TextUtils.isEmpty(acrVar.b)) {
            return;
        }
        boolean containsKey = b.containsKey(acrVar.b);
        if (a) {
            acs.b.a("handleRefreshXml xmlCached=" + containsKey);
        }
        if (containsKey) {
            List<acu> list = b.get(acrVar.b);
            if (list != null) {
                for (acu acuVar : list) {
                    b(context, acrVar.a, acuVar);
                }
                return;
            }
            return;
        }
        this.c.postDelayed(new Runnable() { // from class: acw.2
            @Override // java.lang.Runnable
            public void run() {
                acw.this.e(context, acrVar);
            }
        }, 10L);
    }

    private View a(Context context, View view, acu acuVar) {
        View findViewById;
        View view2 = null;
        if (context == null || acuVar == null || view == null) {
            return null;
        }
        if (acuVar.e > 0 && acuVar.h > 0 && (findViewById = view.findViewById(acuVar.h)) != null) {
            view2 = findViewById.findViewById(acuVar.e);
        }
        return (acuVar.e <= 0 || view2 != null) ? view2 : view.findViewById(acuVar.e);
    }

    private void b(Context context, View view, acu acuVar) {
        try {
            View a2 = a(context, view, acuVar);
            if (context != null && view != null && acuVar != null && a2 != null && acuVar.i != null && !TextUtils.isEmpty(acuVar.f)) {
                String str = acuVar.f;
                int i = -1;
                try {
                    i = Integer.parseInt(acuVar.i.toString());
                } catch (Exception unused) {
                }
                if (acs.a.a(str)) {
                    a(context, a2, str, i);
                } else {
                    b(context, a2, str, i);
                }
            }
        } catch (Exception e) {
            acs.b.a("ThemeWrapper", "updateViewResource e=" + e);
        }
    }

    /* compiled from: ThemeWrapper.java */
    /* renamed from: acw$a */
    /* loaded from: classes2.dex */
    private static class a extends Handler {
        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            acw.a().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static HashMap<String, Integer> a(Context context, AttributeSet attributeSet, int i, int i2, HashMap<String, List<String>> hashMap) {
        boolean z;
        boolean z2;
        HashMap<String, Integer> hashMap2 = acs.a.a;
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        List<String> list = (hashMap == null || !hashMap.containsKey("extra_append")) ? null : hashMap.get("extra_append");
        List<String> list2 = (hashMap == null || !hashMap.containsKey("extra_global")) ? null : hashMap.get("extra_global");
        if (attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            z = false;
            z2 = false;
            for (int i3 = 0; i3 < attributeCount; i3++) {
                try {
                    String attributeName = attributeSet.getAttributeName(i3);
                    String attributeValue = attributeSet.getAttributeValue(i3);
                    if (a) {
                        acs.b.a("resolveAttribute common attr name=" + attributeName + " value=" + attributeValue);
                    }
                    if (!TextUtils.isEmpty(attributeName) && !TextUtils.isEmpty(attributeValue)) {
                        boolean z3 = (acs.a.a(attributeName) || (list != null && list.contains(attributeName))) && attributeValue.startsWith("@");
                        boolean b2 = acs.a.b(attributeName);
                        boolean c = acs.a.c(attributeName);
                        if (z3) {
                            if (b2) {
                                z = true;
                            }
                            if (c) {
                                z2 = true;
                            }
                            if (!b2 && !c) {
                                hashMap3.put(attributeName, Integer.valueOf(Integer.parseInt(attributeValue.substring(1))));
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            z = false;
            z2 = false;
        }
        if (z || z2) {
            for (String str : hashMap2.keySet()) {
                int intValue = hashMap2.get(str).intValue();
                if (intValue != 0 && !hashMap3.containsKey(str)) {
                    int a2 = z ? a(intValue, context, (AttributeSet) null, 0, 0) : 0;
                    if (z2) {
                        a2 = a(intValue, context, attributeSet, i, i2);
                    }
                    if (a) {
                        acs.b.a("resolveAttribute theme&style attr key=" + str + " resId=0x" + Integer.toHexString(a2) + " hasTheme=" + z + " hasStyle=" + z2);
                    }
                    if (a2 != 0) {
                        hashMap3.put(str, Integer.valueOf(a2));
                    }
                }
            }
        }
        if (i > 0 || i2 > 0) {
            try {
                Set<String> keySet = hashMap2.keySet();
                int size = keySet.size();
                String[] strArr = (String[]) keySet.toArray(new String[size]);
                int[] convertToIntArray = ArrayUtils.convertToIntArray(new ArrayList(hashMap2.values()));
                for (int i4 = 0; i4 < size; i4++) {
                    String str2 = strArr[i4];
                    int i5 = convertToIntArray[i4];
                    if (!hashMap3.containsKey(str2)) {
                        int a3 = a(i5, context, (AttributeSet) null, i, i2);
                        if (a) {
                            acs.b.a("resolveAttribute def attr key=" + str2 + " resId=0x" + Integer.toHexString(a3));
                        }
                        if (a3 != 0) {
                            hashMap3.put(str2, Integer.valueOf(a3));
                        }
                    }
                }
            } catch (Exception e) {
                acs.b.a("ThemeWrapper", "resolveAttribute style e=" + e);
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            for (String str3 : list2) {
                if (!TextUtils.isEmpty(str3) && !hashMap3.containsKey(str3) && hashMap2.containsKey(str3)) {
                    int a4 = a(hashMap2.get(str3).intValue(), context, (AttributeSet) null, 0, 0);
                    if (a) {
                        acs.b.a("resolveAttribute global attr key=" + str3 + " resId=0x" + Integer.toHexString(a4));
                    }
                    if (a4 != 0) {
                        hashMap3.put(str3, Integer.valueOf(a4));
                    }
                }
            }
        }
        return hashMap3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(View view, HashMap<String, Integer> hashMap) {
        if (view == null || hashMap == null) {
            return;
        }
        for (String str : hashMap.keySet()) {
            if (acs.a.a(str)) {
                a(view.getContext(), view, str, hashMap.get(str).intValue());
            } else {
                b(view.getContext(), view, str, hashMap.get(str) != null ? hashMap.get(str).intValue() : 0);
            }
        }
    }

    private static void a(Context context, View view, String str, int i) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext == null || view == null || TextUtils.isEmpty(str)) {
            return;
        }
        Resources resources = applicationContext.getResources();
        applicationContext.getTheme();
        try {
            if ("alpha".equals(str)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    view.setAlpha(resources.getFloat(i));
                }
            } else if ("background".equals(str)) {
                view.setBackground(a(ev.a(applicationContext, i), view.getBackground()));
            } else if ("foreground".equals(str)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    view.setForeground(a(ev.a(applicationContext, i), view.getForeground()));
                }
            } else if ("scrollbarThumbVertical".equals(str)) {
                a(view, ev.a(applicationContext, i));
            } else if ("src".equals(str)) {
                if (view instanceof ImageView) {
                    ImageView imageView = (ImageView) view;
                    imageView.setImageDrawable(a(ev.a(applicationContext, i), imageView.getDrawable()));
                }
            } else if ("textColor".equals(str)) {
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(ev.b(applicationContext, i));
                }
            } else if ("textColorHint".equals(str)) {
                if (view instanceof TextView) {
                    ((TextView) view).setHintTextColor(ev.b(applicationContext, i));
                }
            } else if ("drawableLeft".equals(str)) {
                if (view instanceof TextView) {
                    a(0, (TextView) view, ev.a(applicationContext, i));
                }
            } else if ("drawableTop".equals(str)) {
                if (view instanceof TextView) {
                    a(1, (TextView) view, ev.a(applicationContext, i));
                }
            } else if ("drawableRight".equals(str)) {
                if (view instanceof TextView) {
                    a(2, (TextView) view, ev.a(applicationContext, i));
                }
            } else if ("drawableBottom".equals(str)) {
                if (view instanceof TextView) {
                    a(3, (TextView) view, ev.a(applicationContext, i));
                }
            } else if ("drawableStart".equals(str)) {
                if (view instanceof TextView) {
                    a(4, (TextView) view, ev.a(applicationContext, i));
                }
            } else if ("drawableEnd".equals(str)) {
                if (view instanceof TextView) {
                    a(5, (TextView) view, ev.a(applicationContext, i));
                }
            } else if ("progressDrawable".equals(str)) {
                if (view instanceof ProgressBar) {
                    ((ProgressBar) view).setProgressDrawable(ev.a(applicationContext, i));
                }
            } else if ("thumb".equals(str)) {
                if (view instanceof SeekBar) {
                    ((SeekBar) view).setThumb(ev.a(applicationContext, i));
                }
            } else if ("button".equals(str)) {
                if (view instanceof CompoundButton) {
                    ((CompoundButton) view).setButtonDrawable(ev.a(applicationContext, i));
                }
            } else if ("divider".equals(str) && (view instanceof ListView)) {
                ((ListView) view).setDivider(ev.a(applicationContext, i));
            }
            view.refreshDrawableState();
            if (a) {
                acs.b.a("setViewResource view info:" + a(view, i, str));
            }
        } catch (Exception e) {
            if (a) {
                acs.b.a("setViewResource error attr=" + str + " view=" + view + " e=" + e);
            }
        }
    }

    private static void b(Context context, View view, String str, int i) {
        try {
            if (TextUtils.isEmpty(str) || str.length() <= 0) {
                return;
            }
            view.getClass().getPackage().getName();
            String name = view.getClass().getName();
            String str2 = "set" + str.substring(0, 1).toUpperCase() + str.substring(1);
            if (a) {
                acs.b.a("invokeViewResource view info:" + a(view, i, str));
            }
            Class<?> cls = Class.forName(name);
            if (cls != null) {
                cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(i));
            }
        } catch (Exception e) {
            acs.b.a("ThemeWrapper", "invokeViewResource view=" + view + " e=" + e);
        }
    }

    private static Drawable a(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable2 != null && drawable.getLevel() != drawable2.getLevel()) {
            drawable.setLevel(drawable2.getLevel());
        }
        return drawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        r2.recycle();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(int r2, android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
        /*
            r0 = 0
            if (r3 == 0) goto L11
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r1 = 1
            int[] r1 = new int[r1]
            r1[r0] = r2
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r4, r1, r5, r6)
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L2f
            int r3 = r2.getResourceId(r0, r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
            if (r3 == 0) goto L20
            if (r2 == 0) goto L1f
            r2.recycle()
        L1f:
            return r3
        L20:
            if (r2 == 0) goto L2f
            goto L2c
        L23:
            r3 = move-exception
            if (r2 == 0) goto L29
            r2.recycle()
        L29:
            throw r3
        L2a:
            if (r2 == 0) goto L2f
        L2c:
            r2.recycle()
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acw.a(int, android.content.Context, android.util.AttributeSet, int, int):int");
    }

    private static void a(int i, TextView textView, Drawable drawable) {
        if (drawable == null || textView == null) {
            return;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                if (compoundDrawables != null) {
                    compoundDrawables[i] = a(drawable, compoundDrawables[i]);
                    textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
                    return;
                }
                return;
            case 4:
            case 5:
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                if (compoundDrawablesRelative != null) {
                    char c = i == 4 ? (char) 0 : (char) 2;
                    if (compoundDrawablesRelative != null) {
                        compoundDrawablesRelative[c] = a(drawable, compoundDrawablesRelative[c]);
                        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private static void a(View view, Drawable drawable) {
        Class<?> cls;
        Field field;
        Object obj;
        Class<?> cls2;
        Field declaredField;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("getScrollCache", new Class[0]);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(view, new Object[0]);
            if (invoke == null || (cls = invoke.getClass()) == null || (field = cls.getField("scrollBar")) == null || (obj = field.get(invoke)) == null || (cls2 = obj.getClass()) == null || (declaredField = cls2.getDeclaredField("mVerticalThumb")) == null) {
                return;
            }
            declaredField.setAccessible(true);
            declaredField.set(obj, drawable);
        } catch (Exception unused) {
        }
    }

    protected static long b() {
        return System.currentTimeMillis();
    }

    protected static String a(View view, int i, String str) {
        StringBuffer stringBuffer = new StringBuffer("getViewInfo");
        if (view != null) {
            try {
                Context applicationContext = view.getContext().getApplicationContext();
                if (applicationContext != null) {
                    Resources resources = applicationContext.getResources();
                    TypedValue typedValue = new TypedValue();
                    resources.getValue(i, typedValue, true);
                    stringBuffer.append(" view.id=0x" + Integer.toHexString(view.getId()));
                    stringBuffer.append(" view.resId=0x" + Integer.toHexString(i));
                    stringBuffer.append(" view.attr=" + str);
                    stringBuffer.append(" view.toString=" + view.toString());
                    stringBuffer.append(" view.value.string=" + ((Object) typedValue.string));
                    stringBuffer.append(" view.value=" + typedValue.toString());
                } else {
                    stringBuffer.append(" context null");
                }
            } catch (Exception e) {
                stringBuffer.append(" error=" + e);
            }
        }
        return stringBuffer.toString();
    }
}
