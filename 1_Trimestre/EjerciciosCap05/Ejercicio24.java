/**
 * 24. Escribe un programa que lea un número n e imprima una pirámide de números con n filas
 * como en la siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio24 {

  public static void main(String[] args) {

      System.out.print("Introduzca la altura: ");
      int altura = Integer.parseInt(System.console().readLine());
      
       
      int altura2 = 1;
      int espaciado = altura ;

      do {

        for (int e = 1; e <= espaciado-1; e++) {
        System.out.print(" ");
        }
    
        for (int e = 1; e < altura2; e++) {
        System.out.print(e);
        }
      
        for (int e = altura2; e > 0; e--){
        System.out.print(e);
        }
      
    
        altura2++;
        espaciado--;
      System.out.println("");
      
      } while (altura2 <= altura) ;
  }
}

