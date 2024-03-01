package org.example.calculator;

import java.text.DecimalFormat;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
    public int add(int firstNum, int... otherNums) {
        for (int otherNum : otherNums) {
            firstNum += otherNum;
        }
        return firstNum;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

//    public int divideInt(int a, int b) {
//        if (b == 0) {
//            throw new Error("Делить на 0 нельзя!");
//        }
//
//        double result = 1.0 * a / b;
//        int intResult = (int) Math.floor(result);
//        double fractionalResult = result - intResult;
//
//        if (fractionalResult * 10 < 5) {
//            return (int) Math.floor(result);
//        } else {
//            return (int) Math.ceil(result);
//        }
//    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new Error("Делить на 0 нельзя!");
        }

        double res = 1.0 *  a/ b;

        return Math.round((res) * 100.0) / 100.0;

    }
}
