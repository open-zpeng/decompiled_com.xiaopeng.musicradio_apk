package com.xiaopeng.musicradio.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes2.dex */
public final class Music {

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
    public interface i extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface j extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface k extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface l extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface m extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface n extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface o extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface p extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface q extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface r extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface s extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface t extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface u extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public static final class MusicInfo extends GeneratedMessageLite<MusicInfo, a> implements d {
        public static final int ALBUMID_FIELD_NUMBER = 4;
        public static final int ALBUMLOGO_FIELD_NUMBER = 6;
        public static final int ALBUMNAME_FIELD_NUMBER = 5;
        public static final int ARTISTID_FIELD_NUMBER = 7;
        private static final MusicInfo DEFAULT_INSTANCE = new MusicInfo();
        public static final int FILELIST_FIELD_NUMBER = 12;
        public static final int HASH_FIELD_NUMBER = 1;
        public static final int HOT_FIELD_NUMBER = 13;
        public static final int ISLOCAL_FIELD_NUMBER = 15;
        public static final int ISSUPPORTSQ_FIELD_NUMBER = 16;
        public static final int LOGO_FIELD_NUMBER = 8;
        public static final int MUSICFROM_FIELD_NUMBER = 9;
        public static final int NEEDVIP_FIELD_NUMBER = 14;
        private static volatile Parser<MusicInfo> PARSER = null;
        public static final int QUALITY_FIELD_NUMBER = 10;
        public static final int SINGER_FIELD_NUMBER = 2;
        public static final int SONGID_FIELD_NUMBER = 11;
        public static final int SONG_FIELD_NUMBER = 3;
        public static final int UNPLAYABLEMSG_FIELD_NUMBER = 17;
        private long albumId_;
        private long artistId_;
        private boolean hot_;
        private boolean isLocal_;
        private boolean isSupportSQ_;
        private int musicFrom_;
        private boolean needVip_;
        private int quality_;
        private String hash_ = "";
        private String singer_ = "";
        private String song_ = "";
        private String albumName_ = "";
        private String albumLogo_ = "";
        private String logo_ = "";
        private String songId_ = "";
        private Internal.ProtobufList<SongQuality> fileList_ = emptyProtobufList();
        private String unplayableMsg_ = "";

        private MusicInfo() {
        }

        public String getHash() {
            return this.hash_;
        }

        public ByteString getHashBytes() {
            return ByteString.copyFromUtf8(this.hash_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHash(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.hash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHash() {
            this.hash_ = getDefaultInstance().getHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHashBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.hash_ = byteString.toStringUtf8();
        }

        public String getSinger() {
            return this.singer_;
        }

        public ByteString getSingerBytes() {
            return ByteString.copyFromUtf8(this.singer_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSinger(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.singer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSinger() {
            this.singer_ = getDefaultInstance().getSinger();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSingerBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.singer_ = byteString.toStringUtf8();
        }

        public String getSong() {
            return this.song_;
        }

        public ByteString getSongBytes() {
            return ByteString.copyFromUtf8(this.song_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSong(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.song_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSong() {
            this.song_ = getDefaultInstance().getSong();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.song_ = byteString.toStringUtf8();
        }

        public long getAlbumId() {
            return this.albumId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumId(long j) {
            this.albumId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlbumId() {
            this.albumId_ = 0L;
        }

        public String getAlbumName() {
            return this.albumName_;
        }

        public ByteString getAlbumNameBytes() {
            return ByteString.copyFromUtf8(this.albumName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.albumName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlbumName() {
            this.albumName_ = getDefaultInstance().getAlbumName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.albumName_ = byteString.toStringUtf8();
        }

        public String getAlbumLogo() {
            return this.albumLogo_;
        }

        public ByteString getAlbumLogoBytes() {
            return ByteString.copyFromUtf8(this.albumLogo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumLogo(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.albumLogo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlbumLogo() {
            this.albumLogo_ = getDefaultInstance().getAlbumLogo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumLogoBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.albumLogo_ = byteString.toStringUtf8();
        }

        public long getArtistId() {
            return this.artistId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtistId(long j) {
            this.artistId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArtistId() {
            this.artistId_ = 0L;
        }

        public String getLogo() {
            return this.logo_;
        }

        public ByteString getLogoBytes() {
            return ByteString.copyFromUtf8(this.logo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogo(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.logo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogo() {
            this.logo_ = getDefaultInstance().getLogo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogoBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.logo_ = byteString.toStringUtf8();
        }

        public int getMusicFrom() {
            return this.musicFrom_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicFrom(int i) {
            this.musicFrom_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicFrom() {
            this.musicFrom_ = 0;
        }

        public int getQuality() {
            return this.quality_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuality(int i) {
            this.quality_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuality() {
            this.quality_ = 0;
        }

        public String getSongId() {
            return this.songId_;
        }

        public ByteString getSongIdBytes() {
            return ByteString.copyFromUtf8(this.songId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.songId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongId() {
            this.songId_ = getDefaultInstance().getSongId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.songId_ = byteString.toStringUtf8();
        }

        public List<SongQuality> getFileListList() {
            return this.fileList_;
        }

        public List<? extends q> getFileListOrBuilderList() {
            return this.fileList_;
        }

        public int getFileListCount() {
            return this.fileList_.size();
        }

        public SongQuality getFileList(int i) {
            return this.fileList_.get(i);
        }

        public q getFileListOrBuilder(int i) {
            return this.fileList_.get(i);
        }

        private void ensureFileListIsMutable() {
            if (this.fileList_.isModifiable()) {
                return;
            }
            this.fileList_ = GeneratedMessageLite.mutableCopy(this.fileList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileList(int i, SongQuality songQuality) {
            if (songQuality == null) {
                throw new NullPointerException();
            }
            ensureFileListIsMutable();
            this.fileList_.set(i, songQuality);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileList(int i, SongQuality.a aVar) {
            ensureFileListIsMutable();
            this.fileList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFileList(SongQuality songQuality) {
            if (songQuality == null) {
                throw new NullPointerException();
            }
            ensureFileListIsMutable();
            this.fileList_.add(songQuality);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFileList(int i, SongQuality songQuality) {
            if (songQuality == null) {
                throw new NullPointerException();
            }
            ensureFileListIsMutable();
            this.fileList_.add(i, songQuality);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFileList(SongQuality.a aVar) {
            ensureFileListIsMutable();
            this.fileList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFileList(int i, SongQuality.a aVar) {
            ensureFileListIsMutable();
            this.fileList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFileList(Iterable<? extends SongQuality> iterable) {
            ensureFileListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.fileList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileList() {
            this.fileList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFileList(int i) {
            ensureFileListIsMutable();
            this.fileList_.remove(i);
        }

        public boolean getHot() {
            return this.hot_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHot(boolean z) {
            this.hot_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHot() {
            this.hot_ = false;
        }

        public boolean getNeedVip() {
            return this.needVip_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNeedVip(boolean z) {
            this.needVip_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNeedVip() {
            this.needVip_ = false;
        }

        public boolean getIsLocal() {
            return this.isLocal_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsLocal(boolean z) {
            this.isLocal_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsLocal() {
            this.isLocal_ = false;
        }

        public boolean getIsSupportSQ() {
            return this.isSupportSQ_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsSupportSQ(boolean z) {
            this.isSupportSQ_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsSupportSQ() {
            this.isSupportSQ_ = false;
        }

        public String getUnplayableMsg() {
            return this.unplayableMsg_;
        }

        public ByteString getUnplayableMsgBytes() {
            return ByteString.copyFromUtf8(this.unplayableMsg_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnplayableMsg(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.unplayableMsg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnplayableMsg() {
            this.unplayableMsg_ = getDefaultInstance().getUnplayableMsg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnplayableMsgBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.unplayableMsg_ = byteString.toStringUtf8();
        }

        public static MusicInfo parseFrom(ByteBuffer byteBuffer) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicInfo parseFrom(ByteString byteString) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicInfo parseFrom(byte[] bArr) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicInfo parseFrom(InputStream inputStream) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicInfo parseDelimitedFrom(InputStream inputStream) {
            return (MusicInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicInfo parseFrom(CodedInputStream codedInputStream) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicInfo musicInfo) {
            return DEFAULT_INSTANCE.createBuilder(musicInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicInfo, a> implements d {
            private a() {
                super(MusicInfo.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((MusicInfo) this.instance).setHash(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((MusicInfo) this.instance).setSinger(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((MusicInfo) this.instance).setSong(str);
                return this;
            }

            public a a(long j) {
                copyOnWrite();
                ((MusicInfo) this.instance).setAlbumId(j);
                return this;
            }

            public a d(String str) {
                copyOnWrite();
                ((MusicInfo) this.instance).setAlbumName(str);
                return this;
            }

            public a e(String str) {
                copyOnWrite();
                ((MusicInfo) this.instance).setAlbumLogo(str);
                return this;
            }

            public a b(long j) {
                copyOnWrite();
                ((MusicInfo) this.instance).setArtistId(j);
                return this;
            }

            public a f(String str) {
                copyOnWrite();
                ((MusicInfo) this.instance).setLogo(str);
                return this;
            }

            public a a(int i) {
                copyOnWrite();
                ((MusicInfo) this.instance).setMusicFrom(i);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((MusicInfo) this.instance).setQuality(i);
                return this;
            }

            public a g(String str) {
                copyOnWrite();
                ((MusicInfo) this.instance).setSongId(str);
                return this;
            }

            public a a(SongQuality songQuality) {
                copyOnWrite();
                ((MusicInfo) this.instance).addFileList(songQuality);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MusicInfo) this.instance).setHot(z);
                return this;
            }

            public a b(boolean z) {
                copyOnWrite();
                ((MusicInfo) this.instance).setNeedVip(z);
                return this;
            }

            public a c(boolean z) {
                copyOnWrite();
                ((MusicInfo) this.instance).setIsLocal(z);
                return this;
            }

            public a d(boolean z) {
                copyOnWrite();
                ((MusicInfo) this.instance).setIsSupportSQ(z);
                return this;
            }

            public a h(String str) {
                copyOnWrite();
                ((MusicInfo) this.instance).setUnplayableMsg(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\t\u0004\n\u0004\u000bȈ\f\u001b\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011Ȉ", new Object[]{"hash_", "singer_", "song_", "albumId_", "albumName_", "albumLogo_", "artistId_", "logo_", "musicFrom_", "quality_", "songId_", "fileList_", SongQuality.class, "hot_", "needVip_", "isLocal_", "isSupportSQ_", "unplayableMsg_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicInfo.class, DEFAULT_INSTANCE);
        }

        public static MusicInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SongQuality extends GeneratedMessageLite<SongQuality, a> implements q {
        private static final SongQuality DEFAULT_INSTANCE = new SongQuality();
        public static final int FILESIZE_FIELD_NUMBER = 2;
        public static final int HASH_FIELD_NUMBER = 1;
        public static final int NEEDVIP_FIELD_NUMBER = 5;
        private static volatile Parser<SongQuality> PARSER = null;
        public static final int PLAYURL_FIELD_NUMBER = 6;
        public static final int PRIVILEGE_FIELD_NUMBER = 3;
        public static final int QUALITY_FIELD_NUMBER = 4;
        private int fileSize_;
        private boolean needVip_;
        private int privilege_;
        private int quality_;
        private String hash_ = "";
        private String playUrl_ = "";

        private SongQuality() {
        }

        public String getHash() {
            return this.hash_;
        }

        public ByteString getHashBytes() {
            return ByteString.copyFromUtf8(this.hash_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHash(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.hash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHash() {
            this.hash_ = getDefaultInstance().getHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHashBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.hash_ = byteString.toStringUtf8();
        }

        public int getFileSize() {
            return this.fileSize_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileSize(int i) {
            this.fileSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileSize() {
            this.fileSize_ = 0;
        }

        public int getPrivilege() {
            return this.privilege_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivilege(int i) {
            this.privilege_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivilege() {
            this.privilege_ = 0;
        }

        public int getQuality() {
            return this.quality_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuality(int i) {
            this.quality_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuality() {
            this.quality_ = 0;
        }

        public boolean getNeedVip() {
            return this.needVip_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNeedVip(boolean z) {
            this.needVip_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNeedVip() {
            this.needVip_ = false;
        }

        public String getPlayUrl() {
            return this.playUrl_;
        }

        public ByteString getPlayUrlBytes() {
            return ByteString.copyFromUtf8(this.playUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayUrl(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.playUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayUrl() {
            this.playUrl_ = getDefaultInstance().getPlayUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayUrlBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.playUrl_ = byteString.toStringUtf8();
        }

        public static SongQuality parseFrom(ByteBuffer byteBuffer) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SongQuality parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SongQuality parseFrom(ByteString byteString) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SongQuality parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SongQuality parseFrom(byte[] bArr) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SongQuality parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SongQuality parseFrom(InputStream inputStream) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SongQuality parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SongQuality parseDelimitedFrom(InputStream inputStream) {
            return (SongQuality) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SongQuality parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongQuality) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SongQuality parseFrom(CodedInputStream codedInputStream) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SongQuality parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongQuality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(SongQuality songQuality) {
            return DEFAULT_INSTANCE.createBuilder(songQuality);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SongQuality, a> implements q {
            private a() {
                super(SongQuality.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((SongQuality) this.instance).setHash(str);
                return this;
            }

            public a a(int i) {
                copyOnWrite();
                ((SongQuality) this.instance).setFileSize(i);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((SongQuality) this.instance).setPrivilege(i);
                return this;
            }

            public a c(int i) {
                copyOnWrite();
                ((SongQuality) this.instance).setQuality(i);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((SongQuality) this.instance).setNeedVip(z);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((SongQuality) this.instance).setPlayUrl(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new SongQuality();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0007\u0006Ȉ", new Object[]{"hash_", "fileSize_", "privilege_", "quality_", "needVip_", "playUrl_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<SongQuality> parser = PARSER;
                    if (parser == null) {
                        synchronized (SongQuality.class) {
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
            GeneratedMessageLite.registerDefaultInstance(SongQuality.class, DEFAULT_INSTANCE);
        }

        public static SongQuality getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SongQuality> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicList extends GeneratedMessageLite<MusicList, a> implements e {
        private static final MusicList DEFAULT_INSTANCE = new MusicList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        public static final int MUSICLIST_FIELD_NUMBER = 2;
        private static volatile Parser<MusicList> PARSER;
        private int errorCode_;
        private Internal.ProtobufList<MusicInfo> musicList_ = emptyProtobufList();

        private MusicList() {
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

        public List<MusicInfo> getMusicListList() {
            return this.musicList_;
        }

        public List<? extends d> getMusicListOrBuilderList() {
            return this.musicList_;
        }

        public int getMusicListCount() {
            return this.musicList_.size();
        }

        public MusicInfo getMusicList(int i) {
            return this.musicList_.get(i);
        }

        public d getMusicListOrBuilder(int i) {
            return this.musicList_.get(i);
        }

        private void ensureMusicListIsMutable() {
            if (this.musicList_.isModifiable()) {
                return;
            }
            this.musicList_ = GeneratedMessageLite.mutableCopy(this.musicList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicList(int i, MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureMusicListIsMutable();
            this.musicList_.set(i, musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicList(int i, MusicInfo.a aVar) {
            ensureMusicListIsMutable();
            this.musicList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicList(MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureMusicListIsMutable();
            this.musicList_.add(musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicList(int i, MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureMusicListIsMutable();
            this.musicList_.add(i, musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicList(MusicInfo.a aVar) {
            ensureMusicListIsMutable();
            this.musicList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicList(int i, MusicInfo.a aVar) {
            ensureMusicListIsMutable();
            this.musicList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMusicList(Iterable<? extends MusicInfo> iterable) {
            ensureMusicListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.musicList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicList() {
            this.musicList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMusicList(int i) {
            ensureMusicListIsMutable();
            this.musicList_.remove(i);
        }

        public static MusicList parseFrom(ByteBuffer byteBuffer) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicList parseFrom(ByteString byteString) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicList parseFrom(byte[] bArr) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicList parseFrom(InputStream inputStream) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicList parseDelimitedFrom(InputStream inputStream) {
            return (MusicList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicList parseFrom(CodedInputStream codedInputStream) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicList musicList) {
            return DEFAULT_INSTANCE.createBuilder(musicList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicList, a> implements e {
            private a() {
                super(MusicList.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "musicList_", MusicInfo.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicList> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicList.class, DEFAULT_INSTANCE);
        }

        public static MusicList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicAlbum extends GeneratedMessageLite<MusicAlbum, a> implements b {
        private static final MusicAlbum DEFAULT_INSTANCE = new MusicAlbum();
        public static final int DESCRIPTION_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 4;
        public static final int LOGOURL_FIELD_NUMBER = 3;
        private static volatile Parser<MusicAlbum> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private long id_;
        private String type_ = "";
        private String title_ = "";
        private String logoUrl_ = "";
        private String description_ = "";

        private MusicAlbum() {
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        public String getTitle() {
            return this.title_;
        }

        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        public String getLogoUrl() {
            return this.logoUrl_;
        }

        public ByteString getLogoUrlBytes() {
            return ByteString.copyFromUtf8(this.logoUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogoUrl(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.logoUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogoUrl() {
            this.logoUrl_ = getDefaultInstance().getLogoUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogoUrlBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.logoUrl_ = byteString.toStringUtf8();
        }

        public long getId() {
            return this.id_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.description_ = byteString.toStringUtf8();
        }

        public static MusicAlbum parseFrom(ByteBuffer byteBuffer) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicAlbum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicAlbum parseFrom(ByteString byteString) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicAlbum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicAlbum parseFrom(byte[] bArr) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicAlbum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicAlbum parseFrom(InputStream inputStream) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicAlbum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicAlbum parseDelimitedFrom(InputStream inputStream) {
            return (MusicAlbum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicAlbum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicAlbum parseFrom(CodedInputStream codedInputStream) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicAlbum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicAlbum musicAlbum) {
            return DEFAULT_INSTANCE.createBuilder(musicAlbum);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicAlbum, a> implements b {
            private a() {
                super(MusicAlbum.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((MusicAlbum) this.instance).setType(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((MusicAlbum) this.instance).setTitle(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((MusicAlbum) this.instance).setLogoUrl(str);
                return this;
            }

            public a a(long j) {
                copyOnWrite();
                ((MusicAlbum) this.instance).setId(j);
                return this;
            }

            public a d(String str) {
                copyOnWrite();
                ((MusicAlbum) this.instance).setDescription(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicAlbum();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005Ȉ", new Object[]{"type_", "title_", "logoUrl_", "id_", "description_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicAlbum> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicAlbum.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicAlbum.class, DEFAULT_INSTANCE);
        }

        public static MusicAlbum getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicAlbum> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RankItem extends GeneratedMessageLite<RankItem, a> implements k {
        private static final RankItem DEFAULT_INSTANCE = new RankItem();
        public static final int MUSICALBUM_FIELD_NUMBER = 1;
        private static volatile Parser<RankItem> PARSER = null;
        public static final int SONGINFOLIST_FIELD_NUMBER = 2;
        private MusicAlbum musicAlbum_;
        private Internal.ProtobufList<SongInfo> songInfoList_ = emptyProtobufList();

        private RankItem() {
        }

        public boolean hasMusicAlbum() {
            return this.musicAlbum_ != null;
        }

        public MusicAlbum getMusicAlbum() {
            MusicAlbum musicAlbum = this.musicAlbum_;
            return musicAlbum == null ? MusicAlbum.getDefaultInstance() : musicAlbum;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicAlbum(MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            this.musicAlbum_ = musicAlbum;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicAlbum(MusicAlbum.a aVar) {
            this.musicAlbum_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMusicAlbum(MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            MusicAlbum musicAlbum2 = this.musicAlbum_;
            if (musicAlbum2 != null && musicAlbum2 != MusicAlbum.getDefaultInstance()) {
                this.musicAlbum_ = MusicAlbum.newBuilder(this.musicAlbum_).mergeFrom((MusicAlbum.a) musicAlbum).buildPartial();
            } else {
                this.musicAlbum_ = musicAlbum;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicAlbum() {
            this.musicAlbum_ = null;
        }

        public List<SongInfo> getSongInfoListList() {
            return this.songInfoList_;
        }

        public List<? extends p> getSongInfoListOrBuilderList() {
            return this.songInfoList_;
        }

        public int getSongInfoListCount() {
            return this.songInfoList_.size();
        }

        public SongInfo getSongInfoList(int i) {
            return this.songInfoList_.get(i);
        }

        public p getSongInfoListOrBuilder(int i) {
            return this.songInfoList_.get(i);
        }

        private void ensureSongInfoListIsMutable() {
            if (this.songInfoList_.isModifiable()) {
                return;
            }
            this.songInfoList_ = GeneratedMessageLite.mutableCopy(this.songInfoList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongInfoList(int i, SongInfo songInfo) {
            if (songInfo == null) {
                throw new NullPointerException();
            }
            ensureSongInfoListIsMutable();
            this.songInfoList_.set(i, songInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongInfoList(int i, SongInfo.a aVar) {
            ensureSongInfoListIsMutable();
            this.songInfoList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSongInfoList(SongInfo songInfo) {
            if (songInfo == null) {
                throw new NullPointerException();
            }
            ensureSongInfoListIsMutable();
            this.songInfoList_.add(songInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSongInfoList(int i, SongInfo songInfo) {
            if (songInfo == null) {
                throw new NullPointerException();
            }
            ensureSongInfoListIsMutable();
            this.songInfoList_.add(i, songInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSongInfoList(SongInfo.a aVar) {
            ensureSongInfoListIsMutable();
            this.songInfoList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSongInfoList(int i, SongInfo.a aVar) {
            ensureSongInfoListIsMutable();
            this.songInfoList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSongInfoList(Iterable<? extends SongInfo> iterable) {
            ensureSongInfoListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.songInfoList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongInfoList() {
            this.songInfoList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSongInfoList(int i) {
            ensureSongInfoListIsMutable();
            this.songInfoList_.remove(i);
        }

        public static RankItem parseFrom(ByteBuffer byteBuffer) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RankItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RankItem parseFrom(ByteString byteString) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RankItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RankItem parseFrom(byte[] bArr) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RankItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RankItem parseFrom(InputStream inputStream) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RankItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RankItem parseDelimitedFrom(InputStream inputStream) {
            return (RankItem) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RankItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItem) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RankItem parseFrom(CodedInputStream codedInputStream) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RankItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RankItem rankItem) {
            return DEFAULT_INSTANCE.createBuilder(rankItem);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RankItem, a> implements k {
            private a() {
                super(RankItem.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RankItem();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"musicAlbum_", "songInfoList_", SongInfo.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RankItem> parser = PARSER;
                    if (parser == null) {
                        synchronized (RankItem.class) {
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
            GeneratedMessageLite.registerDefaultInstance(RankItem.class, DEFAULT_INSTANCE);
        }

        public static RankItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RankItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicAlbumList extends GeneratedMessageLite<MusicAlbumList, a> implements a {
        private static final MusicAlbumList DEFAULT_INSTANCE = new MusicAlbumList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        public static final int MUSICALBUMLIST_FIELD_NUMBER = 2;
        private static volatile Parser<MusicAlbumList> PARSER;
        private int errorCode_;
        private Internal.ProtobufList<MusicAlbum> musicAlbumList_ = emptyProtobufList();

        private MusicAlbumList() {
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

        public List<MusicAlbum> getMusicAlbumListList() {
            return this.musicAlbumList_;
        }

        public List<? extends b> getMusicAlbumListOrBuilderList() {
            return this.musicAlbumList_;
        }

        public int getMusicAlbumListCount() {
            return this.musicAlbumList_.size();
        }

        public MusicAlbum getMusicAlbumList(int i) {
            return this.musicAlbumList_.get(i);
        }

        public b getMusicAlbumListOrBuilder(int i) {
            return this.musicAlbumList_.get(i);
        }

        private void ensureMusicAlbumListIsMutable() {
            if (this.musicAlbumList_.isModifiable()) {
                return;
            }
            this.musicAlbumList_ = GeneratedMessageLite.mutableCopy(this.musicAlbumList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicAlbumList(int i, MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureMusicAlbumListIsMutable();
            this.musicAlbumList_.set(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicAlbumList(int i, MusicAlbum.a aVar) {
            ensureMusicAlbumListIsMutable();
            this.musicAlbumList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicAlbumList(MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureMusicAlbumListIsMutable();
            this.musicAlbumList_.add(musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicAlbumList(int i, MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureMusicAlbumListIsMutable();
            this.musicAlbumList_.add(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicAlbumList(MusicAlbum.a aVar) {
            ensureMusicAlbumListIsMutable();
            this.musicAlbumList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicAlbumList(int i, MusicAlbum.a aVar) {
            ensureMusicAlbumListIsMutable();
            this.musicAlbumList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMusicAlbumList(Iterable<? extends MusicAlbum> iterable) {
            ensureMusicAlbumListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.musicAlbumList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicAlbumList() {
            this.musicAlbumList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMusicAlbumList(int i) {
            ensureMusicAlbumListIsMutable();
            this.musicAlbumList_.remove(i);
        }

        public static MusicAlbumList parseFrom(ByteBuffer byteBuffer) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicAlbumList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicAlbumList parseFrom(ByteString byteString) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicAlbumList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicAlbumList parseFrom(byte[] bArr) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicAlbumList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicAlbumList parseFrom(InputStream inputStream) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicAlbumList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicAlbumList parseDelimitedFrom(InputStream inputStream) {
            return (MusicAlbumList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicAlbumList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbumList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicAlbumList parseFrom(CodedInputStream codedInputStream) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicAlbumList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAlbumList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicAlbumList musicAlbumList) {
            return DEFAULT_INSTANCE.createBuilder(musicAlbumList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicAlbumList, a> implements a {
            private a() {
                super(MusicAlbumList.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicAlbumList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "musicAlbumList_", MusicAlbum.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicAlbumList> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicAlbumList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicAlbumList.class, DEFAULT_INSTANCE);
        }

        public static MusicAlbumList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicAlbumList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RankItemList extends GeneratedMessageLite<RankItemList, a> implements j {
        private static final RankItemList DEFAULT_INSTANCE = new RankItemList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<RankItemList> PARSER = null;
        public static final int RANKITEMLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<RankItem> rankItemList_ = emptyProtobufList();

        private RankItemList() {
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

        public List<RankItem> getRankItemListList() {
            return this.rankItemList_;
        }

        public List<? extends k> getRankItemListOrBuilderList() {
            return this.rankItemList_;
        }

        public int getRankItemListCount() {
            return this.rankItemList_.size();
        }

        public RankItem getRankItemList(int i) {
            return this.rankItemList_.get(i);
        }

        public k getRankItemListOrBuilder(int i) {
            return this.rankItemList_.get(i);
        }

        private void ensureRankItemListIsMutable() {
            if (this.rankItemList_.isModifiable()) {
                return;
            }
            this.rankItemList_ = GeneratedMessageLite.mutableCopy(this.rankItemList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankItemList(int i, RankItem rankItem) {
            if (rankItem == null) {
                throw new NullPointerException();
            }
            ensureRankItemListIsMutable();
            this.rankItemList_.set(i, rankItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankItemList(int i, RankItem.a aVar) {
            ensureRankItemListIsMutable();
            this.rankItemList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankItemList(RankItem rankItem) {
            if (rankItem == null) {
                throw new NullPointerException();
            }
            ensureRankItemListIsMutable();
            this.rankItemList_.add(rankItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankItemList(int i, RankItem rankItem) {
            if (rankItem == null) {
                throw new NullPointerException();
            }
            ensureRankItemListIsMutable();
            this.rankItemList_.add(i, rankItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankItemList(RankItem.a aVar) {
            ensureRankItemListIsMutable();
            this.rankItemList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankItemList(int i, RankItem.a aVar) {
            ensureRankItemListIsMutable();
            this.rankItemList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRankItemList(Iterable<? extends RankItem> iterable) {
            ensureRankItemListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.rankItemList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRankItemList() {
            this.rankItemList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRankItemList(int i) {
            ensureRankItemListIsMutable();
            this.rankItemList_.remove(i);
        }

        public static RankItemList parseFrom(ByteBuffer byteBuffer) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RankItemList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RankItemList parseFrom(ByteString byteString) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RankItemList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RankItemList parseFrom(byte[] bArr) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RankItemList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RankItemList parseFrom(InputStream inputStream) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RankItemList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RankItemList parseDelimitedFrom(InputStream inputStream) {
            return (RankItemList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RankItemList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItemList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RankItemList parseFrom(CodedInputStream codedInputStream) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RankItemList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RankItemList rankItemList) {
            return DEFAULT_INSTANCE.createBuilder(rankItemList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RankItemList, a> implements j {
            private a() {
                super(RankItemList.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RankItemList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "rankItemList_", RankItem.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RankItemList> parser = PARSER;
                    if (parser == null) {
                        synchronized (RankItemList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(RankItemList.class, DEFAULT_INSTANCE);
        }

        public static RankItemList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RankItemList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SongInfo extends GeneratedMessageLite<SongInfo, a> implements p {
        private static final SongInfo DEFAULT_INSTANCE = new SongInfo();
        private static volatile Parser<SongInfo> PARSER = null;
        public static final int SONGNMAE_FIELD_NUMBER = 1;
        private String songNmae_ = "";

        private SongInfo() {
        }

        public String getSongNmae() {
            return this.songNmae_;
        }

        public ByteString getSongNmaeBytes() {
            return ByteString.copyFromUtf8(this.songNmae_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongNmae(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.songNmae_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSongNmae() {
            this.songNmae_ = getDefaultInstance().getSongNmae();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSongNmaeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.songNmae_ = byteString.toStringUtf8();
        }

        public static SongInfo parseFrom(ByteBuffer byteBuffer) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SongInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SongInfo parseFrom(ByteString byteString) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SongInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SongInfo parseFrom(byte[] bArr) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SongInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SongInfo parseFrom(InputStream inputStream) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SongInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SongInfo parseDelimitedFrom(InputStream inputStream) {
            return (SongInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SongInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SongInfo parseFrom(CodedInputStream codedInputStream) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SongInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SongInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(SongInfo songInfo) {
            return DEFAULT_INSTANCE.createBuilder(songInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SongInfo, a> implements p {
            private a() {
                super(SongInfo.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new SongInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"songNmae_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<SongInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (SongInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(SongInfo.class, DEFAULT_INSTANCE);
        }

        public static SongInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SongInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class XpPlayInfoList extends GeneratedMessageLite<XpPlayInfoList, a> implements t {
        private static final XpPlayInfoList DEFAULT_INSTANCE = new XpPlayInfoList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<XpPlayInfoList> PARSER = null;
        public static final int XPPLAYINFO_FIELD_NUMBER = 2;
        private int errorCode_;
        private XpPlayInfo xpPlayInfo_;

        private XpPlayInfoList() {
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

        public boolean hasXpPlayInfo() {
            return this.xpPlayInfo_ != null;
        }

        public XpPlayInfo getXpPlayInfo() {
            XpPlayInfo xpPlayInfo = this.xpPlayInfo_;
            return xpPlayInfo == null ? XpPlayInfo.getDefaultInstance() : xpPlayInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXpPlayInfo(XpPlayInfo xpPlayInfo) {
            if (xpPlayInfo == null) {
                throw new NullPointerException();
            }
            this.xpPlayInfo_ = xpPlayInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXpPlayInfo(XpPlayInfo.a aVar) {
            this.xpPlayInfo_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeXpPlayInfo(XpPlayInfo xpPlayInfo) {
            if (xpPlayInfo == null) {
                throw new NullPointerException();
            }
            XpPlayInfo xpPlayInfo2 = this.xpPlayInfo_;
            if (xpPlayInfo2 != null && xpPlayInfo2 != XpPlayInfo.getDefaultInstance()) {
                this.xpPlayInfo_ = XpPlayInfo.newBuilder(this.xpPlayInfo_).mergeFrom((XpPlayInfo.a) xpPlayInfo).buildPartial();
            } else {
                this.xpPlayInfo_ = xpPlayInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXpPlayInfo() {
            this.xpPlayInfo_ = null;
        }

        public static XpPlayInfoList parseFrom(ByteBuffer byteBuffer) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static XpPlayInfoList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static XpPlayInfoList parseFrom(ByteString byteString) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static XpPlayInfoList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static XpPlayInfoList parseFrom(byte[] bArr) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static XpPlayInfoList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static XpPlayInfoList parseFrom(InputStream inputStream) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static XpPlayInfoList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static XpPlayInfoList parseDelimitedFrom(InputStream inputStream) {
            return (XpPlayInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static XpPlayInfoList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static XpPlayInfoList parseFrom(CodedInputStream codedInputStream) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static XpPlayInfoList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(XpPlayInfoList xpPlayInfoList) {
            return DEFAULT_INSTANCE.createBuilder(xpPlayInfoList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<XpPlayInfoList, a> implements t {
            private a() {
                super(XpPlayInfoList.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new XpPlayInfoList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"errorCode_", "xpPlayInfo_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<XpPlayInfoList> parser = PARSER;
                    if (parser == null) {
                        synchronized (XpPlayInfoList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(XpPlayInfoList.class, DEFAULT_INSTANCE);
        }

        public static XpPlayInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<XpPlayInfoList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class PersonalInfoList extends GeneratedMessageLite<PersonalInfoList, a> implements f {
        private static final PersonalInfoList DEFAULT_INSTANCE = new PersonalInfoList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        public static final int MUSICALBUM_FIELD_NUMBER = 2;
        private static volatile Parser<PersonalInfoList> PARSER;
        private int errorCode_;
        private MusicAlbum musicAlbum_;

        private PersonalInfoList() {
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

        public boolean hasMusicAlbum() {
            return this.musicAlbum_ != null;
        }

        public MusicAlbum getMusicAlbum() {
            MusicAlbum musicAlbum = this.musicAlbum_;
            return musicAlbum == null ? MusicAlbum.getDefaultInstance() : musicAlbum;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicAlbum(MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            this.musicAlbum_ = musicAlbum;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicAlbum(MusicAlbum.a aVar) {
            this.musicAlbum_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMusicAlbum(MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            MusicAlbum musicAlbum2 = this.musicAlbum_;
            if (musicAlbum2 != null && musicAlbum2 != MusicAlbum.getDefaultInstance()) {
                this.musicAlbum_ = MusicAlbum.newBuilder(this.musicAlbum_).mergeFrom((MusicAlbum.a) musicAlbum).buildPartial();
            } else {
                this.musicAlbum_ = musicAlbum;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicAlbum() {
            this.musicAlbum_ = null;
        }

        public static PersonalInfoList parseFrom(ByteBuffer byteBuffer) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PersonalInfoList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PersonalInfoList parseFrom(ByteString byteString) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PersonalInfoList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PersonalInfoList parseFrom(byte[] bArr) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PersonalInfoList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PersonalInfoList parseFrom(InputStream inputStream) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PersonalInfoList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PersonalInfoList parseDelimitedFrom(InputStream inputStream) {
            return (PersonalInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PersonalInfoList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PersonalInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PersonalInfoList parseFrom(CodedInputStream codedInputStream) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PersonalInfoList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PersonalInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(PersonalInfoList personalInfoList) {
            return DEFAULT_INSTANCE.createBuilder(personalInfoList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<PersonalInfoList, a> implements f {
            private a() {
                super(PersonalInfoList.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new PersonalInfoList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"errorCode_", "musicAlbum_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PersonalInfoList> parser = PARSER;
                    if (parser == null) {
                        synchronized (PersonalInfoList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(PersonalInfoList.class, DEFAULT_INSTANCE);
        }

        public static PersonalInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PersonalInfoList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class XpPlayInfo extends GeneratedMessageLite<XpPlayInfo, a> implements u {
        public static final int CATEGORYID_FIELD_NUMBER = 1;
        private static final XpPlayInfo DEFAULT_INSTANCE = new XpPlayInfo();
        public static final int MUSICITEMLIST_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<XpPlayInfo> PARSER;
        private int categoryId_;
        private String name_ = "";
        private Internal.ProtobufList<MusicAlbum> musicItemList_ = emptyProtobufList();

        private XpPlayInfo() {
        }

        public int getCategoryId() {
            return this.categoryId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryId(int i) {
            this.categoryId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategoryId() {
            this.categoryId_ = 0;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        public List<MusicAlbum> getMusicItemListList() {
            return this.musicItemList_;
        }

        public List<? extends b> getMusicItemListOrBuilderList() {
            return this.musicItemList_;
        }

        public int getMusicItemListCount() {
            return this.musicItemList_.size();
        }

        public MusicAlbum getMusicItemList(int i) {
            return this.musicItemList_.get(i);
        }

        public b getMusicItemListOrBuilder(int i) {
            return this.musicItemList_.get(i);
        }

        private void ensureMusicItemListIsMutable() {
            if (this.musicItemList_.isModifiable()) {
                return;
            }
            this.musicItemList_ = GeneratedMessageLite.mutableCopy(this.musicItemList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicItemList(int i, MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureMusicItemListIsMutable();
            this.musicItemList_.set(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicItemList(int i, MusicAlbum.a aVar) {
            ensureMusicItemListIsMutable();
            this.musicItemList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicItemList(MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureMusicItemListIsMutable();
            this.musicItemList_.add(musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicItemList(int i, MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureMusicItemListIsMutable();
            this.musicItemList_.add(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicItemList(MusicAlbum.a aVar) {
            ensureMusicItemListIsMutable();
            this.musicItemList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicItemList(int i, MusicAlbum.a aVar) {
            ensureMusicItemListIsMutable();
            this.musicItemList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMusicItemList(Iterable<? extends MusicAlbum> iterable) {
            ensureMusicItemListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.musicItemList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicItemList() {
            this.musicItemList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMusicItemList(int i) {
            ensureMusicItemListIsMutable();
            this.musicItemList_.remove(i);
        }

        public static XpPlayInfo parseFrom(ByteBuffer byteBuffer) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static XpPlayInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static XpPlayInfo parseFrom(ByteString byteString) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static XpPlayInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static XpPlayInfo parseFrom(byte[] bArr) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static XpPlayInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static XpPlayInfo parseFrom(InputStream inputStream) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static XpPlayInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static XpPlayInfo parseDelimitedFrom(InputStream inputStream) {
            return (XpPlayInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static XpPlayInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static XpPlayInfo parseFrom(CodedInputStream codedInputStream) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static XpPlayInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XpPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(XpPlayInfo xpPlayInfo) {
            return DEFAULT_INSTANCE.createBuilder(xpPlayInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<XpPlayInfo, a> implements u {
            private a() {
                super(XpPlayInfo.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new XpPlayInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"categoryId_", "name_", "musicItemList_", MusicAlbum.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<XpPlayInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (XpPlayInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(XpPlayInfo.class, DEFAULT_INSTANCE);
        }

        public static XpPlayInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<XpPlayInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SingerTypeList extends GeneratedMessageLite<SingerTypeList, a> implements n {
        public static final int AREALIST_FIELD_NUMBER = 3;
        private static final SingerTypeList DEFAULT_INSTANCE = new SingerTypeList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<SingerTypeList> PARSER = null;
        public static final int TYPELIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<SingerType> typeList_ = emptyProtobufList();
        private Internal.ProtobufList<SingerType> areaList_ = emptyProtobufList();

        private SingerTypeList() {
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

        public List<SingerType> getTypeListList() {
            return this.typeList_;
        }

        public List<? extends o> getTypeListOrBuilderList() {
            return this.typeList_;
        }

        public int getTypeListCount() {
            return this.typeList_.size();
        }

        public SingerType getTypeList(int i) {
            return this.typeList_.get(i);
        }

        public o getTypeListOrBuilder(int i) {
            return this.typeList_.get(i);
        }

        private void ensureTypeListIsMutable() {
            if (this.typeList_.isModifiable()) {
                return;
            }
            this.typeList_ = GeneratedMessageLite.mutableCopy(this.typeList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeList(int i, SingerType singerType) {
            if (singerType == null) {
                throw new NullPointerException();
            }
            ensureTypeListIsMutable();
            this.typeList_.set(i, singerType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeList(int i, SingerType.a aVar) {
            ensureTypeListIsMutable();
            this.typeList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTypeList(SingerType singerType) {
            if (singerType == null) {
                throw new NullPointerException();
            }
            ensureTypeListIsMutable();
            this.typeList_.add(singerType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTypeList(int i, SingerType singerType) {
            if (singerType == null) {
                throw new NullPointerException();
            }
            ensureTypeListIsMutable();
            this.typeList_.add(i, singerType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTypeList(SingerType.a aVar) {
            ensureTypeListIsMutable();
            this.typeList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTypeList(int i, SingerType.a aVar) {
            ensureTypeListIsMutable();
            this.typeList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTypeList(Iterable<? extends SingerType> iterable) {
            ensureTypeListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.typeList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeList() {
            this.typeList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTypeList(int i) {
            ensureTypeListIsMutable();
            this.typeList_.remove(i);
        }

        public List<SingerType> getAreaListList() {
            return this.areaList_;
        }

        public List<? extends o> getAreaListOrBuilderList() {
            return this.areaList_;
        }

        public int getAreaListCount() {
            return this.areaList_.size();
        }

        public SingerType getAreaList(int i) {
            return this.areaList_.get(i);
        }

        public o getAreaListOrBuilder(int i) {
            return this.areaList_.get(i);
        }

        private void ensureAreaListIsMutable() {
            if (this.areaList_.isModifiable()) {
                return;
            }
            this.areaList_ = GeneratedMessageLite.mutableCopy(this.areaList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaList(int i, SingerType singerType) {
            if (singerType == null) {
                throw new NullPointerException();
            }
            ensureAreaListIsMutable();
            this.areaList_.set(i, singerType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaList(int i, SingerType.a aVar) {
            ensureAreaListIsMutable();
            this.areaList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAreaList(SingerType singerType) {
            if (singerType == null) {
                throw new NullPointerException();
            }
            ensureAreaListIsMutable();
            this.areaList_.add(singerType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAreaList(int i, SingerType singerType) {
            if (singerType == null) {
                throw new NullPointerException();
            }
            ensureAreaListIsMutable();
            this.areaList_.add(i, singerType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAreaList(SingerType.a aVar) {
            ensureAreaListIsMutable();
            this.areaList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAreaList(int i, SingerType.a aVar) {
            ensureAreaListIsMutable();
            this.areaList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAreaList(Iterable<? extends SingerType> iterable) {
            ensureAreaListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.areaList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAreaList() {
            this.areaList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAreaList(int i) {
            ensureAreaListIsMutable();
            this.areaList_.remove(i);
        }

        public static SingerTypeList parseFrom(ByteBuffer byteBuffer) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SingerTypeList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SingerTypeList parseFrom(ByteString byteString) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SingerTypeList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SingerTypeList parseFrom(byte[] bArr) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SingerTypeList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SingerTypeList parseFrom(InputStream inputStream) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SingerTypeList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SingerTypeList parseDelimitedFrom(InputStream inputStream) {
            return (SingerTypeList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SingerTypeList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerTypeList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SingerTypeList parseFrom(CodedInputStream codedInputStream) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SingerTypeList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerTypeList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(SingerTypeList singerTypeList) {
            return DEFAULT_INSTANCE.createBuilder(singerTypeList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SingerTypeList, a> implements n {
            private a() {
                super(SingerTypeList.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new SingerTypeList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new Object[]{"errorCode_", "typeList_", SingerType.class, "areaList_", SingerType.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<SingerTypeList> parser = PARSER;
                    if (parser == null) {
                        synchronized (SingerTypeList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(SingerTypeList.class, DEFAULT_INSTANCE);
        }

        public static SingerTypeList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SingerTypeList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SingerType extends GeneratedMessageLite<SingerType, a> implements o {
        public static final int AREACODE_FIELD_NUMBER = 4;
        public static final int AREANAME_FIELD_NUMBER = 3;
        private static final SingerType DEFAULT_INSTANCE = new SingerType();
        private static volatile Parser<SingerType> PARSER = null;
        public static final int TYPECODE_FIELD_NUMBER = 2;
        public static final int TYPENAME_FIELD_NUMBER = 1;
        private String typeName_ = "";
        private String typeCode_ = "";
        private String areaName_ = "";
        private String areaCode_ = "";

        private SingerType() {
        }

        public String getTypeName() {
            return this.typeName_;
        }

        public ByteString getTypeNameBytes() {
            return ByteString.copyFromUtf8(this.typeName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.typeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeName() {
            this.typeName_ = getDefaultInstance().getTypeName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.typeName_ = byteString.toStringUtf8();
        }

        public String getTypeCode() {
            return this.typeCode_;
        }

        public ByteString getTypeCodeBytes() {
            return ByteString.copyFromUtf8(this.typeCode_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeCode(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.typeCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeCode() {
            this.typeCode_ = getDefaultInstance().getTypeCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeCodeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.typeCode_ = byteString.toStringUtf8();
        }

        public String getAreaName() {
            return this.areaName_;
        }

        public ByteString getAreaNameBytes() {
            return ByteString.copyFromUtf8(this.areaName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.areaName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAreaName() {
            this.areaName_ = getDefaultInstance().getAreaName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.areaName_ = byteString.toStringUtf8();
        }

        public String getAreaCode() {
            return this.areaCode_;
        }

        public ByteString getAreaCodeBytes() {
            return ByteString.copyFromUtf8(this.areaCode_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaCode(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.areaCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAreaCode() {
            this.areaCode_ = getDefaultInstance().getAreaCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaCodeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.areaCode_ = byteString.toStringUtf8();
        }

        public static SingerType parseFrom(ByteBuffer byteBuffer) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SingerType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SingerType parseFrom(ByteString byteString) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SingerType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SingerType parseFrom(byte[] bArr) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SingerType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SingerType parseFrom(InputStream inputStream) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SingerType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SingerType parseDelimitedFrom(InputStream inputStream) {
            return (SingerType) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SingerType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerType) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SingerType parseFrom(CodedInputStream codedInputStream) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SingerType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingerType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(SingerType singerType) {
            return DEFAULT_INSTANCE.createBuilder(singerType);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SingerType, a> implements o {
            private a() {
                super(SingerType.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new SingerType();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"typeName_", "typeCode_", "areaName_", "areaCode_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<SingerType> parser = PARSER;
                    if (parser == null) {
                        synchronized (SingerType.class) {
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
            GeneratedMessageLite.registerDefaultInstance(SingerType.class, DEFAULT_INSTANCE);
        }

        public static SingerType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SingerType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ReMusicTagInfoList extends GeneratedMessageLite<ReMusicTagInfoList, a> implements l {
        private static final ReMusicTagInfoList DEFAULT_INSTANCE = new ReMusicTagInfoList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<ReMusicTagInfoList> PARSER = null;
        public static final int REMUSICTAGINFOLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<ReMusicTagInfo> reMusicTagInfoList_ = emptyProtobufList();

        private ReMusicTagInfoList() {
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

        public List<ReMusicTagInfo> getReMusicTagInfoListList() {
            return this.reMusicTagInfoList_;
        }

        public List<? extends m> getReMusicTagInfoListOrBuilderList() {
            return this.reMusicTagInfoList_;
        }

        public int getReMusicTagInfoListCount() {
            return this.reMusicTagInfoList_.size();
        }

        public ReMusicTagInfo getReMusicTagInfoList(int i) {
            return this.reMusicTagInfoList_.get(i);
        }

        public m getReMusicTagInfoListOrBuilder(int i) {
            return this.reMusicTagInfoList_.get(i);
        }

        private void ensureReMusicTagInfoListIsMutable() {
            if (this.reMusicTagInfoList_.isModifiable()) {
                return;
            }
            this.reMusicTagInfoList_ = GeneratedMessageLite.mutableCopy(this.reMusicTagInfoList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReMusicTagInfoList(int i, ReMusicTagInfo reMusicTagInfo) {
            if (reMusicTagInfo == null) {
                throw new NullPointerException();
            }
            ensureReMusicTagInfoListIsMutable();
            this.reMusicTagInfoList_.set(i, reMusicTagInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReMusicTagInfoList(int i, ReMusicTagInfo.a aVar) {
            ensureReMusicTagInfoListIsMutable();
            this.reMusicTagInfoList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReMusicTagInfoList(ReMusicTagInfo reMusicTagInfo) {
            if (reMusicTagInfo == null) {
                throw new NullPointerException();
            }
            ensureReMusicTagInfoListIsMutable();
            this.reMusicTagInfoList_.add(reMusicTagInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReMusicTagInfoList(int i, ReMusicTagInfo reMusicTagInfo) {
            if (reMusicTagInfo == null) {
                throw new NullPointerException();
            }
            ensureReMusicTagInfoListIsMutable();
            this.reMusicTagInfoList_.add(i, reMusicTagInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReMusicTagInfoList(ReMusicTagInfo.a aVar) {
            ensureReMusicTagInfoListIsMutable();
            this.reMusicTagInfoList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReMusicTagInfoList(int i, ReMusicTagInfo.a aVar) {
            ensureReMusicTagInfoListIsMutable();
            this.reMusicTagInfoList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReMusicTagInfoList(Iterable<? extends ReMusicTagInfo> iterable) {
            ensureReMusicTagInfoListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.reMusicTagInfoList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReMusicTagInfoList() {
            this.reMusicTagInfoList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReMusicTagInfoList(int i) {
            ensureReMusicTagInfoListIsMutable();
            this.reMusicTagInfoList_.remove(i);
        }

        public static ReMusicTagInfoList parseFrom(ByteBuffer byteBuffer) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ReMusicTagInfoList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ReMusicTagInfoList parseFrom(ByteString byteString) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ReMusicTagInfoList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ReMusicTagInfoList parseFrom(byte[] bArr) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReMusicTagInfoList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ReMusicTagInfoList parseFrom(InputStream inputStream) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReMusicTagInfoList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReMusicTagInfoList parseDelimitedFrom(InputStream inputStream) {
            return (ReMusicTagInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReMusicTagInfoList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReMusicTagInfoList parseFrom(CodedInputStream codedInputStream) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReMusicTagInfoList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ReMusicTagInfoList reMusicTagInfoList) {
            return DEFAULT_INSTANCE.createBuilder(reMusicTagInfoList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ReMusicTagInfoList, a> implements l {
            private a() {
                super(ReMusicTagInfoList.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ReMusicTagInfoList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "reMusicTagInfoList_", ReMusicTagInfo.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ReMusicTagInfoList> parser = PARSER;
                    if (parser == null) {
                        synchronized (ReMusicTagInfoList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ReMusicTagInfoList.class, DEFAULT_INSTANCE);
        }

        public static ReMusicTagInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ReMusicTagInfoList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ReMusicTagInfo extends GeneratedMessageLite<ReMusicTagInfo, a> implements m {
        private static final ReMusicTagInfo DEFAULT_INSTANCE = new ReMusicTagInfo();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<ReMusicTagInfo> PARSER = null;
        public static final int SORT_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 3;
        private String id_ = "";
        private String name_ = "";
        private int sort_;
        private int type_;

        private ReMusicTagInfo() {
        }

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        public int getType() {
            return this.type_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public int getSort() {
            return this.sort_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSort(int i) {
            this.sort_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSort() {
            this.sort_ = 0;
        }

        public static ReMusicTagInfo parseFrom(ByteBuffer byteBuffer) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ReMusicTagInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ReMusicTagInfo parseFrom(ByteString byteString) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ReMusicTagInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ReMusicTagInfo parseFrom(byte[] bArr) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReMusicTagInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ReMusicTagInfo parseFrom(InputStream inputStream) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReMusicTagInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReMusicTagInfo parseDelimitedFrom(InputStream inputStream) {
            return (ReMusicTagInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReMusicTagInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ReMusicTagInfo parseFrom(CodedInputStream codedInputStream) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReMusicTagInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReMusicTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ReMusicTagInfo reMusicTagInfo) {
            return DEFAULT_INSTANCE.createBuilder(reMusicTagInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ReMusicTagInfo, a> implements m {
            private a() {
                super(ReMusicTagInfo.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ReMusicTagInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004", new Object[]{"id_", "name_", "type_", "sort_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ReMusicTagInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (ReMusicTagInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ReMusicTagInfo.class, DEFAULT_INSTANCE);
        }

        public static ReMusicTagInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ReMusicTagInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class UsbLoadingTime extends GeneratedMessageLite<UsbLoadingTime, a> implements r {
        private static final UsbLoadingTime DEFAULT_INSTANCE = new UsbLoadingTime();
        public static final int LOADINGTIME_FIELD_NUMBER = 1;
        private static volatile Parser<UsbLoadingTime> PARSER;
        private String loadingTime_ = "";

        private UsbLoadingTime() {
        }

        public String getLoadingTime() {
            return this.loadingTime_;
        }

        public ByteString getLoadingTimeBytes() {
            return ByteString.copyFromUtf8(this.loadingTime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadingTime(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.loadingTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoadingTime() {
            this.loadingTime_ = getDefaultInstance().getLoadingTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadingTimeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.loadingTime_ = byteString.toStringUtf8();
        }

        public static UsbLoadingTime parseFrom(ByteBuffer byteBuffer) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static UsbLoadingTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UsbLoadingTime parseFrom(ByteString byteString) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UsbLoadingTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UsbLoadingTime parseFrom(byte[] bArr) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UsbLoadingTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UsbLoadingTime parseFrom(InputStream inputStream) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UsbLoadingTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UsbLoadingTime parseDelimitedFrom(InputStream inputStream) {
            return (UsbLoadingTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UsbLoadingTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbLoadingTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UsbLoadingTime parseFrom(CodedInputStream codedInputStream) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UsbLoadingTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbLoadingTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(UsbLoadingTime usbLoadingTime) {
            return DEFAULT_INSTANCE.createBuilder(usbLoadingTime);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<UsbLoadingTime, a> implements r {
            private a() {
                super(UsbLoadingTime.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new UsbLoadingTime();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"loadingTime_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<UsbLoadingTime> parser = PARSER;
                    if (parser == null) {
                        synchronized (UsbLoadingTime.class) {
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
            GeneratedMessageLite.registerDefaultInstance(UsbLoadingTime.class, DEFAULT_INSTANCE);
        }

        public static UsbLoadingTime getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<UsbLoadingTime> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class UsbState extends GeneratedMessageLite<UsbState, a> implements s {
        private static final UsbState DEFAULT_INSTANCE = new UsbState();
        private static volatile Parser<UsbState> PARSER = null;
        public static final int USBSTATE_FIELD_NUMBER = 1;
        private String usbState_ = "";

        private UsbState() {
        }

        public String getUsbState() {
            return this.usbState_;
        }

        public ByteString getUsbStateBytes() {
            return ByteString.copyFromUtf8(this.usbState_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsbState(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.usbState_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsbState() {
            this.usbState_ = getDefaultInstance().getUsbState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsbStateBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.usbState_ = byteString.toStringUtf8();
        }

        public static UsbState parseFrom(ByteBuffer byteBuffer) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static UsbState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UsbState parseFrom(ByteString byteString) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UsbState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UsbState parseFrom(byte[] bArr) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UsbState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UsbState parseFrom(InputStream inputStream) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UsbState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UsbState parseDelimitedFrom(InputStream inputStream) {
            return (UsbState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UsbState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UsbState parseFrom(CodedInputStream codedInputStream) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UsbState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UsbState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(UsbState usbState) {
            return DEFAULT_INSTANCE.createBuilder(usbState);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<UsbState, a> implements s {
            private a() {
                super(UsbState.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new UsbState();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"usbState_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<UsbState> parser = PARSER;
                    if (parser == null) {
                        synchronized (UsbState.class) {
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
            GeneratedMessageLite.registerDefaultInstance(UsbState.class, DEFAULT_INSTANCE);
        }

        public static UsbState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<UsbState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicAuth extends GeneratedMessageLite<MusicAuth, a> implements c {
        public static final int AUTH_FIELD_NUMBER = 1;
        private static final MusicAuth DEFAULT_INSTANCE = new MusicAuth();
        private static volatile Parser<MusicAuth> PARSER;
        private boolean auth_;

        private MusicAuth() {
        }

        public boolean getAuth() {
            return this.auth_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuth(boolean z) {
            this.auth_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuth() {
            this.auth_ = false;
        }

        public static MusicAuth parseFrom(ByteBuffer byteBuffer) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicAuth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicAuth parseFrom(ByteString byteString) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicAuth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicAuth parseFrom(byte[] bArr) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicAuth parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicAuth parseFrom(InputStream inputStream) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicAuth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicAuth parseDelimitedFrom(InputStream inputStream) {
            return (MusicAuth) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicAuth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAuth) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicAuth parseFrom(CodedInputStream codedInputStream) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicAuth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicAuth musicAuth) {
            return DEFAULT_INSTANCE.createBuilder(musicAuth);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicAuth, a> implements c {
            private a() {
                super(MusicAuth.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicAuth();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"auth_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicAuth> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicAuth.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicAuth.class, DEFAULT_INSTANCE);
        }

        public static MusicAuth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicAuth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class QualitySelect extends GeneratedMessageLite<QualitySelect, a> implements i {
        private static final QualitySelect DEFAULT_INSTANCE = new QualitySelect();
        private static volatile Parser<QualitySelect> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        private QualitySelect() {
        }

        public int getType() {
            return this.type_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static QualitySelect parseFrom(ByteBuffer byteBuffer) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static QualitySelect parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static QualitySelect parseFrom(ByteString byteString) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static QualitySelect parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static QualitySelect parseFrom(byte[] bArr) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QualitySelect parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static QualitySelect parseFrom(InputStream inputStream) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QualitySelect parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QualitySelect parseDelimitedFrom(InputStream inputStream) {
            return (QualitySelect) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QualitySelect parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualitySelect) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QualitySelect parseFrom(CodedInputStream codedInputStream) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static QualitySelect parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualitySelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(QualitySelect qualitySelect) {
            return DEFAULT_INSTANCE.createBuilder(qualitySelect);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<QualitySelect, a> implements i {
            private a() {
                super(QualitySelect.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new QualitySelect();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"type_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<QualitySelect> parser = PARSER;
                    if (parser == null) {
                        synchronized (QualitySelect.class) {
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
            GeneratedMessageLite.registerDefaultInstance(QualitySelect.class, DEFAULT_INSTANCE);
        }

        public static QualitySelect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<QualitySelect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class QualityRefresh extends GeneratedMessageLite<QualityRefresh, a> implements h {
        private static final QualityRefresh DEFAULT_INSTANCE = new QualityRefresh();
        public static final int ISVIP_FIELD_NUMBER = 1;
        public static final int MUSICINFO_FIELD_NUMBER = 2;
        private static volatile Parser<QualityRefresh> PARSER;
        private boolean isVip_;
        private MusicInfo musicInfo_;

        private QualityRefresh() {
        }

        public boolean getIsVip() {
            return this.isVip_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsVip(boolean z) {
            this.isVip_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsVip() {
            this.isVip_ = false;
        }

        public boolean hasMusicInfo() {
            return this.musicInfo_ != null;
        }

        public MusicInfo getMusicInfo() {
            MusicInfo musicInfo = this.musicInfo_;
            return musicInfo == null ? MusicInfo.getDefaultInstance() : musicInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicInfo(MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            this.musicInfo_ = musicInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicInfo(MusicInfo.a aVar) {
            this.musicInfo_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMusicInfo(MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            MusicInfo musicInfo2 = this.musicInfo_;
            if (musicInfo2 != null && musicInfo2 != MusicInfo.getDefaultInstance()) {
                this.musicInfo_ = MusicInfo.newBuilder(this.musicInfo_).mergeFrom((MusicInfo.a) musicInfo).buildPartial();
            } else {
                this.musicInfo_ = musicInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicInfo() {
            this.musicInfo_ = null;
        }

        public static QualityRefresh parseFrom(ByteBuffer byteBuffer) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static QualityRefresh parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static QualityRefresh parseFrom(ByteString byteString) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static QualityRefresh parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static QualityRefresh parseFrom(byte[] bArr) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QualityRefresh parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static QualityRefresh parseFrom(InputStream inputStream) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QualityRefresh parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QualityRefresh parseDelimitedFrom(InputStream inputStream) {
            return (QualityRefresh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QualityRefresh parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityRefresh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QualityRefresh parseFrom(CodedInputStream codedInputStream) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static QualityRefresh parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityRefresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(QualityRefresh qualityRefresh) {
            return DEFAULT_INSTANCE.createBuilder(qualityRefresh);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<QualityRefresh, a> implements h {
            private a() {
                super(QualityRefresh.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new QualityRefresh();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\t", new Object[]{"isVip_", "musicInfo_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<QualityRefresh> parser = PARSER;
                    if (parser == null) {
                        synchronized (QualityRefresh.class) {
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
            GeneratedMessageLite.registerDefaultInstance(QualityRefresh.class, DEFAULT_INSTANCE);
        }

        public static QualityRefresh getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<QualityRefresh> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class QualityLoading extends GeneratedMessageLite<QualityLoading, a> implements g {
        private static final QualityLoading DEFAULT_INSTANCE = new QualityLoading();
        private static volatile Parser<QualityLoading> PARSER = null;
        public static final int SHOW_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private boolean show_;
        private int type_;

        private QualityLoading() {
        }

        public boolean getShow() {
            return this.show_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShow(boolean z) {
            this.show_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShow() {
            this.show_ = false;
        }

        public int getType() {
            return this.type_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static QualityLoading parseFrom(ByteBuffer byteBuffer) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static QualityLoading parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static QualityLoading parseFrom(ByteString byteString) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static QualityLoading parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static QualityLoading parseFrom(byte[] bArr) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QualityLoading parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static QualityLoading parseFrom(InputStream inputStream) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QualityLoading parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QualityLoading parseDelimitedFrom(InputStream inputStream) {
            return (QualityLoading) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QualityLoading parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityLoading) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QualityLoading parseFrom(CodedInputStream codedInputStream) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static QualityLoading parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (QualityLoading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(QualityLoading qualityLoading) {
            return DEFAULT_INSTANCE.createBuilder(qualityLoading);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<QualityLoading, a> implements g {
            private a() {
                super(QualityLoading.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new QualityLoading();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0004", new Object[]{"show_", "type_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<QualityLoading> parser = PARSER;
                    if (parser == null) {
                        synchronized (QualityLoading.class) {
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
            GeneratedMessageLite.registerDefaultInstance(QualityLoading.class, DEFAULT_INSTANCE);
        }

        public static QualityLoading getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<QualityLoading> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
