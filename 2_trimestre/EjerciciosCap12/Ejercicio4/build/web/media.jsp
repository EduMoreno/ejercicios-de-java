<%-- 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio4</title>
    </head>
    <body>
              
     <%
        int nota1 = Integer.valueOf(request.getParameter("primera"));
        int nota2 = Integer.valueOf(request.getParameter("segunda"));
        int nota3 = Integer.valueOf(request.getParameter("tercera"));
        int suma = (nota1 + nota2 + nota3) /3;
        out.print("La media es: " + suma);

      %>
    </body>
</html>
