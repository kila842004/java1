package ru.progwards.java1.lessons.test;

public class factorial {
    static long factorial(long n){
        long result = 0L;
        long i = 0L;
        while(i <= n){
            if(i==0){
                result = 1;
                i++;
                continue;
            }
            result = result * i;
            i++;
        }
       return result;
    }
    public static void main(String[] args) {
        factorial(20L);
    }
}
