/**
 * 5. Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
 * deberá dar la posición tanto del máximo como del mínimo.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio5 {
  public static void main(String[] args) {
     
    int [][] num = new int [6][10];
    
    int f;
    int c;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    int minFila = 0;
    int maxFila = 0;
    int minColumna = 0;
    int maxColumna = 0;
    
    
    for(f = 0; f < 6; f++){
      for(c = 0; c < 10; c++){
        num[f][c] = (int) (Math.random()* 1001);
        System.out.printf("%4d ", num[f][c]);
  
        if(num[f][c] < minimo){
          minimo= num[f][c];
          minFila = f + 1;
          minColumna = c + 1;
        } 
      
        if(num[f][c] > maximo){
          maximo= num[f][c];
          maxFila = f + 1;
          maxColumna = c + 1;
        }
      
      }
      System.out.println();
    }
    System.out.print("______________________________________________");
    System.out.println();
    System.out.println("La posicion del numero minimo " + minimo + " es " + "Fila " + minFila + " Columna " + minColumna);
    System.out.println("La posicion del numero maximo " + maximo + " es " +" Fila " + maxFila + " Columna " + maxColumna);
  }
}
