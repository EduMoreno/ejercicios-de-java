/**
 * 12.Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
 * ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
 * carácter
 *
 * @author Eduardo Moreno
 */

public class Ejercicio12 {
    
  public static void main(String[] args) {
  
   int numero = 0;
      while (numero < 127) {
        numero = (int)(Math.random() * 94 + 32);
        System.out.print("\t" + (char) numero );
      }
  }  
}
