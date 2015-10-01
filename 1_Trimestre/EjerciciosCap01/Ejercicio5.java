/**
 * 
 *
 * @author Eduardo Moreno
 */

public class Ejercicio5 { // Clase principal
  public static void main(String[] args) {
  
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    
    System.out.println( rojo + " \t \t Lunes\t" + morado + " Martes" + naranja + " Miercoles" + azul + " Jueves" + verde + " Viernes");
    System.out.println("08:15-9:15 \t FOL \t PROG \t SIN \t PROG \t BBDD");
    System.out.println("09:15-10:15 \t FOL \t PROG \t SIN \t PROG \t BBDD");
    System.out.println("10:15-11:15 \t FOL \t PROG \t SIN \t PROG \t BBDD");
    System.out.println("11:15-11:45 \t  \t RECREO ");
    System.out.println("11:45-12:40 \t PROG \t BBDD \t SIN \t ED \t PROG");
    System.out.println("12:40-13:35 \t ED \t BBDD \t LM \t LM \t SIN");
    System.out.println("13:35-14:30 \t ED \t BBDD \t LM \t LM \t SIN");
  }
}
