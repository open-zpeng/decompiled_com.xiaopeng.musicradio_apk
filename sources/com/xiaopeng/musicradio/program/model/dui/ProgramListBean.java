package com.xiaopeng.musicradio.program.model.dui;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.xiaopeng.libconfig.ipc.IpcConfig;
import com.xiaopeng.musicradio.bean.search.DuiSemanticBean;
import com.xiaopeng.musicradio.utils.z;
import org.json.JSONException;
import org.json.JSONObject;
@Keep
/* loaded from: classes2.dex */
public class ProgramListBean {
    private String extData;
    private String keyWord;
    private int listed;
    private String metaDataList;
    private String metadata;
    private String page;
    private String params;
    private String query;
    private int searchType;
    private DuiSemanticBean semantic;
    private String source;
    private String tracks;

    public static ProgramListBean fromJson(String str) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("param")) {
                jSONObject = new JSONObject(jSONObject2.optString("param"));
            } else if (jSONObject2.has("from") && "dui_xp".equals(jSONObject2.optString("from"))) {
                return null;
            } else {
                jSONObject = jSONObject2;
            }
            return fromJson(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ProgramListBean fromJson(JSONObject jSONObject) {
        ProgramListBean programListBean = new ProgramListBean();
        if (jSONObject != null) {
            programListBean.setParams(jSONObject.optString(IpcConfig.DeviceCommunicationConfig.KEY_APP_MESSAGE_PARAMS));
            programListBean.setTracks(jSONObject.optString("tracks"));
            programListBean.setPage(jSONObject.optString("page"));
            programListBean.setMetadata(jSONObject.optString(TtmlNode.TAG_METADATA));
            programListBean.setSource(jSONObject.optString("source"));
            programListBean.setKeyWord(jSONObject.optString("keyWord"));
            programListBean.setSearchType(jSONObject.optInt("searchType"));
            programListBean.setListed(jSONObject.optInt("listed"));
            programListBean.setExtData(jSONObject.optString("extData"));
            programListBean.setMetaDataList(jSONObject.optString("metaDataList"));
            programListBean.setQuery(jSONObject.optString("query"));
            String optString = jSONObject.optString("semantic");
            if (!TextUtils.isEmpty(optString)) {
                programListBean.setSemantic((DuiSemanticBean) z.a(optString, (Class<Object>) DuiSemanticBean.class));
            }
        }
        return programListBean;
    }

    public String getParams() {
        return this.params;
    }

    public String getTracks() {
        return this.tracks;
    }

    public String getPage() {
        return this.page;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setTracks(String str) {
        this.tracks = str;
    }

    public void setPage(String str) {
        this.page = str;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public String getKeyWord() {
        return this.keyWord;
    }

    public void setKeyWord(String str) {
        this.keyWord = str;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public void setSearchType(int i) {
        this.searchType = i;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public int getListed() {
        return this.listed;
    }

    public void setListed(int i) {
        this.listed = i;
    }

    public String getExtData() {
        return this.extData;
    }

    public void setExtData(String str) {
        this.extData = str;
    }

    public String getMetaDataList() {
        return this.metaDataList;
    }

    public void setMetaDataList(String str) {
        this.metaDataList = str;
    }

    public DuiSemanticBean getSemantic() {
        return this.semantic;
    }

    public void setSemantic(DuiSemanticBean duiSemanticBean) {
        this.semantic = duiSemanticBean;
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public String toString() {
        return "ProgramListBean{params='" + this.params + "', tracks='" + this.tracks + "', page='" + this.page + "', metadata='" + this.metadata + "', keyWord='" + this.keyWord + "', source='" + this.source + "', searchType=" + this.searchType + ", listed=" + this.listed + ", extData=" + this.extData + '}';
    }
}
