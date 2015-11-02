/**
 * 2.Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
 * baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
 * formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
 * 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n)
 *
 * @author Eduardo Moreno
 */

public class Ejercicio2 {
    
  public static void main(String[] args) {
    String numCarta = " ";
    String palo = " ";
     
    int num = (int)(Math.random()* 4 + 1);
    
    switch(num) {
      case 1:
        palo = "Picas";
        break;
      case 2:
        palo = "Corazones";
        break;
      case 3:
        palo = "Diamantes";
        break;
      case 4:
        palo = "Treboles";
      default:
    }

    int num2 = (int)(Math.random()* 13 + 1);
    
    switch(num2) {
      case 1:
        numCarta = "A";
        break;
      case 11:
        numCarta = "J";
        break;
      case 12:
        numCarta = "Q";
        break;
      case 13:
        numCarta = "K";
        break;
      default:
        numCarta = String.valueOf(num2);
    }
    
    System.out.println("La carta sacada al azar es " + numCarta + " de " + palo);
  }
}
