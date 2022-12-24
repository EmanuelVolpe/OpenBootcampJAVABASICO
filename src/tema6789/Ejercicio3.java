package tema6789;

import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        //Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<String> vector = new Vector<String>();
        vector.add("Manu");
        vector.add("Edu");
        vector.add("Mica");
        vector.add("Juli");
        vector.add("Anita");
        System.out.println(vector);
        vector.remove(1);
        vector.remove(1);
        System.out.println(vector);
    }
}
