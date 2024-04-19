package com.xiaopeng.speech.common.bean;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class Value implements Parcelable {
    private static final int BOOLEAN_TYPE = 5;
    private static final int DOUBLE_TYPE = 2;
    private static final int FLOAT_ARRAY_TYPE = 7;
    private static final int INTEGER_ARRAY_TYPE = 6;
    private static final int INTEGER_TYPE = 1;
    private static final int STRING_TYPE = 4;
    private int classType;
    private Boolean mBoolean;
    private Double mDouble;
    private float[] mFloatArray;
    private Integer mInteger;
    private int[] mIntegerArray;
    private String mString;
    public static final Value VOID = new Value();
    public static final Value INTERRUPT = new Value();
    public static final Parcelable.Creator<Value> CREATOR = new Parcelable.Creator<Value>() { // from class: com.xiaopeng.speech.common.bean.Value.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Value createFromParcel(Parcel parcel) {
            return new Value(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Value[] newArray(int i) {
            return new Value[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Value() {
    }

    public Value(Object obj) {
        a(obj);
    }

    private void a(Object obj) {
        if (obj instanceof Double) {
            this.classType = 2;
            this.mDouble = (Double) obj;
        } else if (obj instanceof String) {
            this.classType = 4;
            this.mString = (String) obj;
        } else if (obj instanceof Boolean) {
            this.classType = 5;
            this.mBoolean = (Boolean) obj;
        } else if (obj instanceof int[]) {
            this.classType = 6;
            this.mIntegerArray = (int[]) obj;
        } else if (obj instanceof float[]) {
            this.classType = 7;
            this.mFloatArray = (float[]) obj;
        } else if (obj instanceof Integer) {
            this.classType = 1;
            this.mInteger = (Integer) obj;
        } else if (obj instanceof Float) {
            this.classType = 2;
            this.mDouble = Double.valueOf(((Float) obj).doubleValue());
        } else {
            this.classType = 0;
        }
    }

    protected Value(Parcel parcel) {
        this.classType = parcel.readInt();
        int i = this.classType;
        if (i == 2) {
            this.mDouble = Double.valueOf(parcel.readDouble());
        } else if (i == 4) {
            this.mString = parcel.readString();
        } else {
            if (i == 5) {
                this.mBoolean = Boolean.valueOf(parcel.readInt() == 1);
            } else if (i == 6) {
                this.mIntegerArray = parcel.createIntArray();
            } else if (i == 7) {
                this.mFloatArray = parcel.createFloatArray();
            } else if (i == 1) {
                this.mInteger = Integer.valueOf(parcel.readInt());
            }
        }
    }

    public boolean a() {
        return this.mBoolean.booleanValue();
    }

    public Integer b() {
        return this.mInteger;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.classType);
        int i2 = this.classType;
        if (i2 == 2) {
            parcel.writeDouble(this.mDouble.doubleValue());
        } else if (i2 == 4) {
            parcel.writeString(this.mString);
        } else if (i2 == 5) {
            parcel.writeInt(this.mBoolean.booleanValue() ? 1 : 0);
        } else if (i2 == 6) {
            parcel.writeIntArray(this.mIntegerArray);
        } else if (i2 == 7) {
            parcel.writeFloatArray(this.mFloatArray);
        } else if (i2 == 1) {
            parcel.writeInt(this.mInteger.intValue());
        }
    }

    public String toString() {
        return "Value{mInteger=" + this.mInteger + ", mDouble=" + this.mDouble + ", mString='" + this.mString + "', mBoolean=" + this.mBoolean + ", classType=" + this.classType + '}';
    }
}
