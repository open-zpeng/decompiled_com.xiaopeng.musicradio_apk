package com.xiaopeng.musicradio.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.xiaopeng.musicradio.common.f;
import java.util.HashMap;
/* compiled from: GlideUtil.java */
/* loaded from: classes2.dex */
public class y {
    private static HashMap<String, Integer> a = new HashMap<String, Integer>() { // from class: com.xiaopeng.musicradio.utils.y.1
        {
            put("android.resource://" + com.xiaopeng.musicradio.a.a.getPackageName() + "/" + f.e.usb_80, Integer.valueOf(f.e.usb_80));
        }
    };

    public static void a(Context context) {
        final Context applicationContext = context.getApplicationContext();
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.utils.y.2
            @Override // java.lang.Runnable
            public void run() {
                Glide.get(applicationContext);
            }
        });
    }

    private static boolean d(Context context) {
        return (context instanceof Activity) && ((Activity) context).isDestroyed();
    }

    public static void a(Context context, int i, ImageView imageView) {
        if (d(context)) {
            return;
        }
        try {
            Glide.with(context).load(Integer.valueOf(i)).addListener(a()).apply((BaseRequestOptions<?>) new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE)).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context, String str, Drawable drawable, ImageView imageView) {
        if (d(context)) {
            return;
        }
        try {
            Glide.with(context).load(str).addListener(a()).placeholder(drawable).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(String str, int i, ImageView imageView) {
        a(imageView.getContext(), str, i, imageView);
    }

    public static void a(Context context, String str, int i, ImageView imageView) {
        if (d(context)) {
            return;
        }
        RequestManager e = e(context);
        if (TextUtils.isEmpty(str)) {
            e.clear(imageView);
            imageView.setImageResource(i);
        } else if (str.startsWith("android.resource") && a.containsKey(str)) {
            e.clear(imageView);
            imageView.setImageResource(a.get(str).intValue());
        } else {
            imageView.setImageResource(0);
            try {
                e.load(str).placeholder(context.getDrawable(i)).addListener(a()).into(imageView);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void b(Context context, String str, int i, ImageView imageView) {
        if (d(context)) {
            return;
        }
        if (be.a((CharSequence) str)) {
            imageView.setImageResource(i);
            return;
        }
        try {
            e(context).load(str).addListener(a()).placeholder(context.getDrawable(i)).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(Context context, String str, int i, ImageView imageView) {
        if (d(context)) {
            return;
        }
        try {
            e(context).load(str).addListener(a()).placeholder(context.getDrawable(i)).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context, String str, int i, ImageView imageView, BitmapTransformation bitmapTransformation) {
        if (d(context)) {
            return;
        }
        try {
            e(context).load(str).addListener(a()).placeholder(context.getDrawable(i)).transform(new FitCenter(), bitmapTransformation).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(Context context, String str, int i, ImageView imageView) {
        if (d(context)) {
            return;
        }
        try {
            e(context).load(str).addListener(a()).placeholder(context.getDrawable(i)).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context, String str, int i, int i2, int i3, int i4, ImageView imageView) {
        if (d(context)) {
            return;
        }
        e(context).load(str).addListener(a()).skipMemoryCache(true).placeholder(context.getDrawable(i2)).apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform(new bir(i, 3))).override((i3 / 3) * 2, (i4 / 3) * 2).into(imageView);
    }

    private static RequestManager e(Context context) {
        if (context instanceof com.xiaopeng.musicradio.commonui.base.e) {
            return ((com.xiaopeng.musicradio.commonui.base.e) context).a();
        }
        if (context instanceof ContextThemeWrapper) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            if (contextThemeWrapper.getBaseContext() instanceof com.xiaopeng.musicradio.widget.mvpbase.a) {
                return ((com.xiaopeng.musicradio.widget.mvpbase.a) contextThemeWrapper.getBaseContext()).a();
            }
        }
        return Glide.with(context);
    }

    public static void a(Fragment fragment) {
        if (d(fragment.getContext())) {
            return;
        }
        try {
            Glide.with(fragment.getContext()).onDestroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(Context context) {
        if (d(context)) {
            return;
        }
        try {
            Glide.with(context).pauseRequests();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(Context context) {
        if (d(context)) {
            return;
        }
        try {
            if (Glide.with(context).isPaused()) {
                Glide.with(context).resumeRequests();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static RequestListener<Drawable> a() {
        return new RequestListener<Drawable>() { // from class: com.xiaopeng.musicradio.utils.y.3
            @Override // com.bumptech.glide.request.RequestListener
            /* renamed from: a */
            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                Log.i("GlideUtil", "onLoadFailed: threadId = " + Thread.currentThread().getId());
                if (glideException == null || glideException.getMessage() == null || !glideException.getMessage().contains("Failed to load resource")) {
                    return false;
                }
                x.a().a(obj);
                return false;
            }
        };
    }
}
