/**25.posicionEnArray: Busca un número en un array y devuelve la posición (el índice)
en la que se encuentra.*/

import  array.array1;

public class Ejercicio25 {
    
  public static void main(String[] args) {
    
    
    System.out.println("Introduzca el numero de arrays ");
      int numero = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el minimo del numero que estara comprendido el array ");
      int minimo = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el maximo del numero que estara comprendido el array  ");
      int maximo = Integer.parseInt(System.console().readLine());
     
        int pinta [] = array.array1.generaArrayInt(numero, minimo, maximo); 
    
          array.array1.muestraArray(pinta);
      
    System.out.println("Introduzca el numero de la posicion que quiere ver");
        int num = Integer.parseInt(System.console().readLine());
   
          int posicion  = array.array1.posicionEnArrayInt(pinta , num);
     System.out.println();
    System.out.println("Esta en la posicion " + posicion);

    
 
  }
}
