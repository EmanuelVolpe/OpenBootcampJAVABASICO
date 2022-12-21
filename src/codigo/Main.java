package codigo;

public class Main {
    public static void main(String[] args) {
        //Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.

        int num1 = 12;
        long num2 = 1222223;
        double num3 = 12.3;
        boolean isTrue = true;
        String nombre = "Emanuel";

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(isTrue);
        System.out.println(nombre);

        //System.out.println(devuelvePrecioConIVA(100.00));

        String[] arregloPalabras = {"Pepe", "Juan", "Anthony"};
        System.out.println(concatenaPalabras(arregloPalabras));
    }
    public static double devuelvePrecioConIVA(double precio){
        final double IVA = 0.21;
        return precio + precio*IVA;
    }

    public static String concatenaPalabras(String[] palabras){
        String cadena = "";
        for (int i = 0; i < palabras.length ; i++) {
            cadena += palabras[i] + " ";
        }
        return cadena;
    }
}
