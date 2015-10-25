/**
 * 25. Realiza un programa que pida un número por teclado y que luego muestre ese número al
 * revés.
 * @author Eduardo Moreno
 */

public class Ejercicio25 {

  public static void main(String[] args) {
      int girado = 0;
     
      System.out.print("Introduzca un numero:");
      int numero = Integer.parseInt(System.console().readLine());
     
     do {
          girado = (girado * 10) + (numero % 10);
          numero /= 10;
        }while (numero > 0);
        
    System.out.println("El número girado es: " + girado);
  }
}



