<%-- 
   Realiza una aplicación que calcule la media de tres notas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 4</title>
    </head>
    <body>
     <form action="media.jsp" method="post">
        <% out.print("Introduzca 3 notas<br>");%>
        <br>
        <br>
        <% out.print("Introduzca la Primera Nota <br>");%> 
        <input type="number" name="primera">
         <br>
         <br>
        <% out.print("Introduzca la Segunda Nota <br>");%>
        <input type="number" name="segunda">
         <br>
         <br>
        <% out.print("Introduzca la Tercera Nota <br>");%> 
        <input type="number" name="tercera">
         <br>
         <br>
        <input type="submit">
     </form>
   </body>
    
</html>
