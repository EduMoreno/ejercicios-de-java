/**
 * 5.Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
 * espacios. Muestra también el máximo, el mínimo y la media de esos números.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio5 {
    
  public static void main(String[] args) {
   
    int numMin = 199;
    int numMax = 100;
    int suma = 0;
    
    for(int n = 0; n < 50; n++) {
      int numero = (int)(Math.random() * 100) + 100;
      System.out.print(numero + " ");
      
      if (numero > numMax) {
        numMax = numero;
      } 
      
      if (numero < numMin) {
        numMin = numero;
      }
      suma = suma + numero;      
    }
    System.out.println();
    System.out.println("El numero máximo es " + numMax);
    System.out.println("El numero minimo es " + numMin);
    System.out.println("La media es " + (suma / 50));
  }
}
