package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("ages: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("surnames: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Вася Васечкин";
        names[1] = "Петя Петров";
        names[2] = "Дима Дмитричев";
        names[3] = "Иван Иванов";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
