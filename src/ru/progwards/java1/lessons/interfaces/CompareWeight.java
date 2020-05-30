package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {
    // Создаем перечисление CompareResult {LESS, EQUAL, GREATER}
    public enum CompareResult {LESS, EQUAL, GREATER};
    //Интерфейс содержит метод public CompareResult compareWeight(CompareWeight smthHasWeigt)
    public CompareResult compareWeight(CompareWeight smthHasWeigt);

    static public void sort(CompareWeight[] a) {
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if (a[i].compareWeight(a[j]) == CompareResult.GREATER) {
                    CompareWeight cur_num = a[j];
                    a[j] = a[i];
                    a[i] = cur_num;
                }
            }
        }
    }
}
