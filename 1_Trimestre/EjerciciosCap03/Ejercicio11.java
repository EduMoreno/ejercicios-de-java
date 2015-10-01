/**
 * @author Eduardo Moreno
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
  String linea;
  System.out.println("          Pasar de KB a MB ");
  
  System.out.print("Introduce el numero a pasar: ");
  
  linea = System.console().readLine();
  int numero = Integer.parseInt(linea);
  
  int operacion = numero / 1024;
  
  System.out.print(numero + " KB son  " + operacion + "MB" );
    
    
    
  }
}

