/**
 * 1.Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 * total (los puntos que suman entre los tres dados).
 *
 * @author Eduardo Moreno
 */

public class Ejercicio1 {
    
  public static void main(String[] args) {
    int num = 1; 
    int suma = 0;  
    for (int n = 0; n <= 2; n ++){
    int dado = (int)(Math.random()*6 + 1);
    System.out.println("El numero del " + num + " dado es:" + dado);
    suma = suma + dado;
    num ++;
    } 
    System.out.println("La suma de los dados es:" + suma);
  }
}
