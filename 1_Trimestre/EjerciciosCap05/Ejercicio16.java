/**
 * 16. Escribe un programa que diga si un número introducido por teclado es o no primo. Un
 * número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio16 {

  public static void main(String[] args) {
  
    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    boolean primo = true;
    
    for (int n = 2; n < numero; n++) {
      if ((numero % n) == 0) {
        primo = false;
      }
    }
    
    if (primo) {
      System.out.println("Es primo");
    } else {
      System.out.println("No es primo");
    }

  }
}
