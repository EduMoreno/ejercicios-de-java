/**
 * 6.voltea: Le da la vuelta a un número.
 *
 * @author Eduardo Moreno
 */

import  matematicas.varios;

public class Ejercicio6{
    
  public static void main(String[] args) {
  
  int numero;
  
  
    System.out.println("Introduzca un número entero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    
    System.out.println("El numero volteado es " + matematicas.varios.voltea(numero));
     
 }
}
