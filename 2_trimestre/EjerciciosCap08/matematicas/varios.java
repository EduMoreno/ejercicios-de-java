
package matematicas;
public class varios {

/**1.esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
y falso en caso contrario.*/

public static boolean cifra (int numero){

    if (numero < 10) {
      return true;
    }

    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
       return  true;
      }
    }

    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
      return true;
      }
    }

    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10) == (( numero / 10) % 10))) {
        return true;
      }
    }

    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        return true;
      }
    }
    return false;
  }
  
/**
* 2.esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y
* falso en caso contrario.
*/

 public static boolean esPrimo (int x){

     for (int i= 2; i < x; i ++){
      if (( x % i ) == 0){
      return false;
      }
    }
 
 return true;
 
    }
/**
 * 3.siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
 * como parámetro.  
 */
public static int siguientePrimo (int x){
    
    
    boolean p;
    
     x++;
     
    do {

        p = true;
         for (int i= 2; i < x; i ++){
          if (( x % i ) == 0){
            
          p= false;
          }
        }
     x++;
     
    } while (!p);
 
   x--;

 return x;
    }
    
/**
 * 4.potencia: Dada una base y un exponente devuelve la potencia
 */
 
   public static int potencia (int  exponente , int numero){
      int potencia = 1;
        if (exponente == 0) {
          potencia = 1;
        }
        
        if (exponente > 0) {
          for (int i = 0; i < exponente; i++) {
            potencia *= numero;
          }
        }
        
        if (exponente < 0) {
          for (int i = 0; i < -exponente; i++) {
            potencia *= numero;
          }
          
          potencia = 1/potencia;
        }

     return potencia;
     
        }
        
/**
 * 5.digitos: Cuenta el número de dígitos de un número entero.*/
 
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } 
    
    else {
            int n = 0;
      while (x > 0) {
          x = x / 10;
          n++;
      
      }
      return n;
    }
  }
  
  /**
 * 6.voltea: Le da la vuelta a un número.
 * */
 public static int voltea (int x) {
 int numero = 0;
 int dividido= x;
 int volteado=0;
 
 while (dividido != 0) {
   numero = dividido %10;
   
   dividido = dividido /10;
   volteado = volteado * 10 + numero;
 }
 
 return volteado;
}
  /**
 * 7.digitoN: Devuelve el dígito que está en la posición n de un número entero. Se
 * empieza contando por el 0 y de izquierda a derecha.*/
 
 
 
  
}
