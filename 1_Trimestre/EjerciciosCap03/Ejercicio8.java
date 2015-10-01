/**
 * @author Eduardo Moreno
 */

public class Ejercicio8 {
  public static void main(String[] args) {
    
  String linea;
     
  System.out.print("Introduce las horas trabajadas: ");
  
  linea = System.console().readLine();
  double horas = Double.parseDouble(linea);
  
  double operacion = horas * 12;
  
  System.out.printf("El salario semanal de las horas trabajadas es %.2f  " , operacion);
    
    
    
  }
}
