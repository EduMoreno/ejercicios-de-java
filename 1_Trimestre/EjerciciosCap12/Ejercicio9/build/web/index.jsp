<%-- 
 Realiza una aplicación que pinte una pirámide. La altura se pedirá en un formulario. La
 pirámide estará hecha de bolitas, ladrillos o cualquier otra imagen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 9</title>
    </head>
    <body>
      <form action="piramide.jsp" method="post">
         <% out.print("<h1>Introduzca la altura de la piramide</h1>");%>
         <input type="number" name="altura">
         <input type="submit">
     </form>
    </body>
</html>
