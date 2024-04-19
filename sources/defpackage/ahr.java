package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.f;
import com.xiaopeng.musicradio.common.c;
import defpackage.aht;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: DataBinderMapperImpl.java */
/* renamed from: ahr  reason: default package */
/* loaded from: classes2.dex */
public class ahr extends d {
    private static final SparseIntArray a = new SparseIntArray(18);

    static {
        a.put(aht.d.activity_album_list, 1);
        a.put(aht.d.activity_collected_music_list, 2);
        a.put(aht.d.activity_custom_detail_list, 3);
        a.put(aht.d.activity_music_list, 4);
        a.put(aht.d.activity_netradio_list, 5);
        a.put(aht.d.activity_playlist_blue, 6);
        a.put(aht.d.activity_program_list, 7);
        a.put(aht.d.fragment_mine_collect, 8);
        a.put(aht.d.fragment_mine_history, 9);
        a.put(aht.d.fragment_mine_main, 10);
        a.put(aht.d.fragment_mine_playlist, 11);
        a.put(aht.d.mine_album_item_layout, 12);
        a.put(aht.d.mine_music_item_layout, 13);
        a.put(aht.d.mine_music_item_main_layout, 14);
        a.put(aht.d.mine_netradio_item_layout, 15);
        a.put(aht.d.mine_program_item_layout, 16);
        a.put(aht.d.playlist_blue_view, 17);
        a.put(aht.d.playlist_user_item_layout, 18);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding a(f fVar, View view, int i) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_album_list_0".equals(tag)) {
                        return new ajf(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_album_list is invalid. Received: " + tag);
                case 2:
                    if ("layout/activity_collected_music_list_0".equals(tag)) {
                        return new ajh(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_collected_music_list is invalid. Received: " + tag);
                case 3:
                    if ("layout/activity_custom_detail_list_0".equals(tag)) {
                        return new ajj(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_custom_detail_list is invalid. Received: " + tag);
                case 4:
                    if ("layout/activity_music_list_0".equals(tag)) {
                        return new ajl(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_music_list is invalid. Received: " + tag);
                case 5:
                    if ("layout/activity_netradio_list_0".equals(tag)) {
                        return new ajn(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_netradio_list is invalid. Received: " + tag);
                case 6:
                    if ("layout/activity_playlist_blue_0".equals(tag)) {
                        return new ajp(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_playlist_blue is invalid. Received: " + tag);
                case 7:
                    if ("layout/activity_program_list_0".equals(tag)) {
                        return new ajr(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_program_list is invalid. Received: " + tag);
                case 8:
                    if ("layout/fragment_mine_collect_0".equals(tag)) {
                        return new ajt(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_mine_collect is invalid. Received: " + tag);
                case 9:
                    if ("layout/fragment_mine_history_0".equals(tag)) {
                        return new ajv(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_mine_history is invalid. Received: " + tag);
                case 10:
                    if ("layout/fragment_mine_main_0".equals(tag)) {
                        return new ajx(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_mine_main is invalid. Received: " + tag);
                case 11:
                    if ("layout/fragment_mine_playlist_0".equals(tag)) {
                        return new ajz(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_mine_playlist is invalid. Received: " + tag);
                case 12:
                    if ("layout/mine_album_item_layout_0".equals(tag)) {
                        return new akb(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_album_item_layout is invalid. Received: " + tag);
                case 13:
                    if ("layout/mine_music_item_layout_0".equals(tag)) {
                        return new akd(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_music_item_layout is invalid. Received: " + tag);
                case 14:
                    if ("layout/mine_music_item_main_layout_0".equals(tag)) {
                        return new akf(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_music_item_main_layout is invalid. Received: " + tag);
                case 15:
                    if ("layout/mine_netradio_item_layout_0".equals(tag)) {
                        return new akh(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_netradio_item_layout is invalid. Received: " + tag);
                case 16:
                    if ("layout/mine_program_item_layout_0".equals(tag)) {
                        return new akj(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for mine_program_item_layout is invalid. Received: " + tag);
                case 17:
                    if ("layout/playlist_blue_view_0".equals(tag)) {
                        return new akl(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for playlist_blue_view is invalid. Received: " + tag);
                case 18:
                    if ("layout/playlist_user_item_layout_0".equals(tag)) {
                        return new akn(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for playlist_user_item_layout is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        return null;
    }

    @Override // androidx.databinding.d
    public ViewDataBinding a(f fVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.d
    public int a(String str) {
        Integer num;
        if (str == null || (num = a.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public List<d> a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new ir());
        arrayList.add(new c());
        return arrayList;
    }

    /* compiled from: DataBinderMapperImpl.java */
    /* renamed from: ahr$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final HashMap<String, Integer> a = new HashMap<>(18);

        static {
            a.put("layout/activity_album_list_0", Integer.valueOf(aht.d.activity_album_list));
            a.put("layout/activity_collected_music_list_0", Integer.valueOf(aht.d.activity_collected_music_list));
            a.put("layout/activity_custom_detail_list_0", Integer.valueOf(aht.d.activity_custom_detail_list));
            a.put("layout/activity_music_list_0", Integer.valueOf(aht.d.activity_music_list));
            a.put("layout/activity_netradio_list_0", Integer.valueOf(aht.d.activity_netradio_list));
            a.put("layout/activity_playlist_blue_0", Integer.valueOf(aht.d.activity_playlist_blue));
            a.put("layout/activity_program_list_0", Integer.valueOf(aht.d.activity_program_list));
            a.put("layout/fragment_mine_collect_0", Integer.valueOf(aht.d.fragment_mine_collect));
            a.put("layout/fragment_mine_history_0", Integer.valueOf(aht.d.fragment_mine_history));
            a.put("layout/fragment_mine_main_0", Integer.valueOf(aht.d.fragment_mine_main));
            a.put("layout/fragment_mine_playlist_0", Integer.valueOf(aht.d.fragment_mine_playlist));
            a.put("layout/mine_album_item_layout_0", Integer.valueOf(aht.d.mine_album_item_layout));
            a.put("layout/mine_music_item_layout_0", Integer.valueOf(aht.d.mine_music_item_layout));
            a.put("layout/mine_music_item_main_layout_0", Integer.valueOf(aht.d.mine_music_item_main_layout));
            a.put("layout/mine_netradio_item_layout_0", Integer.valueOf(aht.d.mine_netradio_item_layout));
            a.put("layout/mine_program_item_layout_0", Integer.valueOf(aht.d.mine_program_item_layout));
            a.put("layout/playlist_blue_view_0", Integer.valueOf(aht.d.playlist_blue_view));
            a.put("layout/playlist_user_item_layout_0", Integer.valueOf(aht.d.playlist_user_item_layout));
        }
    }
}
