/**
 * 1.esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
 * y falso en caso contrario.
 *
 * @author Eduardo Moreno
 */
 
import  matematicas.varios;

public class Ejercicio1 {
    
  public static void main(String[] args) {
    
  int numero;

    System.out.println("Introduzca un número entero de máximo 5 cifras: ");
    numero = Integer.parseInt(System.console().readLine());

    if (matematicas.varios.cifra (numero)) {
      System.out.println("El número es capicúa.");
    }
      else {
        System.out.println("El número no es capicúa.");
      } 
 }
}

