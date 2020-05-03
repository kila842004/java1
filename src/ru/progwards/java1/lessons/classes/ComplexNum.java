package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    //Определяем нужные свойства a и b
    int a, b;
    //Конструктор - инициализирует a и b
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }

    //Переопределим родительский метод toString() - это тот же sout выводит на консоль когда приводит к строке
    //Он приводит к строке наши переменные и выдает в формате a+bi
    //Return -> При a=1 и b=56 - должно быть выдано 1+56i
    @Override
    public String toString(){
        return (this.a + "+" + this.b + "i");
    }

    //public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
    //(a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num){
        int a = this.a;
        int b = this.b;
        int c = num.a;
        int d = num.b;
        return new ComplexNum(a + c, b + d);
    }

    //public ComplexNum sub(ComplexNum num), вычитание комплексных чисел по формуле:
    //(a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num){
        int a = this.a;
        int b = this.b;
        int c = num.a;
        int d = num.b;
        return new ComplexNum(a - c, b - d);
    }

    //public ComplexNum mul(ComplexNum num), умножение комплексных чисел по формуле:
    //(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public ComplexNum mul(ComplexNum num){
        int a = this.a;
        int b = this.b;
        int c = num.a;
        int d = num.b;
        return new ComplexNum((a * c) - (b * d), (b * c) + (a * d));
    }

    //public ComplexNum div(ComplexNum num), деление комплексных чисел по формуле:
    //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num){
        int a = this.a;
        int b = this.b;
        int c = num.a;
        int d = num.b;
        return new ComplexNum((a * c + b * d)/(c * c + d * d), (b * c - a * d) / (c * c + d * d));
    }

    public static void main(String[] args) {
        ComplexNum complexNum1 = new ComplexNum(1, 56);
        ComplexNum complexNum2 = new ComplexNum(4, 44);
        System.out.println(complexNum1.add(complexNum2));
        System.out.println(complexNum1.sub(complexNum2));
        System.out.println(complexNum1.mul(complexNum2));
        System.out.println(complexNum1.div(complexNum2));
    }
}
