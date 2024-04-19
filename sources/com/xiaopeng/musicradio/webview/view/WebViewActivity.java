package com.xiaopeng.musicradio.webview.view;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.CookieManager;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.apirouter.server.ApiPublisherProvider;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.webview.presenter.WebViewPresenter;
import com.xiaopeng.xui.app.XToast;
import com.xiaopeng.xui.theme.XThemeManager;
import defpackage.bdm;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
@Route(path = "/webview/webview")
/* loaded from: classes2.dex */
public class WebViewActivity extends com.xiaopeng.musicradio.commonui.base.c<bdo, Object, WebViewPresenter> {
    @Autowired(name = "dayUrl")
    public String g;
    @Autowired(name = "nightUrl")
    public String h;
    @Autowired(name = "titleEnable")
    public boolean i;
    private bdq j;
    private boolean k;
    private Disposable l;
    private boolean m;
    private String n;
    private long o;
    private Runnable p;

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "WebViewActivity";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    protected int f() {
        return bdm.d.activity_web_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public WebViewPresenter e() {
        return new WebViewPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.b();
        if (ApiPublisherProvider.a == null) {
            ApiPublisherProvider.a = getApplicationContext();
        }
        u();
        a(true);
        findViewById(bdm.c.btn_back).setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.webview.view.WebViewActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebViewActivity.this.onBackPressed();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        Runnable runnable = this.p;
        if (runnable != null) {
            ban.b(runnable, 100L);
            this.p = null;
        }
    }

    private void s() {
        a(false);
    }

    private void a(boolean z) {
        this.p = null;
        this.m = false;
        B();
        if (z) {
            this.p = new Runnable() { // from class: com.xiaopeng.musicradio.webview.view.WebViewActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    WebViewActivity.this.t();
                }
            };
        } else {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        z();
        y();
        this.n = (TextUtils.isEmpty(this.h) || !acs.d(com.xiaopeng.musicradio.a.a())) ? this.g : this.h;
        ((bdo) this.f).h.loadUrl(this.n);
    }

    private void u() {
        sp.a().a(this);
        LogUtils.i("WebViewActivity", "initIntent:dayUrl=" + this.g + ", nightUrl=" + this.h);
        int dimensionPixelSize = this.i ? ((bdo) this.f).h.getResources().getDimensionPixelSize(bdm.a.x_title_bar_height) : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((bdo) this.f).j.getLayoutParams();
        marginLayoutParams.topMargin = dimensionPixelSize;
        ((bdo) this.f).j.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.j.c.setEnabled(false);
        r();
        x();
        s();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        x();
        ((bdo) this.f).h.setWebChromeClient(null);
        c.a();
        super.onDestroy();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity
    protected void onStop() {
        super.onStop();
        runOnUiThread(new Runnable() { // from class: com.xiaopeng.musicradio.webview.view.WebViewActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (WebViewActivity.this.isFinishing()) {
                    return;
                }
                WebViewActivity.this.finish();
            }
        });
    }

    private void w() {
        Disposable disposable = this.l;
        if (disposable != null && !disposable.isDisposed()) {
            this.l.dispose();
        }
        this.l = null;
    }

    @Override // androidx.activity.b, android.app.Activity
    public void onBackPressed() {
        if (E()) {
            return;
        }
        finish();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x();
        setIntent(intent);
        u();
        s();
    }

    private void x() {
        ((bdo) this.f).h.stopLoading();
        w();
    }

    private void y() {
        int i = NetUtils.isNetworkAvailable(this) ? -1 : 1;
        LogUtils.i("WebViewActivity", "updateCacheMode:cacheMode=" + i);
        ((bdo) this.f).h.getSettings().setCacheMode(i);
    }

    private void z() {
        if (this.k) {
            return;
        }
        this.k = true;
        long currentTimeMillis = System.currentTimeMillis();
        LogUtils.i("WebViewActivity", "WebView init time:" + (System.currentTimeMillis() - currentTimeMillis));
        WebView webView = ((bdo) this.f).h;
        webView.setBackgroundColor(0);
        webView.setLongClickable(true);
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xiaopeng.musicradio.webview.view.WebViewActivity.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        });
        webView.setWebChromeClient(new b());
        webView.setWebViewClient(new a(webView));
        WebSettings settings = webView.getSettings();
        settings.setDefaultTextEncodingName("utf-8");
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setMixedContentMode(0);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.i) {
            ((bdo) this.f).g.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        int progress = ((bdo) this.f).h.getProgress();
        LogUtils.i("WebViewActivity", "onLoadingTimeOut:progress=" + progress + ",time=" + (System.currentTimeMillis() - this.o));
        if (progress < 100) {
            this.m = true;
            ((bdo) this.f).h.stopLoading();
        }
    }

    private void B() {
        if (((bdo) this.f).f.getVisibility() != 0) {
            ((bdo) this.f).d.setVisibility(0);
            ((bdo) this.f).f.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        this.l = Flowable.timer(30000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.xiaopeng.musicradio.webview.view.WebViewActivity.5
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Long l) {
                WebViewActivity.this.A();
            }
        });
    }

    private void D() {
        if (((bdo) this.f).f.getVisibility() == 0) {
            ((bdo) this.f).d.setVisibility(8);
            ((bdo) this.f).f.setVisibility(8);
        }
    }

    public void q() {
        if (this.j == null) {
            ViewStub b2 = ((bdo) this.f).e.b();
            if (b2 != null) {
                b2.inflate();
            }
            this.j = (bdq) ((bdo) this.f).e.a();
        }
        this.j.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.webview.view.WebViewActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebViewActivity.this.v();
            }
        });
        this.j.c.setEnabled(true);
        if (this.j.d.getVisibility() != 0) {
            this.j.d.setVisibility(0);
        }
        ((bdo) this.f).h.setVisibility(4);
        ((bdo) this.f).i.setVisibility(4);
    }

    public void r() {
        bdq bdqVar = this.j;
        if (bdqVar == null) {
            return;
        }
        if (bdqVar.d.getVisibility() == 0) {
            this.j.d.setVisibility(8);
        }
        ((bdo) this.f).h.setVisibility(0);
        if (TextUtils.isEmpty(this.h)) {
            ((bdo) this.f).i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        w();
        D();
        if (z) {
            r();
        } else {
            q();
        }
        LogUtils.i("WebViewActivity", "onLoadingFinished:time=" + (System.currentTimeMillis() - this.o) + ",success=" + z);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!XThemeManager.isThemeChanged(configuration) || TextUtils.isEmpty(this.h)) {
            return;
        }
        XThemeManager.setWindowBackgroundResource(configuration, getWindow(), bdm.b.x_bg_app);
        t();
    }

    private boolean E() {
        if (this.f == 0 || !((bdo) this.f).h.canGoBack()) {
            return false;
        }
        ((bdo) this.f).h.goBack();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        private b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            XToast.showLong(str2);
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (TextUtils.isEmpty(str) || str.startsWith("http")) {
                return;
            }
            WebViewActivity.this.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends WebViewClient {
        public a(WebView webView) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Log.e("WebViewActivity", "onReceivedError:" + str);
            super.onReceivedError(webView, i, str, str2);
            if (!bds.a(str)) {
                WebViewActivity.this.m = true;
                ((bdo) WebViewActivity.this.f).h.stopLoading();
                return;
            }
            ((bdo) WebViewActivity.this.f).h.setBackgroundColor(-1);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Log.e("WebViewActivity", "onReceivedError:" + webResourceError.getErrorCode() + ListSignBean.COLLECTID_SUFFIX + ((Object) webResourceError.getDescription()));
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (!bds.a(webResourceError)) {
                WebViewActivity.this.m = true;
                ((bdo) WebViewActivity.this.f).h.stopLoading();
                return;
            }
            ((bdo) WebViewActivity.this.f).h.setBackgroundColor(-1);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.e("WebViewActivity", "onPageStarted");
            WebViewActivity.this.o = System.currentTimeMillis();
            super.onPageStarted(webView, str, bitmap);
            WebViewActivity.this.C();
            ((bdo) WebViewActivity.this.f).h.setBackgroundColor(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Log.e("WebViewActivity", "onPageFinished:mLoadingFailed=" + WebViewActivity.this.m);
            super.onPageFinished(webView, str);
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.b(webViewActivity.m ^ true);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Log.e("WebViewActivity", "onReceivedSslError");
            sslErrorHandler.proceed();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Log.e("WebViewActivity", "shouldOverrideUrlLoading:" + webResourceRequest.getUrl() + " ," + webResourceRequest.isRedirect());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.e("WebViewActivity", "shouldOverrideUrlLoading:" + str);
            return false;
        }
    }

    /* loaded from: classes2.dex */
    static class c {
        private static Disposable a;

        public static void a() {
            b();
            a = Flowable.timer(2L, TimeUnit.MINUTES).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.xiaopeng.musicradio.webview.view.WebViewActivity.c.1
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Long l) {
                    int myPid = Process.myPid();
                    LogUtils.i("WebViewActivity", "killSelf:" + myPid);
                    Process.killProcess(myPid);
                }
            });
        }

        public static void b() {
            Disposable disposable = a;
            if (disposable != null && !disposable.isDisposed()) {
                a.dispose();
            }
            a = null;
        }
    }
}
