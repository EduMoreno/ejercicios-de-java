/**
 * 20.Realiza un programa que diga si un número entero positivo introducido por teclado es
 *    capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Eduardo Moreno
 */


public class Ejercicio20 {
  public static void main(String[] args) {

     int numero;
     boolean cifra = false;

    System.out.printlnºº("Introduzca un número entero de maximo 5 cifras: ");
    numero = Integer.parseInt(System.console().readLine());

    if (numero < 10) {
      cifra = true;
    }

    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        cifra = true;
      }
    }

    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        cifra = true;
      }
    }

    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10) == (( numero / 10) % 10))) {
        cifra = true;
      }
    }

    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        cifra = true;
      }
    }

    if (cifra) {
      System.out.println("El número es capicúa.");
    }
     else {
      System.out.println("El número no es capicúa.");
    }
  }
}
