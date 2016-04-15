/**
 * 1.Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 * 
 * @author Eduardo Moreno
 */

public class Gato {
  private String nombre;
  private String color;
  private String raza;
  private String sexo;
  private int edad;
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
  
    public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;

  }
}
