package com.xiaopeng.musicradio.utils;

import com.xiaopeng.lib.utils.LogUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ReflectionUtils.java */
/* loaded from: classes2.dex */
public class aw {
    public static Method a(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object a(Object obj, String str, Class<?> cls, Object obj2) {
        return a(obj, str, new Class[]{cls}, new Object[]{obj2});
    }

    public static Object a(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        Method a = a(obj, str, clsArr);
        if (a != null) {
            try {
                a.setAccessible(true);
                return a.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static Field a(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Field[] a(Object obj) {
        try {
            return obj.getClass().getDeclaredFields();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Object obj, String str, Object obj2) {
        Field a = a(obj, str);
        if (a != null) {
            try {
                a.setAccessible(true);
                a.set(obj, obj2);
            } catch (Exception e) {
                LogUtils.e("ReflectionUtils", e.toString());
            }
        }
    }

    public static Object b(Object obj, String str) {
        Field a = a(obj, str);
        if (a != null) {
            try {
                a.setAccessible(true);
                return a.get(obj);
            } catch (Exception e) {
                LogUtils.e("ReflectionUtils", e.toString());
                return null;
            }
        }
        return null;
    }
}
