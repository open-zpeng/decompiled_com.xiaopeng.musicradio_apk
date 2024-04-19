package com.xiaopeng.musicradio.model.dui;

import androidx.annotation.Keep;
import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.dui.DuiMusicParams;
import com.xiaopeng.musicradio.bean.search.DuiSemanticBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class MusicListBean {
    private int listed;
    private PageBean page;
    private DuiMusicParams params;
    private int searchType;
    private DuiSemanticBean semantic;
    private List<MusicSongBean> tracks;
    private String metadata = "";
    private String keyWord = "";
    private String source = "";
    private String extData = "";
    private String metaDataList = "";
    private String query = "";

    public DuiMusicParams getParams() {
        return this.params;
    }

    public void setParams(DuiMusicParams duiMusicParams) {
        this.params = duiMusicParams;
    }

    public List<MusicSongBean> getTracks() {
        return this.tracks;
    }

    public void setTracks(List<MusicSongBean> list) {
        this.tracks = list;
    }

    public PageBean getPage() {
        return this.page;
    }

    public void setPage(PageBean pageBean) {
        this.page = pageBean;
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

    public String getSource() {
        return this.source;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public void setSearchType(int i) {
        this.searchType = i;
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
        return "MusicListBean{params=" + this.params + ", tracks=" + this.tracks + ", page=" + this.page + ", metadata='" + this.metadata + "', keyWord='" + this.keyWord + "', source='" + this.source + "', searchType=" + this.searchType + ", listed=" + this.listed + ", extData='" + this.extData + "', metaDataList='" + this.metaDataList + "', query='" + this.query + "', semantic=" + this.semantic + '}';
    }
}
