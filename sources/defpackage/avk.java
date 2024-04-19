package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.UnityBitmapData;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerCommonPresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.c;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.utils.z;
import java.nio.ByteBuffer;
import java.util.HashMap;
/* compiled from: PlayerCommonViewProxy.java */
/* renamed from: avk  reason: default package */
/* loaded from: classes2.dex */
public class avk extends aeu<c, PlayerCommonPresenter> implements c {
    private UnityBitmapData e;
    private avj f;

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void V_() {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void b(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void h() {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void i() {
    }

    public avk(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public PlayerCommonPresenter g() {
        return new PlayerCommonPresenter();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void a(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("pos", Integer.valueOf(i));
        hashMap.put("max", Integer.valueOf(i2));
        hashMap.put("secondPos", Integer.valueOf(i3));
        c_("RefreshPos", z.a(hashMap));
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void a(Drawable drawable) {
        if (drawable == null || !(drawable instanceof BitmapDrawable)) {
            return;
        }
        a(((BitmapDrawable) drawable).getBitmap());
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void a(int i) {
        a(BitmapFactory.decodeResource(a.a.getResources(), i));
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
            this.e = new UnityBitmapData(array, bitmap.getWidth(), bitmap.getHeight(), i);
            avj avjVar = this.f;
            if (avjVar != null) {
                avjVar.a(this.e);
            }
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void b(int i) {
        a("RefreshState", (Number) Integer.valueOf(i));
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("PlayerCommonViewProxy", "monoMessage: " + str);
        if ("next".equals(str)) {
            k();
        } else if ("prev".equals(str)) {
            l();
        } else if ("playOrPause".equals(str)) {
            j();
        } else if ("setPosition".equals(str)) {
            try {
                ((PlayerCommonPresenter) this.c).a(Common.IntParam.parseFrom(bArr).getParam());
            } catch (Exception e) {
                Log.e("PlayerCommonViewProxy", "monoMessage: ", e);
            }
        }
    }

    public void j() {
        ((PlayerCommonPresenter) this.c).e();
    }

    public void k() {
        ((PlayerCommonPresenter) this.c).d();
    }

    public void l() {
        ((PlayerCommonPresenter) this.c).c();
    }
}
