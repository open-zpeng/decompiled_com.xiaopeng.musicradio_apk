package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.media.AudioConfig.AudioConfig;
import android.os.IBinder;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.xuimanager.XUIManager;
import com.xiaopeng.xuimanager.smart.SmartManager;
import org.greenrobot.eventbus.EventBus;
/* compiled from: AudioVolumeModel.java */
/* renamed from: amw  reason: default package */
/* loaded from: classes2.dex */
public class amw {
    private XUIManager a;
    private SmartManager b;
    private AudioConfig c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioVolumeModel.java */
    /* renamed from: amw$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final amw a = new amw();
    }

    public static amw a() {
        return a.a;
    }

    private amw() {
        this.a = XUIManager.createXUIManager(com.xiaopeng.musicradio.a.a, new ServiceConnection() { // from class: amw.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                LogUtils.d("AudioVolumeModel", "onServiceConnected!!!!!!");
                try {
                    amw.this.b = (SmartManager) amw.this.a.getXUIServiceManager("smart");
                    amw.this.e();
                } catch (Exception e) {
                    LogUtils.e("AudioVolumeModel", "onServiceConnectedException:", e);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                LogUtils.e("AudioVolumeModel", "onServiceDisconnected");
            }
        });
        this.a.connect();
        this.c = new AudioConfig(com.xiaopeng.musicradio.a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            boolean isRegistered = EventBus.getDefault().isRegistered(this);
            Log.i("AudioVolumeModel", "registerListener.. isRegistered: " + isRegistered);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String b() {
        AudioConfig audioConfig = this.c;
        if (audioConfig != null) {
            return audioConfig.getCurrentAudioFocusPackageName();
        }
        return null;
    }

    public void c() {
        LogUtils.d("AudioVolumeModel", "resumeVolume called, but the operation is passed to xui");
    }

    public boolean d() {
        if (this.c == null) {
            this.c = new AudioConfig(com.xiaopeng.musicradio.a.a);
        }
        return this.c.getMainDriverMode() == 1;
    }
}
