/**
 * 3. Modifica el programa anterior de tal forma que los números que se introducen en el array
 * se generen de forma aleatoria (valores entre 100 y 999)
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio3 {
  public static void main(String[] args) {
     
    int [][] num = new int [4][5];
    
    int f;
    int c;
    int sumFila = 0;
    int sumColumna = 0;
    int total = 0;
    
    
    for(f = 0; f < 4; f++){
      for(c = 0; c < 5; c++){
        num[f][c] = (int) (Math.random()* 900) + 100;
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
