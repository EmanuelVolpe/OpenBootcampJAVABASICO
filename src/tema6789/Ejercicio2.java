package tema6789;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //PIDE LAS DIMENSIONES DE LA MATRIZ AL USUARIO:
        System.out.println("Ingrese el numero de filas de la matriz:");
        int numFilas = retornaNumero();
        System.out.println("Su matriz tendrá " + numFilas + " filas");
        System.out.println("Ingrese el numero de columnas de la matriz:");
        int numColumnas = retornaNumero();
        System.out.println("Su matriz tendrá " + numColumnas + " columnas");

        //GENERO E IMPRIMO LA MATRIZ
        int mat[][] = generaMatriz(numFilas, numColumnas);
        imprimeMatriz(mat, numFilas, numColumnas);

    }

    public static int[][] generaMatriz(int filas, int columnas){
        final int FILAS = filas;
        final int COLS = columnas;
        int matriz [][] = new int [FILAS] [COLS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                matriz[i][j] = getRandomNumber();
            }
        }
        return matriz;
    }

    public static void imprimeMatriz(int[][] matriz, int filas, int columnas){
        final int FILAS = filas;
        final int COLS = columnas;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
    }

    public static int getRandomNumber(){
        int x = (int)(51*Math.random());
        return x;
    }

    public static int retornaNumero(){
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        return n;
    }

}
