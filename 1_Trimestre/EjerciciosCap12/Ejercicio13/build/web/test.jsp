<%-- 
 Transforma el test de infidelidad realizado anteriormente para consola en una aplicación
  web
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 13</title>
    </head>
        
    <body>   
        <%
       int puntos = 0;
       
        for ( Integer n = 1; n < 11; n++) {
         puntos += Integer.parseInt(request.getParameter(n.toString()));
        }
          
          if (puntos <= 10) {
            out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
          }

          if ((puntos >= 11) && (puntos <= 22)) {
            out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
          }

          if (puntos > 22) {
            out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
          }
      %>
 
    </body>
</html>
 