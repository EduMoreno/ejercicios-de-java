/**
 * 17.Escribe un programa que diga cuál es la última cifra de un número entero introducido por
 * teclado.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio17 {
  public static void main(String[] args) {

    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra es el " + (numero % 10));
  }
}




























