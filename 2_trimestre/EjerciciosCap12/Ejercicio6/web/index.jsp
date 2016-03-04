<%-- 
Realiza un conversor de pesetas a euros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 6</title>
    </head>
    <body>
     <form action="convertidor.jsp" method="post">
         <% out.print("<h1>Convertidor de pesetas a euros</h1>");%>
         <input type="number" name="dinero">
         <input type="submit">
     </form>
    </body>
</html>
