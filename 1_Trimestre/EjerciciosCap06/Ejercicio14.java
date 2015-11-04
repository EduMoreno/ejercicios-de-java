/**
 * 14.Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
 * intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
 * ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
 * estás pensando es mayor o menor que el que te acaba de decir.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio14 {
    
  public static void main(String[] args) {
    int intentos = 0;
    int num = 5;
    int menor = 0;
    int mayor = 100;
      
    do {
    
      int  numero = (int)(Math.random() * (mayor - menor) + menor);
      System.out.print("¿El numero es " + numero + " ?. Responde si o no:");  
      String respuesta = System.console().readLine();
      
      if (respuesta.equals("si")) {
         System.out.println("Has acertado");
       break;
      } 
      
      if (respuesta.equals("no")) {
      num--;
      if (num == 0){
      System.out.println("No te quedan mas intentos");
        break;
      }
      System.out.println("Te quedan " + num + " intentos");
      
      System.out.println("---------------- ");
      System.out.println("¿Es Mayor o Menor?: ");
      System.out.println("---------------- ");
      System.out.println("1. Mayor ");
      System.out.println("2. Menor ");
      System.out.println("---------------- ");
      
     }
      int formulario = Integer.parseInt(System.console().readLine());
      
      if (formulario == 1) {
        menor = numero + 1;
      }
      if (formulario == 2) {
        mayor = numero - 1;
      }
      intentos++;
     
    } while (intentos < 5);
  }
}

  
