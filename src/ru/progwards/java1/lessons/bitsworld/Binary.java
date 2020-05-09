package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    //3.1 Реализовать конструктор
    //public Binary(byte num).
    // Создаем свойство num
    byte num;
    // Конструктор который принимает num
    public Binary(byte num){
        this.num = num;
    }

    //3.2 Реализовать метод
    //public String toString(), который возвращает двоичное представление числа типа byte, используя только
    // битовые операции. В выводимом значении всегда должно быть 8 символов
    @Override
    public String toString(){
        int mask = 64;
        int num = this.num;
        String value = "";
        // Если число положительное то ставим первым символом в байте (строке) 0 (положительное число или 0)
        if(num >= 0) {
            value = "0";
        }
        // Если число отрицательное то ставим первым символом в байте (строке) 1 (отрицательное число)
        else {
            value = "1";
        }
        // Теперь в цикле проверяем число с маской. Если при операции & число будет как маска значит в текущем бите 1
        // Иначе в текущем бите 0 и после этого двигаем наше текущее число влево на 1 символ (алгоритм :) )
        for (int i = 0; i < 7; i++){
            if((num & mask) == mask){
                value += "1";
            }
            else {
                value += "0";
            }
            num <<= 1;
        }
        return value;
    }
    //Например:
    //0: "00000000"
    //1: "00000001"
    //127: "01111111"
    //-128: "10000000"
    //-1: "11111111"
    public static void main(String[] args) {
        Binary val = new Binary((byte) -2);
        System.out.println(val.toString());
    }
}

