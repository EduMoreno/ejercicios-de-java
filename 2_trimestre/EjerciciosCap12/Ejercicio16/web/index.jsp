<%-- 
Realiza una aplicación que muestre la tirada aleatoria de tres dados de póker. Utiliza
imágenes de dados reales.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 16</title>
    </head>
    <body>
       <%
        String[] lado = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg"};   
          for (int i = 0; i < 3; i++) {
            out.print("<img src=\"" + lado [(int)(Math.random()*5)] +"\">");
          }
        %>
    </body>
</html>
