/**
 * 7. Realiza un programa que calcule la media de tres notas.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio7 {
  public static void main(String[] args) {

    

    System.out.print("Introduzca  la primera nota:");
    int primera = Integer.parseInt(System.console().readLine()); 
    
    System.out.print("Introduzca  la segunda nota:");
    int segunda = Integer.parseInt(System.console().readLine()); 
   
   System.out.print("Introduzca  la tercera nota:");
    int tercera = Integer.parseInt(System.console().readLine()); 
    
    int resultado = ((primera * segunda) * tercera) / 3;
   
      System.out.println("La media de las 3 notas es " + resultado);
  }
 }































