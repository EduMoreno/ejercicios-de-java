/**
 * 1.Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 * 
 * @author Eduardo Moreno
 */

public class MuestraGato {
  public static void main(String[] args) {
    Gato[] gato = new Gato[4];
   
 System.out.println("Introduce los datos de los gatos");
    System.out.println();
    
    for (int i = 0; i < 4; i++) {
      gato[i] = new Gato();
      System.out.println("Gato " + (i + 1));
      System.out.print("Nombre: ");
      gato[i].setNombre(System.console().readLine());
      System.out.print("Color: ");
      gato[i].setColor(System.console().readLine());
      System.out.print("Raza: ");
      gato[i].setRaza(System.console().readLine());
      System.out.print("Sexo: ");
      gato[i].setSexo(System.console().readLine());
      System.out.println();
    }
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
