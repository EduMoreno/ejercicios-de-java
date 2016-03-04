<%-- 
Escribe una aplicación que genere el calendario de un mes. Se pedirá el nombre del mes,
el año, el texto que queremos que aparezca sobre el calendario, el día de la semana en que
cae el día 1 y el número de días que tiene el mes.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 11</title>
    </head>
    <body>
      <%out.print("<h1>Calendario</h1>");%>
      <br>
  <form method="post" action="Calendario.jsp">
   <%out.print("<h3>Elige el mes</h3>");%>
   <br>
      <select name="mes">
        <option>Enero</option>
        <option>Febrero</option>
        <option>Marzo</option>
        <option>Abril</option>
        <option>Mayo</option>
        <option>Junio</option>
        <option>Julio</option>
        <option>Agosto</option>
        <option>Septiembre</option>
        <option>Octubre</option>
        <option>Noviembre</option>
        <option>Diciembre</option>
      </select>
     <br>
     <%out.print("<h3>¿Que año?</h3>");%> 
     <br>
     <input type="number" name="ano">
     <br>
      <%out.print("<h3>¿En que dia cae el dia 1?</h3>");%> 
      <br>
      <select name="diasemana">
        <option value="1">Lunes</option>
        <option value="2">Martes</option>
        <option value="3">Miércoles</option>
        <option value="4">Jueves</option>
        <option value="5">Viernes</option>
        <option value="6">Sábado</option>
        <option value="7">Domingo</option>
      </select>
      <br>
     <%out.print("<h3>¿Cuantos dias tiene el mes?</h3>");%>  
     <br> 
     <input type="number"  name="dias">
     <br>
      <input type="submit">
    </form>
          
    </body>
</html>
