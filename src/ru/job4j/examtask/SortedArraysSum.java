package ru.job4j.examtask;

public class SortedArraysSum {
    public static int[] arraysSum(int[] arrA, int[] arrB) {
        int[] arrC = new int[arrA.length + arrB.length];
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < arrC.length; i++) {
            if (countA < arrA.length && countB < arrB.length) {
                if (arrA[countA] < arrB[countB]) {
                    arrC[i] = arrA[countA];
                    countA++;
                } else {
                    arrC[i] = arrB[countB];
                    countB++;
                }
            } else {
                if (countA >= arrA.length) {
                    arrC[i] = arrB[countB];
                    countB++;
                } else {
                    arrC[i] = arrA[countA];
                    countA++;
                }
            }
        }
        return arrC;
    }
}
