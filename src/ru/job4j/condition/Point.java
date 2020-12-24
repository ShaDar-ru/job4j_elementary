package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double rsl = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(10, 10, 20, 20);
        System.out.println("result (10, 10) to (20, 20) " + result);
        result = Point.distance(7, 14, 25, 30);
        System.out.println("result (7, 14) to (25, 30) " + result);
    }
}
