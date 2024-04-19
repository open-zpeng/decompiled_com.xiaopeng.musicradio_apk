package com.xiaopeng.musicradio.music.concentration.zone.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.alibaba.android.arouter.facade.Postcard;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.VipMusicMainZoneResult;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.presenter.MsZoneItemPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/* loaded from: classes.dex */
public class ZoneItemLayout extends BaseFrameLayout<c, MsZoneItemPresenter> implements View.OnClickListener, c {
    private Context c;
    private XImageView d;
    private XFrameLayout e;
    private XTextView f;
    private XImageView g;
    private XImageView h;
    private XImageView i;
    private XImageView j;
    private XTextView k;
    private XFrameLayout l;
    private int[] m;
    private VipMusicMainZoneResult.DataBean.ListBean n;
    private int o;
    private ArrayList<Long> p;
    private List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean> q;
    private int r;
    private boolean s;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public ZoneItemLayout(Context context) {
        super(context);
        this.m = new int[]{b.c.img_vip_collection, b.c.img_children_collection, b.c.img_vehicle_collection};
        this.r = 34;
        this.s = false;
        this.c = context;
    }

    public ZoneItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new int[]{b.c.img_vip_collection, b.c.img_children_collection, b.c.img_vehicle_collection};
        this.r = 34;
        this.s = false;
        this.c = context;
    }

    public ZoneItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new int[]{b.c.img_vip_collection, b.c.img_children_collection, b.c.img_vehicle_collection};
        this.r = 34;
        this.s = false;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsZoneItemPresenter a() {
        return new MsZoneItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_zone_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (XImageView) findViewById(b.d.play_icon);
        this.e = (XFrameLayout) findViewById(b.d.play_item_layout);
        this.f = (XTextView) findViewById(b.d.zone_title);
        this.g = (XImageView) findViewById(b.d.collect_one);
        this.h = (XImageView) findViewById(b.d.collect_two);
        this.i = (XImageView) findViewById(b.d.collect_three);
        this.j = (XImageView) findViewById(b.d.item_bg);
        this.k = (XTextView) findViewById(b.d.tv_speech_num);
        this.l = (XFrameLayout) findViewById(b.d.zone_root);
    }

    private void setItemBg(int i) {
        int[] iArr = this.m;
        this.j.setImageResource(iArr[i % iArr.length]);
    }

    private void setStatus(int i) {
        switch (i) {
            case 1:
                this.d.setBackgroundResource(b.c.ic_btn_stop);
                return;
            case 2:
                this.d.setBackgroundResource(b.c.ic_btn_stop);
                return;
            case 3:
                this.d.setBackgroundResource(b.c.ic_btn_playall);
                return;
            default:
                this.d.setBackgroundResource(b.c.ic_btn_playall);
                return;
        }
    }

    private boolean g() {
        String x = apk.i().x();
        ArrayList<Long> arrayList = this.p;
        if (arrayList != null) {
            Iterator<Long> it = arrayList.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                if (!TextUtils.isEmpty(x) && x.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
                    if (x.contains(ListSignBean.COLLECTID_PREFIX + next + ListSignBean.COLLECTID_SUFFIX)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.view.c
    public void a(boolean z) {
        if (z) {
            if (aei.a().c() == 0) {
                if (g()) {
                    int playState = apk.i().getPlayState();
                    r0 = playState == 2;
                    setStatus(playState);
                } else {
                    setStatus(0);
                }
            } else {
                setStatus(0);
            }
        } else {
            setStatus(0);
        }
        if (this.s != r0) {
            com.xiaopeng.musicradio.vui.c.a(getContext(), this.e, r0);
            VuiEngine.getInstance(getContext()).updateScene("MainMusicConcentration", this.e);
            this.s = r0;
        }
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.view.c
    public void e() {
        this.k.setVisibility(h.a().b() ? 0 : 8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (this.n == null) {
            return;
        }
        if (id == b.d.play_item_layout) {
            a(this.n);
        } else if (id == b.d.zone_root) {
            int i = this.o;
            if (i == 0) {
                atv.e();
            } else if (i == 1) {
                atv.f();
            } else if (i == 2) {
                atv.g();
            }
            Postcard addFlags = sp.a().a("/music/activity/zone_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW);
            addFlags.withString("zone_id", this.n.getId() + "").withString("zone_name", this.n.getName()).withInt("zone_position", this.o).navigation();
        }
    }

    private void a(VipMusicMainZoneResult.DataBean.ListBean listBean) {
        List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean> collectList;
        List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean> moduleList = listBean.getModuleList();
        if (moduleList == null || moduleList.size() <= 0) {
            return;
        }
        if (moduleList.get(0).getCollectInfo() == null || (collectList = moduleList.get(0).getCollectInfo().getCollectList()) == null || collectList.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (collectList != null) {
            for (VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean collectListBean : collectList) {
                arrayList.add(Long.valueOf(collectListBean.getCollect().getId()));
            }
        }
        String x = apk.i().x();
        MusicRadioItem musicRadioItem = null;
        int i = -1;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            long longValue = ((Long) arrayList.get(i2)).longValue();
            if (!TextUtils.isEmpty(x) && x.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
                if (x.contains(ListSignBean.COLLECTID_PREFIX + longValue + ListSignBean.COLLECTID_SUFFIX)) {
                    i = i2;
                }
            }
        }
        if (i != -1) {
            VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean collectListBean2 = collectList.get(i);
            if (collectListBean2 != null) {
                musicRadioItem = collectListBean2.getCollect();
                atf.a().a(au.b(collectListBean2.getCollect().getId(), collectListBean2.getCollect().getName()).toJson());
            }
        } else {
            int nextInt = new Random().nextInt(arrayList.size());
            if (collectList.get(nextInt) == null || (musicRadioItem = collectList.get(nextInt).getCollect()) == null) {
                return;
            }
            atf.a().a(au.b(musicRadioItem.getId(), musicRadioItem.getName()).toJson());
        }
        musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
        musicRadioItem.setTitle(musicRadioItem.getName());
        ams.a().a(musicRadioItem);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        i();
    }

    private void i() {
        List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean> list = this.q;
        if (list != null && list.size() > 3) {
            y.b(this.g.getContext(), this.q.get(0).getCollect().getLogo(), b.c.pic_covers_music_list_220, this.g);
            y.b(this.h.getContext(), this.q.get(1).getCollect().getLogo(), b.c.pic_covers_music_list_220, this.h);
            y.b(this.i.getContext(), this.q.get(2).getCollect().getLogo(), b.c.pic_covers_music_list_220, this.i);
        }
        this.k.setVisibility(h.a().b() ? 0 : 8);
    }
}
