/**
 * 12. Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
 * que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
 * colocar el número de la posición inicial en la posición final, rotando el resto de números
 * para que no se pierda ninguno. Al final se debe mostrar el array resultante.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio12 {
    
  public static void main(String[] args) {
  
    int[] num = new int[10];
    int[] cambio = new int[10];
    
    
    System.out.println("Introduze 10 numeros enteros: ");
    
    for(int n = 0; n < 10; n++) {
      num[n] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.print("  Original   "); 
    for(int n = 0; n < 10; n++) {
      System.out.printf("%2d | " , num[n]); 
    }
    System.out.println();
 
    
    System.out.println("Posicion  Inicial: ");
      int posicion1 = Integer.parseInt(System.console().readLine());
    System.out.println("Posicion  Final: ");
      int posicion2 = Integer.parseInt(System.console().readLine());
      
    if ((posicion1 < posicion2) && (posicion1 >= 0) && (posicion1 <= 10) && (posicion2 >= 0) && (posicion1 <= 10)){
      cambio[posicion2] = num[posicion1];
      cambio[0] = num[9];
      
      for (int n = 0; n < 10; n++) {
        cambio[n] = num[n];
      }
    
      cambio[posicion2] = num[posicion1];
    
      for (int n = posicion2 + 1; n < 10; n++){
        cambio[n] = num[n - 1];
      }
      cambio[0] = num[9];
    
      for (int n = 0; n < posicion1; n++){
        cambio[n + 1] = num[n];
      }
    }
     
    System.out.print("  Cambiado   "); 
    for (int n = 0; n < 10; n++) {
      System.out.printf("%2d | " , cambio[n]); ;
    }
  }
}
