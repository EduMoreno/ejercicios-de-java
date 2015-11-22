/**
 * 11.Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
 * para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
 * desplazando el resto de números (los que no son primos) de tal forma que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio11 {
    
  public static void main(String[] args) {
    int[] num = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int contarPrimo = 0;
    int contarnoPrimo = 0;
    
    
    System.out.println("Introduze 10 numeros enteros: ");
    
    for(int n = 0; n < 10; n++) {
      num[n] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.print("  Original   "); 
    for(int n = 0; n < 10; n++) {
      System.out.printf("%2d | " , num[n]); 
     boolean esPrimo = true;
      for (int a = 2; a < num[n] - 1; a++) {
        if (num[n] % a == 0){
          esPrimo = false;
        }
      }

      if(esPrimo){
         primo[contarPrimo++] = num[n];
      } 
      else {
        noPrimo[contarnoPrimo++] = num[n];
      }
    }
    System.out.println();
 
    for (int n = 0; n < contarPrimo; n++){
      num[n] = primo[n];
    }

    for (int n = contarPrimo; n < contarPrimo + contarnoPrimo; n++) {
      num[n] = noPrimo[n - contarPrimo];
    }
    
     System.out.print("  Cambiado   "); 
    for (int n = 0; n < 10; n++) {
      System.out.printf("%2d | " , num[n]); ;
    }
  }
}

