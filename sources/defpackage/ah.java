package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import defpackage.z;
/* compiled from: ActionBarPolicy.java */
/* renamed from: ah  reason: default package */
/* loaded from: classes2.dex */
public class ah {
    private Context a;

    public static ah a(Context context) {
        return new ah(context);
    }

    private ah(Context context) {
        this.a = context;
    }

    public int a() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.a).hasPermanentMenuKey();
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean d() {
        return this.a.getResources().getBoolean(z.b.abc_action_bar_embed_tabs);
    }

    public int e() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, z.j.ActionBar, z.a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(z.j.ActionBar_height, 0);
        Resources resources = this.a.getResources();
        if (!d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(z.d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean f() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int g() {
        return this.a.getResources().getDimensionPixelSize(z.d.abc_action_bar_stacked_tab_max_width);
    }
}
