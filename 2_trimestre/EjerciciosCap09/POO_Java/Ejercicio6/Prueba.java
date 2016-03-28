/**
 * Crea la clase Tiempo con los métodos suma y resta . Los objetos de la clase Tiempo
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los parámetros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el método toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s . Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado debería ser 1h 6m 0s . Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
*/
public class Prueba{
    
  public static void main(String[] args) {
    
    System.out.println("Introduce 2 horas : ");
    int hora = Integer.parseInt(System.console().readLine());
    int hora2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce 2 minutos: ");
    int min = Integer.parseInt(System.console().readLine());
    int min2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce 2 segundos: ");
    int seg = Integer.parseInt(System.console().readLine());
    int seg2 = Integer.parseInt(System.console().readLine());
       
    Tiempo parametro1 = new Tiempo(hora, min, seg);
    Tiempo parametro2 = new Tiempo(hora2, min2, seg2);
    
    System.out.println(parametro1.suma(parametro2));
    System.out.println(parametro1.resta(parametro2));
 }
}
