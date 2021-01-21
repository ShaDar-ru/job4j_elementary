package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int countA = 1;
        for (int i = 0; i < count; i++) {
            int[] a = new int[i + 1];
            triangle[i] = a;
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = countA++;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        int[][] triangle = TriangleMatrix.rows(3);
        for (int[] a : triangle) {
            System.out.println(Arrays.toString(a));
        }
    }
}