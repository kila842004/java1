package ru.progwards.java1.lessons.test;

public class Concat {
    static int addAsStrings(int n1, int n2){
        String str = String.valueOf(n1) + String.valueOf(n2);
        Integer x = Integer.valueOf(str);
        return x;
    }

    public static void main(String[] args) {
        addAsStrings(5,7);
    }
}
