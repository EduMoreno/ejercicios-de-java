/**
 * 6. Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio6 {
  public static void main(String[] args) {
     
    int [][] num = new int [6][10];
    
    int f;
    int c;
    int n;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    int minFila = 0;
    int maxFila = 0;
    int minColumna = 0;
    int maxColumna = 0;
    boolean numRepetido;
    
    for(f = 0; f < 4; f++){
      for(c = 0; c < 5; c++){
        do {
          num[f][c] = (int)(Math.random() * 1001);
          numRepetido = false;
          for (n = 0; n < 10 * f + c; n++) {
            if (num[f][c] == num[n / 10][n % 10]) {
              numRepetido = true;
            }
          }
        } while (numRepetido);
       
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
    System.out.println("La posicion del numero minimo es " + "Fila " + minFila + " Columna " + minColumna);
    System.out.println("La posicion del numero maximo es " + " Fila " + maxFila + " Columna " + maxColumna);
  }
}
