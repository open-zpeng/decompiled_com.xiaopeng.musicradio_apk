package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
/* compiled from: CacheManagerUtil.java */
/* renamed from: avh  reason: default package */
/* loaded from: classes2.dex */
public class avh {
    public static void a(Cache cache, String str) {
        for (CacheSpan cacheSpan : cache.getCachedSpans(avi.a(str))) {
            try {
                cache.removeSpan(cacheSpan);
            } catch (Cache.CacheException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean b(Cache cache, String str) {
        String a = avi.a(str);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        long contentLength = cache.getContentLength(a);
        return contentLength > 0 && cache.getCachedLength(a, 0L, 2147483647L) == contentLength;
    }

    public static int c(Cache cache, String str) {
        String a = avi.a(str);
        if (cache == null || TextUtils.isEmpty(a)) {
            return 0;
        }
        return (int) cache.getContentLength(a);
    }

    public static int d(Cache cache, String str) {
        int cachedLength;
        String a = avi.a(str);
        if (cache == null || TextUtils.isEmpty(a) || (cachedLength = (int) cache.getCachedLength(a, 0L, 2147483647L)) <= 0) {
            return 0;
        }
        return cachedLength;
    }
}
