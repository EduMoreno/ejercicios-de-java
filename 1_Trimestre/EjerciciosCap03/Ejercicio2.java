/**
 * @author Eduardo Moreno
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    
  String linea;
  
   
  System.out.print("Introduce la cantidad de euros para convertir: ");
  linea = System.console().readLine();
    double euros = Double.parseDouble(linea);

    int pesetas = (int) (euros * 166.386);
        
  System.out.printf("%.2f € son %d pts", euros, pesetas);
    
    
  }
}

