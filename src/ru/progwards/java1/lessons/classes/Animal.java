package ru.progwards.java1.lessons.classes;

import java.net.HttpURLConnection;

public class Animal {

    // Добавляем поле weight
    double weight;
    enum AnimalKind { ANIMAL, COW, HAMSTER, DUCK };
    enum FoodKind { UNKNOWN, HAY, CORN };

    // Создаем конструктор Animal
    public Animal(double weight){
        this.weight = weight;
    }

    // Создаем новый метод AnimalKind
    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }

    // Создаем новый метод FoodKind
    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }

    // Создаем новый метод getWeight() -> возвращает вес животного
    public double getWeight(){
        return this.weight;
    }

    // Создаем новый метод getFoodCoeff() -> возвращает возвращает коэффициент веса еды к весу тела животного.
    // Для класса Animal это 0.02
    public double getFoodCoeff(){
        return 0.02;
    }

    //Создаем метод calculateFoodWeight(),
    // который рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight(){
        return this.weight * this.getFoodCoeff();
    }

    //Создаем метод toStringFull(), что бы он возвращал информацию о животном в формате:
    //I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
    public String toStringFull(){
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    // Перекрываем метод предка toString
    @Override
    public String toString(){
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    public static void main(String[] args) {
        //Создаем animal и выводим результаты методов -> Тест
        Animal animal = new Animal(100);
        System.out.println(animal.toString());
        System.out.println(animal.getWeight());
        System.out.println(animal.getFoodCoeff());
        System.out.println(animal.calculateFoodWeight());
        System.out.println(animal.toStringFull());

        //Создаем cow (корова) и выводим результаты методов -> Тест
        Cow cow = new Cow(500);
        System.out.println(cow.toString());
        System.out.println(cow.getWeight());
        System.out.println(cow.getFoodCoeff());
        System.out.println(cow.calculateFoodWeight());
        System.out.println(cow.toStringFull());

        //Создаем hamster (хомяк) и выводим результаты методов -> Тест
        Hamster hamster = new Hamster(0.2);
        System.out.println(hamster.toString());
        System.out.println(hamster.getWeight());
        System.out.println(hamster.getFoodCoeff());
        System.out.println(hamster.calculateFoodWeight());
        System.out.println(hamster.toStringFull());

        //Создаем duck (утка) и выводим результаты методов -> Тест
        Duck duck = new Duck(4);
        System.out.println(duck.toString());
        System.out.println(duck.getWeight());
        System.out.println(duck.getFoodCoeff());
        System.out.println(duck.calculateFoodWeight());
        System.out.println(duck.toStringFull());
    }
}
