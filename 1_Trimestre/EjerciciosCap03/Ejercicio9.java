/**
 * @author Eduardo Moreno
 */

public class Ejercicio9 {
  public static void main(String[] args) {
    
    double pi = 3.14;
  
    System.out.println("      Volumen de un cono");
    
    System.out.print("Introduzca la altura: ");
    
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el radio: ");
    
    double radio = Double.parseDouble(System.console().readLine());
    
    double volumen = (1.0/3.0) * pi * radio * radio * altura;
    System.out.println("El volumen del cono es  " +  volumen + " cm3");
  }
}
