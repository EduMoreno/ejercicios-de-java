/**
 * 18.Escribe un programa que diga cuál es la primera cifra de un número entero introducido
 *    por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Eduardo Moreno
 */


public class Ejercicio18 {
  public static void main(String[] args) {

     int numero;
     int cifra = 0;

    System.out.print("Introduzca un número entero de maximo 5 cifras: ");
    numero = Integer.parseInt(System.console().readLine());

    if ( numero < 10 ) {
      cifra = numero;
    }

    if (( numero >= 10 ) && ( numero < 100 )) {
      cifra = numero / 10;
    }

    if (( numero >= 100 ) && ( numero < 1000 )) {
      cifra = numero / 100;
    }

    if (( numero >= 1000 ) && ( numero < 10000 )) {
      cifra = numero / 1000;
    }

    if ( numero >= 10000 ) {
      cifra = numero / 10000;
    }

    System.out.println("La primera cifra es " + cifra);
  }
}






















