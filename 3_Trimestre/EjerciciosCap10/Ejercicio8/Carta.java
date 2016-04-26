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
private String valorElegido="";
private String posicionElegida="";



  public Carta(){
  
  this.valorElegido = carta[(int)(Math.random() * 10)];
  this.posicionElegida = posicion[(int)(Math.random() * 4)];
  
  
}
  public String getValor(){
    return valorElegido;
  
}

  public String getPosicion(){
    return posicionElegida;
 }

 
public String toString(){
      
  return this.valorElegido + " de " + posicionElegida;
  
 }
}
