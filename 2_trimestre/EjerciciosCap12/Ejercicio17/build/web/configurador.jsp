<%-- 
Realiza un configurador del interior de un vehículo. El usuario puede elegir, mediante
un formulario, el color de la tapicería – blanco, negro o berengena - y el material de las
molduras – madera o carbono. Se debe mostrar el interior del coche tal y como lo quiere
el usuario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 17</title>
    </head>
    <body>
    <%
      String tapiceria = request.getParameter("tapiceria");
      String moldura = request.getParameter("moldura");
      String imagen = tapiceria + moldura + ".jpg";
    %>
    <img src="<%= imagen %>">
    </body>
</html>
