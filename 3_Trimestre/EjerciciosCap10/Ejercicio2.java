/**
* 2.Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
* ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
* números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
* y 20 elementos ambos inclusive.
* 
* @author Eduardo Moreno
*/

import java.util.ArrayList;

public class Ejercicio2 {
  public static void main(String[] args) {
  
    ArrayList<Integer> a = new ArrayList<Integer>();
              
    int tamano = ((int)(Math.random()* 11) + 10);
    int suma = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int media = 0; 
           
        for (int b = 0 ; b < tamano ; b ++ ){    
            a.add((int)(Math.random()*101));
        }

        // Muestra el array
        System.out.print ("Array: ");
          for (int i : a) {
            System.out.print ( i + " | ");
          }

          // Suma

          for (int i : a){
              suma += i;
          }
          System.out.println("");
          System.out.println("Suma Total: " + suma);

          // Media

          media = suma / a.size();

          System.out.println("Media: " + media);

          // Maximo

          for (int i : a){
              if (i > maximo) {
                  maximo = i;
              }
          }

          System.out.println("El numero maximo es: " + maximo);

          // Minimo

          for (int i : a) {
              if (i < minimo) {
                  minimo = i;
              }
          }

          System.out.println("El numero minimo es: " + minimo);
  }
}
