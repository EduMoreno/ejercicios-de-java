/**
 * 2.Crea la clase Vehiculo , así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo , crea los atributos de clase vehiculosCreados y
 * kilometrosTotales , así como el atributo de instancia kilometrosRecorridos . Crea
 * también algún método específico para cada una de las subclases.
*/
 public class Bicicleta extends Vehiculo {

  private String tipo; 
  private String marca; 
  private String color; 
  
  public Bicicleta(String t ,String m, String c) {
    super();
    this.tipo = t;
    this.marca = m;
    this.color = c;
  }
 
  public void saltaObstaculo() {
    System.out.println("Estoy saltando un obstaculo");
  }
  
   public void hazCaballito() {
    System.out.println("Hago un caballito");
  }
}
