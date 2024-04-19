package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.Locale;
/* compiled from: ListSignUtil.java */
/* loaded from: classes2.dex */
public class ad {
    private static SparseArray<String> a = new SparseArray<>();

    public static String a(int i, int i2, int i3) {
        return a(ListSignBean.LISTSIGN_STYLE, i2, i3, "MusicMainPresenter", i);
    }

    public static String a(int i) {
        return a(ListSignBean.LISTSIGN_COLLECT, i, 0, "MusicMainCollectPresenter", 0);
    }

    public static String a(long j, int i) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_BILLBOARD);
        listSignBean.setCollectId(j);
        listSignBean.setNType(0);
        listSignBean.setExtra("MusicMainRankPresenter_" + i);
        return listSignBean.toJson();
    }

    private static String a(String str, int i, int i2, String str2, int i3) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.prefix = str;
        listSignBean.nType = i2;
        listSignBean.collectId = i;
        listSignBean.extra = String.format(Locale.getDefault(), "%s_%d", str2, Integer.valueOf(i3));
        return listSignBean.toJson();
    }

    public static boolean a(String str) {
        ListSignBean listSignBean;
        return (TextUtils.isEmpty(str) || (listSignBean = (ListSignBean) z.a(str, (Class<Object>) ListSignBean.class)) == null || !TextUtils.equals(listSignBean.getPrefix(), ListSignBean.LISTSIGN_LOCAL_RM_MUSIC)) ? false : true;
    }

    public static boolean b(String str) {
        ListSignBean listSignBean;
        return (TextUtils.isEmpty(str) || (listSignBean = (ListSignBean) z.a(str, (Class<Object>) ListSignBean.class)) == null || !TextUtils.equals(listSignBean.getPrefix(), ListSignBean.LISTSIGN_USB_MUSIC)) ? false : true;
    }

    public static ListSignBean a(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_USB_MUSIC);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.USB_MUSIC_EXTRA);
        return listSignBean;
    }

    public static ListSignBean a(long j) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix("headspeech");
        listSignBean.setCollectId(j);
        return listSignBean;
    }

    public static ListSignBean b(long j) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix("headspeech");
        listSignBean.setCollectId(j);
        return listSignBean;
    }

    public static boolean a(String str, long j) {
        if (TextUtils.isEmpty(str) || !str.contains("headspeech")) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(j);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return str.contains(sb.toString());
    }

    public static boolean b(String str, long j) {
        if (TextUtils.isEmpty(str) || !str.contains("headspeech")) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(j);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return str.contains(sb.toString());
    }

    public static String b(int i) {
        String str = a.get(i);
        if (str != null) {
            return str;
        }
        ListSignBean listSignBean = null;
        if (i == 10) {
            listSignBean = new ListSignBean();
            listSignBean.setPrefix(ListSignBean.LISTSIGN_HISTORY_MUSIC);
        } else if (i == 20) {
            listSignBean = new ListSignBean();
            listSignBean.setPrefix(ListSignBean.LISTSIGN_BLUE_MUSIC);
        } else if (i == 36) {
            listSignBean = new ListSignBean();
            listSignBean.setPrefix(ListSignBean.LISTSIGN_USER_ALBUM);
        } else if (i == 50) {
            listSignBean = new ListSignBean();
            listSignBean.setPrefix(ListSignBean.LISTSIGN_COLLECT_MUSIC);
        }
        String str2 = "";
        if (listSignBean != null) {
            listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
            str2 = listSignBean.toJson();
        }
        a.put(i, str2);
        return str2;
    }
}
