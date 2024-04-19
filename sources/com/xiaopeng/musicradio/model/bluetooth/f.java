package com.xiaopeng.musicradio.model.bluetooth;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: MetaDataManager.java */
/* loaded from: classes.dex */
public class f {
    public static ArrayList<String> a = new ArrayList<String>() { // from class: com.xiaopeng.musicradio.model.bluetooth.f.1
        {
            add("a-lin");
            add("Li-2c");
        }
    };
    private static final String[] b;
    private final e c = new e();
    private final e d = new e();
    private final String e = com.xiaopeng.musicradio.a.a.getString(f.h.music_unknow_song);
    private final String f = com.xiaopeng.musicradio.a.a.getString(f.h.music_unknow_singer);

    static {
        g gVar = new g();
        Collections.addAll(gVar, "--", " - ", "-", " - ", " — ", "/");
        b = (String[]) gVar.toArray(new String[0]);
    }

    public f() {
        a();
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception e) {
            Log.e("MetaDataManager", "isNotEqualWithPrevious: ", e);
            return false;
        }
    }

    private synchronized boolean b(e eVar) {
        if (eVar.d() == 0 && (d(eVar.b()) || c(eVar.a()))) {
            return false;
        }
        LogUtils.d("MetaDataManager", String.format("isNotEqualWithPreviousInternal2 old:%s, new:%s", this.c.toString(), eVar.toString()));
        String a2 = eVar.a();
        String b2 = eVar.b();
        String c = eVar.c();
        String a3 = this.c.a();
        String b3 = this.c.b();
        this.c.d();
        String[] a4 = a(a2, b2, a3, b3, c);
        String c2 = c(a4[0], this.e);
        String c3 = c(a4[1], this.f);
        if (this.e.equals(c2) && this.f.equals(c3)) {
            c2 = a3;
            c3 = b3;
        }
        if (c2.equals(a3) && c3.equals(b3)) {
            return false;
        }
        String b4 = b(c2);
        String b5 = b(c3);
        Log.d("MetaDataManager", "isNotEqualWithPreviousInternal2: " + c2 + ",,,," + c3 + ",,,," + b4 + ",,,," + b5);
        if (b4 != null && b5 != null && c2.equals(c3) && c2.contains(b4) && c2.contains(a3) && c3.contains(b3)) {
            return false;
        }
        eVar.a(c2);
        eVar.b(c3);
        eVar.a(eVar.d());
        this.c.a(eVar);
        this.d.a(eVar);
        return true;
    }

    public boolean a(String str) {
        return !TextUtils.isEmpty(b(str));
    }

    public boolean a(String str, String str2) {
        String b2 = b(str);
        String b3 = b(str2);
        if (b2 == null || b3 == null) {
            return false;
        }
        String[] b4 = b(str, b2);
        String[] b5 = b(str2, b3);
        return b4[0].trim().equalsIgnoreCase(b5[0].trim()) || b4[1].trim().equalsIgnoreCase(b5[1].trim()) || b4[0].replaceAll(" ", "").contains(b5[1].replaceAll(" ", "")) || b4[1].replaceAll(" ", "").contains(b5[0].replaceAll(" ", ""));
    }

    private boolean c(String str) {
        if (str == null) {
            return true;
        }
        String trim = str.replaceAll("[\\t\\n\\r]", "").trim();
        return TextUtils.isEmpty(trim) || this.e.equalsIgnoreCase(trim);
    }

    private boolean d(String str) {
        if (str == null) {
            return true;
        }
        String trim = str.replaceAll("[\\t\\n\\r]", "").trim();
        return TextUtils.isEmpty(trim) || this.f.equalsIgnoreCase(trim);
    }

    public String[] a(String str, String str2, String str3, String str4, String str5) {
        int i;
        String str6 = str;
        LogUtils.i("MetaDataManager", String.format("processTitleAndArtist title:%s,artist:%s,previousTitle:%s,previousArtist:%s", str6, str2, str3, str4));
        boolean c = c(str) ^ d(str2);
        String b2 = b(str);
        String b3 = b(str2);
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = !TextUtils.isEmpty(str2);
        boolean z3 = !TextUtils.isEmpty(b2);
        boolean z4 = !TextUtils.isEmpty(b3);
        String[] b4 = b(str2, b3);
        String str7 = b4[0];
        String str8 = b4[1];
        String[] b5 = b(str6, b2);
        String str9 = b5[0];
        String str10 = b5[1];
        if (z4) {
            if ((str3.equals(str7) && str4.equals(str8)) || (str3.equals(str8) && str4.equals(str7))) {
                str6 = str3;
                str8 = str4;
                i = 2;
            } else if (str6.equals(str7)) {
                i = 2;
            } else {
                if (!str6.equals(str8) && (!str8.trim().equalsIgnoreCase(str5.trim()) || !" - ".equalsIgnoreCase(b3))) {
                    if (str4.equals(str7)) {
                        str3.contains(str8);
                    } else if (str5.trim().equalsIgnoreCase(str7)) {
                        str6 = str7;
                        i = 2;
                    } else if (!str5.trim().equalsIgnoreCase(str8)) {
                        if (!TextUtils.equals(b3, "/")) {
                            str6 = str2;
                            str8 = str2;
                            i = 2;
                        }
                        str8 = str2;
                    }
                    str6 = str8;
                }
                str8 = str7;
            }
            String[] strArr = new String[i];
            strArr[0] = str6;
            strArr[1] = str8;
            Log.i("MetaDataManager", "processTitleAndArtist: processed = " + Arrays.toString(strArr));
            return strArr;
        }
        if (!c || TextUtils.isEmpty(str5)) {
            if (z3) {
                if (!z2) {
                    str6 = str10;
                    str8 = str9;
                    i = 2;
                } else if (str2.trim().equalsIgnoreCase(str9.trim())) {
                    str6 = str10;
                    str8 = str2;
                    i = 2;
                } else if (str2.trim().equalsIgnoreCase(str10.trim())) {
                    str6 = str9;
                    str8 = str2;
                    i = 2;
                }
            }
            str8 = str2;
        } else {
            String b6 = b(str5);
            if (!TextUtils.isEmpty(b6)) {
                String[] b7 = b(str5, b6);
                String str11 = b7[1];
                str8 = b7[0];
                str6 = str11;
            } else if (!TextUtils.isEmpty(str2)) {
                str6 = str5;
                str8 = str2;
            } else if (z && z3) {
                str8 = str6;
            } else if (z2 && z4) {
                str6 = str2;
                str8 = str2;
            } else {
                str8 = str2;
            }
            i = 2;
        }
        String[] strArr2 = new String[i];
        strArr2[0] = str6;
        strArr2[1] = str8;
        Log.i("MetaDataManager", "processTitleAndArtist: processed = " + Arrays.toString(strArr2));
        return strArr2;
        i = 2;
        String[] strArr22 = new String[i];
        strArr22[0] = str6;
        strArr22[1] = str8;
        Log.i("MetaDataManager", "processTitleAndArtist: processed = " + Arrays.toString(strArr22));
        return strArr22;
    }

    public String[] b(String str, String str2) {
        int lastIndexOf;
        String[] strArr = {"", ""};
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (lastIndexOf = str.lastIndexOf(str2)) != -1) {
            strArr[0] = str.substring(0, lastIndexOf).trim();
            strArr[1] = str.substring(lastIndexOf + str2.length()).trim();
        }
        return strArr;
    }

    public String b(String str) {
        String str2;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Iterator<String> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (lowerCase.contains(next.toLowerCase())) {
                    lowerCase = lowerCase.replace(next.toLowerCase(), "");
                    break;
                }
            }
            String[] strArr = b;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str2 = null;
                    break;
                }
                str2 = strArr[i];
                if (lowerCase.contains(str2)) {
                    break;
                }
                i++;
            }
            if (str.equals(str2)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    private String c(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public synchronized void a() {
        this.c.f();
        this.c.a(this.e);
        this.c.b(this.f);
    }

    public synchronized e b() {
        e eVar;
        eVar = new e();
        eVar.a(this.c);
        return eVar;
    }
}
