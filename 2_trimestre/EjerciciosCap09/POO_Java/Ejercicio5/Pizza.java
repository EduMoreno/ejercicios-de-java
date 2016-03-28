/**
Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
*/
public class Pizza {
  
  private static int totalPedidas = 0;
  private static int totalServidas = 0;
  
  private String tamano;
  private String tipo;
  private String estado;
  
  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "Pedida";
    Pizza.totalPedidas++;
  }
  
  public String toString() {
    return "Pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
  }
  
  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

 
  public void sirve() {
    if (this.estado.equals("Pedida")) {
      this.estado = "Servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }
}
