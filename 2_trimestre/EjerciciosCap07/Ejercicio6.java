/**
 * 6.Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
 * los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
 * 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 * posición 0. Finalmente, muestra el contenido del array.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio6 {
    
  public static void main(String[] args) {
    
  int[] num = new int[15];
  
   System.out.println("Introduce 15 numeros:");
   
   for ( int n = 0; n < 15; n++){
   num[n] = Integer.parseInt(System.console().readLine());
    }
   int aux = num[14];
   for ( int n = 14; n > 0; n--){
   num[n] = num[n - 1];
    }
    num[0] = aux;
    for ( int n = 0; n <=14; n++){
    System.out.print(n + ".)");
    System.out.println(num[n]);
    }
  
  }
}
