<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 3</title>
    </head>
   <% request.setCharacterEncoding("UTF-8"); %>
<% out.print ("Hola ");
 out.print(request.getParameter("nombre"));%>
</html>
