
package array;
public class array1 {

/**1.generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
intervalo (mínimo y máximo) se indica como parámetro.*/

public static int [] generaArrayInt (int x , int min , int max){

    int [] num= new int [x];
    int n;
        for ( n = 0; n < x ; n ++){

         num[n] = (int)(Math.random() * (max - min + 1) + min);

        }
          
        return num;

  }
  public static void muestraArray(int  num []) {
    for (int x : num) {
      
      System.out.print(x + " ");
      
    }
  }
  
  public static int minimoArrayInt (int num [] ) {
   
   int minimo = Integer.MAX_VALUE;
   
   for (int i = 0; i < num.length; i++) {
     if (num[i] < minimo) {
       minimo = num[i];
      }
    }
  
    return minimo;
  
 }
 
   public static int maximoArrayInt (int num [] ) {
   
   int maximo = Integer.MIN_VALUE;
   
   for (int i = 0; i < num.length; i++) {
     if (num[i] > maximo) {
       maximo = num[i];
      }
    }
  
    return maximo;
  
 }
  
  public static int mediaArrayInt (int num [] ) {
   
  int media = 0;
  int divisor = 0;
  
  for (int i = 0; i < num.length; i++ ) {
    media += num[i];
    divisor++;
  }
    media /= divisor;
  return media;
  }
  
  public static boolean estaEnArrayInt (int num[], int numero) {

    for (int i = 0; i < num.length; i++) {
      if (num[i] == numero) {
        return true;
      } 
    }
  
    return false;
  }

  public static int posicionEnArrayInt (int num[], int numero) {

int posicion = 0;
  
  for (int i = 0; i < num.length; i++) {
    
    if (numero == num[i]) {
      posicion = i;
    }
  }
  
  return posicion + 1;
  
}


public static int [] volteaArrayInt (int num[]) {
  
  int[] voltea = new int [num.length];
  
  int x = num.length ;
  
    for (int i = 0; i < num.length; i++) {
      voltea[i] = num[x - 1];
     x--;
    }
    
    return voltea;
  
 }
 
 public static void rotaDerechaArrayInt (int num[], int posiciones) {
  
	for (int x = 0; x < posiciones; x++) {
    
   int[] copia = new int [num.length];
  
    for (int i = 0; i < num.length; i++) {
      
      if (i > 0 && i < num.length) {
        
        num[i] = copia[i - 1];
        
      } else if (i == 0) {
        
        num[i] = copia[num.length - 1];
      }
   }
  
 }
 
 }
}
