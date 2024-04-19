package com.xiaopeng.musicradio.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
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
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.xui.app.XToast;
import com.xiaopeng.xui.widget.XImageButton;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class WebViewLayout extends BaseFrameLayout {
    private LoadingTipsView c;
    private WebView d;
    private XImageButton e;
    private boolean f;
    private Disposable g;
    private boolean h;
    private long i;
    private String j;
    private Context k;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected BasePresenter a() {
        return null;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    public WebViewLayout(Context context) {
        super(context);
        this.k = context;
    }

    public WebViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = context;
    }

    public WebViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = context;
    }

    public void setData(String str) {
        this.j = str;
        e();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return f.g.webview_layout;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.e = (XImageButton) findViewById(f.C0131f.dialog_back);
        this.d = (WebView) findViewById(f.C0131f.web_view);
        this.c = (LoadingTipsView) findViewById(f.C0131f.loading_item);
        this.c.setAutoClickLoadingEnable(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.web.WebViewLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (WebViewLayout.this.c.getState() == 3 || WebViewLayout.this.c.getState() == 2) {
                    WebViewLayout.this.e();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.h = false;
        a(1);
        this.d.setVisibility(8);
        g();
        f();
        this.d.loadUrl(this.j);
    }

    private void f() {
        int i = NetUtils.isNetworkAvailable(this.k) ? -1 : 1;
        LogUtils.i("VipBuyLayout", "updateCacheMode:cacheMode=" + i);
        this.d.getSettings().setCacheMode(i);
    }

    private void a(int i) {
        this.c.setState(i);
        if (i == 1 || i == 3) {
            this.c.setClickable(false);
        } else {
            this.c.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }

    public void setCancleListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    private void g() {
        if (this.f) {
            return;
        }
        this.f = true;
        long currentTimeMillis = System.currentTimeMillis();
        LogUtils.i("VipBuyLayout", "WebView init time:" + (System.currentTimeMillis() - currentTimeMillis));
        WebView webView = this.d;
        webView.setBackgroundColor(0);
        webView.setLongClickable(true);
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xiaopeng.musicradio.web.WebViewLayout.2
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends WebViewClient {
        public a(WebView webView) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Log.e("VipBuyLayout", "onReceivedError:" + str);
            super.onReceivedError(webView, i, str, str2);
            WebViewLayout.this.h = true;
            WebViewLayout webViewLayout = WebViewLayout.this;
            webViewLayout.a(webViewLayout.h);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Log.e("VipBuyLayout", "onReceivedError:" + webResourceError.getErrorCode() + ListSignBean.COLLECTID_SUFFIX + ((Object) webResourceError.getDescription()));
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            WebViewLayout.this.h = true;
            WebViewLayout webViewLayout = WebViewLayout.this;
            webViewLayout.a(webViewLayout.h);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.e("VipBuyLayout", "onPageStarted");
            WebViewLayout.this.i = System.currentTimeMillis();
            super.onPageStarted(webView, str, bitmap);
            WebViewLayout.this.h();
            WebViewLayout.this.d.setBackgroundColor(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Log.e("VipBuyLayout", "onPageFinished:mLoadingFailed=" + WebViewLayout.this.h);
            super.onPageFinished(webView, str);
            WebViewLayout webViewLayout = WebViewLayout.this;
            webViewLayout.a(webViewLayout.h ^ true);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Log.e("VipBuyLayout", "onReceivedSslError");
            sslErrorHandler.proceed();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Log.e("VipBuyLayout", "shouldOverrideUrlLoading:" + webResourceRequest.getUrl() + " ," + webResourceRequest.isRedirect());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.e("VipBuyLayout", "shouldOverrideUrlLoading:" + str);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.g = Flowable.timer(30000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.xiaopeng.musicradio.web.WebViewLayout.3
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Long l) {
                WebViewLayout.this.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        i();
        j();
        if (z) {
            this.d.setVisibility(0);
            a(0);
        } else {
            this.d.setVisibility(8);
            a(2);
        }
        LogUtils.i("VipBuyLayout", "onLoadingFinished:time=" + (System.currentTimeMillis() - this.i) + ",success=" + z);
    }

    private void i() {
        Disposable disposable = this.g;
        if (disposable != null && !disposable.isDisposed()) {
            this.g.dispose();
        }
        this.g = null;
    }

    private void j() {
        a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        int progress = this.d.getProgress();
        LogUtils.i("VipBuyLayout", "onLoadingTimeOut:progress=" + progress + ",time=" + (System.currentTimeMillis() - this.i));
        if (progress < 100) {
            this.h = true;
            this.d.stopLoading();
        }
    }
}
