package ru.progwards.java1.lessons.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//Реализовать динамический, саморастущий массив целых чисел, по следующей спецификации:
public class DIntArray {
//3.1 в классе разместить private переменную - массив целых чисел.
    private int[] myArray = {};
    //3.2 конструктор - по умолчанию.
    public  DIntArray() {
    }
//3.2 метод
    //public void add(int num) - добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1.
    // Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, и добавить в хвост элемент num.
    public void add(int num){
        // Создаем новый массив - его размер больше на 1 единицу от созданного
        int[] newArray = new int[myArray.length + 1];
        // Используем System.arrayCopy(from, fromIndex, to, toIndex, count)
        // Копируем столько элементов сколько в начальном массиве (если 1 элемент в начальном то 1, если 2 то 2)
        // Определяем по length
        System.arraycopy(myArray, 0, newArray, 0, myArray.length);
        // Но так как созданный массив на 1 больше (и массив начинается с 0 - 1 элемент, 1 - 2 элемент)
        // то по индексу который соответствует длине прошлого массива закидываем элемент в новый массив
        // например newArray[1] = добавленное число. По факту длина массива будет 2 уже
        newArray[myArray.length] = num;
        // Теперь соединяю ссылку (старое имя массива на новый объект) Оба будут привязаны к 1му объекту
        myArray = newArray;
    }
//3.3 метод
    //public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива, при этом размер массива
    // должен увеличиться на 1. Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый,
    // c учетом того, что новый элемент окажется где-то в середине, и потом положить в нужный индекс элемент num.
    public void atInsert(int pos, int num){
        // Создаем новый массив - его размер больше на 1 единицу от созданного
        int[] newArray = new int[myArray.length + 1];
        // Если добавляем элемент в начало массива, то проверяем индекс на 0
        if(pos == 0) {
            // Копируем исходный массив в новый с первого индекса, количество копируем равное исходному
            // 0 элемент будет равен 0 по умолчанию. В него записываем наше число
            System.arraycopy(myArray, 0, newArray, 1, myArray.length);
            newArray[0] = num;
        }
        else {
            // Копируем первую часть исходного массива в новый. Количество будет равно позиции записи
            // Например 0,1,2,3 -> хотим вставить во вторую позицию новый элемент 999
            // Новый должен быть 0,1,999,2,3
            System.arraycopy(myArray,0, newArray, 0, pos);
            // Записываем наше число по индексу позиции в новый массив
            newArray[pos] = num;
            // Добавляем вторую половину исходного массива с элемента позиции - помним что исходный массив
            // 0,1,2,3, т.е. берем 2,3
            // Копируем в новый массив но уже с позиции на 1 больше, т.к. в текущий момент массив 0,1,999
            // Ну и конечно количество берем от исходного минус позиция 0,1,2,3 (длина 4 минус 2я позиция = 2 числа)
            // Если взять другой массив для примера 0,1,2,3,4,5 -> хотим вставить в 4ю позицию то длина 6 - 4 = 2 эл.
            // И другая ситуация в первую позицию длина 6 - позиция 1 = 5 элементов
            System.arraycopy(myArray, pos, newArray, pos + 1, myArray.length - pos );
        }
        myArray = newArray;
    }
//3.4 метод
    //public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться
    // на 1. Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, уже без элемента,
    // который был в позиции pos.
    public void atDelete(int pos){
        // Создаем новый массив, конечно на 1 меньше, т.к. будет удаление
        int[] newArray = new int[myArray.length - 1];
        // Теперь реализуем алгоритм удаления
        // Проверим на удаление элмента из начала списка
        if (pos == 0){
            // Копируем из исходного массива с первого индекса и вставляем в новый с 0го индекса
            // Количество элементов равно длине нового массива
            System.arraycopy(myArray, 1, newArray, 0, newArray.length);
        }
        // Проверим на удаление элемента из конца списка
        else if (pos == myArray.length - 1){
            // Копируем из исходного массива с 0го индекса и вставляем в новый с 0го индекса
            // Количество элементов равно длине нового массива
            System.arraycopy(myArray, 0, newArray, 0, newArray.length);
        }
        else {
            // Если удаляем из середины то алгоритм такой:
            // Берем первую часть исходного массива и вставляем в новый - количество равно позиции удаляемого элемента
            // Дальше берем следующую часть исходного массива и вставляем в новый
            // Тонкость здесь в количестве вставляемых элементов
            // Их будет длина исходного массива - позиция и еще вычитаем 1 единицу чтобы получить актуальное количество
            // Для примера 0, 1, 2, 3, 4 -> удаляем второй элемент -> Длина массива 5 - позиция 2 = 3 (но элементов 2)
            // и это справедливо - поэтому исскуственно вычтем еще 1 единицу для корректного количества копируемых
            // во второй части элементов.
            System.arraycopy(myArray, 0, newArray, 0, pos);
            System.arraycopy(myArray, pos + 1, newArray, pos, myArray.length - pos - 1);
        }
        myArray = newArray;
    }
//3.5 метод
    //public int at(int pos) - возвращает элемент по индексу pos.
    public int at(int pos){
        return myArray[pos];
    }

// Тестируем то что получилось -> главная точка входа в программу
    public static void main(String[] args) {
        DIntArray ar = new DIntArray();
        // Ввел позицию для нормального вывода последней строки
        int pos = 1;
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.atInsert(1,999);
        ar.atDelete(4);
        System.out.println("Выбор элемента по индексу " + pos + " = " + ar.at(1));
    }
}