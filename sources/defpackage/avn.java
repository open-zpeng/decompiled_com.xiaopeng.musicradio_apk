package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.xiaopeng.musicradio.player.c;
import com.xiaopeng.musicradio.player.l;
/* compiled from: InterfaceTransfer.java */
/* renamed from: avn  reason: default package */
/* loaded from: classes2.dex */
public class avn implements l {
    private int a;
    private c b;

    public avn(int i, c cVar) {
        this.a = i;
        this.b = cVar;
    }

    public void a(c cVar) {
        this.b = cVar;
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void playState(String str, int i) {
        Log.i("InterfaceTransfer", "playState: " + i + " interface = " + this.b);
        try {
            this.b.a(this.a, str, i);
        } catch (Exception e) {
            Log.e("InterfaceTransfer", "playState: ", e);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onPlayError(String str, int i) {
        Log.i("InterfaceTransfer", "onPlayError: ");
        try {
            this.b.b(this.a, str, i);
        } catch (Exception e) {
            Log.e("InterfaceTransfer", "onPlayError: ", e);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onPlayPosition(String str, int i, int i2) {
        try {
            this.b.a(this.a, str, i, i2);
        } catch (Exception e) {
            Log.e("InterfaceTransfer", "onPlayPosition: ", e);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void loadingChange(String str, boolean z) {
        try {
            this.b.a(this.a, str, z);
        } catch (Exception e) {
            Log.e("InterfaceTransfer", "loadingChange: ", e);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onTimeLineChange(String str) {
        try {
            this.b.a(this.a, str);
        } catch (Exception e) {
            Log.e("InterfaceTransfer", "onTimeLineChange: ", e);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onDownloaded(String str, String str2, long j) {
        Log.d("InterfaceTransfer", "onDownloaded: key = " + str2 + " length = " + j);
        try {
            this.b.a(this.a, str, str2, j);
        } catch (Exception e) {
            Log.e("InterfaceTransfer", "onDownloaded: ", e);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onSetData(String str, Bundle bundle) {
        Log.d("InterfaceTransfer", "setData: ");
        try {
            this.b.a(this.a, str, bundle);
        } catch (Exception e) {
            Log.e("InterfaceTransfer", "onSetData: ", e);
        }
    }
}
