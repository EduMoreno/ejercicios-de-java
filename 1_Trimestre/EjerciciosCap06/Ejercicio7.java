/**
 * 7.Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
 * partidos y el pleno al quince (15 filas).
 *
 * @author Eduardo Moreno
 */

public class Ejercicio7 {
    
  public static void main(String[] args) {
    for(int n = 1; n < 15; n++) {
    
    System.out.print(n + " ");
      
      for(int a = 1; a <= 3; a++) {
          
      int numero = (int)(Math.random() * 3 + 1 );
      
            switch(numero) {
      
              case 1:
              System.out.print (" 1 ");
              break;
              case 2:
              System.out.print (" X ");
              break;
              case 3:
              System.out.print (" 2 ");
              break;
              default:
        
            }
      }
      System.out.println();
    }
    
    int pleno = (int)(Math.random() * 3 + 1);
    
      if (pleno == 1) {
          System.out.print("Pleno al 15: 1");
          
      }
      
      if (pleno == 2) {
          System.out.print("Pleno al 15: X");
          
      }
      
       if (pleno == 3) {
          System.out.print("Pleno al 15 : 2");
       }
      
  }
}
