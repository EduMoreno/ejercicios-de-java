/**
 * 19. Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
 * teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio19 {

  public static void main(String[] args) {

   String caracter;
   
      System.out.print("Introduzca la altura: ");
      int altura = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el caracter para pintar la piramide: ");
      caracter = System.console().readLine();
       
      int altura2 = 1;
      int espaciado = altura ;

      do {

        for (int e = 1; e <= espaciado-1; e++) {
        System.out.print(" ");
        }
    
        for (int e = 1; e < altura2 * 2; e++) {
        System.out.print(caracter);
        }
      
        System.out.println("");
    
        altura2++;
        espaciado--;
      
      } while (altura2 <= altura) ;
  }
}

