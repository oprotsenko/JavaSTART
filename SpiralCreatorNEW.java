package com.oprotsen.JavaSTART.Lesson6.Level2;

import java.util.Arrays;

public class SpiralCreatorNEW {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 9;

        printSpiral(createSpiral(rows,cols));
    }

    private static int[][] createSpiral(int rows, int cols) {
        checkForNegative(rows, cols);
        int[][] spiralMatrix = new int[rows][cols];
        int r = 0, c = 1, filler = 1, x = 0, y = 0;

        for (; filler <= rows * cols; r++, c++) {
            if (x == r && y == r)
                for (; x <= cols - c; x++) spiralMatrix[y][x] = filler++;
            if (x == cols - r) {
                x--;
                y++;
            } if (x == cols - c && y == c)
                for (; y <= rows - c; y++) spiralMatrix[y][x] = filler++;
            if (y == rows - r) {
                y--;
                x--;
            } if (y == rows - c && x == cols - c - 1)
                for (; x >= r; x--) spiralMatrix[y][x] = filler++;
            if (x == r - 1) {
                x++;
                y--;
            } if (x == r && y == rows - c - 1)
                for (; y >= c; y--) spiralMatrix[y][x] = filler++;
            if (y == r) {
                y++;
                x++;
            } if (x == c && y == c)
                for (; x <= cols - (c + 1); x++) spiralMatrix[y][x] = filler++;
        }
        return spiralMatrix;
    }

    private static void checkForNegative(int rows, int cols) {
        if (rows < 0 || cols < 0)
            throw new IllegalArgumentException();
    }

    private static void printSpiral(int[][] spiralMatrix) {
        for (int[] elem : spiralMatrix)
            System.out.println(Arrays.toString(elem));
    }
}
