package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ext.cornet.CronetDataSource;
import com.google.android.exoplayer2.ext.cornet.CronetUtil;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.FileDataSourceFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSinkFactory;
import com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.utils.be;
import java.util.concurrent.Executors;
import org.chromium.net.d;
/* compiled from: ExoHelper.java */
/* renamed from: avi  reason: default package */
/* loaded from: classes2.dex */
public class avi {
    private static HttpDataSource.Factory a;

    public static CacheDataSourceFactory a(Cache cache, TransferListener<? super DataSource> transferListener) {
        return new CacheDataSourceFactory(cache, a(transferListener), new FileDataSourceFactory(), new CacheDataSinkFactory(cache, 10485760L), 0, null);
    }

    public static DataSource.Factory a(TransferListener<? super DataSource> transferListener) {
        return new DefaultDataSourceFactory(a.a, transferListener, b(transferListener));
    }

    public static HttpDataSource.Factory b(TransferListener<? super DataSource> transferListener) {
        HttpDataSource.Factory factory = a;
        if (factory != null) {
            return factory;
        }
        d buildCronetEngine = CronetUtil.buildCronetEngine(a.a, "xiaopengmusic", false);
        if (buildCronetEngine != null) {
            a = new CronetDataSource.Factory(buildCronetEngine, Executors.newSingleThreadExecutor(), transferListener);
            return a;
        }
        a = new DefaultHttpDataSourceFactory("xiaopengmusic", transferListener);
        return a;
    }

    public static DataSource.Factory a() {
        return new FileDataSourceFactory();
    }

    public static String a(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || !str.startsWith("http")) {
            return str;
        }
        if (!str.contains("xpHash=")) {
            return (!str.contains("xmcdn.com") || (indexOf = str.indexOf("?")) <= -1) ? str : str.substring(0, indexOf);
        }
        String[] split = str.split("xpHash=");
        return (split.length <= 1 || be.a((CharSequence) split[1])) ? str : split[1];
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf("xpHash=");
        return indexOf < 1 ? str : str.substring(0, indexOf - 1);
    }
}
