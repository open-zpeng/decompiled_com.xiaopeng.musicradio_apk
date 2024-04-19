package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.xiaopeng.musicradio.bean.UnityBitmapData;
import com.xiaopeng.musicradio.playercomponent.small.presenter.SmallPlayerPresenter;
import java.nio.ByteBuffer;
import java.util.HashMap;
/* compiled from: SmallPlayerViewProxy.java */
/* renamed from: avm  reason: default package */
/* loaded from: classes2.dex */
public class avm extends aeu<avz, SmallPlayerPresenter> implements avz {
    private avj e;
    private UnityBitmapData f;

    @Override // defpackage.awb
    public void a(boolean z) {
    }

    @Override // defpackage.awb
    public void b() {
    }

    @Override // defpackage.avz
    public void b(int i) {
    }

    @Override // defpackage.avz
    public void b(String str, String str2) {
    }

    @Override // defpackage.awb
    public void h() {
    }

    @Override // defpackage.avz
    public void i() {
    }

    public avm(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public SmallPlayerPresenter g() {
        return new SmallPlayerPresenter();
    }

    @Override // defpackage.awb
    public void a(Drawable drawable) {
        if (drawable == null || !(drawable instanceof BitmapDrawable)) {
            return;
        }
        a(((BitmapDrawable) drawable).getBitmap());
    }

    private void a(Bitmap bitmap) {
        if (bitmap != null) {
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            int i = 0;
            if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (bitmap.getConfig() == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                i = 5;
            } else if (bitmap.getConfig() == Bitmap.Config.RGB_565) {
                i = 7;
            }
            this.f = new UnityBitmapData(array, bitmap.getWidth(), bitmap.getHeight(), i);
            avj avjVar = this.e;
            if (avjVar != null) {
                avjVar.a(this.f);
            }
            a("SmallPlayerViewProxy_player_small_refreshcover", this.f);
        }
    }

    @Override // defpackage.awb
    public void a(int i, int i2, int i3) {
        avj avjVar = this.e;
        if (avjVar != null) {
            avjVar.a(i, i2, i3);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pos", Integer.valueOf(i));
        hashMap.put("maxPos", Integer.valueOf(i2));
        hashMap.put("secPos", Integer.valueOf(i3));
        a("SmallPlayerViewProxy_player_small_updatepos", hashMap);
    }

    @Override // defpackage.awb
    public void a(int i) {
        avj avjVar = this.e;
        if (avjVar != null) {
            avjVar.a(i);
        }
    }
}
