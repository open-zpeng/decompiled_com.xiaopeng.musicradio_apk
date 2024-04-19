package defpackage;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.HashMap;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MediaPlayHandler.java */
/* renamed from: ael  reason: default package */
/* loaded from: classes2.dex */
public class ael {
    private aek a;
    private HashMap<String, Integer> b = new HashMap<>();

    public ael(aek aekVar) {
        this.a = aekVar;
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIGChange(agg.s sVar) {
        if (sVar.a()) {
            return;
        }
        a();
    }

    public boolean a(int i, String str) {
        Log.i("MediaPlayHandler", "onPlayError: " + i + " url = " + str);
        if (i == 403) {
            if (!a(str)) {
                this.a.h();
                b(str);
                return true;
            }
            LogUtils.i("MediaPlayHandler", "url:" + str + " retry exceeded");
            this.a.pause();
            return true;
        }
        return false;
    }

    private boolean a(String str) {
        return this.b.containsKey(str) && this.b.get(str).intValue() > 5;
    }

    private void b(String str) {
        if (this.b.containsKey(str)) {
            HashMap<String, Integer> hashMap = this.b;
            hashMap.put(str, Integer.valueOf(hashMap.get(str).intValue() + 1));
            return;
        }
        this.b.put(str, 1);
    }

    private void a() {
        this.b.clear();
    }
}
