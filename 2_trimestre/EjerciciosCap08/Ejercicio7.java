/**
 * 7.digitoN: Devuelve el dígito que está en la posición n de un número entero. Se
 * empieza contando por el 0 y de izquierda a derecha.
 *
 * @author Eduardo Moreno
 */

import  matematicas.varios;

public class Ejercicio7{
    
  public static void main(String[] args) {
    
    int x = 0;
    int y = 0;
    
   System.out.print("Introduzca un numero: ");
      int numero = Integer.parseInt(System.console().readLine());
      
   System.out.print("Introduzca un digito: ");
      int digito= Integer.parseInt(System.console().readLine());
   
    System.out.print("El digito de la posicion es el" + matematicas.varios.digito(digito));
  }
}
