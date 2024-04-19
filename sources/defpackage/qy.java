package defpackage;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GradientColorParser.java */
/* renamed from: qy  reason: default package */
/* loaded from: classes3.dex */
public class qy implements rw<pn> {
    private int a;

    public qy(int i) {
        this.a = i;
    }

    @Override // defpackage.rw
    /* renamed from: a */
    public pn b(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i = this.a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            switch (i4 % 4) {
                case 0:
                    fArr[i5] = (float) floatValue;
                    break;
                case 1:
                    i2 = (int) (floatValue * 255.0d);
                    break;
                case 2:
                    i3 = (int) (floatValue * 255.0d);
                    break;
                case 3:
                    iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
                    break;
            }
        }
        pn pnVar = new pn(fArr, iArr);
        a(pnVar, arrayList);
        return pnVar;
    }

    private void a(pn pnVar, List<Float> list) {
        int i = this.a * 4;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = list.get(i).floatValue();
            } else {
                dArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < pnVar.c(); i3++) {
            int i4 = pnVar.b()[i3];
            pnVar.b()[i3] = Color.argb(a(pnVar.a()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    private int a(double d, double[] dArr, double[] dArr2) {
        for (int i = 1; i < dArr.length; i++) {
            int i2 = i - 1;
            double d2 = dArr[i2];
            double d3 = dArr[i];
            if (dArr[i] >= d) {
                return (int) (sb.a(dArr2[i2], dArr2[i], (d - d2) / (d3 - d2)) * 255.0d);
            }
        }
        return (int) (dArr2[dArr2.length - 1] * 255.0d);
    }
}
