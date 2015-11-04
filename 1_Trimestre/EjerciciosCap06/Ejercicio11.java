/**
 * 11.Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
 * la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
 * de suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio11 {
    
  public static void main(String[] args) {
    int numSusp = 0;
    int numSufi = 0;
    int numBien = 0;
    int numNotable = 0;
    int numSobresaliente= 0; 
    
   for(int n = 1; n <= 20; n++) {
          
      int numero = (int)(Math.random() * 12 );
      if (numero < 5) {
        numSusp ++;
      }
      if (numero == 5) {
        numSufi ++;
      }
      if (numero == 6) {
        numBien ++;
      }
      if ((numero >= 7) && (numero == 8)) {
        numNotable ++;
      }
      if ((numero >= 9) && (numero == 10)) {
        numSobresaliente ++;
      }
    }
    System.out.println("Hay " + numSusp + " suspensos");
    System.out.println("Hay " + numSufi + " suficientes");
    System.out.println("Hay " + numBien + " bienes");
    System.out.println("Hay " + numNotable + " notables");
    System.out.println("Hay " + numSobresaliente+ " sobresalientes");
  }  
}
