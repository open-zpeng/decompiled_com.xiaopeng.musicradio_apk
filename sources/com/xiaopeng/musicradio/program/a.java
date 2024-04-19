package com.xiaopeng.musicradio.program;

import com.xiaopeng.musicradio.program.category.view.h;
import com.xiaopeng.musicradio.program.category.view.j;
import com.xiaopeng.musicradio.program.choice.view.guesslike.c;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProgramViewProxyFactory.java */
/* loaded from: classes2.dex */
public class a implements aew {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aew
    public aev a(String str) {
        char c;
        switch (str.hashCode()) {
            case -2057455267:
                if (str.equals("ProgramChoicePannel")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1854581569:
                if (str.equals("ProgramHistoryActivity")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1563525476:
                if (str.equals("ProgramAlbumDetail")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1214963756:
                if (str.equals("ProgramGuessLikeLayout")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -898090276:
                if (str.equals("ProgramCommonList_GuessLike")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -860653208:
                if (str.equals("GuessLikeListManagerViewProxy")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -495875583:
                if (str.equals("ReadingCategoriesViewProxy")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -365412752:
                if (str.equals("ProgramCommonList_Category")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -363351866:
                if (str.equals("RankListManagerViewProxy")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -164014434:
                if (str.equals("ProgramCommonList_Rank")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -61159169:
                if (str.equals("RdDetailManagerViewProxy")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 462441978:
                if (str.equals("ProgramCategoryPannel")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 517343296:
                if (str.equals("BannerItemLayoutViewProxy")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 838581590:
                if (str.equals("ProgramChoiceMgrViewProxy")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1142507198:
                if (str.equals("ProgramHistoryProxy")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1469790122:
                if (str.equals("GuessLikeManagerViewProxy")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1735069540:
                if (str.equals("ProgramChoiceBannerItem")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2061504333:
                if (str.equals("CategoryListViewProxy")) {
                    c = 7;
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
                return new c(com.xiaopeng.musicradio.a.a(), str);
            case 2:
            case 3:
                return new h(com.xiaopeng.musicradio.a.a(), str);
            case 4:
            case 5:
                return new j(com.xiaopeng.musicradio.a.a(), str);
            case 6:
            case 7:
                return new com.xiaopeng.musicradio.program.category.view.b(com.xiaopeng.musicradio.a.a(), str);
            case '\b':
            case '\t':
                return new com.xiaopeng.musicradio.program.choice.view.guesslike.b(com.xiaopeng.musicradio.a.a(), str);
            case '\n':
            case 11:
                return new axs(com.xiaopeng.musicradio.a.a(), str);
            case '\f':
            case '\r':
                return new com.xiaopeng.musicradio.program.choice.view.banner.a(com.xiaopeng.musicradio.a.a(), str);
            case 14:
            case 15:
                return new awv(com.xiaopeng.musicradio.a.a(), str);
            case 16:
            case 17:
                return new com.xiaopeng.musicradio.program.history.view.c(com.xiaopeng.musicradio.a.a(), str);
            default:
                return null;
        }
    }

    @Override // defpackage.aew
    public List<String> a() {
        return Arrays.asList("ProgramGuessLikeLayout", "ProgramAlbumDetail", "ProgramCategoryPannel", "ProgramCommonList_Category", "ProgramCommonList_GuessLike", "ProgramCommonList_Rank", "ProgramChoicePannel", "ProgramChoiceBannerItem", "ProgramHistoryActivity", "GuessLikeManagerViewProxy", "RdDetailManagerViewProxy", "ReadingCategoriesViewProxy", "CategoryListViewProxy", "GuessLikeListManagerViewProxy", "RankListManagerViewProxy", "BannerItemLayoutViewProxy", "ProgramChoiceMgrViewProxy", "ProgramHistoryProxy");
    }
}
