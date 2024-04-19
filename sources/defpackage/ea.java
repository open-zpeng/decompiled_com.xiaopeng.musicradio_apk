package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: KeyFrames.java */
/* renamed from: ea  reason: default package */
/* loaded from: classes3.dex */
public class ea {
    static HashMap<String, Constructor<? extends dx>> a = new HashMap<>();
    private HashMap<Integer, ArrayList<dx>> b = new HashMap<>();

    static {
        try {
            a.put("KeyAttribute", dy.class.getConstructor(new Class[0]));
            a.put("KeyPosition", eb.class.getConstructor(new Class[0]));
            a.put("KeyCycle", dz.class.getConstructor(new Class[0]));
            a.put("KeyTimeCycle", ed.class.getConstructor(new Class[0]));
            a.put("KeyTrigger", ee.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public void a(dx dxVar) {
        if (!this.b.containsKey(Integer.valueOf(dxVar.c))) {
            this.b.put(Integer.valueOf(dxVar.c), new ArrayList<>());
        }
        ArrayList<dx> arrayList = this.b.get(Integer.valueOf(dxVar.c));
        if (arrayList != null) {
            arrayList.add(dxVar);
        }
    }

    public ea() {
    }

    public ea(Context context, XmlPullParser xmlPullParser) {
        dx dxVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 0) {
                    switch (eventType) {
                        case 2:
                            String name = xmlPullParser.getName();
                            if (a.containsKey(name)) {
                                try {
                                    Constructor<? extends dx> constructor = a.get(name);
                                    if (constructor != null) {
                                        dx newInstance = constructor.newInstance(new Object[0]);
                                        try {
                                            newInstance.a(context, Xml.asAttributeSet(xmlPullParser));
                                            a(newInstance);
                                            dxVar = newInstance;
                                        } catch (Exception e) {
                                            e = e;
                                            dxVar = newInstance;
                                            Log.e("KeyFrames", "unable to create ", e);
                                            eventType = xmlPullParser.next();
                                        }
                                    } else {
                                        throw new NullPointerException("Keymaker for " + name + " not found");
                                        break;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            } else if (name.equalsIgnoreCase("CustomAttribute")) {
                                if (dxVar != null && dxVar.f != null) {
                                    a.a(context, xmlPullParser, dxVar.f);
                                }
                            } else if (name.equalsIgnoreCase("CustomMethod") && dxVar != null && dxVar.f != null) {
                                a.a(context, xmlPullParser, dxVar.f);
                                continue;
                            }
                            break;
                        case 3:
                            if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                                return;
                            }
                            continue;
                        default:
                            continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }

    public void a(eg egVar) {
        ArrayList<dx> arrayList = this.b.get(-1);
        if (arrayList != null) {
            egVar.a(arrayList);
        }
    }

    public void b(eg egVar) {
        ArrayList<dx> arrayList = this.b.get(Integer.valueOf(egVar.c));
        if (arrayList != null) {
            egVar.a(arrayList);
        }
        ArrayList<dx> arrayList2 = this.b.get(-1);
        if (arrayList2 != null) {
            Iterator<dx> it = arrayList2.iterator();
            while (it.hasNext()) {
                dx next = it.next();
                if (next.a(((ConstraintLayout.a) egVar.b.getLayoutParams()).ab)) {
                    egVar.a(next);
                }
            }
        }
    }

    public ArrayList<dx> a(int i) {
        return this.b.get(Integer.valueOf(i));
    }
}
