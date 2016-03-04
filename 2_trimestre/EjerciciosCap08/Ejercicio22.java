/**22. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.*/

import  array.array1;

public class Ejercicio22{
    
  public static void main(String[] args) {
    
    
    System.out.println("Introduzca el numero de arrays ");
     int numero = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el minimo del numero que estara comprendido el array ");
     int minimo = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el maximo del numero que estara comprendido el array  ");
     int maximo = Integer.parseInt(System.console().readLine());
     
     int pinta [] = array.array1.generaArrayInt(numero, minimo, maximo);
     
      array.array1.muestraArray(pinta);
    
      int max = array.array1.maximoArrayInt(pinta);
      
      System.out.println();
      
      System.out.println("El maximo es " + max);
    
 
  }
}
