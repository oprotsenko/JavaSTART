package com.oprotsen.JavaSTART;

public class Fibonacci {
    public static void main(String[] args) {
    //Найти 10000-й элемент последовательности Фибонначи.
        System.out.println(fibonacci(10000));
    }

    public static long fibonacci(int n) {
        long f1 = 0;
        long f2;
        long fSum = 1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n >= 2) {
            for (; n > 1; n--) {
                f2 = fSum;
                fSum = f1 + f2;
                f1 = f2;
            }
        }
        return fSum;
    }
}
