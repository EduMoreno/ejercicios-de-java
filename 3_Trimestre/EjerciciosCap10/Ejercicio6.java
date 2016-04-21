/**
 * 6.Implementa el control de acceso al área restringida de un
 * programa. Se debe pedir un nombre de usuario y una contraseña. Si
 * el usuario introduce los datos correctamente, el programa dirá
 * "Ha accedido al área restringida". El usuario tendrá un máximo de
 * 3 oportunidades. Si se agotan las oportunidades el programa dirá
 * "Lo siento, no tiene acceso al área restringida". Los nombres de
 * usuario con sus correspondientes contraseñas deben estar
 * almacenados en una estructura de la clase HasMap.
 *  
 *  @author Eduardo Moreno
 */
 
import java.util.HashMap;

public class Ejercicio6 {
  public static void main(String[] args) {

    HashMap<String, String> m = new HashMap<String, String>();
        
    String usuario;
    String contrasena;
    int contador = 3;

    m.put("Usuario", "usuario1");
    m.put("Administrador", "admin");      
  
    while (contador > 0) {
      System.out.print("Introduzca su usuario: ");
      usuario = System.console().readLine();    
      System.out.print("Introduzca su contraseña: ");
      contrasena = System.console().readLine();
      
      if (m.containsKey(usuario)) {
        if (m.get(usuario).equals(contrasena)) {
          System.out.println("Ha accedido al área restringida");
          break;
        } else {
          System.out.println("Contraseña incorrecta");
        }
      } else {
        System.out.println("Usuario incorrecto");
      }
      
      contador--;
      
      if (contador > 1) {
        System.out.println("Tienes " + contador + " oportunidades");
      }
      
       if (contador == 1) {
        System.out.println("Tienes " + contador + " oportunidad");
      }
      
    }

    if (contador == 0){
      System.out.print("Lo siento, no tiene acceso al área restringida");
    }
  }
}
