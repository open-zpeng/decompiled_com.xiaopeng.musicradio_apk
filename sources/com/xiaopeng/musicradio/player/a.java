package com.xiaopeng.musicradio.player;

import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.DataSource;
/* compiled from: AssetDataSourceFactory.java */
/* loaded from: classes2.dex */
public class a implements DataSource.Factory {
    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DataSource createDataSource() {
        return new AssetDataSource(com.xiaopeng.musicradio.a.a);
    }
}
