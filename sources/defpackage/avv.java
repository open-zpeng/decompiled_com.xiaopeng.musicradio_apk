package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareContentBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.ShareSongBean;
import com.xiaopeng.musicradio.utils.w;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ShareCommunityUtil.java */
/* renamed from: avv  reason: default package */
/* loaded from: classes2.dex */
public class avv {
    public static ShareProgramBean a(String str, ProgramBean programBean) {
        if (programBean == null) {
            return null;
        }
        ShareProgramBean shareProgramBean = new ShareProgramBean();
        shareProgramBean.setAlbumId(programBean.getAlbumId());
        shareProgramBean.setVehicleType(w.j());
        shareProgramBean.setContent(str);
        return shareProgramBean;
    }

    public static ShareSongBean a(String str, MusicInfo musicInfo) {
        Log.i("ShareCommunityUtil", "shareMusic: " + musicInfo);
        if (musicInfo == null || musicInfo.getHash() == null) {
            return null;
        }
        ShareSongBean shareSongBean = new ShareSongBean();
        shareSongBean.setHash(musicInfo.getHash());
        shareSongBean.setAlbumId(musicInfo.getAlbumId());
        shareSongBean.setVehicleType(w.j());
        shareSongBean.setSource(w.f());
        shareSongBean.setContent(str);
        return shareSongBean;
    }

    public static List<String> a(ShareContentBean shareContentBean, int i) {
        if (shareContentBean == null || shareContentBean.getData() == null || shareContentBean.getData().getMusicContent() == null || shareContentBean.getData().getReadingContents() == null) {
            return null;
        }
        if (i == 0) {
            return shareContentBean.getData().getMusicContent();
        }
        return shareContentBean.getData().getReadingContents();
    }

    public static String a(List<String> list) {
        Matcher matcher = Pattern.compile("\\{vehicleType\\}").matcher(list.get(new Random().nextInt(list.size())));
        if (w.j() == null) {
            return matcher.replaceAll("E38");
        }
        return matcher.replaceAll(w.j());
    }
}
