package com.xiaopeng.musicradio.bean.lyrics;

import android.text.Html;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class LrcEntry implements Comparable<LrcEntry> {
    private static Pattern mLinePattern = Pattern.compile("((\\[\\d\\d:\\d\\d\\.\\d+\\])+)(.+)");
    private static Pattern mTimePattern = Pattern.compile("\\[(\\d\\d):(\\d\\d)\\.(\\d+)\\]");
    private String text;
    private long time;

    private LrcEntry(long j, String str) {
        this.time = j;
        this.text = str;
    }

    public long getTime() {
        return this.time;
    }

    public String getText() {
        return this.text;
    }

    @Override // java.lang.Comparable
    public int compareTo(LrcEntry lrcEntry) {
        if (lrcEntry == null) {
            return -1;
        }
        return (int) (this.time - lrcEntry.getTime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<LrcEntry> parseLrc(File file) {
        BufferedReader bufferedReader = null;
        boolean z = 0;
        bufferedReader = null;
        bufferedReader = null;
        if (file == null || !file.exists()) {
            return null;
        }
        ArrayList<LrcEntry> arrayList = new ArrayList<>();
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            List<LrcEntry> parseLine = parseLine(readLine);
                            if (parseLine != null && (z = parseLine.isEmpty()) == 0) {
                                arrayList.addAll(parseLine);
                            }
                        } catch (IOException e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                bufferedReader = bufferedReader;
                            }
                            Collections.sort(arrayList);
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    bufferedReader = z;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static ArrayList<LrcEntry> parseLrcFile(String str) {
        return parseLrc(new File(str));
    }

    public static ArrayList<LrcEntry> parseLrc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<LrcEntry> arrayList = new ArrayList<>();
        for (String str2 : str.split("\\n")) {
            List<LrcEntry> parseLine = parseLine(str2);
            if (parseLine != null && !parseLine.isEmpty()) {
                arrayList.addAll(parseLine);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<LrcEntry> parseLine(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = mLinePattern.matcher(str.trim());
        if (matcher.matches()) {
            String group = matcher.group(1);
            String replaceAll = matcher.group(3).replaceAll("\\<\\d*\\>", "");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = mTimePattern.matcher(group);
            while (matcher2.find()) {
                arrayList.add(new LrcEntry((Long.parseLong(matcher2.group(1)) * 60000) + (Long.parseLong(matcher2.group(2)) * 1000) + Long.parseLong(matcher2.group(3)), Html.fromHtml(replaceAll).toString()));
            }
            return arrayList;
        }
        return null;
    }
}
