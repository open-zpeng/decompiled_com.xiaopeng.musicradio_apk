package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.utils.bl;
import com.xiaopeng.musicradio.utils.r;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.aht;
import java.util.List;
/* compiled from: DialogUtils.java */
/* renamed from: amd  reason: default package */
/* loaded from: classes2.dex */
public class amd {
    public static final Integer a = 1;
    public static final Integer b = 2;

    public static String a(Context context, List list) {
        MusicInfo musicInfo = (MusicInfo) list.get(0);
        if (list.size() > 1) {
            return context.getString(aht.e.delete_music_list_name_template, musicInfo.getSong(), Integer.valueOf(list.size()));
        }
        return musicInfo.getSong() + " ";
    }

    public static void a(Context context, bl blVar, String str, final XDialogInterface.OnClickListener onClickListener, String str2) {
        final XDialog xDialog = new XDialog(context, 0, r.a());
        xDialog.setVuiSceneId(str2);
        xDialog.setTitle(aht.e.delete_warning_title).setMessage(context.getString(aht.e.delete_warning_template, str)).setPositiveButton(context.getString(aht.e.delete), new XDialogInterface.OnClickListener() { // from class: amd.2
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                xDialog2.setPositiveButtonEnable(false);
                XDialogInterface.OnClickListener onClickListener2 = XDialogInterface.OnClickListener.this;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(xDialog2, i);
                }
            }
        }).setNegativeButton(context.getString(aht.e.cancel), new XDialogInterface.OnClickListener() { // from class: amd.1
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                XDialog.this.setNegativeButtonEnable(false);
            }
        });
        blVar.a(xDialog);
    }
}
