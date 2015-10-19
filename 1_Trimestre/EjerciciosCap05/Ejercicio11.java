/**
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
 * números enteros a partir de uno que se introduce por teclado.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio11 {
    
  public static void main(String[] args) {
   
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int n = 0; n < 5; n++){
      System.out.println(numero + " " + (numero * numero) + " " + (numero * numero * numero));
      numero++;
    }
  }
}
