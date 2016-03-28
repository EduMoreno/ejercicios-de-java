/**
Crea las clases Animal , Mamifero , Ave , Gato , Perro , Canario , Pinguino y Lagarto . Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.
*/

public abstract class Animal {

  private String sexo;
  private String tipo;

  public Animal (String t , String s) {
    this.tipo = t;
    this.sexo = s;
    
  }

  public String getSexo() {
    return this.sexo;
  }
  
   public String getTipo() {
    return this.tipo;
  }


  public void nada() {
    System.out.println("Estoy nadando");
  }
  
   public void bebe( String bebida) {
    System.out.println("Estoy bebiendo" + bebida);
  }
  
  public void come(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }
  
  
}
