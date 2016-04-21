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
 
public class Moneda {

private String [] valor={"1 céntimo","2 céntimos","5 céntimos","10 céntimos","20 céntimos","50 céntimos","1 euro","2 euros"};
private String [] posicion={"cara","cruz"};
private String valorElegido="";
private String posicionElegida="";



  public Moneda(){
    
    this.valorElegido = valor[(int)(Math.random() * 8)];
    this.posicionElegida = posicion[(int)(Math.random() * 2)];
       
  }
  public String getValor(){
    return valorElegido;
    
  }

  public String getPosicion(){
    return posicionElegida;

  }

  public String toString(){
    return this.valorElegido + " --- " + posicionElegida;
  
  
  }

}
