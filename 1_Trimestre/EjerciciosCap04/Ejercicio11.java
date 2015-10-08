/**
 * 11. Escribe un programa que dada una hora determinada (horas y minutos), calcule los
 *     segundos que faltan para llegar a la medianoche.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    
    
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine()); 
    System.out.print("Introduzca los minutos:");
    int minutos = Integer.parseInt(System.console().readLine());
  
    double segundos1 = (hora * 3600) + (minutos * 60);
    double segundos2 = (24 * 3600) - segundos1;

   System.out.print("Faltan " + segundos2 + " segundos hasta medianoche");
  }
}
