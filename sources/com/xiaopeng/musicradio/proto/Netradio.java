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
public final class Netradio {

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
    public static final class NetRadioInfo extends GeneratedMessageLite<NetRadioInfo, a> implements a {
        public static final int AREACODE_FIELD_NUMBER = 6;
        private static final NetRadioInfo DEFAULT_INSTANCE = new NetRadioInfo();
        public static final int HZ_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<NetRadioInfo> PARSER = null;
        public static final int PICURL_FIELD_NUMBER = 3;
        public static final int PLAYCOUNT_FIELD_NUMBER = 7;
        public static final int PLAYINGINFO_FIELD_NUMBER = 9;
        public static final int PLAYURL_FIELD_NUMBER = 8;
        public static final int UPDATETIME_FIELD_NUMBER = 4;
        private int id_;
        private int playCount_;
        private NetRadioProgramInfo playingInfo_;
        private long updateTime_;
        private String name_ = "";
        private String picUrl_ = "";
        private String hz_ = "";
        private String areaCode_ = "";
        private String playUrl_ = "";

        private NetRadioInfo() {
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

        public String getPicUrl() {
            return this.picUrl_;
        }

        public ByteString getPicUrlBytes() {
            return ByteString.copyFromUtf8(this.picUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicUrl(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.picUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPicUrl() {
            this.picUrl_ = getDefaultInstance().getPicUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPicUrlBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.picUrl_ = byteString.toStringUtf8();
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

        public String getHz() {
            return this.hz_;
        }

        public ByteString getHzBytes() {
            return ByteString.copyFromUtf8(this.hz_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHz(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.hz_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHz() {
            this.hz_ = getDefaultInstance().getHz();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHzBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.hz_ = byteString.toStringUtf8();
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

        public int getPlayCount() {
            return this.playCount_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayCount(int i) {
            this.playCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayCount() {
            this.playCount_ = 0;
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

        public boolean hasPlayingInfo() {
            return this.playingInfo_ != null;
        }

        public NetRadioProgramInfo getPlayingInfo() {
            NetRadioProgramInfo netRadioProgramInfo = this.playingInfo_;
            return netRadioProgramInfo == null ? NetRadioProgramInfo.getDefaultInstance() : netRadioProgramInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayingInfo(NetRadioProgramInfo netRadioProgramInfo) {
            if (netRadioProgramInfo == null) {
                throw new NullPointerException();
            }
            this.playingInfo_ = netRadioProgramInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayingInfo(NetRadioProgramInfo.a aVar) {
            this.playingInfo_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePlayingInfo(NetRadioProgramInfo netRadioProgramInfo) {
            if (netRadioProgramInfo == null) {
                throw new NullPointerException();
            }
            NetRadioProgramInfo netRadioProgramInfo2 = this.playingInfo_;
            if (netRadioProgramInfo2 != null && netRadioProgramInfo2 != NetRadioProgramInfo.getDefaultInstance()) {
                this.playingInfo_ = NetRadioProgramInfo.newBuilder(this.playingInfo_).mergeFrom((NetRadioProgramInfo.a) netRadioProgramInfo).buildPartial();
            } else {
                this.playingInfo_ = netRadioProgramInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayingInfo() {
            this.playingInfo_ = null;
        }

        public static NetRadioInfo parseFrom(ByteBuffer byteBuffer) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NetRadioInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetRadioInfo parseFrom(ByteString byteString) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetRadioInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetRadioInfo parseFrom(byte[] bArr) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetRadioInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetRadioInfo parseFrom(InputStream inputStream) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioInfo parseDelimitedFrom(InputStream inputStream) {
            return (NetRadioInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioInfo parseFrom(CodedInputStream codedInputStream) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetRadioInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(NetRadioInfo netRadioInfo) {
            return DEFAULT_INSTANCE.createBuilder(netRadioInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<NetRadioInfo, a> implements a {
            private a() {
                super(NetRadioInfo.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setId(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setName(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setPicUrl(str);
                return this;
            }

            public a a(long j) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setUpdateTime(j);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setHz(str);
                return this;
            }

            public a d(String str) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setAreaCode(str);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setPlayCount(i);
                return this;
            }

            public a e(String str) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setPlayUrl(str);
                return this;
            }

            public a a(NetRadioProgramInfo netRadioProgramInfo) {
                copyOnWrite();
                ((NetRadioInfo) this.instance).setPlayingInfo(netRadioProgramInfo);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new NetRadioInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0004\bȈ\t\t", new Object[]{"id_", "name_", "picUrl_", "updateTime_", "hz_", "areaCode_", "playCount_", "playUrl_", "playingInfo_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NetRadioInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (NetRadioInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(NetRadioInfo.class, DEFAULT_INSTANCE);
        }

        public static NetRadioInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NetRadioInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class NetRadioProgramInfo extends GeneratedMessageLite<NetRadioProgramInfo, a> implements b {
        private static final NetRadioProgramInfo DEFAULT_INSTANCE = new NetRadioProgramInfo();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<NetRadioProgramInfo> PARSER = null;
        public static final int PLAYURL_FIELD_NUMBER = 3;
        private int id_;
        private String name_ = "";
        private String playUrl_ = "";

        private NetRadioProgramInfo() {
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

        public static NetRadioProgramInfo parseFrom(ByteBuffer byteBuffer) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NetRadioProgramInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetRadioProgramInfo parseFrom(ByteString byteString) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetRadioProgramInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetRadioProgramInfo parseFrom(byte[] bArr) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetRadioProgramInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetRadioProgramInfo parseFrom(InputStream inputStream) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioProgramInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioProgramInfo parseDelimitedFrom(InputStream inputStream) {
            return (NetRadioProgramInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioProgramInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioProgramInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioProgramInfo parseFrom(CodedInputStream codedInputStream) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetRadioProgramInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioProgramInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(NetRadioProgramInfo netRadioProgramInfo) {
            return DEFAULT_INSTANCE.createBuilder(netRadioProgramInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<NetRadioProgramInfo, a> implements b {
            private a() {
                super(NetRadioProgramInfo.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((NetRadioProgramInfo) this.instance).setId(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((NetRadioProgramInfo) this.instance).setName(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((NetRadioProgramInfo) this.instance).setPlayUrl(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new NetRadioProgramInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ", new Object[]{"id_", "name_", "playUrl_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NetRadioProgramInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (NetRadioProgramInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(NetRadioProgramInfo.class, DEFAULT_INSTANCE);
        }

        public static NetRadioProgramInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NetRadioProgramInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class NetRadioTagInfo extends GeneratedMessageLite<NetRadioTagInfo, a> implements c {
        public static final int BIZVAL_FIELD_NUMBER = 2;
        public static final int COVER_FIELD_NUMBER = 3;
        private static final NetRadioTagInfo DEFAULT_INSTANCE = new NetRadioTagInfo();
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NIGHTCOVER_FIELD_NUMBER = 4;
        private static volatile Parser<NetRadioTagInfo> PARSER;
        private int bizVal_;
        private String name_ = "";
        private String cover_ = "";
        private String nightCover_ = "";

        private NetRadioTagInfo() {
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

        public int getBizVal() {
            return this.bizVal_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBizVal(int i) {
            this.bizVal_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBizVal() {
            this.bizVal_ = 0;
        }

        public String getCover() {
            return this.cover_;
        }

        public ByteString getCoverBytes() {
            return ByteString.copyFromUtf8(this.cover_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCover(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.cover_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCover() {
            this.cover_ = getDefaultInstance().getCover();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.cover_ = byteString.toStringUtf8();
        }

        public String getNightCover() {
            return this.nightCover_;
        }

        public ByteString getNightCoverBytes() {
            return ByteString.copyFromUtf8(this.nightCover_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNightCover(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.nightCover_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNightCover() {
            this.nightCover_ = getDefaultInstance().getNightCover();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNightCoverBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.nightCover_ = byteString.toStringUtf8();
        }

        public static NetRadioTagInfo parseFrom(ByteBuffer byteBuffer) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static NetRadioTagInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NetRadioTagInfo parseFrom(ByteString byteString) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NetRadioTagInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NetRadioTagInfo parseFrom(byte[] bArr) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NetRadioTagInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NetRadioTagInfo parseFrom(InputStream inputStream) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioTagInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioTagInfo parseDelimitedFrom(InputStream inputStream) {
            return (NetRadioTagInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NetRadioTagInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioTagInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NetRadioTagInfo parseFrom(CodedInputStream codedInputStream) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NetRadioTagInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NetRadioTagInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(NetRadioTagInfo netRadioTagInfo) {
            return DEFAULT_INSTANCE.createBuilder(netRadioTagInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<NetRadioTagInfo, a> implements c {
            private a() {
                super(NetRadioTagInfo.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((NetRadioTagInfo) this.instance).setName(str);
                return this;
            }

            public a a(int i) {
                copyOnWrite();
                ((NetRadioTagInfo) this.instance).setBizVal(i);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((NetRadioTagInfo) this.instance).setCover(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((NetRadioTagInfo) this.instance).setNightCover(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new NetRadioTagInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "bizVal_", "cover_", "nightCover_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NetRadioTagInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (NetRadioTagInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(NetRadioTagInfo.class, DEFAULT_INSTANCE);
        }

        public static NetRadioTagInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NetRadioTagInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlayIndex extends GeneratedMessageLite<PlayIndex, a> implements d {
        private static final PlayIndex DEFAULT_INSTANCE = new PlayIndex();
        public static final int INDEX_FIELD_NUMBER = 1;
        private static volatile Parser<PlayIndex> PARSER;
        private int index_;

        private PlayIndex() {
        }

        public int getIndex() {
            return this.index_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        public static PlayIndex parseFrom(ByteBuffer byteBuffer) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PlayIndex parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PlayIndex parseFrom(ByteString byteString) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PlayIndex parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PlayIndex parseFrom(byte[] bArr) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlayIndex parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PlayIndex parseFrom(InputStream inputStream) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayIndex parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlayIndex parseDelimitedFrom(InputStream inputStream) {
            return (PlayIndex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayIndex parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayIndex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlayIndex parseFrom(CodedInputStream codedInputStream) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PlayIndex parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlayIndex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(PlayIndex playIndex) {
            return DEFAULT_INSTANCE.createBuilder(playIndex);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<PlayIndex, a> implements d {
            private a() {
                super(PlayIndex.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new PlayIndex();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"index_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PlayIndex> parser = PARSER;
                    if (parser == null) {
                        synchronized (PlayIndex.class) {
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
            GeneratedMessageLite.registerDefaultInstance(PlayIndex.class, DEFAULT_INSTANCE);
        }

        public static PlayIndex getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PlayIndex> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RadioInfoList extends GeneratedMessageLite<RadioInfoList, a> implements e {
        private static final RadioInfoList DEFAULT_INSTANCE = new RadioInfoList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        public static final int LOCALPOS_FIELD_NUMBER = 3;
        private static volatile Parser<RadioInfoList> PARSER = null;
        public static final int RADIOLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private int localPos_;
        private Internal.ProtobufList<NetRadioInfo> radioList_ = emptyProtobufList();

        private RadioInfoList() {
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

        public List<NetRadioInfo> getRadioListList() {
            return this.radioList_;
        }

        public List<? extends a> getRadioListOrBuilderList() {
            return this.radioList_;
        }

        public int getRadioListCount() {
            return this.radioList_.size();
        }

        public NetRadioInfo getRadioList(int i) {
            return this.radioList_.get(i);
        }

        public a getRadioListOrBuilder(int i) {
            return this.radioList_.get(i);
        }

        private void ensureRadioListIsMutable() {
            if (this.radioList_.isModifiable()) {
                return;
            }
            this.radioList_ = GeneratedMessageLite.mutableCopy(this.radioList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRadioList(int i, NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioListIsMutable();
            this.radioList_.set(i, netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRadioList(int i, NetRadioInfo.a aVar) {
            ensureRadioListIsMutable();
            this.radioList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioList(NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioListIsMutable();
            this.radioList_.add(netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioList(int i, NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioListIsMutable();
            this.radioList_.add(i, netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioList(NetRadioInfo.a aVar) {
            ensureRadioListIsMutable();
            this.radioList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioList(int i, NetRadioInfo.a aVar) {
            ensureRadioListIsMutable();
            this.radioList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRadioList(Iterable<? extends NetRadioInfo> iterable) {
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

        public int getLocalPos() {
            return this.localPos_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalPos(int i) {
            this.localPos_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalPos() {
            this.localPos_ = 0;
        }

        public static RadioInfoList parseFrom(ByteBuffer byteBuffer) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RadioInfoList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RadioInfoList parseFrom(ByteString byteString) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RadioInfoList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RadioInfoList parseFrom(byte[] bArr) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RadioInfoList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RadioInfoList parseFrom(InputStream inputStream) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RadioInfoList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RadioInfoList parseDelimitedFrom(InputStream inputStream) {
            return (RadioInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RadioInfoList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RadioInfoList parseFrom(CodedInputStream codedInputStream) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RadioInfoList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RadioInfoList radioInfoList) {
            return DEFAULT_INSTANCE.createBuilder(radioInfoList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RadioInfoList, a> implements e {
            private a() {
                super(RadioInfoList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((RadioInfoList) this.instance).setErrorCode(i);
                return this;
            }

            public int a() {
                return ((RadioInfoList) this.instance).getRadioListCount();
            }

            public a a(NetRadioInfo netRadioInfo) {
                copyOnWrite();
                ((RadioInfoList) this.instance).addRadioList(netRadioInfo);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((RadioInfoList) this.instance).setLocalPos(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RadioInfoList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003\u0004", new Object[]{"errorCode_", "radioList_", NetRadioInfo.class, "localPos_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RadioInfoList> parser = PARSER;
                    if (parser == null) {
                        synchronized (RadioInfoList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(RadioInfoList.class, DEFAULT_INSTANCE);
        }

        public static RadioInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RadioInfoList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RadioTagList extends GeneratedMessageLite<RadioTagList, a> implements f {
        private static final RadioTagList DEFAULT_INSTANCE = new RadioTagList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<RadioTagList> PARSER = null;
        public static final int RADIOTAGLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<NetRadioTagInfo> radioTagList_ = emptyProtobufList();

        private RadioTagList() {
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

        public List<NetRadioTagInfo> getRadioTagListList() {
            return this.radioTagList_;
        }

        public List<? extends c> getRadioTagListOrBuilderList() {
            return this.radioTagList_;
        }

        public int getRadioTagListCount() {
            return this.radioTagList_.size();
        }

        public NetRadioTagInfo getRadioTagList(int i) {
            return this.radioTagList_.get(i);
        }

        public c getRadioTagListOrBuilder(int i) {
            return this.radioTagList_.get(i);
        }

        private void ensureRadioTagListIsMutable() {
            if (this.radioTagList_.isModifiable()) {
                return;
            }
            this.radioTagList_ = GeneratedMessageLite.mutableCopy(this.radioTagList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRadioTagList(int i, NetRadioTagInfo netRadioTagInfo) {
            if (netRadioTagInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioTagListIsMutable();
            this.radioTagList_.set(i, netRadioTagInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRadioTagList(int i, NetRadioTagInfo.a aVar) {
            ensureRadioTagListIsMutable();
            this.radioTagList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioTagList(NetRadioTagInfo netRadioTagInfo) {
            if (netRadioTagInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioTagListIsMutable();
            this.radioTagList_.add(netRadioTagInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioTagList(int i, NetRadioTagInfo netRadioTagInfo) {
            if (netRadioTagInfo == null) {
                throw new NullPointerException();
            }
            ensureRadioTagListIsMutable();
            this.radioTagList_.add(i, netRadioTagInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioTagList(NetRadioTagInfo.a aVar) {
            ensureRadioTagListIsMutable();
            this.radioTagList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRadioTagList(int i, NetRadioTagInfo.a aVar) {
            ensureRadioTagListIsMutable();
            this.radioTagList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRadioTagList(Iterable<? extends NetRadioTagInfo> iterable) {
            ensureRadioTagListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.radioTagList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRadioTagList() {
            this.radioTagList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRadioTagList(int i) {
            ensureRadioTagListIsMutable();
            this.radioTagList_.remove(i);
        }

        public static RadioTagList parseFrom(ByteBuffer byteBuffer) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RadioTagList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RadioTagList parseFrom(ByteString byteString) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RadioTagList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RadioTagList parseFrom(byte[] bArr) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RadioTagList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RadioTagList parseFrom(InputStream inputStream) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RadioTagList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RadioTagList parseDelimitedFrom(InputStream inputStream) {
            return (RadioTagList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RadioTagList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioTagList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RadioTagList parseFrom(CodedInputStream codedInputStream) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RadioTagList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadioTagList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RadioTagList radioTagList) {
            return DEFAULT_INSTANCE.createBuilder(radioTagList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RadioTagList, a> implements f {
            private a() {
                super(RadioTagList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((RadioTagList) this.instance).setErrorCode(i);
                return this;
            }

            public a a(NetRadioTagInfo netRadioTagInfo) {
                copyOnWrite();
                ((RadioTagList) this.instance).addRadioTagList(netRadioTagInfo);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RadioTagList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "radioTagList_", NetRadioTagInfo.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RadioTagList> parser = PARSER;
                    if (parser == null) {
                        synchronized (RadioTagList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(RadioTagList.class, DEFAULT_INSTANCE);
        }

        public static RadioTagList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RadioTagList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
