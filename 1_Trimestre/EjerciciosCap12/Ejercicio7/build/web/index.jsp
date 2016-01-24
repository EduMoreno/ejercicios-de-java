<%-- 
Combina las dos aplicaciones anteriores en una sola de tal formaque en la página principal
se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
foto o dibujo.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 7</title>
    </head>
      <LINK REL="stylesheet" HREF="css.css" TYPE="text/css">
    <body>
     <form action="convertidor.jsp" method="post">
         <% out.print("<h1>Convertidor</h1>");%>
         <input type="number" name="dinero">
         <br>
         <input type="radio" name="convertir" value="Euros" > Euros a Pesetas
         <br>
         <input type="radio" name="convertir" value="Pesetas"> Pesetas a Euros
         <br>
         <input type="submit">
     </form>
    </body>
</html>
