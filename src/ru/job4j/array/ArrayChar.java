package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int i = 0;
        while (i < pref.length) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
            i++;
        }
        return result;
    }
}
