/**
 * 2.Cambia el programa anterior de tal forma que los datos de los gatos se intro-
 * duzcan directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
 * mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
 * “macho”) . Muestra a continuación los datos de todos los gatos utilizando un
 * bucle.
 * 
 * @author Eduardo Moreno
 */

public class MuestraGato {
  public static void main(String[] args) {
    Gato[] gato = new Gato[4];
 
    gato[0] = new Gato("Garfield","Naranja","Persa" ,"Macho");
    gato[1] = new Gato("Antonio", "Negro", "Egipcio" , "Hembra");
    gato[2] = new Gato("Noa", "Amarillo", "Siames" , "Hembra");
    gato[3] = new Gato("Doraemon", "Azul", "Robot" , "Macho");

    System.out.println("-------------------------------------------------------");
    System.out.println("Los datos de los gatos son:");
     System.out.println();

    for (int i = 0; i < 4; i++) {
      System.out.println("Gato " + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
      System.out.println("Sexo: " + gato[i].getSexo());
      System.out.println();
    }
  }
}
