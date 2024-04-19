package com.xiaopeng.musicradio.model.dui;

import android.util.Log;
import android.util.SparseArray;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.speech.protocol.query.music.bean.PlayInfo;
/* compiled from: DuiMusicQueryModel.java */
/* loaded from: classes.dex */
public class g extends bgo implements com.xiaopeng.speech.protocol.query.music.a {
    private SparseArray<a> b = new SparseArray<>();

    /* compiled from: DuiMusicQueryModel.java */
    /* loaded from: classes.dex */
    public interface a {
        String a();

        void a(PlayInfo playInfo);

        String b();

        String c();

        boolean d();

        boolean e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DuiMusicQueryModel.java */
    /* loaded from: classes.dex */
    public static class b {
        static final g a = new g();
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean h() {
        return false;
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean m() {
        return false;
    }

    public static g a() {
        return b.a;
    }

    public void a(int i, a aVar) {
        this.b.put(i, aVar);
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public String b() {
        Log.i("DuiMusicQueryModel", "getPlayInfo: =========");
        PlayInfo playInfo = new PlayInfo();
        if (g()) {
            switch (aei.a().c()) {
                case 0:
                case 2:
                    this.b.get(0).a(playInfo);
                    break;
                case 1:
                case 5:
                default:
                    playInfo.setError(20002);
                    break;
                case 3:
                case 7:
                    this.b.get(3).a(playInfo);
                    break;
                case 4:
                    playInfo.setPlayType(3);
                    break;
                case 6:
                    playInfo.setPlayType(4);
                    break;
            }
        } else {
            playInfo.setError(20001);
        }
        return z.a(playInfo);
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public String c() {
        Log.i("DuiMusicQueryModel", "getPlayTitle================");
        switch (aei.a().c()) {
            case 0:
            case 2:
                return this.b.get(0).a();
            case 1:
            case 4:
            case 5:
            default:
                return "";
            case 3:
            case 7:
                return this.b.get(3).a();
            case 6:
                return this.b.get(6).a();
        }
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public String d() {
        Log.i("DuiMusicQueryModel", "getPlayArtist: ============= ");
        int c = aei.a().c();
        if (c != 0) {
            if (c != 7) {
                switch (c) {
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        return "";
                }
            }
            return this.b.get(3).b();
        }
        return this.b.get(0).b();
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public String e() {
        Log.i("DuiMusicQueryModel", "getPlayAlbum: ============ ");
        int c = aei.a().c();
        if (c != 0) {
            if (c != 7) {
                switch (c) {
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        return "";
                }
            }
            return this.b.get(3).c();
        }
        return this.b.get(0).c();
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public int f() {
        switch (aei.a().d()) {
            case 0:
            case 2:
                return 1;
            case 1:
            case 5:
            default:
                return 0;
            case 3:
            case 7:
                return 2;
            case 4:
                return 3;
            case 6:
                return 4;
        }
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean g() {
        aek e = aei.a().e();
        LogUtils.i("DuiMusicQueryModel", "call isPlaying");
        if (e != null) {
            return e.getPlayState() == 2 || (ags.a().j() && !com.xiaopeng.musicradio.utils.f.e());
        }
        return false;
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean a(int i) {
        switch (i) {
            case 0:
                return true;
            case 1:
                return this.b.get(0).d();
            case 2:
                return this.b.get(3).d();
            default:
                return true;
        }
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean b(int i) {
        Log.i("DuiMusicQueryModel", "isCollectListEmpty: " + i);
        if (i != 4) {
            switch (i) {
                case 0:
                default:
                    return true;
                case 1:
                    return this.b.get(0).e();
                case 2:
                    return this.b.get(3).e();
            }
        }
        return this.b.get(6).e();
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean i() {
        arf arfVar = (arf) com.xiaopeng.musicradio.service.c.a().b(arf.class);
        if (arfVar != null) {
            return arfVar.isBtConnect();
        }
        return false;
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean j() {
        boolean d = apx.a().d();
        LogUtils.i("DuiMusicQueryModel", "isKuGouAuthed:" + d);
        return d;
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public int k() {
        bas basVar = (bas) com.xiaopeng.musicradio.service.c.a().b(bas.class);
        if (basVar != null) {
            return basVar.getUsbState4XiaoP();
        }
        return 1;
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean l() {
        int c = aei.a().c();
        if (c != 0) {
            if (c != 6) {
                switch (c) {
                    case 3:
                        awh awhVar = (awh) com.xiaopeng.musicradio.service.c.a().b(awh.class);
                        if (awhVar != null) {
                            return awhVar.isCanCollected();
                        }
                        return true;
                    case 4:
                        return true;
                }
            }
            aub aubVar = (aub) com.xiaopeng.musicradio.service.c.a().b(aub.class);
            if (aubVar != null) {
                return aubVar.isCanCollected();
            }
            return false;
        }
        arf arfVar = (arf) com.xiaopeng.musicradio.service.c.a().b(arf.class);
        if (arfVar != null) {
            return arfVar.isCanCollected();
        }
        return false;
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean n() {
        boolean d = apx.a().d();
        LogUtils.i("DuiMusicQueryModel", "isMusicAccountLogin:" + d);
        return d;
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean o() {
        arf arfVar = (arf) com.xiaopeng.musicradio.service.c.a().b(arf.class);
        if (arfVar != null) {
            boolean isQualityPageOpend = arfVar.isQualityPageOpend();
            LogUtils.i("DuiMusicQueryModel", "isQualityPageOpend:" + isQualityPageOpend);
            return isQualityPageOpend;
        }
        LogUtils.i("DuiMusicQueryModel", "isQualityPageOpend:null");
        return false;
    }

    @Override // com.xiaopeng.speech.protocol.query.music.a
    public boolean p() {
        LogUtils.i("DuiMusicQueryModel", "isXimalayaAccountLogin:" + aqh.a().e());
        if (2 == w.f()) {
            return aqh.a().e();
        }
        return false;
    }
}
