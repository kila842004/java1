package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        if ((a + b) > c && (a + c) > b && (b + c) > a)
            return true;
        return false;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        if((a + b) * (a + b) == c * c)
            return true;
        return false;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        if (a == b || a == c || b == c)
            return true;
        return false;
    }
}