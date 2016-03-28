/**
 * 2.Crea la clase Vehiculo , así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo , crea los atributos de clase vehiculosCreados y
 * kilometrosTotales , así como el atributo de instancia kilometrosRecorridos . Crea
 * también algún método específico para cada una de las subclases.
*/
public abstract class Vehiculo {
  
  // atributos
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  
  // instancia
  private int kilometrosRecorridos;
  
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
