package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.mine.collect.music.view.b;
import java.util.Arrays;
import java.util.List;
/* compiled from: MineViewProxyFactory.java */
/* renamed from: ahs  reason: default package */
/* loaded from: classes2.dex */
public class ahs implements aew {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aew
    public aev a(String str) {
        char c;
        LogUtils.i("MineViewProxyFactory", "createViewProxy:" + str);
        switch (str.hashCode()) {
            case -1625864787:
                if (str.equals("CollectedMusicViewProxy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1567897665:
                if (str.equals("MusicMineHistoryNetRadioView")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1531345875:
                if (str.equals("MusicMineHistoryProgramView")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1519247155:
                if (str.equals("HistoryNetRadioActivityProxy")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1461622621:
                if (str.equals("CollectedAlbumViewProxy")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1333943208:
                if (str.equals("MusicMineCollectedProgramView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1102237937:
                if (str.equals("HistoryProgramActivityProxy")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -794036577:
                if (str.equals("HistoryProgramActivity")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -691466621:
                if (str.equals("MusicMineCollectedAlbumView")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -636883655:
                if (str.equals("HistoryProgramViewProxy")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -550784199:
                if (str.equals("MusicMineCollectedMusicView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -442667819:
                if (str.equals("MinePlaylistFragment")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -379258039:
                if (str.equals("CollectProgramActivity")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -254789704:
                if (str.equals("HistoryMusicViewProxy")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -90547538:
                if (str.equals("HistoryAlbumViewProxy")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 234073524:
                if (str.equals("CollectAlbumActivity")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 256617716:
                if (str.equals("MusicMineCollectedNetRadioView")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 314921454:
                if (str.equals("CollectedProgramViewProxy")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 380952472:
                if (str.equals("MusicMineHistoryAlbumView")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 467411470:
                if (str.equals("HistoryMusicActivityProxy")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 491772420:
                if (str.equals("HistoryAlbumActivityProxy")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 513926436:
                if (str.equals("CollectMusicActivityProxy")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 521634894:
                if (str.equals("MusicMineHistoryMusicView")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 538287386:
                if (str.equals("CollectAlbumActivityProxy")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 609060490:
                if (str.equals("HistoryAlbumActivity")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 644417386:
                if (str.equals("CollectMusicActivity")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 648971429:
                if (str.equals("CollectProgramActivityProxy")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 880122018:
                if (str.equals("MineEventViewProxy")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1019404352:
                if (str.equals("HistoryMusicActivity")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1228635639:
                if (str.equals("CollectNetRadioActivityProxy")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1488995556:
                if (str.equals("MinePlaylistViewProxy")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 1495965666:
                if (str.equals("CollectedNetRadioViewProxy")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1518106671:
                if (str.equals("MineManagerViewProxy")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1792198359:
                if (str.equals("CollectNetradioActivity")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1818965569:
                if (str.equals("HistoryNetradioActivity")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 2054778359:
                if (str.equals("HistoryNetRadioViewProxy")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 2089789607:
                if (str.equals("MineCollectFragment")) {
                    c = 0;
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
                return new aid(a.a(), str);
            case 1:
            case 2:
                return new b(a.a(), str);
            case 3:
            case 4:
                return new com.xiaopeng.musicradio.mine.collect.music.view.a(a.a(), str);
            case 5:
            case 6:
                return new com.xiaopeng.musicradio.mine.collect.album.view.b(a.a(), str);
            case 7:
            case '\b':
                return new com.xiaopeng.musicradio.mine.collect.album.view.a(a.a(), str);
            case '\t':
            case '\n':
                return new com.xiaopeng.musicradio.mine.collect.program.view.b(a.a(), str);
            case 11:
            case '\f':
                return new com.xiaopeng.musicradio.mine.collect.program.view.a(a.a(), str);
            case '\r':
            case 14:
                return new com.xiaopeng.musicradio.mine.collect.netradio.view.b(a.a(), str);
            case 15:
            case 16:
                return new com.xiaopeng.musicradio.mine.collect.netradio.view.a(a.a(), str);
            case 17:
            case 18:
                return new com.xiaopeng.musicradio.mine.history.music.view.b(a.a(), str);
            case 19:
            case 20:
                return new com.xiaopeng.musicradio.mine.history.music.view.a(a.a(), str);
            case 21:
            case 22:
                return new com.xiaopeng.musicradio.mine.history.album.view.b(a.a(), str);
            case 23:
            case 24:
                return new com.xiaopeng.musicradio.mine.history.album.view.a(a.a(), str);
            case 25:
            case 26:
                return new com.xiaopeng.musicradio.mine.history.program.view.b(a.a(), str);
            case 27:
            case 28:
                return new com.xiaopeng.musicradio.mine.history.program.view.a(a.a(), str);
            case 29:
            case 30:
                return new com.xiaopeng.musicradio.mine.history.netradio.view.b(a.a(), str);
            case 31:
            case ' ':
                return new com.xiaopeng.musicradio.mine.history.netradio.view.a(a.a(), str);
            case '!':
            case '\"':
                return new alu(a.a(), str);
            case '#':
                return new ali(a.a(), str);
            case '$':
                return new alk(a.a(), str);
            default:
                return null;
        }
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("MineCollectFragment", "MusicMineCollectedMusicView", "MusicMineCollectedAlbumView", "MusicMineCollectedProgramView", "MusicMineCollectedNetRadioView", "MusicMineHistoryMusicView", "MusicMineHistoryAlbumView", "MusicMineHistoryProgramView", "MusicMineHistoryNetRadioView", "MinePlaylistFragment", "CollectMusicActivity", "HistoryMusicActivity", "CollectAlbumActivity", "HistoryAlbumActivity", "CollectProgramActivity", "HistoryProgramActivity", "CollectNetradioActivity", "HistoryNetradioActivity", "CollectedMusicViewProxy", "CollectedAlbumViewProxy", "CollectedProgramViewProxy", "CollectedNetRadioViewProxy", "HistoryMusicViewProxy", "HistoryAlbumViewProxy", "HistoryProgramViewProxy", "HistoryNetRadioViewProxy", "MinePlaylistViewProxy", "CollectMusicActivityProxy", "CollectAlbumActivityProxy", "CollectProgramActivityProxy", "CollectNetRadioActivityProxy", "HistoryMusicActivityProxy", "HistoryAlbumActivityProxy", "HistoryProgramActivityProxy", "HistoryNetRadioActivityProxy", "MineEventViewProxy", "MineManagerViewProxy");
    }
}
