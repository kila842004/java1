package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        Integer firstNum = number / 100;
        Integer firstOst = number % 100;
        Integer secondNum = firstOst / 10;
        Integer secondOst = firstOst % 10;
        Integer reverseNumInt = secondOst * 100 + secondNum * 10 + firstNum;
        return reverseNumInt;
    }
}
