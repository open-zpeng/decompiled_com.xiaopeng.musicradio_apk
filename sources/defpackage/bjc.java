package defpackage;

import android.content.DialogInterface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import androidx.fragment.app.x;
import com.xiaopeng.lib.framework.aiassistantmodule.sensor.ContextSensor;
import java.util.ArrayList;
import java.util.List;
import me.yokeyword.fragmentation.d;
/* compiled from: DebugStackDelegate.java */
/* renamed from: bjc  reason: default package */
/* loaded from: classes3.dex */
public class bjc implements SensorEventListener {
    private d a;
    private SensorManager b;
    private c c;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public bjc(d dVar) {
        this.a = dVar;
    }

    public void a(int i) {
        if (i != 1) {
            return;
        }
        this.b = (SensorManager) this.a.getSystemService(ContextSensor.DATA_SENSOR);
        SensorManager sensorManager = this.b;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
    }

    public void b(int i) {
        if (i != 2) {
            return;
        }
        View findViewById = this.a.findViewById(16908290);
        if (findViewById instanceof FrameLayout) {
            ImageView imageView = new ImageView(this.a);
            imageView.setImageResource(d.b.fragmentation_ic_stack);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            int applyDimension = (int) TypedValue.applyDimension(1, 18.0f, this.a.getResources().getDisplayMetrics());
            layoutParams.topMargin = applyDimension * 7;
            layoutParams.rightMargin = applyDimension;
            imageView.setLayoutParams(layoutParams);
            ((FrameLayout) findViewById).addView(imageView);
            imageView.setOnTouchListener(new a(imageView, applyDimension / 4));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: bjc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    bjc.this.b();
                }
            });
        }
    }

    public void a() {
        SensorManager sensorManager = this.b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        if (type == 1) {
            float f = 12;
            if (Math.abs(fArr[0]) >= f || Math.abs(fArr[1]) >= f || Math.abs(fArr[2]) >= f) {
                b();
            }
        }
    }

    public void b() {
        c cVar = this.c;
        if (cVar == null || !cVar.isShowing()) {
            bjb bjbVar = new bjb(this.a);
            bjbVar.a(c());
            bjbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.c = new c.a(this.a).b(bjbVar).a(17039360, (DialogInterface.OnClickListener) null).a(true).b();
            this.c.show();
        }
    }

    private List<bja> c() {
        ArrayList arrayList = new ArrayList();
        List<Fragment> d = x.d(this.a.getSupportFragmentManager());
        if (d == null || d.size() < 1) {
            return null;
        }
        for (Fragment fragment : d) {
            a(arrayList, fragment);
        }
        return arrayList;
    }

    private List<bja> a(Fragment fragment) {
        ArrayList arrayList = new ArrayList();
        List<Fragment> d = x.d(fragment.getChildFragmentManager());
        if (d == null || d.size() < 1) {
            return null;
        }
        for (int size = d.size() - 1; size >= 0; size--) {
            a(arrayList, d.get(size));
        }
        return arrayList;
    }

    private void a(List<bja> list, Fragment fragment) {
        CharSequence charSequence;
        if (fragment != null) {
            int backStackEntryCount = fragment.getFragmentManager().getBackStackEntryCount();
            CharSequence simpleName = fragment.getClass().getSimpleName();
            if (backStackEntryCount == 0) {
                charSequence = a(simpleName, " *");
            } else {
                for (int i = 0; i < backStackEntryCount; i++) {
                    FragmentManager.a backStackEntryAt = fragment.getFragmentManager().getBackStackEntryAt(i);
                    if ((backStackEntryAt.h() != null && backStackEntryAt.h().equals(fragment.getTag())) || (backStackEntryAt.h() == null && fragment.getTag() == null)) {
                        break;
                    }
                    if (i == backStackEntryCount - 1) {
                        simpleName = a(simpleName, " *");
                    }
                }
                charSequence = simpleName;
            }
            if ((fragment instanceof me.yokeyword.fragmentation.c) && ((me.yokeyword.fragmentation.c) fragment).x()) {
                charSequence = a(charSequence, " ☀");
            }
            list.add(new bja(charSequence, a(fragment)));
        }
    }

    private CharSequence a(CharSequence charSequence, String str) {
        return ((Object) charSequence) + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugStackDelegate.java */
    /* renamed from: bjc$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnTouchListener {
        private View b;
        private float c;
        private float e;
        private boolean g;
        private int h;
        private float d = 0.0f;
        private float f = 0.0f;

        a(View view, int i) {
            this.b = view;
            this.h = i;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            switch (motionEvent.getAction()) {
                case 0:
                    this.g = true;
                    this.e = rawX;
                    this.f = rawY;
                    this.c = this.b.getX() - motionEvent.getRawX();
                    this.d = this.b.getY() - motionEvent.getRawY();
                    break;
                case 1:
                case 3:
                    if (rawX - this.e < this.h && this.g) {
                        this.b.performClick();
                        break;
                    }
                    break;
                case 2:
                    if (Math.abs(rawX - this.e) < this.h && Math.abs(rawY - this.f) < this.h && this.g) {
                        this.g = true;
                        break;
                    } else {
                        this.g = false;
                        this.b.setX(motionEvent.getRawX() + this.c);
                        this.b.setY(motionEvent.getRawY() + this.d);
                        break;
                    }
                default:
                    return false;
            }
            return true;
        }
    }
}
