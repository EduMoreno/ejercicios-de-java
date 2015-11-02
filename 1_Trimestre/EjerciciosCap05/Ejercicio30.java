/**
 * 30. Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de
 * la semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se
 * puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se
 * debe comprobar que el usuario introduce los datos correctamente y que el segundo día es
 * posterior al primero. A continuación se muestra un ejemplo:
 * 
 * Por favor, introduzca la primera hora.
 * Día: lunes
 * Hora: 18
 * Por favor, introduzca la segunda hora.
 * Día: martes
 * Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 * 
 * @author Eduardo Moreno
 */

public class Ejercicio30 {

  public static void main(String[] args) {
    
    int numDia1 = 0;
    int numDia2 = 0;
    int hora = 0;
    int hora2 = 0;
    String dia;
    String dia2;
    boolean n;
    do{
      do{
        System.out.println("Introduzca la primera hora.");
        System.out.print("Día: ");
        dia = (System.console().readLine()).toLowerCase();
        
        n = true;
        
        switch (dia){
          case "lunes":
            numDia1 = 1;
            break;
          case "martes":
            numDia1 = 2;
            break;
          case "miercoles":
            numDia1 = 3;
            break;
          case "jueves":
            numDia1 = 4;
            break;
          case "viernes":
            numDia1 = 5;
            break;
          case "sabado":
            numDia1 = 6;
            break;
          case "domingo":
            numDia1 = 7;
            break;
          default:
            n = false;
            break;
        }
      }while (!n);
      
      do{
        System.out.print("Hora: ");
        hora = Integer.parseInt(System.console().readLine());
      }while (hora <= 0 || hora > 24);
      
      do{
        System.out.println("Por favor, introduzca la segunda hora.");
        System.out.print("Día: ");
        dia2 = (System.console().readLine()).toLowerCase();
        
        n = true;
        
        switch (dia2){
          case "lunes":
            numDia2 = 1;
            break;
          case "martes":
            numDia2 = 2;
            break;
          case "miercoles":
            numDia2 = 3;
            break;
          case "jueves":
            numDia2 = 4;
            break;
          case "viernes":
            numDia2 = 5;
            break;
          case "sabado":
            numDia2 = 6;
            break;
          case "domingo":
            numDia2 = 7;
            break;
          default:
            n = false;
            break;
        }
      }while (!n);
      
      do{
        System.out.print("Hora: ");
        hora2 = Integer.parseInt(System.console().readLine());
      }while (hora2 <= 0 || hora2 > 24);
      
    }while (numDia1 > numDia2);
    
    int horas = 0;
    
    do{
      horas += 24;
      numDia1++;
    }while (numDia1 < numDia2);
    
    if (hora < hora2){
      horas += hora2 - hora;
    }    
     if (hora > hora2){
      horas -= hora - hora2;
    }
    
    System.out.print("Entre las " + hora + ":00h del " + dia + " y las ");
    System.out.print(hora2 + ":00h del " + dia2 + " hay ");
    System.out.print(horas + " horas.");
  }
}
