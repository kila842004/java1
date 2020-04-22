package ru.progwards.java1.lessons.test;

public class Ocenks {
    static String textGrade(int grade){
        String result;
        if (grade == 0)
            result = "не оценено";
        else if (grade >= 1 && grade <= 20)
            result = "очень плохо";
        else if (grade >= 21 && grade <= 40)
            result = "плохо";
        else if (grade >= 41 && grade <= 60)
            result = "удовлетворительно";
        else if (grade >= 61 && grade <= 80)
            result = "хорошо";
        else if (grade >= 81 && grade <= 100)
            result = "отлично";
        else
            result = "не определено";
        return result;
    }

    public static void main(String[] args) {
        textGrade(45);
    }
}
