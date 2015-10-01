/**
 * @author Eduardo Moreno
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    
  String linea;
  System.out.println("          Pasar de MB a KB ");
  
  System.out.print("Introduce el numero a pasar: ");
  
  linea = System.console().readLine();
  int numero = Integer.parseInt(linea);
  
  int operacion = numero * 1024;
  
  System.out.print(numero + " MB son  " + operacion + "KB" );
    
    
    
  }
}
