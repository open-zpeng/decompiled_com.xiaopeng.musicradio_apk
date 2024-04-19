package defpackage;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import java.io.Serializable;
import java.util.List;
/* compiled from: UsbLogoResult.java */
/* renamed from: bax  reason: default package */
/* loaded from: classes2.dex */
public class bax extends BaseBean {
    private a data;

    public a a() {
        return this.data;
    }

    /* compiled from: UsbLogoResult.java */
    /* renamed from: bax$a */
    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        private List<baw> logoDtoList;

        public List<baw> a() {
            return this.logoDtoList;
        }

        public String toString() {
            return "DataBean{logoDtoList=" + this.logoDtoList + '}';
        }
    }

    public String toString() {
        return "UsbLogoResult{data=" + this.data + '}';
    }
}
