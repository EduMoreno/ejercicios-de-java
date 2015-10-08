/**
 * 15. Escribe un programa que pinte una pirámide rellena con un carácter introducido por
 *     teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa
 *     debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando
 *     hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio15 {
  public static void main(String[] args) {

    String sim;
    System.out.print("Introduzca un carácter puede ser una letra, un número o un símbolo como *, +, -, $, &: ");
    sim = System.console().readLine();
    
    System.out.println("Elije la orientacion de la pirámide");
    System.out.println("1. Vértice hacia arriba");
    System.out.println("2. Vértice hacia abajo");
    System.out.println("3. Vértice hacia la izquierda");
    System.out.println("4. Vértice hacia la derecha");
    
    int orientacion = Integer.parseInt(System.console().readLine());

    switch(orientacion) {
      
    case 1:
        System.out.println("  " + sim);
        System.out.println(" " + sim + sim + sim);
        System.out.println(sim + sim + sim + sim + sim);
        break;
        
    case 2:
        System.out.println(sim + sim + sim + sim + sim);
        System.out.println(" " + sim + sim + sim);
        System.out.println("  " + sim);
        break;
        
    case 3:
        System.out.println("    " + sim);
        System.out.println("  " + sim + " " + sim);
        System.out.println(sim + " " + sim + " " + sim);
        System.out.println("  " + sim + " " + sim);
        System.out.println("    " + sim);
        break;
        
    case 4:
        System.out.println(sim);
        System.out.println(sim + " " + sim);
        System.out.println(sim + " " + sim + " " + sim);
        System.out.println(sim + " " + sim);
        System.out.println(sim);
        break;
      
    }
  }
}































