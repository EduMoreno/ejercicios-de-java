/**
 * 4.Modifica el programa “Colección de discos” como se indica a continuación:
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se permitirá
 * introducir los datos de ningún disco hasta que no se borre alguno de la lista.
 * b) Mejora la opción “Borrar” de tal forma que se verifique que el código
 * introducido por el usuario existe.
 * c) Modifica el programa de tal forma que el código del disco sea único, es decir
 * que no se pueda repetir.
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
 * listado completo, un listado por autor (todos los discos que ha publicado un
 * determinado autor), un listado por género (todos los discos de un género de-
 * terminado) y un listado de discos cuya duración esté en un rango determinado
 * por el usuario
 * 
 * @author Eduardo Moreno
 */

public class Discos {
  
  private String codigo = "Vacio";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;
  
  public Discos() {
    
  }
  
  public Discos(String codigo,String autor, String titulo, String genero, int duracion) {
    this.codigo = codigo;
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getAutor() {
    return autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getGenero() {
    return genero;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public String toString() {
    String cadena = "\n------------------------------------------";
    cadena += "\nCódigo: " + this.codigo;
    cadena += "\nAutor: " + this.autor;
    cadena += "\nTítulo: " + this.titulo;
    cadena += "\nGénero: " + this.genero;
    cadena += "\nDuración: " + this.duracion;
    cadena += "\n------------------------------------------";
    return cadena;
  }
  
}
