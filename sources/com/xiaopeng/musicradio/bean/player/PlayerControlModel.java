package com.xiaopeng.musicradio.bean.player;

import android.os.Bundle;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.player.h;
import com.xiaopeng.musicradio.utils.af;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.ags;
import defpackage.ave;
/* loaded from: classes.dex */
public abstract class PlayerControlModel implements aek, h.a {
    private static final String TAG = "PlayerControlModel";
    private ags mAudioFocusModel;
    protected int mPlayState = -1;
    protected int mPlayingPosition = 0;
    private ags.a mFocusChangeListener = new ags.a() { // from class: com.xiaopeng.musicradio.bean.player.PlayerControlModel.1
        @Override // defpackage.ags.a
        public void focusPause() {
            LogUtils.i(PlayerControlModel.TAG, "focusPause: " + PlayerControlModel.this.mPlayState);
            if (PlayerControlModel.this.mPlayState == 2 || PlayerControlModel.this.mPlayState == 1) {
                PlayerControlModel.this.pause();
            }
        }

        @Override // defpackage.ags.a
        public void lowerVolume() {
            PlayerControlModel.this.mAudioFocusModel.a(new ags.c() { // from class: com.xiaopeng.musicradio.bean.player.PlayerControlModel.1.1
                @Override // defpackage.ags.c
                public void updateSoundVolume(float f) {
                    PlayerControlModel.this.setVolume(f);
                }
            });
        }

        @Override // defpackage.ags.a
        public void riseVolume() {
            PlayerControlModel.this.mAudioFocusModel.b(new ags.c() { // from class: com.xiaopeng.musicradio.bean.player.PlayerControlModel.1.2
                @Override // defpackage.ags.c
                public void updateSoundVolume(float f) {
                    PlayerControlModel.this.setVolume(f);
                }
            });
        }

        @Override // defpackage.ags.a
        public void focusPlay() {
            PlayerControlModel.this.replay(false);
        }
    };
    private boolean mPlayWhenReady = true;
    protected PlayerSelector mPlayer = new PlayerSelector(getPlayerType());

    @Override // defpackage.aek
    public boolean enablePlayMode() {
        return true;
    }

    public String getListTitle() {
        return "";
    }

    protected abstract int getPlayerType();

    @Override // defpackage.aek
    public int getStartPosition() {
        return 0;
    }

    protected abstract boolean hasPlayingInfo();

    protected abstract boolean hasPlayingList();

    protected abstract void playCurrent();

    protected abstract void playCurrentWithPos(int i);

    protected abstract void postStateEvent();

    @Override // defpackage.aek
    public abstract void rebootPlay(boolean z);

    protected abstract void savePlayState(int i);

    public PlayerControlModel() {
        this.mPlayer.setPlayListener(this);
        this.mAudioFocusModel = ags.a();
    }

    @Override // defpackage.aek
    public void register() {
        this.mAudioFocusModel.a(this, this.mFocusChangeListener);
        u.a(this);
    }

    @Override // defpackage.aek
    public void unregister() {
        this.mAudioFocusModel.a(this);
        u.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void prepare(String str, boolean z, boolean z2, boolean z3) {
        postInfoEvent();
        setPlayWhenReady(z3);
        dealPlayState(1);
        Log.i(TAG, "prepare: " + str + " cache = " + z2 + " playWhenReady = " + z3);
        this.mPlayer.prepareData(str, z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPlayWhenReady(boolean z) {
        this.mPlayWhenReady = z;
    }

    public void startSeek() {
        this.mPlayer.startSeek();
    }

    @Override // defpackage.aek
    public void seekTo(int i) {
        LogUtils.i(TAG, "seekTo: " + i);
        PlayerSelector playerSelector = this.mPlayer;
        if (playerSelector != null) {
            playerSelector.seekTo(i);
        }
    }

    @Override // defpackage.aek
    public int getPosition() {
        PlayerSelector playerSelector = this.mPlayer;
        if (playerSelector != null) {
            return playerSelector.getCurrentPosition();
        }
        return 0;
    }

    @Override // defpackage.aek
    public int getSecondPosition() {
        PlayerSelector playerSelector = this.mPlayer;
        if (playerSelector != null) {
            return playerSelector.getSecondPosition();
        }
        return 0;
    }

    @Override // defpackage.aek
    public int getDuration() {
        af.a();
        return this.mPlayer.getDuration();
    }

    @Override // defpackage.aek
    public int getPlayState() {
        return this.mPlayState;
    }

    @Override // defpackage.aek
    public boolean getPlayWhenReady() {
        return this.mPlayWhenReady;
    }

    @Override // defpackage.aek
    public boolean setVolume(float f) {
        this.mPlayer.setVolume(f, f);
        return true;
    }

    public float getVolume() {
        return this.mPlayer.getVolume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void replay(boolean z) {
        LogUtils.i(TAG, "replay, resumeVolume:" + z);
        int i = this.mPlayState;
        if ((i == 3 || i == 5) && !this.mPlayer.isIdle()) {
            if (this.mPlayer.getPlaybackState() == 4) {
                this.mPlayer.seekTo(0);
            }
            postInfoEvent();
            dealPlayState(1);
            this.mPlayer.start();
            return;
        }
        playCurrentWithPos(this.mPlayingPosition);
    }

    @Override // defpackage.aek
    public void pause() {
        Log.i(TAG, "pause: ");
        dealPlayState(3);
        ags.a().a(new ags.d() { // from class: com.xiaopeng.musicradio.bean.player.PlayerControlModel.2
            @Override // defpackage.ags.d
            public void updateSoundVolume(float f) {
                PlayerControlModel.this.setVolume(f);
            }

            @Override // defpackage.ags.d
            public void changeState() {
                PlayerControlModel.this.pauseInner();
            }
        });
    }

    protected void pauseInner() {
        Log.i(TAG, "pauseInner: ========= ");
        this.mPlayer.pause();
    }

    @Override // defpackage.aek
    public void stop() {
        dealPlayState(-1);
        this.mPlayer.stop();
    }

    public void playState(int i) {
        if (i == -1) {
            dealPlayState(-1);
        } else if (i == 5) {
            dealWhenComplete();
        } else {
            switch (i) {
                case 1:
                    dealPlayState(1);
                    return;
                case 2:
                    setPlayWhenReady(true);
                    dealPlayState(2);
                    return;
                case 3:
                    dealPlayState(3);
                    return;
                default:
                    return;
            }
        }
    }

    private void dealWhenComplete() {
        if (getPlayState() == 3) {
            return;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void dealPlayState(int i) {
        if (this.mPlayState == i) {
            return;
        }
        this.mPlayState = i;
        LogUtils.i(TAG, "dealPlayState: " + this.mPlayState);
        postStateEvent();
        if (i == 2 || i == 1) {
            savePlayState(2);
        } else if (i == 3) {
            savePlayState(3);
        }
    }

    @Override // defpackage.aek
    public void play() {
        Log.i(TAG, "play: =====");
        if (isNotPlayable()) {
            return;
        }
        LogUtils.i(TAG, "can play: ");
        changePlayer();
        ags.a().b(new ags.d() { // from class: com.xiaopeng.musicradio.bean.player.PlayerControlModel.3
            @Override // defpackage.ags.d
            public void updateSoundVolume(float f) {
                PlayerControlModel.this.setVolume(f);
            }

            @Override // defpackage.ags.d
            public void changeState() {
                if (PlayerControlModel.this.hasPlayingInfo()) {
                    PlayerControlModel.this.replay(true);
                } else if (PlayerControlModel.this.hasPlayingList()) {
                    PlayerControlModel.this.a();
                } else {
                    Log.i(PlayerControlModel.TAG, "changeState: ======= ");
                    PlayerControlModel.this.rebootPlay(true);
                }
            }
        });
    }

    public void onPlayPosition(int i, int i2) {
        this.mPlayingPosition = i;
        u.c(new age.m(getPlayerType(), i, i2));
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void onDownloaded(String str, long j) {
        LogUtils.i(TAG, "onDownloaded: " + str + " length=" + j);
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void onTimeLineChange() {
        u.c(new age.t(getPlayerType()));
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void onSetData(Bundle bundle) {
        ave.a a = new ave().a(bundle);
        if (a instanceof avf) {
            a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void changePlayer() {
        if (aei.a().c() != getPlayerType()) {
            aei.a().a(getPlayerType());
        }
    }

    private boolean isNotPlayable() {
        if (ags.a().g()) {
            ak.b(a.a, f.h.tips_can_not_play_reading);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void postInfoEvent() {
        u.c(new age.c(getPlayerType()));
    }
}
