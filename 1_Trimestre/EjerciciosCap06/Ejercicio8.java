/**
 * 8.Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
 * probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2
 * = 3/6 y 1/3 = 2/6.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio8 {
    
  public static void main(String[] args) {
    for(int n = 1; n < 15; n++) {
    
    System.out.print(n + " ");
      
      for(int a = 1; a <= 3; a++) {
          
      int numero = (int)(Math.random() * 6 + 1 );
      
            switch(numero) {
              case 1:
              case 2:
              case 3:
              System.out.print (" 1 ");
              break;
              case 4:
              case 5:
              System.out.print (" X ");
              break;
              case 6:
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

  
