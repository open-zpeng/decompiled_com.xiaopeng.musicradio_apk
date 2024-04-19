package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetCollectListBean;
import com.xiaopeng.musicradio.utils.an;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import defpackage.aud;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: NetRadioFetchModel.java */
/* renamed from: anj  reason: default package */
/* loaded from: classes2.dex */
public class anj {
    private static long d;
    private boolean a;
    private boolean b;
    private List<NetRadioInfo> c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetRadioFetchModel.java */
    /* renamed from: anj$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final anj a = new anj();
    }

    public static anj a() {
        return a.a;
    }

    private anj() {
        this.a = false;
        this.b = false;
        this.c = new ArrayList();
        d = System.currentTimeMillis() - 31536000000L;
    }

    public void b() {
        this.b = false;
        this.a = false;
    }

    public void c() {
        Log.i("NetRadioFetchModel", "redownloadnetRadio: ");
        if (!this.b || apt.a().b().size() == 0) {
            this.a = false;
            d();
        }
    }

    public void d() {
        if (aqf.a().e()) {
            Log.i("NetRadioFetchModel", "downnetRadio: isDownNetRadio ----" + this.a + "mIsDownloadNetRadioSuccess ----" + this.b);
            if (this.a || this.b) {
                return;
            }
            LogUtils.i("NetRadioFetchModel", "downloadUserData: down netRadiolove");
            this.a = true;
            this.c.clear();
            d = System.currentTimeMillis() - 31536000000L;
            a(1);
        }
    }

    public void a(final int i) {
        ani.a(i, 50, new avc<NetCollectListBean>() { // from class: anj.1
            @Override // defpackage.avc
            public void a(NetCollectListBean netCollectListBean) {
                NetCollectListBean.DataBean.PageBean pageBean;
                Log.i("NetRadioFetchModel", "downnetRadioLove: ");
                List<NetCollectListBean.DataBean.ListBean> list = null;
                if (netCollectListBean.getData() != null) {
                    list = netCollectListBean.getData().getList();
                    pageBean = netCollectListBean.getData().getPage();
                } else {
                    pageBean = null;
                }
                if (pageBean == null || list == null) {
                    return;
                }
                int totalPage = pageBean.getTotalPage();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    NetCollectListBean.DataBean.ListBean listBean = list.get(i2);
                    if (!anj.this.c.contains(listBean.getRadioDto())) {
                        NetRadioInfo radioDto = listBean.getRadioDto();
                        radioDto.setCacheTime(anj.d - i2);
                        anj.this.c.add(radioDto);
                    }
                }
                int i3 = i;
                if (i3 >= totalPage) {
                    Log.i("NetRadioFetchModel", "downnetRadioLove: success");
                    anj.this.b = true;
                    anj.this.a = false;
                    LogUtils.w("NetRadioFetchModel", "collectRadioList: hasUpdateLoveRadio---" + ay.c("SP_HAS_UPDATE_LOVE_NETRADIO", false));
                    LinkedList linkedList = new LinkedList();
                    for (NetRadioInfo netRadioInfo : anj.this.c) {
                        if (!TextUtils.isEmpty(netRadioInfo.getName())) {
                            linkedList.add(an.b(netRadioInfo));
                        }
                    }
                    apt.a().a(linkedList);
                    return;
                }
                anj.this.a(i3 + 1);
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                LogUtils.w("NetRadioFetchModel", "error: " + i2 + " msg=" + str);
                anj.this.a = false;
                anj.this.b = false;
                u.c(new aud.b(false));
            }
        });
    }
}
