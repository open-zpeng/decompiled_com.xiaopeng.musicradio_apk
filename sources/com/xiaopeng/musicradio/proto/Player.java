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
public final class Player {

    /* loaded from: classes2.dex */
    public interface a extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface aa extends MessageLiteOrBuilder {
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
    public interface v extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface w extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface x extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface y extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public interface z extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public static final class MediaType extends GeneratedMessageLite<MediaType, a> implements g {
        public static final int AUDIOTYPE_FIELD_NUMBER = 1;
        private static final MediaType DEFAULT_INSTANCE = new MediaType();
        private static volatile Parser<MediaType> PARSER;
        private int audioType_;

        private MediaType() {
        }

        public int getAudioType() {
            return this.audioType_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioType(int i) {
            this.audioType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioType() {
            this.audioType_ = 0;
        }

        public static MediaType parseFrom(ByteBuffer byteBuffer) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MediaType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MediaType parseFrom(ByteString byteString) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MediaType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MediaType parseFrom(byte[] bArr) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MediaType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MediaType parseFrom(InputStream inputStream) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaType parseDelimitedFrom(InputStream inputStream) {
            return (MediaType) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaType) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaType parseFrom(CodedInputStream codedInputStream) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MediaType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MediaType mediaType) {
            return DEFAULT_INSTANCE.createBuilder(mediaType);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MediaType, a> implements g {
            private a() {
                super(MediaType.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MediaType();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"audioType_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MediaType> parser = PARSER;
                    if (parser == null) {
                        synchronized (MediaType.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MediaType.class, DEFAULT_INSTANCE);
        }

        public static MediaType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MediaType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MediaPlayState extends GeneratedMessageLite<MediaPlayState, a> implements e {
        public static final int AUDIOTYPE_FIELD_NUMBER = 1;
        private static final MediaPlayState DEFAULT_INSTANCE = new MediaPlayState();
        public static final int PARAMS_FIELD_NUMBER = 3;
        private static volatile Parser<MediaPlayState> PARSER = null;
        public static final int PLAYSTATE_FIELD_NUMBER = 2;
        private int audioType_;
        private ByteString params_ = ByteString.EMPTY;
        private int playState_;

        private MediaPlayState() {
        }

        public int getAudioType() {
            return this.audioType_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioType(int i) {
            this.audioType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioType() {
            this.audioType_ = 0;
        }

        public int getPlayState() {
            return this.playState_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayState(int i) {
            this.playState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayState() {
            this.playState_ = 0;
        }

        public ByteString getParams() {
            return this.params_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParams(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            this.params_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParams() {
            this.params_ = getDefaultInstance().getParams();
        }

        public static MediaPlayState parseFrom(ByteBuffer byteBuffer) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MediaPlayState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MediaPlayState parseFrom(ByteString byteString) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MediaPlayState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MediaPlayState parseFrom(byte[] bArr) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MediaPlayState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MediaPlayState parseFrom(InputStream inputStream) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaPlayState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaPlayState parseDelimitedFrom(InputStream inputStream) {
            return (MediaPlayState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaPlayState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPlayState) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaPlayState parseFrom(CodedInputStream codedInputStream) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MediaPlayState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MediaPlayState mediaPlayState) {
            return DEFAULT_INSTANCE.createBuilder(mediaPlayState);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MediaPlayState, a> implements e {
            private a() {
                super(MediaPlayState.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((MediaPlayState) this.instance).setAudioType(i);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((MediaPlayState) this.instance).setPlayState(i);
                return this;
            }

            public a a(ByteString byteString) {
                copyOnWrite();
                ((MediaPlayState) this.instance).setParams(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MediaPlayState();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\n", new Object[]{"audioType_", "playState_", "params_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MediaPlayState> parser = PARSER;
                    if (parser == null) {
                        synchronized (MediaPlayState.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MediaPlayState.class, DEFAULT_INSTANCE);
        }

        public static MediaPlayState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MediaPlayState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicPlayParams extends GeneratedMessageLite<MusicPlayParams, a> implements l {
        public static final int ALBUMID_FIELD_NUMBER = 2;
        public static final int COLLECTID_FIELD_NUMBER = 4;
        private static final MusicPlayParams DEFAULT_INSTANCE = new MusicPlayParams();
        public static final int HASH_FIELD_NUMBER = 1;
        private static volatile Parser<MusicPlayParams> PARSER = null;
        public static final int PREFIX_FIELD_NUMBER = 3;
        private long albumId_;
        private long collectId_;
        private String hash_ = "";
        private String prefix_ = "";

        private MusicPlayParams() {
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

        public String getPrefix() {
            return this.prefix_;
        }

        public ByteString getPrefixBytes() {
            return ByteString.copyFromUtf8(this.prefix_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrefix(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.prefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrefix() {
            this.prefix_ = getDefaultInstance().getPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrefixBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.prefix_ = byteString.toStringUtf8();
        }

        public long getCollectId() {
            return this.collectId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectId(long j) {
            this.collectId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCollectId() {
            this.collectId_ = 0L;
        }

        public static MusicPlayParams parseFrom(ByteBuffer byteBuffer) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicPlayParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicPlayParams parseFrom(ByteString byteString) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicPlayParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicPlayParams parseFrom(byte[] bArr) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicPlayParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicPlayParams parseFrom(InputStream inputStream) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicPlayParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicPlayParams parseDelimitedFrom(InputStream inputStream) {
            return (MusicPlayParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicPlayParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicPlayParams parseFrom(CodedInputStream codedInputStream) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicPlayParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicPlayParams musicPlayParams) {
            return DEFAULT_INSTANCE.createBuilder(musicPlayParams);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicPlayParams, a> implements l {
            private a() {
                super(MusicPlayParams.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((MusicPlayParams) this.instance).setHash(str);
                return this;
            }

            public a a(long j) {
                copyOnWrite();
                ((MusicPlayParams) this.instance).setAlbumId(j);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((MusicPlayParams) this.instance).setPrefix(str);
                return this;
            }

            public a b(long j) {
                copyOnWrite();
                ((MusicPlayParams) this.instance).setCollectId(j);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicPlayParams();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004\u0002", new Object[]{"hash_", "albumId_", "prefix_", "collectId_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicPlayParams> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicPlayParams.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicPlayParams.class, DEFAULT_INSTANCE);
        }

        public static MusicPlayParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicPlayParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramPlayParams extends GeneratedMessageLite<ProgramPlayParams, a> implements v {
        public static final int ALBUMID_FIELD_NUMBER = 2;
        public static final int CHANNELID_FIELD_NUMBER = 3;
        private static final ProgramPlayParams DEFAULT_INSTANCE = new ProgramPlayParams();
        private static volatile Parser<ProgramPlayParams> PARSER = null;
        public static final int TRACKID_FIELD_NUMBER = 1;
        private long albumId_;
        private long channelId_;
        private long trackId_;

        private ProgramPlayParams() {
        }

        public long getTrackId() {
            return this.trackId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackId(long j) {
            this.trackId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackId() {
            this.trackId_ = 0L;
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

        public long getChannelId() {
            return this.channelId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelId(long j) {
            this.channelId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannelId() {
            this.channelId_ = 0L;
        }

        public static ProgramPlayParams parseFrom(ByteBuffer byteBuffer) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramPlayParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramPlayParams parseFrom(ByteString byteString) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramPlayParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramPlayParams parseFrom(byte[] bArr) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramPlayParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramPlayParams parseFrom(InputStream inputStream) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayParams parseDelimitedFrom(InputStream inputStream) {
            return (ProgramPlayParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayParams parseFrom(CodedInputStream codedInputStream) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramPlayParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramPlayParams programPlayParams) {
            return DEFAULT_INSTANCE.createBuilder(programPlayParams);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramPlayParams, a> implements v {
            private a() {
                super(ProgramPlayParams.DEFAULT_INSTANCE);
            }

            public a a(long j) {
                copyOnWrite();
                ((ProgramPlayParams) this.instance).setTrackId(j);
                return this;
            }

            public a b(long j) {
                copyOnWrite();
                ((ProgramPlayParams) this.instance).setAlbumId(j);
                return this;
            }

            public a c(long j) {
                copyOnWrite();
                ((ProgramPlayParams) this.instance).setChannelId(j);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramPlayParams();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"trackId_", "albumId_", "channelId_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramPlayParams> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramPlayParams.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramPlayParams.class, DEFAULT_INSTANCE);
        }

        public static ProgramPlayParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramPlayParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BtMusicPlayParams extends GeneratedMessageLite<BtMusicPlayParams, a> implements b {
        private static final BtMusicPlayParams DEFAULT_INSTANCE = new BtMusicPlayParams();
        public static final int HASH_FIELD_NUMBER = 1;
        private static volatile Parser<BtMusicPlayParams> PARSER;
        private String hash_ = "";

        private BtMusicPlayParams() {
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

        public static BtMusicPlayParams parseFrom(ByteBuffer byteBuffer) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BtMusicPlayParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BtMusicPlayParams parseFrom(ByteString byteString) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BtMusicPlayParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BtMusicPlayParams parseFrom(byte[] bArr) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BtMusicPlayParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BtMusicPlayParams parseFrom(InputStream inputStream) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BtMusicPlayParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BtMusicPlayParams parseDelimitedFrom(InputStream inputStream) {
            return (BtMusicPlayParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BtMusicPlayParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BtMusicPlayParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BtMusicPlayParams parseFrom(CodedInputStream codedInputStream) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BtMusicPlayParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BtMusicPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(BtMusicPlayParams btMusicPlayParams) {
            return DEFAULT_INSTANCE.createBuilder(btMusicPlayParams);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<BtMusicPlayParams, a> implements b {
            private a() {
                super(BtMusicPlayParams.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((BtMusicPlayParams) this.instance).setHash(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BtMusicPlayParams();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"hash_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BtMusicPlayParams> parser = PARSER;
                    if (parser == null) {
                        synchronized (BtMusicPlayParams.class) {
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
            GeneratedMessageLite.registerDefaultInstance(BtMusicPlayParams.class, DEFAULT_INSTANCE);
        }

        public static BtMusicPlayParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BtMusicPlayParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class NetRadioPlayParams extends GeneratedMessageLite<NetRadioPlayParams, a> implements o {
        public static final int DAYOFWEEK_FIELD_NUMBER = 4;
        private static final NetRadioPlayParams DEFAULT_INSTANCE = new NetRadioPlayParams();
        private static volatile Parser<NetRadioPlayParams> PARSER = null;
        public static final int PROGRAMID_FIELD_NUMBER = 2;
        public static final int RADIOID_FIELD_NUMBER = 1;
        public static final int STARTTIME_FIELD_NUMBER = 3;
        private int programId_;
        private int radioId_;
        private String startTime_ = "";
        private String dayOfWeek_ = "";

        private NetRadioPlayParams() {
        }

        public int getRadioId() {
            return this.radioId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRadioId(int i) {
            this.radioId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRadioId() {
            this.radioId_ = 0;
        }

        public int getProgramId() {
            return this.programId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramId(int i) {
            this.programId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProgramId() {
            this.programId_ = 0;
        }

        public String getStartTime() {
            return this.startTime_;
        }

        public ByteString getStartTimeBytes() {
            return ByteString.copyFromUtf8(this.startTime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.startTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = getDefaultInstance().getStartTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.startTime_ = byteString.toStringUtf8();
        }

        public String getDayOfWeek() {
            return this.dayOfWeek_;
        }

        public ByteString getDayOfWeekBytes() {
            return ByteString.copyFromUtf8(this.dayOfWeek_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDayOfWeek(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.dayOfWeek_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDayOfWeek() {
            this.dayOfWeek_ = getDefaultInstance().getDayOfWeek();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDayOfWeekBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.dayOfWeek_ = byteString.toStringUtf8();
        }

        public static NetRadioPlayParams parseFrom(ByteBuffer byteBuffer) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NetRadioPlayParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetRadioPlayParams parseFrom(ByteString byteString) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetRadioPlayParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetRadioPlayParams parseFrom(byte[] bArr) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetRadioPlayParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetRadioPlayParams parseFrom(InputStream inputStream) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioPlayParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioPlayParams parseDelimitedFrom(InputStream inputStream) {
            return (NetRadioPlayParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioPlayParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioPlayParams parseFrom(CodedInputStream codedInputStream) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetRadioPlayParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(NetRadioPlayParams netRadioPlayParams) {
            return DEFAULT_INSTANCE.createBuilder(netRadioPlayParams);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<NetRadioPlayParams, a> implements o {
            private a() {
                super(NetRadioPlayParams.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((NetRadioPlayParams) this.instance).setRadioId(i);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((NetRadioPlayParams) this.instance).setProgramId(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((NetRadioPlayParams) this.instance).setStartTime(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((NetRadioPlayParams) this.instance).setDayOfWeek(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new NetRadioPlayParams();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"radioId_", "programId_", "startTime_", "dayOfWeek_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NetRadioPlayParams> parser = PARSER;
                    if (parser == null) {
                        synchronized (NetRadioPlayParams.class) {
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
            GeneratedMessageLite.registerDefaultInstance(NetRadioPlayParams.class, DEFAULT_INSTANCE);
        }

        public static NetRadioPlayParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NetRadioPlayParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MediaPosition extends GeneratedMessageLite<MediaPosition, a> implements f {
        private static final MediaPosition DEFAULT_INSTANCE = new MediaPosition();
        public static final int MAXPOS_FIELD_NUMBER = 2;
        private static volatile Parser<MediaPosition> PARSER = null;
        public static final int POS_FIELD_NUMBER = 1;
        public static final int SECPOS_FIELD_NUMBER = 3;
        private int maxPos_;
        private int pos_;
        private int secPos_;

        private MediaPosition() {
        }

        public int getPos() {
            return this.pos_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPos(int i) {
            this.pos_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPos() {
            this.pos_ = 0;
        }

        public int getMaxPos() {
            return this.maxPos_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxPos(int i) {
            this.maxPos_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxPos() {
            this.maxPos_ = 0;
        }

        public int getSecPos() {
            return this.secPos_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecPos(int i) {
            this.secPos_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecPos() {
            this.secPos_ = 0;
        }

        public static MediaPosition parseFrom(ByteBuffer byteBuffer) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MediaPosition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MediaPosition parseFrom(ByteString byteString) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MediaPosition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MediaPosition parseFrom(byte[] bArr) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MediaPosition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MediaPosition parseFrom(InputStream inputStream) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaPosition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaPosition parseDelimitedFrom(InputStream inputStream) {
            return (MediaPosition) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaPosition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPosition) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaPosition parseFrom(CodedInputStream codedInputStream) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MediaPosition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MediaPosition mediaPosition) {
            return DEFAULT_INSTANCE.createBuilder(mediaPosition);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MediaPosition, a> implements f {
            private a() {
                super(MediaPosition.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MediaPosition();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"pos_", "maxPos_", "secPos_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MediaPosition> parser = PARSER;
                    if (parser == null) {
                        synchronized (MediaPosition.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MediaPosition.class, DEFAULT_INSTANCE);
        }

        public static MediaPosition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MediaPosition> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class CoverInfo extends GeneratedMessageLite<CoverInfo, a> implements c {
        public static final int BUFFER_FIELD_NUMBER = 4;
        public static final int CONFIG_FIELD_NUMBER = 3;
        private static final CoverInfo DEFAULT_INSTANCE = new CoverInfo();
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile Parser<CoverInfo> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private ByteString buffer_ = ByteString.EMPTY;
        private int config_;
        private int height_;
        private int width_;

        private CoverInfo() {
        }

        public int getWidth() {
            return this.width_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i) {
            this.width_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0;
        }

        public int getHeight() {
            return this.height_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i) {
            this.height_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0;
        }

        public int getConfig() {
            return this.config_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfig(int i) {
            this.config_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = 0;
        }

        public ByteString getBuffer() {
            return this.buffer_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuffer(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            this.buffer_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuffer() {
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        public static CoverInfo parseFrom(ByteBuffer byteBuffer) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CoverInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CoverInfo parseFrom(ByteString byteString) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CoverInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CoverInfo parseFrom(byte[] bArr) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CoverInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CoverInfo parseFrom(InputStream inputStream) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoverInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CoverInfo parseDelimitedFrom(InputStream inputStream) {
            return (CoverInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CoverInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoverInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CoverInfo parseFrom(CodedInputStream codedInputStream) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CoverInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoverInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(CoverInfo coverInfo) {
            return DEFAULT_INSTANCE.createBuilder(coverInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<CoverInfo, a> implements c {
            private a() {
                super(CoverInfo.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new CoverInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\n", new Object[]{"width_", "height_", "config_", "buffer_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CoverInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (CoverInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(CoverInfo.class, DEFAULT_INSTANCE);
        }

        public static CoverInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CoverInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MediaLove extends GeneratedMessageLite<MediaLove, a> implements d {
        private static final MediaLove DEFAULT_INSTANCE = new MediaLove();
        public static final int ENABLE_FIELD_NUMBER = 2;
        public static final int ISLOVE_FIELD_NUMBER = 1;
        private static volatile Parser<MediaLove> PARSER;
        private boolean enable_;
        private boolean isLove_;

        private MediaLove() {
        }

        public boolean getIsLove() {
            return this.isLove_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsLove(boolean z) {
            this.isLove_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsLove() {
            this.isLove_ = false;
        }

        public boolean getEnable() {
            return this.enable_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnable(boolean z) {
            this.enable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnable() {
            this.enable_ = false;
        }

        public static MediaLove parseFrom(ByteBuffer byteBuffer) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MediaLove parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MediaLove parseFrom(ByteString byteString) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MediaLove parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MediaLove parseFrom(byte[] bArr) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MediaLove parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MediaLove parseFrom(InputStream inputStream) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaLove parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaLove parseDelimitedFrom(InputStream inputStream) {
            return (MediaLove) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediaLove parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaLove) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediaLove parseFrom(CodedInputStream codedInputStream) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MediaLove parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaLove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MediaLove mediaLove) {
            return DEFAULT_INSTANCE.createBuilder(mediaLove);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MediaLove, a> implements d {
            private a() {
                super(MediaLove.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MediaLove) this.instance).setIsLove(z);
                return this;
            }

            public a b(boolean z) {
                copyOnWrite();
                ((MediaLove) this.instance).setEnable(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MediaLove();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"isLove_", "enable_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MediaLove> parser = PARSER;
                    if (parser == null) {
                        synchronized (MediaLove.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MediaLove.class, DEFAULT_INSTANCE);
        }

        public static MediaLove getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MediaLove> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class TitleInfo extends GeneratedMessageLite<TitleInfo, a> implements aa {
        private static final TitleInfo DEFAULT_INSTANCE = new TitleInfo();
        private static volatile Parser<TitleInfo> PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String subTitle_ = "";

        private TitleInfo() {
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

        public String getSubTitle() {
            return this.subTitle_;
        }

        public ByteString getSubTitleBytes() {
            return ByteString.copyFromUtf8(this.subTitle_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitle(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.subTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubTitle() {
            this.subTitle_ = getDefaultInstance().getSubTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTitleBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.subTitle_ = byteString.toStringUtf8();
        }

        public static TitleInfo parseFrom(ByteBuffer byteBuffer) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TitleInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TitleInfo parseFrom(ByteString byteString) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TitleInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TitleInfo parseFrom(byte[] bArr) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TitleInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TitleInfo parseFrom(InputStream inputStream) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TitleInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TitleInfo parseDelimitedFrom(InputStream inputStream) {
            return (TitleInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TitleInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TitleInfo parseFrom(CodedInputStream codedInputStream) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TitleInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(TitleInfo titleInfo) {
            return DEFAULT_INSTANCE.createBuilder(titleInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<TitleInfo, a> implements aa {
            private a() {
                super(TitleInfo.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((TitleInfo) this.instance).setTitle(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((TitleInfo) this.instance).setSubTitle(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new TitleInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"title_", "subTitle_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TitleInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (TitleInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(TitleInfo.class, DEFAULT_INSTANCE);
        }

        public static TitleInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TitleInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlayMode extends GeneratedMessageLite<PlayMode, a> implements q {
        private static final PlayMode DEFAULT_INSTANCE = new PlayMode();
        public static final int ENABLE_FIELD_NUMBER = 2;
        public static final int MODE_FIELD_NUMBER = 1;
        private static volatile Parser<PlayMode> PARSER;
        private boolean enable_;
        private int mode_;

        private PlayMode() {
        }

        public int getMode() {
            return this.mode_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMode(int i) {
            this.mode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMode() {
            this.mode_ = 0;
        }

        public boolean getEnable() {
            return this.enable_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnable(boolean z) {
            this.enable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnable() {
            this.enable_ = false;
        }

        public static PlayMode parseFrom(ByteBuffer byteBuffer) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PlayMode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PlayMode parseFrom(ByteString byteString) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PlayMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PlayMode parseFrom(byte[] bArr) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlayMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PlayMode parseFrom(InputStream inputStream) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlayMode parseDelimitedFrom(InputStream inputStream) {
            return (PlayMode) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayMode) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlayMode parseFrom(CodedInputStream codedInputStream) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PlayMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(PlayMode playMode) {
            return DEFAULT_INSTANCE.createBuilder(playMode);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<PlayMode, a> implements q {
            private a() {
                super(PlayMode.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((PlayMode) this.instance).setMode(i);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((PlayMode) this.instance).setEnable(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new PlayMode();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"mode_", "enable_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PlayMode> parser = PARSER;
                    if (parser == null) {
                        synchronized (PlayMode.class) {
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
            GeneratedMessageLite.registerDefaultInstance(PlayMode.class, DEFAULT_INSTANCE);
        }

        public static PlayMode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PlayMode> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicPlayInfo extends GeneratedMessageLite<MusicPlayInfo, a> implements j {
        public static final int ALBUMID_FIELD_NUMBER = 2;
        private static final MusicPlayInfo DEFAULT_INSTANCE = new MusicPlayInfo();
        public static final int HASH_FIELD_NUMBER = 1;
        public static final int ISLOCAL_FIELD_NUMBER = 8;
        public static final int ISLOVE_FIELD_NUMBER = 7;
        public static final int LOGO_FIELD_NUMBER = 5;
        public static final int NEEDVIP_FIELD_NUMBER = 9;
        private static volatile Parser<MusicPlayInfo> PARSER = null;
        public static final int PLAYSTATE_FIELD_NUMBER = 6;
        public static final int SINGER_FIELD_NUMBER = 4;
        public static final int SONG_FIELD_NUMBER = 3;
        public static final int SUPPORTSQ_FIELD_NUMBER = 10;
        private long albumId_;
        private boolean isLocal_;
        private boolean isLove_;
        private boolean needVip_;
        private int playState_;
        private boolean supportSQ_;
        private String hash_ = "";
        private String song_ = "";
        private String singer_ = "";
        private String logo_ = "";

        private MusicPlayInfo() {
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

        public int getPlayState() {
            return this.playState_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayState(int i) {
            this.playState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayState() {
            this.playState_ = 0;
        }

        public boolean getIsLove() {
            return this.isLove_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsLove(boolean z) {
            this.isLove_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsLove() {
            this.isLove_ = false;
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

        public boolean getSupportSQ() {
            return this.supportSQ_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportSQ(boolean z) {
            this.supportSQ_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportSQ() {
            this.supportSQ_ = false;
        }

        public static MusicPlayInfo parseFrom(ByteBuffer byteBuffer) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicPlayInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicPlayInfo parseFrom(ByteString byteString) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicPlayInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicPlayInfo parseFrom(byte[] bArr) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicPlayInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicPlayInfo parseFrom(InputStream inputStream) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicPlayInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicPlayInfo parseDelimitedFrom(InputStream inputStream) {
            return (MusicPlayInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicPlayInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicPlayInfo parseFrom(CodedInputStream codedInputStream) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicPlayInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicPlayInfo musicPlayInfo) {
            return DEFAULT_INSTANCE.createBuilder(musicPlayInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicPlayInfo, a> implements j {
            private a() {
                super(MusicPlayInfo.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setHash(str);
                return this;
            }

            public a a(long j) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setAlbumId(j);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setSong(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setSinger(str);
                return this;
            }

            public a d(String str) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setLogo(str);
                return this;
            }

            public a a(int i) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setPlayState(i);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setIsLove(z);
                return this;
            }

            public a b(boolean z) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setIsLocal(z);
                return this;
            }

            public a c(boolean z) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setNeedVip(z);
                return this;
            }

            public a d(boolean z) {
                copyOnWrite();
                ((MusicPlayInfo) this.instance).setSupportSQ(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicPlayInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007\u0007\b\u0007\t\u0007\n\u0007", new Object[]{"hash_", "albumId_", "song_", "singer_", "logo_", "playState_", "isLove_", "isLocal_", "needVip_", "supportSQ_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicPlayInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicPlayInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicPlayInfo.class, DEFAULT_INSTANCE);
        }

        public static MusicPlayInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicPlayInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicPlayList extends GeneratedMessageLite<MusicPlayList, a> implements k {
        private static final MusicPlayList DEFAULT_INSTANCE = new MusicPlayList();
        public static final int MUSICLIST_FIELD_NUMBER = 1;
        private static volatile Parser<MusicPlayList> PARSER;
        private Internal.ProtobufList<MusicPlayInfo> musicList_ = emptyProtobufList();

        private MusicPlayList() {
        }

        public List<MusicPlayInfo> getMusicListList() {
            return this.musicList_;
        }

        public List<? extends j> getMusicListOrBuilderList() {
            return this.musicList_;
        }

        public int getMusicListCount() {
            return this.musicList_.size();
        }

        public MusicPlayInfo getMusicList(int i) {
            return this.musicList_.get(i);
        }

        public j getMusicListOrBuilder(int i) {
            return this.musicList_.get(i);
        }

        private void ensureMusicListIsMutable() {
            if (this.musicList_.isModifiable()) {
                return;
            }
            this.musicList_ = GeneratedMessageLite.mutableCopy(this.musicList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicList(int i, MusicPlayInfo musicPlayInfo) {
            if (musicPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureMusicListIsMutable();
            this.musicList_.set(i, musicPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicList(int i, MusicPlayInfo.a aVar) {
            ensureMusicListIsMutable();
            this.musicList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicList(MusicPlayInfo musicPlayInfo) {
            if (musicPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureMusicListIsMutable();
            this.musicList_.add(musicPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicList(int i, MusicPlayInfo musicPlayInfo) {
            if (musicPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureMusicListIsMutable();
            this.musicList_.add(i, musicPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicList(MusicPlayInfo.a aVar) {
            ensureMusicListIsMutable();
            this.musicList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicList(int i, MusicPlayInfo.a aVar) {
            ensureMusicListIsMutable();
            this.musicList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMusicList(Iterable<? extends MusicPlayInfo> iterable) {
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

        public static MusicPlayList parseFrom(ByteBuffer byteBuffer) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicPlayList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicPlayList parseFrom(ByteString byteString) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicPlayList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicPlayList parseFrom(byte[] bArr) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicPlayList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicPlayList parseFrom(InputStream inputStream) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicPlayList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicPlayList parseDelimitedFrom(InputStream inputStream) {
            return (MusicPlayList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicPlayList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicPlayList parseFrom(CodedInputStream codedInputStream) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicPlayList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicPlayList musicPlayList) {
            return DEFAULT_INSTANCE.createBuilder(musicPlayList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicPlayList, a> implements k {
            private a() {
                super(MusicPlayList.DEFAULT_INSTANCE);
            }

            public a a(MusicPlayInfo musicPlayInfo) {
                copyOnWrite();
                ((MusicPlayList) this.instance).addMusicList(musicPlayInfo);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicPlayList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"musicList_", MusicPlayInfo.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicPlayList> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicPlayList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicPlayList.class, DEFAULT_INSTANCE);
        }

        public static MusicPlayList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicPlayList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicLrcIndex extends GeneratedMessageLite<MusicLrcIndex, a> implements h {
        public static final int CURRENTTIME_FIELD_NUMBER = 1;
        private static final MusicLrcIndex DEFAULT_INSTANCE = new MusicLrcIndex();
        private static volatile Parser<MusicLrcIndex> PARSER;
        private int currentTime_;

        private MusicLrcIndex() {
        }

        public int getCurrentTime() {
            return this.currentTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(int i) {
            this.currentTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentTime() {
            this.currentTime_ = 0;
        }

        public static MusicLrcIndex parseFrom(ByteBuffer byteBuffer) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicLrcIndex parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicLrcIndex parseFrom(ByteString byteString) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicLrcIndex parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicLrcIndex parseFrom(byte[] bArr) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicLrcIndex parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicLrcIndex parseFrom(InputStream inputStream) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLrcIndex parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicLrcIndex parseDelimitedFrom(InputStream inputStream) {
            return (MusicLrcIndex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLrcIndex parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcIndex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicLrcIndex parseFrom(CodedInputStream codedInputStream) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicLrcIndex parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicLrcIndex musicLrcIndex) {
            return DEFAULT_INSTANCE.createBuilder(musicLrcIndex);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicLrcIndex, a> implements h {
            private a() {
                super(MusicLrcIndex.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((MusicLrcIndex) this.instance).setCurrentTime(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicLrcIndex();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"currentTime_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicLrcIndex> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicLrcIndex.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicLrcIndex.class, DEFAULT_INSTANCE);
        }

        public static MusicLrcIndex getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicLrcIndex> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MusicLrcInfo extends GeneratedMessageLite<MusicLrcInfo, a> implements i {
        public static final int CURTIME_FIELD_NUMBER = 1;
        private static final MusicLrcInfo DEFAULT_INSTANCE = new MusicLrcInfo();
        public static final int LRCCONTENT_FIELD_NUMBER = 2;
        private static volatile Parser<MusicLrcInfo> PARSER;
        private int curTime_;
        private String lrcContent_ = "";

        private MusicLrcInfo() {
        }

        public int getCurTime() {
            return this.curTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurTime(int i) {
            this.curTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurTime() {
            this.curTime_ = 0;
        }

        public String getLrcContent() {
            return this.lrcContent_;
        }

        public ByteString getLrcContentBytes() {
            return ByteString.copyFromUtf8(this.lrcContent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLrcContent(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.lrcContent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLrcContent() {
            this.lrcContent_ = getDefaultInstance().getLrcContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLrcContentBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.lrcContent_ = byteString.toStringUtf8();
        }

        public static MusicLrcInfo parseFrom(ByteBuffer byteBuffer) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MusicLrcInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MusicLrcInfo parseFrom(ByteString byteString) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MusicLrcInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MusicLrcInfo parseFrom(byte[] bArr) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicLrcInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MusicLrcInfo parseFrom(InputStream inputStream) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLrcInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicLrcInfo parseDelimitedFrom(InputStream inputStream) {
            return (MusicLrcInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLrcInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MusicLrcInfo parseFrom(CodedInputStream codedInputStream) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MusicLrcInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MusicLrcInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MusicLrcInfo musicLrcInfo) {
            return DEFAULT_INSTANCE.createBuilder(musicLrcInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MusicLrcInfo, a> implements i {
            private a() {
                super(MusicLrcInfo.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((MusicLrcInfo) this.instance).setCurTime(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((MusicLrcInfo) this.instance).setLrcContent(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MusicLrcInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"curTime_", "lrcContent_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MusicLrcInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (MusicLrcInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MusicLrcInfo.class, DEFAULT_INSTANCE);
        }

        public static MusicLrcInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MusicLrcInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramPlayInfo extends GeneratedMessageLite<ProgramPlayInfo, a> implements s {
        public static final int AUTHORIZED_FIELD_NUMBER = 7;
        public static final int CREATETIME_FIELD_NUMBER = 4;
        private static final ProgramPlayInfo DEFAULT_INSTANCE = new ProgramPlayInfo();
        public static final int ORDERNUM_FIELD_NUMBER = 3;
        private static volatile Parser<ProgramPlayInfo> PARSER = null;
        public static final int PAYMENTTYPE_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int TRACKID_FIELD_NUMBER = 1;
        public static final int UPDATETIME_FIELD_NUMBER = 5;
        private boolean authorized_;
        private long createTime_;
        private int orderNum_;
        private int paymentType_;
        private String title_ = "";
        private int trackId_;
        private long updateTime_;

        private ProgramPlayInfo() {
        }

        public int getTrackId() {
            return this.trackId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackId(int i) {
            this.trackId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackId() {
            this.trackId_ = 0;
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

        public int getOrderNum() {
            return this.orderNum_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderNum(int i) {
            this.orderNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrderNum() {
            this.orderNum_ = 0;
        }

        public long getCreateTime() {
            return this.createTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateTime(long j) {
            this.createTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreateTime() {
            this.createTime_ = 0L;
        }

        public long getUpdateTime() {
            return this.updateTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateTime(long j) {
            this.updateTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateTime() {
            this.updateTime_ = 0L;
        }

        public int getPaymentType() {
            return this.paymentType_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaymentType(int i) {
            this.paymentType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaymentType() {
            this.paymentType_ = 0;
        }

        public boolean getAuthorized() {
            return this.authorized_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthorized(boolean z) {
            this.authorized_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuthorized() {
            this.authorized_ = false;
        }

        public static ProgramPlayInfo parseFrom(ByteBuffer byteBuffer) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramPlayInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramPlayInfo parseFrom(ByteString byteString) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramPlayInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramPlayInfo parseFrom(byte[] bArr) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramPlayInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramPlayInfo parseFrom(InputStream inputStream) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayInfo parseDelimitedFrom(InputStream inputStream) {
            return (ProgramPlayInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayInfo parseFrom(CodedInputStream codedInputStream) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramPlayInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramPlayInfo programPlayInfo) {
            return DEFAULT_INSTANCE.createBuilder(programPlayInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramPlayInfo, a> implements s {
            private a() {
                super(ProgramPlayInfo.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((ProgramPlayInfo) this.instance).setTrackId(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((ProgramPlayInfo) this.instance).setTitle(str);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((ProgramPlayInfo) this.instance).setOrderNum(i);
                return this;
            }

            public a a(long j) {
                copyOnWrite();
                ((ProgramPlayInfo) this.instance).setCreateTime(j);
                return this;
            }

            public a b(long j) {
                copyOnWrite();
                ((ProgramPlayInfo) this.instance).setUpdateTime(j);
                return this;
            }

            public a c(int i) {
                copyOnWrite();
                ((ProgramPlayInfo) this.instance).setPaymentType(i);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((ProgramPlayInfo) this.instance).setAuthorized(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramPlayInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004\u0002\u0005\u0002\u0006\u0004\u0007\u0007", new Object[]{"trackId_", "title_", "orderNum_", "createTime_", "updateTime_", "paymentType_", "authorized_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramPlayInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramPlayInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramPlayInfo.class, DEFAULT_INSTANCE);
        }

        public static ProgramPlayInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramPlayInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramPlayList extends GeneratedMessageLite<ProgramPlayList, a> implements u {
        private static final ProgramPlayList DEFAULT_INSTANCE = new ProgramPlayList();
        public static final int PAGESTR_FIELD_NUMBER = 4;
        public static final int PAGE_FIELD_NUMBER = 1;
        private static volatile Parser<ProgramPlayList> PARSER = null;
        public static final int PROGRAMLIST_FIELD_NUMBER = 3;
        public static final int TOTALPAGE_FIELD_NUMBER = 2;
        private int page_;
        private int totalPage_;
        private Internal.ProtobufList<ProgramPlayInfo> programList_ = emptyProtobufList();
        private String pageStr_ = "";

        private ProgramPlayList() {
        }

        public int getPage() {
            return this.page_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPage(int i) {
            this.page_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPage() {
            this.page_ = 0;
        }

        public int getTotalPage() {
            return this.totalPage_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalPage(int i) {
            this.totalPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalPage() {
            this.totalPage_ = 0;
        }

        public List<ProgramPlayInfo> getProgramListList() {
            return this.programList_;
        }

        public List<? extends s> getProgramListOrBuilderList() {
            return this.programList_;
        }

        public int getProgramListCount() {
            return this.programList_.size();
        }

        public ProgramPlayInfo getProgramList(int i) {
            return this.programList_.get(i);
        }

        public s getProgramListOrBuilder(int i) {
            return this.programList_.get(i);
        }

        private void ensureProgramListIsMutable() {
            if (this.programList_.isModifiable()) {
                return;
            }
            this.programList_ = GeneratedMessageLite.mutableCopy(this.programList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramList(int i, ProgramPlayInfo programPlayInfo) {
            if (programPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.set(i, programPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramList(int i, ProgramPlayInfo.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(ProgramPlayInfo programPlayInfo) {
            if (programPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.add(programPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(int i, ProgramPlayInfo programPlayInfo) {
            if (programPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.add(i, programPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(ProgramPlayInfo.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(int i, ProgramPlayInfo.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllProgramList(Iterable<? extends ProgramPlayInfo> iterable) {
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

        public String getPageStr() {
            return this.pageStr_;
        }

        public ByteString getPageStrBytes() {
            return ByteString.copyFromUtf8(this.pageStr_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageStr(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.pageStr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPageStr() {
            this.pageStr_ = getDefaultInstance().getPageStr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageStrBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.pageStr_ = byteString.toStringUtf8();
        }

        public static ProgramPlayList parseFrom(ByteBuffer byteBuffer) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramPlayList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramPlayList parseFrom(ByteString byteString) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramPlayList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramPlayList parseFrom(byte[] bArr) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramPlayList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramPlayList parseFrom(InputStream inputStream) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayList parseDelimitedFrom(InputStream inputStream) {
            return (ProgramPlayList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayList parseFrom(CodedInputStream codedInputStream) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramPlayList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramPlayList programPlayList) {
            return DEFAULT_INSTANCE.createBuilder(programPlayList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramPlayList, a> implements u {
            private a() {
                super(ProgramPlayList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((ProgramPlayList) this.instance).setPage(i);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((ProgramPlayList) this.instance).setTotalPage(i);
                return this;
            }

            public a a(ProgramPlayInfo programPlayInfo) {
                copyOnWrite();
                ((ProgramPlayList) this.instance).addProgramList(programPlayInfo);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((ProgramPlayList) this.instance).setPageStr(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramPlayList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u001b\u0004Ȉ", new Object[]{"page_", "totalPage_", "programList_", ProgramPlayInfo.class, "pageStr_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramPlayList> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramPlayList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramPlayList.class, DEFAULT_INSTANCE);
        }

        public static ProgramPlayList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramPlayList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramPlayListError extends GeneratedMessageLite<ProgramPlayListError, a> implements t {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final ProgramPlayListError DEFAULT_INSTANCE = new ProgramPlayListError();
        public static final int MSG_FIELD_NUMBER = 2;
        private static volatile Parser<ProgramPlayListError> PARSER;
        private int code_;
        private String msg_ = "";

        private ProgramPlayListError() {
        }

        public int getCode() {
            return this.code_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i) {
            this.code_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        public String getMsg() {
            return this.msg_;
        }

        public ByteString getMsgBytes() {
            return ByteString.copyFromUtf8(this.msg_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.msg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.msg_ = byteString.toStringUtf8();
        }

        public static ProgramPlayListError parseFrom(ByteBuffer byteBuffer) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramPlayListError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramPlayListError parseFrom(ByteString byteString) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramPlayListError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramPlayListError parseFrom(byte[] bArr) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramPlayListError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramPlayListError parseFrom(InputStream inputStream) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayListError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayListError parseDelimitedFrom(InputStream inputStream) {
            return (ProgramPlayListError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayListError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayListError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayListError parseFrom(CodedInputStream codedInputStream) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramPlayListError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayListError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramPlayListError programPlayListError) {
            return DEFAULT_INSTANCE.createBuilder(programPlayListError);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramPlayListError, a> implements t {
            private a() {
                super(ProgramPlayListError.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramPlayListError();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"code_", "msg_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramPlayListError> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramPlayListError.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramPlayListError.class, DEFAULT_INSTANCE);
        }

        public static ProgramPlayListError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramPlayListError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramPageList extends GeneratedMessageLite<ProgramPageList, a> implements r {
        public static final int CURPAGE_FIELD_NUMBER = 1;
        private static final ProgramPageList DEFAULT_INSTANCE = new ProgramPageList();
        public static final int PAGELIST_FIELD_NUMBER = 2;
        private static volatile Parser<ProgramPageList> PARSER;
        private int curPage_;
        private Internal.ProtobufList<String> pageList_ = GeneratedMessageLite.emptyProtobufList();

        private ProgramPageList() {
        }

        public int getCurPage() {
            return this.curPage_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurPage(int i) {
            this.curPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurPage() {
            this.curPage_ = 0;
        }

        public List<String> getPageListList() {
            return this.pageList_;
        }

        public int getPageListCount() {
            return this.pageList_.size();
        }

        public String getPageList(int i) {
            return this.pageList_.get(i);
        }

        public ByteString getPageListBytes(int i) {
            return ByteString.copyFromUtf8(this.pageList_.get(i));
        }

        private void ensurePageListIsMutable() {
            if (this.pageList_.isModifiable()) {
                return;
            }
            this.pageList_ = GeneratedMessageLite.mutableCopy(this.pageList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageList(int i, String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            ensurePageListIsMutable();
            this.pageList_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPageList(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            ensurePageListIsMutable();
            this.pageList_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPageList(Iterable<String> iterable) {
            ensurePageListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.pageList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPageList() {
            this.pageList_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPageListBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            ensurePageListIsMutable();
            this.pageList_.add(byteString.toStringUtf8());
        }

        public static ProgramPageList parseFrom(ByteBuffer byteBuffer) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramPageList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramPageList parseFrom(ByteString byteString) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramPageList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramPageList parseFrom(byte[] bArr) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramPageList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramPageList parseFrom(InputStream inputStream) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPageList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPageList parseDelimitedFrom(InputStream inputStream) {
            return (ProgramPageList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPageList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPageList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPageList parseFrom(CodedInputStream codedInputStream) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramPageList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramPageList programPageList) {
            return DEFAULT_INSTANCE.createBuilder(programPageList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramPageList, a> implements r {
            private a() {
                super(ProgramPageList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((ProgramPageList) this.instance).setCurPage(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((ProgramPageList) this.instance).addPageList(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramPageList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002Ț", new Object[]{"curPage_", "pageList_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramPageList> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramPageList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramPageList.class, DEFAULT_INSTANCE);
        }

        public static ProgramPageList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramPageList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramVipType extends GeneratedMessageLite<ProgramVipType, a> implements z {
        public static final int AUTHORIZED_FIELD_NUMBER = 2;
        private static final ProgramVipType DEFAULT_INSTANCE = new ProgramVipType();
        private static volatile Parser<ProgramVipType> PARSER = null;
        public static final int PAYMENTTYPE_FIELD_NUMBER = 1;
        private boolean authorized_;
        private int paymentType_;

        private ProgramVipType() {
        }

        public int getPaymentType() {
            return this.paymentType_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaymentType(int i) {
            this.paymentType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaymentType() {
            this.paymentType_ = 0;
        }

        public boolean getAuthorized() {
            return this.authorized_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthorized(boolean z) {
            this.authorized_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuthorized() {
            this.authorized_ = false;
        }

        public static ProgramVipType parseFrom(ByteBuffer byteBuffer) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramVipType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramVipType parseFrom(ByteString byteString) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramVipType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramVipType parseFrom(byte[] bArr) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramVipType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramVipType parseFrom(InputStream inputStream) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramVipType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramVipType parseDelimitedFrom(InputStream inputStream) {
            return (ProgramVipType) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramVipType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramVipType) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramVipType parseFrom(CodedInputStream codedInputStream) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramVipType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramVipType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramVipType programVipType) {
            return DEFAULT_INSTANCE.createBuilder(programVipType);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramVipType, a> implements z {
            private a() {
                super(ProgramVipType.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((ProgramVipType) this.instance).setPaymentType(i);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((ProgramVipType) this.instance).setAuthorized(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramVipType();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"paymentType_", "authorized_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramVipType> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramVipType.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramVipType.class, DEFAULT_INSTANCE);
        }

        public static ProgramVipType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramVipType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramSort extends GeneratedMessageLite<ProgramSort, a> implements x {
        private static final ProgramSort DEFAULT_INSTANCE = new ProgramSort();
        private static volatile Parser<ProgramSort> PARSER = null;
        public static final int SORT_FIELD_NUMBER = 1;
        private String sort_ = "";

        private ProgramSort() {
        }

        public String getSort() {
            return this.sort_;
        }

        public ByteString getSortBytes() {
            return ByteString.copyFromUtf8(this.sort_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSort(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.sort_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSort() {
            this.sort_ = getDefaultInstance().getSort();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSortBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.sort_ = byteString.toStringUtf8();
        }

        public static ProgramSort parseFrom(ByteBuffer byteBuffer) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramSort parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramSort parseFrom(ByteString byteString) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramSort parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramSort parseFrom(byte[] bArr) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramSort parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramSort parseFrom(InputStream inputStream) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramSort parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramSort parseDelimitedFrom(InputStream inputStream) {
            return (ProgramSort) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramSort parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSort) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramSort parseFrom(CodedInputStream codedInputStream) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramSort parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSort) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramSort programSort) {
            return DEFAULT_INSTANCE.createBuilder(programSort);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramSort, a> implements x {
            private a() {
                super(ProgramSort.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((ProgramSort) this.instance).setSort(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramSort();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"sort_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramSort> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramSort.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramSort.class, DEFAULT_INSTANCE);
        }

        public static ProgramSort getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramSort> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramSpeed extends GeneratedMessageLite<ProgramSpeed, a> implements y {
        private static final ProgramSpeed DEFAULT_INSTANCE = new ProgramSpeed();
        private static volatile Parser<ProgramSpeed> PARSER = null;
        public static final int SPEED_FIELD_NUMBER = 1;
        private float speed_;

        private ProgramSpeed() {
        }

        public float getSpeed() {
            return this.speed_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeed(float f) {
            this.speed_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeed() {
            this.speed_ = 0.0f;
        }

        public static ProgramSpeed parseFrom(ByteBuffer byteBuffer) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramSpeed parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramSpeed parseFrom(ByteString byteString) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramSpeed parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramSpeed parseFrom(byte[] bArr) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramSpeed parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramSpeed parseFrom(InputStream inputStream) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramSpeed parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramSpeed parseDelimitedFrom(InputStream inputStream) {
            return (ProgramSpeed) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramSpeed parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSpeed) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramSpeed parseFrom(CodedInputStream codedInputStream) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramSpeed parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramSpeed) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramSpeed programSpeed) {
            return DEFAULT_INSTANCE.createBuilder(programSpeed);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramSpeed, a> implements y {
            private a() {
                super(ProgramSpeed.DEFAULT_INSTANCE);
            }

            public a a(float f) {
                copyOnWrite();
                ((ProgramSpeed) this.instance).setSpeed(f);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramSpeed();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"speed_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramSpeed> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramSpeed.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramSpeed.class, DEFAULT_INSTANCE);
        }

        public static ProgramSpeed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramSpeed> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ProgramPlayPreList extends GeneratedMessageLite<ProgramPlayPreList, a> implements w {
        private static final ProgramPlayPreList DEFAULT_INSTANCE = new ProgramPlayPreList();
        public static final int PAGESTR_FIELD_NUMBER = 3;
        public static final int PAGE_FIELD_NUMBER = 1;
        private static volatile Parser<ProgramPlayPreList> PARSER = null;
        public static final int PROGRAMLIST_FIELD_NUMBER = 2;
        private int page_;
        private Internal.ProtobufList<ProgramPlayInfo> programList_ = emptyProtobufList();
        private String pageStr_ = "";

        private ProgramPlayPreList() {
        }

        public int getPage() {
            return this.page_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPage(int i) {
            this.page_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPage() {
            this.page_ = 0;
        }

        public List<ProgramPlayInfo> getProgramListList() {
            return this.programList_;
        }

        public List<? extends s> getProgramListOrBuilderList() {
            return this.programList_;
        }

        public int getProgramListCount() {
            return this.programList_.size();
        }

        public ProgramPlayInfo getProgramList(int i) {
            return this.programList_.get(i);
        }

        public s getProgramListOrBuilder(int i) {
            return this.programList_.get(i);
        }

        private void ensureProgramListIsMutable() {
            if (this.programList_.isModifiable()) {
                return;
            }
            this.programList_ = GeneratedMessageLite.mutableCopy(this.programList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramList(int i, ProgramPlayInfo programPlayInfo) {
            if (programPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.set(i, programPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramList(int i, ProgramPlayInfo.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(ProgramPlayInfo programPlayInfo) {
            if (programPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.add(programPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(int i, ProgramPlayInfo programPlayInfo) {
            if (programPlayInfo == null) {
                throw new NullPointerException();
            }
            ensureProgramListIsMutable();
            this.programList_.add(i, programPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(ProgramPlayInfo.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramList(int i, ProgramPlayInfo.a aVar) {
            ensureProgramListIsMutable();
            this.programList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllProgramList(Iterable<? extends ProgramPlayInfo> iterable) {
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

        public String getPageStr() {
            return this.pageStr_;
        }

        public ByteString getPageStrBytes() {
            return ByteString.copyFromUtf8(this.pageStr_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageStr(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.pageStr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPageStr() {
            this.pageStr_ = getDefaultInstance().getPageStr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageStrBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.pageStr_ = byteString.toStringUtf8();
        }

        public static ProgramPlayPreList parseFrom(ByteBuffer byteBuffer) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ProgramPlayPreList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ProgramPlayPreList parseFrom(ByteString byteString) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ProgramPlayPreList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ProgramPlayPreList parseFrom(byte[] bArr) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ProgramPlayPreList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ProgramPlayPreList parseFrom(InputStream inputStream) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayPreList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayPreList parseDelimitedFrom(InputStream inputStream) {
            return (ProgramPlayPreList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ProgramPlayPreList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayPreList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ProgramPlayPreList parseFrom(CodedInputStream codedInputStream) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ProgramPlayPreList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProgramPlayPreList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ProgramPlayPreList programPlayPreList) {
            return DEFAULT_INSTANCE.createBuilder(programPlayPreList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ProgramPlayPreList, a> implements w {
            private a() {
                super(ProgramPlayPreList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((ProgramPlayPreList) this.instance).setPage(i);
                return this;
            }

            public a a(ProgramPlayInfo programPlayInfo) {
                copyOnWrite();
                ((ProgramPlayPreList) this.instance).addProgramList(programPlayInfo);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((ProgramPlayPreList) this.instance).setPageStr(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProgramPlayPreList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003Ȉ", new Object[]{"page_", "programList_", ProgramPlayInfo.class, "pageStr_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProgramPlayPreList> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProgramPlayPreList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ProgramPlayPreList.class, DEFAULT_INSTANCE);
        }

        public static ProgramPlayPreList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProgramPlayPreList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BtConnectStatus extends GeneratedMessageLite<BtConnectStatus, a> implements a {
        private static final BtConnectStatus DEFAULT_INSTANCE = new BtConnectStatus();
        private static volatile Parser<BtConnectStatus> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int status_;

        private BtConnectStatus() {
        }

        public int getStatus() {
            return this.status_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(int i) {
            this.status_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static BtConnectStatus parseFrom(ByteBuffer byteBuffer) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BtConnectStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BtConnectStatus parseFrom(ByteString byteString) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BtConnectStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BtConnectStatus parseFrom(byte[] bArr) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BtConnectStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BtConnectStatus parseFrom(InputStream inputStream) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BtConnectStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BtConnectStatus parseDelimitedFrom(InputStream inputStream) {
            return (BtConnectStatus) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BtConnectStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BtConnectStatus) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BtConnectStatus parseFrom(CodedInputStream codedInputStream) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BtConnectStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BtConnectStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(BtConnectStatus btConnectStatus) {
            return DEFAULT_INSTANCE.createBuilder(btConnectStatus);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<BtConnectStatus, a> implements a {
            private a() {
                super(BtConnectStatus.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((BtConnectStatus) this.instance).setStatus(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BtConnectStatus();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"status_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BtConnectStatus> parser = PARSER;
                    if (parser == null) {
                        synchronized (BtConnectStatus.class) {
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
            GeneratedMessageLite.registerDefaultInstance(BtConnectStatus.class, DEFAULT_INSTANCE);
        }

        public static BtConnectStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BtConnectStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class NetRadioPlayInfo extends GeneratedMessageLite<NetRadioPlayInfo, a> implements m {
        public static final int DAYOFWEEK_FIELD_NUMBER = 6;
        private static final NetRadioPlayInfo DEFAULT_INSTANCE = new NetRadioPlayInfo();
        public static final int ENDTIME_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<NetRadioPlayInfo> PARSER = null;
        public static final int STARTTIME_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 5;
        private int id_;
        private int type_;
        private String name_ = "";
        private String startTime_ = "";
        private String endTime_ = "";
        private String dayOfWeek_ = "";

        private NetRadioPlayInfo() {
        }

        public int getId() {
            return this.id_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i) {
            this.id_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0;
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

        public String getStartTime() {
            return this.startTime_;
        }

        public ByteString getStartTimeBytes() {
            return ByteString.copyFromUtf8(this.startTime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.startTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.startTime_ = getDefaultInstance().getStartTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.startTime_ = byteString.toStringUtf8();
        }

        public String getEndTime() {
            return this.endTime_;
        }

        public ByteString getEndTimeBytes() {
            return ByteString.copyFromUtf8(this.endTime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.endTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.endTime_ = getDefaultInstance().getEndTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTimeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.endTime_ = byteString.toStringUtf8();
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

        public String getDayOfWeek() {
            return this.dayOfWeek_;
        }

        public ByteString getDayOfWeekBytes() {
            return ByteString.copyFromUtf8(this.dayOfWeek_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDayOfWeek(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.dayOfWeek_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDayOfWeek() {
            this.dayOfWeek_ = getDefaultInstance().getDayOfWeek();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDayOfWeekBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.dayOfWeek_ = byteString.toStringUtf8();
        }

        public static NetRadioPlayInfo parseFrom(ByteBuffer byteBuffer) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NetRadioPlayInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetRadioPlayInfo parseFrom(ByteString byteString) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetRadioPlayInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetRadioPlayInfo parseFrom(byte[] bArr) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetRadioPlayInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetRadioPlayInfo parseFrom(InputStream inputStream) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioPlayInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioPlayInfo parseDelimitedFrom(InputStream inputStream) {
            return (NetRadioPlayInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioPlayInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioPlayInfo parseFrom(CodedInputStream codedInputStream) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetRadioPlayInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(NetRadioPlayInfo netRadioPlayInfo) {
            return DEFAULT_INSTANCE.createBuilder(netRadioPlayInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<NetRadioPlayInfo, a> implements m {
            private a() {
                super(NetRadioPlayInfo.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((NetRadioPlayInfo) this.instance).setId(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((NetRadioPlayInfo) this.instance).setName(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((NetRadioPlayInfo) this.instance).setStartTime(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((NetRadioPlayInfo) this.instance).setEndTime(str);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((NetRadioPlayInfo) this.instance).setType(i);
                return this;
            }

            public a d(String str) {
                copyOnWrite();
                ((NetRadioPlayInfo) this.instance).setDayOfWeek(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new NetRadioPlayInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006Ȉ", new Object[]{"id_", "name_", "startTime_", "endTime_", "type_", "dayOfWeek_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NetRadioPlayInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (NetRadioPlayInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(NetRadioPlayInfo.class, DEFAULT_INSTANCE);
        }

        public static NetRadioPlayInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NetRadioPlayInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class NetRadioPlayList extends GeneratedMessageLite<NetRadioPlayList, a> implements n {
        private static final NetRadioPlayList DEFAULT_INSTANCE = new NetRadioPlayList();
        private static volatile Parser<NetRadioPlayList> PARSER = null;
        public static final int PLAYLIST_FIELD_NUMBER = 1;
        private Internal.ProtobufList<NetRadioPlayInfo> playList_ = emptyProtobufList();

        private NetRadioPlayList() {
        }

        public List<NetRadioPlayInfo> getPlayListList() {
            return this.playList_;
        }

        public List<? extends m> getPlayListOrBuilderList() {
            return this.playList_;
        }

        public int getPlayListCount() {
            return this.playList_.size();
        }

        public NetRadioPlayInfo getPlayList(int i) {
            return this.playList_.get(i);
        }

        public m getPlayListOrBuilder(int i) {
            return this.playList_.get(i);
        }

        private void ensurePlayListIsMutable() {
            if (this.playList_.isModifiable()) {
                return;
            }
            this.playList_ = GeneratedMessageLite.mutableCopy(this.playList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayList(int i, NetRadioPlayInfo netRadioPlayInfo) {
            if (netRadioPlayInfo == null) {
                throw new NullPointerException();
            }
            ensurePlayListIsMutable();
            this.playList_.set(i, netRadioPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayList(int i, NetRadioPlayInfo.a aVar) {
            ensurePlayListIsMutable();
            this.playList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayList(NetRadioPlayInfo netRadioPlayInfo) {
            if (netRadioPlayInfo == null) {
                throw new NullPointerException();
            }
            ensurePlayListIsMutable();
            this.playList_.add(netRadioPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayList(int i, NetRadioPlayInfo netRadioPlayInfo) {
            if (netRadioPlayInfo == null) {
                throw new NullPointerException();
            }
            ensurePlayListIsMutable();
            this.playList_.add(i, netRadioPlayInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayList(NetRadioPlayInfo.a aVar) {
            ensurePlayListIsMutable();
            this.playList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPlayList(int i, NetRadioPlayInfo.a aVar) {
            ensurePlayListIsMutable();
            this.playList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPlayList(Iterable<? extends NetRadioPlayInfo> iterable) {
            ensurePlayListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.playList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayList() {
            this.playList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePlayList(int i) {
            ensurePlayListIsMutable();
            this.playList_.remove(i);
        }

        public static NetRadioPlayList parseFrom(ByteBuffer byteBuffer) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NetRadioPlayList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetRadioPlayList parseFrom(ByteString byteString) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetRadioPlayList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetRadioPlayList parseFrom(byte[] bArr) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetRadioPlayList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetRadioPlayList parseFrom(InputStream inputStream) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioPlayList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioPlayList parseDelimitedFrom(InputStream inputStream) {
            return (NetRadioPlayList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioPlayList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioPlayList parseFrom(CodedInputStream codedInputStream) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetRadioPlayList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(NetRadioPlayList netRadioPlayList) {
            return DEFAULT_INSTANCE.createBuilder(netRadioPlayList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<NetRadioPlayList, a> implements n {
            private a() {
                super(NetRadioPlayList.DEFAULT_INSTANCE);
            }

            public a a(NetRadioPlayInfo netRadioPlayInfo) {
                copyOnWrite();
                ((NetRadioPlayList) this.instance).addPlayList(netRadioPlayInfo);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new NetRadioPlayList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"playList_", NetRadioPlayInfo.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NetRadioPlayList> parser = PARSER;
                    if (parser == null) {
                        synchronized (NetRadioPlayList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(NetRadioPlayList.class, DEFAULT_INSTANCE);
        }

        public static NetRadioPlayList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NetRadioPlayList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class NetRadioPlayStatus extends GeneratedMessageLite<NetRadioPlayStatus, a> implements p {
        private static final NetRadioPlayStatus DEFAULT_INSTANCE = new NetRadioPlayStatus();
        private static volatile Parser<NetRadioPlayStatus> PARSER = null;
        public static final int POS_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int pos_;
        private int status_;

        private NetRadioPlayStatus() {
        }

        public int getPos() {
            return this.pos_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPos(int i) {
            this.pos_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPos() {
            this.pos_ = 0;
        }

        public int getStatus() {
            return this.status_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(int i) {
            this.status_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static NetRadioPlayStatus parseFrom(ByteBuffer byteBuffer) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NetRadioPlayStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetRadioPlayStatus parseFrom(ByteString byteString) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetRadioPlayStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetRadioPlayStatus parseFrom(byte[] bArr) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetRadioPlayStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetRadioPlayStatus parseFrom(InputStream inputStream) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioPlayStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioPlayStatus parseDelimitedFrom(InputStream inputStream) {
            return (NetRadioPlayStatus) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioPlayStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayStatus) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioPlayStatus parseFrom(CodedInputStream codedInputStream) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetRadioPlayStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioPlayStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(NetRadioPlayStatus netRadioPlayStatus) {
            return DEFAULT_INSTANCE.createBuilder(netRadioPlayStatus);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<NetRadioPlayStatus, a> implements p {
            private a() {
                super(NetRadioPlayStatus.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((NetRadioPlayStatus) this.instance).setPos(i);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((NetRadioPlayStatus) this.instance).setStatus(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new NetRadioPlayStatus();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"pos_", "status_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NetRadioPlayStatus> parser = PARSER;
                    if (parser == null) {
                        synchronized (NetRadioPlayStatus.class) {
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
            GeneratedMessageLite.registerDefaultInstance(NetRadioPlayStatus.class, DEFAULT_INSTANCE);
        }

        public static NetRadioPlayStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NetRadioPlayStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
