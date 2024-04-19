package defpackage;

import com.xiaopeng.musicradio.speech.command.FmLocalOffCommand;
import com.xiaopeng.musicradio.speech.command.FmLocalOnCommand;
import com.xiaopeng.musicradio.speech.command.FmNetworkOffCommand;
import com.xiaopeng.musicradio.speech.command.FmNetworkOnCommand;
import com.xiaopeng.musicradio.speech.command.PlayCollectFmCommand;
import com.xiaopeng.musicradio.speech.command.PlayFmChannelCommand;
import com.xiaopeng.musicradio.speech.command.PlayFmNameCommand;
/* compiled from: DuiFMNode.java */
/* renamed from: bab  reason: default package */
/* loaded from: classes2.dex */
public class bab extends baa {
    public bab() {
        a("command://fm.local.on", FmLocalOnCommand.class);
        a("command://fm.local.off", FmLocalOffCommand.class);
        a("command://fm.network.on", FmNetworkOnCommand.class);
        a("command://fm.network.off", FmNetworkOffCommand.class);
        a("command://fm.play.channel", PlayFmChannelCommand.class);
        a("native://fm.play.channelname", PlayFmNameCommand.class);
        a("command://fm.play.collection", PlayCollectFmCommand.class);
    }
}
