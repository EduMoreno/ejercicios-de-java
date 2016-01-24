<%-- 
    1.Crea una aplicación web en Java que muestre tu nombre y tus datos personales por pantalla.
    La página principal debe ser un archivo con la extensión jsp. Comprueba que se lanzan
    bien el servidor y el navegador web. Observa los mensajes que da el servidor. Fíjate en la
    dirección que aparece en la barra de direcciones del navegador.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio1</title>
    </head>
    <body>
    <%
     out.print("Nombre: Eduardo Jesus Moreno Hernandez <br>"); 
     out.print("Telefóno: 655297845 <br>");
     out.print("Dirección: Campanillas <br>");
     %>
    </body>
</html>
