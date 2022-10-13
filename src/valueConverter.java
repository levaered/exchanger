public class valueConverter {
    public static void metersToCentimeters(double num) {
        num = num * 100;
        System.out.println("Метры в сантиметры: " + num);
    }
    public static void metersToKillometers(double num) {
        num = num / 1000;
        System.out.println("Метры в киллометры: " + num);
    }
    public static void gramsToLitters(double num) {
        num = num / 1000;
        System.out.println("Граммы в литрах: " + num);
    }
    public static void littersToHalons(double num) {
        num = num * 0.219969;
        System.out.println("Литры в галонах " + num);
    }

    public static void celsiusToFahrenheit(double num){
        num = ((num * 1.8000) + 32);
        System.out.println("Цельсия в Фаренгейтах " + num);
    }
}
