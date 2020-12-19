package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static  int euroToRuble(int value){
        int rsl = value * 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int dollarToRuble(int value){
        int rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        int dollFromRubs = Converter.dollarToRuble(2);
        int eurFromRubs = Converter.euroToRuble(2);
        System.out.println(Converter.euroToRuble(euro) + " rubles are "  + euro + " euro.");
        System.out.println(Converter.dollarToRuble(dollar) + " rubles are " + dollar + " dollar.");
        System.out.println(Converter.rubleToDollar(dollFromRubs) + " dollars are " + dollFromRubs + " rubles.");
        System.out.println(Converter.rubleToEuro(eurFromRubs) + " euro are " + eurFromRubs + " rubles.");
    }
}
