package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicArtistBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.mix.view.MixItemLayout;
import java.util.List;
/* compiled from: SongSearchBinder.java */
/* renamed from: ayv  reason: default package */
/* loaded from: classes2.dex */
public class ayv extends ayr<azb, azv> {
    @Override // defpackage.ayr
    protected int a() {
        return 6;
    }

    @Override // defpackage.ayr
    protected int b() {
        return 6;
    }

    @Override // defpackage.ayr
    protected int c() {
        return 60;
    }

    @Override // defpackage.ayr
    protected int d() {
        return 12;
    }

    @Override // defpackage.ayr
    protected int e() {
        return 860;
    }

    @Override // defpackage.ayr
    protected int f() {
        return -2;
    }

    public ayv(axz axzVar) {
        super(axzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayr
    /* renamed from: a */
    public azv b(Context context) {
        return new azv(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayr
    public void a(MixItemLayout mixItemLayout, final azb azbVar) {
        int childCount = mixItemLayout.getContainerLayout().getChildCount();
        mixItemLayout.setTitle(a.f.tab_search_song);
        mixItemLayout.setPlayAllListener(new View.OnClickListener() { // from class: ayv.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ayv.this.a == null || azbVar.b().size() <= 0) {
                    return;
                }
                ayv.this.a.a(azbVar.b().get(0), azbVar.b().size() > 6 ? azbVar.b().subList(0, 6) : azbVar.b(), 0);
            }
        });
        for (int i = 0; i < childCount; i++) {
            if (i < azbVar.b().size()) {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(0);
                View childAt = mixItemLayout.getContainerLayout().getChildAt(i);
                final MusicSongBean musicSongBean = azbVar.b().get(i);
                if (childAt instanceof azv) {
                    azv azvVar = (azv) childAt;
                    String str = "";
                    MusicArtistBean artist = musicSongBean.getArtist();
                    MusicAlbumBean album = musicSongBean.getAlbum();
                    if (album != null && !TextUtils.isEmpty(album.getLogo())) {
                        str = album.getLogo();
                    }
                    if (artist != null && TextUtils.isEmpty(str) && !TextUtils.isEmpty(artist.getLogo())) {
                        str = artist.getLogo();
                    }
                    azvVar.a(str, musicSongBean.getSongName());
                    int i2 = i + 1;
                    azvVar.setIndex(i2);
                    azvVar.a(musicSongBean.getSingers(), musicSongBean.isNeedVip(), a(musicSongBean.getFileList()));
                    azvVar.setOnClickListener(new View.OnClickListener() { // from class: ayv.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ayv.this.a != null) {
                                ayv.this.a.a(musicSongBean);
                            }
                        }
                    });
                    azvVar.setFavClickListener(new View.OnClickListener() { // from class: ayv.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ayv.this.a != null) {
                                ayv.this.a.b(musicSongBean);
                            }
                        }
                    });
                    if (album != null) {
                        int a = this.a.a(musicSongBean.getHash(), album.getId());
                        if (a == -1) {
                            azvVar.setSelected(false);
                        } else {
                            azvVar.setSelected(true);
                        }
                        azvVar.a(a, i2, musicSongBean.getSongName());
                    }
                    azvVar.setIsLove(this.a.c(musicSongBean));
                }
            } else if (i == 1) {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(4);
            } else {
                mixItemLayout.getContainerLayout().getChildAt(i).setVisibility(8);
            }
        }
    }

    private boolean a(List<SongQualityBean.DataBean.SongQuality> list) {
        if (list != null) {
            for (SongQualityBean.DataBean.SongQuality songQuality : list) {
                if (songQuality.getQuality() == 3) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
