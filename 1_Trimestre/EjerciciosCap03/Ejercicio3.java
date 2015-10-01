/**
 * @author Eduardo Moreno
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
  String linea;
     
  System.out.print("Introduce la cantidad de pesetas para convertir: ");
  
  linea = System.console().readLine();
  int pesetas = Integer.parseInt(linea);
  
  double euros = pesetas / 166.386;

    
        
  System.out.printf("%d pts son %.2f €", pesetas, euros);
    
    
  }
}

