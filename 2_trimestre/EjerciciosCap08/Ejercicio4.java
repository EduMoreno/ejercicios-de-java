/**
 * 4.potencia: Dada una base y un exponente devuelve la potencia
 *
 * @author Eduardo Moreno
 */
import  matematicas.varios;

public class Ejercicio4{
    
  public static void main(String[] args) {
  
  int numero;
  int exponente;
  
    System.out.println("Introduzca un número entero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca la potencia: ");
    exponente = Integer.parseInt(System.console().readLine());
    
  
  System.out.println(matematicas.varios.potencia(exponente , numero));
        
 }
}
