package defpackage;

import android.os.Handler;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.utils.ay;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: UserDataList.java */
/* renamed from: apm  reason: default package */
/* loaded from: classes2.dex */
public class apm extends ArrayList<MusicInfo> {
    private static final int SORT_SAVE_TIME = 50;
    public static final String SPLIT_TAG = "&#&#";
    public static final String SP_MUSIC_LIST_SOTR_USER = "SP_MUSIC_LIST_SOTR_USER";
    private Handler mHandler = new Handler();
    private Runnable mSaveSortRun = new Runnable() { // from class: apm.1
        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < apm.this.size(); i++) {
                sb.append(apm.this.get(i).getHash());
                if (i < apm.this.size() - 1) {
                    sb.append(apm.SPLIT_TAG);
                }
            }
            ay.a(apm.SP_MUSIC_LIST_SOTR_USER, sb.toString());
        }
    };

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends MusicInfo> collection) {
        boolean addAll = super.addAll(collection);
        b();
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        super.clear();
        b();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean add(MusicInfo musicInfo) {
        boolean add = super.add(musicInfo);
        b();
        return add;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, MusicInfo musicInfo) {
        super.add(i, musicInfo);
        b();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: a */
    public MusicInfo remove(int i) {
        MusicInfo musicInfo = (MusicInfo) super.remove(i);
        b();
        return musicInfo;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        b();
        return remove;
    }

    private void b() {
        this.mHandler.removeCallbacks(this.mSaveSortRun);
        this.mHandler.postDelayed(this.mSaveSortRun, 50L);
    }

    public static String[] a() {
        return ay.c(SP_MUSIC_LIST_SOTR_USER, "").split(SPLIT_TAG);
    }
}
