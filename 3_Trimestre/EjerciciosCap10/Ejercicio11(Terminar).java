/**
 * 11.Realiza un programa que escoja al azar 5 palabras en español del mini-
 * diccionario del ejercicio anterior. El programa irá pidiendo que el usuario
 * teclee la traducción al inglés de cada una de las palabras y comprobará si
 * son correctas. Al final, el programa deberá mostrar cuántas respuestas son
 * válidas y cuántas erróneas.
 * 
 * @author: Eduardo Moreno
 **/
import java.util.HashMap;

public class Ejercicio11 {
  public static void main(String[] args) {

    HashMap<String, String> a = new HashMap<String, String>();

    a.put("perro", "dog");
    a.put("casa", "house");      
    a.put("policia", "police");
    a.put("arma", "gun");
    a.put("cabeza", "head");
    a.put("videojuego", "game");
    a.put("ordenador", "computer");
    a.put("maquina", "machine");
    a.put("saltar", "jump");
    a.put("gato", "cat");
    a.put("pajaro", "bird");
    a.put("rata", "rat");
    a.put("raton", "mouse");
    a.put("desayuno", "breakfast");
    a.put("comida", "food");
    a.put("almuerzo", "lunch");
    a.put("cena", "dinner");
    a.put("reloj", "watch");
    a.put("tiempo", "time");
    a.put("lapiz", "pencil");
    a.put("boligrafo", "pen");
    a.put("goma", "rubber");

    System.out.print("Introduzca una palabra en español: ");
    String palabra = System.console().readLine();

    if (a.containsKey(palabra)) {
      System.out.println(palabra + " en inglés es " + a.get(palabra));
    } else {
      System.out.print("Esa palabra no esta en el diccionario.");
    }
  }
}
