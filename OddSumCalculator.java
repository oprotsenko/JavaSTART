package com.oprotsen.JavaSTART;

public class OddSumCalculator {
    //Найти сумму всех нечетных чисел от 100 до 300.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i < 300; ) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}
