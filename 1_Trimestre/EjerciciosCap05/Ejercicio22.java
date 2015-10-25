/**
 * 22. Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio22 {

  public static void main(String[] args) {

    boolean primo = true;
   
    for (int n = 2; n <= 100; n++) {
    primo = true;
      
      for (int e = 2; e < n; e++) {
        if ((n % e) == 0) {
        primo = false;
        }
      }
      
      if (primo) {
        System.out.print(n + ",");
      }
    }
    
  }
}

