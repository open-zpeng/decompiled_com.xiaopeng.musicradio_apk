package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Base64;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: QRCodeEncoder.java */
/* renamed from: acy  reason: default package */
/* loaded from: classes2.dex */
public class acy {
    public static final Map<zs, Object> a = new EnumMap(zs.class);

    static {
        a.put(zs.CHARACTER_SET, "utf-8");
        a.put(zs.ERROR_CORRECTION, aaa.H);
        a.put(zs.MARGIN, 0);
    }

    public static Bitmap a(String str, int i, int i2, Bitmap bitmap) {
        return a(str, i, i2, -1, bitmap);
    }

    public static Bitmap a(String str, int i, int i2, int i3, Bitmap bitmap) {
        try {
            zv a2 = new acx().a(str, zr.QR_CODE, i, i, a);
            int a3 = a2.a();
            int b = a2.b();
            int[] iArr = new int[a3 * b];
            for (int i4 = 0; i4 < b; i4++) {
                for (int i5 = 0; i5 < a3; i5++) {
                    if (a2.a(i5, i4)) {
                        iArr[(i4 * a3) + i5] = i2;
                    } else {
                        iArr[(i4 * a3) + i5] = i3;
                    }
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(a3, b, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, a3, 0, 0, a3, b);
            if (bitmap != null && createBitmap != null && (createBitmap.getWidth() != i || createBitmap.getHeight() != i)) {
                LogUtils.i("QRCodeEncoder", "scale:" + i + ListSignBean.COLLECTID_SUFFIX + createBitmap.getWidth() + ListSignBean.COLLECTID_SUFFIX + createBitmap.getHeight());
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i, i, true);
                if (createScaledBitmap != createBitmap) {
                    createBitmap.recycle();
                }
                createBitmap = createScaledBitmap;
            }
            return a(createBitmap, bitmap);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        float f = ((width * 1.0f) / 5.0f) / width2;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.scale(f, f, width / 2, height / 2);
            canvas.drawBitmap(bitmap2, (width - width2) / 2, (height - height2) / 2, (Paint) null);
            canvas.save();
            canvas.restore();
            return createBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap a(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.outConfig = Bitmap.Config.ARGB_8888;
            return BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        } catch (Exception e) {
            LogUtils.e("QRCodeEncoder", "base64ToBitmap:" + e.getLocalizedMessage());
            return null;
        }
    }
}
