package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.b;
import com.airbnb.lottie.g;
import com.alibaba.fastjson.asm.Opcodes;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ImageAssetManager.java */
/* renamed from: oo  reason: default package */
/* loaded from: classes3.dex */
public class oo {
    private static final Object a = new Object();
    private final Context b;
    private String c;
    private b d;
    private final Map<String, g> e;

    public oo(Drawable.Callback callback, String str, b bVar, Map<String, g> map) {
        String str2;
        this.c = str;
        if (!TextUtils.isEmpty(str)) {
            if (this.c.charAt(str2.length() - 1) != '/') {
                this.c += '/';
            }
        }
        if (!(callback instanceof View)) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.e = new HashMap();
            this.b = null;
            return;
        }
        this.b = ((View) callback).getContext();
        this.e = map;
        a(bVar);
    }

    public void a(b bVar) {
        this.d = bVar;
    }

    public Bitmap a(String str) {
        g gVar = this.e.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap c = gVar.c();
        if (c != null) {
            return c;
        }
        b bVar = this.d;
        if (bVar != null) {
            Bitmap a2 = bVar.a(gVar);
            if (a2 != null) {
                a(str, a2);
            }
            return a2;
        }
        String b = gVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = Opcodes.IF_ICMPNE;
        if (b.startsWith("data:") && b.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                return a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                Log.w("LOTTIE", "data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.c)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            AssetManager assets = this.b.getAssets();
            return a(str, BitmapFactory.decodeStream(assets.open(this.c + b), null, options));
        } catch (IOException e2) {
            Log.w("LOTTIE", "Unable to open asset.", e2);
            return null;
        }
    }

    public void a() {
        synchronized (a) {
            for (Map.Entry<String, g> entry : this.e.entrySet()) {
                g value = entry.getValue();
                Bitmap c = value.c();
                if (c != null) {
                    c.recycle();
                    value.a(null);
                }
            }
        }
    }

    public boolean a(Context context) {
        return (context == null && this.b == null) || this.b.equals(context);
    }

    private Bitmap a(String str, Bitmap bitmap) {
        synchronized (a) {
            this.e.get(str).a(bitmap);
        }
        return bitmap;
    }
}
