/**
* 8. Realiza un programa que escoja al azar 10 cartas de la baraja española
* (10 objetos de la clase Carta ). Emplea un objeto de la clase ArrayList para
* almacenarlas y asegúrate de que no se repite ninguna..
* 
* @author Eduardo Moreno
*/
 
public class Carta {

private String [] carta={"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
private String [] posicion={"Bastos","Oros", "Copas", "Espadas"};
private Integer valorElegido;
private String posicionElegida="";



  public Carta(){
  
  this.valorElegido = (int)(Math.random() * 10);
  this.posicionElegida = posicion[(int)(Math.random() * 4)];
  
  
}


  public int getValor(){
    return valorElegido;
  
}

  public String getPosicion(){
    return posicionElegida;
 }

@Override
public String toString(){
      
  return carta[valorElegido] + " de " + posicionElegida;
  
  
 }
 
@Override
  public int compareTo(Carta a) {
    if (posicionElegida.equals(a.getPosicion())) {
      return valorElegido.compareTo(a.getValor());
    } else {
      return posicionElegida.compareTo(a.getPosicion());
    }
}
}
