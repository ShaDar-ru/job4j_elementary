package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        // int res = first >= second ? first : second;
        // return res >= third ? res : third;
        if (first >= second && first >= third) {
            return first;
        } else {
            if (second >= third) {
                return second;
            } else {
                return third;
            }
        }
    }
}
