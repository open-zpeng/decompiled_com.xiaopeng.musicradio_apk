package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: RadioListSignUtil.java */
/* loaded from: classes2.dex */
public class au {
    private static ArrayList<String> a = new ArrayList<>(Arrays.asList(ListSignBean.MUSIC_RADIO_SING_EXTRA, ListSignBean.MUSIC_EXTRA_AISUGEST));
    private static ArrayList<String> b = new ArrayList<>(Arrays.asList(ListSignBean.LISTSIGN_TAGS, ListSignBean.LISTSIGN_ARTIST_RADIO, ListSignBean.LISTSIGN_ALBUM, ListSignBean.LISTSIGN_COLLECT, ListSignBean.LISTSIGN_RANK_MUSIC, ListSignBean.LISTSIGN_RECOMMEN_MUSIC, ListSignBean.LISTSIGN_LOCAL_RM_MUSIC));
    private static ArrayList<String> c = new ArrayList<>(Arrays.asList(ListSignBean.MUSIC_RADIO_SING_EXTRA));
    private static ArrayList<String> d = new ArrayList<>(Arrays.asList(ListSignBean.LISTSIGN_TAGS, ListSignBean.LISTSIGN_ARTIST_RADIO, ListSignBean.LISTSIGN_RANK_MUSIC, ListSignBean.LISTSIGN_RECOMMEN_MUSIC));
    private static ArrayList<String> e = new ArrayList<>(Arrays.asList(ListSignBean.MUSIC_RADIO_SING_EXTRA, ListSignBean.MUSIC_EXTRA_AISUGEST));
    private static ArrayList<String> f = new ArrayList<>(Arrays.asList(ListSignBean.LISTSIGN_TAGS, ListSignBean.LISTSIGN_ARTIST_RADIO, ListSignBean.LISTSIGN_ALBUM, ListSignBean.LISTSIGN_COLLECT));
    private static ArrayList<String> g = new ArrayList<>(Arrays.asList(ListSignBean.MUSIC_RADIO_SING_EXTRA));
    private static ArrayList<String> h = new ArrayList<>(Arrays.asList(ListSignBean.LISTSIGN_RANK_MUSIC, ListSignBean.LISTSIGN_RECOMMEN_MUSIC, ListSignBean.LISTSIGN_LOCAL_RM_MUSIC));

    public static ListSignBean a(long j, String str, int i) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_TAGS);
        listSignBean.setCollectId(j);
        listSignBean.setTag(str);
        listSignBean.setNType(i);
        listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
        return listSignBean;
    }

    public static ListSignBean a(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_ARTIST_RADIO);
        listSignBean.setCollectId(j);
        listSignBean.setTag(str);
        listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
        return listSignBean;
    }

    public static ListSignBean b(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
        return listSignBean;
    }

    public static ListSignBean c(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_USER_ALBUM);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
        return listSignBean;
    }

    public static ListSignBean b(long j, String str, int i) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_RANK_MUSIC);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_RADIO_SING_EXTRA);
        listSignBean.setNType(i);
        return listSignBean;
    }

    public static ListSignBean d(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_LOCAL_RM_MUSIC);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.LOCAL_MUSIC_EXTRA);
        return listSignBean;
    }

    public static ListSignBean e(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_PHONE_MUSIC);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_PHONE_SING_EXTRA);
        return listSignBean;
    }

    public static ListSignBean c(long j, String str, int i) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_PHONE_MUSIC);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setNType(i);
        listSignBean.setExtra(ListSignBean.MUSIC_PHONE_SING_EXTRA);
        return listSignBean;
    }

    public static ListSignBean f(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix(ListSignBean.LISTSIGN_ARTIST_RADIO);
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_SINGER_EXTRA);
        return listSignBean;
    }

    public static ListSignBean g(long j, String str) {
        ListSignBean listSignBean = new ListSignBean();
        listSignBean.setPrefix("listsign_singer_single_music");
        listSignBean.setTag(str);
        listSignBean.setCollectId(j);
        listSignBean.setExtra(ListSignBean.MUSIC_SINGER_EXTRA);
        return listSignBean;
    }

    public static boolean a() {
        ListSignBean listSignBean;
        String c2 = c();
        return (TextUtils.isEmpty(c2) || (listSignBean = (ListSignBean) z.a(c2, (Class<Object>) ListSignBean.class)) == null || !TextUtils.equals(listSignBean.getPrefix(), ListSignBean.LISTSIGN_LOCAL_RM_MUSIC)) ? false : true;
    }

    public static boolean b() {
        ListSignBean listSignBean;
        String c2 = c();
        return (TextUtils.isEmpty(c2) || (listSignBean = (ListSignBean) z.a(c2, (Class<Object>) ListSignBean.class)) == null || !TextUtils.equals(listSignBean.getPrefix(), ListSignBean.LISTSIGN_USB_MUSIC)) ? false : true;
    }

    public static ListSignBean a(MusicRadioItem musicRadioItem) {
        String type = musicRadioItem.getType();
        if (ListSignBean.LISTSIGN_ARTIST_RADIO.equals(type)) {
            return a(musicRadioItem.getArtistId(), musicRadioItem.getTitle());
        }
        if (ListSignBean.LISTSIGN_TAGS.equals(type)) {
            return a(musicRadioItem.getId(), musicRadioItem.getTitle(), musicRadioItem.getRankType());
        }
        if (ListSignBean.LISTSIGN_RECOMMEN_MUSIC.equals(type)) {
            return b(musicRadioItem.getId(), musicRadioItem.getTitle());
        }
        if (ListSignBean.LISTSIGN_USER_ALBUM.equals(type)) {
            return c(musicRadioItem.getId(), musicRadioItem.getTitle());
        }
        if (ListSignBean.LISTSIGN_RANK_MUSIC.equals(type)) {
            return b(musicRadioItem.getId(), musicRadioItem.getTitle(), musicRadioItem.getRankType());
        }
        if (ListSignBean.LISTSIGN_LOCAL_RM_MUSIC.equals(type)) {
            return d(musicRadioItem.getId(), musicRadioItem.getTitle());
        }
        return a(musicRadioItem.getId(), musicRadioItem.getTitle(), musicRadioItem.getRankType());
    }

    private static String c() {
        arf arfVar = (arf) com.xiaopeng.musicradio.service.c.a().b(arf.class);
        if (arfVar != null) {
            return arfVar.getListSign();
        }
        return null;
    }
}
