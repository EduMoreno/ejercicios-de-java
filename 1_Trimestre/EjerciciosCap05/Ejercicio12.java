/**
 * 12. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
 *     término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 *     anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 *     144... El número n se debe introducir por teclado
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio12 {

  public static void main(String[] args) {
  
    int num = 0;
    int segNum;
    int resultado = 0;
    
    System.out.print("Introduzca un numero: ");
     segNum = Integer.parseInt(System.console().readLine());
      
    while (segNum < 150) {
      
     System.out.println(resultado); 
     
      resultado = num + segNum;
      num = segNum;
      segNum = resultado;
      
      
    }
  }
}
