package defpackage;

import com.google.gson.annotations.SerializedName;
/* compiled from: PlayRecordTrack.java */
/* renamed from: awj  reason: default package */
/* loaded from: classes2.dex */
public class awj {
    @SerializedName("track_id")
    private long a;
    @SerializedName("duration")
    private long b;
    @SerializedName("played_secs")
    private long c;
    @SerializedName("started_at")
    private long d;
    @SerializedName("ended_at")
    private long e;
    @SerializedName("play_type")
    private int f;

    public long a() {
        return this.a;
    }

    public void a(long j) {
        this.a = j;
    }

    public void b(long j) {
        this.b = j;
    }

    public void c(long j) {
        this.c = j;
    }

    public void d(long j) {
        this.d = j;
    }

    public void e(long j) {
        this.e = j;
    }

    public void a(int i) {
        this.f = i;
    }
}
