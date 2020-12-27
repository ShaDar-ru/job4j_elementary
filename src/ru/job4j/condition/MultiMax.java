package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        // int res = first >= second ? first : second;
        // return res >= third ? res : third;
        int res;
        if (first >= second) {
            res = first;
        } else {
            res = second;
        }
        if (res <= third) {
            res = third;
        }
        return res;
    }
}
