package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.model.mediacenter.command.MediaCenterCommand;
import com.xiaopeng.musicradio.speech.command.BackwardCommand;
import com.xiaopeng.musicradio.speech.command.CanChangePlayModeCommand;
import com.xiaopeng.musicradio.speech.command.FmLocalOffCommand;
import com.xiaopeng.musicradio.speech.command.FmLocalOnCommand;
import com.xiaopeng.musicradio.speech.command.FmNetworkOffCommand;
import com.xiaopeng.musicradio.speech.command.FmNetworkOnCommand;
import com.xiaopeng.musicradio.speech.command.ForwardCommand;
import com.xiaopeng.musicradio.speech.command.ListLoopCommand;
import com.xiaopeng.musicradio.speech.command.MusicListPlayCommand;
import com.xiaopeng.musicradio.speech.command.NextCommand;
import com.xiaopeng.musicradio.speech.command.PauseCommand;
import com.xiaopeng.musicradio.speech.command.PlayBtCommand;
import com.xiaopeng.musicradio.speech.command.PlayCollectCommand;
import com.xiaopeng.musicradio.speech.command.PlayCollectFmCommand;
import com.xiaopeng.musicradio.speech.command.PlayCommand;
import com.xiaopeng.musicradio.speech.command.PlayFmChannelCommand;
import com.xiaopeng.musicradio.speech.command.PlayFmNameCommand;
import com.xiaopeng.musicradio.speech.command.PlayHistroyCommand;
import com.xiaopeng.musicradio.speech.command.PlayMusicDailyCommand;
import com.xiaopeng.musicradio.speech.command.PlayProgramCommand;
import com.xiaopeng.musicradio.speech.command.PlayProgramNewsCommand;
import com.xiaopeng.musicradio.speech.command.PlayUsbCommand;
import com.xiaopeng.musicradio.speech.command.PrevCommand;
import com.xiaopeng.musicradio.speech.command.PushCommand;
import com.xiaopeng.musicradio.speech.command.RandomLoopCommand;
import com.xiaopeng.musicradio.speech.command.ResumeCommand;
import com.xiaopeng.musicradio.speech.command.SetTimeCommand;
import com.xiaopeng.musicradio.speech.command.SingleLoopCommand;
import com.xiaopeng.musicradio.speech.command.SpeedDownCommand;
import com.xiaopeng.musicradio.speech.command.StopCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryAuthCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryBtConnectCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryCanCollectCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryCollectEmptyCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryHasQualityCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryHistoryEmptyCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryLoginCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingInfoCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingTitleCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingTypeCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryUsbStateCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryXimalayaLoginCommand;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.agl;
import defpackage.agm;
import defpackage.agq;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: CommandManager.java */
/* renamed from: bah  reason: default package */
/* loaded from: classes2.dex */
public class bah {
    private bae a;
    private baf b;
    private List<bag> c = new ArrayList();

    /* compiled from: CommandManager.java */
    /* renamed from: bah$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bah a = new bah();
    }

    public static bah a() {
        return a.a;
    }

    public bah() {
        Log.i("CommandManager", "CommandManager: init======");
    }

    public void b() {
        u.a(this);
    }

    public void a(bae baeVar) {
        this.a = baeVar;
        Log.i("CommandManager", "setCommand: " + baeVar.getCommand());
    }

    public void a(baf bafVar) {
        this.b = bafVar;
    }

    public void a(bag bagVar) {
        Log.i("CommandManager", "addQueryCommand: " + bagVar.getCommand());
        this.c.add(bagVar);
    }

    private void a(String str) {
        if (this.a != null) {
            Log.i("CommandManager", "triggerCommand: " + str + " getcommand = " + this.a.getCommand());
        }
        bae baeVar = this.a;
        if (baeVar == null || !TextUtils.equals(str, baeVar.getCommand())) {
            return;
        }
        Log.i("CommandManager", "triggerCommand: " + str);
        this.a.doCommand();
        this.a = null;
    }

    private void b(String str) {
        if (this.b != null) {
            Log.i("CommandManager", "triggerCommand: " + this.b + " getcommand = " + this.b.getCommand());
        }
        baf bafVar = this.b;
        if (bafVar == null || !TextUtils.equals(str, bafVar.getCommand())) {
            return;
        }
        Log.i("CommandManager", "triggerCommand: " + str);
        final baf bafVar2 = this.b;
        ban.d(new Runnable() { // from class: bah.1
            @Override // java.lang.Runnable
            public void run() {
                bafVar2.doCommand();
            }
        });
        this.b = null;
    }

    private void c(String str) {
        ArrayList<bag> arrayList = new ArrayList();
        for (bag bagVar : this.c) {
            if (TextUtils.equals(bagVar.getCommand(), str)) {
                Log.i("CommandManager", "triggerQueryCommand: " + str);
                bagVar.doCommand();
                arrayList.add(bagVar);
            }
        }
        for (bag bagVar2 : arrayList) {
            this.c.remove(bagVar2);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChange(age.l lVar) {
        Log.i("CommandManager", "onPlayStateChange: ");
        if (lVar.a() == 2 || lVar.a() == 3) {
            if (lVar.a() == 2) {
                a(PauseCommand.TAG);
                a(StopCommand.TAG);
                a(FmLocalOffCommand.TAG);
                a(FmNetworkOffCommand.TAG);
            } else {
                a(PlayCommand.TAG);
            }
            a(NextCommand.TAG);
            a(PrevCommand.TAG);
            a(ResumeCommand.TAG);
            a(BackwardCommand.TAG);
            a(ForwardCommand.TAG);
            a(StopCommand.TAG);
            a(SpeedDownCommand.TAG);
            a("SpeedUpCommand");
            a("SpeedUpCommand");
            a(SetTimeCommand.TAG);
            c(QueryPlayingCommand.TAG);
            c(QueryPlayingTypeCommand.TAG);
            c("QueryPlayingArtistCommand");
            c("QueryPlayingArtistCommand");
            c(QueryPlayingTitleCommand.TAG);
            c(QueryPlayingInfoCommand.TAG);
            c(QueryCanCollectCommand.TAG);
            c(QueryHasQualityCommand.TAG);
            a(ListLoopCommand.TAG);
            a(RandomLoopCommand.TAG);
            a(SingleLoopCommand.TAG);
        }
        b(PushCommand.TAG);
        a(PlayBtCommand.TAG);
        a(PlayProgramNewsCommand.TAG);
        a(MusicListPlayCommand.TAG);
        a(PlayProgramCommand.TAG);
        a(PlayMusicDailyCommand.TAG);
        a(PlayFmNameCommand.TAG);
        a(PlayFmChannelCommand.TAG);
        a(FmLocalOnCommand.TAG);
        a(FmNetworkOnCommand.TAG);
        a(MusicListPlayCommand.TAG);
        a(PlayProgramCommand.TAG);
        a(PlayBtCommand.TAG);
        a(PlayHistroyCommand.TAG);
        aek e = aei.a().e();
        if (e == null || e.d() == null) {
            return;
        }
        c(QueryCanCollectCommand.TAG);
        c(QueryHasQualityCommand.TAG);
        a(ListLoopCommand.TAG);
        a(RandomLoopCommand.TAG);
        a(SingleLoopCommand.TAG);
        c(QueryPlayingCommand.TAG);
        c(QueryPlayingTypeCommand.TAG);
        c("QueryPlayingArtistCommand");
        c("QueryPlayingArtistCommand");
        c(QueryPlayingTitleCommand.TAG);
        c(QueryPlayingInfoCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLoveNetRadioLoaded(agm.b bVar) {
        Log.i("CommandManager", "onLoveNetRadioLoaded: ===== ");
        a(PlayCollectFmCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLoginInitFinish(agq.d dVar) {
        Log.i("CommandManager", "onLoginInitFinish: size ========= " + this.c.size());
        c(QueryLoginCommand.TAG);
        c(QueryAuthCommand.TAG);
        c(QueryXimalayaLoginCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioTypeInitFinish(agg.e eVar) {
        Log.i("CommandManager", "onAudioTypeInitFinish: ============" + this.c.size());
        if (aei.a().c() == 3) {
            c(QueryCollectEmptyCommand.TAG);
        }
        if (aei.a().c() == -1) {
            a(PlayFmNameCommand.TAG);
            a(PlayFmChannelCommand.TAG);
            a(PlayMusicDailyCommand.TAG);
            a(MusicListPlayCommand.TAG);
            a(PlayProgramCommand.TAG);
            a(PlayProgramNewsCommand.TAG);
            a(PlayCollectCommand.TAG);
            a(PlayCollectFmCommand.TAG);
            a(PlayHistroyCommand.TAG);
            a(PlayBtCommand.TAG);
            b(PushCommand.TAG);
            a(MediaCenterCommand.TAG);
        }
        if (aei.a().c() == 2) {
            a(MediaCenterCommand.TAG);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLoveNetRadioRefresh(agm.b bVar) {
        c(QueryCollectEmptyCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMusicListRefresh(agl.a aVar) {
        c(QueryCollectEmptyCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAppInitFinish(agg.c cVar) {
        Log.i("CommandManager", "onAppInitFinish: ============" + this.c.size());
        a(FmLocalOnCommand.TAG);
        a(FmNetworkOnCommand.TAG);
        a(PlayBtCommand.TAG);
        c(QueryBtConnectCommand.TAG);
        a(PlayHistroyCommand.TAG);
        a(PlayFmNameCommand.TAG);
        a(PlayFmChannelCommand.TAG);
        a(PlayMusicDailyCommand.TAG);
        a(MusicListPlayCommand.TAG);
        a(PlayProgramCommand.TAG);
        a(PlayProgramNewsCommand.TAG);
        a(PlayCollectCommand.TAG);
        a(PlayCollectFmCommand.TAG);
        b(PushCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onBtConnect(agd.b bVar) {
        Log.i("CommandManager", "onBtConnect: " + bVar.a());
        c(QueryBtConnectCommand.TAG);
        a(PlayBtCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onBtHpfConnect(agd.c cVar) {
        Log.i("CommandManager", "onBtHpfConnect: ======== " + cVar.a());
        c(QueryBtConnectCommand.TAG);
        a(PlayBtCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAppCreateEnd(agg.b bVar) {
        Log.i("CommandManager", "onAppCreateEnd: " + this.c.size());
        c(QueryHistoryEmptyCommand.TAG);
        c(QueryUsbStateCommand.TAG);
        a(CanChangePlayModeCommand.TAG);
        c(QueryPlayingTypeCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbListLoaded(agg.ae.c cVar) {
        Log.i("CommandManager", "onUsbListLoaded: ========= ");
        a(PlayUsbCommand.TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRebootPlayFinish(agg.v vVar) {
        LogUtils.i("CommandManager", "onRebootPlayFinish");
        a(MediaCenterCommand.TAG);
    }
}
