package com.xiaopeng.musicradio.model.bluetooth;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import java.util.HashMap;
/* compiled from: BtOperationBean.java */
/* loaded from: classes.dex */
public class b {
    private static HashMap<String, Long> d = new HashMap<String, Long>() { // from class: com.xiaopeng.musicradio.model.bluetooth.b.1
    };
    private static HashMap<String, Integer> f = new HashMap<String, Integer>() { // from class: com.xiaopeng.musicradio.model.bluetooth.b.2
        {
            put("bt_get_meta", Integer.valueOf((int) IInputController.KEYCODE_KNOB_WIND_SPD_UP));
            put("bt_get_play_status", Integer.valueOf((int) IInputController.KEYCODE_KNOB_WIND_SPD_UP));
            put("bt_get_play_status", Integer.valueOf((int) IInputController.KEYCODE_KNOB_WIND_SPD_UP));
            put("bt_play", 800);
            put("bt_pause", 800);
            put("bt_next", 800);
            put("bt_prev", 800);
        }
    };
    private String a;
    private int e = 0;
    private long b = System.currentTimeMillis();
    private HashMap<String, Object> c = new HashMap<>();

    public b(String str) {
        this.a = str;
    }

    public long a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public HashMap<String, Object> c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str = bVar.a;
            String str2 = this.a;
            return str == str2 && f.containsKey(str2) && (num = f.get(this.a)) != null && Math.abs(bVar.b - this.b) < ((long) num.intValue());
        }
        return false;
    }

    public String toString() {
        return String.format("BtOperationBean[code:%s, ts:%d, retry:%d]", this.a, Long.valueOf(this.b), Integer.valueOf(this.e));
    }
}
