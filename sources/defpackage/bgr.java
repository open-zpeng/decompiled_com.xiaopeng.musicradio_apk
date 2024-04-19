package defpackage;

import android.text.TextUtils;
import com.xiaopeng.speech.common.util.c;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AsrToTextNode.java */
/* renamed from: bgr  reason: default package */
/* loaded from: classes2.dex */
public class bgr {
    private bfo b;
    private bgq c;
    private String a = "AsrToTextNode";
    private String d = null;
    private boolean e = false;
    private final bfm f = new bfm() { // from class: bgr.1
        volatile int a;
        boolean b = false;
        String c = "";

        @Override // defpackage.bfm
        public void a(int i, int i2, int i3, String str, byte[] bArr) {
        }

        @Override // defpackage.bfm
        public void a(String str, boolean z) {
            String str2 = bgr.this.a;
            c.b(str2, "on result: " + str + ", last: " + z + ",state:" + this.a);
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString("text");
                this.c = a(optString);
                if (this.a == 3 && !z && TextUtils.isEmpty(optString)) {
                    jSONObject2.put("text", optString);
                    jSONObject2.put("last", true);
                    jSONObject2.put("messageCode", "401");
                    bgr.this.e = false;
                } else if (this.a == 4 && TextUtils.isEmpty(optString)) {
                    jSONObject2.put("text", optString);
                    jSONObject2.put("last", true);
                    jSONObject2.put("messageCode", "401");
                    bgr.this.e = false;
                } else {
                    jSONObject2.put("text", a(optString));
                    jSONObject2.put("last", z);
                    jSONObject2.put("messageCode", "200");
                }
                if (z) {
                    this.b = true;
                    this.c = "";
                    bgr.this.e = false;
                }
                if (bgr.this.c != null) {
                    bgr.this.c.a(jSONObject2.toString());
                }
            } catch (JSONException e) {
                e.fillInStackTrace();
            }
        }

        private String a(String str) {
            return !TextUtils.isEmpty(str) ? Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("") : "";
        }

        @Override // defpackage.bfm
        public void a(int i, String str) {
            String str2 = bgr.this.a;
            c.c(str2, "on error: " + i + ", info: " + str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("messageCode", "" + i);
                if (bgr.this.c != null) {
                    bgr.this.c.a(jSONObject.toString());
                }
                bgr.this.e = false;
            } catch (JSONException e) {
                e.fillInStackTrace();
            }
        }

        @Override // defpackage.bfm
        public void a(int i, int i2) {
            String str = bgr.this.a;
            c.a(str, "on onState " + i + ", info: " + i2);
            this.a = i;
            if (i == 6) {
                try {
                    if (!this.b) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("text", this.c);
                            jSONObject.put("last", true);
                            if (TextUtils.isEmpty(this.c)) {
                                jSONObject.put("messageCode", "401");
                            } else {
                                jSONObject.put("messageCode", "200");
                            }
                            if (bgr.this.c != null) {
                                bgr.this.c.a(jSONObject.toString());
                            }
                            bgr.this.e = false;
                        } catch (JSONException e) {
                            e.fillInStackTrace();
                        }
                        return;
                    }
                    this.c = "";
                    this.b = false;
                } finally {
                    this.c = "";
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsrToTextNode.java */
    /* renamed from: bgr$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final bgr a = new bgr();
    }

    public void a() {
        String str = this.a;
        c.b(str, "onConnect:" + this.c);
        if (this.c != null) {
            d();
        }
    }

    public void b() {
        String str = this.a;
        c.b(str, "onDisconnect:" + this.e + ",mListener:" + this.c);
        if (this.e) {
            this.b = null;
            this.e = false;
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("messageCode", "501");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.c.a(jSONObject.toString());
            }
        }
    }

    public static bgr c() {
        return a.a;
    }

    private bfo d() {
        if (this.b == null) {
            this.b = bfb.b().i();
            if (TextUtils.isEmpty(this.d) || this.d.equals("null")) {
                this.b.a("otp_audio_save_path", (String) null);
                this.b.a("otp_keep_audio_record", true);
                this.b.a("otp_enable_punct", true);
                this.b.a("otp_asr_buffer", false);
                this.b.a("otp_audio_format", 1);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(this.d);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof Integer) {
                            this.b.a(next, ((Integer) opt).intValue());
                        } else if (opt instanceof Boolean) {
                            this.b.a(next, ((Boolean) opt).booleanValue());
                        } else if (opt instanceof String) {
                            this.b.a(next, (String) opt);
                        }
                    }
                } catch (JSONException e) {
                    e.fillInStackTrace();
                }
            }
        }
        return this.b;
    }
}
