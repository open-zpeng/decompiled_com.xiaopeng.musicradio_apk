package defpackage;

import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.bean.xpbean.user.QqSongIdsTxBean;
import com.xiaopeng.musicradio.utils.z;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: MusicLoveMerger.java */
/* renamed from: aft  reason: default package */
/* loaded from: classes2.dex */
public class aft implements afs {
    @Override // defpackage.afs
    public boolean a(ReissueInfo reissueInfo) {
        return "music_love".equals(reissueInfo.getType());
    }

    @Override // defpackage.afs
    public ReissueInfo a(ReissueInfo reissueInfo, LinkedList<ReissueInfo> linkedList) {
        StringBuilder sb = new StringBuilder();
        sb.append(b(reissueInfo));
        Iterator<ReissueInfo> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(',');
            sb.append(b(it.next()));
        }
        ReissueInfo reissueInfo2 = new ReissueInfo();
        reissueInfo2.setObjectId(reissueInfo.getObjectId());
        reissueInfo2.setReissueType(reissueInfo.getReissueType());
        reissueInfo2.setType(reissueInfo.getType());
        reissueInfo2.setUrl(reissueInfo.getUrl());
        reissueInfo2.setValue(z.a(new QqSongIdsTxBean(sb.toString())));
        reissueInfo2.setMergeList(linkedList);
        return reissueInfo2;
    }

    private String b(ReissueInfo reissueInfo) {
        QqSongIdsTxBean qqSongIdsTxBean = (QqSongIdsTxBean) z.a(reissueInfo.getValue(), (Class<Object>) QqSongIdsTxBean.class);
        return qqSongIdsTxBean != null ? qqSongIdsTxBean.songIds : "";
    }
}
