/**
 * 13. Escribe un programa que lea una lista de diez números y determine
 *     cuántos son positivos, y cuántos son negativos.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio13 {

  public static void main(String[] args) {
  
    System.out.println("Introduzca 10 números: ");
    
    int positivo = 0;
    int negativo = 0;
    
    for (int n = 0; n < 10; n++) {
     int numero = Integer.parseInt(System.console().readLine());
      if (numero > 0) {
         positivo++;
      } else {
         negativo++;
      }
    }
    
    System.out.println("Hay " + positivo + " numeros positivos y " + negativo + " numeros negativos");

  }
}
