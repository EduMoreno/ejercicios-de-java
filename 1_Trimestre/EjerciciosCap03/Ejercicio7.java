/**
 * @author Eduardo Moreno
 */

public class Ejercicio7 {
  public static void main(String[] args) {
    
  String linea;
     
  System.out.print("Introduce el precio de la factura: ");
  
  linea = System.console().readLine();
  double precio = Double.parseDouble(linea);
  
  double iva = 0.21;
  
 
 double operacion = (precio * iva) + precio ;
 
  System.out.printf("El  resultado de la factura total es %.2f  " , operacion);
    
    
    
  }
}
