package com.xiaopeng.lib.utils;

import android.graphics.Bitmap;
import android.os.Environment;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.xiaopeng.lib.framework.carcontrollermodule.controller.McuController;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
/* loaded from: classes.dex */
public class FileUtils {
    private static final String FILE_DIR_NAME = "files";
    private static final String PACKAGE_NAME = "com.xiaopeng.xmart";
    public static final int SIZETYPE_B = 1;
    public static final int SIZETYPE_GB = 4;
    public static final int SIZETYPE_KB = 2;
    public static final int SIZETYPE_MB = 3;
    public static final long SIZE_1GB = 1073741824;
    public static final long SIZE_1KB = 1024;
    public static final long SIZE_1MB = 1048576;
    private static final String TAG = "FileUtils";
    private static final String XMART_USB_PATH = "/mnt/usbhost";

    /* loaded from: classes.dex */
    public interface OnUpdateFileCopyFromUsbListener {
        void onCopyFail();

        void onCopySuccess();
    }

    public static double getFileSize(String str, int i) {
        long j;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j = getFileSizes(file);
            } else {
                j = getFileSize(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.e(TAG, "getFileSize error! e = " + e);
            j = 0;
        }
        return FormatFileSize(j, i);
    }

    public static String getFileSize(String str) {
        long j;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j = getFileSizes(file);
            } else {
                j = getFileSize(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.e(TAG, "getFileSize error!");
            j = 0;
        }
        return FormatFileSize(j);
    }

    private static long getFileSize(File file) {
        if (file != null && file.exists()) {
            return file.length();
        }
        throw new FileNotFoundException();
    }

    private static long getFileSizes(File file) {
        long fileSize;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    fileSize = getFileSizes(listFiles[i]);
                } else {
                    fileSize = getFileSize(listFiles[i]);
                }
                j += fileSize;
            }
        } else {
            LogUtils.e(TAG, "File not exist");
        }
        return j;
    }

    private static String FormatFileSize(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            return decimalFormat.format(j).replace(ListSignBean.COLLECTID_SUFFIX, ".") + McuController.CAR_STAGE_B;
        } else if (j < 1048576) {
            return decimalFormat.format(j / 1024.0d).replace(ListSignBean.COLLECTID_SUFFIX, ".") + "KB";
        } else if (j < SIZE_1GB) {
            return decimalFormat.format(j / 1048576.0d).replace(ListSignBean.COLLECTID_SUFFIX, ".") + "MB";
        } else {
            return decimalFormat.format(j / 1.073741824E9d).replace(ListSignBean.COLLECTID_SUFFIX, ".") + "GB";
        }
    }

    private static double FormatFileSize(long j, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        switch (i) {
            case 1:
                return Double.valueOf(decimalFormat.format(j).replace(ListSignBean.COLLECTID_SUFFIX, ".")).doubleValue();
            case 2:
                return Double.valueOf(decimalFormat.format(j / 1024.0d).replace(ListSignBean.COLLECTID_SUFFIX, ".")).doubleValue();
            case 3:
                return Double.valueOf(decimalFormat.format(j / 1048576.0d).replace(ListSignBean.COLLECTID_SUFFIX, ".")).doubleValue();
            case 4:
                return Double.valueOf(decimalFormat.format(j / 1.073741824E9d).replace(ListSignBean.COLLECTID_SUFFIX, ".")).doubleValue();
            default:
                return 0.0d;
        }
    }

    public static String getFileBaseName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        if (lastIndexOf >= 0 && lastIndexOf < str.length()) {
            str = str.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str.lastIndexOf(".");
        return (lastIndexOf2 <= 0 || lastIndexOf2 >= str.length()) ? str : str.substring(0, lastIndexOf2);
    }

    private static boolean hasSDCard() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static String getRootFilePath() {
        if (hasSDCard()) {
            return Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
        }
        return Environment.getDataDirectory().getAbsolutePath() + "/data/";
    }

    public static String getSaveFilePath() {
        if (hasSDCard()) {
            return getRootFilePath() + PACKAGE_NAME + File.separator + FILE_DIR_NAME + File.separator;
        }
        return getRootFilePath() + PACKAGE_NAME + File.separator + FILE_DIR_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String storePicture(Bitmap bitmap, String str, int i) {
        FileOutputStream fileOutputStream;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, System.currentTimeMillis() + ".jpg");
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            bitmap.compress(compressFormat, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            fileOutputStream2 = compressFormat;
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
                fileOutputStream2 = fileOutputStream2;
            }
            return file2.getAbsolutePath();
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
                fileOutputStream2 = fileOutputStream2;
            }
            return file2.getAbsolutePath();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
        return file2.getAbsolutePath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void saveImageToGallery(android.content.Context r5, android.graphics.Bitmap r6, java.lang.String r7) {
        /*
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            r0.<init>(r1, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L12
            r0.mkdir()
        L12:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r7.append(r1)
            java.lang.String r1 = ".jpg"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r7)
            r0 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47 java.io.FileNotFoundException -> L52
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47 java.io.FileNotFoundException -> L52
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.IOException -> L40 java.io.FileNotFoundException -> L42 java.lang.Throwable -> L80
            r4 = 100
            r6.compress(r3, r4, r2)     // Catch: java.io.IOException -> L40 java.io.FileNotFoundException -> L42 java.lang.Throwable -> L80
            r2.flush()     // Catch: java.io.IOException -> L40 java.io.FileNotFoundException -> L42 java.lang.Throwable -> L80
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L40:
            r6 = move-exception
            goto L49
        L42:
            r6 = move-exception
            goto L54
        L44:
            r5 = move-exception
            r2 = r0
            goto L81
        L47:
            r6 = move-exception
            r2 = r0
        L49:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L52:
            r6 = move-exception
            r2 = r0
        L54:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r6 = move-exception
            r6.printStackTrace()
        L61:
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch: java.io.FileNotFoundException -> L6d
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.io.FileNotFoundException -> L6d
            android.provider.MediaStore.Images.Media.insertImage(r6, r2, r7, r0)     // Catch: java.io.FileNotFoundException -> L6d
            goto L71
        L6d:
            r6 = move-exception
            r6.printStackTrace()
        L71:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            r6.<init>(r7, r0)
            r5.sendBroadcast(r6)
            return
        L80:
            r5 = move-exception
        L81:
            if (r2 == 0) goto L8b
            r2.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r6 = move-exception
            r6.printStackTrace()
        L8b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.lib.utils.FileUtils.saveImageToGallery(android.content.Context, android.graphics.Bitmap, java.lang.String):void");
    }

    public static String getFileStorePath(String str) {
        String saveFilePath = getSaveFilePath();
        if (saveFilePath.endsWith(File.separator)) {
            return saveFilePath + str;
        }
        return saveFilePath + File.separator + str;
    }

    public static String[] getUsbMountDir() {
        String str = SystemProperties.get("sys.usb.label", (String) null);
        LogUtils.d(TAG, "UsbMountDir-->" + str);
        if (TextUtils.isEmpty(str)) {
            return new String[]{XMART_USB_PATH};
        }
        return str.contains(ListSignBean.COLLECTID_SUFFIX) ? str.split(ListSignBean.COLLECTID_SUFFIX) : new String[]{str};
    }

    public static boolean isUsbAvailable() {
        File[] listFiles;
        String[] usbMountDir = getUsbMountDir();
        if (usbMountDir != null) {
            for (String str : usbMountDir) {
                LogUtils.d(TAG, "subMountDir-->" + str);
                File file = new File(str);
                if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void copyFile(String str, String str2, OnUpdateFileCopyFromUsbListener onUpdateFileCopyFromUsbListener) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        r0 = null;
        FileInputStream fileInputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream2 = null;
        try {
            try {
                try {
                    if (new File(str).exists()) {
                        fileInputStream = new FileInputStream(str);
                        try {
                            fileOutputStream = new FileOutputStream(str2);
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            if (onUpdateFileCopyFromUsbListener != null) {
                                onUpdateFileCopyFromUsbListener.onCopySuccess();
                            }
                            fileInputStream2 = fileInputStream;
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream3 = fileOutputStream;
                            e.printStackTrace();
                            onUpdateFileCopyFromUsbListener.onCopyFail();
                            if (fileOutputStream3 != null) {
                                try {
                                    fileOutputStream3.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        fileOutputStream = null;
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                } catch (IOException e7) {
                    e7.printStackTrace();
                    return;
                }
            } catch (Exception e8) {
                e = e8;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean copyFile(String str, String str2) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        r1 = null;
        FileInputStream fileInputStream2 = null;
        fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                try {
                    if (new File(str).exists()) {
                        fileInputStream = new FileInputStream(str);
                        try {
                            fileOutputStream = new FileOutputStream(str2);
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            z = true;
                            fileInputStream2 = fileInputStream;
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream3 = fileOutputStream;
                            e.printStackTrace();
                            if (fileOutputStream3 != null) {
                                try {
                                    fileOutputStream3.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        fileOutputStream = null;
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e7) {
                e = e7;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return z;
    }

    public static File makeFilePath(String str, String str2) {
        File file;
        try {
            File file2 = new File(str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
        } catch (Exception unused) {
        }
        try {
            file = new File(str + str2);
        } catch (Exception e) {
            e = e;
            file = null;
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return file;
        }
        return file;
    }

    public static void makeDirectory(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return;
            }
            file.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeTxtToFile(String str, String str2, String str3) {
        File file;
        RandomAccessFile randomAccessFile;
        makeFilePath(str2, str3);
        String str4 = str2 + str3;
        String str5 = str + "\r\n";
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                try {
                    file = new File(str4);
                    if (!file.exists()) {
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                    }
                    randomAccessFile = new RandomAccessFile(file, "rwd");
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                randomAccessFile.seek(file.length());
                randomAccessFile.write(str5.getBytes());
                randomAccessFile.close();
            } catch (Exception e2) {
                e = e2;
                randomAccessFile2 = randomAccessFile;
                LogUtils.w(TAG, "writeTxtToFile error!", e);
                e.printStackTrace();
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public static void deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int i = 0; i < listFiles.length; i++) {
                    deleteFile(listFiles[i].getAbsolutePath());
                    if (listFiles[i].isDirectory()) {
                        listFiles[i].delete();
                    }
                }
            }
            new File(str).delete();
        }
    }

    public static long getDirSize(File file) {
        long j = 0;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    return 0L;
                }
                for (File file2 : listFiles) {
                    j += getDirSize(file2);
                }
                return j;
            }
            return (file.length() / 1024) / 1024;
        }
        System.out.println("文件或者文件夹不存在，请检查路径是否正确！");
        return 0L;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
