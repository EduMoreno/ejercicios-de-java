/**
 * 2.Crea la clase Vehiculo , así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo , crea los atributos de clase vehiculosCreados y
 * kilometrosTotales , así como el atributo de instancia kilometrosRecorridos . Crea
 * también algún método específico para cada una de las subclases.
*/
 public class Coche extends Vehiculo {

  private String modelo; 
  private String marca; 
  private String color; 
  
  public Coche(String a ,String m, String c) {
    super();
    this.modelo = a;
    this.marca = m;
    this.color = c;
  }
 
  
  public void Enciende() {
    System.out.println("EL coche esta encendido");
  }
  
  public void Apagado() {
    System.out.println("EL coche esta apagado");
  }

}
