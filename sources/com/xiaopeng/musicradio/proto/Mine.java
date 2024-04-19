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
public final class Mine {

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
    public static final class MineDataListReq extends GeneratedMessageLite<MineDataListReq, a> implements f {
        private static final MineDataListReq DEFAULT_INSTANCE = new MineDataListReq();
        public static final int MORE_FIELD_NUMBER = 1;
        private static volatile Parser<MineDataListReq> PARSER;
        private boolean more_;

        private MineDataListReq() {
        }

        public boolean getMore() {
            return this.more_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMore(boolean z) {
            this.more_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMore() {
            this.more_ = false;
        }

        public static MineDataListReq parseFrom(ByteBuffer byteBuffer) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineDataListReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineDataListReq parseFrom(ByteString byteString) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineDataListReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineDataListReq parseFrom(byte[] bArr) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineDataListReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineDataListReq parseFrom(InputStream inputStream) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineDataListReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineDataListReq parseDelimitedFrom(InputStream inputStream) {
            return (MineDataListReq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineDataListReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineDataListReq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineDataListReq parseFrom(CodedInputStream codedInputStream) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineDataListReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineDataListReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineDataListReq mineDataListReq) {
            return DEFAULT_INSTANCE.createBuilder(mineDataListReq);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineDataListReq, a> implements f {
            private a() {
                super(MineDataListReq.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineDataListReq();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"more_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineDataListReq> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineDataListReq.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineDataListReq.class, DEFAULT_INSTANCE);
        }

        public static MineDataListReq getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineDataListReq> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineMusicDeleteReq extends GeneratedMessageLite<MineMusicDeleteReq, a> implements h {
        public static final int DATALIST_FIELD_NUMBER = 1;
        private static final MineMusicDeleteReq DEFAULT_INSTANCE = new MineMusicDeleteReq();
        private static volatile Parser<MineMusicDeleteReq> PARSER;
        private Internal.ProtobufList<String> dataList_ = GeneratedMessageLite.emptyProtobufList();

        private MineMusicDeleteReq() {
        }

        public List<String> getDataListList() {
            return this.dataList_;
        }

        public int getDataListCount() {
            return this.dataList_.size();
        }

        public String getDataList(int i) {
            return this.dataList_.get(i);
        }

        public ByteString getDataListBytes(int i) {
            return ByteString.copyFromUtf8(this.dataList_.get(i));
        }

        private void ensureDataListIsMutable() {
            if (this.dataList_.isModifiable()) {
                return;
            }
            this.dataList_ = GeneratedMessageLite.mutableCopy(this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDataList(Iterable<String> iterable) {
            ensureDataListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataList() {
            this.dataList_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataListBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            ensureDataListIsMutable();
            this.dataList_.add(byteString.toStringUtf8());
        }

        public static MineMusicDeleteReq parseFrom(ByteBuffer byteBuffer) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineMusicDeleteReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineMusicDeleteReq parseFrom(ByteString byteString) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineMusicDeleteReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineMusicDeleteReq parseFrom(byte[] bArr) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineMusicDeleteReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineMusicDeleteReq parseFrom(InputStream inputStream) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineMusicDeleteReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineMusicDeleteReq parseDelimitedFrom(InputStream inputStream) {
            return (MineMusicDeleteReq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineMusicDeleteReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicDeleteReq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineMusicDeleteReq parseFrom(CodedInputStream codedInputStream) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineMusicDeleteReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicDeleteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineMusicDeleteReq mineMusicDeleteReq) {
            return DEFAULT_INSTANCE.createBuilder(mineMusicDeleteReq);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineMusicDeleteReq, a> implements h {
            private a() {
                super(MineMusicDeleteReq.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineMusicDeleteReq();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"dataList_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineMusicDeleteReq> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineMusicDeleteReq.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineMusicDeleteReq.class, DEFAULT_INSTANCE);
        }

        public static MineMusicDeleteReq getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineMusicDeleteReq> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineMusicResp extends GeneratedMessageLite<MineMusicResp, a> implements k {
        public static final int DATALIST_FIELD_NUMBER = 4;
        private static final MineMusicResp DEFAULT_INSTANCE = new MineMusicResp();
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int HASMORE_FIELD_NUMBER = 3;
        public static final int MORE_FIELD_NUMBER = 2;
        private static volatile Parser<MineMusicResp> PARSER = null;
        public static final int TOTAL_FIELD_NUMBER = 5;
        private Internal.ProtobufList<Music.MusicInfo> dataList_ = emptyProtobufList();
        private boolean error_;
        private boolean hasMore_;
        private boolean more_;
        private int total_;

        private MineMusicResp() {
        }

        public boolean getError() {
            return this.error_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(boolean z) {
            this.error_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = false;
        }

        public boolean getMore() {
            return this.more_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMore(boolean z) {
            this.more_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMore() {
            this.more_ = false;
        }

        public boolean getHasMore() {
            return this.hasMore_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasMore(boolean z) {
            this.hasMore_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasMore() {
            this.hasMore_ = false;
        }

        public List<Music.MusicInfo> getDataListList() {
            return this.dataList_;
        }

        public List<? extends Music.d> getDataListOrBuilderList() {
            return this.dataList_;
        }

        public int getDataListCount() {
            return this.dataList_.size();
        }

        public Music.MusicInfo getDataList(int i) {
            return this.dataList_.get(i);
        }

        public Music.d getDataListOrBuilder(int i) {
            return this.dataList_.get(i);
        }

        private void ensureDataListIsMutable() {
            if (this.dataList_.isModifiable()) {
                return;
            }
            this.dataList_ = GeneratedMessageLite.mutableCopy(this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, Music.MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.set(i, musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, Music.MusicInfo.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(Music.MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, Music.MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(i, musicInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(Music.MusicInfo.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, Music.MusicInfo.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDataList(Iterable<? extends Music.MusicInfo> iterable) {
            ensureDataListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataList() {
            this.dataList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDataList(int i) {
            ensureDataListIsMutable();
            this.dataList_.remove(i);
        }

        public int getTotal() {
            return this.total_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotal(int i) {
            this.total_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotal() {
            this.total_ = 0;
        }

        public static MineMusicResp parseFrom(ByteBuffer byteBuffer) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineMusicResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineMusicResp parseFrom(ByteString byteString) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineMusicResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineMusicResp parseFrom(byte[] bArr) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineMusicResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineMusicResp parseFrom(InputStream inputStream) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineMusicResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineMusicResp parseDelimitedFrom(InputStream inputStream) {
            return (MineMusicResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineMusicResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineMusicResp parseFrom(CodedInputStream codedInputStream) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineMusicResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineMusicResp mineMusicResp) {
            return DEFAULT_INSTANCE.createBuilder(mineMusicResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineMusicResp, a> implements k {
            private a() {
                super(MineMusicResp.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineMusicResp) this.instance).setError(z);
                return this;
            }

            public a b(boolean z) {
                copyOnWrite();
                ((MineMusicResp) this.instance).setMore(z);
                return this;
            }

            public a c(boolean z) {
                copyOnWrite();
                ((MineMusicResp) this.instance).setHasMore(z);
                return this;
            }

            public a a(Music.MusicInfo musicInfo) {
                copyOnWrite();
                ((MineMusicResp) this.instance).addDataList(musicInfo);
                return this;
            }

            public a a(int i) {
                copyOnWrite();
                ((MineMusicResp) this.instance).setTotal(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineMusicResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u001b\u0005\u0004", new Object[]{"error_", "more_", "hasMore_", "dataList_", Music.MusicInfo.class, "total_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineMusicResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineMusicResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineMusicResp.class, DEFAULT_INSTANCE);
        }

        public static MineMusicResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineMusicResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineAlbumResp extends GeneratedMessageLite<MineAlbumResp, a> implements d {
        public static final int DATALIST_FIELD_NUMBER = 4;
        private static final MineAlbumResp DEFAULT_INSTANCE = new MineAlbumResp();
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int HASMORE_FIELD_NUMBER = 3;
        public static final int MORE_FIELD_NUMBER = 2;
        private static volatile Parser<MineAlbumResp> PARSER = null;
        public static final int TOTAL_FIELD_NUMBER = 5;
        private Internal.ProtobufList<Music.MusicAlbum> dataList_ = emptyProtobufList();
        private boolean error_;
        private boolean hasMore_;
        private boolean more_;
        private int total_;

        private MineAlbumResp() {
        }

        public boolean getError() {
            return this.error_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(boolean z) {
            this.error_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = false;
        }

        public boolean getMore() {
            return this.more_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMore(boolean z) {
            this.more_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMore() {
            this.more_ = false;
        }

        public boolean getHasMore() {
            return this.hasMore_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasMore(boolean z) {
            this.hasMore_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasMore() {
            this.hasMore_ = false;
        }

        public List<Music.MusicAlbum> getDataListList() {
            return this.dataList_;
        }

        public List<? extends Music.b> getDataListOrBuilderList() {
            return this.dataList_;
        }

        public int getDataListCount() {
            return this.dataList_.size();
        }

        public Music.MusicAlbum getDataList(int i) {
            return this.dataList_.get(i);
        }

        public Music.b getDataListOrBuilder(int i) {
            return this.dataList_.get(i);
        }

        private void ensureDataListIsMutable() {
            if (this.dataList_.isModifiable()) {
                return;
            }
            this.dataList_ = GeneratedMessageLite.mutableCopy(this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.set(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, Music.MusicAlbum.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(i, musicAlbum);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(Music.MusicAlbum.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, Music.MusicAlbum.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDataList(Iterable<? extends Music.MusicAlbum> iterable) {
            ensureDataListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataList() {
            this.dataList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDataList(int i) {
            ensureDataListIsMutable();
            this.dataList_.remove(i);
        }

        public int getTotal() {
            return this.total_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotal(int i) {
            this.total_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotal() {
            this.total_ = 0;
        }

        public static MineAlbumResp parseFrom(ByteBuffer byteBuffer) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineAlbumResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineAlbumResp parseFrom(ByteString byteString) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineAlbumResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineAlbumResp parseFrom(byte[] bArr) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineAlbumResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineAlbumResp parseFrom(InputStream inputStream) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAlbumResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAlbumResp parseDelimitedFrom(InputStream inputStream) {
            return (MineAlbumResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAlbumResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAlbumResp parseFrom(CodedInputStream codedInputStream) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineAlbumResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineAlbumResp mineAlbumResp) {
            return DEFAULT_INSTANCE.createBuilder(mineAlbumResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineAlbumResp, a> implements d {
            private a() {
                super(MineAlbumResp.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineAlbumResp) this.instance).setError(z);
                return this;
            }

            public a b(boolean z) {
                copyOnWrite();
                ((MineAlbumResp) this.instance).setMore(z);
                return this;
            }

            public a c(boolean z) {
                copyOnWrite();
                ((MineAlbumResp) this.instance).setHasMore(z);
                return this;
            }

            public a a(Music.MusicAlbum musicAlbum) {
                copyOnWrite();
                ((MineAlbumResp) this.instance).addDataList(musicAlbum);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineAlbumResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u001b\u0005\u0004", new Object[]{"error_", "more_", "hasMore_", "dataList_", Music.MusicAlbum.class, "total_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineAlbumResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineAlbumResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineAlbumResp.class, DEFAULT_INSTANCE);
        }

        public static MineAlbumResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineAlbumResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineProgramResp extends GeneratedMessageLite<MineProgramResp, a> implements p {
        public static final int DATALIST_FIELD_NUMBER = 4;
        private static final MineProgramResp DEFAULT_INSTANCE = new MineProgramResp();
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int HASMORE_FIELD_NUMBER = 3;
        public static final int MORE_FIELD_NUMBER = 2;
        private static volatile Parser<MineProgramResp> PARSER = null;
        public static final int TOTAL_FIELD_NUMBER = 5;
        private Internal.ProtobufList<Netprogram.AlbumBean> dataList_ = emptyProtobufList();
        private boolean error_;
        private boolean hasMore_;
        private boolean more_;
        private int total_;

        private MineProgramResp() {
        }

        public boolean getError() {
            return this.error_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(boolean z) {
            this.error_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = false;
        }

        public boolean getMore() {
            return this.more_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMore(boolean z) {
            this.more_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMore() {
            this.more_ = false;
        }

        public boolean getHasMore() {
            return this.hasMore_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasMore(boolean z) {
            this.hasMore_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasMore() {
            this.hasMore_ = false;
        }

        public List<Netprogram.AlbumBean> getDataListList() {
            return this.dataList_;
        }

        public List<? extends Netprogram.b> getDataListOrBuilderList() {
            return this.dataList_;
        }

        public int getDataListCount() {
            return this.dataList_.size();
        }

        public Netprogram.AlbumBean getDataList(int i) {
            return this.dataList_.get(i);
        }

        public Netprogram.b getDataListOrBuilder(int i) {
            return this.dataList_.get(i);
        }

        private void ensureDataListIsMutable() {
            if (this.dataList_.isModifiable()) {
                return;
            }
            this.dataList_ = GeneratedMessageLite.mutableCopy(this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, Netprogram.AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.set(i, albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, Netprogram.AlbumBean.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(Netprogram.AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, Netprogram.AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(i, albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(Netprogram.AlbumBean.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, Netprogram.AlbumBean.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDataList(Iterable<? extends Netprogram.AlbumBean> iterable) {
            ensureDataListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataList() {
            this.dataList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDataList(int i) {
            ensureDataListIsMutable();
            this.dataList_.remove(i);
        }

        public int getTotal() {
            return this.total_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotal(int i) {
            this.total_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotal() {
            this.total_ = 0;
        }

        public static MineProgramResp parseFrom(ByteBuffer byteBuffer) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineProgramResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineProgramResp parseFrom(ByteString byteString) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineProgramResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineProgramResp parseFrom(byte[] bArr) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineProgramResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineProgramResp parseFrom(InputStream inputStream) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineProgramResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineProgramResp parseDelimitedFrom(InputStream inputStream) {
            return (MineProgramResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineProgramResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineProgramResp parseFrom(CodedInputStream codedInputStream) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineProgramResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineProgramResp mineProgramResp) {
            return DEFAULT_INSTANCE.createBuilder(mineProgramResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineProgramResp, a> implements p {
            private a() {
                super(MineProgramResp.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineProgramResp) this.instance).setError(z);
                return this;
            }

            public a b(boolean z) {
                copyOnWrite();
                ((MineProgramResp) this.instance).setMore(z);
                return this;
            }

            public a c(boolean z) {
                copyOnWrite();
                ((MineProgramResp) this.instance).setHasMore(z);
                return this;
            }

            public a a(Netprogram.AlbumBean albumBean) {
                copyOnWrite();
                ((MineProgramResp) this.instance).addDataList(albumBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineProgramResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u001b\u0005\u0004", new Object[]{"error_", "more_", "hasMore_", "dataList_", Netprogram.AlbumBean.class, "total_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineProgramResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineProgramResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineProgramResp.class, DEFAULT_INSTANCE);
        }

        public static MineProgramResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineProgramResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineNetRadioResp extends GeneratedMessageLite<MineNetRadioResp, a> implements n {
        public static final int DATALIST_FIELD_NUMBER = 4;
        private static final MineNetRadioResp DEFAULT_INSTANCE = new MineNetRadioResp();
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int HASMORE_FIELD_NUMBER = 3;
        public static final int MORE_FIELD_NUMBER = 2;
        private static volatile Parser<MineNetRadioResp> PARSER = null;
        public static final int TOTAL_FIELD_NUMBER = 5;
        private Internal.ProtobufList<Netradio.NetRadioInfo> dataList_ = emptyProtobufList();
        private boolean error_;
        private boolean hasMore_;
        private boolean more_;
        private int total_;

        private MineNetRadioResp() {
        }

        public boolean getError() {
            return this.error_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(boolean z) {
            this.error_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = false;
        }

        public boolean getMore() {
            return this.more_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMore(boolean z) {
            this.more_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMore() {
            this.more_ = false;
        }

        public boolean getHasMore() {
            return this.hasMore_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasMore(boolean z) {
            this.hasMore_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasMore() {
            this.hasMore_ = false;
        }

        public List<Netradio.NetRadioInfo> getDataListList() {
            return this.dataList_;
        }

        public List<? extends Netradio.a> getDataListOrBuilderList() {
            return this.dataList_;
        }

        public int getDataListCount() {
            return this.dataList_.size();
        }

        public Netradio.NetRadioInfo getDataList(int i) {
            return this.dataList_.get(i);
        }

        public Netradio.a getDataListOrBuilder(int i) {
            return this.dataList_.get(i);
        }

        private void ensureDataListIsMutable() {
            if (this.dataList_.isModifiable()) {
                return;
            }
            this.dataList_ = GeneratedMessageLite.mutableCopy(this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, Netradio.NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.set(i, netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataList(int i, Netradio.NetRadioInfo.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(Netradio.NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, Netradio.NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            ensureDataListIsMutable();
            this.dataList_.add(i, netRadioInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(Netradio.NetRadioInfo.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataList(int i, Netradio.NetRadioInfo.a aVar) {
            ensureDataListIsMutable();
            this.dataList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDataList(Iterable<? extends Netradio.NetRadioInfo> iterable) {
            ensureDataListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataList() {
            this.dataList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDataList(int i) {
            ensureDataListIsMutable();
            this.dataList_.remove(i);
        }

        public int getTotal() {
            return this.total_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotal(int i) {
            this.total_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotal() {
            this.total_ = 0;
        }

        public static MineNetRadioResp parseFrom(ByteBuffer byteBuffer) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineNetRadioResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineNetRadioResp parseFrom(ByteString byteString) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineNetRadioResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineNetRadioResp parseFrom(byte[] bArr) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineNetRadioResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineNetRadioResp parseFrom(InputStream inputStream) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineNetRadioResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineNetRadioResp parseDelimitedFrom(InputStream inputStream) {
            return (MineNetRadioResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineNetRadioResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineNetRadioResp parseFrom(CodedInputStream codedInputStream) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineNetRadioResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineNetRadioResp mineNetRadioResp) {
            return DEFAULT_INSTANCE.createBuilder(mineNetRadioResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineNetRadioResp, a> implements n {
            private a() {
                super(MineNetRadioResp.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineNetRadioResp) this.instance).setError(z);
                return this;
            }

            public a b(boolean z) {
                copyOnWrite();
                ((MineNetRadioResp) this.instance).setMore(z);
                return this;
            }

            public a c(boolean z) {
                copyOnWrite();
                ((MineNetRadioResp) this.instance).setHasMore(z);
                return this;
            }

            public a a(Netradio.NetRadioInfo netRadioInfo) {
                copyOnWrite();
                ((MineNetRadioResp) this.instance).addDataList(netRadioInfo);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineNetRadioResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u001b\u0005\u0004", new Object[]{"error_", "more_", "hasMore_", "dataList_", Netradio.NetRadioInfo.class, "total_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineNetRadioResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineNetRadioResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineNetRadioResp.class, DEFAULT_INSTANCE);
        }

        public static MineNetRadioResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineNetRadioResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineAuthResp extends GeneratedMessageLite<MineAuthResp, a> implements e {
        public static final int AUTH_FIELD_NUMBER = 1;
        private static final MineAuthResp DEFAULT_INSTANCE = new MineAuthResp();
        private static volatile Parser<MineAuthResp> PARSER;
        private boolean auth_;

        private MineAuthResp() {
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

        public static MineAuthResp parseFrom(ByteBuffer byteBuffer) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineAuthResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineAuthResp parseFrom(ByteString byteString) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineAuthResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineAuthResp parseFrom(byte[] bArr) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineAuthResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineAuthResp parseFrom(InputStream inputStream) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAuthResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAuthResp parseDelimitedFrom(InputStream inputStream) {
            return (MineAuthResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAuthResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAuthResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAuthResp parseFrom(CodedInputStream codedInputStream) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineAuthResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAuthResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineAuthResp mineAuthResp) {
            return DEFAULT_INSTANCE.createBuilder(mineAuthResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineAuthResp, a> implements e {
            private a() {
                super(MineAuthResp.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineAuthResp) this.instance).setAuth(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineAuthResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"auth_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineAuthResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineAuthResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineAuthResp.class, DEFAULT_INSTANCE);
        }

        public static MineAuthResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineAuthResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineAccountResp extends GeneratedMessageLite<MineAccountResp, a> implements a {
        public static final int AVATAR_FIELD_NUMBER = 2;
        private static final MineAccountResp DEFAULT_INSTANCE = new MineAccountResp();
        public static final int ISGREENVIP_FIELD_NUMBER = 5;
        public static final int ISVIP_FIELD_NUMBER = 3;
        public static final int NICKNAME_FIELD_NUMBER = 1;
        private static volatile Parser<MineAccountResp> PARSER = null;
        public static final int VIPENDTIME_FIELD_NUMBER = 4;
        private boolean isGreenVip_;
        private boolean isVip_;
        private String nickName_ = "";
        private String avatar_ = "";
        private String vipEndTime_ = "";

        private MineAccountResp() {
        }

        public String getNickName() {
            return this.nickName_;
        }

        public ByteString getNickNameBytes() {
            return ByteString.copyFromUtf8(this.nickName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNickName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.nickName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNickName() {
            this.nickName_ = getDefaultInstance().getNickName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNickNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.nickName_ = byteString.toStringUtf8();
        }

        public String getAvatar() {
            return this.avatar_;
        }

        public ByteString getAvatarBytes() {
            return ByteString.copyFromUtf8(this.avatar_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatar(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.avatar_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatar() {
            this.avatar_ = getDefaultInstance().getAvatar();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.avatar_ = byteString.toStringUtf8();
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

        public String getVipEndTime() {
            return this.vipEndTime_;
        }

        public ByteString getVipEndTimeBytes() {
            return ByteString.copyFromUtf8(this.vipEndTime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVipEndTime(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.vipEndTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVipEndTime() {
            this.vipEndTime_ = getDefaultInstance().getVipEndTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVipEndTimeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.vipEndTime_ = byteString.toStringUtf8();
        }

        public boolean getIsGreenVip() {
            return this.isGreenVip_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsGreenVip(boolean z) {
            this.isGreenVip_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsGreenVip() {
            this.isGreenVip_ = false;
        }

        public static MineAccountResp parseFrom(ByteBuffer byteBuffer) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineAccountResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineAccountResp parseFrom(ByteString byteString) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineAccountResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineAccountResp parseFrom(byte[] bArr) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineAccountResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineAccountResp parseFrom(InputStream inputStream) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAccountResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAccountResp parseDelimitedFrom(InputStream inputStream) {
            return (MineAccountResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAccountResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAccountResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAccountResp parseFrom(CodedInputStream codedInputStream) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineAccountResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAccountResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineAccountResp mineAccountResp) {
            return DEFAULT_INSTANCE.createBuilder(mineAccountResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineAccountResp, a> implements a {
            private a() {
                super(MineAccountResp.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((MineAccountResp) this.instance).setNickName(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((MineAccountResp) this.instance).setAvatar(str);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineAccountResp) this.instance).setIsVip(z);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((MineAccountResp) this.instance).setVipEndTime(str);
                return this;
            }

            public a b(boolean z) {
                copyOnWrite();
                ((MineAccountResp) this.instance).setIsGreenVip(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineAccountResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007", new Object[]{"nickName_", "avatar_", "isVip_", "vipEndTime_", "isGreenVip_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineAccountResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineAccountResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineAccountResp.class, DEFAULT_INSTANCE);
        }

        public static MineAccountResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineAccountResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineQrCodeResp extends GeneratedMessageLite<MineQrCodeResp, a> implements q {
        private static final MineQrCodeResp DEFAULT_INSTANCE = new MineQrCodeResp();
        public static final int ERROR_FIELD_NUMBER = 1;
        private static volatile Parser<MineQrCodeResp> PARSER = null;
        public static final int QRDATA_FIELD_NUMBER = 2;
        private String error_ = "";
        private String qrData_ = "";

        private MineQrCodeResp() {
        }

        public String getError() {
            return this.error_;
        }

        public ByteString getErrorBytes() {
            return ByteString.copyFromUtf8(this.error_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.error_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = getDefaultInstance().getError();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.error_ = byteString.toStringUtf8();
        }

        public String getQrData() {
            return this.qrData_;
        }

        public ByteString getQrDataBytes() {
            return ByteString.copyFromUtf8(this.qrData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQrData(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.qrData_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQrData() {
            this.qrData_ = getDefaultInstance().getQrData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQrDataBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.qrData_ = byteString.toStringUtf8();
        }

        public static MineQrCodeResp parseFrom(ByteBuffer byteBuffer) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineQrCodeResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineQrCodeResp parseFrom(ByteString byteString) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineQrCodeResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineQrCodeResp parseFrom(byte[] bArr) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineQrCodeResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineQrCodeResp parseFrom(InputStream inputStream) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineQrCodeResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineQrCodeResp parseDelimitedFrom(InputStream inputStream) {
            return (MineQrCodeResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineQrCodeResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineQrCodeResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineQrCodeResp parseFrom(CodedInputStream codedInputStream) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineQrCodeResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineQrCodeResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineQrCodeResp mineQrCodeResp) {
            return DEFAULT_INSTANCE.createBuilder(mineQrCodeResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineQrCodeResp, a> implements q {
            private a() {
                super(MineQrCodeResp.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((MineQrCodeResp) this.instance).setError(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((MineQrCodeResp) this.instance).setQrData(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineQrCodeResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"error_", "qrData_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineQrCodeResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineQrCodeResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineQrCodeResp.class, DEFAULT_INSTANCE);
        }

        public static MineQrCodeResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineQrCodeResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineVipBuyingResp extends GeneratedMessageLite<MineVipBuyingResp, a> implements s {
        public static final int BUYVIPURL_FIELD_NUMBER = 3;
        private static final MineVipBuyingResp DEFAULT_INSTANCE = new MineVipBuyingResp();
        public static final int ERROR_FIELD_NUMBER = 1;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        private static volatile Parser<MineVipBuyingResp> PARSER;
        private boolean error_;
        private String nickName_ = "";
        private String buyVipUrl_ = "";

        private MineVipBuyingResp() {
        }

        public boolean getError() {
            return this.error_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(boolean z) {
            this.error_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = false;
        }

        public String getNickName() {
            return this.nickName_;
        }

        public ByteString getNickNameBytes() {
            return ByteString.copyFromUtf8(this.nickName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNickName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.nickName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNickName() {
            this.nickName_ = getDefaultInstance().getNickName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNickNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.nickName_ = byteString.toStringUtf8();
        }

        public String getBuyVipUrl() {
            return this.buyVipUrl_;
        }

        public ByteString getBuyVipUrlBytes() {
            return ByteString.copyFromUtf8(this.buyVipUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuyVipUrl(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.buyVipUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuyVipUrl() {
            this.buyVipUrl_ = getDefaultInstance().getBuyVipUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuyVipUrlBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.buyVipUrl_ = byteString.toStringUtf8();
        }

        public static MineVipBuyingResp parseFrom(ByteBuffer byteBuffer) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineVipBuyingResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineVipBuyingResp parseFrom(ByteString byteString) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineVipBuyingResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineVipBuyingResp parseFrom(byte[] bArr) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineVipBuyingResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineVipBuyingResp parseFrom(InputStream inputStream) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineVipBuyingResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineVipBuyingResp parseDelimitedFrom(InputStream inputStream) {
            return (MineVipBuyingResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineVipBuyingResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineVipBuyingResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineVipBuyingResp parseFrom(CodedInputStream codedInputStream) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineVipBuyingResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineVipBuyingResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineVipBuyingResp mineVipBuyingResp) {
            return DEFAULT_INSTANCE.createBuilder(mineVipBuyingResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineVipBuyingResp, a> implements s {
            private a() {
                super(MineVipBuyingResp.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineVipBuyingResp) this.instance).setError(z);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((MineVipBuyingResp) this.instance).setNickName(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((MineVipBuyingResp) this.instance).setBuyVipUrl(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineVipBuyingResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ", new Object[]{"error_", "nickName_", "buyVipUrl_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineVipBuyingResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineVipBuyingResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineVipBuyingResp.class, DEFAULT_INSTANCE);
        }

        public static MineVipBuyingResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineVipBuyingResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineMusicLoveResp extends GeneratedMessageLite<MineMusicLoveResp, a> implements j {
        private static final MineMusicLoveResp DEFAULT_INSTANCE = new MineMusicLoveResp();
        private static volatile Parser<MineMusicLoveResp> PARSER = null;
        public static final int TARGET_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private Music.MusicInfo target_;
        private boolean value_;

        private MineMusicLoveResp() {
        }

        public boolean hasTarget() {
            return this.target_ != null;
        }

        public Music.MusicInfo getTarget() {
            Music.MusicInfo musicInfo = this.target_;
            return musicInfo == null ? Music.MusicInfo.getDefaultInstance() : musicInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(Music.MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            this.target_ = musicInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(Music.MusicInfo.a aVar) {
            this.target_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTarget(Music.MusicInfo musicInfo) {
            if (musicInfo == null) {
                throw new NullPointerException();
            }
            Music.MusicInfo musicInfo2 = this.target_;
            if (musicInfo2 != null && musicInfo2 != Music.MusicInfo.getDefaultInstance()) {
                this.target_ = Music.MusicInfo.newBuilder(this.target_).mergeFrom((Music.MusicInfo.a) musicInfo).buildPartial();
            } else {
                this.target_ = musicInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTarget() {
            this.target_ = null;
        }

        public boolean getValue() {
            return this.value_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(boolean z) {
            this.value_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = false;
        }

        public static MineMusicLoveResp parseFrom(ByteBuffer byteBuffer) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineMusicLoveResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineMusicLoveResp parseFrom(ByteString byteString) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineMusicLoveResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineMusicLoveResp parseFrom(byte[] bArr) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineMusicLoveResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineMusicLoveResp parseFrom(InputStream inputStream) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineMusicLoveResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineMusicLoveResp parseDelimitedFrom(InputStream inputStream) {
            return (MineMusicLoveResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineMusicLoveResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineMusicLoveResp parseFrom(CodedInputStream codedInputStream) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineMusicLoveResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineMusicLoveResp mineMusicLoveResp) {
            return DEFAULT_INSTANCE.createBuilder(mineMusicLoveResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineMusicLoveResp, a> implements j {
            private a() {
                super(MineMusicLoveResp.DEFAULT_INSTANCE);
            }

            public a a(Music.MusicInfo musicInfo) {
                copyOnWrite();
                ((MineMusicLoveResp) this.instance).setTarget(musicInfo);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineMusicLoveResp) this.instance).setValue(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineMusicLoveResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"target_", "value_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineMusicLoveResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineMusicLoveResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineMusicLoveResp.class, DEFAULT_INSTANCE);
        }

        public static MineMusicLoveResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineMusicLoveResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineAlbumLoveResp extends GeneratedMessageLite<MineAlbumLoveResp, a> implements c {
        private static final MineAlbumLoveResp DEFAULT_INSTANCE = new MineAlbumLoveResp();
        private static volatile Parser<MineAlbumLoveResp> PARSER = null;
        public static final int TARGET_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private Music.MusicAlbum target_;
        private boolean value_;

        private MineAlbumLoveResp() {
        }

        public boolean hasTarget() {
            return this.target_ != null;
        }

        public Music.MusicAlbum getTarget() {
            Music.MusicAlbum musicAlbum = this.target_;
            return musicAlbum == null ? Music.MusicAlbum.getDefaultInstance() : musicAlbum;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            this.target_ = musicAlbum;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(Music.MusicAlbum.a aVar) {
            this.target_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTarget(Music.MusicAlbum musicAlbum) {
            if (musicAlbum == null) {
                throw new NullPointerException();
            }
            Music.MusicAlbum musicAlbum2 = this.target_;
            if (musicAlbum2 != null && musicAlbum2 != Music.MusicAlbum.getDefaultInstance()) {
                this.target_ = Music.MusicAlbum.newBuilder(this.target_).mergeFrom((Music.MusicAlbum.a) musicAlbum).buildPartial();
            } else {
                this.target_ = musicAlbum;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTarget() {
            this.target_ = null;
        }

        public boolean getValue() {
            return this.value_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(boolean z) {
            this.value_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = false;
        }

        public static MineAlbumLoveResp parseFrom(ByteBuffer byteBuffer) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineAlbumLoveResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineAlbumLoveResp parseFrom(ByteString byteString) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineAlbumLoveResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineAlbumLoveResp parseFrom(byte[] bArr) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineAlbumLoveResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineAlbumLoveResp parseFrom(InputStream inputStream) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAlbumLoveResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAlbumLoveResp parseDelimitedFrom(InputStream inputStream) {
            return (MineAlbumLoveResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAlbumLoveResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAlbumLoveResp parseFrom(CodedInputStream codedInputStream) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineAlbumLoveResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineAlbumLoveResp mineAlbumLoveResp) {
            return DEFAULT_INSTANCE.createBuilder(mineAlbumLoveResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineAlbumLoveResp, a> implements c {
            private a() {
                super(MineAlbumLoveResp.DEFAULT_INSTANCE);
            }

            public a a(Music.MusicAlbum musicAlbum) {
                copyOnWrite();
                ((MineAlbumLoveResp) this.instance).setTarget(musicAlbum);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineAlbumLoveResp) this.instance).setValue(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineAlbumLoveResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"target_", "value_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineAlbumLoveResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineAlbumLoveResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineAlbumLoveResp.class, DEFAULT_INSTANCE);
        }

        public static MineAlbumLoveResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineAlbumLoveResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineProgramLoveResp extends GeneratedMessageLite<MineProgramLoveResp, a> implements o {
        private static final MineProgramLoveResp DEFAULT_INSTANCE = new MineProgramLoveResp();
        private static volatile Parser<MineProgramLoveResp> PARSER = null;
        public static final int TARGET_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private Netprogram.AlbumBean target_;
        private boolean value_;

        private MineProgramLoveResp() {
        }

        public boolean hasTarget() {
            return this.target_ != null;
        }

        public Netprogram.AlbumBean getTarget() {
            Netprogram.AlbumBean albumBean = this.target_;
            return albumBean == null ? Netprogram.AlbumBean.getDefaultInstance() : albumBean;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(Netprogram.AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            this.target_ = albumBean;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(Netprogram.AlbumBean.a aVar) {
            this.target_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTarget(Netprogram.AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            Netprogram.AlbumBean albumBean2 = this.target_;
            if (albumBean2 != null && albumBean2 != Netprogram.AlbumBean.getDefaultInstance()) {
                this.target_ = Netprogram.AlbumBean.newBuilder(this.target_).mergeFrom((Netprogram.AlbumBean.a) albumBean).buildPartial();
            } else {
                this.target_ = albumBean;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTarget() {
            this.target_ = null;
        }

        public boolean getValue() {
            return this.value_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(boolean z) {
            this.value_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = false;
        }

        public static MineProgramLoveResp parseFrom(ByteBuffer byteBuffer) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineProgramLoveResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineProgramLoveResp parseFrom(ByteString byteString) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineProgramLoveResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineProgramLoveResp parseFrom(byte[] bArr) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineProgramLoveResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineProgramLoveResp parseFrom(InputStream inputStream) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineProgramLoveResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineProgramLoveResp parseDelimitedFrom(InputStream inputStream) {
            return (MineProgramLoveResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineProgramLoveResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramLoveResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineProgramLoveResp parseFrom(CodedInputStream codedInputStream) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineProgramLoveResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineProgramLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineProgramLoveResp mineProgramLoveResp) {
            return DEFAULT_INSTANCE.createBuilder(mineProgramLoveResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineProgramLoveResp, a> implements o {
            private a() {
                super(MineProgramLoveResp.DEFAULT_INSTANCE);
            }

            public a a(Netprogram.AlbumBean albumBean) {
                copyOnWrite();
                ((MineProgramLoveResp) this.instance).setTarget(albumBean);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineProgramLoveResp) this.instance).setValue(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineProgramLoveResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"target_", "value_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineProgramLoveResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineProgramLoveResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineProgramLoveResp.class, DEFAULT_INSTANCE);
        }

        public static MineProgramLoveResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineProgramLoveResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineNetRadioLoveResp extends GeneratedMessageLite<MineNetRadioLoveResp, a> implements m {
        private static final MineNetRadioLoveResp DEFAULT_INSTANCE = new MineNetRadioLoveResp();
        private static volatile Parser<MineNetRadioLoveResp> PARSER = null;
        public static final int TARGET_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private Netradio.NetRadioInfo target_;
        private boolean value_;

        private MineNetRadioLoveResp() {
        }

        public boolean hasTarget() {
            return this.target_ != null;
        }

        public Netradio.NetRadioInfo getTarget() {
            Netradio.NetRadioInfo netRadioInfo = this.target_;
            return netRadioInfo == null ? Netradio.NetRadioInfo.getDefaultInstance() : netRadioInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(Netradio.NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            this.target_ = netRadioInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(Netradio.NetRadioInfo.a aVar) {
            this.target_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTarget(Netradio.NetRadioInfo netRadioInfo) {
            if (netRadioInfo == null) {
                throw new NullPointerException();
            }
            Netradio.NetRadioInfo netRadioInfo2 = this.target_;
            if (netRadioInfo2 != null && netRadioInfo2 != Netradio.NetRadioInfo.getDefaultInstance()) {
                this.target_ = Netradio.NetRadioInfo.newBuilder(this.target_).mergeFrom((Netradio.NetRadioInfo.a) netRadioInfo).buildPartial();
            } else {
                this.target_ = netRadioInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTarget() {
            this.target_ = null;
        }

        public boolean getValue() {
            return this.value_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(boolean z) {
            this.value_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = false;
        }

        public static MineNetRadioLoveResp parseFrom(ByteBuffer byteBuffer) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineNetRadioLoveResp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineNetRadioLoveResp parseFrom(ByteString byteString) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineNetRadioLoveResp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineNetRadioLoveResp parseFrom(byte[] bArr) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineNetRadioLoveResp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineNetRadioLoveResp parseFrom(InputStream inputStream) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineNetRadioLoveResp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineNetRadioLoveResp parseDelimitedFrom(InputStream inputStream) {
            return (MineNetRadioLoveResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineNetRadioLoveResp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveResp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineNetRadioLoveResp parseFrom(CodedInputStream codedInputStream) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineNetRadioLoveResp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveResp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineNetRadioLoveResp mineNetRadioLoveResp) {
            return DEFAULT_INSTANCE.createBuilder(mineNetRadioLoveResp);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineNetRadioLoveResp, a> implements m {
            private a() {
                super(MineNetRadioLoveResp.DEFAULT_INSTANCE);
            }

            public a a(Netradio.NetRadioInfo netRadioInfo) {
                copyOnWrite();
                ((MineNetRadioLoveResp) this.instance).setTarget(netRadioInfo);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineNetRadioLoveResp) this.instance).setValue(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineNetRadioLoveResp();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"target_", "value_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineNetRadioLoveResp> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineNetRadioLoveResp.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineNetRadioLoveResp.class, DEFAULT_INSTANCE);
        }

        public static MineNetRadioLoveResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineNetRadioLoveResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineLoginEvent extends GeneratedMessageLite<MineLoginEvent, a> implements g {
        private static final MineLoginEvent DEFAULT_INSTANCE = new MineLoginEvent();
        public static final int LOGIN_FIELD_NUMBER = 1;
        private static volatile Parser<MineLoginEvent> PARSER;
        private boolean login_;

        private MineLoginEvent() {
        }

        public boolean getLogin() {
            return this.login_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogin(boolean z) {
            this.login_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogin() {
            this.login_ = false;
        }

        public static MineLoginEvent parseFrom(ByteBuffer byteBuffer) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineLoginEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineLoginEvent parseFrom(ByteString byteString) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineLoginEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineLoginEvent parseFrom(byte[] bArr) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineLoginEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineLoginEvent parseFrom(InputStream inputStream) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineLoginEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineLoginEvent parseDelimitedFrom(InputStream inputStream) {
            return (MineLoginEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineLoginEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineLoginEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineLoginEvent parseFrom(CodedInputStream codedInputStream) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineLoginEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineLoginEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineLoginEvent mineLoginEvent) {
            return DEFAULT_INSTANCE.createBuilder(mineLoginEvent);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineLoginEvent, a> implements g {
            private a() {
                super(MineLoginEvent.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineLoginEvent) this.instance).setLogin(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineLoginEvent();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"login_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineLoginEvent> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineLoginEvent.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineLoginEvent.class, DEFAULT_INSTANCE);
        }

        public static MineLoginEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineLoginEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineMusicLoveEvent extends GeneratedMessageLite<MineMusicLoveEvent, a> implements i {
        public static final int ALBUMID_FIELD_NUMBER = 2;
        private static final MineMusicLoveEvent DEFAULT_INSTANCE = new MineMusicLoveEvent();
        public static final int HASH_FIELD_NUMBER = 1;
        public static final int LOVE_FIELD_NUMBER = 3;
        private static volatile Parser<MineMusicLoveEvent> PARSER;
        private long albumId_;
        private String hash_ = "";
        private boolean love_;

        private MineMusicLoveEvent() {
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

        public boolean getLove() {
            return this.love_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLove(boolean z) {
            this.love_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLove() {
            this.love_ = false;
        }

        public static MineMusicLoveEvent parseFrom(ByteBuffer byteBuffer) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineMusicLoveEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineMusicLoveEvent parseFrom(ByteString byteString) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineMusicLoveEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineMusicLoveEvent parseFrom(byte[] bArr) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineMusicLoveEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineMusicLoveEvent parseFrom(InputStream inputStream) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineMusicLoveEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineMusicLoveEvent parseDelimitedFrom(InputStream inputStream) {
            return (MineMusicLoveEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineMusicLoveEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineMusicLoveEvent parseFrom(CodedInputStream codedInputStream) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineMusicLoveEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineMusicLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineMusicLoveEvent mineMusicLoveEvent) {
            return DEFAULT_INSTANCE.createBuilder(mineMusicLoveEvent);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineMusicLoveEvent, a> implements i {
            private a() {
                super(MineMusicLoveEvent.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((MineMusicLoveEvent) this.instance).setHash(str);
                return this;
            }

            public a a(long j) {
                copyOnWrite();
                ((MineMusicLoveEvent) this.instance).setAlbumId(j);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineMusicLoveEvent) this.instance).setLove(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineMusicLoveEvent();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0007", new Object[]{"hash_", "albumId_", "love_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineMusicLoveEvent> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineMusicLoveEvent.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineMusicLoveEvent.class, DEFAULT_INSTANCE);
        }

        public static MineMusicLoveEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineMusicLoveEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineAlbumLoveEvent extends GeneratedMessageLite<MineAlbumLoveEvent, a> implements b {
        private static final MineAlbumLoveEvent DEFAULT_INSTANCE = new MineAlbumLoveEvent();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LOVE_FIELD_NUMBER = 2;
        private static volatile Parser<MineAlbumLoveEvent> PARSER;
        private long id_;
        private boolean love_;

        private MineAlbumLoveEvent() {
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

        public boolean getLove() {
            return this.love_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLove(boolean z) {
            this.love_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLove() {
            this.love_ = false;
        }

        public static MineAlbumLoveEvent parseFrom(ByteBuffer byteBuffer) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineAlbumLoveEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineAlbumLoveEvent parseFrom(ByteString byteString) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineAlbumLoveEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineAlbumLoveEvent parseFrom(byte[] bArr) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineAlbumLoveEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineAlbumLoveEvent parseFrom(InputStream inputStream) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAlbumLoveEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAlbumLoveEvent parseDelimitedFrom(InputStream inputStream) {
            return (MineAlbumLoveEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineAlbumLoveEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineAlbumLoveEvent parseFrom(CodedInputStream codedInputStream) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineAlbumLoveEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineAlbumLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineAlbumLoveEvent mineAlbumLoveEvent) {
            return DEFAULT_INSTANCE.createBuilder(mineAlbumLoveEvent);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineAlbumLoveEvent, a> implements b {
            private a() {
                super(MineAlbumLoveEvent.DEFAULT_INSTANCE);
            }

            public a a(long j) {
                copyOnWrite();
                ((MineAlbumLoveEvent) this.instance).setId(j);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineAlbumLoveEvent) this.instance).setLove(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineAlbumLoveEvent();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"id_", "love_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineAlbumLoveEvent> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineAlbumLoveEvent.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineAlbumLoveEvent.class, DEFAULT_INSTANCE);
        }

        public static MineAlbumLoveEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineAlbumLoveEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineReadLoveEvent extends GeneratedMessageLite<MineReadLoveEvent, a> implements r {
        private static final MineReadLoveEvent DEFAULT_INSTANCE = new MineReadLoveEvent();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LOVE_FIELD_NUMBER = 2;
        private static volatile Parser<MineReadLoveEvent> PARSER;
        private long id_;
        private boolean love_;

        private MineReadLoveEvent() {
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

        public boolean getLove() {
            return this.love_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLove(boolean z) {
            this.love_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLove() {
            this.love_ = false;
        }

        public static MineReadLoveEvent parseFrom(ByteBuffer byteBuffer) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineReadLoveEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineReadLoveEvent parseFrom(ByteString byteString) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineReadLoveEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineReadLoveEvent parseFrom(byte[] bArr) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineReadLoveEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineReadLoveEvent parseFrom(InputStream inputStream) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineReadLoveEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineReadLoveEvent parseDelimitedFrom(InputStream inputStream) {
            return (MineReadLoveEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineReadLoveEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineReadLoveEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineReadLoveEvent parseFrom(CodedInputStream codedInputStream) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineReadLoveEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineReadLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineReadLoveEvent mineReadLoveEvent) {
            return DEFAULT_INSTANCE.createBuilder(mineReadLoveEvent);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineReadLoveEvent, a> implements r {
            private a() {
                super(MineReadLoveEvent.DEFAULT_INSTANCE);
            }

            public a a(long j) {
                copyOnWrite();
                ((MineReadLoveEvent) this.instance).setId(j);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineReadLoveEvent) this.instance).setLove(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineReadLoveEvent();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"id_", "love_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineReadLoveEvent> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineReadLoveEvent.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineReadLoveEvent.class, DEFAULT_INSTANCE);
        }

        public static MineReadLoveEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineReadLoveEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MineNetRadioLoveEvent extends GeneratedMessageLite<MineNetRadioLoveEvent, a> implements l {
        private static final MineNetRadioLoveEvent DEFAULT_INSTANCE = new MineNetRadioLoveEvent();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LOVE_FIELD_NUMBER = 2;
        private static volatile Parser<MineNetRadioLoveEvent> PARSER;
        private long id_;
        private boolean love_;

        private MineNetRadioLoveEvent() {
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

        public boolean getLove() {
            return this.love_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLove(boolean z) {
            this.love_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLove() {
            this.love_ = false;
        }

        public static MineNetRadioLoveEvent parseFrom(ByteBuffer byteBuffer) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MineNetRadioLoveEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MineNetRadioLoveEvent parseFrom(ByteString byteString) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MineNetRadioLoveEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MineNetRadioLoveEvent parseFrom(byte[] bArr) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MineNetRadioLoveEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MineNetRadioLoveEvent parseFrom(InputStream inputStream) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineNetRadioLoveEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineNetRadioLoveEvent parseDelimitedFrom(InputStream inputStream) {
            return (MineNetRadioLoveEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MineNetRadioLoveEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MineNetRadioLoveEvent parseFrom(CodedInputStream codedInputStream) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MineNetRadioLoveEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MineNetRadioLoveEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MineNetRadioLoveEvent mineNetRadioLoveEvent) {
            return DEFAULT_INSTANCE.createBuilder(mineNetRadioLoveEvent);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<MineNetRadioLoveEvent, a> implements l {
            private a() {
                super(MineNetRadioLoveEvent.DEFAULT_INSTANCE);
            }

            public a a(long j) {
                copyOnWrite();
                ((MineNetRadioLoveEvent) this.instance).setId(j);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((MineNetRadioLoveEvent) this.instance).setLove(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new MineNetRadioLoveEvent();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"id_", "love_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MineNetRadioLoveEvent> parser = PARSER;
                    if (parser == null) {
                        synchronized (MineNetRadioLoveEvent.class) {
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
            GeneratedMessageLite.registerDefaultInstance(MineNetRadioLoveEvent.class, DEFAULT_INSTANCE);
        }

        public static MineNetRadioLoveEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MineNetRadioLoveEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
