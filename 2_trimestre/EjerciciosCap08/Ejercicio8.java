/**
 * 8.posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de
 * un número entero. Si no se encuentra, devuelve -1.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio8{
    
  public static void main(String[] args) {
  
   System.out.print("Introduzca un numero: ");
      int numero = Integer.parseInt(System.console().readLine());
      
   System.out.print("Introduzca un digito: ");
      int digito = Integer.parseInt(System.console().readLine());
   
      int girado = 0;
      int posicion = 1;
    
    do {
          girado = (girado * 10) + (numero % 10);
          numero /= 10;
          
      } while (numero > 0);
      
    do {
        if ((girado % 10) == digito) {
          System.out.println("Esta en la posicion " + posicion);
        } 
          girado /= 10;
          posicion++;
      } while (girado > 0);
      
      if ((girado % 10) != digito) {
          System.out.println("Esta en la posicion " + -1);
          
        }
  }
}
