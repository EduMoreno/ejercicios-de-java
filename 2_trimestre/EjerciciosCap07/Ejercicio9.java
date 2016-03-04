/**
 * 9.Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
 * con la palabra “par” o “impar” según proceda.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio9 {
    
  public static void main(String[] args) {
    int[] num = new int[8];
    System.out.println("Introduce 8 numeros enteros ");
    for (int n = 0; n < 8; n++) {
    num[n] = Integer.parseInt(System.console().readLine());
        
    }
    for (int n = 0; n < 8; n++) {
      if (num[n] % 2 == 0){
      System.out.println(num[n] + " Par");
      }
      else {
        System.out.println(num[n] + " Impar" );
      }
    }
  }
}
