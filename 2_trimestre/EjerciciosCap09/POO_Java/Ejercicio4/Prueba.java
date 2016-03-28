/**
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de
 * los métodos pueden ser invierte , simplifica , multiplica , divide , etc.
*/

public class Prueba {
  public static void main(String[] args) {
 
    System.out.print("Introduce un numerador: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un denominador: ");
    int deno = Integer.parseInt(System.console().readLine());
    
    Fraccion num1 = new Fraccion(num,deno);
     System.out.println(num1 + " x 10 = "+ num1.multiplica(10));
    
    Fraccion num2 = new Fraccion(4, 8);
    System.out.println(num1 + " x " + num2 + " = " + num1.multiplica(num2));
    System.out.println(num1 + " : " + num2 + " = " + num1.divide(num2));
  }
}
