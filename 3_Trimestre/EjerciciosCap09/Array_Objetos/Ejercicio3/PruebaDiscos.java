/**
 * @author Eduardo Moreno
 */

public class PruebaDiscos {

  public static void main(String[] args) {
    
    Discos[] album = new Discos[4];
    int opcion = 0;
  
    
    for(int i = 0; i < 4; i++) {
      album[i] = new Discos();
    }
    
    do{
      System.out.println("Elige una de las opciones: ");
      System.out.println("  1. Listado de discos");
      System.out.println("  2. Crear nuevo disco");
      System.out.println("  3. Modificar Disco");
      System.out.println("  4. Borrar disco");
      System.out.println("  5. Salir");
      System.out.println("-----------------------------");

      opcion = Integer.parseInt(System.console().readLine());

      switch(opcion){
                 
        case 1:
          
          System.out.println("Listado de discos: ");
          for(int i = 0; i < album.length; i++) {
            if (!album[i].getCodigo().equals("Vacio")) {
              System.out.println(album[i]);
            }
          } 
          break;
          
        case 2:
          int vacio = -1;
          do{
            vacio ++;
          }while(!(album[vacio].getCodigo().equals("Vacio")));
          
          System.out.print("Código: ");
          String codigo = (System.console().readLine());
          System.out.print("Autor: ");
          String autor = (System.console().readLine());
          System.out.print("Titulo: ");
          String titulo = (System.console().readLine());
          System.out.print("Genero: ");
          String genero = (System.console().readLine());
          System.out.print("Duración: ");
          int duracion = Integer.parseInt(System.console().readLine());
          
          album[vacio] = new Discos(codigo, autor, titulo, genero, duracion);
          
          break;
        case 3:
          String codigoIntroducido;
          System.out.print("Escribe el código del disco a modificar: ");
          codigoIntroducido = System.console().readLine();
          int i;
          i = -1;
          do{
            i ++;
          }while(!(album[i].getCodigo().equals(codigoIntroducido)));
             
          System.out.print("Autor: ");
          album[i].setAutor((System.console().readLine()));
          System.out.print("Titulo: ");
          album[i].setTitulo((System.console().readLine()));
          System.out.print("Genero: ");
          album[i].setGenero((System.console().readLine()));
          System.out.print("Duracion: ");
          album[i].setDuracion(Integer.parseInt(System.console().readLine()));
          
          break;
        
        case 4:
          
          System.out.print("Escribe el código del disco a borrar: ");
          codigoIntroducido = System.console().readLine();
          i = -1;
          do{
            i ++;
          }while(!(album[i].getCodigo().equals(codigoIntroducido)));
        
          album[i].setCodigo("Vacio");
      }
    }while(opcion < 5 || opcion == 0);
  }
  
}
