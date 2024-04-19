package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.speech.command.query.QueryAuthCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryBtConnectCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryCanCollectCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryCollectEmptyCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryHasBtListCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryHasQualityCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryHistoryEmptyCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryLoginCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingAlbumCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingArtistCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingInfoCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingTitleCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryPlayingTypeCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryUsbStateCommand;
import com.xiaopeng.musicradio.speech.command.query.QueryXimalayaLoginCommand;
import java.util.HashMap;
import java.util.Map;
/* compiled from: DuiMusicQuery.java */
/* renamed from: bad  reason: default package */
/* loaded from: classes2.dex */
public class bad {
    private Map<String, Class<? extends bag>> a = new HashMap();

    public bad() {
        a("music.info.query", QueryPlayingInfoCommand.class);
        a("music.info.query.title", QueryPlayingTitleCommand.class);
        a("music.info.query.artist", QueryPlayingArtistCommand.class);
        a("music.info.query.album", QueryPlayingAlbumCommand.class);
        a("music.playtype", QueryPlayingTypeCommand.class);
        a("music.is.playing", QueryPlayingCommand.class);
        a("music.has.bluetooth.musiclist", QueryHasBtListCommand.class);
        a("music.is.history.empty", QueryHistoryEmptyCommand.class);
        a("music.is.collect.empty", QueryCollectEmptyCommand.class);
        a("music.is.can.collected", QueryCanCollectCommand.class);
        a("music.is.bt.connected", QueryBtConnectCommand.class);
        a("music.is.kugou.authed", QueryAuthCommand.class);
        a("music.get.usb.state", QueryUsbStateCommand.class);
        a("music.account.login", QueryLoginCommand.class);
        a("music.quality.page.open", QueryHasQualityCommand.class);
        a("ximalaya.account.login", QueryXimalayaLoginCommand.class);
    }

    protected void a(String str, Class<? extends bag> cls) {
        this.a.put(str, cls);
    }

    public void a(String str, String str2, String str3) {
        if (this.a.containsKey(str)) {
            try {
                this.a.get(str).getConstructor(String.class, String.class, String.class).newInstance(str, str2, str3).onEvent();
            } catch (Exception e) {
                Log.e("DuiMusicQuery", "onEvent: ", e);
            }
        }
    }
}
