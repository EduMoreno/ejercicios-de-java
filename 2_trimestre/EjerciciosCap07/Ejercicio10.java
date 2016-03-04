/**
 * 10.Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
 * almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
 * primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
 * restantes. Utiliza arrays auxiliares si es necesario.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio10 {
    
  public static void main(String[] args) {
    
    int[] num = new int[20];
    int[] par = new int[20]; 
    int[] impar = new int[20]; 
    int pares = 0;
    int impares = 0;
 
    for ( int n = 0; n < 20; n++){
     num[n] = (int)(Math.random() * 101);
      System.out.print(num[n] + " ");
    }
    
    for ( int n = 0; n < 20; n++){
      if (num[n] % 2 == 0){
      par[pares++] = num[n];
      } 
      else {
        impar[impares++] = num[n];
      }
    }
   
    for (int n = 0; n < pares; n++){
      num[n] = par[n];
    }
   
    for (int n = pares; n < 20; n++) {
      num[n] = impar[n - pares];
    }
    
    System.out.println();
    System.out.println("---------------------------------------------------------");
    
    for (int n = 0; n < 20; n++) {
      System.out.print(num[n] + " ");
    }
  }
}

