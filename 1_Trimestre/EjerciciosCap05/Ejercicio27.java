/**
 * 27. Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
 * número leído por teclado.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio27 {

  public static void main(String[] args) {

      System.out.print("Introduzca un numero: ");
      int numero = Integer.parseInt(System.console().readLine());
      int cuenta = 0;
      int suma = 0;
    
    for (int e = 1; e < numero; e++) {
      if ((e % 3) == 0) {
        System.out.print(e + " ");
        cuenta++;
        suma += e;
      }
    }
    System.out.println();   
    System.out.println("Hay " + cuenta + " múltiplos de 3");
    System.out.println("La suma total de los múltiplos es: " + suma);
  
  }
}
