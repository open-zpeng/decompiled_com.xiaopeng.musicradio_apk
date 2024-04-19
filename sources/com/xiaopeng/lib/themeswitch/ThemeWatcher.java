package com.xiaopeng.lib.themeswitch;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import com.xiaopeng.lib.themeswitch.Switcher;
import com.xiaopeng.lib.themeswitch.bean.PageTheme;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class ThemeWatcher implements Switcher.OnSwitchFinishListener {
    private static final String EXTRA_THEME_TYPE = "extra_theme_type";
    private static final String META_DATA_XP_THEME_DAY = "xp_theme_day";
    private static final String META_DATA_XP_THEME_NIGHT = "xp_theme_night";
    private static final String TAG = "ThemeWatcher";
    public static final int THEME_TYPE_AUTO = 3;
    public static final int THEME_TYPE_DAY = 1;
    public static final int THEME_TYPE_NIGHT = 2;
    public static final int THEME_TYPE_NULL = 0;
    private Context mContext;
    private Map<String, PageTheme> mCurrentPageThemeMap;
    private int mCurrentTheme;
    private int mDayStyle;
    private int mNextThemeWaitingForSwitch;
    private int mNightStyle;
    private Set<OnThemeSwitchListener> mThemeSwitchListenerSet;
    private Switcher mThemeSwitcher;

    /* loaded from: classes.dex */
    public interface OnThemeSwitchListener {
        void onSwitchTheme(int i);
    }

    private ThemeWatcher() {
        this.mNextThemeWaitingForSwitch = 0;
        this.mDayStyle = 0;
        this.mNightStyle = 0;
        this.mThemeSwitchListenerSet = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @Override // com.xiaopeng.lib.themeswitch.Switcher.OnSwitchFinishListener
    public void onSwitchFinish() {
        Log.d(TAG, "notify listeners: current theme is: " + getCurrentTheme());
        OnThemeSwitchListener[] onThemeSwitchListenerArr = (OnThemeSwitchListener[]) this.mThemeSwitchListenerSet.toArray(new OnThemeSwitchListener[0]);
        int length = onThemeSwitchListenerArr.length;
        for (int i = 0; i < length; i++) {
            onThemeSwitchListenerArr[i].onSwitchTheme(getCurrentTheme());
        }
        int i2 = this.mNextThemeWaitingForSwitch;
        if (i2 != 0) {
            this.mNextThemeWaitingForSwitch = 0;
            Log.d(TAG, "JTry to switch Theme onSwitchFinish to switchTheme to " + i2);
            switchTheme(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SingletonHolder {
        static ThemeWatcher sInstance = new ThemeWatcher();

        private SingletonHolder() {
        }
    }

    public static ThemeWatcher getInstance() {
        return SingletonHolder.sInstance;
    }

    public void init(Context context, int... iArr) {
        this.mContext = context;
        this.mThemeSwitcher = new Switcher(context);
        this.mThemeSwitcher.addNewThemeResource(iArr);
        this.mThemeSwitcher.setOnSwitchFinishListener(this);
        setAppStartingWindow();
        loadThemeSettings(context);
        observeThemeChange(context, new Handler(Looper.getMainLooper()));
    }

    private void observeThemeChange(final Context context, Handler handler) {
        final Uri uriFor = Settings.Secure.getUriFor("ui_night_mode");
        context.getContentResolver().registerContentObserver(uriFor, true, new ContentObserver(handler) { // from class: com.xiaopeng.lib.themeswitch.ThemeWatcher.1
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return super.deliverSelfNotifications();
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                super.onChange(z, uri);
                Log.i(ThemeWatcher.TAG, "<<< on Theme mode changed:" + uri.toString());
                if (uriFor.toString().equals(uri.toString())) {
                    if (acs.e(context)) {
                        ThreadPoolHelper.postMainThread(new Runnable() { // from class: com.xiaopeng.lib.themeswitch.ThemeWatcher.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ThemeWatcher.this.switchTheme(ThemeWatcher.this.getCurrentSystemTheme(context));
                            }
                        }, 500L);
                        return;
                    }
                    ThemeWatcher themeWatcher = ThemeWatcher.this;
                    themeWatcher.switchTheme(themeWatcher.getCurrentSystemTheme(context));
                }
            }
        });
    }

    private void loadThemeSettings(final Context context) {
        ThreadPoolHelper.postBackground(new Runnable() { // from class: com.xiaopeng.lib.themeswitch.ThemeWatcher.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ThemeWatcher.this.mCurrentPageThemeMap = XmlParser.parseXMLWithPull(context.getAssets().open("theme_night.xml"));
                    Log.d(ThemeWatcher.TAG, "start parse theme settings.");
                } catch (IOException unused) {
                    Log.d(ThemeWatcher.TAG, "parse theme settings failed.");
                }
            }
        });
    }

    public PageTheme getPageTheme(String str) {
        Map<String, PageTheme> map;
        if (str == null || (map = this.mCurrentPageThemeMap) == null) {
            return null;
        }
        return map.get(str);
    }

    public void release() {
        Set<OnThemeSwitchListener> set = this.mThemeSwitchListenerSet;
        if (set == null || set.isEmpty()) {
            return;
        }
        this.mThemeSwitchListenerSet.clear();
    }

    private void setAppStartingWindow() {
        try {
            ApplicationInfo applicationInfo = this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                this.mDayStyle = applicationInfo.metaData.getInt(META_DATA_XP_THEME_DAY);
                this.mNightStyle = applicationInfo.metaData.getInt(META_DATA_XP_THEME_NIGHT);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (this.mNightStyle == 0) {
            this.mNightStyle = this.mDayStyle;
        }
        Log.d(TAG, "setAppStartingWindow mDayStyle=" + this.mDayStyle + "; mNightStyle=" + this.mNightStyle);
    }

    public void register(View view, String str) {
        this.mThemeSwitcher.register(view, str);
    }

    public void registerWithoutRepeat(View view, String str, String str2) {
        this.mThemeSwitcher.registerWithoutRepeat(view, str, str2);
    }

    public void unregister(String str) {
        this.mThemeSwitcher.unregister(str);
    }

    public String newThemeNameForRepeatView(String str) {
        return this.mThemeSwitcher.newThemeNameForRepeatView(str);
    }

    public int getCurrentTheme() {
        return this.mCurrentTheme;
    }

    public boolean isNight() {
        return acs.d(this.mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchTheme(int i) {
        Log.d(TAG, "<<<< JTry to switch Theme  current=" + getCurrentTheme() + "; target=" + i + "; is switching=" + this.mThemeSwitcher.isSwitching());
        if (i == getCurrentTheme()) {
            this.mNextThemeWaitingForSwitch = 0;
            Log.d(TAG, "<<<< current theme has been target type: " + i);
        } else if (this.mThemeSwitcher.isSwitching()) {
            this.mNextThemeWaitingForSwitch = i;
            Log.d(TAG, "<<<< waiting for switchTheme to " + i);
        } else if (i == 1 || i == 2) {
            this.mCurrentTheme = i;
            Log.d(TAG, "<<<< JTry to switch Theme do switchTheme to " + i);
            switch (i) {
                case 1:
                    this.mThemeSwitcher.switch2Day();
                    return;
                case 2:
                    this.mThemeSwitcher.switch2Night();
                    return;
                default:
                    return;
            }
        }
    }

    public void addThemeSwitchListener(OnThemeSwitchListener onThemeSwitchListener) {
        this.mThemeSwitchListenerSet.add(onThemeSwitchListener);
    }

    public void removeThemeListener(OnThemeSwitchListener onThemeSwitchListener) {
        this.mThemeSwitchListenerSet.remove(onThemeSwitchListener);
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.i(TAG, "<<< on Configuration changed.");
        if (acs.b(configuration)) {
            switchTheme(getCurrentSystemTheme(this.mContext));
        }
    }

    public void onCreate(Context context) {
        switchTheme(getCurrentSystemTheme(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentSystemTheme(Context context) {
        return acs.d(context) ? 2 : 1;
    }
}
