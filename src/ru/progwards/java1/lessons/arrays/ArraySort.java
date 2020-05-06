package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {

    public static void sort(int[] a){
        // Организуем внешний цикл перебора значений - все основное будет делаться во внутреннем цикле
        for (int i = 0; i < a.length; i++){
            // Организуем внутренний цикл - перебирать начинаем от следующего значения внешнего цикла
            for (int j = i + 1; j < a.length; j++){
                // Создаем две вспомогательные переменные - одна из них берет значение по индексу внешнего цикла
                int current_number = a[i];
                int sort_number = a[j];
                // Если текущее число (т.е. первое по внешнему циклу например a[0] больше следующего a[1]
                // то меняем их местами. При этом когда мы перейдем на 13 строку то в current_number
                // запишется новое а[i] по внешнему циклу и мы таким образом продолжим сравнивать
                // первое число в массиве с другими. Результатом будет минимальное число в массиве на первом месте
                // Дальше перещелкиваем внешний цикл на след число и заново ищем второе по минимальности число
                if (current_number > sort_number){
                    a[i] = sort_number;
                    a[j] = current_number;
                }
            }
        }


    }

    public static void main(String[] args) {
        // Создаем массив для проверки и его сортируем
        int[] myArray = {3, 4, 2, 0, 1};
        sort(myArray);
    }
}
