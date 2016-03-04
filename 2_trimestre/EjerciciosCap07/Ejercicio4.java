/**
 * 4.Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
 * Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
 * almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
 * deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
 * contenido de los tres arrays dispuesto en tres columnas.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio4 {
    
  public static void main(String[] args) {
  
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
          
    for ( int n = 0; n < 20; n++){
      numero[n] = (int)(Math.random() * 99);
      cuadrado[n] = numero[n] *2;
      cubo[n] = numero [n] *3;
    }
    
    System.out.println("Numero" + " \t " +  "Cuadrado" + " \t " + "Cubo");
    
    for ( int n = 0; n < 20; n++){
      System.out.print( "  " + numero[n] + " \t    " + cuadrado[n] + "\t          " + cubo[n] + "\n" );
    }
   
 }
}
