package com.xiaopeng.lib.apirouter.server;

import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Keep;
import java.util.HashMap;
@Keep
/* loaded from: classes.dex */
public class ManifestHelper {
    public static HashMap<String, Pair<IBinder, String>> mapping = new HashMap<>();

    static {
        Pair<IBinder, String> pair = new Pair<>(new e(), d.a());
        for (String str : d.b()) {
            mapping.put(str, pair);
        }
        Pair<IBinder, String> pair2 = new Pair<>(new n(), m.a());
        for (String str2 : m.b()) {
            mapping.put(str2, pair2);
        }
        Pair<IBinder, String> pair3 = new Pair<>(new h(), g.a());
        for (String str3 : g.b()) {
            mapping.put(str3, pair3);
        }
        Pair<IBinder, String> pair4 = new Pair<>(new j(), i.a());
        for (String str4 : i.b()) {
            mapping.put(str4, pair4);
        }
        Pair<IBinder, String> pair5 = new Pair<>(new l(), k.a());
        for (String str5 : k.b()) {
            mapping.put(str5, pair5);
        }
    }
}
