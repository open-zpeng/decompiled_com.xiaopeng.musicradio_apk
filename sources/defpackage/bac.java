package defpackage;

import com.xiaopeng.musicradio.speech.command.BackwardCommand;
import com.xiaopeng.musicradio.speech.command.CanChangePlayModeCommand;
import com.xiaopeng.musicradio.speech.command.CancelCollectCommand;
import com.xiaopeng.musicradio.speech.command.CollectCommand;
import com.xiaopeng.musicradio.speech.command.ForwardCommand;
import com.xiaopeng.musicradio.speech.command.ListLoopCommand;
import com.xiaopeng.musicradio.speech.command.MusicListPlayCommand;
import com.xiaopeng.musicradio.speech.command.NextCommand;
import com.xiaopeng.musicradio.speech.command.PauseCommand;
import com.xiaopeng.musicradio.speech.command.PlayBtCommand;
import com.xiaopeng.musicradio.speech.command.PlayCollectCommand;
import com.xiaopeng.musicradio.speech.command.PlayCommand;
import com.xiaopeng.musicradio.speech.command.PlayHistroyCommand;
import com.xiaopeng.musicradio.speech.command.PlayMusicDailyCommand;
import com.xiaopeng.musicradio.speech.command.PlayProgramCommand;
import com.xiaopeng.musicradio.speech.command.PlayProgramNewsCommand;
import com.xiaopeng.musicradio.speech.command.PlayUsbCommand;
import com.xiaopeng.musicradio.speech.command.PrevCommand;
import com.xiaopeng.musicradio.speech.command.RandomLoopCommand;
import com.xiaopeng.musicradio.speech.command.ResumeCommand;
import com.xiaopeng.musicradio.speech.command.SearchMusicCommand;
import com.xiaopeng.musicradio.speech.command.SetTimeCommand;
import com.xiaopeng.musicradio.speech.command.SingleLoopCommand;
import com.xiaopeng.musicradio.speech.command.SpeedDownCommand;
import com.xiaopeng.musicradio.speech.command.SpeedSetCommand;
import com.xiaopeng.musicradio.speech.command.SpeedUpCommand;
import com.xiaopeng.musicradio.speech.command.StopCommand;
/* compiled from: DuiMusicNode.java */
/* renamed from: bac  reason: default package */
/* loaded from: classes2.dex */
public class bac extends baa {
    public bac() {
        a("command://music.control.play", PlayCommand.class);
        a("command://music.control.loop.single", SingleLoopCommand.class);
        a("command://music.control.loop.all", ListLoopCommand.class);
        a("command://music.control.random", RandomLoopCommand.class);
        a("native://music.search", SearchMusicCommand.class);
        a("command://music.control.pause", PauseCommand.class);
        a("command://music.control.resume", ResumeCommand.class);
        a("command://music.control.prev", PrevCommand.class);
        a("command://music.control.next", NextCommand.class);
        a("command://music.control.stop", StopCommand.class);
        a("command://music.control.bluetooth.play.random", PlayBtCommand.class);
        a("native://music.playmode.support", CanChangePlayModeCommand.class);
        a("command://music.audiobook.play", PlayProgramCommand.class);
        a("command://music.list.play", MusicListPlayCommand.class);
        a("command://music.control.collect", CollectCommand.class);
        a("command://music.audiobook.subscribe", CollectCommand.class);
        a("command://music.control.collect.cancel", CancelCollectCommand.class);
        a("command://music.control.collect.play", PlayCollectCommand.class);
        a("command://music.control.playlist.history.play", PlayHistroyCommand.class);
        a("command://music.forward", ForwardCommand.class);
        a("command://music.backward", BackwardCommand.class);
        a("command://music.settime", SetTimeCommand.class);
        a("command://music.speed.up", SpeedUpCommand.class);
        a("command://music.speed.down", SpeedDownCommand.class);
        a("command://music.speed.set", SpeedSetCommand.class);
        a("command://music.news.play", PlayProgramNewsCommand.class);
        a("command://music.dailyrec.play", PlayMusicDailyCommand.class);
        a("command://music.control.play.usb", PlayUsbCommand.class);
    }
}
