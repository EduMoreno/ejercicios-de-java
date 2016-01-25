<%-- 
Mejora la aplicación anterior de tal forma que no haga falta introducir el día de la semana
en que cae el día 1 y el número de días que tiene el mes. El programa debe deducir estos
datos del mes y el año. Pista: puedes usar la clase Calendar (java.util.Calendar).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 12</title>
    </head>
    <body>
      <%out.print("<h1>Calendario</h1>");%>
      <br>
  <form method="post" action="Calendario.jsp">
   <%out.print("<h3>Elige el mes</h3>");%>
   <br>
      <select name="mes">
        <option value="1">Enero</option>
        <option value="2">Febrero</option>
        <option value="3">Marzo</option>
        <option value="4">Abril</option>
        <option value="5">Mayo</option>
        <option value="6">Junio</option>
        <option value="7">Julio</option>
        <option value="8">Agosto</option>
        <option value="9">Septiembre</option>
        <option value="10">Octubre</option>
        <option value="11">Noviembre</option>
        <option value="12">Diciembre</option>
      </select>
     <br>
     <%out.print("<h3>¿Que año?</h3>");%> 
     <br>
     <input type="number" name="ano">
     <br>
     <input type="submit">
    </form>
          
    </body>
</html>
