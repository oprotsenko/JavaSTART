package com.oprotsen.JavaSTART;

public class AverageCalculator {
    //Найти среднее арифметическое всех чисел из заданного массива

    public static void main(String[] args) {
        int[] array = {17,79,42,80,50,71,33,53,20,76,70,46,63,20,22,
                44,44,53,55,66,46,68,66,69,61,49,10,15,31,10,25,46,
                54,31,27,65,10,71,70,13,16,71,12,55,52,74,30,14,80,46
        };
        System.out.println(findAverage(array));
    }

    private static int findAverage(int[] array) {
        int sum = 0;
        for (int elem: array) {
            sum += elem;
        }
        return sum/array.length;
    }
}
