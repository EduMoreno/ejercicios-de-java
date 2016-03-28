/**
 * 2.Crea la clase Vehiculo , así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo , crea los atributos de clase vehiculosCreados y
 * kilometrosTotales , así como el atributo de instancia kilometrosRecorridos . Crea
 * también algún método específico para cada una de las subclases.
*/
public class PruebaVehiculo {
  public static void main(String[] args) {
    
    int numKm;
    int num;
      
  Bicicleta bmx = new Bicicleta("Montaña","BMX","Negro y Blanco");
  Coche opel = new Coche("Meriva","Opel","Azul Mineral");
  
      do {   
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Salta un obstaculo con la bicicleta");
        System.out.println("4. Anda con el coche");
        System.out.println("5. Enciende el coche");
        System.out.println("6. Apaga el coche");
        System.out.println("7. Ver kilometraje de la bicicleta");
        System.out.println("8. Ver kilometraje del coche");
        System.out.println("9. Ver kilometraje total");
        System.out.println("10. Salir");
        System.out.println("Elige una opcion (1-10): ");
         
        num = Integer.parseInt(System.console().readLine());
    
        switch (num) {
            case 1:
              System.out.print("¿Cuantos kilometros quieres recorrer? ");
              numKm = Integer.parseInt(System.console().readLine());
              bmx.recorre(numKm);
              break;
            case 2:
              bmx.hazCaballito();
              break;
            case 3:
            bmx.saltaObstaculo();
            break;
            case 4:
              System.out.print("¿Cuantos kilometros quiere recorrer? ");
              numKm = Integer.parseInt(System.console().readLine());
              opel.recorre(numKm);
              break;
            case 5:
              opel.Enciende();
              break;
            case 6:
              opel.Apagado();
              break;
            case 7:
              System.out.println("La bicicleta lleva recorridos ");
              System.out.println(bmx.getKilometrosRecorridos() + " Km");
              break;
            case 8:
              System.out.println("El coche lleva recorridos ");
              System.out.println(opel.getKilometrosRecorridos() + " Km");
              break;
            case 9:
              System.out.println("Los vehiculos llevan recorridos ");
              System.out.println(bmx.getKilometrosTotales() + " Km");
             
            default:
        }
      } while(num != 10);
  }
}

