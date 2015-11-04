/**
 * 9.Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
 * termine de generar números hasta que no saque el 24. El programa deberá decir al final
 * cuántos números se han generado.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio9 {
    
  public static void main(String[] args) {
  
  int num = 0; 
  int numero = 0;
   do{
     numero = (int)(Math.random() * 100 );
    
      if ((numero % 2) == 0){
      System.out.print(numero + " ");
    
         num ++;
      }
      
    }while (numero != 24);
      System.out.println ();
      System.out.println("Se han generado " + num +" numeros");
  }  
}
