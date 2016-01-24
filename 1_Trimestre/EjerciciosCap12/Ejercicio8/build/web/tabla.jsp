<%-- 
  Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de
  ese número. El resultado se debe mostrar en una tabla (<table> en HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 8</title>
    </head>
        <LINK REL="stylesheet" HREF="css.css" TYPE="text/css">
    <body>
   
    <% 
        int numero = Integer.valueOf(request.getParameter("numero")); 
        
        out.print("<h1>Tabla de Multiplicar</h1>");
    %>
     <table>
    <%
        for(int n = 0; n < 11; n++) {
            out.println("<tr><td>" + numero + "</td><td> x </td><td>" + n + "</td><td> = </td><td>" + numero * n + "</td></tr>");
         } 
    %>
     </table>
    </body>
</html>
 