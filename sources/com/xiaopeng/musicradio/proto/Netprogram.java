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
public final class Netprogram {

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
    public static final class AlbumBean extends GeneratedMessageLite<AlbumBean, a> implements b {
        public static final int ARTIST_FIELD_NUMBER = 12;
        public static final int AUTHORIZED_FIELD_NUMBER = 13;
        public static final int CATEGORYNAME_FIELD_NUMBER = 7;
        private static final AlbumBean DEFAULT_INSTANCE = new AlbumBean();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int INTRO_FIELD_NUMBER = 2;
        public static final int LARGELOGO_FIELD_NUMBER = 5;
        public static final int MEDIUMLOGO_FIELD_NUMBER = 6;
        private static volatile Parser<AlbumBean> PARSER = null;
        public static final int PAYMENTTYPE_FIELD_NUMBER = 8;
        public static final int PLAYCOUNT_FIELD_NUMBER = 9;
        public static final int SHORTINTRO_FIELD_NUMBER = 3;
        public static final int SMALLLOGO_FIELD_NUMBER = 10;
        public static final int TITLE_FIELD_NUMBER = 4;
        public static final int UPDATETIME_FIELD_NUMBER = 11;
        private Artist artist_;
        private boolean authorized_;
        private long id_;
        private int paymentType_;
        private long playCount_;
        private long updateTime_;
        private String intro_ = "";
        private String shortIntro_ = "";
        private String title_ = "";
        private String largeLogo_ = "";
        private String mediumLogo_ = "";
        private String categoryName_ = "";
        private String smallLogo_ = "";

        private AlbumBean() {
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

        public String getIntro() {
            return this.intro_;
        }

        public ByteString getIntroBytes() {
            return ByteString.copyFromUtf8(this.intro_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntro(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.intro_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntro() {
            this.intro_ = getDefaultInstance().getIntro();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntroBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.intro_ = byteString.toStringUtf8();
        }

        public String getShortIntro() {
            return this.shortIntro_;
        }

        public ByteString getShortIntroBytes() {
            return ByteString.copyFromUtf8(this.shortIntro_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortIntro(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.shortIntro_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortIntro() {
            this.shortIntro_ = getDefaultInstance().getShortIntro();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortIntroBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.shortIntro_ = byteString.toStringUtf8();
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

        public String getLargeLogo() {
            return this.largeLogo_;
        }

        public ByteString getLargeLogoBytes() {
            return ByteString.copyFromUtf8(this.largeLogo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLargeLogo(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.largeLogo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLargeLogo() {
            this.largeLogo_ = getDefaultInstance().getLargeLogo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLargeLogoBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.largeLogo_ = byteString.toStringUtf8();
        }

        public String getMediumLogo() {
            return this.mediumLogo_;
        }

        public ByteString getMediumLogoBytes() {
            return ByteString.copyFromUtf8(this.mediumLogo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediumLogo(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.mediumLogo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediumLogo() {
            this.mediumLogo_ = getDefaultInstance().getMediumLogo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediumLogoBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.mediumLogo_ = byteString.toStringUtf8();
        }

        public String getCategoryName() {
            return this.categoryName_;
        }

        public ByteString getCategoryNameBytes() {
            return ByteString.copyFromUtf8(this.categoryName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.categoryName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategoryName() {
            this.categoryName_ = getDefaultInstance().getCategoryName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.categoryName_ = byteString.toStringUtf8();
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

        public long getPlayCount() {
            return this.playCount_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayCount(long j) {
            this.playCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayCount() {
            this.playCount_ = 0L;
        }

        public String getSmallLogo() {
            return this.smallLogo_;
        }

        public ByteString getSmallLogoBytes() {
            return ByteString.copyFromUtf8(this.smallLogo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSmallLogo(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.smallLogo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSmallLogo() {
            this.smallLogo_ = getDefaultInstance().getSmallLogo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSmallLogoBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.smallLogo_ = byteString.toStringUtf8();
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

        public boolean hasArtist() {
            return this.artist_ != null;
        }

        public Artist getArtist() {
            Artist artist = this.artist_;
            return artist == null ? Artist.getDefaultInstance() : artist;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtist(Artist artist) {
            if (artist == null) {
                throw new NullPointerException();
            }
            this.artist_ = artist;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtist(Artist.a aVar) {
            this.artist_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeArtist(Artist artist) {
            if (artist == null) {
                throw new NullPointerException();
            }
            Artist artist2 = this.artist_;
            if (artist2 != null && artist2 != Artist.getDefaultInstance()) {
                this.artist_ = Artist.newBuilder(this.artist_).mergeFrom((Artist.a) artist).buildPartial();
            } else {
                this.artist_ = artist;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArtist() {
            this.artist_ = null;
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

        public static AlbumBean parseFrom(ByteBuffer byteBuffer) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AlbumBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AlbumBean parseFrom(ByteString byteString) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AlbumBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AlbumBean parseFrom(byte[] bArr) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AlbumBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AlbumBean parseFrom(InputStream inputStream) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AlbumBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AlbumBean parseDelimitedFrom(InputStream inputStream) {
            return (AlbumBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AlbumBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AlbumBean parseFrom(CodedInputStream codedInputStream) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AlbumBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(AlbumBean albumBean) {
            return DEFAULT_INSTANCE.createBuilder(albumBean);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<AlbumBean, a> implements b {
            private a() {
                super(AlbumBean.DEFAULT_INSTANCE);
            }

            public a a(long j) {
                copyOnWrite();
                ((AlbumBean) this.instance).setId(j);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((AlbumBean) this.instance).setIntro(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((AlbumBean) this.instance).setShortIntro(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((AlbumBean) this.instance).setTitle(str);
                return this;
            }

            public a d(String str) {
                copyOnWrite();
                ((AlbumBean) this.instance).setLargeLogo(str);
                return this;
            }

            public a e(String str) {
                copyOnWrite();
                ((AlbumBean) this.instance).setMediumLogo(str);
                return this;
            }

            public a f(String str) {
                copyOnWrite();
                ((AlbumBean) this.instance).setCategoryName(str);
                return this;
            }

            public a a(int i) {
                copyOnWrite();
                ((AlbumBean) this.instance).setPaymentType(i);
                return this;
            }

            public a b(long j) {
                copyOnWrite();
                ((AlbumBean) this.instance).setPlayCount(j);
                return this;
            }

            public a g(String str) {
                copyOnWrite();
                ((AlbumBean) this.instance).setSmallLogo(str);
                return this;
            }

            public a c(long j) {
                copyOnWrite();
                ((AlbumBean) this.instance).setUpdateTime(j);
                return this;
            }

            public a a(Artist artist) {
                copyOnWrite();
                ((AlbumBean) this.instance).setArtist(artist);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((AlbumBean) this.instance).setAuthorized(z);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new AlbumBean();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\u0002\nȈ\u000b\u0002\f\t\r\u0007", new Object[]{"id_", "intro_", "shortIntro_", "title_", "largeLogo_", "mediumLogo_", "categoryName_", "paymentType_", "playCount_", "smallLogo_", "updateTime_", "artist_", "authorized_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<AlbumBean> parser = PARSER;
                    if (parser == null) {
                        synchronized (AlbumBean.class) {
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
            GeneratedMessageLite.registerDefaultInstance(AlbumBean.class, DEFAULT_INSTANCE);
        }

        public static AlbumBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AlbumBean> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Artist extends GeneratedMessageLite<Artist, a> implements c {
        private static final Artist DEFAULT_INSTANCE = new Artist();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Artist> PARSER;
        private long id_;
        private String name_ = "";

        private Artist() {
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

        public static Artist parseFrom(ByteBuffer byteBuffer) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Artist parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Artist parseFrom(ByteString byteString) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Artist parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Artist parseFrom(byte[] bArr) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Artist parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Artist parseFrom(InputStream inputStream) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Artist parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Artist parseDelimitedFrom(InputStream inputStream) {
            return (Artist) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Artist parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Artist) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Artist parseFrom(CodedInputStream codedInputStream) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Artist parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Artist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(Artist artist) {
            return DEFAULT_INSTANCE.createBuilder(artist);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Artist, a> implements c {
            private a() {
                super(Artist.DEFAULT_INSTANCE);
            }

            public a a(long j) {
                copyOnWrite();
                ((Artist) this.instance).setId(j);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((Artist) this.instance).setName(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Artist();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"id_", "name_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Artist> parser = PARSER;
                    if (parser == null) {
                        synchronized (Artist.class) {
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
            GeneratedMessageLite.registerDefaultInstance(Artist.class, DEFAULT_INSTANCE);
        }

        public static Artist getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Artist> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RdTrackBean extends GeneratedMessageLite<RdTrackBean, a> implements r {
        public static final int AUTHORIZED_FIELD_NUMBER = 7;
        public static final int BEFOREDATESTR_FIELD_NUMBER = 8;
        public static final int CREATETIME_FIELD_NUMBER = 2;
        private static final RdTrackBean DEFAULT_INSTANCE = new RdTrackBean();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ORDERNUM_FIELD_NUMBER = 3;
        private static volatile Parser<RdTrackBean> PARSER = null;
        public static final int PAYMENTTYPE_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 4;
        public static final int UPDATETIME_FIELD_NUMBER = 5;
        private boolean authorized_;
        private long createTime_;
        private int id_;
        private int orderNum_;
        private int paymentType_;
        private long updateTime_;
        private String title_ = "";
        private String beforeDateStr_ = "";

        private RdTrackBean() {
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

        public String getBeforeDateStr() {
            return this.beforeDateStr_;
        }

        public ByteString getBeforeDateStrBytes() {
            return ByteString.copyFromUtf8(this.beforeDateStr_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeforeDateStr(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.beforeDateStr_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeforeDateStr() {
            this.beforeDateStr_ = getDefaultInstance().getBeforeDateStr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeforeDateStrBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.beforeDateStr_ = byteString.toStringUtf8();
        }

        public static RdTrackBean parseFrom(ByteBuffer byteBuffer) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RdTrackBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RdTrackBean parseFrom(ByteString byteString) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RdTrackBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RdTrackBean parseFrom(byte[] bArr) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RdTrackBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RdTrackBean parseFrom(InputStream inputStream) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RdTrackBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RdTrackBean parseDelimitedFrom(InputStream inputStream) {
            return (RdTrackBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RdTrackBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RdTrackBean parseFrom(CodedInputStream codedInputStream) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RdTrackBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RdTrackBean rdTrackBean) {
            return DEFAULT_INSTANCE.createBuilder(rdTrackBean);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RdTrackBean, a> implements r {
            private a() {
                super(RdTrackBean.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((RdTrackBean) this.instance).setId(i);
                return this;
            }

            public a a(long j) {
                copyOnWrite();
                ((RdTrackBean) this.instance).setCreateTime(j);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((RdTrackBean) this.instance).setOrderNum(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((RdTrackBean) this.instance).setTitle(str);
                return this;
            }

            public a b(long j) {
                copyOnWrite();
                ((RdTrackBean) this.instance).setUpdateTime(j);
                return this;
            }

            public a c(int i) {
                copyOnWrite();
                ((RdTrackBean) this.instance).setPaymentType(i);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((RdTrackBean) this.instance).setAuthorized(z);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((RdTrackBean) this.instance).setBeforeDateStr(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RdTrackBean();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0004\u0004Ȉ\u0005\u0002\u0006\u0004\u0007\u0007\bȈ", new Object[]{"id_", "createTime_", "orderNum_", "title_", "updateTime_", "paymentType_", "authorized_", "beforeDateStr_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RdTrackBean> parser = PARSER;
                    if (parser == null) {
                        synchronized (RdTrackBean.class) {
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
            GeneratedMessageLite.registerDefaultInstance(RdTrackBean.class, DEFAULT_INSTANCE);
        }

        public static RdTrackBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RdTrackBean> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RankBean extends GeneratedMessageLite<RankBean, a> implements p {
        public static final int ALBUMLIST_FIELD_NUMBER = 3;
        private static final RankBean DEFAULT_INSTANCE = new RankBean();
        private static volatile Parser<RankBean> PARSER = null;
        public static final int RANKID_FIELD_NUMBER = 1;
        public static final int RANKNAME_FIELD_NUMBER = 2;
        private int rankId_;
        private String rankName_ = "";
        private Internal.ProtobufList<AlbumBean> albumList_ = emptyProtobufList();

        private RankBean() {
        }

        public int getRankId() {
            return this.rankId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankId(int i) {
            this.rankId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRankId() {
            this.rankId_ = 0;
        }

        public String getRankName() {
            return this.rankName_;
        }

        public ByteString getRankNameBytes() {
            return ByteString.copyFromUtf8(this.rankName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.rankName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRankName() {
            this.rankName_ = getDefaultInstance().getRankName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.rankName_ = byteString.toStringUtf8();
        }

        public List<AlbumBean> getAlbumListList() {
            return this.albumList_;
        }

        public List<? extends b> getAlbumListOrBuilderList() {
            return this.albumList_;
        }

        public int getAlbumListCount() {
            return this.albumList_.size();
        }

        public AlbumBean getAlbumList(int i) {
            return this.albumList_.get(i);
        }

        public b getAlbumListOrBuilder(int i) {
            return this.albumList_.get(i);
        }

        private void ensureAlbumListIsMutable() {
            if (this.albumList_.isModifiable()) {
                return;
            }
            this.albumList_ = GeneratedMessageLite.mutableCopy(this.albumList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumList(int i, AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.set(i, albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumList(int i, AlbumBean.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.add(albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(int i, AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.add(i, albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(AlbumBean.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(int i, AlbumBean.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAlbumList(Iterable<? extends AlbumBean> iterable) {
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

        public static RankBean parseFrom(ByteBuffer byteBuffer) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RankBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RankBean parseFrom(ByteString byteString) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RankBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RankBean parseFrom(byte[] bArr) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RankBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RankBean parseFrom(InputStream inputStream) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RankBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RankBean parseDelimitedFrom(InputStream inputStream) {
            return (RankBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RankBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RankBean parseFrom(CodedInputStream codedInputStream) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RankBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RankBean rankBean) {
            return DEFAULT_INSTANCE.createBuilder(rankBean);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RankBean, a> implements p {
            private a() {
                super(RankBean.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((RankBean) this.instance).setRankId(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((RankBean) this.instance).setRankName(str);
                return this;
            }

            public a a(AlbumBean albumBean) {
                copyOnWrite();
                ((RankBean) this.instance).addAlbumList(albumBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RankBean();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"rankId_", "rankName_", "albumList_", AlbumBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RankBean> parser = PARSER;
                    if (parser == null) {
                        synchronized (RankBean.class) {
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
            GeneratedMessageLite.registerDefaultInstance(RankBean.class, DEFAULT_INSTANCE);
        }

        public static RankBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RankBean> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class HistoryInfo extends GeneratedMessageLite<HistoryInfo, a> implements l {
        public static final int ALBUMID_FIELD_NUMBER = 1;
        public static final int ALBUMNAME_FIELD_NUMBER = 2;
        public static final int ARTISTID_FIELD_NUMBER = 3;
        public static final int ARTIST_FIELD_NUMBER = 4;
        public static final int AUTHORIZED_FIELD_NUMBER = 15;
        public static final int CATEGORYNAME_FIELD_NUMBER = 13;
        private static final HistoryInfo DEFAULT_INSTANCE = new HistoryInfo();
        public static final int INTRO_FIELD_NUMBER = 11;
        public static final int LARGELOGO_FIELD_NUMBER = 6;
        public static final int LOGO_FIELD_NUMBER = 5;
        public static final int MEDIUMLOGO_FIELD_NUMBER = 7;
        private static volatile Parser<HistoryInfo> PARSER = null;
        public static final int PAYMENTTYPE_FIELD_NUMBER = 14;
        public static final int PLAYCOUNT_FIELD_NUMBER = 12;
        public static final int PLAYINGPERCENT_FIELD_NUMBER = 16;
        public static final int SHORTINTRO_FIELD_NUMBER = 10;
        public static final int TRACKPAYMENTTYPE_FIELD_NUMBER = 17;
        public static final int TRACKTITLE_FIELD_NUMBER = 8;
        public static final int UPDATETIME_FIELD_NUMBER = 9;
        private long albumId_;
        private long artistId_;
        private boolean authorized_;
        private int paymentType_;
        private long playCount_;
        private int trackPaymentType_;
        private long updateTime_;
        private String albumName_ = "";
        private String artist_ = "";
        private String logo_ = "";
        private String largeLogo_ = "";
        private String mediumLogo_ = "";
        private String trackTitle_ = "";
        private String shortIntro_ = "";
        private String intro_ = "";
        private String categoryName_ = "";
        private String playingPercent_ = "";

        private HistoryInfo() {
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

        public String getArtist() {
            return this.artist_;
        }

        public ByteString getArtistBytes() {
            return ByteString.copyFromUtf8(this.artist_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtist(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.artist_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArtist() {
            this.artist_ = getDefaultInstance().getArtist();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtistBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.artist_ = byteString.toStringUtf8();
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

        public String getLargeLogo() {
            return this.largeLogo_;
        }

        public ByteString getLargeLogoBytes() {
            return ByteString.copyFromUtf8(this.largeLogo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLargeLogo(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.largeLogo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLargeLogo() {
            this.largeLogo_ = getDefaultInstance().getLargeLogo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLargeLogoBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.largeLogo_ = byteString.toStringUtf8();
        }

        public String getMediumLogo() {
            return this.mediumLogo_;
        }

        public ByteString getMediumLogoBytes() {
            return ByteString.copyFromUtf8(this.mediumLogo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediumLogo(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.mediumLogo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediumLogo() {
            this.mediumLogo_ = getDefaultInstance().getMediumLogo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediumLogoBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.mediumLogo_ = byteString.toStringUtf8();
        }

        public String getTrackTitle() {
            return this.trackTitle_;
        }

        public ByteString getTrackTitleBytes() {
            return ByteString.copyFromUtf8(this.trackTitle_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackTitle(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.trackTitle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackTitle() {
            this.trackTitle_ = getDefaultInstance().getTrackTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackTitleBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.trackTitle_ = byteString.toStringUtf8();
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

        public String getShortIntro() {
            return this.shortIntro_;
        }

        public ByteString getShortIntroBytes() {
            return ByteString.copyFromUtf8(this.shortIntro_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortIntro(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.shortIntro_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortIntro() {
            this.shortIntro_ = getDefaultInstance().getShortIntro();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortIntroBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.shortIntro_ = byteString.toStringUtf8();
        }

        public String getIntro() {
            return this.intro_;
        }

        public ByteString getIntroBytes() {
            return ByteString.copyFromUtf8(this.intro_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntro(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.intro_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntro() {
            this.intro_ = getDefaultInstance().getIntro();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntroBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.intro_ = byteString.toStringUtf8();
        }

        public long getPlayCount() {
            return this.playCount_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayCount(long j) {
            this.playCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayCount() {
            this.playCount_ = 0L;
        }

        public String getCategoryName() {
            return this.categoryName_;
        }

        public ByteString getCategoryNameBytes() {
            return ByteString.copyFromUtf8(this.categoryName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryName(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.categoryName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategoryName() {
            this.categoryName_ = getDefaultInstance().getCategoryName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryNameBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.categoryName_ = byteString.toStringUtf8();
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

        public String getPlayingPercent() {
            return this.playingPercent_;
        }

        public ByteString getPlayingPercentBytes() {
            return ByteString.copyFromUtf8(this.playingPercent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayingPercent(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.playingPercent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlayingPercent() {
            this.playingPercent_ = getDefaultInstance().getPlayingPercent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlayingPercentBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.playingPercent_ = byteString.toStringUtf8();
        }

        public int getTrackPaymentType() {
            return this.trackPaymentType_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackPaymentType(int i) {
            this.trackPaymentType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackPaymentType() {
            this.trackPaymentType_ = 0;
        }

        public static HistoryInfo parseFrom(ByteBuffer byteBuffer) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HistoryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HistoryInfo parseFrom(ByteString byteString) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HistoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HistoryInfo parseFrom(byte[] bArr) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HistoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HistoryInfo parseFrom(InputStream inputStream) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryInfo parseDelimitedFrom(InputStream inputStream) {
            return (HistoryInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryInfo parseFrom(CodedInputStream codedInputStream) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HistoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(HistoryInfo historyInfo) {
            return DEFAULT_INSTANCE.createBuilder(historyInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<HistoryInfo, a> implements l {
            private a() {
                super(HistoryInfo.DEFAULT_INSTANCE);
            }

            public a a(long j) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setAlbumId(j);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setAlbumName(str);
                return this;
            }

            public a b(long j) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setArtistId(j);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setArtist(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setLogo(str);
                return this;
            }

            public a d(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setLargeLogo(str);
                return this;
            }

            public a e(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setMediumLogo(str);
                return this;
            }

            public a f(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setTrackTitle(str);
                return this;
            }

            public a c(long j) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setUpdateTime(j);
                return this;
            }

            public a g(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setShortIntro(str);
                return this;
            }

            public a h(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setIntro(str);
                return this;
            }

            public a d(long j) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setPlayCount(j);
                return this;
            }

            public a i(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setCategoryName(str);
                return this;
            }

            public a a(int i) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setPaymentType(i);
                return this;
            }

            public a a(boolean z) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setAuthorized(z);
                return this;
            }

            public a j(String str) {
                copyOnWrite();
                ((HistoryInfo) this.instance).setPlayingPercent(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new HistoryInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\u0002\nȈ\u000bȈ\f\u0002\rȈ\u000e\u0004\u000f\u0007\u0010Ȉ\u0011\u0004", new Object[]{"albumId_", "albumName_", "artistId_", "artist_", "logo_", "largeLogo_", "mediumLogo_", "trackTitle_", "updateTime_", "shortIntro_", "intro_", "playCount_", "categoryName_", "paymentType_", "authorized_", "playingPercent_", "trackPaymentType_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<HistoryInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (HistoryInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(HistoryInfo.class, DEFAULT_INSTANCE);
        }

        public static HistoryInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<HistoryInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BannelHistoryInfo extends GeneratedMessageLite<BannelHistoryInfo, a> implements e {
        private static final BannelHistoryInfo DEFAULT_INSTANCE = new BannelHistoryInfo();
        public static final int LOGO_FIELD_NUMBER = 3;
        private static volatile Parser<BannelHistoryInfo> PARSER = null;
        public static final int PERCENT_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String percent_ = "";
        private String logo_ = "";

        private BannelHistoryInfo() {
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

        public String getPercent() {
            return this.percent_;
        }

        public ByteString getPercentBytes() {
            return ByteString.copyFromUtf8(this.percent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPercent(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.percent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPercent() {
            this.percent_ = getDefaultInstance().getPercent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPercentBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.percent_ = byteString.toStringUtf8();
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

        public static BannelHistoryInfo parseFrom(ByteBuffer byteBuffer) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BannelHistoryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BannelHistoryInfo parseFrom(ByteString byteString) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BannelHistoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BannelHistoryInfo parseFrom(byte[] bArr) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BannelHistoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BannelHistoryInfo parseFrom(InputStream inputStream) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannelHistoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannelHistoryInfo parseDelimitedFrom(InputStream inputStream) {
            return (BannelHistoryInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannelHistoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannelHistoryInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannelHistoryInfo parseFrom(CodedInputStream codedInputStream) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BannelHistoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannelHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(BannelHistoryInfo bannelHistoryInfo) {
            return DEFAULT_INSTANCE.createBuilder(bannelHistoryInfo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<BannelHistoryInfo, a> implements e {
            private a() {
                super(BannelHistoryInfo.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((BannelHistoryInfo) this.instance).setTitle(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((BannelHistoryInfo) this.instance).setPercent(str);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((BannelHistoryInfo) this.instance).setLogo(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BannelHistoryInfo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "percent_", "logo_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BannelHistoryInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (BannelHistoryInfo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(BannelHistoryInfo.class, DEFAULT_INSTANCE);
        }

        public static BannelHistoryInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BannelHistoryInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BannerDataBean extends GeneratedMessageLite<BannerDataBean, a> implements g {
        public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 3;
        public static final int CHANNELID_FIELD_NUMBER = 1;
        public static final int COVERURL_FIELD_NUMBER = 2;
        private static final BannerDataBean DEFAULT_INSTANCE = new BannerDataBean();
        private static volatile Parser<BannerDataBean> PARSER = null;
        public static final int RELATIVEID_FIELD_NUMBER = 5;
        public static final int TOTAL_FIELD_NUMBER = 6;
        public static final int TRACKINFOBOLIST_FIELD_NUMBER = 4;
        private BackgroundColor backgroundColor_;
        private int channelId_;
        private int total_;
        private String coverUrl_ = "";
        private Internal.ProtobufList<TrackInfoBo> trackInfoBoList_ = emptyProtobufList();
        private String relativeId_ = "";

        private BannerDataBean() {
        }

        public int getChannelId() {
            return this.channelId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelId(int i) {
            this.channelId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannelId() {
            this.channelId_ = 0;
        }

        public String getCoverUrl() {
            return this.coverUrl_;
        }

        public ByteString getCoverUrlBytes() {
            return ByteString.copyFromUtf8(this.coverUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverUrl(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.coverUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoverUrl() {
            this.coverUrl_ = getDefaultInstance().getCoverUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoverUrlBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.coverUrl_ = byteString.toStringUtf8();
        }

        public boolean hasBackgroundColor() {
            return this.backgroundColor_ != null;
        }

        public BackgroundColor getBackgroundColor() {
            BackgroundColor backgroundColor = this.backgroundColor_;
            return backgroundColor == null ? BackgroundColor.getDefaultInstance() : backgroundColor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColor(BackgroundColor backgroundColor) {
            if (backgroundColor == null) {
                throw new NullPointerException();
            }
            this.backgroundColor_ = backgroundColor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColor(BackgroundColor.a aVar) {
            this.backgroundColor_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBackgroundColor(BackgroundColor backgroundColor) {
            if (backgroundColor == null) {
                throw new NullPointerException();
            }
            BackgroundColor backgroundColor2 = this.backgroundColor_;
            if (backgroundColor2 != null && backgroundColor2 != BackgroundColor.getDefaultInstance()) {
                this.backgroundColor_ = BackgroundColor.newBuilder(this.backgroundColor_).mergeFrom((BackgroundColor.a) backgroundColor).buildPartial();
            } else {
                this.backgroundColor_ = backgroundColor;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundColor() {
            this.backgroundColor_ = null;
        }

        public List<TrackInfoBo> getTrackInfoBoListList() {
            return this.trackInfoBoList_;
        }

        public List<? extends s> getTrackInfoBoListOrBuilderList() {
            return this.trackInfoBoList_;
        }

        public int getTrackInfoBoListCount() {
            return this.trackInfoBoList_.size();
        }

        public TrackInfoBo getTrackInfoBoList(int i) {
            return this.trackInfoBoList_.get(i);
        }

        public s getTrackInfoBoListOrBuilder(int i) {
            return this.trackInfoBoList_.get(i);
        }

        private void ensureTrackInfoBoListIsMutable() {
            if (this.trackInfoBoList_.isModifiable()) {
                return;
            }
            this.trackInfoBoList_ = GeneratedMessageLite.mutableCopy(this.trackInfoBoList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackInfoBoList(int i, TrackInfoBo trackInfoBo) {
            if (trackInfoBo == null) {
                throw new NullPointerException();
            }
            ensureTrackInfoBoListIsMutable();
            this.trackInfoBoList_.set(i, trackInfoBo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackInfoBoList(int i, TrackInfoBo.a aVar) {
            ensureTrackInfoBoListIsMutable();
            this.trackInfoBoList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrackInfoBoList(TrackInfoBo trackInfoBo) {
            if (trackInfoBo == null) {
                throw new NullPointerException();
            }
            ensureTrackInfoBoListIsMutable();
            this.trackInfoBoList_.add(trackInfoBo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrackInfoBoList(int i, TrackInfoBo trackInfoBo) {
            if (trackInfoBo == null) {
                throw new NullPointerException();
            }
            ensureTrackInfoBoListIsMutable();
            this.trackInfoBoList_.add(i, trackInfoBo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrackInfoBoList(TrackInfoBo.a aVar) {
            ensureTrackInfoBoListIsMutable();
            this.trackInfoBoList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTrackInfoBoList(int i, TrackInfoBo.a aVar) {
            ensureTrackInfoBoListIsMutable();
            this.trackInfoBoList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTrackInfoBoList(Iterable<? extends TrackInfoBo> iterable) {
            ensureTrackInfoBoListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.trackInfoBoList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackInfoBoList() {
            this.trackInfoBoList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTrackInfoBoList(int i) {
            ensureTrackInfoBoListIsMutable();
            this.trackInfoBoList_.remove(i);
        }

        public String getRelativeId() {
            return this.relativeId_;
        }

        public ByteString getRelativeIdBytes() {
            return ByteString.copyFromUtf8(this.relativeId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelativeId(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.relativeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRelativeId() {
            this.relativeId_ = getDefaultInstance().getRelativeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelativeIdBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.relativeId_ = byteString.toStringUtf8();
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

        public static BannerDataBean parseFrom(ByteBuffer byteBuffer) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BannerDataBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BannerDataBean parseFrom(ByteString byteString) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BannerDataBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BannerDataBean parseFrom(byte[] bArr) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BannerDataBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BannerDataBean parseFrom(InputStream inputStream) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerDataBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannerDataBean parseDelimitedFrom(InputStream inputStream) {
            return (BannerDataBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerDataBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannerDataBean parseFrom(CodedInputStream codedInputStream) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BannerDataBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(BannerDataBean bannerDataBean) {
            return DEFAULT_INSTANCE.createBuilder(bannerDataBean);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<BannerDataBean, a> implements g {
            private a() {
                super(BannerDataBean.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((BannerDataBean) this.instance).setChannelId(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((BannerDataBean) this.instance).setCoverUrl(str);
                return this;
            }

            public a a(BackgroundColor backgroundColor) {
                copyOnWrite();
                ((BannerDataBean) this.instance).setBackgroundColor(backgroundColor);
                return this;
            }

            public a a(TrackInfoBo trackInfoBo) {
                copyOnWrite();
                ((BannerDataBean) this.instance).addTrackInfoBoList(trackInfoBo);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((BannerDataBean) this.instance).setRelativeId(str);
                return this;
            }

            public a b(int i) {
                copyOnWrite();
                ((BannerDataBean) this.instance).setTotal(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BannerDataBean();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\t\u0004\u001b\u0005Ȉ\u0006\u0004", new Object[]{"channelId_", "coverUrl_", "backgroundColor_", "trackInfoBoList_", TrackInfoBo.class, "relativeId_", "total_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BannerDataBean> parser = PARSER;
                    if (parser == null) {
                        synchronized (BannerDataBean.class) {
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
            GeneratedMessageLite.registerDefaultInstance(BannerDataBean.class, DEFAULT_INSTANCE);
        }

        public static BannerDataBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BannerDataBean> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BackgroundColor extends GeneratedMessageLite<BackgroundColor, a> implements d {
        private static final BackgroundColor DEFAULT_INSTANCE = new BackgroundColor();
        private static volatile Parser<BackgroundColor> PARSER = null;
        public static final int STARTCOLORDAYTIME_FIELD_NUMBER = 1;
        private String startColorDaytime_ = "";

        private BackgroundColor() {
        }

        public String getStartColorDaytime() {
            return this.startColorDaytime_;
        }

        public ByteString getStartColorDaytimeBytes() {
            return ByteString.copyFromUtf8(this.startColorDaytime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColorDaytime(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.startColorDaytime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartColorDaytime() {
            this.startColorDaytime_ = getDefaultInstance().getStartColorDaytime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartColorDaytimeBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.startColorDaytime_ = byteString.toStringUtf8();
        }

        public static BackgroundColor parseFrom(ByteBuffer byteBuffer) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BackgroundColor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BackgroundColor parseFrom(ByteString byteString) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BackgroundColor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BackgroundColor parseFrom(byte[] bArr) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BackgroundColor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BackgroundColor parseFrom(InputStream inputStream) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BackgroundColor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BackgroundColor parseDelimitedFrom(InputStream inputStream) {
            return (BackgroundColor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BackgroundColor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BackgroundColor) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BackgroundColor parseFrom(CodedInputStream codedInputStream) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BackgroundColor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BackgroundColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(BackgroundColor backgroundColor) {
            return DEFAULT_INSTANCE.createBuilder(backgroundColor);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<BackgroundColor, a> implements d {
            private a() {
                super(BackgroundColor.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((BackgroundColor) this.instance).setStartColorDaytime(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BackgroundColor();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"startColorDaytime_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BackgroundColor> parser = PARSER;
                    if (parser == null) {
                        synchronized (BackgroundColor.class) {
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
            GeneratedMessageLite.registerDefaultInstance(BackgroundColor.class, DEFAULT_INSTANCE);
        }

        public static BackgroundColor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BackgroundColor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class TrackInfoBo extends GeneratedMessageLite<TrackInfoBo, a> implements s {
        private static final TrackInfoBo DEFAULT_INSTANCE = new TrackInfoBo();
        private static volatile Parser<TrackInfoBo> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";

        private TrackInfoBo() {
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

        public static TrackInfoBo parseFrom(ByteBuffer byteBuffer) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TrackInfoBo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TrackInfoBo parseFrom(ByteString byteString) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TrackInfoBo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TrackInfoBo parseFrom(byte[] bArr) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TrackInfoBo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TrackInfoBo parseFrom(InputStream inputStream) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TrackInfoBo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TrackInfoBo parseDelimitedFrom(InputStream inputStream) {
            return (TrackInfoBo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TrackInfoBo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackInfoBo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TrackInfoBo parseFrom(CodedInputStream codedInputStream) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TrackInfoBo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackInfoBo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(TrackInfoBo trackInfoBo) {
            return DEFAULT_INSTANCE.createBuilder(trackInfoBo);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<TrackInfoBo, a> implements s {
            private a() {
                super(TrackInfoBo.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((TrackInfoBo) this.instance).setTitle(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new TrackInfoBo();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"title_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TrackInfoBo> parser = PARSER;
                    if (parser == null) {
                        synchronized (TrackInfoBo.class) {
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
            GeneratedMessageLite.registerDefaultInstance(TrackInfoBo.class, DEFAULT_INSTANCE);
        }

        public static TrackInfoBo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TrackInfoBo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class CategoryBean extends GeneratedMessageLite<CategoryBean, a> implements i {
        private static final CategoryBean DEFAULT_INSTANCE = new CategoryBean();
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LOGO_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile Parser<CategoryBean> PARSER;
        private int id_;
        private String logo_ = "";
        private String name_ = "";

        private CategoryBean() {
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

        public static CategoryBean parseFrom(ByteBuffer byteBuffer) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CategoryBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CategoryBean parseFrom(ByteString byteString) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CategoryBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CategoryBean parseFrom(byte[] bArr) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CategoryBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CategoryBean parseFrom(InputStream inputStream) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CategoryBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CategoryBean parseDelimitedFrom(InputStream inputStream) {
            return (CategoryBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CategoryBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CategoryBean parseFrom(CodedInputStream codedInputStream) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CategoryBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(CategoryBean categoryBean) {
            return DEFAULT_INSTANCE.createBuilder(categoryBean);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<CategoryBean, a> implements i {
            private a() {
                super(CategoryBean.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((CategoryBean) this.instance).setId(i);
                return this;
            }

            public a a(String str) {
                copyOnWrite();
                ((CategoryBean) this.instance).setLogo(str);
                return this;
            }

            public a b(String str) {
                copyOnWrite();
                ((CategoryBean) this.instance).setName(str);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new CategoryBean();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ", new Object[]{"id_", "logo_", "name_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CategoryBean> parser = PARSER;
                    if (parser == null) {
                        synchronized (CategoryBean.class) {
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
            GeneratedMessageLite.registerDefaultInstance(CategoryBean.class, DEFAULT_INSTANCE);
        }

        public static CategoryBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CategoryBean> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Page extends GeneratedMessageLite<Page, a> implements n {
        public static final int CURPAGE_FIELD_NUMBER = 2;
        private static final Page DEFAULT_INSTANCE = new Page();
        public static final int PAGE_FIELD_NUMBER = 1;
        private static volatile Parser<Page> PARSER;
        private int curPage_;
        private String page_ = "";

        private Page() {
        }

        public String getPage() {
            return this.page_;
        }

        public ByteString getPageBytes() {
            return ByteString.copyFromUtf8(this.page_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPage(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.page_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPage() {
            this.page_ = getDefaultInstance().getPage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageBytes(ByteString byteString) {
            if (byteString == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(byteString);
            this.page_ = byteString.toStringUtf8();
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

        public static Page parseFrom(ByteBuffer byteBuffer) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Page parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Page parseFrom(ByteString byteString) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Page parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Page parseFrom(byte[] bArr) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Page parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Page parseFrom(InputStream inputStream) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Page parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Page parseDelimitedFrom(InputStream inputStream) {
            return (Page) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Page parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Page) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Page parseFrom(CodedInputStream codedInputStream) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Page parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(Page page) {
            return DEFAULT_INSTANCE.createBuilder(page);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<Page, a> implements n {
            private a() {
                super(Page.DEFAULT_INSTANCE);
            }

            public a a(String str) {
                copyOnWrite();
                ((Page) this.instance).setPage(str);
                return this;
            }

            public a a(int i) {
                copyOnWrite();
                ((Page) this.instance).setCurPage(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new Page();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"page_", "curPage_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Page> parser = PARSER;
                    if (parser == null) {
                        synchronized (Page.class) {
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
            GeneratedMessageLite.registerDefaultInstance(Page.class, DEFAULT_INSTANCE);
        }

        public static Page getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Page> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class HistoryInfoBean extends GeneratedMessageLite<HistoryInfoBean, a> implements j {
        private static final HistoryInfoBean DEFAULT_INSTANCE = new HistoryInfoBean();
        public static final int HISTORYINFO_FIELD_NUMBER = 2;
        public static final int ISLOVE_FIELD_NUMBER = 1;
        private static volatile Parser<HistoryInfoBean> PARSER;
        private HistoryInfo historyInfo_;
        private boolean isLove_;

        private HistoryInfoBean() {
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

        public boolean hasHistoryInfo() {
            return this.historyInfo_ != null;
        }

        public HistoryInfo getHistoryInfo() {
            HistoryInfo historyInfo = this.historyInfo_;
            return historyInfo == null ? HistoryInfo.getDefaultInstance() : historyInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistoryInfo(HistoryInfo historyInfo) {
            if (historyInfo == null) {
                throw new NullPointerException();
            }
            this.historyInfo_ = historyInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistoryInfo(HistoryInfo.a aVar) {
            this.historyInfo_ = aVar.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHistoryInfo(HistoryInfo historyInfo) {
            if (historyInfo == null) {
                throw new NullPointerException();
            }
            HistoryInfo historyInfo2 = this.historyInfo_;
            if (historyInfo2 != null && historyInfo2 != HistoryInfo.getDefaultInstance()) {
                this.historyInfo_ = HistoryInfo.newBuilder(this.historyInfo_).mergeFrom((HistoryInfo.a) historyInfo).buildPartial();
            } else {
                this.historyInfo_ = historyInfo;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHistoryInfo() {
            this.historyInfo_ = null;
        }

        public static HistoryInfoBean parseFrom(ByteBuffer byteBuffer) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HistoryInfoBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HistoryInfoBean parseFrom(ByteString byteString) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HistoryInfoBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HistoryInfoBean parseFrom(byte[] bArr) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HistoryInfoBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HistoryInfoBean parseFrom(InputStream inputStream) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryInfoBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryInfoBean parseDelimitedFrom(InputStream inputStream) {
            return (HistoryInfoBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryInfoBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoBean) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryInfoBean parseFrom(CodedInputStream codedInputStream) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HistoryInfoBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(HistoryInfoBean historyInfoBean) {
            return DEFAULT_INSTANCE.createBuilder(historyInfoBean);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<HistoryInfoBean, a> implements j {
            private a() {
                super(HistoryInfoBean.DEFAULT_INSTANCE);
            }

            public a a(boolean z) {
                copyOnWrite();
                ((HistoryInfoBean) this.instance).setIsLove(z);
                return this;
            }

            public a a(HistoryInfo historyInfo) {
                copyOnWrite();
                ((HistoryInfoBean) this.instance).setHistoryInfo(historyInfo);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new HistoryInfoBean();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\t", new Object[]{"isLove_", "historyInfo_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<HistoryInfoBean> parser = PARSER;
                    if (parser == null) {
                        synchronized (HistoryInfoBean.class) {
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
            GeneratedMessageLite.registerDefaultInstance(HistoryInfoBean.class, DEFAULT_INSTANCE);
        }

        public static HistoryInfoBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<HistoryInfoBean> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class AlbumBeanList extends GeneratedMessageLite<AlbumBeanList, a> implements a {
        public static final int ALBUMLIST_FIELD_NUMBER = 2;
        private static final AlbumBeanList DEFAULT_INSTANCE = new AlbumBeanList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<AlbumBeanList> PARSER;
        private Internal.ProtobufList<AlbumBean> albumList_ = emptyProtobufList();
        private int errorCode_;

        private AlbumBeanList() {
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

        public List<AlbumBean> getAlbumListList() {
            return this.albumList_;
        }

        public List<? extends b> getAlbumListOrBuilderList() {
            return this.albumList_;
        }

        public int getAlbumListCount() {
            return this.albumList_.size();
        }

        public AlbumBean getAlbumList(int i) {
            return this.albumList_.get(i);
        }

        public b getAlbumListOrBuilder(int i) {
            return this.albumList_.get(i);
        }

        private void ensureAlbumListIsMutable() {
            if (this.albumList_.isModifiable()) {
                return;
            }
            this.albumList_ = GeneratedMessageLite.mutableCopy(this.albumList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumList(int i, AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.set(i, albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumList(int i, AlbumBean.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.add(albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(int i, AlbumBean albumBean) {
            if (albumBean == null) {
                throw new NullPointerException();
            }
            ensureAlbumListIsMutable();
            this.albumList_.add(i, albumBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(AlbumBean.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlbumList(int i, AlbumBean.a aVar) {
            ensureAlbumListIsMutable();
            this.albumList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAlbumList(Iterable<? extends AlbumBean> iterable) {
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

        public static AlbumBeanList parseFrom(ByteBuffer byteBuffer) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AlbumBeanList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AlbumBeanList parseFrom(ByteString byteString) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AlbumBeanList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AlbumBeanList parseFrom(byte[] bArr) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AlbumBeanList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AlbumBeanList parseFrom(InputStream inputStream) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AlbumBeanList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AlbumBeanList parseDelimitedFrom(InputStream inputStream) {
            return (AlbumBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AlbumBeanList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AlbumBeanList parseFrom(CodedInputStream codedInputStream) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AlbumBeanList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlbumBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(AlbumBeanList albumBeanList) {
            return DEFAULT_INSTANCE.createBuilder(albumBeanList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<AlbumBeanList, a> implements a {
            private a() {
                super(AlbumBeanList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((AlbumBeanList) this.instance).setErrorCode(i);
                return this;
            }

            public a a(AlbumBean albumBean) {
                copyOnWrite();
                ((AlbumBeanList) this.instance).addAlbumList(albumBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new AlbumBeanList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "albumList_", AlbumBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<AlbumBeanList> parser = PARSER;
                    if (parser == null) {
                        synchronized (AlbumBeanList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(AlbumBeanList.class, DEFAULT_INSTANCE);
        }

        public static AlbumBeanList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AlbumBeanList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class BannerDataBeanList extends GeneratedMessageLite<BannerDataBeanList, a> implements f {
        public static final int BANNERDATALIST_FIELD_NUMBER = 2;
        private static final BannerDataBeanList DEFAULT_INSTANCE = new BannerDataBeanList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<BannerDataBeanList> PARSER;
        private Internal.ProtobufList<BannerDataBean> bannerDataList_ = emptyProtobufList();
        private int errorCode_;

        private BannerDataBeanList() {
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

        public List<BannerDataBean> getBannerDataListList() {
            return this.bannerDataList_;
        }

        public List<? extends g> getBannerDataListOrBuilderList() {
            return this.bannerDataList_;
        }

        public int getBannerDataListCount() {
            return this.bannerDataList_.size();
        }

        public BannerDataBean getBannerDataList(int i) {
            return this.bannerDataList_.get(i);
        }

        public g getBannerDataListOrBuilder(int i) {
            return this.bannerDataList_.get(i);
        }

        private void ensureBannerDataListIsMutable() {
            if (this.bannerDataList_.isModifiable()) {
                return;
            }
            this.bannerDataList_ = GeneratedMessageLite.mutableCopy(this.bannerDataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerDataList(int i, BannerDataBean bannerDataBean) {
            if (bannerDataBean == null) {
                throw new NullPointerException();
            }
            ensureBannerDataListIsMutable();
            this.bannerDataList_.set(i, bannerDataBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerDataList(int i, BannerDataBean.a aVar) {
            ensureBannerDataListIsMutable();
            this.bannerDataList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBannerDataList(BannerDataBean bannerDataBean) {
            if (bannerDataBean == null) {
                throw new NullPointerException();
            }
            ensureBannerDataListIsMutable();
            this.bannerDataList_.add(bannerDataBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBannerDataList(int i, BannerDataBean bannerDataBean) {
            if (bannerDataBean == null) {
                throw new NullPointerException();
            }
            ensureBannerDataListIsMutable();
            this.bannerDataList_.add(i, bannerDataBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBannerDataList(BannerDataBean.a aVar) {
            ensureBannerDataListIsMutable();
            this.bannerDataList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBannerDataList(int i, BannerDataBean.a aVar) {
            ensureBannerDataListIsMutable();
            this.bannerDataList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBannerDataList(Iterable<? extends BannerDataBean> iterable) {
            ensureBannerDataListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.bannerDataList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerDataList() {
            this.bannerDataList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBannerDataList(int i) {
            ensureBannerDataListIsMutable();
            this.bannerDataList_.remove(i);
        }

        public static BannerDataBeanList parseFrom(ByteBuffer byteBuffer) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BannerDataBeanList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BannerDataBeanList parseFrom(ByteString byteString) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BannerDataBeanList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BannerDataBeanList parseFrom(byte[] bArr) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BannerDataBeanList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BannerDataBeanList parseFrom(InputStream inputStream) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerDataBeanList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannerDataBeanList parseDelimitedFrom(InputStream inputStream) {
            return (BannerDataBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerDataBeanList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannerDataBeanList parseFrom(CodedInputStream codedInputStream) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BannerDataBeanList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerDataBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(BannerDataBeanList bannerDataBeanList) {
            return DEFAULT_INSTANCE.createBuilder(bannerDataBeanList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<BannerDataBeanList, a> implements f {
            private a() {
                super(BannerDataBeanList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((BannerDataBeanList) this.instance).setErrorCode(i);
                return this;
            }

            public a a(BannerDataBean bannerDataBean) {
                copyOnWrite();
                ((BannerDataBeanList) this.instance).addBannerDataList(bannerDataBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new BannerDataBeanList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "bannerDataList_", BannerDataBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BannerDataBeanList> parser = PARSER;
                    if (parser == null) {
                        synchronized (BannerDataBeanList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(BannerDataBeanList.class, DEFAULT_INSTANCE);
        }

        public static BannerDataBeanList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BannerDataBeanList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class CategoryBeanList extends GeneratedMessageLite<CategoryBeanList, a> implements h {
        public static final int CATEGORYLIST_FIELD_NUMBER = 2;
        private static final CategoryBeanList DEFAULT_INSTANCE = new CategoryBeanList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<CategoryBeanList> PARSER;
        private Internal.ProtobufList<CategoryBean> categoryList_ = emptyProtobufList();
        private int errorCode_;

        private CategoryBeanList() {
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

        public List<CategoryBean> getCategoryListList() {
            return this.categoryList_;
        }

        public List<? extends i> getCategoryListOrBuilderList() {
            return this.categoryList_;
        }

        public int getCategoryListCount() {
            return this.categoryList_.size();
        }

        public CategoryBean getCategoryList(int i) {
            return this.categoryList_.get(i);
        }

        public i getCategoryListOrBuilder(int i) {
            return this.categoryList_.get(i);
        }

        private void ensureCategoryListIsMutable() {
            if (this.categoryList_.isModifiable()) {
                return;
            }
            this.categoryList_ = GeneratedMessageLite.mutableCopy(this.categoryList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryList(int i, CategoryBean categoryBean) {
            if (categoryBean == null) {
                throw new NullPointerException();
            }
            ensureCategoryListIsMutable();
            this.categoryList_.set(i, categoryBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryList(int i, CategoryBean.a aVar) {
            ensureCategoryListIsMutable();
            this.categoryList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategoryList(CategoryBean categoryBean) {
            if (categoryBean == null) {
                throw new NullPointerException();
            }
            ensureCategoryListIsMutable();
            this.categoryList_.add(categoryBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategoryList(int i, CategoryBean categoryBean) {
            if (categoryBean == null) {
                throw new NullPointerException();
            }
            ensureCategoryListIsMutable();
            this.categoryList_.add(i, categoryBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategoryList(CategoryBean.a aVar) {
            ensureCategoryListIsMutable();
            this.categoryList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCategoryList(int i, CategoryBean.a aVar) {
            ensureCategoryListIsMutable();
            this.categoryList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCategoryList(Iterable<? extends CategoryBean> iterable) {
            ensureCategoryListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.categoryList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategoryList() {
            this.categoryList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCategoryList(int i) {
            ensureCategoryListIsMutable();
            this.categoryList_.remove(i);
        }

        public static CategoryBeanList parseFrom(ByteBuffer byteBuffer) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CategoryBeanList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CategoryBeanList parseFrom(ByteString byteString) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CategoryBeanList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CategoryBeanList parseFrom(byte[] bArr) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CategoryBeanList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CategoryBeanList parseFrom(InputStream inputStream) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CategoryBeanList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CategoryBeanList parseDelimitedFrom(InputStream inputStream) {
            return (CategoryBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CategoryBeanList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CategoryBeanList parseFrom(CodedInputStream codedInputStream) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CategoryBeanList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CategoryBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(CategoryBeanList categoryBeanList) {
            return DEFAULT_INSTANCE.createBuilder(categoryBeanList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<CategoryBeanList, a> implements h {
            private a() {
                super(CategoryBeanList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((CategoryBeanList) this.instance).setErrorCode(i);
                return this;
            }

            public a a(CategoryBean categoryBean) {
                copyOnWrite();
                ((CategoryBeanList) this.instance).addCategoryList(categoryBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new CategoryBeanList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "categoryList_", CategoryBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CategoryBeanList> parser = PARSER;
                    if (parser == null) {
                        synchronized (CategoryBeanList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(CategoryBeanList.class, DEFAULT_INSTANCE);
        }

        public static CategoryBeanList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CategoryBeanList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RdTrackBeanList extends GeneratedMessageLite<RdTrackBeanList, a> implements q {
        private static final RdTrackBeanList DEFAULT_INSTANCE = new RdTrackBeanList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<RdTrackBeanList> PARSER = null;
        public static final int RDTRACKLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<RdTrackBean> rdTrackList_ = emptyProtobufList();

        private RdTrackBeanList() {
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

        public List<RdTrackBean> getRdTrackListList() {
            return this.rdTrackList_;
        }

        public List<? extends r> getRdTrackListOrBuilderList() {
            return this.rdTrackList_;
        }

        public int getRdTrackListCount() {
            return this.rdTrackList_.size();
        }

        public RdTrackBean getRdTrackList(int i) {
            return this.rdTrackList_.get(i);
        }

        public r getRdTrackListOrBuilder(int i) {
            return this.rdTrackList_.get(i);
        }

        private void ensureRdTrackListIsMutable() {
            if (this.rdTrackList_.isModifiable()) {
                return;
            }
            this.rdTrackList_ = GeneratedMessageLite.mutableCopy(this.rdTrackList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRdTrackList(int i, RdTrackBean rdTrackBean) {
            if (rdTrackBean == null) {
                throw new NullPointerException();
            }
            ensureRdTrackListIsMutable();
            this.rdTrackList_.set(i, rdTrackBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRdTrackList(int i, RdTrackBean.a aVar) {
            ensureRdTrackListIsMutable();
            this.rdTrackList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRdTrackList(RdTrackBean rdTrackBean) {
            if (rdTrackBean == null) {
                throw new NullPointerException();
            }
            ensureRdTrackListIsMutable();
            this.rdTrackList_.add(rdTrackBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRdTrackList(int i, RdTrackBean rdTrackBean) {
            if (rdTrackBean == null) {
                throw new NullPointerException();
            }
            ensureRdTrackListIsMutable();
            this.rdTrackList_.add(i, rdTrackBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRdTrackList(RdTrackBean.a aVar) {
            ensureRdTrackListIsMutable();
            this.rdTrackList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRdTrackList(int i, RdTrackBean.a aVar) {
            ensureRdTrackListIsMutable();
            this.rdTrackList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRdTrackList(Iterable<? extends RdTrackBean> iterable) {
            ensureRdTrackListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.rdTrackList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRdTrackList() {
            this.rdTrackList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRdTrackList(int i) {
            ensureRdTrackListIsMutable();
            this.rdTrackList_.remove(i);
        }

        public static RdTrackBeanList parseFrom(ByteBuffer byteBuffer) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RdTrackBeanList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RdTrackBeanList parseFrom(ByteString byteString) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RdTrackBeanList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RdTrackBeanList parseFrom(byte[] bArr) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RdTrackBeanList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RdTrackBeanList parseFrom(InputStream inputStream) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RdTrackBeanList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RdTrackBeanList parseDelimitedFrom(InputStream inputStream) {
            return (RdTrackBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RdTrackBeanList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RdTrackBeanList parseFrom(CodedInputStream codedInputStream) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RdTrackBeanList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RdTrackBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RdTrackBeanList rdTrackBeanList) {
            return DEFAULT_INSTANCE.createBuilder(rdTrackBeanList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RdTrackBeanList, a> implements q {
            private a() {
                super(RdTrackBeanList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((RdTrackBeanList) this.instance).setErrorCode(i);
                return this;
            }

            public int a() {
                return ((RdTrackBeanList) this.instance).getRdTrackListCount();
            }

            public a a(RdTrackBean rdTrackBean) {
                copyOnWrite();
                ((RdTrackBeanList) this.instance).addRdTrackList(rdTrackBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RdTrackBeanList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "rdTrackList_", RdTrackBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RdTrackBeanList> parser = PARSER;
                    if (parser == null) {
                        synchronized (RdTrackBeanList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(RdTrackBeanList.class, DEFAULT_INSTANCE);
        }

        public static RdTrackBeanList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RdTrackBeanList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RankBeanList extends GeneratedMessageLite<RankBeanList, a> implements o {
        private static final RankBeanList DEFAULT_INSTANCE = new RankBeanList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile Parser<RankBeanList> PARSER = null;
        public static final int RANKLIST_FIELD_NUMBER = 2;
        private int errorCode_;
        private Internal.ProtobufList<RankBean> rankList_ = emptyProtobufList();

        private RankBeanList() {
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

        public List<RankBean> getRankListList() {
            return this.rankList_;
        }

        public List<? extends p> getRankListOrBuilderList() {
            return this.rankList_;
        }

        public int getRankListCount() {
            return this.rankList_.size();
        }

        public RankBean getRankList(int i) {
            return this.rankList_.get(i);
        }

        public p getRankListOrBuilder(int i) {
            return this.rankList_.get(i);
        }

        private void ensureRankListIsMutable() {
            if (this.rankList_.isModifiable()) {
                return;
            }
            this.rankList_ = GeneratedMessageLite.mutableCopy(this.rankList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankList(int i, RankBean rankBean) {
            if (rankBean == null) {
                throw new NullPointerException();
            }
            ensureRankListIsMutable();
            this.rankList_.set(i, rankBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRankList(int i, RankBean.a aVar) {
            ensureRankListIsMutable();
            this.rankList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankList(RankBean rankBean) {
            if (rankBean == null) {
                throw new NullPointerException();
            }
            ensureRankListIsMutable();
            this.rankList_.add(rankBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankList(int i, RankBean rankBean) {
            if (rankBean == null) {
                throw new NullPointerException();
            }
            ensureRankListIsMutable();
            this.rankList_.add(i, rankBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankList(RankBean.a aVar) {
            ensureRankListIsMutable();
            this.rankList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRankList(int i, RankBean.a aVar) {
            ensureRankListIsMutable();
            this.rankList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRankList(Iterable<? extends RankBean> iterable) {
            ensureRankListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.rankList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRankList() {
            this.rankList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRankList(int i) {
            ensureRankListIsMutable();
            this.rankList_.remove(i);
        }

        public static RankBeanList parseFrom(ByteBuffer byteBuffer) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RankBeanList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RankBeanList parseFrom(ByteString byteString) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RankBeanList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RankBeanList parseFrom(byte[] bArr) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RankBeanList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RankBeanList parseFrom(InputStream inputStream) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RankBeanList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RankBeanList parseDelimitedFrom(InputStream inputStream) {
            return (RankBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RankBeanList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBeanList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RankBeanList parseFrom(CodedInputStream codedInputStream) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RankBeanList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RankBeanList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(RankBeanList rankBeanList) {
            return DEFAULT_INSTANCE.createBuilder(rankBeanList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<RankBeanList, a> implements o {
            private a() {
                super(RankBeanList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((RankBeanList) this.instance).setErrorCode(i);
                return this;
            }

            public a a(RankBean rankBean) {
                copyOnWrite();
                ((RankBeanList) this.instance).addRankList(rankBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new RankBeanList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "rankList_", RankBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RankBeanList> parser = PARSER;
                    if (parser == null) {
                        synchronized (RankBeanList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(RankBeanList.class, DEFAULT_INSTANCE);
        }

        public static RankBeanList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RankBeanList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class HistoryInfoList extends GeneratedMessageLite<HistoryInfoList, a> implements k {
        private static final HistoryInfoList DEFAULT_INSTANCE = new HistoryInfoList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        public static final int HISTORYLIST_FIELD_NUMBER = 2;
        private static volatile Parser<HistoryInfoList> PARSER;
        private int errorCode_;
        private Internal.ProtobufList<HistoryInfoBean> historyList_ = emptyProtobufList();

        private HistoryInfoList() {
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

        public List<HistoryInfoBean> getHistoryListList() {
            return this.historyList_;
        }

        public List<? extends j> getHistoryListOrBuilderList() {
            return this.historyList_;
        }

        public int getHistoryListCount() {
            return this.historyList_.size();
        }

        public HistoryInfoBean getHistoryList(int i) {
            return this.historyList_.get(i);
        }

        public j getHistoryListOrBuilder(int i) {
            return this.historyList_.get(i);
        }

        private void ensureHistoryListIsMutable() {
            if (this.historyList_.isModifiable()) {
                return;
            }
            this.historyList_ = GeneratedMessageLite.mutableCopy(this.historyList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistoryList(int i, HistoryInfoBean historyInfoBean) {
            if (historyInfoBean == null) {
                throw new NullPointerException();
            }
            ensureHistoryListIsMutable();
            this.historyList_.set(i, historyInfoBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistoryList(int i, HistoryInfoBean.a aVar) {
            ensureHistoryListIsMutable();
            this.historyList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHistoryList(HistoryInfoBean historyInfoBean) {
            if (historyInfoBean == null) {
                throw new NullPointerException();
            }
            ensureHistoryListIsMutable();
            this.historyList_.add(historyInfoBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHistoryList(int i, HistoryInfoBean historyInfoBean) {
            if (historyInfoBean == null) {
                throw new NullPointerException();
            }
            ensureHistoryListIsMutable();
            this.historyList_.add(i, historyInfoBean);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHistoryList(HistoryInfoBean.a aVar) {
            ensureHistoryListIsMutable();
            this.historyList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHistoryList(int i, HistoryInfoBean.a aVar) {
            ensureHistoryListIsMutable();
            this.historyList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllHistoryList(Iterable<? extends HistoryInfoBean> iterable) {
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

        public static HistoryInfoList parseFrom(ByteBuffer byteBuffer) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HistoryInfoList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HistoryInfoList parseFrom(ByteString byteString) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HistoryInfoList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HistoryInfoList parseFrom(byte[] bArr) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HistoryInfoList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HistoryInfoList parseFrom(InputStream inputStream) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryInfoList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryInfoList parseDelimitedFrom(InputStream inputStream) {
            return (HistoryInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HistoryInfoList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HistoryInfoList parseFrom(CodedInputStream codedInputStream) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HistoryInfoList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HistoryInfoList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(HistoryInfoList historyInfoList) {
            return DEFAULT_INSTANCE.createBuilder(historyInfoList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<HistoryInfoList, a> implements k {
            private a() {
                super(HistoryInfoList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((HistoryInfoList) this.instance).setErrorCode(i);
                return this;
            }

            public a a(HistoryInfoBean historyInfoBean) {
                copyOnWrite();
                ((HistoryInfoList) this.instance).addHistoryList(historyInfoBean);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new HistoryInfoList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "historyList_", HistoryInfoBean.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<HistoryInfoList> parser = PARSER;
                    if (parser == null) {
                        synchronized (HistoryInfoList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(HistoryInfoList.class, DEFAULT_INSTANCE);
        }

        public static HistoryInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<HistoryInfoList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* loaded from: classes2.dex */
    public static final class PageList extends GeneratedMessageLite<PageList, a> implements m {
        private static final PageList DEFAULT_INSTANCE = new PageList();
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        public static final int PAGELIST_FIELD_NUMBER = 2;
        private static volatile Parser<PageList> PARSER;
        private int errorCode_;
        private Internal.ProtobufList<Page> pageList_ = emptyProtobufList();

        private PageList() {
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

        public List<Page> getPageListList() {
            return this.pageList_;
        }

        public List<? extends n> getPageListOrBuilderList() {
            return this.pageList_;
        }

        public int getPageListCount() {
            return this.pageList_.size();
        }

        public Page getPageList(int i) {
            return this.pageList_.get(i);
        }

        public n getPageListOrBuilder(int i) {
            return this.pageList_.get(i);
        }

        private void ensurePageListIsMutable() {
            if (this.pageList_.isModifiable()) {
                return;
            }
            this.pageList_ = GeneratedMessageLite.mutableCopy(this.pageList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageList(int i, Page page) {
            if (page == null) {
                throw new NullPointerException();
            }
            ensurePageListIsMutable();
            this.pageList_.set(i, page);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPageList(int i, Page.a aVar) {
            ensurePageListIsMutable();
            this.pageList_.set(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPageList(Page page) {
            if (page == null) {
                throw new NullPointerException();
            }
            ensurePageListIsMutable();
            this.pageList_.add(page);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPageList(int i, Page page) {
            if (page == null) {
                throw new NullPointerException();
            }
            ensurePageListIsMutable();
            this.pageList_.add(i, page);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPageList(Page.a aVar) {
            ensurePageListIsMutable();
            this.pageList_.add(aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPageList(int i, Page.a aVar) {
            ensurePageListIsMutable();
            this.pageList_.add(i, aVar.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPageList(Iterable<? extends Page> iterable) {
            ensurePageListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.pageList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPageList() {
            this.pageList_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePageList(int i) {
            ensurePageListIsMutable();
            this.pageList_.remove(i);
        }

        public static PageList parseFrom(ByteBuffer byteBuffer) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PageList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PageList parseFrom(ByteString byteString) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PageList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PageList parseFrom(byte[] bArr) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PageList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PageList parseFrom(InputStream inputStream) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PageList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PageList parseDelimitedFrom(InputStream inputStream) {
            return (PageList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PageList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PageList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PageList parseFrom(CodedInputStream codedInputStream) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PageList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PageList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(PageList pageList) {
            return DEFAULT_INSTANCE.createBuilder(pageList);
        }

        /* loaded from: classes2.dex */
        public static final class a extends GeneratedMessageLite.Builder<PageList, a> implements m {
            private a() {
                super(PageList.DEFAULT_INSTANCE);
            }

            public a a(int i) {
                copyOnWrite();
                ((PageList) this.instance).setErrorCode(i);
                return this;
            }

            public a a(Page page) {
                copyOnWrite();
                ((PageList) this.instance).addPageList(page);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke) {
                case NEW_MUTABLE_INSTANCE:
                    return new PageList();
                case NEW_BUILDER:
                    return new a();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"errorCode_", "pageList_", Page.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PageList> parser = PARSER;
                    if (parser == null) {
                        synchronized (PageList.class) {
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
            GeneratedMessageLite.registerDefaultInstance(PageList.class, DEFAULT_INSTANCE);
        }

        public static PageList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PageList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
