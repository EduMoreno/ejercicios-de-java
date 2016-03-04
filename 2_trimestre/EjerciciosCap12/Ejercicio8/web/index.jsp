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
    <body>
      <form action="tabla.jsp" method="post">
         <% out.print("<h1>Tabla de Multiplicar</h1>");%>
         <input type="number" name="numero">
         <input type="submit">
     </form>
    </body>
</html>
