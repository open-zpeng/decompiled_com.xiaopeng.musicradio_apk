package com.xiaopeng.lib.apirouter.server;

import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Keep;
import java.util.HashMap;
@Keep
/* loaded from: classes.dex */
public class ManifestHelper_VuiEngine implements c {
    public HashMap<String, Pair<IBinder, String>> mapping = new HashMap<>();

    @Override // com.xiaopeng.lib.apirouter.server.c
    public HashMap<String, Pair<IBinder, String>> getMapping() {
        Pair<IBinder, String> pair = new Pair<>(new acb(), aca.a());
        for (String str : aca.b()) {
            this.mapping.put(str, pair);
        }
        Pair<IBinder, String> pair2 = new Pair<>(new abz(), aby.a());
        for (String str2 : aby.b()) {
            this.mapping.put(str2, pair2);
        }
        Pair<IBinder, String> pair3 = new Pair<>(new acd(), acc.a());
        for (String str3 : acc.b()) {
            this.mapping.put(str3, pair3);
        }
        return this.mapping;
    }
}
