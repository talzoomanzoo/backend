package com.talzoo.ex02;

public class Earth {
    public static final double EARTH_RADIUS = 6400; // 상수: public static final
    public static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}