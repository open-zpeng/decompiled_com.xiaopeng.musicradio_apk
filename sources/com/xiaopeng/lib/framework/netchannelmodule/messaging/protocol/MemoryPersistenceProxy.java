package com.xiaopeng.lib.framework.netchannelmodule.messaging.protocol;

import android.util.Pair;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.info.BuildInfoUtils;
import java.util.Enumeration;
import java.util.Hashtable;
/* loaded from: classes.dex */
public class MemoryPersistenceProxy implements bkp {
    private static final int MAX_MESSAGE_NUMBER = 200;
    private static final String TAG = "MemoryPersistenceProxy";
    protected String mClientId;
    protected Hashtable<String, Pair<bku, Long>> mHashTable = new Hashtable<>();
    protected String mServerURI;
    protected boolean mTraceEnabled;

    private void log(String str) {
        if (BuildInfoUtils.isEngVersion() && this.mTraceEnabled) {
            LogUtils.d(TAG, str);
        }
    }

    public MemoryPersistenceProxy() {
        log("new MemoryPersistenceProxy");
    }

    private void checkOpen() {
        if (this.mHashTable == null) {
            throw new bkv();
        }
    }

    @Override // defpackage.bkp
    public void close() {
        log("close()");
    }

    @Override // defpackage.bkp
    public Enumeration keys() {
        checkOpen();
        Enumeration<String> keys = this.mHashTable.keys();
        log("keys():" + keys + " hasMoreElements:" + keys.hasMoreElements());
        return keys;
    }

    @Override // defpackage.bkp
    public bku get(String str) {
        checkOpen();
        bku bkuVar = (bku) this.mHashTable.get(str).first;
        log("get key:" + str + " result:" + bkuVar);
        return bkuVar;
    }

    @Override // defpackage.bkp
    public void open(String str, String str2) {
        log("open clientId:" + str + " serverURI:" + str2);
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("clientId or serverURI can't be null");
        }
        if (str.equals(this.mClientId) && str2.equals(this.mServerURI)) {
            log("same config, return!");
            return;
        }
        Hashtable<String, Pair<bku, Long>> hashtable = this.mHashTable;
        if (hashtable != null) {
            hashtable.clear();
        }
        this.mClientId = str;
        this.mServerURI = str2;
        this.mHashTable = new Hashtable<>();
    }

    @Override // defpackage.bkp
    public void put(String str, bku bkuVar) {
        checkOpen();
        log("put key:" + str + " persistable:" + bkuVar + " size:" + this.mHashTable.size());
        if (this.mHashTable.size() >= 200) {
            this.mHashTable.clear();
            log("exceed max persist count");
        }
        this.mHashTable.put(str, new Pair<>(bkuVar, Long.valueOf(System.currentTimeMillis())));
    }

    @Override // defpackage.bkp
    public void remove(String str) {
        checkOpen();
        log("remove key:" + str);
        this.mHashTable.remove(str);
    }

    @Override // defpackage.bkp
    public void clear() {
        checkOpen();
        log("clear");
        this.mHashTable.clear();
    }

    @Override // defpackage.bkp
    public boolean containsKey(String str) {
        checkOpen();
        boolean containsKey = this.mHashTable.containsKey(str);
        log("containsKey key:" + str + " result:" + containsKey);
        return containsKey;
    }

    public void setTraceEnabled(boolean z) {
        this.mTraceEnabled = z;
    }
}
