/**
 * 8.Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
 * podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil
 * se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
 * con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
 * 
 * @author Eduardo Moreno
 *
 */
 
public class Ejercicio8 {
   public static void main(String[] args) {

    int [][] cuadrante = new int [8][8];
    int fila = 0;
    int posicion = 0;
    int n;
    int f;
    
     
     for(n = 8; n > 0; n--) {
        System.out.println (n + "|");  
     
          
      }
            
      System.out.println("  -------------------");
      System.out.println("   a b c d e f g h ");  
    
    
      System.out.print("Coordenada x: ");
      int x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      int y = Integer.parseInt(System.console().readLine());
  
    
    System.out.println();
   
  }
}
