/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
 * mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
 * ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio7 {
    
  public static void main(String[] args) {
         
    int intentos = 0;
      
    do {
      System.out.print("¿Cual es la clave de la caja fuerte? ");
      int numero = Integer.parseInt(System.console().readLine());
      
      if (numero == 9615) {
        
       System.out.println("La caja fuerte se ha abierto satisfactoriamente");
       break;
      } 
           
      else {
        System.out.println("Lo siento, esa no es la combinación");
      }
      
      intentos++;
 
    } while (intentos < 4);
 
    }
  }
