package com.xiaopeng.musicradio.utils;

import com.xiaopeng.lib.utils.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
/* compiled from: CopyUtils.java */
/* loaded from: classes2.dex */
public class j {
    public static <T> List<T> a(List<T> list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            List<T> list2 = (List) objectInputStream.readObject();
            i.a(objectOutputStream, byteArrayInputStream, objectInputStream);
            return list2;
        } catch (IOException e) {
            LogUtils.e("Utils", "deepCopy: ", e);
            i.a(byteArrayOutputStream);
            return null;
        } catch (ClassNotFoundException e2) {
            LogUtils.e("Utils", "deepCopy: ", e2);
            i.a(byteArrayOutputStream);
            return null;
        }
    }
}
