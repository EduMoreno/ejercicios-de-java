/**
 * @author Eduardo Moreno
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    
  String linea;
     
  System.out.print("Introduce la base: ");
  
  linea = System.console().readLine();
  double base = Double.parseDouble(linea);
  
   System.out.print("Introduce la altura: ");
  
  linea = System.console().readLine();
  double altura = Double.parseDouble(linea);
  
 
 double operacion = (base * altura) /2 ;
 
  System.out.print("El area del triangulo : " + operacion);
    
    
    
  }
}

