package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static final double PI = 3.14;
    public static final double EARTH_SQR = 6371.2;
    public static final double MERCURIY_SQR = 2439.7;
    public static final double JUPITER_SQR = 71492;
    public static Double sphereSquare(Double r){
        Double Square = 4 * PI * r * r;
        return Square;
    }
    public static Double earthSquare(){
        double earth = sphereSquare(EARTH_SQR);
        return earth;
    }
    public static Double mercurySquare(){
        double mercury = sphereSquare(MERCURIY_SQR);
        return mercury;
    }
    public static Double jupiterSquare(){
        double jupiter = sphereSquare(JUPITER_SQR);
        return jupiter;
    }
    public static Double earthVsMercury(){
        Double earth = earthSquare();
        Double mercury = mercurySquare();
        Double otn = earth / mercury;
        return otn;
    }
    public static Double earthVsJupiter(){
        Double earth = earthSquare();
        Double jupiter = jupiterSquare();
        Double otn = jupiter / earth;
        return otn;
    }
}
