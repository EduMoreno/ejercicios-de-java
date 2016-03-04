/**
 * 5.digitos: Cuenta el número de dígitos de un número entero.
 *
 * @author Eduardo Moreno
 */

import  matematicas.varios;

public class Ejercicio5{
  public static void main(String[] args) {
 int numero;
 
    System.out.println("Introduzca un número entero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Tiene " + matematicas.varios.digitos(numero) + " digitos");
 }
}
