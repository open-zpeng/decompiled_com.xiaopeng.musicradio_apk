package com.xiaopeng.speech.protocol.query.navi;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class MapQuery_Processor implements IQueryProcessor {
    private MapQuery a;

    public MapQuery_Processor(MapQuery mapQuery) {
        this.a = mapQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1925707028:
                if (str.equals("navi.poi.details.favorite.status")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1697099311:
                if (str.equals("navi.is.cruise")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1571917085:
                if (str.equals("navi.scale.current.level")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1195178996:
                if (str.equals("navi.favorite.open.status")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -851414168:
                if (str.equals("navi.get.navigation.info")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -372606704:
                if (str.equals("navi.is.navigation")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -98628845:
                if (str.equals("navi.main.road.status")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 18796803:
                if (str.equals("navi.is.zoomout.min")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 238106971:
                if (str.equals("navi.is.sr")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 334610996:
                if (str.equals("navi.common.addr.get")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1182098865:
                if (str.equals("navi.side.road.status")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1454660265:
                if (str.equals("navi.is.calculate.path")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1693312668:
                if (str.equals("navi.is.explore.path")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2037098922:
                if (str.equals("navi.is.zoomin.max")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2041908174:
                if (str.equals("navi.open.controls.status")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return Boolean.valueOf(this.a.b(str, str2));
            case 1:
                return Boolean.valueOf(this.a.c(str, str2));
            case 2:
                return Boolean.valueOf(this.a.d(str, str2));
            case 3:
                return this.a.e(str, str2);
            case 4:
                return this.a.f(str, str2);
            case 5:
                return Boolean.valueOf(this.a.g(str, str2));
            case 6:
                return Boolean.valueOf(this.a.h(str, str2));
            case 7:
                return Boolean.valueOf(this.a.i(str, str2));
            case '\b':
                return Integer.valueOf(this.a.j(str, str2));
            case '\t':
                return Integer.valueOf(this.a.k(str, str2));
            case '\n':
                return Integer.valueOf(this.a.l(str, str2));
            case 11:
                return Integer.valueOf(this.a.m(str, str2));
            case '\f':
                return Integer.valueOf(this.a.n(str, str2));
            case '\r':
                return Integer.valueOf(this.a.o(str, str2));
            case 14:
                return Boolean.valueOf(this.a.p(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"navi.is.cruise", "navi.is.explore.path", "navi.is.navigation", "navi.common.addr.get", "navi.get.navigation.info", "navi.is.zoomin.max", "navi.is.zoomout.min", "navi.is.calculate.path", "navi.favorite.open.status", "navi.open.controls.status", "navi.main.road.status", "navi.side.road.status", "navi.scale.current.level", "navi.poi.details.favorite.status", "navi.is.sr"};
    }
}
