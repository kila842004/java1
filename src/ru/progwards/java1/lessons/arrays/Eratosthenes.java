package ru.progwards.java1.lessons.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class Eratosthenes {
    // Объявляем свойство объекта -> массив булевых значений
    private boolean[] sieve;

    // Реализуем конструктор - создаем массив от 0 до N+1 (чтобы последнее число вошло в диапазон изучения)
    // Первым два числа не участвуют в просеивании -> они по умолчанию false (это 0 и 1)
    // После в конструкторе вызываем метод sift() и сразу при создании получаем просеянный массив чисел
    public Eratosthenes(int N){
        sieve = new boolean[N + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        sift();
    }

    // Реализуем метод просеивания
    private void sift() {
        // Устанавливаю cur_num = 2, т.к. во внешнем цикле используется как текущее проверяемое число
        int cur_num = 2;
        // Внешний цикл -> работает от 2ки до конца массива -> после каждого внутреннего перебора меняем число
        for (int i = 2; i < sieve.length; i++) {
            // Перед входом во внутренний цикл увеличиваем его на 1, чтобы начать работу с номера 3
            cur_num++;
            for (int j = cur_num; j < sieve.length; j++){
                // Если проверяемый элемент массива уже false (составное) ->
                // то смысла проверять его нет и скачем на след число
                if (!sieve[j]){
                    continue;
                }
                // Если остаток от деления равен 0, т.е. делимся на цело, то устанавливаем false
                // Текущее число нам не подходит
                if (j % i == 0){
                    sieve[j] = false;
                }
            }
        }
    }
   //  public boolean isSimple(int n), который возвращает sieve[n], что бы можно было узнать
   //  простое число n или составное
    public boolean isSimple(int n){
        // Здесь просто возвращаем элемент по индексу в массиве - уже после просеивания
        return sieve[n];
    }

    public static void main(String[] args) {
        // Создаем новый объект - через конструктор получается просеянный массив с размером 20
        Eratosthenes arr = new Eratosthenes(20);
        // Выводим нужное нам число на консоль для проверки
        System.out.println(arr.isSimple(7));
    }
}
