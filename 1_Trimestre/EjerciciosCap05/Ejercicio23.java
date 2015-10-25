/**
 * 23. Escribe un programa que permita ir introduciendo una serie indeterminada de números
 * mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
 * total acumulado, el contador de los números introducidos y la media.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio23 {

  public static void main(String[] args) {

     System.out.println("Introduzca numeros enteros, el programa acabará cuando la suma total sea mayor a 10.000:");
   
    int suma = 0;
    int contador = 0;
    
     while (suma <= 10000) {
      int numero = Integer.parseInt(System.console().readLine());
      suma += numero;
      contador++;
     }
   
    System.out.println("El contador es de " + contador + " números.");
    System.out.println("La total acumulado es " + suma);
    System.out.println("La media es " + suma / contador);
    
  }
}

