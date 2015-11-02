/**
 * 3.Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
 * 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio3 {
    
  public static void main(String[] args) {
    String numCarta = " ";
    String palo = " ";
     
    int num = (int)(Math.random()* 4 + 1);
    
    switch(num) {
      case 1:
        palo = "Oros";
        break;
      case 2:
        palo = "Copas";
        break;
      case 3:
        palo = "Bastos";
        break;
      case 4:
        palo = "Espadas";
      default:
    }

    int num2 = (int)(Math.random()* 10 + 1);
    
    switch(num2) {
      case 1:
        numCarta = "A";
        break;
      case 8:
        numCarta = "Sota";
        break;
      case 9:
        numCarta = "Caballo";
        break;
      case 10:
        numCarta = "Rey";
        break;
      default:
        numCarta = String.valueOf(num2);
    }
    
    System.out.println("La carta sacada al azar es " + numCarta + " de " + palo);
  }
}
