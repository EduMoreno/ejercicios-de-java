/**
 * 26. Realiza un programa que pida primero un número y a continuación un dígito. El programa
 * nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese
 * dígito en el número introducido
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio26 {

  public static void main(String[] args) {

      System.out.print("Introduzca un numero: ");
      int numero = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca un digito: ");
      int digito = Integer.parseInt(System.console().readLine());
   
      int girado = 0;
      int posicion = 1;
    
    do {
          girado = (girado * 10) + (numero % 10);
          numero /= 10;
          
      } while (numero > 0);
      
    do {
        if ((girado % 10) == digito) {
        System.out.print(posicion + " ");
        }
          girado /= 10;
          posicion++;
      } while (girado > 0);
 
  }
}
