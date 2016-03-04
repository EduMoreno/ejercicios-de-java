/**24. estaEnArrayInt: Dice si un número está o no dentro de un array*/

import  array.array1;

public class Ejercicio24 {
    
  public static void main(String[] args) {
    
    
    System.out.println("Introduzca el numero de arrays ");
     int numero = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el minimo del numero que estara comprendido el array ");
     int minimo = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el maximo del numero que estara comprendido el array  ");
     int maximo = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el numero que  cree que puede estar en el array");
     int num = Integer.parseInt(System.console().readLine());
     
     int pinta [] = array.array1.generaArrayInt(numero, minimo, maximo);
     
         
     if (array.array1.estaEnArrayInt(pinta , num)) {
      System.out.println("El número esta en el array.");
    }
      else {
        System.out.println("El número no esta en el array.");
      } 
 System.out.println();
  array.array1.muestraArray(pinta);
    
 
  }
}
