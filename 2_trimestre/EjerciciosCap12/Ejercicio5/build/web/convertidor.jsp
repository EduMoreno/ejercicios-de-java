<%-- 
Realiza un conversor de euros a pesetas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 5</title>
    </head>
    <body>
     <%
        double euros = Double.valueOf(request.getParameter("dinero"));
        double pesetas = euros * 166.386;
        out.print( euros + " € son " + pesetas + " pts");

      %>
    </body>
</html>
 