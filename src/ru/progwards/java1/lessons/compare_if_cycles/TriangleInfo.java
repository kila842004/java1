package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        if ((a + b) > c && (a + c) > b && (b + c) > a)
            return true;
        return false;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        if((a * a) + (b * b) == c * c)
            return true;
        else if ((a * a) + (c * c) == b * b)
            return true;
        else if ((b * b) + (c * c) == a * a)
            return true;
        else
            return false;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        if (a == b || a == c || b == c)
            return true;
        return false;
    }

    public static void main(String[] args) {
        boolean res = isRightTriangle(4,5,4);
        System.out.println(res);
    }
}