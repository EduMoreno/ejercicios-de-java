/**
 * 1.Define un array de 12 números enteros con nombre num y asigna los valores según la tabla
 * que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
 * sucede con los valores de los elementos que no han sido inicializados?
 *
 * @author Eduardo Moreno
 */

public class Ejercicio1 {
    
  public static void main(String[] args) {
  
  int[] num = new int[12];
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
  System.out.print("  Indice    "); 

  for ( int n=0; n < 12; n++){
    System.out.print(n + "   ");

  }
    System.out.println();

    System.out.print("  Valor   "); 

  for ( int n=0; n < 12; n++){
    System.out.print(num[n] + "   " );
  }
 }
}
