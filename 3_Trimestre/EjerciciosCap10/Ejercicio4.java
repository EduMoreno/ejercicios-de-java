/**
* 4. Realiza un programa equivalente al anterior pero en esta ocasión, el programa
* debe ordenar palabras en lugar de números.
* 
* @author Eduardo Moreno
*/
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
      a.add("Edu");
      a.add("Junior");
      a.add("Alex");
      a.add("Antonio");
      a.add("Ruben");
      a.add("Moises");
      a.add("Jose");
        
        System.out.print("Palabras Generadas: ");
        for (String i : a) {
            System.out.print(i + " | ");
        }

        System.out.println();

        Collections.sort(a);
        System.out.print("Palabras ordenadas: ");
        for (String i : a) {
            System.out.print(i + " | ");
        }

    }
}
