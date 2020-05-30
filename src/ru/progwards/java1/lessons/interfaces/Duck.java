package ru.progwards.java1.lessons.interfaces;

// Реализуем класс потомок Duck потомок Animal
public class Duck extends Animal {
    // Конструктор с вызовом родительского конструктора
    Duck(double weight) {
        super(weight);
    }
    //Перекрываем оба родительских метода
    @Override
    public AnimalKind getKind(){
        return AnimalKind.DUCK;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    // Переопределяем родительский метод getFoodCoeff() -> возвращает возвращает коэффициент веса еды к весу тела
    // животного. Для класса Hamster это 0.04
    @Override
    public double getFoodCoeff(){
        return 0.04;
    }
}
