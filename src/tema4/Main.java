package tema4;

public class Main {
    public static void main(String[] args) {

        SmartDevice swatch = new SmartWatch(6, "Xiaomi", "X2022", 30);
        SmartDevice sphone = new SmartPhone(30,"Samsung", "Sam2020", "Estereo");

        System.out.println(swatch.toString());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(sphone.toString());
    }
}
