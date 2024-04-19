package defpackage;

import com.google.android.exoplayer2.C;
/* compiled from: IntentUtils.java */
/* renamed from: atz  reason: default package */
/* loaded from: classes2.dex */
public class atz {
    public static void a(long j, String str, String str2, String str3) {
        if (anu.a().b(j)) {
            sp.a().a("/mine/activity/playlist/detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("album_id", j).withString("album_logo", str).withString("album_name", str2).withString("album_description", str3).navigation();
        } else {
            sp.a().a("/music/activity/fav_music_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", j).withString("detail_LOGO", str).withString("detail_title", str2).withString("detail_description", str3).navigation();
        }
    }
}
