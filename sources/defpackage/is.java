package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.speech.protocol.node.navi.bean.NaviPreferenceBean;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.jaudiotagger.audio.ogg.util.OggPageHeader;
import org.jaudiotagger.tag.datatype.DataTypes;
/* compiled from: ExifInterface.java */
/* renamed from: is  reason: default package */
/* loaded from: classes3.dex */
public class is {
    private static final c A;
    private static final c B;
    private static final HashMap<Integer, c>[] C;
    private static final HashMap<String, c>[] D;
    private static final HashSet<String> E;
    private static final HashMap<Integer, Integer> F;
    private static final Pattern X;
    private static final Pattern Y;
    static final c[][] h;
    static final Charset i;
    static final byte[] j;
    private static SimpleDateFormat o;
    private static final c[] z;
    private final String G;
    private final AssetManager.AssetInputStream H;
    private int I;

    /* renamed from: J  reason: collision with root package name */
    private final HashMap<String, b>[] f162J;
    private Set<Integer> K;
    private ByteOrder L;
    private boolean M;
    private int N;
    private int O;
    private byte[] P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private static final List<Integer> k = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> l = Arrays.asList(2, 7, 4, 5);
    public static final int[] a = {8, 8, 8};
    public static final int[] b = {4};
    public static final int[] c = {8};
    static final byte[] d = {-1, -40, -1};
    private static final byte[] m = {79, 76, 89, 77, 80, 0};
    private static final byte[] n = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    static final String[] e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    static final int[] f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] g = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final c[] p = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", IRadioController.TEF663x_PCHANNEL, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", OggPageHeader.MAXIMUM_PAGE_HEADER_SIZE, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", NaviPreferenceBean.CAFE_ID, 3), new c("Software", NaviPreferenceBean.RESTAURANT_ID, 2), new c(DataTypes.OBJ_DATETIME, NaviPreferenceBean.PARKING_LOT_ID, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
    private static final c[] q = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    private static final c[] r = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
    private static final c[] s = {new c("InteroperabilityIndex", 1, 2)};
    private static final c[] t = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", IRadioController.TEF663x_PCHANNEL, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", OggPageHeader.MAXIMUM_PAGE_HEADER_SIZE, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", NaviPreferenceBean.CAFE_ID, 3), new c("Software", NaviPreferenceBean.RESTAURANT_ID, 2), new c(DataTypes.OBJ_DATETIME, NaviPreferenceBean.PARKING_LOT_ID, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    private static final c u = new c("StripOffsets", 273, 3);
    private static final c[] v = {new c("ThumbnailImage", IRadioController.TEF663x_PCHANNEL, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
    private static final c[] w = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
    private static final c[] x = {new c("AspectFrame", 4371, 3)};
    private static final c[] y = {new c("ColorSpace", 55, 3)};

    static {
        c[] cVarArr;
        c[] cVarArr2 = p;
        h = new c[][]{cVarArr2, q, r, s, t, cVarArr2, v, w, x, y};
        z = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        A = new c("JPEGInterchangeFormat", 513, 4);
        B = new c("JPEGInterchangeFormatLength", 514, 4);
        c[][] cVarArr3 = h;
        C = new HashMap[cVarArr3.length];
        D = new HashMap[cVarArr3.length];
        E = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        F = new HashMap<>();
        i = Charset.forName(C.ASCII_NAME);
        j = "Exif\u0000\u0000".getBytes(i);
        o = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        o.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i2 = 0; i2 < h.length; i2++) {
            C[i2] = new HashMap<>();
            D[i2] = new HashMap<>();
            for (c cVar : h[i2]) {
                C[i2].put(Integer.valueOf(cVar.a), cVar);
                D[i2].put(cVar.b, cVar);
            }
        }
        F.put(Integer.valueOf(z[0].a), 5);
        F.put(Integer.valueOf(z[1].a), 1);
        F.put(Integer.valueOf(z[2].a), 2);
        F.put(Integer.valueOf(z[3].a), 3);
        F.put(Integer.valueOf(z[4].a), 7);
        F.put(Integer.valueOf(z[5].a), 8);
        X = Pattern.compile(".*[1-9].*");
        Y = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: is$d */
    /* loaded from: classes3.dex */
    public static class d {
        public final long a;
        public final long b;

        d(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = j;
            this.b = j2;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }

        public double a() {
            return this.a / this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: is$b */
    /* loaded from: classes3.dex */
    public static class b {
        public final int a;
        public final int b;
        public final byte[] c;

        b(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }

        public static b a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[is.f[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public static b a(int i, ByteOrder byteOrder) {
            return a(new int[]{i}, byteOrder);
        }

        public static b a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[is.f[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b a(long j, ByteOrder byteOrder) {
            return a(new long[]{j}, byteOrder);
        }

        public static b a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(is.i);
            return new b(2, bytes.length, bytes);
        }

        public static b a(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[is.f[5] * dVarArr.length]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.a);
                wrap.putInt((int) dVar.b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public static b a(d dVar, ByteOrder byteOrder) {
            return a(new d[]{dVar}, byteOrder);
        }

        public String toString() {
            return "(" + is.e[this.a] + ", data length:" + this.c.length + ")";
        }

        /* JADX WARN: Removed duplicated region for block: B:184:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object a(java.nio.ByteOrder r9) {
            /*
                Method dump skipped, instructions count: 518
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.is.b.a(java.nio.ByteOrder):java.lang.Object");
        }

        public double b(ByteOrder byteOrder) {
            Object a = a(byteOrder);
            if (a == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (a instanceof String) {
                return Double.parseDouble((String) a);
            }
            if (a instanceof long[]) {
                long[] jArr = (long[]) a;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (a instanceof double[]) {
                double[] dArr = (double[]) a;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (a instanceof d[]) {
                d[] dVarArr = (d[]) a;
                if (dVarArr.length == 1) {
                    return dVarArr[0].a();
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }

        public int c(ByteOrder byteOrder) {
            Object a = a(byteOrder);
            if (a == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (a instanceof String) {
                return Integer.parseInt((String) a);
            }
            if (a instanceof long[]) {
                long[] jArr = (long[]) a;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }

        public String d(ByteOrder byteOrder) {
            Object a = a(byteOrder);
            if (a == null) {
                return null;
            }
            if (a instanceof String) {
                return (String) a;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (a instanceof long[]) {
                long[] jArr = (long[]) a;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(ListSignBean.COLLECTID_SUFFIX);
                    }
                }
                return sb.toString();
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(ListSignBean.COLLECTID_SUFFIX);
                    }
                }
                return sb.toString();
            } else if (a instanceof double[]) {
                double[] dArr = (double[]) a;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(ListSignBean.COLLECTID_SUFFIX);
                    }
                }
                return sb.toString();
            } else if (a instanceof d[]) {
                d[] dVarArr = (d[]) a;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].a);
                    sb.append('/');
                    sb.append(dVarArr[i].b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(ListSignBean.COLLECTID_SUFFIX);
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* renamed from: is$c */
    /* loaded from: classes3.dex */
    public static class c {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        c(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        c(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }

        boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.c == 9 || this.d == 9) && i == 8) {
                return true;
            }
            return (this.c == 12 || this.d == 12) && i == 11;
        }
    }

    public is(InputStream inputStream) {
        c[][] cVarArr = h;
        this.f162J = new HashMap[cVarArr.length];
        this.K = new HashSet(cVarArr.length);
        this.L = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null");
        }
        this.G = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.H = (AssetManager.AssetInputStream) inputStream;
        } else {
            this.H = null;
        }
        a(inputStream);
    }

    private b b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < h.length; i2++) {
            b bVar = this.f162J[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    public String a(String str) {
        b b2 = b(str);
        if (b2 != null) {
            if (!E.contains(str)) {
                return b2.d(this.L);
            }
            if (str.equals("GPSTimeStamp")) {
                if (b2.a != 5 && b2.a != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + b2.a);
                    return null;
                }
                d[] dVarArr = (d[]) b2.a(this.L);
                if (dVarArr == null || dVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].b))));
            }
            try {
                return Double.toString(b2.b(this.L));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public int a(String str, int i2) {
        b b2 = b(str);
        if (b2 == null) {
            return i2;
        }
        try {
            return b2.c(this.L);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    private void a(InputStream inputStream) {
        for (int i2 = 0; i2 < h.length; i2++) {
            try {
                try {
                    this.f162J[i2] = new HashMap<>();
                } catch (IOException unused) {
                    this.W = false;
                }
            } finally {
                a();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.I = a(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.I) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                a(aVar);
                break;
            case 4:
                a(aVar, 0, 0);
                break;
            case 7:
                c(aVar);
                break;
            case 9:
                b(aVar);
                break;
            case 10:
                d(aVar);
                break;
        }
        f(aVar);
        this.W = true;
    }

    private int a(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (a(bArr)) {
            return 4;
        }
        if (b(bArr)) {
            return 9;
        }
        if (c(bArr)) {
            return 7;
        }
        return d(bArr) ? 10 : 0;
    }

    private static boolean a(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = d;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean b(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean c(byte[] bArr) {
        a aVar = new a(bArr);
        this.L = e(aVar);
        aVar.a(this.L);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    private boolean d(byte[] bArr) {
        a aVar = new a(bArr);
        this.L = e(aVar);
        aVar.a(this.L);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011d, code lost:
        r9.a(r8.L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0122, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(defpackage.is.a r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is.a(is$a, int, int):void");
    }

    private void a(a aVar) {
        b bVar;
        a(aVar, aVar.available());
        b(aVar, 0);
        d(aVar, 0);
        d(aVar, 5);
        d(aVar, 4);
        b((InputStream) aVar);
        if (this.I != 8 || (bVar = this.f162J[1].get("MakerNote")) == null) {
            return;
        }
        a aVar2 = new a(bVar.c);
        aVar2.a(this.L);
        aVar2.a(6L);
        b(aVar2, 9);
        b bVar2 = this.f162J[9].get("ColorSpace");
        if (bVar2 != null) {
            this.f162J[1].put("ColorSpace", bVar2);
        }
    }

    private void b(a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        a(aVar, i2, 5);
        aVar.a(i3);
        aVar.a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == u.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b a2 = b.a((int) readShort, this.L);
                b a3 = b.a((int) readShort2, this.L);
                this.f162J[0].put("ImageLength", a2);
                this.f162J[0].put("ImageWidth", a3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    private void c(a aVar) {
        a(aVar);
        b bVar = this.f162J[1].get("MakerNote");
        if (bVar != null) {
            a aVar2 = new a(bVar.c);
            aVar2.a(this.L);
            byte[] bArr = new byte[m.length];
            aVar2.readFully(bArr);
            aVar2.a(0L);
            byte[] bArr2 = new byte[n.length];
            aVar2.readFully(bArr2);
            if (Arrays.equals(bArr, m)) {
                aVar2.a(8L);
            } else if (Arrays.equals(bArr2, n)) {
                aVar2.a(12L);
            }
            b(aVar2, 6);
            b bVar2 = this.f162J[7].get("PreviewImageStart");
            b bVar3 = this.f162J[7].get("PreviewImageLength");
            if (bVar2 != null && bVar3 != null) {
                this.f162J[5].put("JPEGInterchangeFormat", bVar2);
                this.f162J[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = this.f162J[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.a(this.L);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                } else {
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    b a2 = b.a(i2, this.L);
                    b a3 = b.a(i3, this.L);
                    this.f162J[0].put("ImageWidth", a2);
                    this.f162J[0].put("ImageLength", a3);
                }
            }
        }
    }

    private void d(a aVar) {
        a(aVar);
        if (this.f162J[0].get("JpgFromRaw") != null) {
            a(aVar, this.V, 5);
        }
        b bVar = this.f162J[0].get("ISO");
        b bVar2 = this.f162J[1].get("PhotographicSensitivity");
        if (bVar == null || bVar2 != null) {
            return;
        }
        this.f162J[1].put("PhotographicSensitivity", bVar);
    }

    private void a(byte[] bArr, int i2) {
        a aVar = new a(bArr);
        a(aVar, bArr.length);
        b(aVar, i2);
    }

    private void a() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null && a(DataTypes.OBJ_DATETIME) == null) {
            this.f162J[0].put(DataTypes.OBJ_DATETIME, b.a(a2));
        }
        if (a("ImageWidth") == null) {
            this.f162J[0].put("ImageWidth", b.a(0L, this.L));
        }
        if (a("ImageLength") == null) {
            this.f162J[0].put("ImageLength", b.a(0L, this.L));
        }
        if (a("Orientation") == null) {
            this.f162J[0].put("Orientation", b.a(0L, this.L));
        }
        if (a("LightSource") == null) {
            this.f162J[1].put("LightSource", b.a(0L, this.L));
        }
    }

    private ByteOrder e(a aVar) {
        short readShort = aVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void a(a aVar, int i2) {
        this.L = e(aVar);
        aVar.a(this.L);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.I;
        if (i3 != 7 && i3 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = aVar.readInt();
        if (readInt < 8 || readInt >= i2) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i4 = readInt - 8;
        if (i4 <= 0 || aVar.skipBytes(i4) == i4) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(defpackage.is.a r21, int r22) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is.b(is$a, int):void");
    }

    private void c(a aVar, int i2) {
        b bVar;
        b bVar2 = this.f162J[i2].get("ImageLength");
        b bVar3 = this.f162J[i2].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f162J[i2].get("JPEGInterchangeFormat")) != null) {
            a(aVar, bVar.c(this.L), i2);
        }
    }

    private void f(a aVar) {
        HashMap<String, b> hashMap = this.f162J[4];
        b bVar = hashMap.get("Compression");
        if (bVar != null) {
            this.Q = bVar.c(this.L);
            int i2 = this.Q;
            if (i2 != 1) {
                switch (i2) {
                    case 6:
                        a(aVar, hashMap);
                        return;
                    case 7:
                        break;
                    default:
                        return;
                }
            }
            if (a((HashMap) hashMap)) {
                b(aVar, hashMap);
                return;
            }
            return;
        }
        this.Q = 6;
        a(aVar, hashMap);
    }

    private void a(a aVar, HashMap hashMap) {
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int c2 = bVar.c(this.L);
        int min = Math.min(bVar2.c(this.L), aVar.available() - c2);
        int i2 = this.I;
        if (i2 == 4 || i2 == 9 || i2 == 10) {
            c2 += this.R;
        } else if (i2 == 7) {
            c2 += this.S;
        }
        if (c2 <= 0 || min <= 0) {
            return;
        }
        this.M = true;
        this.N = c2;
        this.O = min;
        if (this.G == null && this.H == null) {
            byte[] bArr = new byte[min];
            aVar.a(c2);
            aVar.readFully(bArr);
            this.P = bArr;
        }
    }

    private void b(a aVar, HashMap hashMap) {
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (bVar == null || bVar2 == null) {
            return;
        }
        long[] a2 = a(bVar.a(this.L));
        long[] a3 = a(bVar2.a(this.L));
        if (a2 == null) {
            Log.w("ExifInterface", "stripOffsets should not be null.");
        } else if (a3 == null) {
            Log.w("ExifInterface", "stripByteCounts should not be null.");
        } else {
            long j2 = 0;
            for (long j3 : a3) {
                j2 += j3;
            }
            byte[] bArr = new byte[(int) j2];
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < a2.length; i4++) {
                int i5 = (int) a3[i4];
                int i6 = ((int) a2[i4]) - i2;
                if (i6 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                }
                aVar.a(i6);
                int i7 = i2 + i6;
                byte[] bArr2 = new byte[i5];
                aVar.read(bArr2);
                i2 = i7 + i5;
                System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                i3 += bArr2.length;
            }
            this.M = true;
            this.P = bArr;
            this.O = bArr.length;
        }
    }

    private boolean a(HashMap hashMap) {
        b bVar;
        b bVar2 = (b) hashMap.get("BitsPerSample");
        if (bVar2 != null) {
            int[] iArr = (int[]) bVar2.a(this.L);
            if (Arrays.equals(a, iArr)) {
                return true;
            }
            if (this.I != 3 || (bVar = (b) hashMap.get("PhotometricInterpretation")) == null) {
                return false;
            }
            int c2 = bVar.c(this.L);
            return (c2 == 1 && Arrays.equals(iArr, c)) || (c2 == 6 && Arrays.equals(iArr, a));
        }
        return false;
    }

    private boolean b(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.c(this.L) <= 512 && bVar2.c(this.L) <= 512;
    }

    private void b(InputStream inputStream) {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        b bVar = this.f162J[1].get("PixelXDimension");
        b bVar2 = this.f162J[1].get("PixelYDimension");
        if (bVar != null && bVar2 != null) {
            this.f162J[0].put("ImageWidth", bVar);
            this.f162J[0].put("ImageLength", bVar2);
        }
        if (this.f162J[4].isEmpty() && b(this.f162J[5])) {
            HashMap<String, b>[] hashMapArr = this.f162J;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (b(this.f162J[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    private void d(a aVar, int i2) {
        b a2;
        b a3;
        b bVar = this.f162J[i2].get("DefaultCropSize");
        b bVar2 = this.f162J[i2].get("SensorTopBorder");
        b bVar3 = this.f162J[i2].get("SensorLeftBorder");
        b bVar4 = this.f162J[i2].get("SensorBottomBorder");
        b bVar5 = this.f162J[i2].get("SensorRightBorder");
        if (bVar == null) {
            if (bVar2 != null && bVar3 != null && bVar4 != null && bVar5 != null) {
                int c2 = bVar2.c(this.L);
                int c3 = bVar4.c(this.L);
                int c4 = bVar5.c(this.L);
                int c5 = bVar3.c(this.L);
                if (c3 <= c2 || c4 <= c5) {
                    return;
                }
                b a4 = b.a(c3 - c2, this.L);
                b a5 = b.a(c4 - c5, this.L);
                this.f162J[i2].put("ImageLength", a4);
                this.f162J[i2].put("ImageWidth", a5);
                return;
            }
            c(aVar, i2);
            return;
        }
        if (bVar.a == 5) {
            d[] dVarArr = (d[]) bVar.a(this.L);
            if (dVarArr == null || dVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                return;
            }
            a2 = b.a(dVarArr[0], this.L);
            a3 = b.a(dVarArr[1], this.L);
        } else {
            int[] iArr = (int[]) bVar.a(this.L);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            a2 = b.a(iArr[0], this.L);
            a3 = b.a(iArr[1], this.L);
        }
        this.f162J[i2].put("ImageWidth", a2);
        this.f162J[i2].put("ImageLength", a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: is$a */
    /* loaded from: classes3.dex */
    public static class a extends InputStream implements DataInput {
        private static final ByteOrder c = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder d = ByteOrder.BIG_ENDIAN;
        final int a;
        int b;
        private DataInputStream e;
        private ByteOrder f;

        public a(InputStream inputStream) {
            this.f = ByteOrder.BIG_ENDIAN;
            this.e = new DataInputStream(inputStream);
            this.a = this.e.available();
            this.b = 0;
            this.e.mark(this.a);
        }

        public a(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        public void a(ByteOrder byteOrder) {
            this.f = byteOrder;
        }

        public void a(long j) {
            int i = this.b;
            if (i > j) {
                this.b = 0;
                this.e.reset();
                this.e.mark(this.a);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int a() {
            return this.b;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.e.available();
        }

        @Override // java.io.InputStream
        public int read() {
            this.b++;
            return this.e.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.e.read(bArr, i, i2);
            this.b += read;
            return read;
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.b++;
            return this.e.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.b++;
            return this.e.readBoolean();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.b += 2;
            return this.e.readChar();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.b += 2;
            return this.e.readUTF();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            this.b += i2;
            if (this.b > this.a) {
                throw new EOFException();
            }
            if (this.e.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.b += bArr.length;
            if (this.b > this.a) {
                throw new EOFException();
            }
            if (this.e.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.b++;
            if (this.b > this.a) {
                throw new EOFException();
            }
            int read = this.e.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.b += 2;
            if (this.b > this.a) {
                throw new EOFException();
            }
            int read = this.e.read();
            int read2 = this.e.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f;
            if (byteOrder == c) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == d) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.b += 4;
            if (this.b > this.a) {
                throw new EOFException();
            }
            int read = this.e.read();
            int read2 = this.e.read();
            int read3 = this.e.read();
            int read4 = this.e.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f;
            if (byteOrder == c) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == d) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            int min = Math.min(i, this.a - this.b);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.e.skipBytes(min - i2);
            }
            this.b += i2;
            return i2;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.b += 2;
            if (this.b > this.a) {
                throw new EOFException();
            }
            int read = this.e.read();
            int read2 = this.e.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f;
            if (byteOrder == c) {
                return (read2 << 8) + read;
            }
            if (byteOrder == d) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f);
        }

        public long b() {
            return readInt() & 4294967295L;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.b += 8;
            if (this.b > this.a) {
                throw new EOFException();
            }
            int read = this.e.read();
            int read2 = this.e.read();
            int read3 = this.e.read();
            int read4 = this.e.read();
            int read5 = this.e.read();
            int read6 = this.e.read();
            int read7 = this.e.read();
            int read8 = this.e.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f;
            if (byteOrder == c) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == d) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f);
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }
    }

    private void a(int i2, int i3) {
        if (this.f162J[i2].isEmpty() || this.f162J[i3].isEmpty()) {
            return;
        }
        b bVar = this.f162J[i2].get("ImageLength");
        b bVar2 = this.f162J[i2].get("ImageWidth");
        b bVar3 = this.f162J[i3].get("ImageLength");
        b bVar4 = this.f162J[i3].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int c2 = bVar.c(this.L);
        int c3 = bVar2.c(this.L);
        int c4 = bVar3.c(this.L);
        int c5 = bVar4.c(this.L);
        if (c2 >= c4 || c3 >= c5) {
            return;
        }
        HashMap<String, b>[] hashMapArr = this.f162J;
        HashMap<String, b> hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    private static long[] a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
