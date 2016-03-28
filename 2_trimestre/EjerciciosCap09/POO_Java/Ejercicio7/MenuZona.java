/**
Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas dispo-
nibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
 */

public class MenuZona {

  public static void main(String[] args) {
    
    Zona principal = new Zona (1000);
    Zona compraVenta = new Zona (200);
    Zona vip = new Zona (25);
    
      int num;
      int num2;
      int entrada;
      
    do{
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: [1-3]");
      
      num = Integer.parseInt(System.console().readLine());
      
      switch(num){
        case 1:
          System.out.println();
          System.out.println("En la zona principal dispone de : " + principal.getEntradasPorVender());
          System.out.println("En la zona compra-venta dispone de : " + compraVenta.getEntradasPorVender());
          System.out.println("En la zona vip dispone de: " + vip.getEntradasPorVender());
          System.out.println();
          break;
        case 2:
          System.out.println();
          System.out.println("1. Principal");
          System.out.println("2. Compra-venta");
          System.out.println("3. Vip");
          System.out.print("Elige una opción: [1-3]");
          
          num2 = Integer.parseInt(System.console().readLine());
          
          System.out.print("¿Cuantas entradas quieres?: ");
          entrada = Integer.parseInt(System.console().readLine());
          
          System.out.println();
          
          switch(num2){
            case 1:
              principal.vender(entrada);
              break;
            case 2:
              compraVenta.vender(entrada);
              break;
            case 3:
               vip.vender(entrada);
               break;
               default:
          }
          System.out.println();
          break;
        default:
      }
    }while(num !=3);
  }
}
