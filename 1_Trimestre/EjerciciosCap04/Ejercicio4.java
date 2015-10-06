/**
 * 4. Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
 *    extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
 *    cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
 *    A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio4 {
  public static void main(String[] args) {

    int salario;

    System.out.print("Introduzca el numero de horas:");
   int hora = Integer.parseInt(System.console().readLine()); 
    
    
    if ((hora <=40)) {
      salario = 12 * hora;
   
       }
    
     else {
       salario = (12 * 40) + (hora - 40) * 16;
       
   }
      System.out.print( "Su salario seria de " + salario);
  }
}































