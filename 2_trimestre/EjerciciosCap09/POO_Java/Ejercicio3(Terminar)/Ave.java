/**
Crea las clases Animal , Mamifero , Ave , Gato , Perro , Canario , Pinguino y Lagarto . Crea,
al menos, tres métodos específicos de cada clase y redefine el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.
*/

public class Ave extends Animal {
  

   public Ave (String s) {
    super(s);
  }

  public void canta() {
    System.out.println("Tralaralariiiiiiii");
  }

  public void caza() {
    System.out.println("Los canarios no cazan");
  }

  public void pia() {
    System.out.println("Pio pio pio");
  }
}
