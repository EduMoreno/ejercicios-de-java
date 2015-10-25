/**
 * 21. Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
 * negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
 * de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
 * datos pero no se incluye en el cómputo.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio21 {

  public static void main(String[] args) {
    
    int numero = 0;
    int num = 0;
    int par = 0;
    int impar = 0;
    int suma= 0;
    
    
     System.out.println( "Introduzca  numeros enteros para acabar inserte un numero negativo: ");
     
      while (numero >= 0) {
       
        numero = Integer.parseInt(System.console().readLine());
       
         if ((numero % 2) == 0) {
            if (numero > par) {
              par = numero;
            }
          
          } else if (numero > 0){
            suma = suma + numero;
            impar++;
        }
        
            if (numero >= 0) {
            num++;
            }
      }
      
      double media = (suma / impar);
      
    System.out.println("Se han introducido " + num + " numeros");
    System.out.println("La media de los impares es: " + media);
    System.out.println("El mayor numero par es: " + par);
    
    
  }
}
