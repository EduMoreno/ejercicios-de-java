/**
 * 1. Escribe un programa que pida por teclado un día de la semana
 *    y que diga qué asignatura toca a primera hora ese día.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio1 {
  public static void main(String[] args) {

    String dia;
 

    System.out.print("Introduzca un día de la semana:");
    dia = (System.console().readLine()); 
    
    String asignatura  = " ";
    
    switch(dia) {
      case "lunes":
      asignatura = "FOL";
      break;
      
      case "martes":
      asignatura = "Programación";
      break;
      
      case "miércoles":        
      asignatura = "Sistemas Informáticos";
      break;
      
      case "jueves":
      asignatura = "Programación";
      break;
        
      case "viernes":
        asignatura = "Bases de Datos";
        break;
        
      case "sábado":
        
      case "domingo":
       asignatura = "No hay clase";
        break;
      default:
        System.out.println("El día introducido no es correcto.");
        
       }
       
     System.out.println("La asignatura que toca ese dia a primera hora es " + asignatura);
    
  }
}
