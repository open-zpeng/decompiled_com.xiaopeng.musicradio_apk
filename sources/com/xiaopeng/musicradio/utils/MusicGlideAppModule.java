package com.xiaopeng.musicradio.utils;

import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ViewTarget;
import com.xiaopeng.musicradio.common.f;
/* loaded from: classes2.dex */
public class MusicGlideAppModule implements GlideModule {
    @Override // com.bumptech.glide.module.RegistersComponents
    public void registerComponents(Context context, Glide glide, Registry registry) {
    }

    @Override // com.bumptech.glide.module.AppliesOptions
    public void applyOptions(Context context, GlideBuilder glideBuilder) {
        int i;
        ViewTarget.setTagId(f.C0131f.tag_glide_id);
        MemorySizeCalculator build = new MemorySizeCalculator.Builder(context).build();
        float bitmapPoolSize = build.getBitmapPoolSize() + build.getMemoryCacheSize();
        int round = Math.round(0.67f * bitmapPoolSize);
        int round2 = Math.round((build.getBitmapPoolSize() / bitmapPoolSize) * round);
        glideBuilder.setBitmapPool(new LruBitmapPool(round2)).setMemoryCache(new LruResourceCache(round - round2));
        Log.i("MusicGlideModule", "init glide called: bitmapPoolSize = [" + a(context, round2) + "], resourceSize = [" + a(context, i) + "]");
        glideBuilder.setSourceExecutor(GlideExecutor.newSourceExecutor(4, "fifo-source", GlideExecutor.UncaughtThrowableStrategy.DEFAULT));
        glideBuilder.setDefaultRequestOptions(new RequestOptions().format(DecodeFormat.PREFER_RGB_565));
        glideBuilder.setDiskCache(new k(context));
        glideBuilder.setDiskCacheExecutor(k.b());
    }

    private String a(Context context, int i) {
        return Formatter.formatFileSize(context, i);
    }
}
