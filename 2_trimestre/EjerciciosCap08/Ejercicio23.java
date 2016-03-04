/**23. mediaArrayInt: Devuelve la media del array que se pasa como parámetro..*/

import  array.array1;

public class Ejercicio23
{
    
  public static void main(String[] args) {
    
    
    System.out.println("Introduzca el numero de arrays ");
     int numero = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el minimo del numero que estara comprendido el array ");
     int minimo = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el maximo del numero que estara comprendido el array  ");
     int maximo = Integer.parseInt(System.console().readLine());
     
     int pinta [] = array.array1.generaArrayInt(numero, minimo, maximo);
     
      array.array1.muestraArray(pinta);
    
      int media = array.array1.mediaArrayInt(pinta);
      
      System.out.println();
      
      System.out.println("la media es " + media);
    
 
  }
}
