/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio9 {
    
  public static void main(String[] args) {
      
   int digitos = 1;

    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
        
    while (numero > 10) {
      numero /= 10;
      digitos++;
    }
    
    System.out.println("Tiene " + digitos + " dígitos.");

  }
}
