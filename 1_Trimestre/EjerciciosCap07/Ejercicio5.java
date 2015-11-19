/**
 * 5.Escribe un programa que pida 10 números por teclado y que luego muestre los números
 * introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
 * respectivamente
 *
 * @author Eduardo Moreno
 */

public class Ejercicio5 {
    
  public static void main(String[] args) {
    
  int[] num = new int[10];
  
  
   System.out.println("Introduce 10 numeros:");
   
  for ( int n = 0; n < 10; n++){
   num[n] = Integer.parseInt(System.console().readLine());
   }  
      
   int maximo = num[0];
   int minimo = num[0];   
   
   for ( int n = 0; n < 10; n++){ 
      if (num[n] > maximo) {
        maximo = num[n];
      }
     
      if (num[n] < minimo) {
        minimo = num[n];
      }
    }
  
        System.out.println(minimo + " Mínimo");
        System.out.println(maximo + " Máximo");
              
 }
}
