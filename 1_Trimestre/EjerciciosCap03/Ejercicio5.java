/**
 * @author Eduardo Moreno
 */

public class Ejercicio5 {
  public static void main(String[] args) {
    
  String linea;
     
  System.out.print("Introduce el lado: ");
  
  linea = System.console().readLine();
  Double lado1 = Double.parseDouble(linea);
  
 
 double operacion = (lado1 * lado1) ;
 
  System.out.print("El area del rectangulo : " + operacion);
    
    
    
  }
}

