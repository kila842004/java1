package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static int fiboNumber(int n){
        if (lastFibo == null) {
            System.out.println("lastFibo == null");
            lastFibo = new CalculateFibonacci.CacheInfo();
        }
        if (lastFibo.n == n) {
            System.out.println("Пользуюсь кэшем - " + lastFibo.n);
            return lastFibo.fibo;
        }

        // Если мы до сих пор не вышли отсюда то тогда делаем рассчет фибоначи для n
        if (n == 0) return 0;
        if (n == 1) return 1;

        int f1 = 0;
        int f2 = 1;
        for (int i = 1; i < n; i++){
            lastFibo.fibo = f1 + f2;
            f1 = f2;
            f2 = lastFibo.fibo;

        }
        lastFibo.n = n;
        return lastFibo.fibo;
    }
    // Реализуем вложенный класс CahceInfo с 2мя полями и сразу пропишем конструктор. Конструктор устанавливает поля в 0
    public static class CacheInfo{
        public int n;
        public int fibo;
    }

    public static CacheInfo getLastFibo(){
        return lastFibo;
    }
    public static void clearLastFibo(){
        lastFibo = null;
    }

    public static void main(String[] args) {
        System.out.println(CalculateFibonacci.fiboNumber(29));
        System.out.println(CalculateFibonacci.getLastFibo().fibo);
        System.out.println(CalculateFibonacci.getLastFibo().n);

    }
}

