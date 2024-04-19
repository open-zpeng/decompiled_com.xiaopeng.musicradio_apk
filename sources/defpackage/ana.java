package defpackage;
/* compiled from: NForeBluetoothUtils.java */
/* renamed from: ana  reason: default package */
/* loaded from: classes2.dex */
public class ana {
    public static String a(int i) {
        String str;
        if (i == 100) {
            str = "NOT_INITIALIZED";
        } else if (i == 110) {
            str = "READY";
        } else if (i == 125) {
            str = "DISCONNECTING";
        } else if (i == 130) {
            str = "LISTENING";
        } else if (i == 140) {
            str = "CONNECTED";
        } else if (i == 145) {
            str = "BROWSING";
        } else if (i != 150) {
            switch (i) {
                case 120:
                    str = "CONNECTING";
                    break;
                case 121:
                    str = "AUTO_CONNECT_BTON_CONNECTING";
                    break;
                case 122:
                    str = "AUTO_CONNECT_PAIRED_CONNECTING";
                    break;
                case 123:
                    str = "AUTO_CONNECT_OOR_CONNECTING";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "STREAMING";
        }
        return str + "(" + i + ")";
    }

    public static String b(int i) {
        String str;
        switch (i) {
            case -1:
                str = "ERROR";
                break;
            case 0:
                str = "STOPPED";
                break;
            case 1:
                str = "PLAYING";
                break;
            case 2:
                str = "PAUSED";
                break;
            case 3:
                str = "FWD_SEEK";
                break;
            case 4:
                str = "REV_SEEK";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return str + "(" + i + ")";
    }
}
