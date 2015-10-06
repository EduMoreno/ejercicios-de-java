/**
 * 3. Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
 *    del día de la semana.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio3 {
  public static void main(String[] args) {

    String dia = " ";
    
    System.out.print("Introduzca un numero del dia (1 - 7): ");
   int numero = Integer.parseInt(System.console().readLine()); 
   
    
    
    switch(numero) {
      
      case 1:
      dia = "lunes";
      break;
      
      case 2:
      dia = "martes";
      break;
      
      case 3:  
      dia = "miércoles";
      break;
      
      case 4:
      dia ="jueves";
      break;
        
      case 5:
      dia = "viernes";
        break;
        
      case 6:
       dia = "sábado"; 
       
      case 7:
       dia = "domingo";
        break;
        
      default:
      
        dia = "El numero de día introducido no es correcto.";
        
       }         
       
      System.out.println(dia); 
  }
}
