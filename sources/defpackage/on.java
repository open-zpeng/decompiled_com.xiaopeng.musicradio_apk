package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FontAssetManager.java */
/* renamed from: on  reason: default package */
/* loaded from: classes3.dex */
public class on {
    private final AssetManager d;
    private a e;
    private final ow<String> a = new ow<>();
    private final Map<ow<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private String f = ".ttf";

    public on(Drawable.Callback callback, a aVar) {
        this.e = aVar;
        if (!(callback instanceof View)) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public Typeface a(String str, String str2) {
        this.a.a(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = a(a(str), str2);
        this.b.put(this.a, a);
        return a;
    }

    private Typeface a(String str) {
        String b;
        Typeface typeface = this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        a aVar = this.e;
        Typeface a = aVar != null ? aVar.a(str) : null;
        a aVar2 = this.e;
        if (aVar2 != null && a == null && (b = aVar2.b(str)) != null) {
            a = Typeface.createFromAsset(this.d, b);
        }
        if (a == null) {
            a = Typeface.createFromAsset(this.d, "fonts/" + str + this.f);
        }
        this.c.put(str, a);
        return a;
    }

    private Typeface a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
