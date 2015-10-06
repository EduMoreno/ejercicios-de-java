/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
 *  h. Aplica la fórmula t = V2h/g siendo g = 9.81m/s 2
 *
 * @author Eduardo Moreno
 */


public class Ejercicio6 {
  public static void main(String[] args) {

   
    System.out.print("Introduzca el valor de h: ");
    Double h = Double.parseDouble(System.console().readLine());
    
   double resultado = Math.sqrt ((2*h)/9.81);
   
   System.out.print("El tiempo en caer seria " + resultado);
   
  }
}


























