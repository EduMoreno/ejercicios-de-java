/**
 * 7. Realiza un programa que calcule la media de tres notas.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio7 {
  public static void main(String[] args) {


    System.out.print("Introduzca  la primera nota:");
    double primera = Double.parseDouble(System.console().readLine()); 

    System.out.print("Introduzca  la segunda nota:");
    double segunda = Double.parseDouble(System.console().readLine()); 

   System.out.print("Introduzca  la tercera nota:");
    double tercera = Double.parseDouble(System.console().readLine()); 

    double resultado = (primera + segunda + tercera) / 3;
   if ((primera >=0) && (primera <=10) &&
       (segunda >=0) && (segunda <=10) &&
       (tercera >=0) && (tercera <=10)){
        System.out.printf("La media de las 3 notas es %.2f " , resultado);
     }
     
    else {

      System.out.printf("Lo siento, la media que has introducido no esta entre 0 y 10");
    }

  }
 }






























