package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Animal implements FoodCompare, CompareWeight {

    // Добавляем поле weight
    double weight;
    // Добавляем необходимые Enum
    enum AnimalKind { ANIMAL, COW, HAMSTER, DUCK }
    enum FoodKind { UNKNOWN, HAY, CORN }

    // Создаем конструктор Animal
    public Animal(double weight){
        this.weight = weight;
        System.out.println("Вызываем конструктор Animal и принимаем значение - " + weight);
    }

    // Создаем новый метод AnimalKind
    public AnimalKind getKind(){
        System.out.println("Вызываем метод getKind для Animal и возвращаем - " + AnimalKind.ANIMAL);
        return AnimalKind.ANIMAL;
    }

    // Создаем новый метод FoodKind
    public FoodKind getFoodKind(){
        System.out.println("Вызываем метод getFoodKind и возвращаем - " + FoodKind.UNKNOWN);
        return FoodKind.UNKNOWN;
    }

    // Создаем новый метод getWeight() -> возвращает вес животного
    public double getWeight(){
        System.out.println("Вызываем метод getWeight и возвращаем - " + this.weight);
        return this.weight;
    }

    // Создаем новый метод getFoodCoeff() -> возвращает возвращает коэффициент веса еды к весу тела животного.
    // Для класса Animal это 0.02
    public double getFoodCoeff(){
        System.out.println("Вызываем метод getFoodCoeff и возвращаем - " + 0.02);
        return 0.02;
    }

    //Создаем метод calculateFoodWeight(),
    // который рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight(){
        System.out.println("Вызываем метод calculateFoodWeight и возвращаем - " + (this.weight * this.getFoodCoeff()));
        return this.weight * this.getFoodCoeff();
    }

    //Создаем метод toStringFull(), что бы он возвращал информацию о животном в формате:
    //I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
    public String toStringFull(){
        System.out.println("Вызываем метод toStringFull");
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    // Перекрываем метод предка toString
    @Override
    public String toString(){
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    // Перекрываем метод equals и сравниваем животных по весу. Но если сравниваются животные одного класса. Если
    // разные классы животных то конечно выдаем false. Использую конструктор Idea для перекрывания
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || this.getClass() != anObject.getClass()) return false;
        Animal animal = (Animal) anObject;
        return Double.compare(this.weight, animal.weight) == 0;
    }
    // Также конструктор перекрыл hashCode по весу
    @Override
    public int hashCode() {
        return Objects.hash(this.weight);
    }

    //public double getFood1kgPrice(), возвращает информацию о цене 1 кг еды.
    //метод реализован в виде switch по FoodKind со следующими значениями HAY : 20, CORN: 50, UNKNOWN: 0
    public double getFood1kgPrice(){
        switch (this.getFoodKind()){
            case CORN: return 50d;
            case HAY: return 20d;
            default: return 0d;
        }
    }

    //public double getFoodPrice(), возвращает информацию о цене еды для данного животного по формуле
    //calculateFoodWeight() * getFood1kgPrice()
    public double getFoodPrice(){
        return this.calculateFoodWeight() * this.getFood1kgPrice();
    }

    // public int compareFoodPrice(Animal aminal), возвращает результаты сравнения цены еды для данного животного
    // с ценой еды для другого животного, используя Double.compare;
    @Override
    public int compareFoodPrice(Animal animal) {
        return Double.compare(this.getFoodPrice(), animal.getFoodPrice());
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt){
        System.out.println("Внутри метода compareWeight");
        Animal animal = (Animal) smthHasWeigt;
        if (this.weight > animal.weight) {
            return CompareResult.GREATER;
        }
        else if (this.weight == animal.weight){
            return CompareResult.EQUAL;
        }
        else return CompareResult.LESS;
    }

    public static void main(String [] args) {
        Cow cow = new Cow(200);
        Cow cow2 = new Cow(199);
        System.out.println(cow.compareWeight(cow2));
    }
}
