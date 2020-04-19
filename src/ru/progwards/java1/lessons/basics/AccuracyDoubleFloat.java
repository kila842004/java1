package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static final double PI_DBL= 3.14;
    public static final float PI_FLT = 3.14F;
    public static final double EARTH_SQR_DBL = 6371.2;
    public static final float EARTH_SQR_FL = 6371.2F;
    public static double volumeBallDouble(double radius){
        Double volumeDbl = (4 / 3) * PI_DBL * radius * radius * radius;
        return volumeDbl;
    }
    public static float volumeBallFloat(float radius){
        Float volumeFl = (4 / 3) * PI_FLT * radius * radius * radius;
        return volumeFl;
    }
    public static double calculateAccuracy(double radius){
        Double sub = volumeBallFloat((float) radius) - volumeBallDouble(radius);
        System.out.println(sub);
        return sub;
    }
}
