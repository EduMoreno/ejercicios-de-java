/**
* 7. La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
* un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
* anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
* céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
* cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
* siguiendo la pauta correcta. Cada moneda generada debe ser una instancia
* de la clase Moneda y la secuencia se debe ir almacenando en una lista.
* 
* @author Eduardo Moreno
 */
 import java.util.ArrayList;

public class Eurocoin {

  public static void main(String[] args) {
    ArrayList<Moneda> a = new ArrayList<Moneda>();
    
    Moneda monedas = new Moneda();
    a.add(monedas);
    String posicion = monedas.getPosicion();
    String valor = monedas.getValor();
    
    for (int i = 0; i < 5; i++) {
      do {
        monedas = new Moneda();
      } while (!((monedas.getPosicion()).equals(posicion)) && !((monedas.getValor()).equals(valor)));
      
      a.add(monedas);
      posicion = monedas.getPosicion();
      valor = monedas.getValor();
    }
    
    for (Moneda num : a) {
      System.out.println(num);
    }
  }
}
