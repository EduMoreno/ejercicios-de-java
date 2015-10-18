/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio8 {
    
  public static void main(String[] args) {
      
    System.out.print("Introduzca el numero a multiplicar: ");
    int numero = Integer.parseInt(System.console().readLine());
    for (int n = 0; n <= 10; n ++){
      System.out.println(numero + "x" + n +"="+ numero * n );
     
    } 
    
  }
}
