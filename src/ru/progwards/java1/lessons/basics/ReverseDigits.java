package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        Integer firstNum = number / 100;
        Integer firstOst = number % 100;
        Integer secondNum = firstOst / 10;
        Integer secondOst = firstOst % 10;
        String reverseNumStr = secondOst.toString() + secondNum.toString() + firstNum.toString();
        Integer reverseNumInt = Integer.valueOf(reverseNumStr);
        return reverseNumInt;
    }
}
