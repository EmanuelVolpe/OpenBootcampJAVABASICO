package tema6789;

import java.util.ArrayList;

public class Ejercicio6 {

    public static void main(String[] args) {
    //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    //A continuación, con otro bucle, recórrelo y elimina los numeros pares.
    //Por último, vuelve a recorrerlo y muestra el ArrayList final.
    //Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }

        System.out.println(list);
        eliminaPares(list);
        System.out.println(list);
    }

    public static int getRandomNumber(){
        int x = (int)(11*Math.random());
        return x;
    }

    public static void eliminaPares(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            Integer elem = lista.get(i);
            if(elem % 2 == 0) {
                lista.remove(i);
                i--;
            }
        }
    }



}
