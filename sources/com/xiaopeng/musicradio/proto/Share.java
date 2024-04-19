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
public final class Share {

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
    public static final class ShareMusicInfo extends GeneratedMessageLite<ShareMusicInfo, a> implements b {
        public static final int ALBUMID_FIELD_NUMBER = 2;
        public static final int CONTENT_FIELD_NUMBER = 5;
        private static final ShareMusicInfo DEFAULT_INSTANCE = new ShareMusicInfo();
        public static final int HASH_FIELD_NUMBER = 1;
        private static volatile Parser<ShareMusicInfo> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 3;
        public static final int VEHICLETYPE_FIELD_NUMBER = 4;
        private long albumId_;
        private int source_;
        private String hash_ = "";
        private String vehicleType_ = "";
        private String content_ = "";

        private ShareMusicInfo() {
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

        public int getSource() {
            return this.source_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSource(int i) {
            this.source_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSource() {
            this.source_ = 0;
        }

        public String getVehicleType() {
            return this.vehicleType_;
        }

        public ByteString getVehicleTypeBytes() {
            return ByteString.copyFromUtf8(this.vehicleType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVehicleType(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.vehicleType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVehicleType() {
            this.vehicleType_ = getDefaultInstance().getVehicleType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVehicleTypeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.vehicleType_ = byteString.toStringUtf8();
        }

        public String getContent() {
            return this.content_;
        }

        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        public static ShareMusicInfo parseFrom(ByteBuffer byteBuffer) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ShareMusicInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ShareMusicInfo parseFrom(ByteString byteString) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ShareMusicInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ShareMusicInfo parseFrom(byte[] bArr) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ShareMusicInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ShareMusicInfo parseFrom(InputStream inputStream) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShareMusicInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShareMusicInfo parseDelimitedFrom(InputStream inputStream) {
            return (ShareMusicInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShareMusicInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMusicInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShareMusicInfo parseFrom(CodedInputStream codedInputStream) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ShareMusicInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareMusicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ShareMusicInfo shareMusicInfo) {
            return DEFAULT_INSTANCE.createBuilder(shareMusicInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ShareMusicInfo, a> implements b {
            private a() {
                super(ShareMusicInfo.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ShareMusicInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004\u0004Ȉ\u0005Ȉ", new Object[]{"hash_", "albumId_", "source_", "vehicleType_", "content_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ShareMusicInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (ShareMusicInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ShareMusicInfo.class, DEFAULT_INSTANCE);
        }

        public static ShareMusicInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ShareMusicInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ShareProgramInfo extends GeneratedMessageLite<ShareProgramInfo, a> implements c {
        public static final int ALBUMID_FIELD_NUMBER = 1;
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final ShareProgramInfo DEFAULT_INSTANCE = new ShareProgramInfo();
        private static volatile Parser<ShareProgramInfo> PARSER = null;
        public static final int VEHICLETYPE_FIELD_NUMBER = 2;
        private long albumId_;
        private String vehicleType_ = "";
        private String content_ = "";

        private ShareProgramInfo() {
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

        public String getVehicleType() {
            return this.vehicleType_;
        }

        public ByteString getVehicleTypeBytes() {
            return ByteString.copyFromUtf8(this.vehicleType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVehicleType(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.vehicleType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVehicleType() {
            this.vehicleType_ = getDefaultInstance().getVehicleType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVehicleTypeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.vehicleType_ = byteString.toStringUtf8();
        }

        public String getContent() {
            return this.content_;
        }

        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        public static ShareProgramInfo parseFrom(ByteBuffer byteBuffer) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ShareProgramInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ShareProgramInfo parseFrom(ByteString byteString) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ShareProgramInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ShareProgramInfo parseFrom(byte[] bArr) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ShareProgramInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ShareProgramInfo parseFrom(InputStream inputStream) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShareProgramInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShareProgramInfo parseDelimitedFrom(InputStream inputStream) {
            return (ShareProgramInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShareProgramInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareProgramInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShareProgramInfo parseFrom(CodedInputStream codedInputStream) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ShareProgramInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ShareProgramInfo shareProgramInfo) {
            return DEFAULT_INSTANCE.createBuilder(shareProgramInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ShareProgramInfo, a> implements c {
            private a() {
                super(ShareProgramInfo.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ShareProgramInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ", new Object[]{"albumId_", "vehicleType_", "content_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ShareProgramInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (ShareProgramInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ShareProgramInfo.class, DEFAULT_INSTANCE);
        }

        public static ShareProgramInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ShareProgramInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SingleContent extends GeneratedMessageLite<SingleContent, a> implements d {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final SingleContent DEFAULT_INSTANCE = new SingleContent();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<SingleContent> PARSER;
        private String content_ = "";
        private int errorCode_;

        private SingleContent() {
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

        public String getContent() {
            return this.content_;
        }

        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.content_ = byteString.toStringUtf8();
        }

        public static SingleContent parseFrom(ByteBuffer byteBuffer) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static SingleContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SingleContent parseFrom(ByteString byteString) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SingleContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SingleContent parseFrom(byte[] bArr) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SingleContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SingleContent parseFrom(InputStream inputStream) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SingleContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SingleContent parseDelimitedFrom(InputStream inputStream) {
            return (SingleContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SingleContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingleContent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SingleContent parseFrom(CodedInputStream codedInputStream) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SingleContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SingleContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(SingleContent singleContent) {
            return DEFAULT_INSTANCE.createBuilder(singleContent);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<SingleContent, a> implements d {
            private a() {
                super(SingleContent.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((SingleContent) this.instance).setErrorCode(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((SingleContent) this.instance).setContent(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new SingleContent();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"errorCode_", "content_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<SingleContent> parser = PARSER;
                    if (parser == null) {
                        synchronized (SingleContent.class) {
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
            GeneratedMessageLite.registerDefaultInstance(SingleContent.class, DEFAULT_INSTANCE);
        }

        public static SingleContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SingleContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ShareContents extends GeneratedMessageLite<ShareContents, a> implements a {
        private static final ShareContents DEFAULT_INSTANCE = new ShareContents();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        public static final int MUSICCONTENTS_FIELD_NUMBER = 2;
        private static volatile Parser<ShareContents> PARSER = null;
        public static final int PROGRAMCONTENTS_FIELD_NUMBER = 3;
        private int errorCode_;
        private Internal.ProtobufList<SingleContent> musicContents_ = emptyProtobufList();
        private Internal.ProtobufList<SingleContent> programContents_ = emptyProtobufList();

        private ShareContents() {
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

        public List<SingleContent> getMusicContentsList() {
            return this.musicContents_;
        }

        public List<? extends d> getMusicContentsOrBuilderList() {
            return this.musicContents_;
        }

        public int getMusicContentsCount() {
            return this.musicContents_.size();
        }

        public SingleContent getMusicContents(int i) {
            return this.musicContents_.get(i);
        }

        public d getMusicContentsOrBuilder(int i) {
            return this.musicContents_.get(i);
        }

        private void ensureMusicContentsIsMutable() {
            if (this.musicContents_.isModifiable()) {
                return;
            }
            this.musicContents_ = GeneratedMessageLite.mutableCopy(this.musicContents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicContents(int i, SingleContent singleContent) {
            if (singleContent == null) {
                throw new NullPointerException();
            }
            ensureMusicContentsIsMutable();
            this.musicContents_.set(i, singleContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicContents(int i, SingleContent.a aVar) {
            ensureMusicContentsIsMutable();
            this.musicContents_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicContents(SingleContent singleContent) {
            if (singleContent == null) {
                throw new NullPointerException();
            }
            ensureMusicContentsIsMutable();
            this.musicContents_.add(singleContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicContents(int i, SingleContent singleContent) {
            if (singleContent == null) {
                throw new NullPointerException();
            }
            ensureMusicContentsIsMutable();
            this.musicContents_.add(i, singleContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicContents(SingleContent.a aVar) {
            ensureMusicContentsIsMutable();
            this.musicContents_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMusicContents(int i, SingleContent.a aVar) {
            ensureMusicContentsIsMutable();
            this.musicContents_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMusicContents(Iterable<? extends SingleContent> iterable) {
            ensureMusicContentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.musicContents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicContents() {
            this.musicContents_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMusicContents(int i) {
            ensureMusicContentsIsMutable();
            this.musicContents_.remove(i);
        }

        public List<SingleContent> getProgramContentsList() {
            return this.programContents_;
        }

        public List<? extends d> getProgramContentsOrBuilderList() {
            return this.programContents_;
        }

        public int getProgramContentsCount() {
            return this.programContents_.size();
        }

        public SingleContent getProgramContents(int i) {
            return this.programContents_.get(i);
        }

        public d getProgramContentsOrBuilder(int i) {
            return this.programContents_.get(i);
        }

        private void ensureProgramContentsIsMutable() {
            if (this.programContents_.isModifiable()) {
                return;
            }
            this.programContents_ = GeneratedMessageLite.mutableCopy(this.programContents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramContents(int i, SingleContent singleContent) {
            if (singleContent == null) {
                throw new NullPointerException();
            }
            ensureProgramContentsIsMutable();
            this.programContents_.set(i, singleContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgramContents(int i, SingleContent.a aVar) {
            ensureProgramContentsIsMutable();
            this.programContents_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramContents(SingleContent singleContent) {
            if (singleContent == null) {
                throw new NullPointerException();
            }
            ensureProgramContentsIsMutable();
            this.programContents_.add(singleContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramContents(int i, SingleContent singleContent) {
            if (singleContent == null) {
                throw new NullPointerException();
            }
            ensureProgramContentsIsMutable();
            this.programContents_.add(i, singleContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramContents(SingleContent.a aVar) {
            ensureProgramContentsIsMutable();
            this.programContents_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addProgramContents(int i, SingleContent.a aVar) {
            ensureProgramContentsIsMutable();
            this.programContents_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllProgramContents(Iterable<? extends SingleContent> iterable) {
            ensureProgramContentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.programContents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProgramContents() {
            this.programContents_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeProgramContents(int i) {
            ensureProgramContentsIsMutable();
            this.programContents_.remove(i);
        }

        public static ShareContents parseFrom(ByteBuffer byteBuffer) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ShareContents parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ShareContents parseFrom(ByteString byteString) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ShareContents parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ShareContents parseFrom(byte[] bArr) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ShareContents parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ShareContents parseFrom(InputStream inputStream) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShareContents parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShareContents parseDelimitedFrom(InputStream inputStream) {
            return (ShareContents) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShareContents parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareContents) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ShareContents parseFrom(CodedInputStream codedInputStream) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ShareContents parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareContents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(ShareContents shareContents) {
            return DEFAULT_INSTANCE.createBuilder(shareContents);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<ShareContents, a> implements a {
            private a() {
                super(ShareContents.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new ShareContents();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new Object[]{"errorCode_", "musicContents_", SingleContent.class, "programContents_", SingleContent.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ShareContents> parser = PARSER;
                    if (parser == null) {
                        synchronized (ShareContents.class) {
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
            GeneratedMessageLite.registerDefaultInstance(ShareContents.class, DEFAULT_INSTANCE);
        }

        public static ShareContents getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ShareContents> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
