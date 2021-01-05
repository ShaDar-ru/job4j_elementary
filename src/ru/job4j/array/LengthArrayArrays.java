package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
        System.out.println("--------разделительная полоса--------");

        double[][] nums = {{1.0}, {2.0, 2.1}, {3.0, 3.1, 3.2}, {4.0, 4.1, 4.2, 4.3}};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + nums[i].length
            );
        }
    }
}