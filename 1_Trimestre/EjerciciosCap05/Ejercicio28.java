/**
 * 28.Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio28 {

  public static void main(String[] args) {
      System.out.print("Introduzca un número entero: ");
      int numero = Integer.parseInt(System.console().readLine());
     
      int factorial = numero;
      
      for (int e = 1; e < numero; e++) {
        factorial *= e;
      }

      System.out.println("El factorial es " + factorial);
    }
  }

