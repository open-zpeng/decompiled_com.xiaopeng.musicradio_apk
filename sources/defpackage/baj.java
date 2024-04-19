package defpackage;

import android.util.Log;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ThemeModel.java */
/* renamed from: baj  reason: default package */
/* loaded from: classes2.dex */
public class baj {
    private HashSet<bal> a = new HashSet<>();
    private HashSet<ThemeWatcher.OnThemeSwitchListener> b = new HashSet<>();
    private final b c = new b() { // from class: baj.1
        @Override // defpackage.baj.b
        public void a(int i) {
            Log.i("ThemeModel", "onSwitchTheme() called with: i = [" + i + "]");
            Log.i("ThemeModel", "onSwitchTheme: sus = " + baj.this.a.size() + " sws = " + baj.this.b.size());
            Iterator it = baj.this.a.iterator();
            while (it.hasNext()) {
                ((bal) it.next()).applyTheme();
            }
            Iterator it2 = baj.this.b.iterator();
            while (it2.hasNext()) {
                ((ThemeWatcher.OnThemeSwitchListener) it2.next()).onSwitchTheme(i);
            }
        }
    };

    /* compiled from: ThemeModel.java */
    /* renamed from: baj$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final baj a = new baj();
    }

    /* compiled from: ThemeModel.java */
    /* renamed from: baj$b */
    /* loaded from: classes2.dex */
    interface b {
        void a(int i);
    }

    public static baj a() {
        return a.a;
    }

    public void b() {
        int i = d() ? 2 : 1;
        Log.i("ThemeModel", "notifyThemeChange: " + i);
        this.c.a(i);
    }

    @Deprecated
    public void a(ThemeWatcher.OnThemeSwitchListener onThemeSwitchListener) {
        this.b.add(onThemeSwitchListener);
    }

    @Deprecated
    public void b(ThemeWatcher.OnThemeSwitchListener onThemeSwitchListener) {
        this.b.remove(onThemeSwitchListener);
    }

    public void a(bal balVar) {
        this.a.add(balVar);
    }

    public void b(bal balVar) {
        this.a.remove(balVar);
    }

    public int c() {
        boolean d = d();
        int i = d ? 2 : 1;
        Log.i("ThemeModel", "getCurrentTheme: " + d + " theme = " + i);
        return i;
    }

    public boolean d() {
        return acs.d(com.xiaopeng.musicradio.a.a);
    }
}
