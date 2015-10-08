/**
 * 13.Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio13 {
  public static void main(String[] args) {

     int aux;
  
    System.out.print("Introduzca el primer numero:");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo numero:");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tercer numero:");
    int c = Integer.parseInt(System.console().readLine());

    
    if (a < b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    
    if (b < c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    if (a < b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números ordenados de mayor a menor son " + a + ", " + b + " y " + c + "."); 
  }
}
  
 































