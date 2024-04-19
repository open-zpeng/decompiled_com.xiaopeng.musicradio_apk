package com.xiaopeng.speech.protocol.node.music.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.xiaopeng.speech.common.bean.BaseBean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SearchMusic extends BaseBean {
    public static final Parcelable.Creator<SearchMusic> CREATOR = new Parcelable.Creator<SearchMusic>() { // from class: com.xiaopeng.speech.protocol.node.music.bean.SearchMusic.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SearchMusic createFromParcel(Parcel parcel) {
            return new SearchMusic(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SearchMusic[] newArray(int i) {
            return new SearchMusic[i];
        }
    };
    private String age;
    private String album;
    private String artist;
    private String genre;
    private String language;
    private String mode;
    private String module;
    private String mood;
    private String region;
    private String theme;
    private String title;
    private String type;

    @Override // com.xiaopeng.speech.common.bean.BaseBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SearchMusic() {
    }

    protected SearchMusic(Parcel parcel) {
        super(parcel);
        this.artist = parcel.readString();
        this.title = parcel.readString();
        this.album = parcel.readString();
        this.module = parcel.readString();
        this.genre = parcel.readString();
        this.age = parcel.readString();
        this.region = parcel.readString();
        this.mood = parcel.readString();
        this.theme = parcel.readString();
        this.language = parcel.readString();
        this.type = parcel.readString();
        this.mode = parcel.readString();
    }

    public static SearchMusic a(String str) {
        try {
            return a(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static SearchMusic a(JSONObject jSONObject) {
        SearchMusic searchMusic = new SearchMusic();
        try {
            searchMusic.c(jSONObject.optString("album"));
            searchMusic.b(jSONObject.optString("artist"));
            searchMusic.setTitle(jSONObject.optString("title"));
            searchMusic.d(jSONObject.optString("module"));
            searchMusic.f(jSONObject.optString("age"));
            searchMusic.e(jSONObject.optString("gen"));
            searchMusic.h(jSONObject.optString("mood"));
            searchMusic.g(jSONObject.optString(TtmlNode.TAG_REGION));
            searchMusic.i(jSONObject.optString("theme"));
            searchMusic.j(jSONObject.optString("lan"));
            searchMusic.k(jSONObject.optString("typ"));
            searchMusic.l(jSONObject.optString("mode"));
            if (TextUtils.isEmpty(searchMusic.b()) && TextUtils.isEmpty(searchMusic.a()) && TextUtils.isEmpty(searchMusic.getTitle()) && TextUtils.isEmpty(searchMusic.c()) && TextUtils.isEmpty(searchMusic.e()) && TextUtils.isEmpty(searchMusic.d()) && TextUtils.isEmpty(searchMusic.g()) && TextUtils.isEmpty(searchMusic.f()) && TextUtils.isEmpty(searchMusic.h()) && TextUtils.isEmpty(searchMusic.i()) && TextUtils.isEmpty(searchMusic.j())) {
                throw new IllegalArgumentException("Album, artist, module, title and age are all empty string !");
            }
            return searchMusic;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String a() {
        return this.artist;
    }

    public void b(String str) {
        this.artist = str;
    }

    @Override // com.xiaopeng.speech.common.bean.BaseBean
    public String getTitle() {
        return this.title;
    }

    @Override // com.xiaopeng.speech.common.bean.BaseBean
    public void setTitle(String str) {
        this.title = str;
    }

    public String b() {
        return this.album;
    }

    public void c(String str) {
        this.album = str;
    }

    public String c() {
        return this.module;
    }

    public void d(String str) {
        this.module = str;
    }

    public String d() {
        return this.genre;
    }

    public void e(String str) {
        this.genre = str;
    }

    public String e() {
        return this.age;
    }

    public void f(String str) {
        this.age = str;
    }

    public String f() {
        return this.region;
    }

    public void g(String str) {
        this.region = str;
    }

    public String g() {
        return this.mood;
    }

    public void h(String str) {
        this.mood = str;
    }

    public String h() {
        return this.theme;
    }

    public void i(String str) {
        this.theme = str;
    }

    public String i() {
        return this.language;
    }

    public void j(String str) {
        this.language = str;
    }

    public String j() {
        return this.type;
    }

    public void k(String str) {
        this.type = str;
    }

    public void l(String str) {
        this.mode = str;
    }

    public String toString() {
        return "SearchMusic{artist='" + this.artist + "', title='" + this.title + "', album='" + this.album + "', module='" + this.module + "', genre='" + this.genre + "', language='" + this.language + "', age='" + this.age + "', region='" + this.region + "', mood='" + this.mood + "', theme='" + this.theme + "', type='" + this.type + "', mode='" + this.mode + "'}";
    }

    @Override // com.xiaopeng.speech.common.bean.BaseBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.artist);
        parcel.writeString(this.title);
        parcel.writeString(this.album);
        parcel.writeString(this.module);
        parcel.writeString(this.genre);
        parcel.writeString(this.language);
        parcel.writeString(this.age);
        parcel.writeString(this.region);
        parcel.writeString(this.mood);
        parcel.writeString(this.theme);
        parcel.writeString(this.type);
        parcel.writeString(this.mode);
    }
}
