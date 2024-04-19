package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.x;
import defpackage.afx;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MediaLogoManager.java */
/* renamed from: amx  reason: default package */
/* loaded from: classes2.dex */
public class amx {
    private a a;
    private boolean b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaLogoManager.java */
    /* renamed from: amx$b */
    /* loaded from: classes2.dex */
    public static class b {
        static final amx a = new amx();
    }

    public static amx a() {
        return b.a;
    }

    public amx() {
        u.a(this);
    }

    public void b() {
        ban.g(new Runnable() { // from class: amx.1
            @Override // java.lang.Runnable
            public void run() {
                amx.this.a(aei.a().c(), false);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(agg.g gVar) {
        a(gVar.a(), false);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLogoEvent(age.o oVar) {
        if (aei.a().c() == 3) {
            a(3, true);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (aei.a().c() == cVar.a()) {
            Log.i("MediaLogoManager", "dealAudioInfo: =========== " + cVar.a());
            a(cVar.a(), false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLogoEvent(age.i iVar) {
        if (aei.a().c() == 0) {
            a(0, false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onThemeChange(afx.b bVar) {
        Log.i("MediaLogoManager", "onThemeChange: =====" + this.b);
        if (this.b) {
            a(aei.a().c(), true);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIGChange(agg.s sVar) {
        if (sVar.a()) {
            a(aei.a().c(), false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLogout(agq.v vVar) {
        a(aei.a().c(), false);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onBtPhoneMusicClose(agd.d dVar) {
        Log.i("MediaLogoManager", "onBtPhoneMusicClose: ========");
        a(aei.a().c(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        a aVar;
        String str;
        String str2;
        a aVar2;
        String str3;
        a aVar3;
        arf arfVar;
        arg playingBtInfo;
        a aVar4;
        if (aei.a().e() == null) {
            a(-1, null, null, e(), "", "");
        } else if (i == 0) {
            aek c = aei.a().c(0);
            if (c != null) {
                MusicInfo musicInfo = (MusicInfo) c.d();
                if (z || musicInfo == null || (aVar = this.a) == null || aVar.a() != musicInfo || !TextUtils.equals(this.a.c(), musicInfo.getLogo())) {
                    String hash = musicInfo != null ? musicInfo.getHash() : "";
                    a(0, musicInfo, null, e(), "", hash);
                    if (musicInfo != null) {
                        a(0, musicInfo, musicInfo.getLogo(), e(), hash);
                    }
                }
            }
        } else if (i != 6) {
            switch (i) {
                case 2:
                    aek c2 = aei.a().c(2);
                    if (c2 != null) {
                        BtMusicBean btMusicBean = (BtMusicBean) c2.d();
                        if (btMusicBean != null) {
                            String logo = btMusicBean.getLogo();
                            str3 = (!be.a((CharSequence) logo) || (arfVar = (arf) c.a().b(arf.class)) == null || (playingBtInfo = arfVar.getPlayingBtInfo()) == null) ? logo : playingBtInfo.c();
                        } else {
                            str3 = null;
                        }
                        if (z || btMusicBean == null || (aVar3 = this.a) == null || aVar3.a() != btMusicBean || str3 == null || !TextUtils.equals(this.a.d, str3)) {
                            String uuid = btMusicBean != null ? btMusicBean.getUuid() : "";
                            a(2, btMusicBean, null, f.e.pic_defaultcover_380_music, "", uuid);
                            if (com.xiaopeng.musicradio.model.bluetooth.a.i().n() && !com.xiaopeng.musicradio.model.bluetooth.a.i().v()) {
                                if (btMusicBean != null) {
                                    a(2, btMusicBean, str3, f.e.pic_defaultcover_380_music, uuid);
                                    return;
                                }
                                return;
                            }
                            Log.i("MediaLogoManager", "refreshLogo: " + com.xiaopeng.musicradio.model.bluetooth.a.i().n() + " musicclose = " + com.xiaopeng.musicradio.model.bluetooth.a.i().v());
                            return;
                        }
                        return;
                    }
                    return;
                case 3:
                    aek c3 = aei.a().c(3);
                    if (c3 != null) {
                        ProgramBean programBean = (ProgramBean) c3.d();
                        if (!z && programBean != null && (aVar4 = this.a) != null && aVar4.a() != null && (this.a.a() instanceof ProgramBean)) {
                            ProgramBean programBean2 = (ProgramBean) this.a.a();
                            if (this.a.a() == programBean || programBean2.getTrackId() == programBean.getTrackId()) {
                                return;
                            }
                        }
                        String valueOf = programBean != null ? String.valueOf(programBean.getAlbumId()) : "";
                        a(3, programBean, null, f.e.pic_defaultcover_380_read, "", valueOf);
                        if (programBean != null) {
                            if (programBean.getChannelId() == 0 || programBean.getCardId() > 0) {
                                a(3, programBean, programBean.getLargeLogo(), f.e.pic_defaultcover_380_read, valueOf);
                                return;
                            }
                            awh awhVar = (awh) c.a().b(awh.class);
                            if (awhVar != null) {
                                String logo4TodayNews = awhVar.getLogo4TodayNews(programBean.getOriginalAlbumId() > 0 ? programBean.getOriginalAlbumId() : programBean.getAlbumId());
                                if (!TextUtils.isEmpty(logo4TodayNews)) {
                                    a(3, programBean, logo4TodayNews, f.e.pic_defaultcover_380_read, valueOf);
                                    return;
                                } else {
                                    awhVar.updateAlbumInfo4TodayNews(programBean.getOriginalAlbumId() > 0 ? programBean.getOriginalAlbumId() : programBean.getAlbumId());
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            aek c4 = aei.a().c(6);
            if (c4 != null) {
                NetRadioProgramInfo netRadioProgramInfo = (NetRadioProgramInfo) c4.d();
                if (z || netRadioProgramInfo == null || (aVar2 = this.a) == null || aVar2.a() != netRadioProgramInfo) {
                    if (netRadioProgramInfo == null || netRadioProgramInfo.getParentInfo() == null) {
                        str = "";
                        str2 = "";
                    } else {
                        str = netRadioProgramInfo.getParentInfo().getPicUrl();
                        str2 = String.valueOf(netRadioProgramInfo.getParentInfo().getId());
                    }
                    a(6, netRadioProgramInfo, null, f.e.pic_defaultcover_380_radio, "", str2);
                    if (netRadioProgramInfo != null) {
                        a(6, netRadioProgramInfo, str, f.e.pic_defaultcover_380_radio, str2);
                    }
                }
            }
        }
    }

    public boolean c() {
        arh playingInfo;
        arf arfVar = (arf) c.a().b(arf.class);
        return (arfVar == null || (playingInfo = arfVar.getPlayingInfo()) == null || playingInfo.i() != 61) ? false : true;
    }

    private int e() {
        return f.e.pic_defaultcover_380_music;
    }

    private void a(final int i, final BaseInfo baseInfo, final String str, final int i2, final String str2) {
        final BaseInfo baseInfo2;
        if (be.a((CharSequence) str)) {
            return;
        }
        if (i == 2) {
            try {
                baseInfo2 = (BaseInfo) baseInfo.clone();
            } catch (Exception e) {
                Log.e("MediaLogoManager", "transferLogo: ", e);
            }
            Glide.with(com.xiaopeng.musicradio.a.a).load(a(str)).centerCrop().listener(new RequestListener<Drawable>() { // from class: amx.3
                @Override // com.bumptech.glide.request.RequestListener
                /* renamed from: a */
                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    Log.e("MediaLogoManager", "onLoadFailed: load logo fail = " + str + " error = " + glideException);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadFailed: threadId = ");
                    sb.append(Thread.currentThread().getId());
                    Log.i("MediaLogoManager", sb.toString());
                    if (glideException == null || glideException.getMessage() == null || !glideException.getMessage().contains("Failed to load resource")) {
                        return false;
                    }
                    x.a().a(obj);
                    return false;
                }
            }).override(400, 400).error(Glide.with(com.xiaopeng.musicradio.a.a).load(str)).skipMemoryCache(true).into((RequestBuilder) new SimpleTarget<Drawable>(400, 400) { // from class: amx.2
                @Override // com.bumptech.glide.request.target.Target
                /* renamed from: a */
                public void onResourceReady(Drawable drawable, Transition transition) {
                    Log.i("MediaLogoManager", "onResourceReady: ========= ");
                    aek e2 = aei.a().e();
                    if (e2 != null) {
                        BaseInfo d = e2.d();
                        BaseInfo baseInfo3 = baseInfo2;
                        if (d == baseInfo3 || baseInfo3.equals(e2.d())) {
                            if (drawable instanceof BitmapDrawable) {
                                amx.this.a(i, baseInfo, ((BitmapDrawable) drawable).getBitmap(), i2, str, str2);
                            } else if (drawable instanceof GifDrawable) {
                                amx.this.a(i, baseInfo, ((GifDrawable) drawable).getFirstFrame(), i2, str, str2);
                            }
                        }
                    }
                }
            });
        }
        baseInfo2 = baseInfo;
        Glide.with(com.xiaopeng.musicradio.a.a).load(a(str)).centerCrop().listener(new RequestListener<Drawable>() { // from class: amx.3
            @Override // com.bumptech.glide.request.RequestListener
            /* renamed from: a */
            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                Log.e("MediaLogoManager", "onLoadFailed: load logo fail = " + str + " error = " + glideException);
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadFailed: threadId = ");
                sb.append(Thread.currentThread().getId());
                Log.i("MediaLogoManager", sb.toString());
                if (glideException == null || glideException.getMessage() == null || !glideException.getMessage().contains("Failed to load resource")) {
                    return false;
                }
                x.a().a(obj);
                return false;
            }
        }).override(400, 400).error(Glide.with(com.xiaopeng.musicradio.a.a).load(str)).skipMemoryCache(true).into((RequestBuilder) new SimpleTarget<Drawable>(400, 400) { // from class: amx.2
            @Override // com.bumptech.glide.request.target.Target
            /* renamed from: a */
            public void onResourceReady(Drawable drawable, Transition transition) {
                Log.i("MediaLogoManager", "onResourceReady: ========= ");
                aek e2 = aei.a().e();
                if (e2 != null) {
                    BaseInfo d = e2.d();
                    BaseInfo baseInfo3 = baseInfo2;
                    if (d == baseInfo3 || baseInfo3.equals(e2.d())) {
                        if (drawable instanceof BitmapDrawable) {
                            amx.this.a(i, baseInfo, ((BitmapDrawable) drawable).getBitmap(), i2, str, str2);
                        } else if (drawable instanceof GifDrawable) {
                            amx.this.a(i, baseInfo, ((GifDrawable) drawable).getFirstFrame(), i2, str, str2);
                        }
                    }
                }
            }
        });
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? str : str.replace("/240/", "/400/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, BaseInfo baseInfo, Bitmap bitmap, int i2, String str, String str2) {
        Bitmap bitmap2;
        if (bitmap == null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(com.xiaopeng.musicradio.a.a.getResources(), i2);
            this.b = true;
            Log.i("MediaLogoManager", "refreshResouce: defaultByteCount = " + decodeResource.getByteCount());
            bitmap2 = decodeResource;
        } else {
            this.b = false;
            Log.i("MediaLogoManager", "refreshResouce: bitmapCount = " + bitmap.getByteCount());
            bitmap2 = bitmap;
        }
        this.a = new a(i, baseInfo, bitmap2, str, i2, this.b, str2);
        Log.i("MediaLogoManager", "refreshResouce: " + i + " info = " + baseInfo);
        u.c(new agg.w(i));
    }

    public a d() {
        return this.a;
    }

    /* compiled from: MediaLogoManager.java */
    /* renamed from: amx$a */
    /* loaded from: classes2.dex */
    public static class a {
        private int a;
        private BaseInfo b;
        private Bitmap c;
        private String d;
        private int e;
        private boolean f;
        private String g;

        public a(int i, BaseInfo baseInfo, Bitmap bitmap, String str, int i2, boolean z, String str2) {
            this.g = "";
            this.a = i;
            this.b = baseInfo;
            this.c = bitmap;
            this.d = str;
            this.e = i2;
            this.f = z;
            this.g = str2;
        }

        public BaseInfo a() {
            return this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.a);
            BaseInfo baseInfo = this.b;
            objArr[1] = baseInfo == null ? "null" : baseInfo.toString();
            sb.append(String.format("audiotype:%d,info:%s", objArr));
            sb.append(" bitmap = ");
            sb.append(b());
            return sb.toString();
        }

        public Bitmap b() {
            Bitmap bitmap = this.c;
            if (bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            return this.c;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }

        public boolean e() {
            return this.f;
        }

        public String f() {
            return this.g;
        }
    }
}
