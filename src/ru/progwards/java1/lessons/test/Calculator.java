package ru.progwards.java1.lessons.test;

public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }
    // Реализуем метод Set для установки result в num
    public int set(int num){
        return result = num;
    }
    // Реализуем метод add для увеличения result на num
    public int add(int num){
        return result += num;
    }
    // Реализуем метод sub для уменьшения result на num
    public int sub(int num){
        return result -= num;
    }

    public int getResult() {
        return result;
    }
}
