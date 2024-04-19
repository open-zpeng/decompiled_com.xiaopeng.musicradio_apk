package com.xiaopeng.musicradio.proxy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Player;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
/* compiled from: MusicCommonProxy.java */
/* loaded from: classes2.dex */
public class b extends aeu<a, MusicCommonPresenter> implements a {
    public b(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public MusicCommonPresenter g() {
        return new MusicCommonPresenter();
    }

    @Override // com.xiaopeng.musicradio.proxy.a
    public void a(final int i, final int i2) {
        Log.i("MusicCommonProxy", "refreshPlayState: " + i + " playState = " + i2);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.proxy.b.1
            @Override // java.lang.Runnable
            public void run() {
                Player.MediaPlayState.a b = Player.MediaPlayState.newBuilder().a(i).b(i2);
                Log.i("MusicCommonProxy", "run: autioType = " + i + " playState = " + i2);
                int i3 = i;
                if (i3 == 0) {
                    MusicInfo d = apk.i().d();
                    if (d != null) {
                        String x = apk.i().x();
                        if (!TextUtils.isEmpty(x)) {
                            ListSignBean listSignBean = (ListSignBean) z.a(x, (Class<Object>) ListSignBean.class);
                            if (listSignBean != null) {
                                b.a(ByteString.copyFrom(Player.MusicPlayParams.newBuilder().a(be.e(d.getHash())).a(d.getAlbumId()).b(be.e(listSignBean.getPrefix())).b(listSignBean.getCollectId()).build().toByteArray()));
                            } else {
                                b.a(ByteString.copyFrom(Player.MusicPlayParams.newBuilder().a(be.e(d.getHash())).a(d.getAlbumId()).build().toByteArray()));
                            }
                        }
                    }
                } else if (i3 != 6) {
                    switch (i3) {
                        case 2:
                            BtMusicBean d2 = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
                            if (d2 != null) {
                                Player.BtMusicPlayParams build = Player.BtMusicPlayParams.newBuilder().a(be.e(d2.getUuid())).build();
                                Log.i("MusicCommonProxy", "run: btmusic hash = " + build.getHash());
                                b.a(ByteString.copyFrom(build.toByteArray()));
                                break;
                            }
                            break;
                        case 3:
                            ProgramBean r = axn.i().r();
                            if (r != null) {
                                Player.ProgramPlayParams build2 = Player.ProgramPlayParams.newBuilder().a(r.getTrackId()).b(r.getAlbumId()).c(r.getChannelId()).build();
                                Log.i("MusicCommonProxy", "run: program programId = " + build2.getTrackId());
                                b.a(ByteString.copyFrom(build2.toByteArray()));
                                break;
                            }
                            break;
                    }
                } else {
                    NetRadioProgramInfo d3 = aps.i().d();
                    if (d3 != null && d3.getParentInfo() != null) {
                        Player.NetRadioPlayParams build3 = Player.NetRadioPlayParams.newBuilder().a(d3.getParentInfo().getId()).b(d3.getId()).a(be.e(d3.getStartTime())).b(be.e(d3.getDayOfWeek())).build();
                        Log.i("MusicCommonProxy", "run: netradio radioId = " + build3.getRadioId());
                        b.a(ByteString.copyFrom(build3.toByteArray()));
                    }
                }
                b.this.a("MusicCommonProxy_common_play_updatestate", (AbstractMessageLite) b.build());
            }
        });
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("MusicCommonProxy", "monoMessage: " + str);
        if ("getPlayState".equals(str)) {
            ((MusicCommonPresenter) this.c).c();
        } else if ("loveMusic".equals(str)) {
            MusicInfo a = bhx.a(bArr);
            if (a != null) {
                ((MusicCommonPresenter) this.c).a(a);
            }
        } else if ("loveMusicSongBean".equals(str)) {
            MusicSongBean b = bhx.b(bArr);
            if (b != null) {
                ((MusicCommonPresenter) this.c).a(b);
            }
        } else if ("loveCollect".equals(str)) {
            MusicRadioItem e = bhx.e(bArr);
            if (e != null) {
                ((MusicCommonPresenter) this.c).a(e);
            }
        } else if ("LoveAlbum".equals(str)) {
            RdAlbumBean g = bhx.g(bArr);
            if (g != null) {
                ((MusicCommonPresenter) this.c).a(g);
            }
        } else if ("loveNetRadio".equals(str)) {
            ((MusicCommonPresenter) this.c).d();
        } else if ("audioLocation".equals(str)) {
            try {
                Common.IntParam parseFrom = Common.IntParam.parseFrom(bArr);
                Log.i("MusicCommonProxy", "monoMessage: audioLocation = " + parseFrom.getParam());
                MediaCenterModel.getInstance().setShareEvent(parseFrom.getParam());
            } catch (Exception e2) {
                Log.e("MusicCommonProxy", "monoMessage: ", e2);
            }
        } else if ("wxLoginTts".equals(str)) {
            acz.a().a(this.a.getString(f.h.text_wx_qrcode_login_tts));
        } else if ("qqLoginTts".equals(str)) {
            acz.a().a(this.a.getString(f.h.text_qq_qrcode_login_tts));
        } else if ("xmlyLoginTts".equals(str)) {
            acz.a().a(this.a.getString(f.h.text_xmly_qrcode_login_tts));
        }
    }

    @Override // com.xiaopeng.musicradio.proxy.a
    public void a(String str) {
        a("MusicCommonProxy_common_showtoast", (AbstractMessageLite) Common.StringParam.newBuilder().a(str).build());
    }

    @Override // com.xiaopeng.musicradio.proxy.a
    public void b(String str) {
        a("MusicCommonProxy_common_showxmlydialog", (AbstractMessageLite) Common.StringParam.newBuilder().a(str).build());
    }

    @Override // com.xiaopeng.musicradio.proxy.a
    public void a(int i) {
        a("MusicCommonProxy_common_changeAuioType", (AbstractMessageLite) Common.IntParam.newBuilder().a(i).build());
    }
}
