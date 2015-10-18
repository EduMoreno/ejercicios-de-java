/**
 * Escribe un programa que calcule la media de un conjunto de números positivos introduci-
 * dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
 * indicará que ha terminado de introducir los datos cuando meta un número negativo.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio10 {
    
  public static void main(String[] args) {
   
    int n = 0;
    int num = 0;
    int s = 0;

    System.out.println("Introduzca los numeros positivos y una vez quiera finalizar introduzca un numero negativo:");

    while (num >= 0) {
      num = Integer.parseInt(System.console().readLine());
      n ++;
      s += num;
    }
    
    System.out.println("La media de los números positivos es " + (s - num) / (n - 1));

  }
}
