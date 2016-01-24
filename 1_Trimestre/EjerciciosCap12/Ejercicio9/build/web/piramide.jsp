<%-- 
 Realiza una aplicación que pinte una pirámide. La altura se pedirá en un formulario. La
 pirámide estará hecha de bolitas, ladrillos o cualquier otra imagen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 9</title>
    </head>
        
    <body>   
    <%          
      int altura = Integer.valueOf(request.getParameter("altura")); 
      int altura2 = 1;
      int espaciado = altura ;

      do {

        for (int e = 1; e <= espaciado-1; e++) {
        out.print("<img src=\"blanco.jpg\">");
        }
    
        for (int e = 1; e < altura2 * 2; e++) {
        out.print("<img src=\"ladrillo.png\">");
        }
      
        out.println("<br>");
    
        altura2++;
        espaciado--;
      
      } while (altura2 <= altura) ;
    %>
 
    </body>
</html>
 