package com.xiaopeng.musicradio.player;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.xiaopeng.musicradio.player.e;
/* loaded from: classes2.dex */
public class PlayerService extends Service {
    private g a;
    private c b;
    private final e.a c = new e.a() { // from class: com.xiaopeng.musicradio.player.PlayerService.1
        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i) {
            try {
                Log.i("PlayerService", "start: " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.start();
                }
            } catch (Exception e) {
                Log.e("PlayerService", "start: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void b(int i) {
            try {
                Log.i("PlayerService", "startSeek: " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.startSeek();
                }
            } catch (Exception e) {
                Log.e("PlayerService", "startSeek: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void c(int i) {
            try {
                Log.i("PlayerService", "pause: " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.pause();
                }
            } catch (Exception e) {
                Log.e("PlayerService", "pause: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i, String str) {
            try {
                Log.i("PlayerService", "prepare: type = " + i + " uri = " + str);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.prepareData(str);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "prepare: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i, String str, boolean z) {
            try {
                Log.i("PlayerService", "prepareNewPlay: type = " + i + " uri = " + str + " newPlay = " + z);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.prepareData(str, z);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "prepareNewPlay: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i, String str, boolean z, boolean z2) {
            try {
                Log.i("PlayerService", "prepareNewPlay: type = " + i + " uri = " + str + " newPlay = " + z + " cache = " + z2);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.prepareData(str, z, z2);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "prepareUseCache: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i, String str, boolean z, boolean z2, boolean z3) {
            try {
                Log.i("PlayerService", "prepareNewPlay: type = " + i + " uri = " + str + " newPlay = " + z + " cache = " + z2 + " playWhenReady = " + z3);
                avo a = PlayerService.this.a(i);
                p wrapCache = a != null ? a.wrapCache(str) : null;
                avo a2 = PlayerService.this.a(i);
                if (a2 != null) {
                    a2.setMeter(wrapCache);
                    a2.prepareData(str, z, z2, z3);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "preparePlayWhenReady: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i, int i2) {
            try {
                Log.i("PlayerService", "seekTo: type = " + i + " second = " + i2);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.seekTo(i2);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "seekTo: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i, float f, float f2) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.setVolume(f, f2);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "setVolume: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void d(int i) {
            try {
                Log.i("PlayerService", "stop: " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.stop();
                }
            } catch (Exception e) {
                Log.e("PlayerService", "stop: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void e(int i) {
            try {
                Log.i("PlayerService", "reset: " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.reset();
                }
            } catch (Exception e) {
                Log.e("PlayerService", "reset: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void f(int i) {
            try {
                Log.i("PlayerService", "release: " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.release();
                }
            } catch (Exception e) {
                Log.e("PlayerService", "release: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public boolean g(int i) {
            try {
                Log.i("PlayerService", "isIdle: " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    return a.isIdle();
                }
                return false;
            } catch (Exception e) {
                Log.e("PlayerService", "isIdle: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public int h(int i) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    return a.getCurrentPosition();
                }
                return 0;
            } catch (Exception e) {
                Log.e("PlayerService", "getCurrentPosition: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public int i(int i) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    return a.getSecondPosition();
                }
                return 0;
            } catch (Exception e) {
                Log.e("PlayerService", "getSecondPosition: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public boolean j(int i) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    return a.isPlaying();
                }
                return false;
            } catch (Exception e) {
                Log.e("PlayerService", "isPlaying: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public int k(int i) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    return a.getDuration();
                }
                return 0;
            } catch (Exception e) {
                Log.e("PlayerService", "getDuration: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public boolean b(int i, String str) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    return a.isCacheComplete(str);
                }
                return false;
            } catch (Exception e) {
                Log.e("PlayerService", "isCacheComplete: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void c(int i, String str) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.removeCache(str);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "removeCache: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public int m(int i) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    return a.getSessionId();
                }
                return -1;
            } catch (Exception e) {
                Log.e("PlayerService", "getPlaybackState: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public int l(int i) {
            try {
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    return a.getPlaybackState();
                }
                return 0;
            } catch (Exception e) {
                Log.e("PlayerService", "getPlaybackState: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(c cVar) {
            Log.i("PlayerService", "registerClientInterface: " + cVar);
            PlayerService.this.b = cVar;
            PlayerService.this.a.a(PlayerService.this.b);
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i, Bundle bundle) {
            try {
                Log.d("PlayerService", "setData: type = " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.setData(bundle);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "setData: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e.a, android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                return super.onTransact(i, parcel, parcel2, i2);
            } catch (Exception e) {
                Log.e("PlayerService", "onTransact: ", e);
                throw e;
            }
        }

        @Override // com.xiaopeng.musicradio.player.e
        public void a(int i, float f) {
            try {
                Log.i("PlayerService", "setPlaySpeed: type = " + i);
                avo a = PlayerService.this.a(i);
                if (a != null) {
                    a.setPlaySpeed(f);
                }
            } catch (Exception e) {
                Log.e("PlayerService", "setPlaySpeed: ", e);
                throw e;
            }
        }
    };

    private void b() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public avo a(int i) {
        return this.a.a(i, this.b);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.i("PlayerService", "onCreate: ");
        a();
    }

    private void a() {
        b();
        this.a = g.a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.i("PlayerService", "onDestroy: ");
        this.a.b();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.c;
    }
}
