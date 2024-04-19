package defpackage;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* compiled from: JSR47Logger.java */
/* renamed from: bmz  reason: default package */
/* loaded from: classes3.dex */
public class bmz implements bna {
    private Logger a = null;
    private ResourceBundle b = null;
    private ResourceBundle c = null;
    private String d = null;
    private String e = null;
    private String f = null;

    @Override // defpackage.bna
    public void initialise(ResourceBundle resourceBundle, String str, String str2) {
        this.c = this.b;
        this.e = str2;
        this.f = str;
        this.a = Logger.getLogger(this.f);
        this.b = resourceBundle;
        this.c = resourceBundle;
        this.d = this.b.getString("0");
    }

    @Override // defpackage.bna
    public void setResourceName(String str) {
        this.e = str;
    }

    @Override // defpackage.bna
    public boolean isLoggable(int i) {
        return this.a.isLoggable(a(i));
    }

    @Override // defpackage.bna
    public void severe(String str, String str2, String str3, Object[] objArr) {
        a(1, str, str2, str3, objArr, null);
    }

    @Override // defpackage.bna
    public void warning(String str, String str2, String str3) {
        a(2, str, str2, str3, null, null);
    }

    @Override // defpackage.bna
    public void warning(String str, String str2, String str3, Object[] objArr) {
        a(2, str, str2, str3, objArr, null);
    }

    public void a(int i, String str, String str2, String str3, Object[] objArr, Throwable th) {
        Level a = a(i);
        if (this.a.isLoggable(a)) {
            a(a, str, str2, this.d, this.b, str3, objArr, th);
        }
    }

    @Override // defpackage.bna
    public void fine(String str, String str2, String str3) {
        b(5, str, str2, str3, null, null);
    }

    @Override // defpackage.bna
    public void fine(String str, String str2, String str3, Object[] objArr) {
        b(5, str, str2, str3, objArr, null);
    }

    @Override // defpackage.bna
    public void fine(String str, String str2, String str3, Object[] objArr, Throwable th) {
        b(5, str, str2, str3, objArr, th);
    }

    @Override // defpackage.bna
    public void finer(String str, String str2, String str3) {
        b(6, str, str2, str3, null, null);
    }

    public void b(int i, String str, String str2, String str3, Object[] objArr, Throwable th) {
        Level a = a(i);
        if (this.a.isLoggable(a)) {
            a(a, str, str2, this.d, this.c, str3, objArr, th);
        }
    }

    private String a(ResourceBundle resourceBundle, String str) {
        try {
            return resourceBundle.getString(str);
        } catch (MissingResourceException unused) {
            return str;
        }
    }

    private void a(Level level, String str, String str2, String str3, ResourceBundle resourceBundle, String str4, Object[] objArr, Throwable th) {
        if (str4.indexOf("=====") == -1) {
            str4 = MessageFormat.format(a(resourceBundle, str4), objArr);
        }
        LogRecord logRecord = new LogRecord(level, String.valueOf(this.e) + ": " + str4);
        logRecord.setSourceClassName(str);
        logRecord.setSourceMethodName(str2);
        logRecord.setLoggerName(this.f);
        if (th != null) {
            logRecord.setThrown(th);
        }
        this.a.log(logRecord);
    }

    private Level a(int i) {
        switch (i) {
            case 1:
                return Level.SEVERE;
            case 2:
                return Level.WARNING;
            case 3:
                return Level.INFO;
            case 4:
                return Level.CONFIG;
            case 5:
                return Level.FINE;
            case 6:
                return Level.FINER;
            case 7:
                return Level.FINEST;
            default:
                return null;
        }
    }
}
