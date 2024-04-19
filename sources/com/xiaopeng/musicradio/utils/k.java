package com.xiaopeng.musicradio.utils;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import java.io.File;
/* compiled from: CustomCacheDiskCacheFactory.java */
/* loaded from: classes2.dex */
public class k extends DiskLruCacheFactory {
    private static DiskCache a;
    private static GlideExecutor b;

    public k(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public k(final Context context, final String str, long j) {
        super(new DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.xiaopeng.musicradio.utils.k.1
            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public File getCacheDirectory() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                String str2 = str;
                return str2 != null ? new File(cacheDir, str2) : cacheDir;
            }
        }, j);
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory, com.bumptech.glide.load.engine.cache.DiskCache.Factory
    public DiskCache build() {
        DiskCache build = super.build();
        a = build;
        return build;
    }

    public static DiskCache a() {
        return a;
    }

    public static GlideExecutor b() {
        if (b == null) {
            b = GlideExecutor.newDiskCacheExecutor();
        }
        return b;
    }
}
