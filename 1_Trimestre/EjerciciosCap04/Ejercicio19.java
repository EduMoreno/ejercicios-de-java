/**
 * 19.Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
 *    positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Eduardo Moreno
 */


public class Ejercicio19 {
  public static void main(String[] args) {

     int numero;
     int cifra = 0;
    
    System.out.print("Introduzca un número entero de maximo 5 cifras: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if ( numero < 10 ) {
      cifra = 1;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      cifra = 2;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      cifra = 3;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      cifra = 4;
    }
    
    if ( numero >= 10000 ) {
      cifra = 5;
    }
    
    System.out.println("Tiene " + cifra + " digitos");
  }
}






















