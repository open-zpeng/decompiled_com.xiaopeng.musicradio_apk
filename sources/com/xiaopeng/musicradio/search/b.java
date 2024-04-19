package com.xiaopeng.musicradio.search;

import com.xiaopeng.musicradio.search.result.mix.view.c;
import java.util.Arrays;
import java.util.List;
/* compiled from: SearchViewProxyFactory.java */
/* loaded from: classes2.dex */
public class b implements aew {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aew
    public aev a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1877029702:
                if (str.equals("SearchNetAlbum")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1861655994:
                if (str.equals("SearchNetRadio")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1692341882:
                if (str.equals("SearchResultCollectionViewProxy")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1110716794:
                if (str.equals("SearchResultNetRadioViewProxy")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -877543734:
                if (str.equals("SearchResultProgramViewProxy")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -528786305:
                if (str.equals("SearchResultAlbumViewProxy")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -337104534:
                if (str.equals("SearchNetSong")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -54749389:
                if (str.equals("SearchNetCollection")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 127667047:
                if (str.equals("SearchNetMix")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 671745551:
                if (str.equals("SearchNetProgram")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 967533682:
                if (str.equals("SearchResultMixViewProxy")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1145657376:
                if (str.equals("SearchMainHome")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1339957551:
                if (str.equals("SearchResultSongViewProxy")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1505718974:
                if (str.equals("HomeMainSearchFragmentProxy")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return new aze(com.xiaopeng.musicradio.a.a(), str);
            case 2:
            case 3:
                return new azm(com.xiaopeng.musicradio.a.a(), str);
            case 4:
            case 5:
                return new aym(com.xiaopeng.musicradio.a.a(), str);
            case 6:
            case 7:
                return new ayp(com.xiaopeng.musicradio.a.a(), str);
            case '\b':
            case '\t':
                return new c(com.xiaopeng.musicradio.a.a(), str);
            case '\n':
            case 11:
                return new azi(com.xiaopeng.musicradio.a.a(), str);
            case '\f':
            case '\r':
                return new com.xiaopeng.musicradio.search.home.view.a(com.xiaopeng.musicradio.a.a(), str);
            default:
                return null;
        }
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("SearchNetRadio", "SearchNetSong", "SearchNetAlbum", "SearchNetProgram", "SearchNetCollection", "SearchNetMix", "SearchMainHome", "SearchResultNetRadioViewProxy", "SearchResultSongViewProxy", "SearchResultAlbumViewProxy", "SearchResultCollectionViewProxy", "SearchResultMixViewProxy", "SearchResultProgramViewProxy", "HomeMainSearchFragmentProxy");
    }
}
