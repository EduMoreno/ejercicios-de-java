/**
 * 18. Escribe un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa debe empezar por el
 * menor de los enteros introducidos e ir incrementando de 7 en 7
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio18 {

  public static void main(String[] args) {
   int numero1;
   int numero2;
   
      System.out.print("Introduzca un número: ");
      numero1 = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el segundo numero que sea distinto al anterior: ");
      numero2 = Integer.parseInt(System.console().readLine());
       
    
      if (numero1 > numero2) {
      int aux = numero1;
      numero1 = numero2;
      numero2 = aux;
      }
    
    for (int n = numero1; n <= numero2; n += 7) {
      System.out.print(n + " ");
    }
    
   }
}
