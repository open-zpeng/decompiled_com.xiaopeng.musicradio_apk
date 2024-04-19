package com.xiaopeng.lib.framework.netchannelmodule.remotestorage.oss;

import android.os.SystemProperties;
import com.xiaopeng.lib.framework.moduleinterface.netchannelmodule.remotestorage.IRemoteStorage;
import com.xiaopeng.lib.utils.DateUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.SystemPropertyUtil;
import com.xiaopeng.lib.utils.config.CommonConfig;
import com.xiaopeng.lib.utils.info.BuildInfoUtils;
/* loaded from: classes.dex */
public class Bucket {
    public static String BUCKET_AND_ENDPOINT = null;
    public static String END_POINT = null;
    public static final String END_POINT_DOMAIN = "oss-cn-hangzhou.aliyuncs.com/";
    public static final String END_POINT_DOMAIN_INT = "oss-eu-central-1.aliyuncs.com/";
    public static final String END_POINT_DOMAIN_PRIVATE = "oss.xiaopeng.com/";
    private static final long MAX_LOG_LENGTH = 20971520;
    private static final String SCHEMA = "https://";
    public static String TOKEN_URL_V5;
    private String mPrivateUrl;
    private String mRootName;
    private String mUrl;
    public static String END_POINT_PRIVATE = "https://oss.xiaopeng.com/";
    public static String BUCKET_AND_ENDPOINT_PRIVATE = "https://%s.oss.xiaopeng.com/";

    public long getMaxObjectSize() {
        return 20971520L;
    }

    static {
        TOKEN_URL_V5 = CommonConfig.HTTP_BUSINESS_HOST + "/v5/aliyun/token";
        END_POINT = "https://oss-cn-hangzhou.aliyuncs.com/";
        BUCKET_AND_ENDPOINT = "https://%s.oss-cn-hangzhou.aliyuncs.com/";
        try {
            boolean z = !getVersionInCountryCode().contains("ZH");
            LogUtils.i("Bucket", "Version = " + getVersionInCountryCode() + ", international = " + z);
            if (z) {
                TOKEN_URL_V5 = "https://xmart-eu.xiaopeng.com/biz/v5/aliyun/token";
                END_POINT = "https://oss-eu-central-1.aliyuncs.com/";
                BUCKET_AND_ENDPOINT = "https://%s.oss-eu-central-1.aliyuncs.com/";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bucket get(IRemoteStorage.CATEGORY category) {
        switch (category) {
            case CAN:
                return new CanBucket();
            case CDU:
                return new CduBucket();
            default:
                throw new RuntimeException("Wrong bucket was specified!");
        }
    }

    public Bucket(String str) {
        this.mRootName = str;
        this.mUrl = String.format(BUCKET_AND_ENDPOINT, str);
        this.mPrivateUrl = String.format(BUCKET_AND_ENDPOINT_PRIVATE, str);
    }

    private Bucket() {
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getPrivateUrl() {
        return this.mPrivateUrl;
    }

    public String getRootName() {
        return this.mRootName;
    }

    public String generateObjectKey(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        return this.mRootName + "/" + str + "/" + BuildInfoUtils.getSystemVersion() + "/" + DateUtils.formatDate7(currentTimeMillis) + "/" + SystemPropertyUtil.getVehicleId() + "/" + currentTimeMillis + ".zip";
    }

    /* loaded from: classes.dex */
    private static final class CduBucket extends Bucket {
        private static final String CDU_BUCKET_NAME = "xmart-cdu-service-log";

        private CduBucket() {
            super("xmart-cdu-service-log");
        }
    }

    /* loaded from: classes.dex */
    private static final class CanBucket extends Bucket {
        private static final String CAN_BUCKET_NAME = "xmart-can-service-log";

        private CanBucket() {
            super(CAN_BUCKET_NAME);
        }
    }

    public static String getVersionInCountryCode() {
        String str = SystemProperties.get("ro.xiaopeng.software", "");
        return ("".equals(str) || str == null || str.length() < 9) ? str : str.substring(7, 9);
    }
}
