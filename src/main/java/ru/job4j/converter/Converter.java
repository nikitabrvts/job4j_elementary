package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float ruToDoll = value / 70;
        return ruToDoll;
    }

    public static float rubleToDollar(float value) {
        float ruToEur = value / 60;
        return ruToEur;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float doll = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + euro + " doll.");

    }
}