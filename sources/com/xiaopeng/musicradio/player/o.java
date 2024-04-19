package com.xiaopeng.musicradio.player;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
/* compiled from: PlayerViewProxyFactory.java */
/* loaded from: classes2.dex */
public class o implements aew {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aew
    public aev a(String str) {
        char c;
        Log.i("PlayerViewProxyFactory", "createViewProxy: " + str);
        switch (str.hashCode()) {
            case -2020127440:
                if (str.equals("PlayerActivity")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -2018184235:
                if (str.equals("ProgramPlayerFragment")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1406690339:
                if (str.equals("PlayerCommonViewProxy")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1384359019:
                if (str.equals("BtMusicPlayerViewProxy")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1143550538:
                if (str.equals("MusicPlayerFragment")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1124854122:
                if (str.equals("PlayerCommonLayout")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1076331018:
                if (str.equals("MusicLrcProxy")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -972040461:
                if (str.equals("ProgramPlayListViewProxy")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -880353169:
                if (str.equals("NetRadioPlayerFragment")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -258262012:
                if (str.equals("BtMusicPlayerFragment")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -107373084:
                if (str.equals("ProgramPlayerViewProxy")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -27417792:
                if (str.equals("ProgramPlayListLayout")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 9005256:
                if (str.equals("PlayerViewProxy")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 271346713:
                if (str.equals("NetRadioPlayListViewProxy")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 805651594:
                if (str.equals("NetRadioPlayerViewProxy")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 847215905:
                if (str.equals("MusicPlayListLayout")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 863549602:
                if (str.equals("MusicLrcLayout")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1110413274:
                if (str.equals("NetRadioPlayListLayout")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1236467747:
                if (str.equals("MusicPlayerViewProxy")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1306538878:
                if (str.equals("Small_Player_Panel")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1476884737:
                if (str.equals("SmallPlayerViewProxy")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1968809330:
                if (str.equals("MusicPlayListViewProxy")) {
                    c = '\t';
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
                return new avm(com.xiaopeng.musicradio.a.a(), str);
            case 2:
            case 3:
                return new avl(com.xiaopeng.musicradio.a.a(), str);
            case 4:
            case 5:
                return new com.xiaopeng.musicradio.music.player.view.n(com.xiaopeng.musicradio.a.a(), str);
            case 6:
            case 7:
                return new avk(com.xiaopeng.musicradio.a.a(), str);
            case '\b':
            case '\t':
                return new com.xiaopeng.musicradio.music.player.view.l(com.xiaopeng.musicradio.a.a(), str);
            case '\n':
            case 11:
                return new com.xiaopeng.musicradio.music.player.view.j(com.xiaopeng.musicradio.a.a(), str);
            case '\f':
            case '\r':
                return new com.xiaopeng.musicradio.program.player.view.f(com.xiaopeng.musicradio.a.a(), str);
            case 14:
            case 15:
                return new com.xiaopeng.musicradio.netradio.player.view.g(com.xiaopeng.musicradio.a.a(), str);
            case 16:
            case 17:
                return new com.xiaopeng.musicradio.music.player.view.a(com.xiaopeng.musicradio.a.a(), str);
            case 18:
            case 19:
                return new com.xiaopeng.musicradio.program.player.view.d(com.xiaopeng.musicradio.a.a(), str);
            case 20:
            case 21:
                return new com.xiaopeng.musicradio.netradio.player.view.e(com.xiaopeng.musicradio.a.a(), str);
            default:
                return null;
        }
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("Small_Player_Panel", "PlayerActivity", "MusicPlayerFragment", "PlayerCommonLayout", "MusicPlayListLayout", "MusicLrcLayout", "ProgramPlayerFragment", "NetRadioPlayerFragment", "BtMusicPlayerFragment", "ProgramPlayListLayout", "NetRadioPlayListLayout", "SmallPlayerViewProxy", "PlayerViewProxy", "MusicPlayerViewProxy", "PlayerCommonViewProxy", "MusicPlayListViewProxy", "MusicLrcProxy", "ProgramPlayerViewProxy", "NetRadioPlayerViewProxy", "BtMusicPlayerViewProxy", "ProgramPlayListViewProxy", "NetRadioPlayListViewProxy");
    }
}
