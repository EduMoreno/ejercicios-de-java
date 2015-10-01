/**
 * @author Eduardo Moreno
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    
  String linea;
     
  System.out.print("Introduce el primer número: ");
  
  linea = System.console().readLine();
  Double primernum = Double.parseDouble(linea);
  
  System.out.print("Introduce el segundo número: ");
  
  linea = System.console().readLine();
  Double segundonum = Double.parseDouble(linea);
    
  double sum = primernum + segundonum ; 
      
  System.out.println("La suma de los dos numeros es :" + sum );
  
   double res = primernum - segundonum ; 
      
  System.out.println("La resta de los dos numeros es :" + res );
  
   double mul = primernum * segundonum ; 
      
  System.out.println("La multiplicacion de los dos numeros es :" + mul );
  
  double div = primernum / segundonum ; 
      
  System.out.println("La multiplicacion de los dos numeros es :" + div );
    
    
    
  }
}

