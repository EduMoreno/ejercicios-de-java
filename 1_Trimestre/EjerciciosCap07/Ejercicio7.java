/**
 * 7.Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
 * por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
 * y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
 * la lista generada anteriormente. Los números que se han cambiado deben aparecer
 * entrecomillados.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio7 {
    
  public static void main(String[] args) {
    
  int[] num = new int[100];
  
   for ( int n = 0; n < 100; n++){
     num[n] = (int)(Math.random() * 21);
      System.out.print(num[n] + " ");
    }
    
   System.out.println("\n Introduce 2 numeros  a cambiar :");
   
   int num1 = Integer.parseInt(System.console().readLine());
   int num2 = Integer.parseInt(System.console().readLine());
   
    for ( int n = 0; n < 100; n++){
      if (num1 == num[n]){
      num[n] = num2;
       System.out.print("'"+ num[n] + "'" );
      }
      
      else { 
       System.out.print(num[n] + " ");
      }
 
    }

  }
}

