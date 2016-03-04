/**
 * 2. Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
 * un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
 * columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
 * esquina inferior derecha.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio2 {
  public static void main(String[] args) {
     
    int [][] num = new int [4][5];
    
    int f;
    int c;
    int sumFila = 0;
    int sumColumna = 0;
    int total = 0;
    System.out.println("Introduce 20 numeros en las siguientes posiciones: ");
    
    for(f = 0; f < 4; f++){
      for(c = 0; c < 5; c++){
        System.out.print("Fila " + "[" + f  +"]" + " Columna " + "[" + c  +"]" + ": ");
        num[f][c] = Integer.parseInt(System.console().readLine());
      }
    }
   
    for(f = 0; f < 4; f++){
      sumFila = 0;
      for(c = 0; c < 5; c++){
        System.out.printf("%4d ", num[f][c]);
        sumFila = sumFila + num[f][c];
      }
      System.out.printf("|%4d\n", sumFila);
    }
    System.out.print("______________________________________");
    System.out.println();
      
    for(c = 0; c < 5; c++){
      sumColumna = 0;
      for(f = 0; f < 4; f++){
          sumColumna = sumColumna + num[f][c];
      }
      total = total + sumColumna;
      System.out.printf("%4d ", sumColumna);
      
    }
     System.out.printf("%4d ", total);
  }
}
