package tema6789;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        //La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        leerTodo();
    }


    public static void leerTodo() {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte[] datos = fichero.readAllBytes();
                byte[] var2 = datos;
                int var3 = datos.length;

                for(int var4 = 0; var4 < var3; ++var4) {
                    byte dato = var2[var4];
                    System.out.print((char)dato);
                }

                fichero.close();
            } catch (IOException var6) {
                System.out.println("No puedo leerlo: " + var6.getMessage());
            }
        } catch (FileNotFoundException var7) {
            System.out.println("Fichero no encontrado: " + var7.getMessage());
        }

    }
}
