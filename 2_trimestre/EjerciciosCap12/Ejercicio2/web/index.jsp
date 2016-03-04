<%-- 
 2.Mejora el programa anterior de tal forma que la apariencia de la página web que muestra
   el navegador luzca más bonita mediante la utilización de CSS (utiliza siempre ficheros
   independientes para CSS para no mezclarlo con HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 2</title>
    </head>
    <LINK REL="stylesheet" HREF="css.css" TYPE="text/css">

    <body>
     <% out.print("Nombre: Eduardo Jesus Moreno Hernandez <br>"); 
     
     out.print("Telefóno: 655297845 <br>");
     
     out.print("Dirección: Campanillas <br>");
     %>

    </body>
</html>
