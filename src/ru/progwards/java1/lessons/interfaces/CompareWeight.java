package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {
    // Создаем перечисление CompareResult {LESS, EQUAL, GREATER}
    public enum CompareResult {LESS, EQUAL, GREATER};
    //Интерфейс содержит метод public CompareResult compareWeight(CompareWeight smthHasWeigt)
    public CompareResult compareWeight(CompareWeight smthHasWeigt);
}
