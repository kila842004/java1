package ru.progwards.java1.lessons.classes;

// Реализуем класс Hamster потомок Animal
public  class Hamster extends Animal {
    // Конструктор с вызовом родительского конструктора
    Hamster(double weight) {
        super(weight);
    }
    //Перекрываем оба родительских метода
    @Override
    public AnimalKind getKind(){
        return AnimalKind.HAMSTER;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    // Переопределяем родительский метод getFoodCoeff() -> возвращает возвращает коэффициент веса еды к весу тела
    // животного. Для класса Hamster это 0.03
    @Override
    public double getFoodCoeff(){
        return 0.03;
    }
}