package ru.progwards.java1.lessons.interfaces;

// Реализуем класс Cow потомок Animal
public class Cow extends Animal {
    // Конструктор с вызовом родительского конструктора
    Cow(double weight) {
        super(weight);
    }
    //Перекрываем оба родительских метода
    @Override
    public AnimalKind getKind(){
        return AnimalKind.COW;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.HAY;
    }

    // Переопределяем родительский метод getFoodCoeff() -> возвращает возвращает коэффициент веса еды к весу тела
    // животного. Для класса Cow это 0.03
    @Override
    public double getFoodCoeff(){
        return 0.05;
    }
}
