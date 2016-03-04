/**26.volteaArrayInt: Le da la vuelta a un array.*/

import  array.array1;

public class Ejercicio26 {
    
  public static void main(String[] args) {
    
    
    System.out.println("Introduzca el numero de arrays ");
      int numero = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el minimo del numero que estara comprendido el array ");
      int minimo = Integer.parseInt(System.console().readLine());
     
    System.out.println("Introduzca el maximo del numero que estara comprendido el array  ");
      int maximo = Integer.parseInt(System.console().readLine());
     
        int pinta [] = array.array1.generaArrayInt(numero, minimo, maximo); 
    
          array.array1.muestraArray(pinta);
          
          System.out.println();
          
        int voltea [] =array.array1.volteaArrayInt(pinta);
        
          array.array1.muestraArray(voltea);
 
  }
}
