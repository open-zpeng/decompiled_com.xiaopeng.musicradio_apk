package com.xiaopeng.musicradio.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.xiaopeng.musicradio.proto.Music;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.proto.Netradio;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes2.dex */
public final class Netsearch {

    /* loaded from: classes2.dex */
    public interface a extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface b extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface c extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface d extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface e extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface f extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface g extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface h extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public static final class Keyword extends GeneratedMessageLite<Keyword, a> implements d {
        private static final Keyword DEFAULT_INSTANCE = new Keyword();
        public static final int KEYWORD_FIELD_NUMBER = 1;
        private static volatile Parser<Keyword> PARSER;
        private String keyword_ = "";

        private Keyword() {
        }

        public String getKeyword() {
            return this.keyword_;
        }

        public ByteString getKeywordBytes() {
            return ByteString.copyFromUtf8(this.keyword_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyword(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.keyword_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyword() {
            this.keyword_ = getDefaultInstance().getKeyword();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeywordBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.keyword_ = byteString.toStringUtf8();
        }

        public static Keyword parseFrom(ByteBuffer byteBuffer) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Keyword parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Keyword parseFrom(ByteString byteString) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Keyword parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Keyword parseFrom(byte[] bArr) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Keyword parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Keyword parseFrom(InputStream inputStream) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Keyword parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Keyword parseDelimitedFrom(InputStream inputStream) {
            return (Keyword) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Keyword parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Keyword) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Keyword parseFrom(CodedInputStream codedInputStream) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Keyword parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Keyword) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(Keyword keyword) {
            return DEFAULT_INSTANCE.createBuilder(keyword);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Keyword, a> implements d {
            private a() {
                super(Keyword.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Keyword();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyword_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Keyword> parser = PARSER;
                    if (parser == null) {
                        synchronized (Keyword.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            GeneratedMessageLite.registerDefaultInstance(Keyword.class, DEFAULT_INSTANCE);
        }

        public static Keyword getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Keyword> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SearchHistoryBean extends GeneratedMessageLite<SearchHistoryBean, a> implements g {
        private static final SearchHistoryBean DEFAULT_INSTANCE = new SearchHistoryBean();
        public static final int HISTORY_FIELD_NUMBER = 1;
        private static volatile Parser<SearchHistoryBean> PARSER;
        private String history_ = "";

        private SearchHistoryBean() {
        }

        public String getHistory() {
            return this.history_;
        }

        public ByteString getHistoryBytes() {
            return ByteString.copyFromUtf8(this.history_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistory(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.history_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHistory() {
            this.history_ = getDefaultInstance().getHistory();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistoryBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.history_ = byteString.toStringUtf8();
        }

        public static SearchHistoryBean parseFrom(ByteBuffer byteBuffer) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SearchHistoryBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SearchHistoryBean parseFrom(ByteString byteString) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SearchHistoryBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SearchHistoryBean parseFrom(byte[] bArr) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SearchHistoryBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SearchHistoryBean parseFrom(InputStream inputStream) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SearchHistoryBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SearchHistoryBean parseDelimitedFrom(InputStream inputStream) {
            return (SearchHistoryBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SearchHistoryBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchHistoryBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SearchHistoryBean parseFrom(CodedInputStream codedInputStream) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SearchHistoryBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SearchHistoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(SearchHistoryBean searchHistoryBean) {
            return DEFAULT_INSTANCE.createBuilder(searchHistoryBean);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SearchHistoryBean, a> implements g {
            private a() {
                super(SearchHistoryBean.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((SearchHistoryBean) this.instance).setHistory(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new SearchHistoryBean();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"history_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<SearchHistoryBean> parser = PARSER;
                    if (parser == null) {
                        synchronized (SearchHistoryBean.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            GeneratedMessageLite.registerDefaultInstance(SearchHistoryBean.class, DEFAULT_INSTANCE);
        }

        public static SearchHistoryBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SearchHistoryBean> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SongList extends GeneratedMessageLite<SongList, a> implements h {
        private static final SongList DEFAULT_INSTANCE = new SongList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<SongList> PARSER = null;
        public static final int SONGLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<Music.MusicInfo> songList_ = emptyProtobufList();

        private SongList() {
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public List<Music.MusicInfo> getSongListList() {
            return this.songList_;
        }

        public List<? extends Music.d> getSongListOrBuilderList() {
            return this.songList_;
        }

        public int getSongListCount() {
            return this.songList_.size();
        }

        public Music.MusicInfo getSongList(int i) {
            return this.songList_.get(i);
        }

        public Music.d getSongListOrBuilder(int i) {
            return this.songList_.get(i);
        }

        private void ensureSongListIsMutable() {
            if (this.songList_.isModifiable()) {
                return;
            }
            this.songList_ = GeneratedMessageLite.mutableCopy(this.songList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongList(int i, Music.MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureSongListIsMutable();
            this.songList_.set(i, musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongList(int i, Music.MusicInfo.a aVar) {
            ensureSongListIsMutable();
            this.songList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSongList(Music.MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureSongListIsMutable();
            this.songList_.add(musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSongList(int i, Music.MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureSongListIsMutable();
            this.songList_.add(i, musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSongList(Music.MusicInfo.a aVar) {
            ensureSongListIsMutable();
            this.songList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSongList(int i, Music.MusicInfo.a aVar) {
            ensureSongListIsMutable();
            this.songList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSongList(Iterable<? extends Music.MusicInfo> iterable) {
            ensureSongListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.songList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongList() {
            this.songList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSongList(int i) {
            ensureSongListIsMutable();
            this.songList_.remove(i);
        }

        public static SongList parseFrom(ByteBuffer byteBuffer) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SongList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SongList parseFrom(ByteString byteString) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SongList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SongList parseFrom(byte[] bArr) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SongList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SongList parseFrom(InputStream inputStream) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SongList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SongList parseDelimitedFrom(InputStream inputStream) {
            return (SongList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SongList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SongList parseFrom(CodedInputStream codedInputStream) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SongList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(SongList songList) {
            return DEFAULT_INSTANCE.createBuilder(songList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SongList, a> implements h {
            private a() {
                super(SongList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((SongList) this.instance).setErrorCode(i);
                return this;
            }

            public int a() {
                return ((SongList) this.instance).getSongListCount();
            }

            public a a(Music.MusicInfo musicInfo) {
                copyOnWrite();
                ((SongList) this.instance).addSongList(musicInfo);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new SongList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "songList_", Music.MusicInfo.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<SongList> parser = PARSER;
                    if (parser == null) {
                        synchronized (SongList.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            GeneratedMessageLite.registerDefaultInstance(SongList.class, DEFAULT_INSTANCE);
        }

        public static SongList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SongList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class AlbumList extends GeneratedMessageLite<AlbumList, a> implements a {
        public static final int ALBUMLIST_FIELD_NUMBER = 2;
        private static final AlbumList DEFAULT_INSTANCE = new AlbumList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<AlbumList> PARSER;
        private Internal.ProtobufList<Music.MusicAlbum> albumList_ = emptyProtobufList();
        private int errorCode_;

        private AlbumList() {
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public List<Music.MusicAlbum> getAlbumListList() {
            return this.albumList_;
        }

        public List<? extends Music.b> getAlbumListOrBuilderList() {
            return this.albumList_;
        }

        public int getAlbumListCount() {
            return this.albumList_.size();
        }

        public Music.MusicAlbum getAlbumList(int i) {
            return this.albumList_.get(i);
        }

        public Music.b getAlbumListOrBuilder(int i) {
            return this.albumList_.get(i);
        }

        private void ensureAlbumListIsMutable() {
            if (this.albumList_.isModifiable()) {
                return;
            }
            this.albumList_ = GeneratedMessageLite.mutableCopy(this.albumList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumList(int i, Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.set(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumList(int i, Music.MusicAlbum.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.add(musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(int i, Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.add(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(Music.MusicAlbum.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(int i, Music.MusicAlbum.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAlbumList(Iterable<? extends Music.MusicAlbum> iterable) {
            ensureAlbumListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.albumList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlbumList() {
            this.albumList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAlbumList(int i) {
            ensureAlbumListIsMutable();
            this.albumList_.remove(i);
        }

        public static AlbumList parseFrom(ByteBuffer byteBuffer) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AlbumList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AlbumList parseFrom(ByteString byteString) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AlbumList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AlbumList parseFrom(byte[] bArr) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AlbumList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AlbumList parseFrom(InputStream inputStream) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AlbumList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AlbumList parseDelimitedFrom(InputStream inputStream) {
            return (AlbumList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AlbumList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AlbumList parseFrom(CodedInputStream codedInputStream) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AlbumList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(AlbumList albumList) {
            return DEFAULT_INSTANCE.createBuilder(albumList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<AlbumList, a> implements a {
            private a() {
                super(AlbumList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((AlbumList) this.instance).setErrorCode(i);
                return this;
            }

            public int a() {
                return ((AlbumList) this.instance).getAlbumListCount();
            }

            public a a(Music.MusicAlbum musicAlbum) {
                copyOnWrite();
                ((AlbumList) this.instance).addAlbumList(musicAlbum);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new AlbumList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "albumList_", Music.MusicAlbum.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<AlbumList> parser = PARSER;
                    if (parser == null) {
                        synchronized (AlbumList.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            GeneratedMessageLite.registerDefaultInstance(AlbumList.class, DEFAULT_INSTANCE);
        }

        public static AlbumList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AlbumList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class CollectList extends GeneratedMessageLite<CollectList, a> implements b {
        public static final int COLLECTLIST_FIELD_NUMBER = 2;
        private static final CollectList DEFAULT_INSTANCE = new CollectList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<CollectList> PARSER;
        private Internal.ProtobufList<Music.MusicAlbum> collectList_ = emptyProtobufList();
        private int errorCode_;

        private CollectList() {
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public List<Music.MusicAlbum> getCollectListList() {
            return this.collectList_;
        }

        public List<? extends Music.b> getCollectListOrBuilderList() {
            return this.collectList_;
        }

        public int getCollectListCount() {
            return this.collectList_.size();
        }

        public Music.MusicAlbum getCollectList(int i) {
            return this.collectList_.get(i);
        }

        public Music.b getCollectListOrBuilder(int i) {
            return this.collectList_.get(i);
        }

        private void ensureCollectListIsMutable() {
            if (this.collectList_.isModifiable()) {
                return;
            }
            this.collectList_ = GeneratedMessageLite.mutableCopy(this.collectList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectList(int i, Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureCollectListIsMutable();
            this.collectList_.set(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectList(int i, Music.MusicAlbum.a aVar) {
            ensureCollectListIsMutable();
            this.collectList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCollectList(Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureCollectListIsMutable();
            this.collectList_.add(musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCollectList(int i, Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureCollectListIsMutable();
            this.collectList_.add(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCollectList(Music.MusicAlbum.a aVar) {
            ensureCollectListIsMutable();
            this.collectList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCollectList(int i, Music.MusicAlbum.a aVar) {
            ensureCollectListIsMutable();
            this.collectList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCollectList(Iterable<? extends Music.MusicAlbum> iterable) {
            ensureCollectListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.collectList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCollectList() {
            this.collectList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCollectList(int i) {
            ensureCollectListIsMutable();
            this.collectList_.remove(i);
        }

        public static CollectList parseFrom(ByteBuffer byteBuffer) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CollectList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CollectList parseFrom(ByteString byteString) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CollectList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CollectList parseFrom(byte[] bArr) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CollectList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CollectList parseFrom(InputStream inputStream) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CollectList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CollectList parseDelimitedFrom(InputStream inputStream) {
            return (CollectList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CollectList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CollectList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CollectList parseFrom(CodedInputStream codedInputStream) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CollectList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CollectList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(CollectList collectList) {
            return DEFAULT_INSTANCE.createBuilder(collectList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<CollectList, a> implements b {
            private a() {
                super(CollectList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((CollectList) this.instance).setErrorCode(i);
                return this;
            }

            public int a() {
                return ((CollectList) this.instance).getCollectListCount();
            }

            public a a(Music.MusicAlbum musicAlbum) {
                copyOnWrite();
                ((CollectList) this.instance).addCollectList(musicAlbum);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new CollectList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "collectList_", Music.MusicAlbum.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CollectList> parser = PARSER;
                    if (parser == null) {
                        synchronized (CollectList.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            GeneratedMessageLite.registerDefaultInstance(CollectList.class, DEFAULT_INSTANCE);
        }

        public static CollectList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CollectList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramList extends GeneratedMessageLite<ProgramList, a> implements e {
        private static final ProgramList DEFAULT_INSTANCE = new ProgramList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<ProgramList> PARSER = null;
        public static final int PROGRAMLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<Netprogram.AlbumBean> programList_ = emptyProtobufList();

        private ProgramList() {
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public List<Netprogram.AlbumBean> getProgramListList() {
            return this.programList_;
        }

        public List<? extends Netprogram.b> getProgramListOrBuilderList() {
            return this.programList_;
        }

        public int getProgramListCount() {
            return this.programList_.size();
        }

        public Netprogram.AlbumBean getProgramList(int i) {
            return this.programList_.get(i);
        }

        public Netprogram.b getProgramListOrBuilder(int i) {
            return this.programList_.get(i);
        }

        private void ensureProgramListIsMutable() {
            if (this.programList_.isModifiable()) {
                return;
            }
            this.programList_ = GeneratedMessageLite.mutableCopy(this.programList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramList(int i, Netprogram.AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.set(i, albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramList(int i, Netprogram.AlbumBean.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(Netprogram.AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.add(albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(int i, Netprogram.AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.add(i, albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(Netprogram.AlbumBean.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(int i, Netprogram.AlbumBean.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllProgramList(Iterable<? extends Netprogram.AlbumBean> iterable) {
            ensureProgramListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.programList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProgramList() {
            this.programList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeProgramList(int i) {
            ensureProgramListIsMutable();
            this.programList_.remove(i);
        }

        public static ProgramList parseFrom(ByteBuffer byteBuffer) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramList parseFrom(ByteString byteString) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramList parseFrom(byte[] bArr) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramList parseFrom(InputStream inputStream) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramList parseDelimitedFrom(InputStream inputStream) {
            return (ProgramList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramList parseFrom(CodedInputStream codedInputStream) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramList programList) {
            return DEFAULT_INSTANCE.createBuilder(programList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramList, a> implements e {
            private a() {
                super(ProgramList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((ProgramList) this.instance).setErrorCode(i);
                return this;
            }

            public int a() {
                return ((ProgramList) this.instance).getProgramListCount();
            }

            public a a(Netprogram.AlbumBean albumBean) {
                copyOnWrite();
                ((ProgramList) this.instance).addProgramList(albumBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "programList_", Netprogram.AlbumBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramList> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramList.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            GeneratedMessageLite.registerDefaultInstance(ProgramList.class, DEFAULT_INSTANCE);
        }

        public static ProgramList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RadioList extends GeneratedMessageLite<RadioList, a> implements f {
        private static final RadioList DEFAULT_INSTANCE = new RadioList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<RadioList> PARSER = null;
        public static final int RADIOLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<Netradio.NetRadioInfo> radioList_ = emptyProtobufList();

        private RadioList() {
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public List<Netradio.NetRadioInfo> getRadioListList() {
            return this.radioList_;
        }

        public List<? extends Netradio.a> getRadioListOrBuilderList() {
            return this.radioList_;
        }

        public int getRadioListCount() {
            return this.radioList_.size();
        }

        public Netradio.NetRadioInfo getRadioList(int i) {
            return this.radioList_.get(i);
        }

        public Netradio.a getRadioListOrBuilder(int i) {
            return this.radioList_.get(i);
        }

        private void ensureRadioListIsMutable() {
            if (this.radioList_.isModifiable()) {
                return;
            }
            this.radioList_ = GeneratedMessageLite.mutableCopy(this.radioList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRadioList(int i, Netradio.NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioListIsMutable();
            this.radioList_.set(i, netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRadioList(int i, Netradio.NetRadioInfo.a aVar) {
            ensureRadioListIsMutable();
            this.radioList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioList(Netradio.NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioListIsMutable();
            this.radioList_.add(netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioList(int i, Netradio.NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioListIsMutable();
            this.radioList_.add(i, netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioList(Netradio.NetRadioInfo.a aVar) {
            ensureRadioListIsMutable();
            this.radioList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioList(int i, Netradio.NetRadioInfo.a aVar) {
            ensureRadioListIsMutable();
            this.radioList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRadioList(Iterable<? extends Netradio.NetRadioInfo> iterable) {
            ensureRadioListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.radioList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRadioList() {
            this.radioList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRadioList(int i) {
            ensureRadioListIsMutable();
            this.radioList_.remove(i);
        }

        public static RadioList parseFrom(ByteBuffer byteBuffer) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RadioList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RadioList parseFrom(ByteString byteString) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RadioList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RadioList parseFrom(byte[] bArr) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RadioList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RadioList parseFrom(InputStream inputStream) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RadioList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RadioList parseDelimitedFrom(InputStream inputStream) {
            return (RadioList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RadioList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RadioList parseFrom(CodedInputStream codedInputStream) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RadioList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RadioList radioList) {
            return DEFAULT_INSTANCE.createBuilder(radioList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RadioList, a> implements f {
            private a() {
                super(RadioList.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RadioList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "radioList_", Netradio.NetRadioInfo.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RadioList> parser = PARSER;
                    if (parser == null) {
                        synchronized (RadioList.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            GeneratedMessageLite.registerDefaultInstance(RadioList.class, DEFAULT_INSTANCE);
        }

        public static RadioList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RadioList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class HistoryList extends GeneratedMessageLite<HistoryList, a> implements c {
        private static final HistoryList DEFAULT_INSTANCE = new HistoryList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        public static final int HISTORYLIST_FIELD_NUMBER = 2;
        private static volatile Parser<HistoryList> PARSER;
        private int errorCode_;
        private Internal.ProtobufList<SearchHistoryBean> historyList_ = emptyProtobufList();

        private HistoryList() {
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        public List<SearchHistoryBean> getHistoryListList() {
            return this.historyList_;
        }

        public List<? extends g> getHistoryListOrBuilderList() {
            return this.historyList_;
        }

        public int getHistoryListCount() {
            return this.historyList_.size();
        }

        public SearchHistoryBean getHistoryList(int i) {
            return this.historyList_.get(i);
        }

        public g getHistoryListOrBuilder(int i) {
            return this.historyList_.get(i);
        }

        private void ensureHistoryListIsMutable() {
            if (this.historyList_.isModifiable()) {
                return;
            }
            this.historyList_ = GeneratedMessageLite.mutableCopy(this.historyList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistoryList(int i, SearchHistoryBean searchHistoryBean) {
            if (searchHistoryBean == null) {
                throw new NullPointerException();
            }
            ensureHistoryListIsMutable();
            this.historyList_.set(i, searchHistoryBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistoryList(int i, SearchHistoryBean.a aVar) {
            ensureHistoryListIsMutable();
            this.historyList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHistoryList(SearchHistoryBean searchHistoryBean) {
            if (searchHistoryBean == null) {
                throw new NullPointerException();
            }
            ensureHistoryListIsMutable();
            this.historyList_.add(searchHistoryBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHistoryList(int i, SearchHistoryBean searchHistoryBean) {
            if (searchHistoryBean == null) {
                throw new NullPointerException();
            }
            ensureHistoryListIsMutable();
            this.historyList_.add(i, searchHistoryBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHistoryList(SearchHistoryBean.a aVar) {
            ensureHistoryListIsMutable();
            this.historyList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHistoryList(int i, SearchHistoryBean.a aVar) {
            ensureHistoryListIsMutable();
            this.historyList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllHistoryList(Iterable<? extends SearchHistoryBean> iterable) {
            ensureHistoryListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.historyList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHistoryList() {
            this.historyList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeHistoryList(int i) {
            ensureHistoryListIsMutable();
            this.historyList_.remove(i);
        }

        public static HistoryList parseFrom(ByteBuffer byteBuffer) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HistoryList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HistoryList parseFrom(ByteString byteString) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HistoryList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HistoryList parseFrom(byte[] bArr) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HistoryList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HistoryList parseFrom(InputStream inputStream) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryList parseDelimitedFrom(InputStream inputStream) {
            return (HistoryList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryList parseFrom(CodedInputStream codedInputStream) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HistoryList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(HistoryList historyList) {
            return DEFAULT_INSTANCE.createBuilder(historyList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<HistoryList, a> implements c {
            private a() {
                super(HistoryList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((HistoryList) this.instance).setErrorCode(i);
                return this;
            }

            public int a() {
                return ((HistoryList) this.instance).getHistoryListCount();
            }

            public a a(SearchHistoryBean searchHistoryBean) {
                copyOnWrite();
                ((HistoryList) this.instance).addHistoryList(searchHistoryBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new HistoryList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "historyList_", SearchHistoryBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<HistoryList> parser = PARSER;
                    if (parser == null) {
                        synchronized (HistoryList.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            GeneratedMessageLite.registerDefaultInstance(HistoryList.class, DEFAULT_INSTANCE);
        }

        public static HistoryList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<HistoryList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
