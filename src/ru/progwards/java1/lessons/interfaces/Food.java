package ru.progwards.java1.lessons.interfaces;

//3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.
//3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах, реализовать в классе конструктор,
// принимающий и устанавливающий значение веса.
public class Food implements CompareWeight {
    private int weight;
    Food (int weight) {
        this.weight = weight;
    }
    //3.7 Реализовать метод public int getWeight(), возвращающий сохраненное значение веса.
    public int getWeight(){
        return this.weight;
    }
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight){
        Food food = (Food)smthHasWeight;
        if(this.weight > food.weight){
            return CompareResult.GREATER;
        }
        if(this.weight == food.weight){
            return CompareResult.EQUAL;
        }
        return CompareResult.LESS;
    }
}
