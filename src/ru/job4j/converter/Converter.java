package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int inRbToEu = 140;
        int expRbToEu = 2;
        int outRbToEu = Converter.rubleToEuro(inRbToEu);
        boolean passed = expRbToEu == outRbToEu;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int inRbToDl = 120;
        int expRbToDl = 2;
        int outRbToDl = Converter.rubleToDollar(inRbToDl);
        passed = expRbToDl == outRbToDl;
        System.out.println("120 rubles are 2. Test result : " + passed);
        int inDlToRb = 2;
        int expDlToRb = 120;
        int outDlToRb = Converter.dollarToRuble(inDlToRb);
        passed = expDlToRb == outDlToRb;
        System.out.println("2 dollars are 120 rubles. Test result : " + passed);
        int inEuToRb = 2;
        int expEuToRb = 140;
        int outEuToRb = Converter.euroToRuble(inEuToRb);
        passed = expEuToRb == outEuToRb;
        System.out.println("2 euro are 140 rubles. Test result : " + passed);
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        int dollFromRubs = Converter.dollarToRuble(2);
        int eurFromRubs = Converter.euroToRuble(2);
        System.out.println(Converter.euroToRuble(euro) + " rubles are " + euro + " euro.");
        System.out.println(Converter.dollarToRuble(dollar) + " rubles are " + dollar + " dollar.");
        System.out.println(Converter.rubleToDollar(dollFromRubs) + " dollars are " + dollFromRubs + " rubles.");
        System.out.println(Converter.rubleToEuro(eurFromRubs) + " euro are " + eurFromRubs + " rubles.");
    }
}
