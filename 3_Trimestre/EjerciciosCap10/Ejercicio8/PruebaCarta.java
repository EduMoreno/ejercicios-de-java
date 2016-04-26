/**
* 8. Realiza un programa que escoja al azar 10 cartas de la baraja española
* (10 objetos de la clase Carta ). Emplea un objeto de la clase ArrayList para
* almacenarlas y asegúrate de que no se repite ninguna..
* 
* @author Eduardo Moreno
*/

 import java.util.ArrayList; 

public class PruebaCarta {

  public static void main(String[] args) {
    ArrayList<Carta> a = new ArrayList<Carta>();
  
   
   Carta cartaAux = new Carta();
   
    a.add(cartaAux);
   
    
    for (int i = 0; i < 10 ; i++) {
      do {
        cartaAux = new Carta();
      }while (a.contains(cartaAux));           
      
                 
       a.add(cartaAux);
    }  
     
   for (Carta num : a) {
 
        System.out.println(num + "  ");
    }
  }
}
