/**
* 8. Realiza un programa que escoja al azar 10 cartas de la baraja española
* (10 objetos de la clase Carta ). Emplea un objeto de la clase ArrayList para
* almacenarlas y asegúrate de que no se repite ninguna..
* 
* @author Eduardo Moreno
*/

import java.util.*;

public class PruebaCarta {

  public static void main(String[] args) {
    
    ArrayList<Carta> a = new ArrayList<Carta>();
    
    Carta aux = new Carta();
    a.add(aux);
    
    for (int i = 0; i < 9; i++) {
      do {
        aux = new Carta();      
      } while (a.contains(aux));
      
      a.add(aux);
    }
    
    Collections.sort(a);
    
    for (Carta num: a) {
      System.out.println(num);
    }
  }
}
