package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit){
        int current_digit = number % 10;
        int current_number = number / 10;
        if (current_number == 0){
            if (number == digit){
            return true;
            }
            else return false;
        }
        else {
            while (current_number != 0){
                if (current_digit == digit) return true;
                current_digit = current_number % 10;
                current_number = current_number / 10;
            }
            if (current_digit == digit){
                return true;
            }
            else return false;
        }
    }
    public static int fiboNumber(int n){
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int current_iter = 2;
        int fibo_a = 1;
        int fibo_b = 1;
        int sum_fibo = 0;
        do {
            sum_fibo = fibo_a + fibo_b;
            fibo_a = fibo_b;
            fibo_b = sum_fibo;
            current_iter++;
            }
        while (current_iter != n);
        return sum_fibo;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){
        int current_footing = 0;
        int current_side = 0;
        Double div_foot_side = 0.0;
        if (a == b || b == c || a == c) {
            if (a == b) {
                current_footing = c;
                current_side = a;
            }
            else if (b == c) {
                current_footing = a;
                current_side = b;
            }
            else {
                current_footing = b;
                current_side = a;
            }
            div_foot_side = (double)current_side / current_footing;
            if (div_foot_side >= 1.61703 && div_foot_side <= 1.61903) return true;
            else return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int count_fibo = 15;
        int fibo_a = 1, fibo_b = 1;
        System.out.println(fibo_a);
        System.out.println(fibo_b);
        int sum_fibo = 2, current_iter = 2;
        while (current_iter < count_fibo) {
            sum_fibo = fibo_a + fibo_b;
            fibo_a = fibo_b;
            fibo_b = sum_fibo;
            System.out.println(sum_fibo);
            current_iter++;
        }
    }
    //3.1 Реализовать функцию
    //public static boolean containsDigit(int number, int digit), которая будет возвращать true, если число number содержит цифру digit.
    //
    //Теперь проведём исследование. Есть ли у Золотого треугольника связь с числами Фибоначчи. Золотой треугольник это равнобедренный треугольник у которого ребро относится к основанию как 1.61803 (приблизительно), то есть по правилу Золотого сечения. Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ... в котором первые два элемента равны 1, а каждый следующий равен сумме двух предыдущих.
    //Для проведения этого исследования нам придётся решить две задачи.
    //
    //3.2 Реализовать, используя любой цикл, функцию
    //public static int fiboNumber(int n), которая будет возвращать n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).
    //3.3 Реализовать функцию
    //public static boolean isGoldenTriangle(int a, int b, int c), которая будет возвращать true, если треугольник со сторонами a, b, c является Золотым.
    // Определим критерии. Он должен быть равнобедренным и отношение ребра к основанию должно лежать между значениями 1.61703 и 1.61903.
    //Далее в функции public static void main(String[] args) вывести на консоль, используя цикл, 15 первых чисел Фибоначчи.
    // после этого, используя вложенные циклы, определить: есть ли среди треугольников, длины сторон которых являются
    // натуральными числами не превышающими 100, Золотые треугольники. И если есть, вывести на консоль длины основания и
    // рёбер этих треугольников.
    //Если всё получилось, посмотрите на консоль и сделайте вывод: есть ли связь между числами Фибоначчи и Золотыми треугольниками.
}
