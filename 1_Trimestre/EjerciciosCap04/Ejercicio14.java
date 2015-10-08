/**
 * 14. Realiza un programa que diga si un número introducido por teclado es par y/o divisible
 *     entre 5.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio14 {
  public static void main(String[] args) {

   System.out.print("Introduzca un número: ");
    double numero = Double.parseDouble(System.console().readLine());

    if ((numero % 2) == 0.0) {
      System.out.println("El número introducido es par");
    } 
    
    else {
      System.out.println("El número introducido es impar");
    }

    if ((numero % 5) == 0.0) {
      System.out.println(" Es divisible entre 5.");
    
    } 
    
    else {
      System.out.println(" No es divisible entre 5.");
    }
  }
}
 































