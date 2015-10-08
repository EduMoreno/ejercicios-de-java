/**
 * 12. Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
 *     en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
 *     calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan
 *     para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 *
 * @author Eduardo Moreno
 */

public class Ejercicio12 {
  public static void main(String[] args) {

    int nota = 0;
    String respuesta;
     
        
    System.out.println("1. ¿Que signfica  las siglas RAM?");
    System.out.println("a) Random Access Memory"); 
    System.out.println("b) Renew Access Motherboard"); 
    System.out.println("c) Renove Access MEMOR"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    nota ++;
      }
      
    System.out.println("2. ¿Que comando se usa para crear una carpeta en linux?");
    System.out.println("a) create dir"); 
    System.out.println("b) mkdir"); 
    System.out.println("c) cut"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
    nota ++;
      }
      
    System.out.println("3. ¿Que programa se puede usar para retoque de paginas WEB?");
    System.out.println("a) Adobe Dreamviewer"); 
    System.out.println("b) Cpu-z"); 
    System.out.println("c) Jdowloader"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    nota ++;
      }
      
    System.out.println("4. ¿Cual es el comando para instalar un programa en linux?");
    System.out.println("a) sudo apt-get update"); 
    System.out.println("b) sudo apt-get install"); 
    System.out.println("c)  sudo apt-get upgrade"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
    nota ++;
      }
      
    System.out.println("5. ¿Que componente de ordenador se necesita para poder visualizar un videojuego ?");
    System.out.println("a)  HDD"); 
    System.out.println("b) Lector DVD"); 
    System.out.println("c) Tarjeta Gráfica"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
    nota ++;
      }
      
    System.out.println("6. ¿HTML es un lenguaje de marcas?");
    System.out.println("a) Si"); 
    System.out.println("b) No"); 
    System.out.println("c) Si, aunque ya no se usa "); 
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    nota ++;
      }  
      
    System.out.println("7. ¿Que programa usamos para ver la informacion de nuestro ordenador?");
    System.out.println("a) Aida 64"); 
    System.out.println("b) Partition Magic"); 
    System.out.println("c) Ninguna de las anteriores "); 
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    nota ++;
      }  
      
    System.out.println("8. ¿La RAM es obligatoria para que el sistema pueda funcionar?");
    System.out.println("a) No"); 
    System.out.println("b) Si"); 
    System.out.println("c) No, la cache se encarga de respaldar a la RAM "); 
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
    nota ++;
      }    
      
    System.out.println("9. ¿Se siguen fabricando los procesadores Pentium 2?");
    System.out.println("a) Si"); 
    System.out.println("b) No"); 
    System.out.println("c) Si, para empresas con niveles de programacion muy altos "); 
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
    nota ++;
      }    
      
    System.out.println("10. ¿Quien es Steve Jobs?");
    System.out.println("a) Fundador de Apple"); 
    System.out.println("b) Fundador de Microsoft"); 
    System.out.println("c) Fundador de Oracle "); 
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
    nota ++;
      }    
       System.out.println("Ha tenido una calificación de " + nota  );
  }
 }































