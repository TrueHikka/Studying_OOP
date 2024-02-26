package org.example.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        //Сложение
        System.out.println(calculator.add(4, 3));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(calculator.add(arr));

        System.out.println(calculator.add(4, 1, 3, 4, 6, 7, 8));

        //Вычитание
        System.out.println(calculator.subtract(4, 3));

        //Умножение
        System.out.println(calculator.multiply(4, 3));

        //Деление
        System.out.println(calculator.divideInt(5, 2));
        System.out.println(calculator.divideDouble(5, 3));

    }
}
