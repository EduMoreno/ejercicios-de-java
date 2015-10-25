/**
 * 29.Escribe un programa que muestre por pantalla todos los números enteros positivos menores
 * a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio29 {

  public static void main(String[] args) {

    System.out.print("Introduzca un número entero: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca otro número entero: ");
    int num2 = Integer.parseInt(System.console().readLine());
 
    for (int e = 1; e < num1; e++) {
      if ((e % num2) != 0) {
        System.out.print(e + " ");
      }
    }
  }
}
