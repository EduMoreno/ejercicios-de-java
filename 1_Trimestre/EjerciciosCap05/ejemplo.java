/**
 * Bucle do-while que termina cuando se introduce por teclado un
 * número impar.
 *
 * @author Eduardo Moreno
 */

public class ejemplo {
    
  public static void main(String[] args) {
    String respuesta;    
    int numero;
      
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {
        System.out.println("Qué bonito es el " + numero);
      } else {
        System.out.println("No me gustan los números impares, adiós.");
        
      }
        System.out.println("¿Quieres continuar? (s/n)."); 
           respuesta = System.console().readLine();
    } while (respuesta.equalsIgnoreCase("s"));
    
      
    
  }
}
