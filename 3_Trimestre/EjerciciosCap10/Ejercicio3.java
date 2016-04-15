/**
* 3.Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados
* en un objeto de la clase ArrayList.
* 
* @author Eduardo Moreno
*/

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a.add((int)(Math.random()*101));
        }

      System.out.print("Array Generado: ");
        for (int i : a) {
            System.out.print(i + "|");
        }

        System.out.println();

        Collections.sort(a);
        System.out.print("Numeros ordenados: ");
        for (int i : a) {
            System.out.print(i + "|");
        }

    }
}
