/**
 * 4.Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
 * espacios.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio4 {
    
  public static void main(String[] args) {
    
    for (int n = 0; n < 20; n ++){
      System.out.print((int)(Math.random()*11) + " ");
    }
  }
}
