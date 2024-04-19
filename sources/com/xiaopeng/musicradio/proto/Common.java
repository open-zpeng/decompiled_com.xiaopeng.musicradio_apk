package com.xiaopeng.musicradio.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public final class Common {

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
    public static final class StringParam extends GeneratedMessageLite<StringParam, a> implements e {
        private static final StringParam DEFAULT_INSTANCE = new StringParam();
        public static final int PARAM_FIELD_NUMBER = 1;
        private static volatile Parser<StringParam> PARSER;
        private String param_ = "";

        private StringParam() {
        }

        public String getParam() {
            return this.param_;
        }

        public ByteString getParamBytes() {
            return ByteString.copyFromUtf8(this.param_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParam(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.param_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParam() {
            this.param_ = getDefaultInstance().getParam();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParamBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.param_ = byteString.toStringUtf8();
        }

        public static StringParam parseFrom(ByteBuffer byteBuffer) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static StringParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StringParam parseFrom(ByteString byteString) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StringParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StringParam parseFrom(byte[] bArr) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StringParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StringParam parseFrom(InputStream inputStream) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StringParam parseDelimitedFrom(InputStream inputStream) {
            return (StringParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StringParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StringParam parseFrom(CodedInputStream codedInputStream) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StringParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StringParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(StringParam stringParam) {
            return DEFAULT_INSTANCE.createBuilder(stringParam);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<StringParam, a> implements e {
            private a() {
                super(StringParam.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((StringParam) this.instance).setParam(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new StringParam();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"param_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<StringParam> parser = PARSER;
                    if (parser == null) {
                        synchronized (StringParam.class) {
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
            GeneratedMessageLite.registerDefaultInstance(StringParam.class, DEFAULT_INSTANCE);
        }

        public static StringParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<StringParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class IntParam extends GeneratedMessageLite<IntParam, a> implements c {
        private static final IntParam DEFAULT_INSTANCE = new IntParam();
        public static final int PARAM_FIELD_NUMBER = 1;
        private static volatile Parser<IntParam> PARSER;
        private int param_;

        private IntParam() {
        }

        public int getParam() {
            return this.param_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParam(int i) {
            this.param_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParam() {
            this.param_ = 0;
        }

        public static IntParam parseFrom(ByteBuffer byteBuffer) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static IntParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IntParam parseFrom(ByteString byteString) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IntParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IntParam parseFrom(byte[] bArr) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IntParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IntParam parseFrom(InputStream inputStream) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IntParam parseDelimitedFrom(InputStream inputStream) {
            return (IntParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IntParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IntParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IntParam parseFrom(CodedInputStream codedInputStream) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IntParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IntParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(IntParam intParam) {
            return DEFAULT_INSTANCE.createBuilder(intParam);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<IntParam, a> implements c {
            private a() {
                super(IntParam.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((IntParam) this.instance).setParam(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new IntParam();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"param_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<IntParam> parser = PARSER;
                    if (parser == null) {
                        synchronized (IntParam.class) {
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
            GeneratedMessageLite.registerDefaultInstance(IntParam.class, DEFAULT_INSTANCE);
        }

        public static IntParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<IntParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class LongParam extends GeneratedMessageLite<LongParam, a> implements d {
        private static final LongParam DEFAULT_INSTANCE = new LongParam();
        public static final int PARAM_FIELD_NUMBER = 1;
        private static volatile Parser<LongParam> PARSER;
        private long param_;

        private LongParam() {
        }

        public long getParam() {
            return this.param_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParam(long j) {
            this.param_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParam() {
            this.param_ = 0L;
        }

        public static LongParam parseFrom(ByteBuffer byteBuffer) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static LongParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LongParam parseFrom(ByteString byteString) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LongParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LongParam parseFrom(byte[] bArr) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LongParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LongParam parseFrom(InputStream inputStream) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LongParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LongParam parseDelimitedFrom(InputStream inputStream) {
            return (LongParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LongParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LongParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LongParam parseFrom(CodedInputStream codedInputStream) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LongParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LongParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(LongParam longParam) {
            return DEFAULT_INSTANCE.createBuilder(longParam);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<LongParam, a> implements d {
            private a() {
                super(LongParam.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new LongParam();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"param_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<LongParam> parser = PARSER;
                    if (parser == null) {
                        synchronized (LongParam.class) {
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
            GeneratedMessageLite.registerDefaultInstance(LongParam.class, DEFAULT_INSTANCE);
        }

        public static LongParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LongParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class FloatParam extends GeneratedMessageLite<FloatParam, a> implements b {
        private static final FloatParam DEFAULT_INSTANCE = new FloatParam();
        public static final int PARAM_FIELD_NUMBER = 1;
        private static volatile Parser<FloatParam> PARSER;
        private float param_;

        private FloatParam() {
        }

        public float getParam() {
            return this.param_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParam(float f) {
            this.param_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParam() {
            this.param_ = 0.0f;
        }

        public static FloatParam parseFrom(ByteBuffer byteBuffer) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FloatParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FloatParam parseFrom(ByteString byteString) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FloatParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FloatParam parseFrom(byte[] bArr) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FloatParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FloatParam parseFrom(InputStream inputStream) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FloatParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FloatParam parseDelimitedFrom(InputStream inputStream) {
            return (FloatParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FloatParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FloatParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FloatParam parseFrom(CodedInputStream codedInputStream) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FloatParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FloatParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(FloatParam floatParam) {
            return DEFAULT_INSTANCE.createBuilder(floatParam);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<FloatParam, a> implements b {
            private a() {
                super(FloatParam.DEFAULT_INSTANCE);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new FloatParam();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"param_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FloatParam> parser = PARSER;
                    if (parser == null) {
                        synchronized (FloatParam.class) {
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
            GeneratedMessageLite.registerDefaultInstance(FloatParam.class, DEFAULT_INSTANCE);
        }

        public static FloatParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FloatParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BoolParam extends GeneratedMessageLite<BoolParam, a> implements a {
        private static final BoolParam DEFAULT_INSTANCE = new BoolParam();
        public static final int PARAM_FIELD_NUMBER = 1;
        private static volatile Parser<BoolParam> PARSER;
        private boolean param_;

        private BoolParam() {
        }

        public boolean getParam() {
            return this.param_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParam(boolean z) {
            this.param_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParam() {
            this.param_ = false;
        }

        public static BoolParam parseFrom(ByteBuffer byteBuffer) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BoolParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BoolParam parseFrom(ByteString byteString) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BoolParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BoolParam parseFrom(byte[] bArr) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BoolParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BoolParam parseFrom(InputStream inputStream) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BoolParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BoolParam parseDelimitedFrom(InputStream inputStream) {
            return (BoolParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BoolParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoolParam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BoolParam parseFrom(CodedInputStream codedInputStream) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BoolParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BoolParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(BoolParam boolParam) {
            return DEFAULT_INSTANCE.createBuilder(boolParam);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<BoolParam, a> implements a {
            private a() {
                super(BoolParam.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((BoolParam) this.instance).setParam(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BoolParam();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"param_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BoolParam> parser = PARSER;
                    if (parser == null) {
                        synchronized (BoolParam.class) {
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
            GeneratedMessageLite.registerDefaultInstance(BoolParam.class, DEFAULT_INSTANCE);
        }

        public static BoolParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BoolParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
