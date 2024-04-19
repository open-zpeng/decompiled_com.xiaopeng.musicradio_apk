package com.xiaopeng.musicradio.service;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.utils.ab;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class MusicQqService extends a implements are {
    private static final String TAG = "MusicQqService";

    @Override // com.xiaopeng.musicradio.service.a
    protected void a() {
    }

    @Override // defpackage.are
    public void checkoutDataCollect(int i) {
        anv.a().b();
        anc.a().a(i);
    }

    @Override // defpackage.are
    public void updateLocalLove(Object obj) {
        if (obj instanceof MusicInfo) {
            apb.a().b((MusicInfo) obj);
        }
    }

    @Override // defpackage.are
    public boolean isLocalLoveMusic(Object obj) {
        if (obj instanceof MusicInfo) {
            return apb.a().c((MusicInfo) obj);
        }
        return false;
    }

    @Override // defpackage.are
    public int getCollectedMusicCount() {
        return anc.a().a(aqh.a().b());
    }

    @Override // defpackage.are
    public void updateLove(Object obj, boolean z) {
        if (!z) {
            if (obj instanceof List) {
                apb.a().a((List) obj, false);
            } else if (obj instanceof MusicInfo) {
                apb.a().b((MusicInfo) obj, false);
            }
        } else if (obj instanceof List) {
            LinkedList linkedList = new LinkedList();
            for (MusicSongBean musicSongBean : (List) obj) {
                linkedList.add(ab.a(musicSongBean));
            }
            apb.a().a((List<MusicInfo>) linkedList, false);
        }
    }

    @Override // defpackage.are
    public boolean isCustomAlbum(Object obj) {
        if (obj instanceof MusicRadioItem) {
            return anu.a().b(((MusicRadioItem) obj).getId());
        }
        if (obj instanceof Long) {
            return anu.a().b(((Long) obj).longValue());
        }
        return false;
    }

    public <T> T getCachedCollectedMusicList() {
        anv.a().d();
        return (T) anv.a().a(50, true);
    }
}
