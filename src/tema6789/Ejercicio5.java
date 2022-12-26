package tema6789;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Crea un ArrayList de tipo String, con 4 elementos.
        //Cópialo en una LinkedList.
        //Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> list = new ArrayList<String>();
        list.add("Manu");
        list.add("Tota");
        list.add("Ana");
        list.add("Joaco");
        System.out.println(list);

        System.out.println("------------------------------------------");

        LinkedList<String> links = new LinkedList<String>();
        links.addAll(list);
        System.out.println(links);
    }
}
