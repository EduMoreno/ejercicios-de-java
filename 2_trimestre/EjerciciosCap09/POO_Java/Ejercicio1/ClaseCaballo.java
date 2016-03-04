/**
 * 1.Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 *instancias y aplicándole algunos métodos.
*/
public class ClaseCaballo {
  
String nombre;
String sexo;
String raza;
String color;
int edad;

ClaseCaballo (String c , String d) {
    this.nombre = c;
    this.sexo = d;
  }
  

   String getNombre() {
    return this.nombre;
  }
  

 String getSexo() {
    return this.sexo;
  }
  
   void grita() {
    System.out.println("iiiigigiii");
  }

}


