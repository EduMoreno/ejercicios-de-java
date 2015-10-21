/**
 * 20. Igual que el ejercicio anterior pero esta vez se debe pintar una 
 * pirámide hueca.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio20 {

  public static void main(String[] args) {

   String caracter;
   
      System.out.print("Introduzca la altura: ");
      int altura = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el caracter para pintar la piramide: ");
      caracter = System.console().readLine();
    
    int altura2 = 1;
    int espaciado = altura;
    int espaciadoInterno = 0;
    
    do {
    
      for (int e = 1; e <= espaciado -1; e++) {
        System.out.print(" ");
      }
    
      System.out.print(caracter);
      for (int e = 1; e < espaciadoInterno; e++) {
        System.out.print(" ");
      }
       
        System.out.print(caracter);
       
      System.out.println("");
      
      altura2++;
      espaciado--;
      espaciadoInterno += 2;
      
    } while (altura2 < altura);
       
      for (int e = 1; e < altura2 * 2; e++) {
        System.out.print(caracter);
      }

  }
}
