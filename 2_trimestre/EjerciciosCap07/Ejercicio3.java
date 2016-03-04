/**
 * 3.Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
 * inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio3 {
    
  public static void main(String[] args) {
  
  int[] num = new int[10];
  
   System.out.println("Introduce 10 numeros");
   
  for ( int n = 0; n < 10; n++){
   num[n] = Integer.parseInt(System.console().readLine());
  }
  
    System.out.println("Los numeros al reves son:");

  for ( int a = 9; a >= 0 ; a--){
    System.out.println(num[a]);
  }
 
  
  
 }
}
