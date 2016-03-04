/**
 * 1.Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
instancias y aplicándole algunos métodos.
*/

public class Caballo {

  public static void main(String[] args) {
    
    ClaseCaballo a = new ClaseCaballo("Rocinante" , "macho");
    ClaseCaballo b = new ClaseCaballo("Pegaso", "hembra");
    
    System.out.println("Mi nombre es " + a.getNombre());
    a.grita();
    System.out.println("Mi sexo es " + a.getSexo());
    a.grita();
    System.out.println("Mi nombre es " + b.getNombre());
    b.grita();
    System.out.println("Mi sexo es " + b.getSexo());
    b.grita();
  }
}
