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
    <LINK REL="stylesheet" HREF="css.css" TYPE="text/css">
    <body>
    <% out.print("<h1>"+ request.getParameter("mes") + " " + request.getParameter("ano")+ "</h1>");%>
    
    <table>
      <tr>
          <th>Lunes</th>
          <th>Martes</th>
          <th>Miércoles</th>
          <th>Jueves</th>
          <th>Viernes</th>
          <th>Sábado</th>
          <th>Domingo</th>
      </tr>
      <tr>
      <%
      int contador = 0;
      int dias = Integer.parseInt(request.getParameter("dias"));
      int diasemana = Integer.parseInt(request.getParameter("diasemana"));
    
      for (int n = 1; n < dias + diasemana; n++) {
        if (n >= diasemana) {
          out.print("<td>" + (n - diasemana + 1) + "</td>");
        } else {
          out.print("<td> </td>"); 
        }
        contador++;
        if (contador == 7) { 
          out.println("</tr><tr>");
          contador = 0;
        }
      }
      %>
      </tr>
    </table>
    </body>
</html>
