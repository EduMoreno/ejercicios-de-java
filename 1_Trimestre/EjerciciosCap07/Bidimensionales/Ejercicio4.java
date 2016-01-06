/**
 * 4. Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 * aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador
 * se queda “pensando” antes de mostrar los números.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio4 {
  public static void main(String[] args) 
    throws InterruptedException {
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
      Thread.sleep(1000);
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
      Thread.sleep(1000);
      System.out.printf("%4d ", sumColumna);
      
    }
    Thread.sleep(1000);
    System.out.printf("%4d ", total);
  }
}
