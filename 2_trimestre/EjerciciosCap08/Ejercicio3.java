/**
 * 3.siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
 * como parámetro.
 *
 * @author Eduardo Moreno
 */
import  matematicas.varios;

public class Ejercicio3{
    
  public static void main(String[] args) {
  
  System.out.println("Introduzca un número entero primo: ");
   int numero = Integer.parseInt(System.console().readLine());

        
      System.out.println("El siguiente numero primo es " + matematicas.varios.siguientePrimo (numero));
  
 
 }
}
