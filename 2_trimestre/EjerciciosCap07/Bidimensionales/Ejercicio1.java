/**
 * 1.Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna
 * los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
 * dispuestos en forma de tabla como se muestra en la figura.
 * @author Eduardo Moreno
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    
    int[][] num = new int[3][6];
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
   
      for (int a = 0; a <= 2; a++) {
        for (int b = 0; b <= 5; b++) {
         System.out.printf("%4d", num[a][b]);
        }
       System.out.println();
      }
  }
}
