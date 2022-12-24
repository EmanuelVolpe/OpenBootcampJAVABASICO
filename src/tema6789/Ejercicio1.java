package tema6789;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] arr = {"Hola", "mundo", "Hola", "Messi"};

        devuelveItems(arr);
    }
    public static void devuelveItems(String[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + " ");
        }
    }
}
