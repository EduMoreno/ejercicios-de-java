/**
 * 2.esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y
 * falso en caso contrario.
 *
 * @author Eduardo Moreno
 */
 
 import  matematicas.varios;

public class Ejercicio2 {
    
  public static void main(String[] args) {
    
    System.out.println("Introduzca un número entero: ");
   int numero = Integer.parseInt(System.console().readLine());

    
    if (matematicas.varios.esPrimo (numero)) {
      System.out.println("El número es primo.");
    }
      else {
        System.out.println("El número no es primo.");
      } 
 
 }
 
 
}
