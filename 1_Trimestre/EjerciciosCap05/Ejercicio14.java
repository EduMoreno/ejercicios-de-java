/**
 * 14. Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
 *     potencia.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio14 {

  public static void main(String[] args) {
  
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
      
    System.out.print("Introduzca el exponente positivo: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    int potencia = 1; 
    
    if (exponente >= 0) {
      for (int n = 1; n <= exponente; n++) {
        
        potencia = potencia * base;
      
      }
      
      System.out.println("El resultado es " + potencia);
      
    }
  }
}
