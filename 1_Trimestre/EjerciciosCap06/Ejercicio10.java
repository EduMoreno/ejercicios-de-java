/**
 * 10.Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
 * con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
 * ., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio10 {
    
  public static void main(String[] args) {
    String relleno = " ";
    
    for(int numLinea = 1; numLinea <= 10; numLinea++) {
      
     int longitudLinea = (int)(Math.random() * 40) + 1;
     int caracter = (int)(Math.random() * 6 + 1);
      
      switch(caracter) {
        case 1:
          relleno = "*";
          break;
        case 2:
          relleno = "-";
          break;
        case 3:
          relleno = "=";
          break;
        case 4:
          relleno = ".";
          break;
        case 5:
          relleno = "|";
          break;
        case 6:
          relleno = "@";
          break;
        default:
        relleno = String.valueOf(caracter);
      }
      
        for(int n = 1; n <= longitudLinea; n++) {
        System.out.print(relleno);
        }
      System.out.println();
    }
  }
}
