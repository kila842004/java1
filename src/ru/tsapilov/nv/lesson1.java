package ru.tsapilov.nv;

public class lesson1 {
    static double fractional(double num){
        Double x = num % 1;
        return x;
    }
    public static void main(String[] args) {
        fractional(1.52);
    }
}
