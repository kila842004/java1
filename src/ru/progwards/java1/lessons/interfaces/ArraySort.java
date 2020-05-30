package ru.progwards.java1.lessons.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArraySort implements CompareWeight{

    public static void sort(CompareWeight[] a) {
        CompareWeight temp_number;
        // Организуем внешний цикл перебора значений - все основное будет делаться во внутреннем цикле
        System.out.println("Внешний цикл начало");
        for (int i = 0; i < a.length; i++) {
            // Организуем внутренний цикл - перебирать начинаем от следующего значения внешнего цикла
            System.out.println("Внутренний цикл начало");
            for (int j = i + 1; j < a.length; j++) {
                // Если текущее число (т.е. первое по внешнему циклу например a[0] больше следующего a[1]
                // то меняем их местами. При этом когда мы перейдем на 13 строку то в current_number
                // запишется новое а[i] по внешнему циклу и мы таким образом продолжим сравнивать
                // первое число в массиве с другими. Результатом будет минимальное число в массиве на первом месте
                // Дальше перещелкиваем внешний цикл на след число и заново ищем второе по минимальности число
                if (a[i].compareWeight(a[j]) == CompareResult.GREATER) {
                      temp_number = a[i];
                      a[i] = a[j];
                      a[j] = temp_number;
                      System.out.println("Выход из if");
                   }
            }
        }
    }
        @Override
        public CompareResult compareWeight(CompareWeight smthHasWeigt) {
            return null;
        }

    public static void main(String[] args) {
        Food food1 = new Food(25);
        Food food2 = new Food(255);
        Food food3 = new Food(55);
        Food food4 = new Food(2515);
        Food food5 = new Food(235);
        CompareWeight [] a = {food1,food2,food3,food4,food5};
        sort(a);
    }
}
