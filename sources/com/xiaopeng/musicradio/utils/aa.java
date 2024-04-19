package com.xiaopeng.musicradio.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* compiled from: ImageLoaderUtil.java */
/* loaded from: classes2.dex */
public class aa {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;
    public static int d = 4;

    public static void a(final int i, View view) {
        final WeakReference weakReference = new WeakReference(view);
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.utils.aa.1
            @Override // java.lang.Runnable
            public void run() {
                final Drawable drawable = com.xiaopeng.musicradio.a.a.getDrawable(i);
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.utils.aa.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        View view2 = (View) weakReference.get();
                        if (view2 != null) {
                            view2.setBackground(drawable);
                        }
                    }
                });
            }
        });
    }

    public static void a(final int i, ImageView imageView) {
        final WeakReference weakReference = new WeakReference(imageView);
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.utils.aa.2
            @Override // java.lang.Runnable
            public void run() {
                final Drawable drawable = com.xiaopeng.musicradio.a.a.getDrawable(i);
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.utils.aa.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ImageView imageView2 = (ImageView) weakReference.get();
                        if (imageView2 != null) {
                            imageView2.setImageDrawable(drawable);
                        }
                    }
                });
            }
        });
    }
}
