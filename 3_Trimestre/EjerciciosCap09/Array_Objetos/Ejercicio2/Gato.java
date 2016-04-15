/**
 * 2.Cambia el programa anterior de tal forma que los datos de los gatos se intro-
 * duzcan directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
 * mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
 * “macho”) . Muestra a continuación los datos de todos los gatos utilizando un
 * bucle.
 * 
 * @author Eduardo Moreno
 */

public class Gato {
  private String nombre;
  private String color;
  private String raza;
  private String sexo;
  private int edad;
  
  public Gato(String nombre, String color, String raza , String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
  }
  
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
