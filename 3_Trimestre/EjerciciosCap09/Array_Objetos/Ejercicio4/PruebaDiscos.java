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

public class PruebaDiscos {

  public static void main(String[] args) {
    
    Discos[] album = new Discos[4];
    int opcion = 0;
    int listado;
    
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
       
       do {
          System.out.println("LISTADO");
          System.out.println();
          System.out.println("1. Completo");
          System.out.println("2. Por autor");
          System.out.println("3. Por género");
          System.out.println("4. En un rango de duración");
          System.out.println("5. Atras");
          System.out.print("Introduzca una opción: ");
          listado = Integer.parseInt(System.console().readLine());        
          
          switch (listado) {

                    
        case 1:
         for(int i = 0; i < 4; i++) {
            if (!album[i].getCodigo().equals("Vacio")) {
                System.out.println("------------------------------------------");
                System.out.println("Código: " + album[i].getCodigo());  
                System.out.println("Autor: " + album[i].getAutor());    
                System.out.println("Título: " + album[i].getTitulo());
                System.out.println("Género: " + album[i].getGenero());
                System.out.println("Duración: " + album[i].getDuracion());
            }
          } 
          break;
          
          case 2: 
  
              System.out.print("Introduzca el autor: ");
              String autor= System.console().readLine();
              
              for(int i = 0; i < album.length; i++) {
                if ( (!album[i].getCodigo().equals("Vacio")) && (album[i].getAutor().equals(autor)) ){
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                }
              }
              break;
              
           case 3: 
        
             System.out.print("Introduzca el género: ");
             String genero= System.console().readLine();
              
              for(int i = 0; i < 4; i++) {
                if ( (!album[i].getCodigo().equals("Vacio")) && (album[i].getGenero().equals(genero)) ){
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                 
                }
              }
              break;
            
              case 4: 
  
              System.out.println("Establezca el intervalo para la duración");
              System.out.print("Introduzca el límite inferior de duración en minutos: ");
              int limiteInferior = Integer.parseInt(System.console().readLine());
              System.out.print("Introduzca el límite superior de duración en minutos: ");
              int limiteSuperior = Integer.parseInt(System.console().readLine());
              
              for(int i = 0; i < 4; i++) {
                if ( (!album[i].getCodigo().equals("Vacio")) && (album[i].getDuracion() <= limiteSuperior) && (album[i].getDuracion() >= limiteInferior) ){
                  System.out.println("------------------------------------------");
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
                 
                }
              }
              
          } 
        } while (listado != 5);

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
