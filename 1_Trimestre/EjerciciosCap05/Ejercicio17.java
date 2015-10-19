/**
 * 17. Realiza un programa que sume los 100 números siguientes a un número entero y positivo
 * introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
 * número positivo)
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio17 {

  public static void main(String[] args) {
  
  int numero;
  int total = 0;
   do {
      System.out.print("Introduzca un número: ");
      numero = Integer.parseInt(System.console().readLine());
   }  while(numero < 0);
  
    for (int n = numero; n < numero + 100; n ++) {
    total+=n;
    }
      System.out.print("El total es " + total);
  }
}
