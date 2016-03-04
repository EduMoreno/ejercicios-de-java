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
     <%
        int pesetas = Integer.valueOf(request.getParameter("dinero"));
        double euros = pesetas / 166.386;
        out.print( pesetas + " pts son " + euros + " €");

      %>
    </body>
</html>
 