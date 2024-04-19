package com.xiaopeng.musicradio.utils;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: GsonManagerUtil.java */
/* loaded from: classes2.dex */
public class z {
    private static volatile Gson a;

    private z() {
    }

    public static void a() {
        if (a == null) {
            synchronized (z.class) {
                if (a == null) {
                    a = new GsonBuilder().registerTypeAdapter(Integer.class, new a()).registerTypeAdapter(Integer.TYPE, new a()).disableHtmlEscaping().create();
                }
            }
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        a();
        try {
            return (T) a.fromJson(str, (Class<Object>) cls);
        } catch (Exception e) {
            Log.i("GsonManagerUtil", "className--" + cls.getSimpleName() + " e = " + e);
            return null;
        }
    }

    public static <T> T a(String str, Type type) {
        a();
        try {
            return (T) a.fromJson(str, type);
        } catch (Exception e) {
            Log.i("GsonManagerUtil", "type--" + type.toString() + " e = " + e);
            return null;
        }
    }

    public static String a(Object obj) {
        a();
        return a.toJson(obj);
    }

    public static <T> List<T> b(String str, Class cls) {
        return (List) new Gson().fromJson(str, new b(cls));
    }

    /* compiled from: GsonManagerUtil.java */
    /* loaded from: classes2.dex */
    private static class b implements ParameterizedType {
        Class a;

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return null;
        }

        public b(Class cls) {
            this.a = cls;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return new Type[]{this.a};
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return List.class;
        }
    }

    /* compiled from: GsonManagerUtil.java */
    /* loaded from: classes2.dex */
    public static class a extends TypeAdapter {
        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Object obj) {
            if (obj == null) {
                try {
                    obj = 0;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            jsonWriter.value((Integer) obj);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Integer read(JsonReader jsonReader) {
            try {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return 0;
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    jsonReader.nextBoolean();
                    return 0;
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    String nextString = jsonReader.nextString();
                    if (be.a(nextString)) {
                        return Integer.valueOf(Integer.parseInt(nextString));
                    }
                    return 0;
                } else {
                    return Integer.valueOf(jsonReader.nextInt());
                }
            } catch (Exception e) {
                Log.e("GsonManagerUtil", "Not a number", e);
                return 0;
            }
        }
    }
}
