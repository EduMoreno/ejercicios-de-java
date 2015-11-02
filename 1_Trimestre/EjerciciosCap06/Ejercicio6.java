/**
 * 6.Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
 * y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
 * oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio6 {
    
  public static void main(String[] args) {
   
    int intentos = 0;
    int num = 5;
    int aleatorio= (int)(Math.random() * 100);
    do {
      System.out.print("Introduzca un numero ");
      int numero = Integer.parseInt(System.console().readLine());
      
      if (numero == aleatorio) {
        
       System.out.println("Has acertado");
       break;
      } 
           
      else {
        num--;
        System.out.println("Lo siento, ese no es el numero, tiene " + num + " intentos");
        
        if (numero < aleatorio) {
         System.out.println("El numero introducido es menor al numero secreto ");
        } 
        if (numero > aleatorio) {
         System.out.println("El numero introducido es mayor al numero secreto ");
        
        }
        intentos++;
        
        if (intentos == 5)
        System.out.println("El numero introducido era " + aleatorio);
      }
      
    } while (intentos < 5);
 
  }
}
  
