public class valueConverter {
    public static void metersToCentimeters(double num) {
        num = num * 100;
        System.out.println("Метры в сантиметры: " + num);
    }
    public static void metersToKillometers(double num) {
        num = num / 1000;
        System.out.println("Метры в киллометры: " + num);
    }
}
