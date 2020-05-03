package ru.progwards.java1.lessons.test;

public class Person {
//  Свойства
    private String name;
    private String country;
    private int age;

//  Конструктор по умолчанию
    public Person(){
        country = "RU";
    }
//  Второй конструктор
    public Person(String name, int age){
        this();
        this.age = age;
        this.name = name;
    }
//  Методы
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }

    public static void main(String[] args) {
        Person person1 =  new Person("Вася", 25);
        System.out.println(person1.getAge());
        System.out.println(person1.getCountry());
        System.out.println(person1.getName());
    }
}
