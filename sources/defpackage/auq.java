package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.util.Util;
import com.xiaopeng.musicradio.utils.o;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: LocationRadioGlideRoundTransform.java */
/* renamed from: auq  reason: default package */
/* loaded from: classes2.dex */
public class auq extends BitmapTransformation {
    private static final byte[] a = "com.bumptech.glide.transformations.LocationRadioGlideRoundTransform".getBytes(Charset.forName("UTF-8"));
    private final float b;

    public auq(Context context, int i) {
        this.b = o.a(context, i);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return a(bitmapPool, bitmap);
    }

    private Bitmap a(BitmapPool bitmapPool, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        paint.setColor(-1);
        float f = this.b;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        float f2 = this.b;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        return bitmap2;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return (obj instanceof auq) && this.b == ((auq) obj).b;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode("com.bumptech.glide.transformations.LocationRadioGlideRoundTransform".hashCode(), Util.hashCode(this.b));
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(a);
        messageDigest.update(ByteBuffer.allocate(4).putFloat(this.b).array());
    }
}
